package tcgwars.logic.impl.gen4;

import tcgwars.logic.impl.gen3.FireRedLeafGreen;

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
import static tcgwars.logic.card.Weakness.*

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
 * @author axpendix@hotmail.com
 * @author ufodynasty12@gmail.com
 */
public enum SecretWonders implements LogicCardInfo {

  AMPHAROS_1 ("Ampharos", "1", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  BLASTOISE_2 ("Blastoise", "2", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  CHARIZARD_3 ("Charizard", "3", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  ENTEI_4 ("Entei", "4", Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  FLYGON_5 ("Flygon", "5", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  GALLADE_6 ("Gallade", "6", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  GARDEVOIR_7 ("Gardevoir", "7", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  GASTRODON_EAST_SEA_8 ("Gastrodon East Sea", "8", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GASTRODON_WEST_SEA_9 ("Gastrodon West Sea", "9", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  HO_OH_10 ("Ho-Oh", "10", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  JUMPLUFF_11 ("Jumpluff", "11", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  LICKILICKY_12 ("Lickilicky", "12", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  LUDICOLO_13 ("Ludicolo", "13", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  LUGIA_14 ("Lugia", "14", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  MEW_15 ("Mew", "15", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  RAIKOU_16 ("Raikou", "16", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  ROSERADE_17 ("Roserade", "17", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  SALAMENCE_18 ("Salamence", "18", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  SUICUNE_19 ("Suicune", "19", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  VENUSAUR_20 ("Venusaur", "20", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  ABSOL_21 ("Absol", "21", Rarity.RARE, [BASIC, POKEMON, _DARKNESS_]),
  ARCANINE_22 ("Arcanine", "22", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  BANETTE_23 ("Banette", "23", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DUGTRIO_24 ("Dugtrio", "24", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  ELECTIVIRE_25 ("Electivire", "25", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  ELECTRODE_26 ("Electrode", "26", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  FURRET_27 ("Furret", "27", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  GOLDUCK_28 ("Golduck", "28", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GOLEM_29 ("Golem", "29", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  JYNX_30 ("Jynx", "30", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  MAGMORTAR_31 ("Magmortar", "31", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  MINUN_32 ("Minun", "32", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  MOTHIM_33 ("Mothim", "33", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  NIDOKING_34 ("Nidoking", "34", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  PIDGEOT_35 ("Pidgeot", "35", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  PLUSLE_36 ("Plusle", "36", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  SHARPEDO_37 ("Sharpedo", "37", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  SUNFLORA_38 ("Sunflora", "38", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  UNOWN_S_39 ("Unown S", "39", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  WEAVILE_40 ("Weavile", "40", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  WORMADAM_PLANT_CLOAK_41 ("Wormadam Plant Cloak", "41", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  WORMADAM_SANDY_CLOAK_42 ("Wormadam Sandy Cloak", "42", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  WORMADAM_TRASH_CLOAK_43 ("Wormadam Trash Cloak", "43", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  XATU_44 ("Xatu", "44", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  BRELOOM_45 ("Breloom", "45", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CHARMELEON_46 ("Charmeleon", "46", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CLOYSTER_47 ("Cloyster", "47", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DONPHAN_48 ("Donphan", "48", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  FARFETCH_D_49 ("Farfetch'd", "49", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  FLAAFFY_50 ("Flaaffy", "50", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  IVYSAUR_51 ("Ivysaur", "51", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  KECLEON_52 ("Kecleon", "52", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  KIRLIA_53 ("Kirlia", "53", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  LOMBRE_54 ("Lombre", "54", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MILTANK_55 ("Miltank", "55", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  MUK_56 ("Muk", "56", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  NIDORINO_57 ("Nidorino", "57", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  PIDGEOTTO_58 ("Pidgeotto", "58", Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  PINSIR_59 ("Pinsir", "59", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  QUAGSIRE_60 ("Quagsire", "60", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  RATICATE_61 ("Raticate", "61", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ROSELIA_62 ("Roselia", "62", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  SABLEYE_63 ("Sableye", "63", Rarity.UNCOMMON, [BASIC, POKEMON, _DARKNESS_]),
  SHELGON_64 ("Shelgon", "64", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  SKIPLOOM_65 ("Skiploom", "65", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  SMEARGLE_66 ("Smeargle", "66", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  SMOOCHUM_67 ("Smoochum", "67", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_K_68 ("Unown K", "68", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_N_69 ("Unown N", "69", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_O_70 ("Unown O", "70", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_X_71 ("Unown X", "71", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_Z_72 ("Unown Z", "72", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  VENOMOTH_73 ("Venomoth", "73", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VIBRAVA_74 ("Vibrava", "74", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  WARTORTLE_75 ("Wartortle", "75", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  BAGON_76 ("Bagon", "76", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BULBASAUR_77 ("Bulbasaur", "77", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BURMY_PLANT_CLOAK_78 ("Burmy Plant Cloak", "78", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BURMY_SANDY_CLOAK_79 ("Burmy Sandy Cloak", "79", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BURMY_TRASH_CLOAK_80 ("Burmy Trash Cloak", "80", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CARVANHA_81 ("Carvanha", "81", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  CHARMANDER_82 ("Charmander", "82", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CLEFAIRY_83 ("Clefairy", "83", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CORSOLA_84 ("Corsola", "84", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  DIGLETT_85 ("Diglett", "85", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  DUSKULL_86 ("Duskull", "86", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  ELECTABUZZ_87 ("Electabuzz", "87", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  GRIMER_88 ("Grimer", "88", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GROWLITHE_89 ("Growlithe", "89", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  HOPPIP_90 ("Hoppip", "90", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  LICKITUNG_91 ("Lickitung", "91", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  LOTAD_92 ("Lotad", "92", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAGMAR_93 ("Magmar", "93", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  MAREEP_94 ("Mareep", "94", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MURKROW_95 ("Murkrow", "95", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  NATU_96 ("Natu", "96", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  NIDORAN_MALE_97 ("Nidoran♂", "97", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  PHANPY_98 ("Phanpy", "98", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  PIDGEY_99 ("Pidgey", "99", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  PSYDUCK_100 ("Psyduck", "100", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  QWILFISH_101 ("Qwilfish", "101", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  RALTS_102 ("Ralts", "102", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  RATTATA_103 ("Rattata", "103", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SENTRET_104 ("Sentret", "104", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SHELLDER_105 ("Shellder", "105", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SHELLOS_EAST_SEA_106 ("Shellos East Sea", "106", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SHELLOS_WEST_SEA_107 ("Shellos West Sea", "107", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SHROOMISH_108 ("Shroomish", "108", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SHUCKLE_109 ("Shuckle", "109", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SHUPPET_110 ("Shuppet", "110", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SPINDA_111 ("Spinda", "111", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SQUIRTLE_112 ("Squirtle", "112", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  STANTLER_113 ("Stantler", "113", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SUNKERN_114 ("Sunkern", "114", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TRAPINCH_115 ("Trapinch", "115", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  VENONAT_116 ("Venonat", "116", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  VOLTORB_117 ("Voltorb", "117", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  WOOPER_118 ("Wooper", "118", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  BEBE_S_SEARCH_119 ("Bebe's Search", "119", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  NIGHT_MAINTENANCE_120 ("Night Maintenance", "120", Rarity.UNCOMMON, [TRAINER, ITEM]),
  PLUSPOWER_121 ("PlusPower", "121", Rarity.UNCOMMON, [TRAINER, ITEM]),
  PROFESSOR_OAK_S_VISIT_122 ("Professor Oak's Visit", "122", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  PROFESSOR_ROWAN_123 ("Professor Rowan", "123", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RIVAL_124 ("Rival", "124", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ROSEANNE_S_RESEARCH_125 ("Roseanne's Research", "125", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  TEAM_GALACTIC_S_MARS_126 ("Team Galactic's Mars", "126", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POTION_127 ("Potion", "127", Rarity.COMMON, [TRAINER, ITEM]),
  SWITCH_128 ("Switch", "128", Rarity.COMMON, [TRAINER, ITEM]),
  DARKNESS_ENERGY_129 ("Darkness Energy", "129", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  METAL_ENERGY_130 ("Metal Energy", "130", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  GARDEVOIR_LV_X_131 ("Gardevoir Lv.X", "131", Rarity.HOLORARE, [LVL_X, POKEMON, _PSYCHIC_]),
  HONCHKROW_LV_X_132 ("Honchkrow Lv.X", "132", Rarity.HOLORARE, [LVL_X, POKEMON, _DARKNESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  SecretWonders(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.SECRET_WONDERS;
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
        return evolution (this, from:"Flaffy", hp:HP130, type:LIGHTNING, retreatCost:3) {
          weakness F, PLUS30
          resistance M, MINUS20
          pokeBody "Jamming", {
            text "After your opponent plays a Supporter card from his or her hand, put 1 damage counter on each of your opponent’s Pokémon. You can’t you more than 1 Jamming Poké-Body each turn."
            delayedA {
              after PLAY_TRAINER, {
                if(ef.cardToPlay.cardTypes.is(SUPPORTER) && bg.em().retrieveObject("Jamming")!=bg.turnCount){
                  bg.em().storeObject("Jamming",bg.turnCount)
                  opp.all.each {
                    directDamage(10, it, SRC_ABILITY)
                  }
                }
              }
            }
          }
          move "Cluster Bolt", {
            text "70 damage. You may discard all [L] Energy attached to Ampharos. If you do, this attack does 20 damage to each of your opponent’s Benched Pokémon that has any Energy cards attached to it."
            energyCost L, C, C
            onAttack {
              damage 70
              if(confirm("Discard all [L] Energy attached to $self")) {
                opp.bench.findAll{it.cards.energyCount(C)}.each{
                  damage 20, it
                }
              }
            }
          }

        };
      case BLASTOISE_2:
        return evolution (this, from:"Wartortle", hp:HP120, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          pokePower "Waterlog", {
            text "Once during your turn, you may attach as many basic [W] Energy cards from your hand to any of your Pokémon in any way you like. If you do, you turn ends. This power can’t be used if Blastoise is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.hand.filterByBasicEnergyType(W) : "There are no basic [W] Energys in your hand."
              powerUsed()
              while(true){
                if(!my.hand.filterByBasicEnergyType(W)) break
                def tar = my.all.select("Attach energy to which Pokémon? (Cancel to stop)", false)
                if(!tar) break
                def energy = my.hand.select(min:0,max:my.hand.filterByBasicEnergyType(W).size(),"Attach any number of basic [W] Energys to $tar",basicEnergyFilter(W))
                energy.each{
                  attachEnergy(tar,it)
                }
                bg.gm().betweenTurns()
              }
            }
          }
          move "Hydro Pump", {
            text "50+ damage. Does 50 damage plus 20 more damage for each [W] Energy attached to Blastoise but not used to pay for this attack’s Energy cost. You can’t add more than 40 damage in this way."
            energyCost W, W, C
            onAttack {
              damage 50
              extraEnergyDamage(2,hp(20),W,thisMove)
            }
          }

        };
      case CHARIZARD_3:
        return evolution (this, from:"Charmeleon", hp:HP130, type:FIRE, retreatCost:3) {
          weakness W
          resistance F, MINUS20
          pokeBody "Fury Blaze", {
            text "If your opponent has 3 or less Prize cards left, each of Charizard’s attacks does 50 more damage to the Active Pokémon ."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker==self) bg.dm().each {
                  if(it.from==self && it.to.active && it.to.owner!=self.owner && it.dmg.value && opp.prizeCardSet.size()<=3) {
                    it.dmg += hp(50)
                    bc "$thisAbility +50"
                  }
                }
              }
            }
          }
          move "Blast Burn", {
            text "120 damage. Flip a coin. If heads, discard 2 Energy cards attached to Charizard. If tails, discard 4 Energy cards attached to Charizard. (If you can’t, this attack does nothing.)"
            energyCost R, R, R, C
            attackRequirement {
              assert self.cards.filterByType(ENERGY) >= 2 : "You have fewer than 2 Energy cards attached to $self"
            }
            onAttack {
              flip 1, {
                if(self.cards.filterByType(ENERGY)>=2){
                  damage 120
                  afterDamage {
                    self.cards.select(count:2,"Discard 2 Energy cards attached to $self",cardTypeFilter(ENERGY))
                  }
                }
              }, {
                if(self.cards.filterByType(ENERGY)>=4){
                  damage 120
                  afterDamage {
                    self.cards.select(count:4,"Discard 4 Energy cards attached to $self",cardTypeFilter(ENERGY))
                  }
                } else {
                  bc "Blast Burn failed"
                }
              }
            }
          }

        };
      case ENTEI_4:
        return basic (this, hp:HP080, type:FIRE, retreatCost:2) {
          weakness W, PLUS20
          pokeBody "Burning Coat", {
            text "Whenever 1 of your opponent’s Pokémon is Knocked Out by damage from Entei’s attacks, discard the top 3 cards from your opponent’s deck."
            delayedA {
              def flag = false
              before KNOCKOUT, {
                if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner && self.active && ef.pokemonToBeKnockedOut.owner == self.owner.opposite ){
                  flag = true
                }
              }
              after KNOCKOUT, {
                if(flag && opp.deck){
                  opp.deck.subList(0,3).discard()
                  flag = false
                }
              }
            }
          }
          move "Blaze Roar", {
            text "60 damage. Does 20 damage to 1 of your opponent's Benched Pokémon. Filp a coin. If tails, discard 2 [R] Energy attached to Entei."
            energyCost R, R, R
            onAttack {
              damage 60
              if(opp.bench) {
                damage 20, opp.bench.select("Does 20 damage to 1 of your opponent's Benched Pokémon.")
              }
              flip 1, {}, {
                discardSelfEnergyAfterDamage R, R
              }
            }
          }

        };
      case FLYGON_5:
        return evolution (this, from:"Vibrava", hp:HP120, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS30
          resistance L, MINUS20
          def flag
          customAbility {
            after ATTACH_ENERGY, self, {
              if (ef.reason==PLAY_FROM_HAND && ef.card.asEnergyCard().containsType(F)) {
                flag = bg.turnCount
              }
            }
          }
          pokeBody "Irritating Buzz", {
            text "As long as Flygon is your Active Pokémon, put 1 damage counter on each of your opponent’s Active Pokémon between turn, excluding [F] Pokémon."
            delayedA {
              before BEGIN_TURN, {
                if (self.active) {
                  bc "Irritating Buzz Activates"
                  if(!opp.active.types.contains(F)) {
                    directDamage(10, opp.active, SRC_ABILITY)
                  }
                }
              }
            }
          }
          move "Sand Sonic", {
            text "60+ damage. If you attach a [F] Energy card from you hand to Flygon during this turn, this attack does 60 damage plus 20 more damage."
            energyCost F, C, C
            onAttack {
              damage 60
              if(bg.turnCount == flag) {
                damage 20
              }
            }
          }

        };
      case GALLADE_6:
        return evolution (this, from:"Kirlia", hp:HP130, type:FIGHTING, retreatCost:2) {
          weakness P
          move "Sonic Blade", {
            text "Put damage counters on the Defending Pokémon until it is 50 HP away from being Knocked Out. If you do, your opponent switchs the Defending Pokémon with 1 of this or her Benched Pokémon."
            energyCost F, C
            attackRequirement {
              assert defending.remainingHP.value > 50 : "The Defending Pokémon has 50 or fewer remaining HP"
            }
            onAttack {
              if(!bg.em().run(new DirectDamage(hp(defending.remainingHP.value - 50), defending).setSource(Source.ATTACK))) {
                whirlwind()
              }
            }
          }
          move "Psychic Cut", {
            text "60+ damage. You may choose as many of your face-down Prize cards as you like and put them face up. If you do, this attack does 60 damage plus 20 more damage for each Prize card you chose. (These remain face up for the rest of the game.)"
            energyCost P, C, C
            onAttack {
              damage 60
              if(my.prizeCardSet.faceDownCards) {
                my.prizeCardSet.faceDownCards.select(hidden:true, min:0, max:my.prizeCardSet.faceDownCards.size(), "Reveal any number of prize cards").each {
                  my.prizeCardSet.setVisible(it, true)
                  damage 20
                }
              }
            }
          }

        };
      case GARDEVOIR_7:
        return evolution (this, from:"Kirlia", hp:HP110, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS30
          pokePower "Telepass", {
            text "Once during your turn , you may search your opponent’s discard pile for a Supporter card and use the effect of that card as the effect of this power. (This Supporter card remains in you opponent’s discard pile.) You can’t use more than 1 Telepass Poké-Power each turn. This power can’t be used if Gardevoir is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert bg.em().retrieveObject("Telepass") != bg.turnCount : "You can't use more than 1 Telepass Poke-Power each turn."
              assert opp.discard.hasType(SUPPORTER) : "Your opponent has no supporters discarded."
              powerUsed()
              def card = opp.discard.select("Opponent's discard. Select a supporter.", cardTypeFilter(SUPPORTER)).first()
              bg.deterministicCurrentThreadPlayerType=bg.currentTurn
              bg.em().run(new PlayTrainer(card).setDontDiscard(true))
              bg.clearDeterministicCurrentThreadPlayerType()
              bg.em().storeObject("Telepass",bg.turnCount)
            }
          }
          move "Psychic Lock", {
            text "60 damage. During your opponent’s next turn, your opponent can’t use any Poké-Powers on his or her Pokémon."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 60
              afterDamage {
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
          }
        };
      case GASTRODON_EAST_SEA_8:
        return evolution (this, from:"Shellos East Sea", hp:HP100, type:WATER, retreatCost:4) {
          weakness G, PLUS30
          resistance L, MINUS20
          pokePower "Osmotic Pressure", {
            text "Once during your turn , if you have Gastrodon West Sea in play, you may move up to 3 damage counters from Gastodon East Sea to 1 of your Gastrodon West Sea."
            actionA {
              checkLastTurn()
              assert my.all.find{it.name=="Gastrodon West Sea"} : "You have no Gastrodon West Sea in play"
              assert self.numberOfDamageCounters : "$self is healthy"
              powerUsed()
              def count = choose(1..Math.min(self.numberOfDamageCounters,3),"Move how many damage counters?",Math.min(self.numberOfDamageCounters,3))
              self.damage -= hp(10 * count)
              directDamage 10 * count, my.all.findAll{it.name=="Gastrodon West Sea"}.select("Move damage counters to"), SRC_ABILITY
            }
          }
          move "Dwindling Wave", {
            text "80- damage. Does 80 damage minus 10 damage for each damage counter on Gastrodon East Sea."
            energyCost W, C, C
            attackRequirement {
              assert self.numberOfDamageCounters < 8 : "$self will deal no damage"
            }
            onAttack {
              damage 80 - 10 * self.numberOfDamageCounters
            }
          }

        };
      case GASTRODON_WEST_SEA_9:
        return evolution (this, from:"Shellos West Sea", hp:HP100, type:FIGHTING, retreatCost:4) {
          weakness G, PLUS30
          resistance L, MINUS20
          move "Raging Flood", {
            text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Gastrodon West Sea. Then, remove 2 damage counters from Gastrodon West Sea."
            energyCost F, C
            onAttack {
              damage 20 + 10 * self.numberOfDamageCounters
              heal 20, self
            }
          }
          move "Wild Waves", {
            text "80 damage. Put 1 damage counter on each Benched Pokémon."
            energyCost F, C, C, C
            onAttack {
              damage 80
              my.bench.each{
                directDamage(10, it)
              }
              opp.bench.each{
                directDamage(10, it)
              }
            }
          }

        };
      case HO_OH_10:
        return basic (this, hp:HP090, type:FIRE, retreatCost:2) {
          weakness W
          resistance F, MINUS20
          pokePower "Phoenix Turn", {
            text "Once during your opponent’s turn, if Ho-Oh would be Knocked Out by damage from an attack, you may flip a coin. If heads, Ho-Oh isn’t discarded. Instead, remove all damage counter, Special Conditions, and other effects from Ho-Oh. Then, discard all cards attached to Ho-Oh (except for Energy cards). This counts as Ho-Oh being Knocked Out and your opponent takes a Prize card."
            delayedA {
              //TODO
            }
          }
          move "Rainbow Wing", {
            text "20× damage. This attack does 20 damage time the number of different types of basic Energy cards attached to Ho-Oh."
            energyCost C, C, C, C
            attackRequirement {
              assert self.cards.filterByType(BASIC_ENERGY) : "There are no Basic Energys attached to $self"
            }
            onAttack {
              for(Type t1:Type.values()){
                if(self.cards.filterByType(BASIC_ENERGY).filterByEnergyType(t1))
                  damage 20
              }
            }
          }

        };
      case JUMPLUFF_11:
        return evolution (this, from:"Skiploom", hp:HP090, type:GRASS, retreatCost:0) {
          weakness R, PLUS30
          resistance F, MINUS20
          pokeBody "Cotton Spore", {
            text "Whenever Jumpluff would be damaged by your opponent’s attack, flip a coin. If heads, prevent all damage done to Jumpluff by that attack."
            delayedA (priority: BEFORE_LAST) {
              before APPLY_ATTACK_DAMAGES, {
                def entry=bg.dm().find({it.to==self && it.dmg.value && it.notNoEffect})
                if (entry) {
                  flip "$thisAbility", self.owner, {
                    entry.dmg=hp(0)
                  }
                }
              }
            }
          }
          move "Cottonweed Punch", {
            text "Flip 2 coins. Choose 1 of your opponent’s Pokémon. For each heads, this attack does 30 damage to that Pokémon."
            energyCost G, G
            onAttack {
              def heads = 0
              flip 2, {
                heads++
              }
              if(heads>0) {
                damage 30 * heads, opp.all.select("Choose 1 of your opponent's Pokémon")
              }
            }
          }

        };
      case LICKILICKY_12:
        return evolution (this, from:"Lickitung", hp:HP110, type:COLORLESS, retreatCost:4) {
          weakness F, PLUS30
          move "Tongue Reel", {
            text "Choose 1 of your opponent’s Pokémon. If you choose a Benched Pokémon, switch the Defending Pokémon with that Pokémon. This attack does 20 damage to the Pokémon you chose. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            onAttack {
              def tar = opp.all.select("Choose 1 of your opponent's Pokémon")
              if(tar.benched) {
                sw2(tar) // The way I read this, even if the benched Pokémon is not successfully pulled into the active, 20 damage is still done to the selected Pokémon, then the defending Pokémon might be paralyzed.
              }
              damage 20, tar
              applyAfterDamage PARALYZED
            }
          }
          move "Boundless Power", {
            text "80 damage. During your next turn, Lickilicky can’t attack."
            energyCost C, C, C, C
            onAttack {
              damage 80
              cantAttackNextTurn self
            }
          }

        };
      case LUDICOLO_13:
        return evolution (this, from:"Lombre", hp:HP100, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          pokeBody "Rain Dish", {
            text "At any time between turns, remove 1 damage counter from Ludicolo."
            delayedA{
                before BEGIN_TURN, {
                  if (self.numberOfDamageCounters) {
                    bc "$thisAbility activates"
                    heal 10, self, SRC_ABILITY
                  }
                }
              }
          }
          move "Nature Power", {
            text "60+ damage. If you have a Stadium Card in play, this attack does 60 damage plus 20 more damage. If your opponent has a Stadium card in play, the Defending Pokémon is now Confused."
            energyCost W, W, C
            onAttack {
              damage 60
              if(bg.stadiumInfoStruct) {
                if(bg.stadiumInfoStruct.stadiumCard.player == self.owner) {
                  damage 20
                } else {
                  applyAfterDamage CONFUSED
                }
              }
            }
          }

        };
      case LUGIA_14:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness P, PLUS20
          resistance F, MINUS20
          move "Silver Wing", {
            text "20 damage. Flip a coin. If heads, choose an Energy card attached to the Defending Pokémon and return it to your opponent’s hand."
            energyCost C
            onAttack {
              damage 20
              flip {
                afterDamage {
                  defending.cards.select("Choose an Energy card to return to your opponent's hand",cardTypeFilter(ENERGY)).moveTo(opp.hand)
                }
              }
            }
          }
          move "Psychic Destruction", {
            text "120 damage. If the Defending Pokémon has any Energy cards attached to it, this attack’s base damage is 40 instead of 120."
            energyCost P, C, C
            onAttack {
              damage 40
              if(!defending.cards.energyCount(C)) {
                damage 80
              }
            }
          }

        };
      case MEW_15:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Psychic Balance", {
            text "If you have less cards in your hand than your opponent, draw cards until you have the same number of cards as your opponent. (If you have more or the same number of cards in your hand as your opponent, this attack does nothing.)"
            energyCost ()
            attackRequirement {
              assert my.hand.size() - opp.hand.size() > 0
            }
            onAttack {
              draw my.hand.size() - opp.hand.size()
            }
          }
          move "Re-creation", {
            text "Choose an attack on 1 of your opponent’s Pokémon in his or her discard pile. Re-creation copies that attack except for its Energy cost. (You must still do anything else required for that attack.) Mew performs that attack."
            energyCost P, C, C
            attackRequirement {
              assert opp.discard.filterByType(POKEMON) : "Your opponent has no Pokémon in their discard pile"
            }
            onAttack {
              def tmp = opp.discard.select(min:0, "Choose one of your opponent's Pokémon in their discard")
              if(tmp){
                def card = tmp.first()
                bc "$card was chosen"
                def moves = card.asPokemonCard().moves
                if(moves){
                  def move = choose(moves, "Choose attack")
                  bc "$move was chosen"
                  def bef=blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
                  attack (move as Move)
                  bef.unregisterItself(bg().em())
                }
              }
            }
          }

        };
      case RAIKOU_16:
        return basic (this, hp:HP080, type:LIGHTNING, retreatCost:2) {
          weakness F, PLUS20
          resistance M, MINUS20
          pokePower "Thunder Rumble", {
            text "Once during your turn , when you attach a [L] Energy card from your hand to Raikou, you may put 1 damage counter on 1 of your opponent’s Benched Pokémon."
            delayedA {
              after ATTACH_ENERGY, self, {
                if (ef.reason==PLAY_FROM_HAND && ef.card.asEnergyCard().containsType(L) && opp.bench && keyStore("Thunder Rumble",self,null) != bg.turnCount && confirm("Use Thunder Rumble?")) {
                  keyStore("Thunder Rumble",self,bg.turnCount)
                  powerUsed()
                  directDamage 10, opp.bench.select("put 1 damage counter on 1 of your opponent's Benched Pokémon"), SRC_ABILITY
                }
              }
            }
          }
          move "Thunder Climb", {
            text "50+ damage. Discard 3 cards from the top of your deck. This attack does 50 damage plus 10 more damage for each [L] Energy card you discarded. Then, attach those [L] Energy cards to 1 of your Pokémon."
            energyCost L, L, L
            onAttack {
              damage 50
              if(my.deck) {
                def energy = my.deck.subList(0,3).discard().filterByBasicEnergyType(L)
                if(energy) {
                  damage 10 * energy.size()
                  def tar = my.all.select("Attach those [L] Energy cards to one of your Pokémon")
                  energy.each {
                    attachEnergy tar, it
                  }
                }
              }
            }
          }

        };
      case ROSERADE_17:
        return evolution (this, from:"Roselia", hp:HP090, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          move "Sleep Poison", {
            text "20 damage. The Defending Pokémon is now Asleep and Poisoned."
            energyCost G
            onAttack {
              damage 20
              applyAfterDamage ASLEEP
              applyAfterDamage POISONED
            }
          }
          move "Magical Leaf", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 30 more damage and remove 3 damage counters from Roserade."
            energyCost G, C, C
            onAttack {
              damage 40
              flip {
                damage 30
                heal 30, self
              }
            }
          }

        };
      case SALAMENCE_18:
        return evolution (this, from:"Shelgon", hp:HP140, type:COLORLESS, retreatCost:3) {
          weakness C, PLUS30
          resistance F, MINUS20
          move "Direct Hit", {
            text "50 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost C, C
            onAttack {
              swiftDamage 50, defending
            }
          }
          move "Dragon Finish", {
            text "Discard 2 basic [R] Energy cards or 2 basic [W] Energy cards attached to Salamence. If you discarded 2 basic [R] Energy cards, this attack does 100 damage to the Defending Pokémon. If you discarded 2 basic [W] Energy cards, this attack does 100 damage to 1 of your opponent's Benched Pokémon.(If you can’t discard cards, this attack does nothing.)"
            energyCost R, R, W, W
            attackRequirement {
              assert self.cards.filterByBasicEnergyType(R).size() >=2 || self.cards.filterByBasicEnergyType(W).size() >=2 : "$self doesn't have enough Basic [R] or [W] Energy cards to discard"
            }
            onAttack {
              def energys = self.cards.select(count:2,"Select 2 basic [R] or [W] Energy cards to discard", {it.cardTypes.is(BASIC_ENERGY) && (it.asEnergyCard().containsType(R) || it.asEnergyCard().containsType(W))}, self.owner, {it[0].basicType == it[1].basicType}).discard()
              if(energys.first().asEnergyCard().containsType(R)) {
                damage 100
              }else if(energys.first().asEnergyCard().containsType(W) && opp.bench) {
                damage 100, opp.bench.select("$thisMove does 100 damage to 1 of your opponent's Benched Pokémon")
              }
            }
          }

        };
      case SUICUNE_19:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          pokePower "Aqua Recover", {
            text "Once during your turn, when you put Suicune from your hand onto your Bench, you may search you discard pile for up to 3 [W] Pokémon, show them to your opponent, and put them into your hand."
            onActivate {
              if (r==PLAY_FROM_HAND && my.discard.find{it.cardTypes.is(POKEMON) && it.asPokemonCard().types.contains(W)} && confirm('Use AquaRecovery?')) {
                powerUsed()
                my.discard.select(max:3,"Search you discard pile for up to 3 [W] Pokémon",it.cardTypes.is(POKEMON) && it.asPokemonCard().types.contains(W)).showToOpponent("Selected Cards").moveTo(my.hand)
              }
            }
          }
          move "Cure Stream", {
            text "60 damage. During your opponent's next turn, any damage done by attacks from the Defending Pokémon is reduced by 20."
            energyCost W, W, W
            onAttack {
              damage 60
              reduceDamageFromDefendingNextTurn(hp(20), thisMove, defending)
            }
          }

        };
      case VENUSAUR_20:
        return evolution (this, from:"Ivysaur", hp:HP130, type:GRASS, retreatCost:3) {
          weakness R, PLUS30
          pokePower "Miracle Aroma", {
            text "Once during your turn , you may flip a coin. If heads, choose either Asleep, Burned, or Poisoned. The Defending Pokémon is now affected by that Special Condition. This power can’t be used if Venusaur is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              powerUsed()
              flip {
                apply(choose([ASLEEP,BURNED,CONFUSED,POISONED], ["Asleep", "Burned", "Poisoned"], "Apply to Your opponent's Active Pokémon") as SpecialConditionType, opp.active, Source.SRC_ABILITY)
              }
            }
          }
          move "Giant Bloom", {
            text "60 damage. Flip a coin. If heads, remove 4 damage counters from Venusaur."
            energyCost G, G, C
            onAttack {
              damage 60
              flip {
                heal 40, self
              }
            }
          }

        };
      case ABSOL_21:
        return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS20
          resistance P, MINUS20
          move "Baleful Wind", {
            text "Choose a card from your opponent’s hand without looking and discard it. If you discarded a Trainer, Supporter, or Stadium card, choose 1 more card from your opponent’s hand without looking and discard it."
            energyCost C
            attackRequirement {
              assert opp.hand : "Your opponent's hand is empty"
            }
            onAttack {
              def card = opp.hand.shuffledCopy().select(hidden: true, "Choose a card from your opponent's hand without looking").discard()
              if(card.filterByType(ITEM,SUPPORTER,STADIUM) && opp.hand) {
                opp.hand.shuffledCopy().select(hidden: true, "Choose a card from your opponent's hand without looking").discard()
              }
            }
          }
          move "Raid", {
            text "10 damage. If you played Absol from your hand during this turn, this attack’s base damage is 40 instead of 10."
            energyCost D
            onAttack {
              damage 10
              if(self.turnCount == bg.turnCount) {
                damage 30
              }
            }
          }

        };
      case ARCANINE_22:
        return evolution (this, from:"Growlithe", hp:HP100, type:FIRE, retreatCost:2) {
          weakness W, PLUS30
          pokePower "Flame Dash", {
            text "Once during your turn, when you play Arcanine from your hand to evolve 1 of your Benched Pokémon, you may switch Arcanine with 1 of your Active Pokémon. If you do, you may move any number of Energy cards attached to that Pokémon to Arcanine."
            onActivate {r->
              if (r==PLAY_FROM_HAND && self.benched && confirm("Use Flame Dash?")) {
                powerUsed()
                def active = self.owner.active
                if(sw2 (self, null, Source.SRC_ABILITY)) {
                  active.cards.select(min:0, max:active.cards.filterByType(ENERGY).size(), "Move any number of Energy cards attached to $active to $self",cardTypeFilter(ENERGY)).each{
                    energySwitch(active,self,it)
                  }
                }
              }
            }
          }
          move "Inferno Onrush", {
            text "120 damage. Arcanine does 40 damage to itself."
            energyCost R, R, C, C
            onAttack {
              damage 120
              damage 40, self
            }
          }

        };
      case BANETTE_23:
        return evolution (this, from:"Shuppet", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Ghost Head", {
            text "Put as many damage counters as you like on Banette. (You can’t put more than Banette’s remaining HP.) Put that many damage counters on the Defending Pokémon."
            energyCost ()
            onAttack {
              def count = choose(1..self.remainingHP.value / 10, "Put as many damage counters as you like on Banette")
              directDamage 10 * count, self
              directDamage 10 * count, defending
            }
          }
          move "Spiteful Pain", {
            text "40+ damage. If Banette is in your discard pile, this attack does 40 damage plus 40 more damage, then search your discard pile for Banette, show it to your opponent, and shuffle it into your deck."
            energyCost P, P
            onAttack {
              damage 40
              if(my.discard.find{it.name == "Banette"}) {
                damage 40
                my.discard.select("Shuffle Banette into your deck", {it.name == "Banette"}).showToOpponent("Selected Cards").moveTo(my.deck)
                shuffleDeck()
              }
            }
          }

        };
      case DUGTRIO_24:
        return evolution (this, from:"Diglett", hp:HP090, type:FIGHTING, retreatCost:0) {
          weakness W, PLUS20
          resistance L, MINUS20
          move "Dig Trap", {
            text "Flip a coin. If tails, this attack does nothing. If heads, prevent all effects of an attack, including damage, done to Dugtrio during your opponent’s next turn. If Dugtrio is your Active Pokémon at the end of your opponent’s next turn, put 6 damage counters on 1 of your opponent’s Bench Pokémon."
            energyCost F, C
            onAttack {
              flip {
                preventAllEffectsNextTurn()
                delayed {
                  before BETWEEN_TURNS, {
                    if (bg.currentTurn == self.owner.opposite && opp.bench) {
                      bc "Dig Trap activates"
                      directDamage 60, opp.bench.select("put 6 damage counters on 1 of your opponent’s Bench Pokémon")
                    }
                  }
                  after FALL_BACK, self, {unregister()}
                  after EVOLVE, self, {unregister()}
                  after DEVOLVE, self, {unregister()}
                  unregisterAfter 2
                }
              }
            }
          }
          move "Pit Trap", {
            text "50+ damage. Your opponent flips a coin. If tails, this attack does 50 damage plus 50 more damage."
            energyCost F, F, C
            onAttack {
              damage 50
              flip 1, {}, {
                damage 50
              }
            }
          }

        };
      case ELECTIVIRE_25:
        return evolution (this, from:"Electabuzz", hp:HP100, type:LIGHTNING, retreatCost:3) {
          weakness F, PLUS30
          resistance M, MINUS20
          pokePower "Motor Drive", {
            text "Once during your turn , you may search your discard pile for a [L] Energy card and attach it to Elective. This power can’t be used if Elective is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.discard.filterByEnergyType(L) : "You have no [L] Energy cards in your discard pile"
              powerUsed()
              attachEnergyFrom(type: L, my.discard, self)
            }
          }
          move "Discharge", {
            text "50× damage. Discard all [L] Energy attached to Electivire. Flip a coin for each [L] Energy you discarded. This attack does 50 damage times the number of heads."
            energyCost L, C, C
            attackRequirement {
              assert self.cards.energyCount(L) : "You ave no [L] Energy attached to Electivire"
            }
            onAttack {
              flip self.cards.energyCount(L), {
                damage 50
              }
              afterDamage {
                discardAllSelfEnergy L
              }
            }
          }

        };
      case ELECTRODE_26:
        return evolution (this, from:"Voltorb", hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          pokePower "Energy Shift", {
            text "Once during your turn, if Electrode would be Knocked Out by damage from an attack, you may use this power. Electrode isn’t discarded. Instead, attach it as an Energy card to 1 of your Pokémon. While attached, this card is a Special Energy card and provides every type of Energy but provides on 1 Energy at a time."
            delayedA priority:EffectPriority.BEFORE_LAST, {
              before KNOCKOUT, self, {
                if((ef as Knockout).byDamageFromAttack && self.owner.pbg.all.find{it != self} && confirm("Use Energy Shift?")){
                  powerUsed()
                  def pcs=self
                  delayed(inline: true){
                    after KNOCKOUT, pcs, {
                      def pkmnCard = pcs.topPokemonCard
                      def tar = pcs.owner.pbg.all.findAll{it != self}.select("Choose a pokemon to attach $self to",pcs.owner)
                      def energyCard
                      energyCard = specialEnergy(new CustomCardInfo(ELECTRODE_26).setCardTypes(ENERGY, SPECIAL_ENERGY), [[R, D, F, G, W, Y, L, M, P]]) {
                        typeImagesOverride = [RAINBOW]
                        onPlay {}
                        onRemoveFromPlay {
                          bg.em().run(new ChangeImplementation(pkmnCard, energyCard))
                        }
                      }
                      energyCard.player = thisCard.player
                      bg.em().run(new ChangeImplementation(energyCard, pkmnCard))
                      attachEnergy(tar, energyCard)
                      bc "$energyCard is now a Special Energy Card attached to $tar"
                    }
                  }
                }
              }
            }
          }
          move "Ion Blast", {
            text "40+ damage. You may do 40 damage plus 60 more damage. If you do, Electrode does 100 damage to itself."
            energyCost L, C
            onAttack {
              damage 40
              if(confirm("Deal 60 additional damage?")) {
                damage 60
                damage 100, self
              }
            }
          }

        };
      case FURRET_27:
        return evolution (this, from:"Sentret", hp:HP090, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Keen Eye", {
            text "Search your deck for up to 2 cards and put them into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search(min:1,max:2,"Select up to 2 cards",{true}).moveTo(hidden:true,my.hand)
              shuffleDeck()
            }
          }
          move "Baton Pass", {
            text "40 damage. You may switch Furret with 1 of your Benched Pokémon. If you do, move as many Energy cards attached to Furret as you like to the new Active Pokémon."
            energyCost C, C
            onAttack {
              damage 40
              if(my.bench && confirm("Switch Furret with 1 of your Benched Pokémon?")) {
                if(sw2(my.bench.select("New Active Pokémon"))) {
                  self.cards.select(min:0,max:self.cards.filterByType(ENERGY).size(),"Move any number of Energy cards to ${my.active}",cardTypeFilter(ENERGY)).each{
                    energySwitch(self,my.active,it)
                  }
                }
              }
            }
          }

        };
      case GOLDUCK_28:
        return evolution (this, from:"Psyduck", hp:HP090, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Encore", {
            text "20 damage. Choose 1 of the Defending Pokémon’s attacks. That Pokémon can use only that attack during your opponent’s next turn."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 20
              afterDamage {
                if(!defending.topPokemonCard.moves.isEmpty()){
                  def move=choose(defending.topPokemonCard.moves, defending.topPokemonCard.moves.collect({it.name}), "Encore") as Move
                  def pcs = defending
                  bc "$pcs can only use ${move.name} next turn."
                  delayed{
                    before CHECK_ATTACK_REQUIREMENTS, {
                      if (ef.move != move) {
                        wcu "$pcs can only use ${move.name}"
                        prevent()
                      }
                    }
                    unregisterAfter 2
                    after FALL_BACK, pcs, {unregister()}
                    after EVOLVE, pcs, {unregister()}
                    after DEVOLVE, pcs, {unregister()}
                  }
                }
              }
            }
          }
          move "Break Beam", {
            text "40+ damage. You may do 40 damage plus 20 more damage. If you do, Golduck is now Confused."
            energyCost W, P
            attackRequirement {}
            onAttack {
              damage 40
              if(confirm("Deal 20 more damage?")) {
                damage 20
                afterDamage {
                  apply CONFUSED, self
                }
              }
            }
          }

        };
      case GOLEM_29:
        return evolution (this, from:"Graveler", hp:HP130, type:FIGHTING, retreatCost:4) {
          weakness G
          resistance L, MINUS20
          move "Double Throw", {
            text "Choose 2 of your opponent’s Pokémon. This attack does 30 damage to each of them."
            energyCost F, F, C
            onAttack {
              multiSelect(opp.all, 2, "Choose 2 of your opponent's Pokémon").each {
                damage 30, it
              }
            }
          }
          move "Megaton Rock", {
            text "80 damage.You may do 40 damage instead of 80 to the Defending Pokémon. If you do, during your opponent's next turn, any damage done to Golem by attacks is reduced by 40."
            energyCost F, F, F, C
            onAttack {
              damage 40
              if(confirm("Do 40 damage instead of 80?")) {
                reduceDamageNextTurn(hp(40), thisMove)
              } else {
                damage 40
              }
            }
          }

        };
      case JYNX_30:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS20
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
          move "Icy Kiss", {
            text "30 damage. If Jynx was damaged by an attack during your opponent’s last turn, the Defending Pokémon is now Paralyzed."
            energyCost W, C
            onAttack {
              damage 30
              if(turnCount + 1 == bg.turnCount && lastDamage > hp(0)) {
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Lovely Kiss", {
            text "Move 2 damage counters from Jynx to the Defending Pokémon. If Smoochum is anywhere under Jynx, move 4 damage counters instead."
            energyCost P, C
            attackRequirement {
              assert self.numberOfDamageCounters : "$self is healthy"
            }
            onAttack {
              def max = Math.min(self.numberOfDamageCounters,self.getPokemonCards().find{it.name == "Smoochum"}?4:2)
              def count = choose(1..max,"Move how many damage counters?",max)
              self.damage -= hp(10 * count)
              directDamage 10 * count, defending
            }
          }

        };
      case MAGMORTAR_31:
        return evolution (this, from:"Magmar", hp:HP110, type:FIRE, retreatCost:3) {
          weakness W, PLUS30
          pokeBody "Flame Body", {
            text "When you attach a [R] Energy card from your hand to Magmortar, remove 2 damage counters from Magmortar."
            delayedA {
            after ATTACH_ENERGY, self, {
              if (ef.reason==PLAY_FROM_HAND && ef.card.asEnergyCard().containsType(R)) {
                bc "Flame Body removes 2 damage counters from $self"
                heal 20, self, SRC_ABILITY
              }
            }
          }
          }
          move "Flame Blast", {
            text "20× damage. Does 20 damage times the number of [R] Energy attached to Magmortar."
            energyCost R
            attackRequirement {
              assert self.cards.energyCount(R) : "There is no [R] Energy attached to $self"
            }
            onAttack {
              damage 20 * self.cards.energyCount(R)
            }
          }
          move "Fireball Bazooka", {
            text "40 damage. Does 20 damage to 2 of your opponent’s Benched Pokémon."
            energyCost R, C, C
            onAttack {
              damage 40
              if(opp.bench) {
                multiSelect(opp.all, 2, "Does 20 damage to 2 of your opponent's Benched Pokémon").each {
                  damage 20, it
                }
              }
            }
          }

        };
      case MINUN_32:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          globalAbility {Card thisCard->
            delayed {
              before KNOCKOUT, {
                if(ef.pokemonToBeKnockedOut.owner == thisCard.player && bg.currentTurn == thisCard.player.opposite){
                  bg.em().storeObject("Minus Charge", bg.turnCount)
                }
              }
            }
          }
          pokePower "Minus Charge", {
            text "Once during your turn , if any Pokémon were Knocked Out during your opponent’s last turn, you may draw 2 cards. You can’t use more than 1 Minus Charge Poké-Power each turn. This power can’t be used if Minun is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert bg.em().retrieveObject("Minus Charge") != bg.turnCount : "You can't use more than 1 Minus Charge Ability each turn."
              assert bg.em().retrieveObject("Minus Charge") == bg.turnCount-1 : "None of your Pokémon were Knocked Out during your opponent's last turn."
              bg.em().storeObject("Minus Charge", bg.turnCount)
              powerUsed()
              draw 2
            }
          }
          move "Tag Play —", {
            text "20 damage. If you have Plusle on your Bench, you may move an Energy card attached to Minum to 1 of your Benched Pokémon."
            energyCost L
            onAttack {
              damage 20
              if(my.bench.find{it.name == "Plusle"} && confirm("Move an energy attached to $self to 1 of your Benched Pokémon?")) {
                moveEnergy(self,my.bench)
              }
            }
          }

        };
      case MOTHIM_33:
        return evolution (this, from:"Evolves from Burmy", hp:HP080, type:GRASS, retreatCost:0) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Silver Wind", {
            text "During your next turn, if an attack does damage to the Defending Pokémon, that attack does 40 more damage."
            energyCost ()
            onAttack {
              increasedDamageDoneToDefending(self, defending, 40, thisMove.name)
            }
          }
          move "Raging Scales", {
            text "30+ damage. If Mothim has any damage counters on it, this attack does 30 damage plus 40 more damage."
            energyCost G, C
            onAttack {
              damage 30
              if(self.numberOfDamageCounters) {
                damage 40
              }
            }
          }

        };
      case NIDOKING_34:
        return evolution (this, from:"Nidorino", hp:HP130, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS30
          move "Poison Rub", {
            text "20 damage. The Defending Pokémon is now Poisoned. Before doing damage, you may switch 1 of the Defending Pokémon with 1 of your opponent’s Benched Pokémon. The new Defending Pokémon is now Poisoned."
            energyCost C, C
            onAttack {
              if(opp.bench && confirm("Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon?")) {
                sw2 opp.bench.select("New Defending Pokémon")
              }
              damage 20
              applyAfterDamage POISONED
            }
          }
          move "Pride Attack", {
            text "60+ damage. Flip a coin for each Nidoqueen on your Bench. This attack does 60 damage plus 30 more damage for each heads."
            energyCost P, P, C, C
            onAttack {
              damage 60
              flip my.bench.findAll{it.name == "Nidoqueen"}.size(), {
                damage 30
              }
            }
          }

        };
      case PIDGEOT_35:
        return evolution (this, from:"Pidgeotto", hp:HP120, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS30
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
          move "Mirror Move", {
            text "If Pidgeot was damaged by an attack during your opponent’s last turn, this attack does the same amount of damage done to Pidgeot to the Defending Pokémon."
            energyCost C, C
            attackRequirement {
              assert bg.turnCount == turnCount + 1 : "$self was not damaged by an attack last turn"
            }
            onAttack {
              damage lastDamage.value
            }
          }
          move "Whirlwind", {
            text "50 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C, C
            onAttack {
              damage 50
              whirlwind()
            }
          }

        };
      case PLUSLE_36:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          globalAbility {Card thisCard->
            delayed {
              before KNOCKOUT, {
                if(ef.pokemonToBeKnockedOut.owner == thisCard.player && bg.currentTurn == thisCard.player.opposite){
                  bg.em().storeObject("Plus Charge", bg.turnCount)
                }
              }
            }
          }
          pokePower "Plus Charge", {
            text "Once during your turn , if any of your Pokémon were Knocked Out during your opponent’s last turn, you may search your discard pile for up to 2 basic Energy cards, show them to your opponent, and put them into your hand. You can’t use more then 1 Plus Charge Poké-Power each turn. This power can’t be used if Plusle is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.discard.filterByType(BASIC_ENERGY) : "You have no basic Energy in your discard pile"
              assert bg.em().retrieveObject("Plus Charge") != bg.turnCount : "You can't use more than 1 Plus Charge Ability each turn."
              assert bg.em().retrieveObject("Plus Charge") == bg.turnCount-1 : "None of your Pokémon were Knocked Out during your opponent's last turn."
              bg.em().storeObject("Plus Charge", bg.turnCount)
              powerUsed()
              my.discard.select(max:2,"Search your discard pile for up to 2 basic Energy cards",cardTypeFilter(BASIC_ENERGY)).moveTo(my.hand)
            }
          }
          move "Tag Play +", {
            text "20 damage. If you have Minun on your Bench, you may do 20 damage to any 1 Benched Pokémon instead."
            energyCost L
            onAttack {
              damage 20, my.bench.find{it.name = "Minun"}?defending:opp.all.select("Tag Play +")
            }
          }

        };
      case SHARPEDO_37:
        return evolution (this, from:"Carvanha", hp:HP080, type:DARKNESS, retreatCost:0) {
          weakness L, PLUS20
          resistance P, MINUS20
          pokeBody "Rough Skin", {
            text "If Sharpedo is your Active Pokémon and is damaged by an opponent’s attack , put 2 damage counter on the Attacking Pokémon."
            delayedA{
                before APPLY_ATTACK_DAMAGES, {
                  if (bg.currentTurn == self.owner.opposite && bg.dm().find({ it.to==self && it.dmg.value }) && self.active) {
                    directDamage(20, ef.attacker, Source.SRC_ABILITY)
                  }
                }
              }
          }
          move "Strike Wound", {
            text "60+ damage. If the Defending Pokémon has 2 or more damage counters on it, this attack does 60 damage plus 20 more damage. This attack damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects of that Pokémon."
            energyCost W, C, C
            onAttack {
              swiftDamage (60 + defending.numberOfDamageCounters > 2 ? 20 : 0, defending)
            }
          }

        };
      case SUNFLORA_38:
        return evolution (this, from:"Sunkern", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          resistance W, MINUS20
          pokePower "Grass Whistle", {
            text "Once during your turn , you may remove 1 damage counter from each of your Pokémon. You can’t use more than 1 Grass Whistle Poké-Power each turn. This power can’t be used if Sunflora is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.all.find{it.numberOfDamageCounters} : "Your Pokémon are healthy"
              assert bg.em().retrieveObject("Grass Whistle") != bg.turnCount : "You cannot use Grass Whistle more than once per turn!"
              bg.em().storeObject("Grass Whistle", bg.turnCount)
              powerUsed()
              my.all.each{
                heal 10, it, SRC_ABILITY
              }
            }
          }
          move "Petal Dance", {
            text "30× damage. Flip 3 coins. This attack does 30 damage times the number of heads. If you get 2 or more heads, Sunflora is now Confused."
            energyCost G, G
            onAttack {
              flip 3, {
                damage 30
              }, {}, [2:{
                afterDamage {
                  apply CONFUSED, self
                }
              },3:{
                afterDamage {
                  apply CONFUSED, self
                }
              }]
            }
          }

        };
      case UNOWN_S_39:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "Set", {
            text "Once during your turn , if you have Unown S, Unown E, and Unown T on your Bench, you may flip a coin. If heads, search your discard pile for an Energy card, show it to your opponent, and put it on top of your deck."
            actionA {
              checkLastTurn()
              assert self.benched : "$self is not on your bench"
              assert my.bench.find{it.name = "Unown E"} : "Unown E is not on your Bench"
              assert my.bench.find{it.name = "Unown T"} : "Unown T is not on your Bench"
              powerUsed()
              flip {
                my.discard.select("Search your discard pile for an Energy card", cardTypeFilter(ENERGY)).moveTo(addToTop: true, my.deck)
              }
            }
          }
          move "Hidden Power", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            onAttack {
              damage 10
              flip { apply CONFUSED }
            }
          }

        };
      case WEAVILE_40:
        return evolution (this, from:"Sneasel", hp:HP080, type:WATER, retreatCost:0) {
          weakness M, PLUS20
          pokePower "Dark Engage", {
            text "Once during your turn , you may use this power. Each of your Active Pokémon’s type is [D] until the end of your turn. If that Pokémon is no longer your Active Pokémon, this effect ends."
            actionA {
              checkLastTurn()
              powerUsed()
              def pcs = my.active
              delayed{
                def eff
                register {
                  eff = getter GET_POKEMON_TYPE, pcs, { h->
                    h.object.clear()
                    h.object.add(D)
                  }
                }
                unregister {
                  eff.unregister()
                }
                unregisterAfter 1
                after FALL_BACK, pcs, {unregister()}
                after EVOLVE, pcs, {unregister()}
                after DEVOLVE, pcs, {unregister()}
              }
            }
          }
          move "Shadow Charge", {
            text "Search your deck for up to 2 [D] Energy cards and attach them to any of your Pokémon is any way you like. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              attachEnergyFrom(type: D, max: 1, my.deck, my.all.select())
              attachEnergyFrom(type: D, max: 1, my.deck, my.all.select())
              shuffleDeck()
            }
          }
          move "Chip Off", {
            text "40 damage. If you opponent has 6 or more cards in his or her hand, discard a number of cards without looking until your opponent has 5 cards left in his or her hand."
            energyCost D, D
            onAttack {
              damage 40
              if(opp.hand.size() > 5) {
                def count = opp.hand.size() - 5
                opp.hand.shuffledCopy().select(hidden: true, count: count, "Choose ${count==1?'a':count} random ${count==1?'card':'cards'} from your opponent's hand to discard").discard()
              }
            }
          }

        };
      case WORMADAM_PLANT_CLOAK_41:
        return evolution (this, from:"Burmy Plant Cloak", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          pokeBody "Plant Cloak", {
            text "If Wormadam Plant Cload has 2 or more [G] Energy attached to it, Wormadam Plant Cloak gets +40 HP."
            getterA GET_FULL_HP, self{h->
              if(self.cards.energyCount(G) >=2) {
                h.object += hp(40)
              }
            }
          }
          move "Leaf Hurricane", {
            text "60 damage. If the Defending Pokémon has fewer remaining HP than Wormadam Plant Cloak, the Defending Pokémon is now Confused."
            energyCost G, C, C
            onAttack {
              damage 60
              if(defending.remainingHP.value < self.remainingHP.value) {
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case WORMADAM_SANDY_CLOAK_42:
        return evolution (this, from:"Burmy Sandy Cloak", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness R, PLUS20
          resistance L, MINUS20
          pokeBody "Sandy Cloak", {
            text "Prevent all effects of attacks, excluding damage, done to Wormadam Sandy Cloak."
            delayedA {
              before null, self, Source.ATTACK, {
                if(bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && !(ef instanceof ApplyDamages)){
                  bc "Sandy Cloak prevents effect"
                  prevent()
                }
              }
            }
          }
          move "Push Over", {
            text "40+ damage. Does 40 damage plus 10 more damage for each [F] Energy attached to Wormadam Sandy Cloak."
            energyCost F, C, C
            onAttack {
              damage 40 + 10 * self.cards.energyCount(F)
            }
          }

        };
      case WORMADAM_TRASH_CLOAK_43:
        return evolution (this, from:"Burmy Trash Cloak", hp:HP070, type:METAL, retreatCost:1) {
          weakness R, PLUS20
          resistance P, MINUS20
          pokeBody "Trash Cloak", {
            text "If Wormadam Trash Cloak has a Pokémon Tool Card attached to it, any damage done to Wormadam Trash Cloak by attacks is reduced by 20 ."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (it.to == self && self.cards.filterByType(POKEMON_TOOL) && it.dmg.value && it.notNoEffect) {
                    bc "$thisAbility -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
          move "Iron Tackle", {
            text "70 damage. Wormadam Trash Cloak does 20 damage to itself."
            energyCost M, M, C
            onAttack {
              damage 70
              damage 20, self
            }
          }

        };
      case XATU_44:
        return evolution (this, from:"Natu", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          resistance F, MINUS20
          pokePower "Psychic Shift", {
            text "Once during your turn, if Xatu is on you Bench, you may choose 1 Special Condition from 1 of your Active Pokémon and remove that Special Condition. Then, 1 of the Defending Pokémon is now affected by that Special Condition that you chose."
            actionA {
              checkLastTurn()
              assert self.benched : "$self is not on your Bench"
              assert my.active.specialConditions : "$my.active is not affected by any Special Conditions"
              powerUsed()
              SpecialConditionType spc = choose(my.active.specialConditions.asList(), "Which special condition you want to remove")
              clearSpecialCondition(my.active, TRAINER_CARD, Arrays.asList(spc))
              apply spc
            }
          }
          move "Energy Singe", {
            text "Choose 1 of you opponent’s Pokémon. This attack does 20 damage plus 10 more damage for each Energy attached to that Pokémon."
            energyCost P, C
            onAttack {
              def tar = opp.all.select("Choose 1 of yoru opponent's Pokémon")
              damage 20 + 10 * tar.cards.energyCount(C), tar
            }
          }

        };
      case BRELOOM_45:
        return evolution (this, from:"Shroomish", hp:HP100, type:GRASS, retreatCost:2) {
          weakness R
          move "Darin Punch", {
            text "40 damage. Remove from Breloom a number of damage counters equal to the amount of Energy attached to the Defending Pokémon."
            energyCost F, C
            onAttack {
              damage 40
              heal 10 * defending.cards.energyCount(C)
            }
          }
          move "Homing Uppercut", {
            text "60+ damage. If the Defending Pokémon’s Retreat Cost is 0, this attack does 60 damage plus 60 more damage."
            energyCost F, C, C
            onAttack {
              damage 60
              if(defending.retreatCost == 0) {
                damage 60
              }
            }
          }

        };
      case CHARMELEON_46:
        return evolution (this, from:"Charmander", hp:HP080, type:FIRE, retreatCost:1) {
          weakness W, PLUS20
          move "Fire Fang", {
            text "20 damage. The Defending Pokémon is now Burned."
            energyCost R
            onAttack {
              damage 20
              applyAfterDamage BURNED
            }
          }
          move "Flare Tail", {
            text "50+ damage. Flip a coin. If heads discard a [R] Energy attached to Charmeleon and this attack does 50 damage plus 20 more damage."
            energyCost R, R, C
            onAttack {
              damage 50
              flip {
                damage 20
                discardSelfEnergyAfterDamage R
              }
            }
          }

        };
      case CLOYSTER_47:
        return evolution (this, from:"Shellder", hp:HP080, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          move "Withdraw", {
            text "Flip a coin. If heads, prevent all damage done to Cloyster by attacks during your opponent’s next turn."
            energyCost ()
            onAttack {
              flip {
                preventAllDamageNextTurn()
              }
            }
          }
          move "Spine Missile", {
            text "Flip 4 coins. For each heads, choose an opponent’s Pokémon in play and this attack does 20 damage to those Pokémon. (You may choose the same Pokémon more than once.)"
            energyCost W, C
            onAttack {
              flip 4, {
                damage 20, opp.all.select("Choose an opponent's Pokémon")
              }
            }
          }

        };
      case DONPHAN_48:
        return evolution (this, from:"Phanpy", hp:HP100, type:FIGHTING, retreatCost:3) {
          weakness W, PLUS20
          resistance L, MINUS20
          move "Rapid Spin", {
            text "40 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon, if any. You switch Donphan with 1 of your Benched Pokémon, if any."
            energyCost F, C
            onAttack {
              damage 40
              afterDamage {
                if(opp.bench){
                  sw defending, opp.bench.oppSelect("New active")
                }
                if(my.bench){
                  sw self, my.bench.select("New active")
                }
              }
            }
          }
          move "Bash In", {
            text "70+ damage. If the Defending Pokémon has a Pokémon Tool card attached to it, this attack does 70 damage plus 60 more damage."
            energyCost F, F, C, C
            onAttack {
              damage 70
              if(defending.cards.filterByType(POKEMON_TOOL)) {
                damage 60
              }
            }
          }

        };
      case FARFETCH_D_49:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Swords Dance", {
            text "During your next turn, Farfetch’d’s Leek Slap attack’s base damage is 60."
            energyCost C
            onAttack {
              increasedBaseDamageNextTurn("Leek SLap", hp(30))
            }
          }
          move "Leek Slap", {
            text "30 damage. During your next turn, Farfetch’d can’t use Leek Slap."
            energyCost C
            onAttack {
              damage 30
              cantUseAttack thisMove, self
            }
          }

        };
      case FLAAFFY_50:
        return evolution (this, from:"Mareep", hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Attract Current", {
            text "10 damage. Search your deck for a [L] Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
            energyCost C
            onAttack {
              damage 10
              if(my.deck) {
                afterDamage {
                  attachEnergyFrom(type: L, max: 1, my.deck, my.all.select())
                }
              }
            }
          }
          move "Electromagnetic Kick", {
            text "60 damage. Flip a coin. If tails, Flaffy does 10 damage to itself."
            energyCost L, L, C
            onAttack {
              damage 60
              flip 1, {}, {
                damage 10, self
              }
            }
          }

        };
      case IVYSAUR_51:
        return evolution (this, from:"Bulbasaur", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "Leech Seed", {
            text "20 damage. Remove 1 damage counter from Ivysaur."
            energyCost G, C
            onAttack {
              damage 20
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
      case KECLEON_52:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          pokeBody "Camouflage", {
            text "If any basic Energy card attached to Kecleon is the same as the Attacking Pokémon’s type, any damage done by attacks from the Pokémon to Kecleon is reduced by 40 ."
            delayedA{
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  def src = it.from
                  if(it.to == self && self.cards.filterByType(BASIC_ENERGY).find{src.types.contains(it.basicType)} && it.dmg.value && it.notNoEffect) {
                    bc "Camoflage -40"
                    it.dmg -= hp(40)
                  }
                }
              }
            }
          }
          move "Blind Scratch", {
            text "60 damage. Flip a coin. If tails, this attack does no damage to the Defending Pokémon. Instead, this attack does 20 damage to 1 of your Pokémon. (Don’t apply Weakness and Resistance fo Benched Pokémon.)"
            energyCost C, C
            onAttack {
              flip 1, {
                damage 60
              }, {
                damage 20, my.all.select("This attack does 20 damage to 1 of your Pokémon")
              }
            }
          }

        };
      case KIRLIA_53:
        return evolution (this, from:"Ralts", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Psychic Research", {
            text "Search your discard pile for a Supporter card and use the effect of that card as the effect of this attack. (The Supporter card remains in your discard pile.)"
            energyCost P
            attackRequirement {
              assert my.discard.filterByType(SUPPORTER) : "There are no supporters in your discard pile"
            }
            onAttack {
              delayed {
                def eff
                register {
                  eff = getter (GET_MAX_SUPPORTER_PER_TURN) {h->
                    h.object = h.object + 1
                  }
                }
                unregister {
                  eff.unregister()
                }
                unregisterAfter 1
              }
              def card = my.discard.select("Select a Supporter to copy its effect as this attack.",cardTypeFilter(SUPPORTER)).first()
              bg.deterministicCurrentThreadPlayerType=self.owner
              bg.em().run(new PlayTrainer(card))
              bg.clearDeterministicCurrentThreadPlayerType()
            }
          }
          move "Telekinesis", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost P, C, C
            onAttack {
              noWrDamage 40, opp.all.select()
            }
          }

        };
      case LOMBRE_54:
        return evolution (this, from:"Lotad", hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Torment", {
            text "20 damage. Flip a coin. If heads, your opponent can’t play any Supporter cards from his or her hand during his or her next turn."
            energyCost C, C
            onAttack {
              damage 20
              opponentCantPlaySupporterNextTurn(delegate)
            }
          }
          move "Absorb", {
            text "40 damage. Remove 2 damage counters from Lombre."
            energyCost W, W
            onAttack {
              damage 40
              heal 20, self
            }
          }

        };
      case MILTANK_55:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Healing Milk", {
            text "Flip 2 coins. For each heads, remove 3 damage counters from 1 of your Pokémon."
            energyCost ()
            attackRequirement {
              assert my.all.find{it.numberOfDamageCounters} : "Your Pokémon are healthy"
            }
            onAttack {
              flip 2, {
                heal 30, my.all.findAll{it.numberOfDamageCounters}.select()
              }
            }
          }
          move "Continuous Tumble", {
            text "20× damage. Flip a coin until you get tails. This attack does 20 damage times the number of heads."
            energyCost C, C
            onAttack {
              flipUntilTails{
                damage 20
              }
            }
          }

        };
      case MUK_56:
        return evolution (this, from:"Grimer", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS20
          pokeBody "Toxic Sludge", {
            text "At the end of each player’s turn, each of your opponent’s Active Pokémon that has any Energy attached to it is now Poisoned. If that Pokémon is already Poisoned, Toxic Sludge Poké-Body does nothing to that Pokémon."
            delayedA {
              before BETWEEN_TURNS, {
                if(opp.active.cards.energyCount(C) && !opp.active.isSPC(POISONED)) {
                  apply POISONED, opp.active
                  bc("$thisAbility poisons $opp.active")
                }
              }
            }
          }
          move "Panic Liquid", {
            text "50 damage. The Defending Pokémon is now Confused and can’t retreat during your opponent’s next turn."
            energyCost P, P, C
            onAttack {
              damage 50
              applyAfterDamage CONFUSED
              cantRetreat defending
            }
          }

        };
      case NIDORINO_57:
        return evolution (this, from:"Nidoran♂", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Spirited Drill", {
            text "20 damage. During your next turn, each of Nidorino's attacks does 20 more damage to the Defending Pokémon."
            energyCost C, C
            onAttack {
              damage 20
              def pcs = defending
              targeted(pcs){
                delayed {
                  before APPLY_ATTACK_DAMAGES, {
                    bg.dm().each {if(it.to==pcs && it.from==self && it.dmg.value>0 && it.notNoEffect){
                      bc "$thisMove increases damage"
                      it.dmg+=hp(20)
                    }}
                  }
                  unregisterAfter 3
                  after FALL_BACK, pcs, {unregister()}
                  after EVOLVE, pcs, {unregister()}
                  after DEVOLVE, pcs, {unregister()}
                }
              }
            }
          }
          move "Poison Horn", {
            text "40 damage. The Defending Pokémon is now Poisoned."
            energyCost P, C, C
            onAttack {
              damage 40
              applyAfterDamage POISONED
            }
          }

        };
      case PIDGEOTTO_58:
        return evolution (this, from:"Pidgey", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Wing Attack", {
            text "20 damage. "
            energyCost C
            onAttack {
              damage 20
            }
          }
          move "Quick Attack", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage."
            energyCost C, C
            onAttack {
              damage 30
              flip {
                damage 30
              }
            }
          }

        };
      case PINSIR_59:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          move "Grip and Squeeze", {
            text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost G
            onAttack {
              damage 20
              cantRetreat defending
            }
          }
          move "Power Guillotine", {
            text "100 damage. Flip 2 coins. If either of them is tails, this attack’s base damage is 10 instead of 100."
            energyCost G, C, C
            onAttack {
              damage 10
              flip 2, {}, {}, [2:{damage 90}]
            }
          }

        };
      case QUAGSIRE_60:
        return evolution (this, from:"Wooper", hp:HP090, type:WATER, retreatCost:3) {
          weakness G
          resistance L, MINUS20
          pokePower "Aqua Healing", {
            text "Once during your turn , if Quagsire is your Active Pokémon and the Defending Pokémon has any Energy attached to it, you may remove 3 damage counters from Quagsire."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert self.active : "$self is not active"
              assert opp.active.cards.energyCount(C) : "$opp.active has no Energy attached to it"
              powerUsed()
              heal 30, self, SRC_ABILITY
            }
          }
          move "Muddy Water", {
            text "60 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost W, C, C
            onAttack {
              damage 60
              if(opp.bench) {
                damage 20, opp.bench.select()
              }
            }
          }

        };
      case RATICATE_61:
        return evolution (this, from:"Rattata", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness F, PLUS20
          move "Gnaw Off", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 60 more damage."
            energyCost C
            onAttack {
              damage 10
              flip {
                damage 60
              }
            }
          }
          move "Sneaky Attack", {
            text "20+ damage. If Raticate has any [D] Energy attached to it, this attack does 20 damage plus 20 more damage."
            energyCost C
            onAttack {
              damage 20
              if(self.cards.energyCount(D)) {
                damage 20
              }
            }
          }

        };
      case ROSELIA_62:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Sleep Powder", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            onAttack {
              apply ASLEEP
            }
          }
          move "Razor Leaf", {
            text "10 damage. "
            energyCost G
            onAttack {
              damage 10
            }
          }

        };
      case SABLEYE_63:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          resistance C, MINUS20
          move "Rummage", {
            text "Look at the top 5 cards of your deck. Choose as many Trainer cards as you like, show them to your opponent, and put them into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.subList(0,5).select("Choose as many Trainer cards as you like",cardTypeFilter(ITEM)).showToOpponent("Selected Cards").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Shadow Sneak", {
            text "20+ damage. If you and your opponent have a different number of Prize cards left, this attack does 20 damage plus 20 more damage."
            energyCost D, C
            onAttack {
              damage 20
              if(my.prizeCardSet.size() != opp.prizeCardSet.size()) {
                damage 20
              }
            }
          }

        };
      case SHELGON_64:
        return evolution (this, from:"Bagon", hp:HP080, type:COLORLESS, retreatCost:2) {
          weakness C, PLUS20
          resistance F, MINUS20
          move "Focus Energy", {
            text "During your next turn, Shelgon’s Protect Charge attack’s base damage is 80."
            energyCost C
            onAttack {
              increasedBaseDamageNextTurn("Protect Charge", hp(50))
            }
          }
          move "Protect Charge", {
            text "30 damage. During your opponent's next turn, any damage done to Shelgon by attacks is reduced by 30."
            energyCost C, C, C
            onAttack {
              damage 30
              reduceDamageNextTurn(hp(30),thisMove)
            }
          }

        };
      case SKIPLOOM_65:
        return evolution (this, from:"Hoppip", hp:HP060, type:GRASS, retreatCost:0) {
          weakness R, PLUS20
          resistance F, MINUS20
          pokeBody "Cotton Balloon", {
            text "If Skiploom has any Energy attached to it, any damage done to Skiploom by attacks from your opponent’s Evolved Pokémon is reduced by 20 ."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if (self.cards.energyCount(C) && it.to == self && it.from.owner != self.owner && it.from.evolution && it.notNoEffect && it.dmg.value) {
                    bc "Cotton Balloon -20"
                    it.dmg=hp(0)
                  }
                }
              }
            }
          }
          move "U-turn", {
            text "20 damage. Switch Skiploom with 1 of your Benched Pokémon."
            energyCost G
            onAttack {
              damage 20
              switchYourActive()
            }
          }

        };
      case SMEARGLE_66:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Color Pick", {
            text "Search your deck for up to 3 basic Energy cards, show them to your opponent, and put them into you hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search(max:3,"Search your deck for up to 3 basic Energy cards",cardTypeFilter(BASIC_ENERGY)).moveTo(my.hand)
            }
          }
          move "Trace", {
            text "Flip a coin. If heads, choose an attack on 1 of your opponent’s Benched Pokémon. Trace copies that attack except for its Energy cost. (You must still do anything else required for that attack.) Smeargle performs that attack."
            energyCost C
            attackRequirement {
              assert opp.bench : "Your opponent has no Benched Pokémon"
              assert opp.bench.find{it.topPokemonCard.moves} : "None of your opponent's Benched Pokémon have any moves"
            }
            onAttack {
              flip { metronome opp.bench, delegate }
            }
          }

        };
      case SMOOCHUM_67:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Jynx from your hand onto Smoochum (this counts as evolving Smoochum) and remove all damage counters from Smoochum."
            actionA {
              checkCanBabyEvolve("Jynx", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Jynx", self)
            }
          }
          move "Psykiss", {
            text "Flip a coin. If heads, choose a Special Energy card attached to 1 of your opponent’s Pokémon and have your opponent shuffle that card into his or her deck."
            energyCost ()
            attackRequirement {
              assert opp.all.find{it.cards.filterByType(SPECIAL_ENERGY)} : "Your opponent doesn't have any Special Energy attached to their Pokémon"
            }
            onAttack {
              flip {
                def tar = opp.all.findAll{it.cards.filterByType(SPECIAL_ENERGY)}.select()
                tar.cards.select("Shuffle a Special Energy card attached to $tar into your opponent's deck").moveTo(opp.deck)
                shuffleDeck(null, TargetPlayer.OPPONENT)
              }
            }
          }

        };
      case UNOWN_K_68:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "Kind", {
            text "Once during your turn , you may remove 2 damage counters from 1 of the Defending Pokémon."
            actionA {
              checkLastTurn()
              assert opp.active.numberOfDamageCounters : "$opp.active is healthy"
              powerUsed()
              heal 20, opp.active, SRC_ABILITY
            }
          }
          move "Hidden Power", {
            text "20 damage. "
            energyCost P
            onAttack {
              damage 20
            }
          }

        };
      case UNOWN_N_69:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "Nod", {
            text "Once during your turn , if you have Unown N, Unown O, and Unown D on your Bench, you may ask your opponent to take a Prize card. If he or she does, you take a Prize card. If he or she doesn’t, draw a card."
            actionA {
              checkLastTurn()
              assert self.benched : "$self is not on your bench"
              assert my.bench.find{it.name = "Unown O"} : "Unown O is not on your Bench"
              assert my.bench.find{it.name = "Unown D"} : "Unown D is not on your Bench"
              powerUsed()
              if(oppConfirm("You may take a Prize card. If you do, your opponent also takes a Prize card. If you don't, your opponent draws a card.")) {
                bg.em().run(new TakePrize(self.owner.opposite, null))
                bg.em().run(new TakePrize(self.owner, null))
              } else {
                draw 1
              }
            }
          }
          move "Hidden Power", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost C
            onAttack {
              damage 10
              flip {
                applyAfterDamage BURNED
              }
            }
          }

        };
      case UNOWN_O_70:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "ONE", {
            text "Once during your turn , if you have Unown O, Unown N, and Unown E on your Bench and you have 1 card left in your hand, you may draw cards until you have 7 cards in your hand."
            actionA {
              checkLastTurn()
              assert my.hand.size() == 1 : "You don't have exactly 1 card in your hand"
              assert self.benched : "$self is not on your bench"
              assert my.bench.find{it.name = "Unown N"} : "Unown N is not on your Bench"
              assert my.bench.find{it.name = "Unown E"} : "Unown E is not on your Bench"
              powerUsed()
              draw 6
            }
          }
          move "Hidden Power", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost C
            onAttack {
              damage 10
              flip {
                applyAfterDamage ASLEEP
              }
            }
          }

        };
      case UNOWN_X_71:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokePower "X-RAY", {
            text "Once during your turn , if you have Unown X on your Bench, you may look at the top card of your opponent’s deck and put it back on top of his or her deck."
            actionA {
              checkLastTurn()
              assert opp.deck : "Your opponent's deck is empty"
              assert self.benched : "$self is not on your bench"
              powerUsed()
              opp.deck.subList(0,1).showToMe("Top card of your opponent's deck")
            }
          }
          move "Hidden Power", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case UNOWN_Z_72:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "ZERO", {
            text "Once during your turn , if Unown Z is on your Bench and you have no cards in you deck, you may discard all cards attached to Unown Z and put Unown Z on top of your deck."
            actionA {
              checkLastTurn()
              assert my.deck.size() == 0 : "Your deck is not empty"
              assert self.benched : "$self is not on your bench"
              powerUsed()
              self.cards.getExcludedList(self.topPokemonCard).discard()
              self.cards.moveTo(addToTop: true, my.deck)
              removePCS(self)
            }
          }
          move "Hidden Power", {
            text "Remove as many damage counters as you like from each Unown you have in play. Put that many damage counters on the Defending Pokémon."
            energyCost P, C
            attackRequirement {
              assert my.all.find{it.name.contains("Unown") && it.numberOfDamageCounters} : "All of your unown are healthy"
            }
            onAttack {
              def count = 0
              my.all.findAll{it.name.contains("Unown") && it.numberOfDamageCounters}.each {
                def choice = choose(0..it.numberOfDamageCounters,"Move how many damage counters from $self?")
                heal 10 * choice, it
                count += choice
              }
              if(count > 0) {
                directDamage 10 * count, defending
              }
            }
          }

        };
      case VENOMOTH_73:
        return evolution (this, from:"Venonat", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance F, MINUS20
          pokeBody "Dangerous Scales", {
            text "If Venomoth is your Active Pokémon and is damaged by an opponent’s attack (even is Venomoth is Knocked Out), the Attacking Pokémon is now Asleep and Poisoned."
            delayedA (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if (bg.currentTurn == self.owner.opposite && self.active && bg.dm().find({it.to==self && it.dmg.value})) {
                  bc "Dangerous Scales"
                  apply ASLEEP, (ef.attacker as PokemonCardSet)
                  apply POISONED, (ef.attacker as PokemonCardSet)
                }
              }
            }
          }
          move "Disturbance Dive", {
            text "50 damage. Prevent all effects of an attack, excluding damage, done to Venomoth during your opponent’s next turn."
            energyCost G, G
            onAttack {
              damage 50
              preventAllEffectsExcludingDamageNextTurn()
            }
          }

        };
      case VIBRAVA_74:
        return evolution (this, from:"Trapinch", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS20
          resistance L, MINUS20
          move "Sand Wind", {
            text "Does 10 damage to each of your opponent’s Pokémon."
            energyCost F
            onAttack {
              opp.all.each {
                damage 10, it
              }
            }
          }
          move "Hyper Beam", {
            text "40 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost F, C, C
            onAttack {
              damage 40
              flip {
                discardDefendingEnergy()
              }
            }
          }

        };
      case WARTORTLE_75:
        return evolution (this, from:"Squirtle", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Giant Wave", {
            text "40 damage. Wartortle can’t use Giant Wave during your next turn."
            energyCost W, W
            onAttack {
              damage 40
              cantUseAttack thisMove, self
            }
          }
          move "Shell Attack", {
            text "50 damage. "
            energyCost C, C, C
            onAttack {
              damage 50
            }
          }

        };
      case BAGON_76:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS10
          resistance F, MINUS20
          move "Bite", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Rage", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Bagon."
            energyCost C, C
            onAttack {
              damage 10 + 10 * self.numberOfDamageCounters
            }
          }

        };
      case BULBASAUR_77:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Shake Vine", {
            text "The Defending Pokémon is now Asleep."
            energyCost ()
            onAttack {
              applyAfterDamage ASLEEP
            }
          }
          move "Bullet Seed", {
            text "10× damage. Flip 4 coins. This attack does 10 damage times the number of heads."
            energyCost G, C
            onAttack {
              flip 4, {
                damage 10
              }
            }
          }

        };
      case BURMY_PLANT_CLOAK_78:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          pokePower "Wear Cloak", {
            text "Once during your turn , if Burmy Plant Cloak is your Active Pokémon, you may search your discard pile for a basic [G] Energy card and attach it to Burmy Plant Cloak."
            actionA {
              checkLastTurn()
              assert my.discard.filterByBasicEnergyType(G) : "There are no basic [G] Energy cards in your discard"
              assert self.active : "$self is not active"
              powerUsed()
              attachEnergyFrom(basic: true, type: G, my.discard, self)
            }
          }
          move "Plant Cloak Tackle", {
            text "10+ damage. If Burmy Plant Cloak has any [G] Energy attached to it, this attack does 10 damage plus 10 more damage."
            energyCost C
            onAttack {
              damage 10
              if(self.cards.energyCount(G)) {
                damage 10
              }
            }
          }

        };
      case BURMY_SANDY_CLOAK_79:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          pokePower "Wear Cloak", {
            text "Once during your turn , if Burmy Sandy Cloak is your Active Pokémon, you may search your discard pile for a basic [F] Energy card and attach it to Burmy Sandy Cloak."
            actionA {
              checkLastTurn()
              assert my.discard.filterByBasicEnergyType(F) : "There are no basic [F] Energy cards in your discard"
              assert self.active : "$self is not active"
              powerUsed()
              attachEnergyFrom(basic: true, type: F, my.discard, self)
            }
          }
          move "Sandy Cloak Tackle", {
            text "10+ damage. If Burmy Sandy Cloak has any basic [F] Energy attached to it, this attack does 10 damage plus 10 more damage."
            energyCost C
            onAttack {
              damage 10
              if(self.cards.energyCount(F)) {
                damage 10
              }
            }
          }

        };
      case BURMY_TRASH_CLOAK_80:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          pokePower "Wear Cloak", {
            text "Once during your turn , if Burmy Trash Cloak is your Active Pokémon, you may search your discard for a basic [M] Energy card and attach it to Burmy Trash Cloak."
            actionA {
              checkLastTurn()
              assert my.discard.filterByBasicEnergyType(M) : "There are no basic [M] Energy cards in your discard"
              assert self.active : "$self is not active"
              powerUsed()
              attachEnergyFrom(basic: true, type: M, my.discard, self)
            }
          }
          move "Trash Cloak Tackle", {
            text "10+ damage. If Burmy Trash Cloak has any basic [M] Energy attached to it, this attack does 10 damage plus 10 more damage."
            energyCost C
            onAttack {
              damage 10
              if(self.cards.energyCount(M)) {
                damage 10
              }
            }
          }

        };
      case CARVANHA_81:
        return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
          weakness L, PLUS10
          resistance P, MINUS20
          move "Slash", {
            text "10 damage. "
            energyCost W
            onAttack {
              damage 10
            }
          }
          move "Bite Away", {
            text "20 damage. Flip a coin. If heads, choose a card from your opponent’s hand without looking and discard it."
            energyCost D, C
            onAttack {
              damage 20
              flip {
                opp.hand.shuffledCopy().select(hidden: true, "Choose a card from your opponent's hand without looking").discard()
              }

            }
          }

        };
      case CHARMANDER_82:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Gnaw", {
            text "10 damage. "
            energyCost ()
            onAttack {
              damage 10
            }
          }
          move "Lava Burn", {
            text "20 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost R, R
            onAttack {
              damage 20
              if(opp.bench) {
                damage 10, opp.bench.select("Does 10 damage to 1 of your opponent's Benched Pokémon")
              }
            }
          }

        };
      case CLEFAIRY_83:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          customAbility {
            //Moon Stone: Clefairy can evolve the turn you play it
            //TODO This is a rule box.
            delayedA {
              before PREVENT_EVOLVE, self, null, EVOLVE_STANDARD, {
                if (bg.currentTurn == self.owner){
                  prevent()
                }
              }
            }
          }
          move "Double Slap", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            onAttack {
              flip 2, {
                damage 10
              }
            }
          }

        };
      case CORSOLA_84:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness G, PLUS20
          move "Rally", {
            text "Search your deck for up to 3 different types of Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Deck is empty"
              assert my.bench.notFull : "Bench is full"
            }
            onAttack {
              def maxSpace = Math.min(my.bench.freeBenchCount, 3)
              my.deck.select(min:0, max:maxSpace, "Select up to $maxSpace Basic Pokémon of different types.", cardTypeFilter(BASIC), thisCard.player, { CardList list ->
                TypeSet typeSet = new TypeSet()
                for (card in list) {
                  if (typeSet.containsAny(card.asPokemonCard().types)) {
                    return false
                  }
                  typeSet.addAll(card.asPokemonCard().types)
                }
                return true
              }).each {
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Hook", {
            text "30 damage. "
            energyCost W, C
            onAttack {
              damage 30
            }
          }

        };
      case DIGLETT_85:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS10
          resistance L, MINUS20
          move "Down Draw", {
            text "Draw a card from the bottom of your deck."
            energyCost C
            attackRequirement { assert my.deck : "Deck is empty"}
            onAttack {
              my.deck.subList(my.deck.size() - 1, my.deck.size()).moveTo(my.hand)
            }
          }
          move "Mud Spatter", {
            text "30 damage. "
            energyCost F, F
            onAttack {
              damage 30
            }
          }

        };
      case DUSKULL_86:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          customAbility {
            //Reaper Cloth: Clefairy can evolve the turn you play it
            //TODO This is a rule box.
            delayedA {
              before PREVENT_EVOLVE, self, null, EVOLVE_STANDARD, {
                if (bg.currentTurn == self.owner){
                  prevent()
                }
              }
            }
          }
          move "Astonish", {
            text "Flip a coin. If heads, choose 1 card from your opponent’s hand without looking. Look at that card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost P
            onAttack {
              flip {
                astonish()
              }
            }
          }

        };
      case ELECTABUZZ_87:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:2) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Thundershock", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                apply PARALYZED
              }
            }
          }
          move "Thunder", {
            text "60 damage. Flip a coin. If tails, Electabuzz does 30 damage to itself."
            energyCost L, L, C
            onAttack {
              damage 60
              flip 1, {}, {
                damage 30, self
              }
            }
          }

        };
      case GRIMER_88:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS10
          move "Mud Bomb", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Gunky", {
            text "If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips coin. If tails, that attack does nothing."
            energyCost P
            onAttack {
              sandAttack(thisMove)
            }
          }

        };
      case GROWLITHE_89:
        return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
          weakness W, PLUS20
          move "Roar", {
            text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C
            onAttack {
              whirlwind()
            }
          }
          move "Dig Claws", {
            text "20 damage. "
            energyCost R, C
            onAttack {
              damage 20
            }
          }

        };
      case HOPPIP_90:
        return basic (this, hp:HP030, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance F, MINUS20
          pokeBody "Cottonweed", {
            text "If Hoppip has any Energy attached to it, the Retreat Cost for Hoppip is 0."
            getterA (GET_RETREAT_COST, self) {h->
              if(self.cards.energyCount(C)) {
                h.object = 0
              }
            }
          }
          move "Hover Heal", {
            text "10 damage. Remove all Special Conditions from Hoppip."
            energyCost G
            onAttack {
              damage 10
              clearSpecialCondition self
            }
          }

        };
      case LICKITUNG_91:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:3) {
          weakness F, PLUS20
          move "Lick", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              damage 10
              flip {
                apply PARALYZED
              }
            }
          }
          move "Stomp", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage."
            energyCost C, C
            onAttack {
              damage 10
              flip {
                damage 30
              }
            }
          }

        };
      case LOTAD_92:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Water Sport", {
            text "10+ damage. If Lotad has less Energy attached to it than the Defending Pokémon, this attack does 10 damage plus 20 more damage."
            energyCost W
            onAttack {
              damage 10
              if(self.cards.energyCount(C) < defending.cards.energyCount(C)) {
                damage 20
              }
            }
          }
          move "Ram", {
            text "20 damage. "
            energyCost W, C
            onAttack {
              damage 20
            }
          }

        };
      case MAGMAR_93:
        return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
          weakness W, PLUS20
          move "Fire Punch", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Smog", {
            text "20 damage. The Defending Pokémon is now Poisoned."
            energyCost R, C
            onAttack {
              damage 20
              applyAfterDamage POISONED
            }
          }

        };
      case MAREEP_94:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Thundershock", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L
            onAttack {
              damage 10
              flip {
                apply PARALYZED
              }
            }
          }
          move "Static Shock", {
            text "20 damage. "
            energyCost L, C
            onAttack {
              damage 20
            }
          }

        };
      case MURKROW_95:
        return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          customAbility{
            delayedA {
              before PREVENT_EVOLVE, self, null, EVOLVE_STANDARD, {
                if(bg.currentTurn == self.owner){
                  prevent()
                }
              }
            }
          }
          move "Feint Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost D, C
            onAttack {
              swiftDamage(20, opp.all.select())
            }
          }
        };
      case NATU_96:
        return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          resistance F, MINUS20
          move "Bothering Wave", {
            text "20 damage. Flip a coin. If tails, this attack does nothing. If heads, discard an energy card attached to the Defending Pokémon."
            energyCost C
            onAttack {
              flip {
                damage 20
                discardDefendingEnergy()
              }
            }
          }
          move "Future Sight", {
            text "Look at the top 5 cards of either player’s deck and put them back on top of that player’s deck in any order."
            energyCost P
            onAttack {
              foresight(5, delegate)
            }
          }

        };
      case NIDORAN_MALE_97:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              draw 1
            }
          }
          move "Poison Skin", {
            text "Flip 2 coins. If either of them is heads, the Defending Pokémon is now Poisoned."
            energyCost P
            onAttack {
              flip 2, {}, {}, [2:{apply POISONED}, 1:{apply POISONED}]
            }
          }

        };
      case PHANPY_98:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness W
          resistance L, MINUS20
          move "Flail", {
            text "10× damage. Does 10 damage times the number of damage counters on Phanpy."
            energyCost C
            attackRequirement {
              assert self.numberOfDamageCounters : "$self is healthy"
            }
            onAttack {
              damage 10*self.numberOfDamageCounters
            }
          }
          move "Take Down", {
            text "30 damage. Phanpy does 10 damage to itself."
            energyCost F, C
            onAttack {
              damage 30
              damage 10, self
            }
          }

        };
      case PIDGEY_99:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Growl", {
            text "During your opponent's next turn, any damage done by attacks from the Defending Pokémon is reduced by 20."
            energyCost C
            onAttack {
              reduceDamageFromDefendingNextTurn(hp(50), thisMove, defending)
            }
          }
          move "Peck", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case PSYDUCK_100:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Delusion", {
            text "If Psyduck is Confused, draw 2 cards."
            energyCost C
            attackRequirement {
              assert self.isSPC(CONFUSED) : "$self is not confused"
            }
            onAttack {
              if(self.isSPC(CONFUSED)) {
                draw 2
              }
            }
          }
          move "Migraine", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, Psyduck is now Confused."
            energyCost C
            onAttack {
              damage 10
              flip 1, {
                applyAfterDamage CONFUSED
              }, {
                afterDamage {
                  apply CONFUSED, self
                }
              }
            }
          }

        };
      case QWILFISH_101:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          pokePower "Balloon Sting", {
            text "Once during your opponent’s turn, if Qwilfish is your Active Pokémon and is damage by an attack (even if Qwilfish is Knocked Out), you may flip a coin. If heads, the Attacking Pokémon is now Poisoned. Put 2 damage counter instead of 1 on that Pokémon between turns."
            delayedA (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if(bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value}) && confirm ("Use Balloon Sting?")){
                  powerUsed()
                  bc "Balloon Sting activates"
                  flip {
                    apply POISONED, (ef.attacker as PokemonCardSet), SRC_ABILITY
                    extraPoison 1
                  }
                }
              }
            }
          }
          move "Nerve Shot", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, W
            onAttack {
              damage 20
              flip {
                apply PARALYZED
              }
            }
          }

        };
      case RALTS_102:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Smack", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Confuse Ray", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P
            onAttack {
              flip {
                apply CONFUSED
              }
            }
          }

        };
      case RATTATA_103:
        return basic (this, hp:HP030, type:COLORLESS, retreatCost:0) {
          weakness F, PLUS10
          move "Tail Whip", {
            text "Flip a coin. If heads, the Defending Pokémon can’t attack during your opponent’s next turn."
            energyCost C
            onAttack {
              flip {
                cantAttackNextTurn defending
              }
            }
          }
          move "Bite", {
            text "20 damage. "
            energyCost C
            onAttack {
              damage 20
            }
          }

        };
      case SENTRET_104:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Grope", {
            text "Look at the top 2 cards of your deck, choose 1 of them, and put it into your hand. Put the other card on the bottom of your deck."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              def list = my.deck.sublist(0,2)
              def choice = list.select("Choose a card to put into your hand").moveTo(my.hand)
              list.getExcludedList(choice).moveTo(my.deck)
            }
          }
          move "Scratch", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }

        };
      case SHELLDER_105:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Shell Rest", {
            text "Remove 2 damage counters from Shellder."
            energyCost C
            attackRequirement {
              assert self.numberOfDamageCounters : "$self is healthy"
            }
            onAttack {
              heal 20, self
            }
          }
          move "Tongue Slap", {
            text "20 damage. "
            energyCost W, C
            onAttack {
              damage 20
            }
          }

        };
      case SHELLOS_EAST_SEA_106:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness L, PLUS10
          move "Shell Hunting", {
            text "Search your deck for up to 2 in any combination of Shellos West Sea and Shellos East Sea and put them on your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(name:"Shellos", 2, delegate)
          }
          move "Sprinkle Water", {
            text "10 damage. "
            energyCost W
            onAttack {
              damage 10
            }
          }

        };
      case SHELLOS_WEST_SEA_107:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Mud Spatter", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Recover", {
            text "Discard a [W] Energy attached to Shellos West Sea and remove all damage counter from Shellos West Sea."
            energyCost W
            attackRequirement {
              assert self.numberOfDamageCounters
            }
            onAttack {
              healAll self
            }
          }

        };
      case SHROOMISH_108:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Headbutt", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Toxic Spore", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost G, C
            onAttack {
              damage 20
              flip {
                apply POISONED
              }
            }
          }

        };
      case SHUCKLE_109:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          pokeBody "Pot Shell", {
            text "Prevent all effects of attacks, including damage, done to Shuckle by your opponent’s Pokémon that has any Special Energy cards attached to it."
            delayedA {
              before null, self, Source.ATTACK, {
                if (self.owner.opposite.pbg.active.cards.filterByType(SPECIAL_ENERGY) && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                  bc "$thisAbility prevents effect"
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && it.notNoEffect && it.from.cards.filterByType(SPECIAL_ENERGY)){
                    it.dmg = hp(0)
                    bc "$thisAbility prevents damage"
                  }
                }
              }
              after ENERGY_SWITCH, {
                def efs = (ef as EnergySwitch)
                if(efs.from.cards.filterByType(SPECIAL_ENERGY) && efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
                  discard efs.card
                }
              }
            }
          }
          move "Ferment Poison", {
            text "10 damage. The Defending Pokémon is now Poisoned. As long as the Defending Pokémon remains Poisoned by this attack, it can’t use any Poké-Body."
            energyCost G, C
            onAttack {
              damage 10
              afterDamage {
                apply POISONED
                def pcs = defending
                if(pcs.isSPC(POISONED)) {// Is !bg.em().run(new ApplySpecialCondition(POISONED, pcs, SOURCE.ATTACK)) better here
                  delayed {
                    def eff
                    register {
                      eff = getter IS_ABILITY_BLOCKED, { Holder h->
                        if (h.effect.target == pcs && h.effect.ability instanceof PokeBody) {
                          h.object=true
                        }
                      }
                      new CheckAbilities().run(bg)
                    }
                    unregister {
                      eff.unregister()
                      new CheckAbilities().run(bg)
                    }
                    after CLEAR_SPECIAL_CONDITION, pcs, {
                      if(ef.types.contains(POISONED)){
                        unregister()
                      }
                    }
                    after FALL_BACK, pcs, {unregister()}
                  }
                }
              }
            }
          }

        };
      case SHUPPET_110:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Gossip", {
            text "Put 1 damage counter on 1 of your opponent’s Pokémon."
            energyCost P
            onAttack {
              directDamage 10, opp.all.select("Put 1 damage counter on 1 of your opponent's Pokémon")
            }
          }
          move "Hang Down", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case SPINDA_111:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Dish Out", {
            text "Draw a card from the top and the bottom of your deck."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.subList(my.deck.size() - 1, my.deck.size()).moveTo(my.hand)
              draw 1
            }
          }
          move "Synchro Punch", {
            text "10+ damage. If any basic Energy card attached to Spinda is the same type as any Energy attached to the Defending Pokémon, this attack does 10 damage plus 30 more damage."
            energyCost C
            onAttack {
              damage 10
              if(self.cards.filterByType(BASIC_ENERGY).find{card->defending.cards.filterByType(BASIC_ENERGY).find{it.basicType == card.basicType}}) {
                damage 30
              }
            }
          }

        };
      case SQUIRTLE_112:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Bubble", {
            text "Flip a coin. If heads the Defending Pokémon is now Paralyzed."
            energyCost ()
            onAttack {
              flip {
                apply PARALYZED
              }
            }
          }
          move "Aqua Tail", {
            text "20+ damage. Flip a coin for each [W] Energy attached to Squirtle. This attack does 20 damage plus 10 more damage for each heads."
            energyCost W, C
            onAttack {
              damage 20
              flip self.cards.energyCount(W), {
                damage 10
              }
            }
          }

        };
      case STANTLER_113:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Lead", {
            text "Search your deck for a Supporter card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search("Choose a Supporter card", cardTypeFilter(SUPPORTER)).showToOpponent("Selected Cards").moveTo(my.hand)
            }
          }
          move "Frighten Horn", {
            text "20 damage. If the Defending Pokémon isn’t an Evolved Pokémon, that Pokémon is now Confused."
            energyCost C, C
            onAttack {
              damage 20
              if(!defending.evolution) {
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case SUNKERN_114:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Sun Soak", {
            text "Flip a coin. If heads, remove all damage counter from Sunkern, search your deck for an Evolution card that evolves from Sunkern, and put it onto Sunkern. (This counts as evolving Sunkern.) Shuffle your deck afterward."
            energyCost C
            onAttack {
              flip {
                healAll self
                if(my.deck) {
                  def sel = deck.search ("Select a Pokémon that evolves from $self.", {it.cardTypes.is(EVOLUTION) && self.name == it.predecessor}).first()
                  if (sel) {
                    evolve(self, sel, OTHER)
                  }
                }
              }
            }
          }
          move "Seed Bomb", {
            text "20 damage. "
            energyCost G
            onAttack {
              damage 20
            }
          }

        };
      case TRAPINCH_115:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS10
          resistance L, MINUS20
          move "Inviting Trap", {
            text "Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon."
            energyCost C
            onAttack {
              sw opp.active, opp.bench.select()
            }
          }
          move "Sand Tomb", {
            text "10 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost F
            onAttack {
              damage 10
              cantRetreat defending
            }
          }

        };
      case VENONAT_116:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Stun Spore", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              flip {
                apply PARALYZED
              }
            }
          }
          move "Signal Beam", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost G
            onAttack {
              damage 10
              flip {
                apply CONFUSED
              }
            }
          }

        };
      case VOLTORB_117:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Speed Ball", {
            text "20 damage. "
            energyCost L
            onAttack {
              damage 20
            }
          }
          move "Big Explosion", {
            text "50 damage. Voltorb does 50 damage to itself."
            energyCost L, C
            onAttack {
              damage 50
              damage 50, self
            }
          }

        };
      case WOOPER_118:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness G, PLUS20
          resistance L, MINUS20
          move "Yawn", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            onAttack {
              apply ASLEEP
            }
          }
          move "Splatter", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost W
            onAttack {
              noWrDamage 10, opp.all.select()
            }
          }

        };
      case BEBE_S_SEARCH_119:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nChoose a card from your hand and put it on top of your deck. Search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward. (If this is the only card in your hand, you can’t play this card.)"
          onPlay {
            my.hand.getExcludedList(thisCard).select("Choose the card to put back in your deck").moveTo(addToTop: true, my.deck)
            my.deck.search("Choose the Pokémon to put into your hand",cardTypeFilter(POKEMON)).showToOpponent("Selected Cards").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.hand.size() > 1 : "You need one other card in your hand to play this card"
          }
        };
      case NIGHT_MAINTENANCE_120:
        return basicTrainer (this) {
          text "Search your discard pile for up to 3 in any combination of Pokémon and basic Energy cards. Show them to your opponent and shuffle them into your deck."
          onPlay {
            def tar = my.discard.findAll{it.cardTypes.is(BASIC_ENERGY) || it.cardTypes.is(POKEMON)}
            def maxSel = Math.min(3,tar.size())
            my.discard.select(count:maxSel,"Choose $maxSel cards to put back in your deck",{it.cardTypes.is(BASIC_ENERGY) || it.cardTypes.is(POKEMON)}).showToOpponent("Selected Cards").moveTo(my.deck)
            shuffleDeck()
          }
          playRequirement{
            assert my.discard.findAll{it.cardTypes.is(BASIC_ENERGY) || it.cardTypes.is(POKEMON)} : "There are no basic Pokémon or basic Energy cards in your discard"
          }

        };
      case PLUSPOWER_121:
        return copy (DiamondPearl.PLUSPOWER_109, this);
      case PROFESSOR_OAK_S_VISIT_122:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDraw 3 cards. Then, choose a card from your hand and put it on the bottom of your deck."
          onPlay {
            draw 3
            my.hand.getExcludedList(thisCard).select("Put a card on the bottom of your deck").moveTo(hidden:true, my.deck)
          }
          playRequirement{
            assert my.deck || my.hand.getExcludedList(thisCard) : "Both your deck and your hand are empty"
          }
        };
      case PROFESSOR_ROWAN_123:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nChoose 1 card in your hand and shuffle the rest of your cards into your deck. Then, draw 4 cards. (If this is the only card in your hand, you can’t play this card.)"
          onPlay {
            CardList noshfl = []
            noshfl.add(thisCard)
            noshfl.add(my.hand.getExcludedList(thisCard).select("Choose 1 card in your hand").first())
            my.hand.getExcludedList(noshfl).moveTo(hidden:true, my.deck)
            shuffleDeck()
            draw 4
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard) : "You have no other cards in your hand"
          }
        };
      case RIVAL_124:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nReveal the top 5 cards of your deck. Your opponent chooses 3 of those cards. Put those cards into your hand and put other 2 cards on top of your deck. Shuffle your deck afterward."
          onPlay {
            def top = my.deck.subList(0,5)
            def cards = top.showToMe("Top 5 cards of your deck").oppSelect("Choose 3 cards for your opponent to draw").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "Your deck is empty"
          }
        };
      case ROSEANNE_S_RESEARCH_125:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck for up to 2 in any combination of Basic Pokémon and basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
          onPlay {
            my.deck.search(max: 2,"Search your deck for up to 2 in any combination of Basic Pokémon and basic Energy cards",{it.cardTypes.is(BASIC_ENERGY) || it.cardTypes.is(BASIC)}).showToOpponent("Selected Cards").moveTo(hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "Your deck is empty!"
          }
        };
      case TEAM_GALACTIC_S_MARS_126:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDraw 2 cards. Then, choose a card from your opponent’s hand without looking and put it on the bottom of his or her deck."
          onPlay {
            draw 2
            opp.hand.shuffledCopy().select(hidden: true, "Choose a card from your opponent's hand without looking").moveTo(hidden: true, opp.deck)
          }
          playRequirement{
            assert my.deck || opp.hand : "Your deck and your opponent's hand are both empty"
          }
        };
      case POTION_127:
        return copy (FireRedLeafGreen.POTION_101, this)
      case SWITCH_128:
        return copy(FireRedLeafGreen.SWITCH_102, this);
      case DARKNESS_ENERGY_129:
        return copy (MysteriousTreasures.DARKNESS_ENERGY_119, this);
      case METAL_ENERGY_130:
        return copy (RubySapphire.METAL_ENERGY_94, this);
      case GARDEVOIR_LV_X_131:
        return levelUp (this, from:"Gardevoir", hp:HP130, type:PSYCHIC, retreatCost:2) {
          weakness P
          pokePower "Teleportation", {
            text "Once during your turn , choose 1 of your Active Pokémon or 1 or your Benched Pokémon and switch Gardevoir with that Pokémon. This power can’t be used if Gardevoir is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert my.bench : "Your bench is empty"
              powerUsed()
              if (self.active) {
                sw self, my.bench.select()
              } else {
                sw my.active, self
              }
            }
          }
          move "Bring Down", {
            text "Choose 1 Pokémon (your or your opponent’s) with the fewest remaining HP (excluding Gardevoir) and that Pokémon is now Knocked Out."
            energyCost P, P
            onAttack {
              def list = all.findAll{it!=self}.sort(false) {p1,p2 -> p1.remainingHP.value <=> p2.remainingHP.value}
              def tar = new PcsList()
              int min = list.get(0).remainingHP.value
              while(list.get(0).remainingHP.value==min){
                tar.add(list.remove(0))
              }
              new Knockout(tar.select("Knock Out")).run(bg)
            }
          }
        };
      case HONCHKROW_LV_X_132:
        return levelUp (this, from:"Honchkrow", hp:HP110, type:DARKNESS, retreatCost:0) {
          weakness L, PLUS30
          resistance F, MINUS20
          move "Feint Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost C, C
            onAttack {
              swiftDamage(40, opp.all.select())
            }
          }
          move "Darkness Wing", {
            text "60 damage. If the Defending Pokémon would be Knocked Out by damage from this attack, you may search your discard pile for any 1 card, show it to your opponent, and put it into your hand."
            energyCost D, D, C
            onAttack {
              delayed {
                def pcs = defending
                after KNOCKOUT, pcs {
                  my.discard.select("Search your discard pile for a card").showToOpponent("Selected Cards").moveTo(my.hand)
                }
                unregisterAfter 1
              }
              damage 60
            }
          }
        };
      default:
        return null;
    }
  }

}
