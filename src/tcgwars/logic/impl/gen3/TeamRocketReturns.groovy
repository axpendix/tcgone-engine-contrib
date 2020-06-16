package tcgwars.logic.impl.gen3;

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
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*
import tcgwars.logic.effect.*
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.special.*;

/**
 * @author axpendix@hotmail.com
 */
public enum TeamRocketReturns implements LogicCardInfo {

  AZUMARILL_1 ("Azumarill", 1, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DARK_AMPHAROS_2 ("Dark Ampharos", 2, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_CROBAT_3 ("Dark Crobat", 3, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_ELECTRODE_4 ("Dark Electrode", 4, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_HOUNDOOM_5 ("Dark Houndoom", 5, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_HYPNO_6 ("Dark Hypno", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_MAROWAK_7 ("Dark Marowak", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_OCTILLERY_8 ("Dark Octillery", 8, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_SLOWKING_9 ("Dark Slowking", 9, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_STEELIX_10 ("Dark Steelix", 10, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  JUMPLUFF_11 ("Jumpluff", 11, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  KINGDRA_12 ("Kingdra", 12, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  PILOSWINE_13 ("Piloswine", 13, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  TOGETIC_14 ("Togetic", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DARK_DRAGONITE_15 ("Dark Dragonite", 15, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_MUK_16 ("Dark Muk", 16, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_RATICATE_17 ("Dark Raticate", 17, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_SANDSLASH_18 ("Dark Sandslash", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_TYRANITAR_19 ("Dark Tyranitar", 19, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_TYRANITAR_20 ("Dark Tyranitar", 20, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  DELIBIRD_21 ("Delibird", 21, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  FURRET_22 ("Furret", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  LEDIAN_23 ("Ledian", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  MAGBY_24 ("Magby", 24, Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  MISDREAVUS_25 ("Misdreavus", 25, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  QUAGSIRE_26 ("Quagsire", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  QWILFISH_27 ("Qwilfish", 27, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  YANMA_28 ("Yanma", 28, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  DARK_ARBOK_29 ("Dark Arbok", 29, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_ARIADOS_30 ("Dark Ariados", 30, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_DRAGONAIR_31 ("Dark Dragonair", 31, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_DRAGONAIR_32 ("Dark Dragonair", 32, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_FLAAFFY_33 ("Dark Flaaffy", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_GOLBAT_34 ("Dark Golbat", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_GOLDUCK_35 ("Dark Golduck", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_GYARADOS_36 ("Dark Gyarados", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_HOUNDOOM_37 ("Dark Houndoom", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_MAGCARGO_38 ("Dark Magcargo", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_MAGNETON_39 ("Dark Magneton", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_PUPITAR_40 ("Dark Pupitar", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_PUPITAR_41 ("Dark Pupitar", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  DARK_WEEZING_42 ("Dark Weezing", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  HERACROSS_43 ("Heracross", 43, Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAGMAR_44 ("Magmar", 44, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  MANTINE_45 ("Mantine", 45, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  ROCKET_S_MEOWTH_46 ("Rocket's Meowth", 46, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _DARKNESS_]),
  ROCKET_S_WOBBUFFET_47 ("Rocket's Wobbuffet", 47, Rarity.UNCOMMON, [BASIC, POKEMON, OWNERS_POKEMON, _DARKNESS_]),
  SEADRA_48 ("Seadra", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SKIPLOOM_49 ("Skiploom", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  TOGEPI_50 ("Togepi", 50, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  CUBONE_51 ("Cubone", 51, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  DRATINI_52 ("Dratini", 52, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  DRATINI_53 ("Dratini", 53, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  DROWZEE_54 ("Drowzee", 54, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  EKANS_55 ("Ekans", 55, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GRIMER_56 ("Grimer", 56, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  HOPPIP_57 ("Hoppip", 57, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  HORSEA_58 ("Horsea", 58, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  HOUNDOUR_59 ("Houndour", 59, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  HOUNDOUR_60 ("Houndour", 60, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  KOFFING_61 ("Koffing", 61, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  LARVITAR_62 ("Larvitar", 62, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  LARVITAR_63 ("Larvitar", 63, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  LEDYBA_64 ("Ledyba", 64, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  MAGIKARP_65 ("Magikarp", 65, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAGNEMITE_66 ("Magnemite", 66, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MAREEP_67 ("Mareep", 67, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MARILL_68 ("Marill", 68, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  ONIX_69 ("Onix", 69, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  PSYDUCK_70 ("Psyduck", 70, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  RATTATA_71 ("Rattata", 71, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  RATTATA_72 ("Rattata", 72, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  REMORAID_73 ("Remoraid", 73, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SANDSHREW_74 ("Sandshrew", 74, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SENTRET_75 ("Sentret", 75, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SLOWPOKE_76 ("Slowpoke", 76, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  SLUGMA_77 ("Slugma", 77, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  SPINARAK_78 ("Spinarak", 78, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SWINUB_79 ("Swinub", 79, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  VOLTORB_80 ("Voltorb", 80, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  WOOPER_81 ("Wooper", 81, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  ZUBAT_82 ("Zubat", 82, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  COPYCAT_83 ("Copycat", 83, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POKEMON_RETRIEVER_84 ("Pokémon Retriever", 84, Rarity.UNCOMMON, [TRAINER]),
  POW__HAND_EXTENSION_85 ("Pow! Hand Extension", 85, Rarity.UNCOMMON, [TRAINER]),
  ROCKET_S_ADMIN__86 ("Rocket's Admin.", 86, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ROCKET_S_HIDEOUT_87 ("Rocket's Hideout", 87, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  ROCKET_S_MISSION_88 ("Rocket's Mission", 88, Rarity.UNCOMMON, [TRAINER]),
  ROCKET_S_POKE_BALL_89 ("Rocket's Poké Ball", 89, Rarity.UNCOMMON, [TRAINER]),
  ROCKET_S_TRICKY_GYM_90 ("Rocket's Tricky Gym", 90, Rarity.UNCOMMON, [STADIUM, TRAINER]),
  SURPRISE__TIME_MACHINE_91 ("Surprise! Time Machine", 91, Rarity.UNCOMMON, [TRAINER]),
  SWOOP__TELEPORTER_92 ("Swoop! Teleporter", 92, Rarity.UNCOMMON, [TRAINER]),
  VENTURE_BOMB_93 ("Venture Bomb", 93, Rarity.UNCOMMON, [TRAINER]),
  DARK_METAL_ENERGY_94 ("Dark Metal Energy", 94, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  R_ENERGY_95 ("R Energy", 95, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  ROCKET_S_ARTICUNO_EX_96 ("Rocket's Articuno ex", 96, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _DARKNESS_, EX]),
  ROCKET_S_ENTEI_EX_97 ("Rocket's Entei ex", 97, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _DARKNESS_, EX]),
  ROCKET_S_HITMONCHAN_EX_98 ("Rocket's Hitmonchan ex", 98, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _DARKNESS_, EX]),
  ROCKET_S_MEWTWO_EX_99 ("Rocket's Mewtwo ex", 99, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _DARKNESS_, EX]),
  ROCKET_S_MOLTRES_EX_100 ("Rocket's Moltres ex", 100, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _DARKNESS_, EX]),
  ROCKET_S_SCIZOR_EX_101 ("Rocket's Scizor ex", 101, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, OWNERS_POKEMON, _DARKNESS_, EX]),
  ROCKET_S_SCYTHER_EX_102 ("Rocket's Scyther ex", 102, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _DARKNESS_, EX]),
  ROCKET_S_SNEASEL_EX_103 ("Rocket's Sneasel ex", 103, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _DARKNESS_, EX]),
  ROCKET_S_SNORLAX_EX_104 ("Rocket's Snorlax ex", 104, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _DARKNESS_, EX]),
  ROCKET_S_SUICUNE_EX_105 ("Rocket's Suicune ex", 105, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _DARKNESS_, EX]),
  ROCKET_S_ZAPDOS_EX_106 ("Rocket's Zapdos ex", 106, Rarity.HOLORARE, [BASIC, POKEMON, OWNERS_POKEMON, _DARKNESS_, EX]),
  MUDKIP_STAR_107 ("Mudkip Star", 107, Rarity.ULTRARARE, [BASIC, POKEMON, _WATER_]),
  TORCHIC_STAR_108 ("Torchic Star", 108, Rarity.ULTRARARE, [BASIC, POKEMON, _FIRE_]),
  TREECKO_STAR_109 ("Treecko Star", 109, Rarity.ULTRARARE, [BASIC, POKEMON, _GRASS_]),
  CHARMELEON_110 ("Charmeleon", 110, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  HERE_COMES_TEAM_ROCKET__111 ("Here Comes Team Rocket!", 111, Rarity.HOLORARE, [TRAINER]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  TeamRocketReturns(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.TEAM_ROCKET_RETURNS;
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
      case AZUMARILL_1:
        return evolution (this, from:"Marill", hp:HP080, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          pokePower "Froth", {
            text "Once during your turn, when you play Azumarill from your hand to evolve 1 of your Active Pokémon, you may use this power. Each Defending Pokémon is now Paralyzed."
            onActivate {r->
              if(r==PLAY_FROM_HAND && self.active) {
                if(confirm("Use Froth? The defending Pokémon will be paralyzed.")) {
                  apply PARALYZED, self.owner.opposite.pbg.active
                }
              }
            }
          }
          move "Water Punch", {
            text "20+ damage. Flip a coin for each [W] Energy attached to Azumarill. This attack does 20 damage plus 20 more damage for each heads."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
              flip self.cards.energyCount(W), {damage 20}
            }
          }

        };
      case DARK_AMPHAROS_2:
        return evolution (this, from:"Dark Flaaffy", hp:HP120, type:[DARKNESS, LIGHTNING], retreatCost:2) {
          weakness FIGHTING
          pokeBody "Darkest Impulse", {
            text "As long as Dark Ampharos is in play, whenever your opponent plays an Evolution card from his or her hand to evolve 1 of his or her Pokémon, put 2 damage counters on that Pokémon. You can’t use more than 1 Darkest Impulse Poké-Body each turn."
            delayedA {
              def flag = false
              before EVOLVE, {
                flag = (ef.evolutionCard as Card).player.pbg.hand.contains(ef.evolutionCard)
              }
              after EVOLVE, { 
                if (flag) {
                  PokemonCardSet pcs = ef.pokemonToBeEvolved
                  if(pcs.owner != self.owner && bg.em().retrieveObject("Darkest Impulse") != (pcs.id+bg.turnCount)){
                    powerUsed()
                    bg.em().storeObject("Darkest Impulse", pcs.id+bg.turnCount)
                    directDamage(20, pcs, SRC_ABILITY)
                  }
                }
              }
            }
          }
          move "Ram", {
            text "30 damage"
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Shock Bolt", {
            text "70 damage. Discard all [L] Energy attached to Dark Ampharos."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 70
              discardAllSelfEnergy(L)
            }
          }
        };
      case DARK_CROBAT_3:
        return evolution (this, from:"Dark Golbat", hp:HP090, type:[DARKNESS, GRASS], retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokePower "Black Beam", {
            text "Once during your turn (before your attack), if Dark Crobat is your Active Pokémon, you may choose 1 of the Defending Pokémon. That Pokémon is now Poisoned. This power can’t be used if Dark Crobat is affected by a Special Condition."
            actionA {
              assert !(self.specialConditions) : "Dark Crobat is affected by a Special Condition"
              assert self.active : "Dark Crobat is not your active"
              checkLastTurn()
              powerUsed()
              apply POISONED, self.owner.opposite.pbg.active
            }
          }
          move "Dark Drain", {
            text "Does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) Remove from Dark Crobat a number of damage counters equal to the number of your opponent’s Pokémon in play."
            energyCost G, C
            attackRequirement {}
            onAttack {
              opp.all.each{
                damage 10, it
              }
              heal 10*opp.all.size(),self
            }
          }
          move "Skill Dive", {
            text "Does 30 damage to 1 of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 30, opp.all.select()
            }
          }

        };
      case DARK_ELECTRODE_4:
        return evolution (this, from:"Voltorb", hp:HP070, type:[DARKNESS, LIGHTNING], retreatCost:1) {
          weakness FIGHTING
          pokePower "Darkness Navigation", {
            text "Once during your turn (before your attack), if Dark Electrode has no Energy attached to it, you may search your deck for a [D] or Dark Metal Energy and attach it to Dark Electrode. Shuffle your deck afterward. This power can’t be used if Dark Electrode is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert !(self.cards.energyCount(C)) : "$self has Energies attached to it"
              checkLastTurn()
              powerUsed()
              my.deck.search("Search your deck for a [D] or Dark Metal Energy",{it.cardTypes.energy && (it.containsTypePlain(D) || (it.name == 'Dark Metal Energy'))}).each{attachEnergy(self, it)}
              shuffleDeck()
            }
          }
          move "Energy Bomb", {
            text "30 damage. You may move all Energy cards attached to Dark Electrode to your Benched Pokémon in any way you like."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {
                if(my.bench){
                  if(confirm("move all Energy cards attached to Dark Electrode to your Benched Pokémon in any way you like?")){
                    self.cards.filterByType(ENERGY).each{
                      energySwitch(self, my.bench.select("move $it to?"),it)
                    }
                  }
                }
              }
            }
          }

        };
      case DARK_HOUNDOOM_5:
        return evolution (this, from:"Houndour", hp:HP070, type:[DARKNESS, FIRE], retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Shakedown", {
            text "20 damage. Choose a card from your opponent’s hand without looking and discard it."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 20
              if(opp.hand){
                opp.hand.select(hidden: true, "Select random card from opponent's hand").showToOpponent("Card to be discarded").discard()
              }
            }
          }
          move "Dark Fire", {
            text "40+ damage. You may discard a [R] Energy or [D] Energy attached to Dark Houndoom. If you do, this attack does 40 damage plus 20 more damage."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 40
              if(confirm("discard a [R] Energy or [D] Energy attached to Dark Houndoom for 20 more damage?")){
                self.cards.filterByType(BASIC_ENERGY).findAll{it.asEnergyCard().containsTypePlain(D) || it.asEnergyCard().containsTypePlain(R)}.select().discard()
                damage 20
              }
            }
          }

        };
      case DARK_HYPNO_6:
        return evolution (this, from:"Drowzee", hp:HP070, type:[DARKNESS, PSYCHIC], retreatCost:1) {
          weakness PSYCHIC
          move "Dark Link", {
            text "Flip a coin. If heads, choose an attack on 1 of your Pokémon in play that has Dark in its name (excluding this one). Dark Link copies that attack except for its Energy cost. (You must still do anything else required for that attack.) (No matter what type that Pokémon is, Dark Hypno’s type is still .) Dark Hypno performs that attack."
            energyCost C
            attackRequirement {
              assert my.bench.find {it.name.contains("Dark") && it.topPokemonCard.moves} : "No moves to perform"
            }
            onAttack {
              flip {
                def moveList = []
                def labelList = []
                my.bench.each {pcs->
                  if(pcs.name.contains("Dark")){
                    moveList.addAll(pcs.topPokemonCard.moves);
                    labelList.addAll(pcs.topPokemonCard.moves.collect{pcs.name+"-"+it.name})
                  }
                }
                def move=choose(moveList, labelList)
                def bef=blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
                attack (move as Move)
                bef.unregisterItself(bg().em())
              }
            }
          }
          move "Black Magic", {
            text "20× damage. Does 20 damage times the number of your opponent’s Benched Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20*opp.bench.size()
            }
          }

        };
      case DARK_MAROWAK_7:
        return evolution (this, from:"Cubone", hp:HP070, type:[DARKNESS, FIGHTING], retreatCost:1) {
          weakness GRASS
          move "Brick Smash", {
            text "30 damage. This attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              swiftDamage(30, defending)
            }
          }
          move "Hard Bone", {
            text "70 damage. Discard a Basic Pokémon or Evolution card from your hand or this attack does nothing."
            energyCost F, F, C
            attackRequirement {
              assert my.hand.findAll{it.cardTypes.is(BASIC) || it.cardTypes.is(STAGE1) || it.cardTypes.is(STAGE2) }
            }
            onAttack {
              damage 70
              my.hand.filterByType(BASIC,STAGE1,STAGE2).select("Select one card to discard.").discard()
            }
          }

        };
      case DARK_OCTILLERY_8:
        return evolution (this, from:"Remoraid", hp:HP070, type:[DARKNESS, WATER], retreatCost:1) {
          weakness LIGHTNING
          move "Black Suction Cups", {
            text "Does 10 damage to each Defending Pokémon. Flip a coin. If heads, each Defending Pokémon is now Paralyzed."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              flipThenApplySC PARALYZED
            }
          }
          move "Ink Blast", {
            text "30+ damage. Does 30 damage plus 10 more damage for each Energy attached to Dark Octillery but not used to pay for this attack’s Energy cost. You can’t add more than 20 damage in this way."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              extraEnergyDamage(2,hp(10),C,thisMove)
            }
          }

        };
      case DARK_SLOWKING_9:
        return evolution (this, from:"Slowpoke", hp:HP080, type:[DARKNESS, PSYCHIC], retreatCost:1) {
          weakness GRASS
          pokePower "Cunning", {
            text "Once during your turn (before your attack), you may look at the top card of your opponent’s deck. Then, you may shuffle his or her deck. This power can’t be used if Dark Slowking is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert opp.deck
              checkLastTurn()
              powerUsed()
              opp.deck.subList(0,1).showToMe("Opponent's top Deck")
              if(confirm("Shuffle opponent's deck?")) shuffleDeck(null, TargetPlayer.OPPONENT)
            }
          }
          move "Litter", {
            text "20+ damage. You may discard a combination of up to 2 Pokémon Tool cards and Rocket’s Secret Machine cards from your hand. If you do, this attack does 20 damage plus 30 more damage for each card you discarded."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
              //TODO : rocket secret machine
              if(my.hand.filterByType(POKEMON_TOOL)){
                damage 30*my.hand.filterByType(POKEMON_TOOL).select(min:0, max :2,"Select up to 2 Pokémon Tool cards and Rocket’s Secret Machine cards from your hand to discard them. This attack does 30 more damage for each card you discarded.").discard().size()
              }
            }
          }
        };
      case DARK_STEELIX_10:
        return evolution (this, from:"Onix", hp:HP110, type:[DARKNESS, METAL], retreatCost:4) {
          weakness FIRE
          resistance GRASS, MINUS30
          move "Energy Link", {
            text "20 damage. Search your discard pile for an Energy card and attach it to Dark Steelix."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              attachEnergyFrom(my.discard,self)
            }
          }
          move "Heavy Impact", {
            text "60 damage."
            energyCost F, C, C, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }

        };
      case JUMPLUFF_11:
        return evolution (this, from:"Skiploom", hp:HP090, type:GRASS, retreatCost:0) {
          weakness FIRE
          resistance WATER, MINUS30
          pokeBody "Buffer", {
            text "If Jumpluff would be Knocked Out by an opponent’s attack, flip a coin. If heads, Jumpluff is not Knocked Out and its remaining HP becomes 10 instead."
            delayedA {
              before KNOCKOUT, self, {
                if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite){
                  flip "Buffer", {
                    self.damage = self.fullHP - hp(10)
                    bc "Buffer saved $self!"
                    prevent()
                  }
                }
              }
            }
          }
          move "Energy Crush", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to all of your opponent’s Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              opp.all.each{
                damage 10*it.cards.energyCount(C)
              }
            }
          }

        };
      case KINGDRA_12:
        return evolution (this, from:"Seadra", hp:HP120, type:WATER, retreatCost:2) {
          weakness LIGHTNING
          pokeBody "Dragon Veil", {
            text "As long as Kingdra is in play, each of your Active Pokémon has no Weakness."
            getterA (GET_WEAKNESSES) { h->
              if(h.effect.target.owner == self.owner && h.effect.target.active) {
                def list = h.object as List<Weakness>
                list.clear()
              }
            }
          }
          move "Hyper Whirlpool", {
            text "20 damage. Flip a coin until you get tails. For each heads, discard an Energy card attached to the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flipUntilTails {
                discardDefendingEnergy()
              }
            }
          }
          move "Aqua Sonic", {
            text "50 damage. This attack’s damage is not affected by Resistance."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 50
              dontApplyResistance()
            }
          }

        };
      case PILOSWINE_13:
        return evolution (this, from:"Swinub", hp:HP100, type:FIGHTING, retreatCost:2) {
          weakness GRASS
          move "Sheer Cold", {
            text "20 damage. Flip a coin. If heads, each Defending Pokémon can’t attack during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip{cantAttackNextTurn defending}
            }
          }
          move "Tonnage", {
            text "60+ damage. You may do 60 damage plus 40 more damage. If you do, Piloswine does 30 damage to itself."
            energyCost F, F, C, C
            attackRequirement {}
            onAttack {
              damage 60
              if(confirm("Do 30 damage to Piloswine for 40 more damage")){
                damage 40
                damage 30, self
              }
            }
          }

        };
      case TOGETIC_14:
        return evolution (this, from:"Togepi", hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokeBody "Holy Shield", {
            text "Prevent all effects of attacks, including damage, done to Togetic by your opponent’s Pokémon that has Dark in its name."
            delayedA {
              before null, self, Source.ATTACK, {
                if (self.owner.opposite.pbg.active.name.contains("Dark") && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                  bc "Holy Shield prevents effect"
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && it.notNoEffect && self.owner.opposite.pbg.active.name.contains("Dark")){
                    it.dmg = hp(0)
                    bc "Holy Shield prevents damage"
                  }
                }
              }
              after ENERGY_SWITCH, {
                def efs = (ef as EnergySwitch)
                if(self.owner.opposite.pbg.active.name.contains("Dark") && efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
                  discard efs.card
                }
              }
            }
          }
          move "Dive", {
            text "30 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Rainbow Moves", {
            text "Choose 1 of your opponent’s Benched Pokémon’s attacks. Rainbow Moves copies that attack except for its Energy cost. (You must still do anything else required for that attack.) (No matter what type that Pokémon is, Togetic’s type is still [C].) Togetic performs that attack."
            energyCost C, C, C
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              def moveList = []
              def labelList = []
              opp.bench.each {pcs->
                moveList.addAll(pcs.topPokemonCard.moves);
                labelList.addAll(pcs.topPokemonCard.moves.collect{pcs.name+"-"+it.name})
              }
              def move=choose(moveList, labelList)
              def bef=blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
              attack (move as Move)
              bef.unregisterItself(bg().em())
            }
          }

        };
      case DARK_DRAGONITE_15:
        return evolution (this, from:"Dark Dragonair", hp:HP120, type:DARKNESS, retreatCost:2) {
          weakness COLORLESS
          resistance GRASS
          resistance FIGHTING
          pokePower "Dark Trance", {
            text "As often as you like during your turn (before your attack), you may move a [D] Energy card attached to 1 of your Pokémon to another of your Pokémon. This power can’t be used if Dark Dragonite is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert my.all.findAll {it.cards.energyCount(D)>0}
              assert my.all.size()>=2

              powerUsed()
              def src=my.all.findAll {it.cards.energyCount(D)>0}.select("Source for [G]")
              def card=src.cards.filterByEnergyType(D).select("Card to move").first()
              def tar=my.all
              tar.remove(src)
              tar=tar.select("Target for [D]")
              energySwitch(src, tar, card)
            }
          }
          move "Double Wing Attack", {
            text "Does 30 damage to each Defending Pokémon."
            energyCost W, L
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Claw Swipe", {
            text "50 damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case DARK_MUK_16:
        return evolution (this, from:"Grimer", hp:HP070, type:[DARKNESS, GRASS], retreatCost:1) {
          weakness PSYCHIC
          pokeBody "Sticky Goo", {
            text "As long as Dark Muk is your Active Pokémon, your opponent pays [C][C] more to retreat his or her Active Pokémon."
            getterA (GET_RETREAT_COST) { h->
              if(h.effect.target.owner == self.owner.opposite && self.active) {
                h.object += 2
              }
            }
          }
          move "Slimy Water", {
            text "10× damage. Does 10 damage times the number of [C] Energy in the Defending Pokémon’s Retreat Cost (after applying effects to the Retreat Cost)."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10*defending.retreatCost
            }
          }
          move "Acidic Poison", {
            text "10 damage. The Defending Pokémon is now Burned and Poisoned."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage{
                apply BURNED
                apply POISONED
              }
            }
          }

        };
      case DARK_RATICATE_17:
        return evolution (this, from:"Rattata", hp:HP070, type:DARKNESS, retreatCost:0) {
          weakness FIGHTING
          move "Dark Seed", {
            text "The Defending Pokémon can’t retreat during your opponent’s next turn. Put 5 damage counters on the Defending Pokémon at the end of your opponent’s next turn."
            energyCost D
            attackRequirement {}
            onAttack {
              cantRetreat defending
              delayed{
                before BETWEEN_TURNS, {
                  if(bg.currentTurn == self.owner.opposite){
                    directDamage 50, self.owner.opposite.pbg.active
                  }
                }
                unregisterAfter 2
              }
            }
          }
          move "Spread Poison", {
            text "10 damage. The Defending Pokémon is now Poisoned. This attack does 20 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              if(opp.bench) damage 20, opp.bench.select()
              applyAfterDamage POISONED
            }
          }

        };
      case DARK_SANDSLASH_18:
        return evolution (this, from:"Sandshrew", hp:HP070, type:[DARKNESS, FIGHTING], retreatCost:0) {
          weakness GRASS
          pokeBody "Poison Payback", {
            text "If Dark Sandslash is your Active Pokémon and is damaged by an opponent’s attack (even if Dark Sandslash is Knocked Out), the Attacking Pokémon is now Poisoned."
            delayedA (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if(self.active && bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
                  bc "Poison Payback"
                  apply POISONED, (ef.attacker as PokemonCardSet)
                }
              }
            }
          }
          move "Swift", {
            text "50 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              swiftDamage(50,defending)
            }
          }

        };
      case DARK_TYRANITAR_19:
        return evolution (this, from:"Dark Pupitar", hp:HP120, type:DARKNESS, retreatCost:2) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Grind", {
            text "10+ damage. Does 10 damage plus 10 more damage for each Energy attached to Dark Tyranitar."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10+10*self.cards.energyCount(C)
            }
          }
          move "Spinning Tail", {
            text "Does 20 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost D, C, C
            attackRequirement {}
            onAttack {
              opp.all.each{
                damage 20, it
              }
            }
          }
          move "Bite Off", {
            text "70+ damage. If the Defending Pokémon is Pokémon-ex, this attack does 70 damage plus 50 more damage."
            energyCost D, D, C, C, C
            attackRequirement {}
            onAttack {
              damage 70
              if(defending.EX) damage 50
            }
          }

        };
      case DARK_TYRANITAR_20:
        return evolution (this, from:"Dark Pupitar", hp:HP120, type:[DARKNESS, FIGHTING], retreatCost:3) {
          weakness GRASS
          pokeBody "Sand Damage", {
            text "As long as Dark Tyranitar is your Active Pokémon, put 1 damage counter on each of your opponent’s Benched Basic Pokémon between turns. You can’t use more than 1 Sand Damage Poké-Body between turns."
            delayedA {
              before BETWEEN_TURNS, {
                if (self.active) {
                  self.owner.opposite.pbg.bench.each{
                    bc "$it / ${!it.evolution}"
                    if(!it.evolution) directDamage 10, it, SRC_ABILITY
                  }
                }
              }
            }
          }
          move "Second Strike", {
            text "50+ damage. If the Defending Pokémon already has at least 2 damage counters on it, this attack does 50 damage plus 20 more damage."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 50
              if(opp.active.numberOfDamageCounters >= 2) damage 20
            }
          }

        };
      case DELIBIRD_21:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness METAL
          pokePower "Gift Exchange", {
            text "Once during your turn (before your attack), if Delibird is your Active Pokémon, you may shuffle 1 card from your hand into your deck. Then, draw a card. This power can’t be used if Delibird is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert my.hand
              assert self.active : "$self is not your active Pokémon."
              checkLastTurn()
              powerUsed()
              my.hand.select("select card to shuffle into your deck").moveTo(my.deck)
              shuffleDeck()
              draw 1
            }
          }
          move "Souvenir", {
            text "Flip 3 coins. If 1 of them is heads, put 4 damage counters on the Defending Pokémon. If 2 of them are heads, remove 1 damage counter from the Defending Pokémon. If all of them are heads, put 10 damage counters on the Defending Pokémon. If all of them are tails, remove all damage counters from the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 3,{},{},[0:{heal opp.active.damage.value, opp.active},1:{directDamage 40, opp.active},2:{heal 10, opp.active},3:{directDamage 100, opp.active}]

            }
          }

        };
      case FURRET_22:
        return evolution (this, from:"Sentret", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Quick Change", {
            text "Choose up to 3 cards in your hand and put them on top of your deck. Then, search your deck for that many cards and put them into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              def drawNb = my.hand.select(max:3,"select 3 card to put at the top of your deck").moveTo(my.deck).size()
              shuffleDeck()
              my.deck.search(min : drawNb,max : drawNb,"Select $drawNb card(s).",{true}).moveTo(my.hand)
            }
          }
          move "Quick Tail Smash", {
            text "30 damage. Before doing damage, you may flip a coin. If heads, this attack does 80 damage instead. If tails, this attack does nothing."
            energyCost C, C
            attackRequirement {}
            onAttack {
              if(confirm("flip a coin instead of doing 30 damage. If heads do 80 but if tail this attack does nothing.")){
                flip {damage 80}
              }
              else{
                damage 30
              }
            }
          }

        };
      case LEDIAN_23:
        return evolution (this, from:"Ledyba", hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          pokeBody "Powder Protection", {
            text "Any damage done to Ledian by attacks from Pokémon that has an owner in its name is reduced by 40."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to == self && it.notNoEffect && it.dmg.value && it.from.topPokemonCard.cardTypes.is(OWNERS_POKEMON)) {
                    bc "Powder Protection -40"
                    it.dmg -= hp(40)
                  }
                }
              }
            }
          }
          move "Split Spiral Punch", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC CONFUSED
            }
          }
          move "Tackle", {
            text "50 damage."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case MAGBY_24:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness WATER
          pokePower "Baby Evolution", {
            text "Once during your turn (before your attack), you may put Magmar from your hand onto Magby (this counts as evolving Magby), and remove all damage counters from Magby."
            actionA {
              checkCanBabyEvolve("Magmar", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Magmar", self)
            }
          }
          move "Detour", {
            text "If you have a Supporter card in play, use the effect on that card as the effect of this attack."
            energyCost C
            attackRequirement {}
            onAttack {
              //TODO : use card effect as move
            }
          }

        };
      case MISDREAVUS_25:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness DARKNESS
          resistance FIGHTING, MINUS30
          pokePower "Dark Spell", {
            text "Once during your turn (before your attack), if Misdreavus is your Active Pokémon, you may flip a coin. If heads, put 1 damage counter on 1 of your opponent’s Pokémon. This power can’t be used if Misdreavus is affected by a Special Condition or if your other Active Pokémon is not Misdreavus."
            actionA {
              checkNoSPC()
              assert self.active : "$self is not your active Pokémon."
              checkLastTurn()
              powerUsed()
              flip {
                directDamage 10, opp.all.select()
              }
            }
          }
          move "Hide in Shadows", {
            text "20 damage. Switch Misdreavus with 1 of your Benched Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
              if(my.bench) sw self, my.bench.select()
            }
          }

        };
      case QUAGSIRE_26:
        return evolution (this, from:"Wooper", hp:HP080, type:WATER, retreatCost:2) {
          weakness GRASS
          pokeBody "Saturation", {
            text "When you attach a [W] Energy card from your hand to Quagsire, remove all Special Conditions and 2 damage counters from Quagsire."
            delayedA {
              before ATTACH_ENERGY, self, {
                if(ef.reason==PLAY_FROM_HAND && ef.card instanceof BasicEnergyCard && ef.card.basicType == W){
                  clearSpecialCondition(self,Source.SRC_ABILITY)
                  heal 20, self
                }
              }
            }
          }
          move "Hyper Pump", {
            text "20+ damage. Does 20 damage plus 20 more damage for each basic Energy card attached to Quagsire but not used to pay for this attack’s Energy cost. You can’t add more than 60 damage in this way."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 20
              extraEnergyDamage(3,hp(20),W,thisMove)
            }
          }

        };
      case QWILFISH_27:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          pokeBody "Spiny", {
            text "If Qwilfish is your Active Pokémon and is damaged by an opponent’s attack (even if Qwilfish is Knocked Out), flip a coin until you get tails. For each heads, put 1 damage counter on the Attacking Pokémon."
            delayedA (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if (self.active) {
                  def pcs = self.owner.opposite.pbg.active
                  def counterDmg = 0
                  bg.dm().each{
                    if(it.to == self && it.notNoEffect && it.dmg.value) {
                      bc "Spiny"
                      pcs = it.from
                      flipUntilTails {counterDmg += 10}
                    }
                  }
                  directDamage counterDmg, pcs
                }
              }
            }
          }
          move "Stun Poison", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and Poisoned."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage{
                flip {
                  apply PARALYZED
                  apply POISONED
                }
              }
            }
          }

        };
      case YANMA_28:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Quick Charge", {
            text "Search your deck for up to 4 different types of basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              my.deck.select(min:0, max:4, "Select up to 4 different types of basic Energy cards", cardTypeFilter(BASIC_ENERGY), self.owner,
                {
                  CardList list->
                    for(Type t1:Type.values()){
                      if(list.findAll{it.asEnergyCard().containsTypePlain(t1)}.size() >= 2){
                        return false
                      }
                    }
                    return true
                }).showToOpponent("Selected Energy cards.").moveTo(my.hand)
            }
          }
          move "Swift", {
            text "20 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              swiftDamage(20,defending)
            }
          }

        };
      case DARK_ARBOK_29:
        return evolution (this, from:"Ekans", hp:HP090, type:[DARKNESS, GRASS], retreatCost:1) {
          weakness PSYCHIC
          move "Swallow Up", {
            text "10+ damage. Before doing damage, count the remaining HP of the Defending Pokémon and Dark Arbok. If the Defending Pokémon has fewer remaining HP than Dark Arbok’s, this attack does 10 damage plus 30 more damage."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              if(defending.getRemainingHP() < self.getRemainingHP()) damage 30
            }
          }
          move "Extra Poison", {
            text "30 damage. If the Defending Pokémon is Pokémon-ex, the Defending Pokémon is now Asleep and Poisoned."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              if (defending.EX) {
                apply ASLEEP
                apply POISONED
              }
            }
          }

        };
      case DARK_ARIADOS_30:
        return evolution (this, from:"Spinarak", hp:HP070, type:[DARKNESS, GRASS], retreatCost:1) {
          weakness FIRE
          move "Super Poison Breath", {
            text "Each Defending Pokémon is now Poisoned."
            energyCost C
            attackRequirement {}
            onAttack {
              apply POISONED
            }
          }
          move "Breaking Impact", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage for each [C] Energy in that Pokémon’s Retreat Cost (after applying effects to the Retreat Cost). (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              def pcs = opp.all.select("Select the pokemon to attack.")
              damage 20*pcs.retreatCost, pcs
            }
          }

        };
      case DARK_DRAGONAIR_31:
        return evolution (this, from:"Dratini", hp:HP070, type:DARKNESS, retreatCost:1) {
          weakness COLORLESS
          resistance GRASS
          resistance FIGHTING
          pokePower "Evolutionary Light", {
            text "Once during your turn (before your attack), if Dark Dragonair is your Active Pokémon, you may search your deck for an Evolution card. Show it to your opponent and put it into your hand. Shuffle your deck afterward. This power can’t be used if Dark Dragonair is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert self.active : "$self is not your active"
              powerUsed()
              my.deck.search(max : 1,"Search for an evolution",cardTypeFilter(EVOLUTION)).showToOpponent("Selected card.").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Dragon Rage", {
            text "30 damage."
            energyCost W, L
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case DARK_DRAGONAIR_32:
        return evolution (this, from:"Dratini", hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness COLORLESS
          resistance GRASS
          resistance FIGHTING
          move "Double Tackle", {
            text "Does 20 damage to each Defending Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Crushing Blow", {
            text "40 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip {
                discardDefendingEnergy()
              }
            }
          }

        };
      case DARK_FLAAFFY_33:
        return evolution (this, from:"Mareep", hp:HP080, type:[DARKNESS, LIGHTNING], retreatCost:1) {
          weakness FIGHTING
          move "Thunder Slash", {
            text "10 damage. If the Defending Pokémon is a Basic Pokémon, the Defending Pokémon is now Paralyzed. Dark Flaaffy can’t use Thunder Slash during your next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              if(!defending.evolution) applyAfterDamage PARALYZED
              cantUseAttack thisMove, self
            }
          }
          move "Headbutt", {
            text "20 damage."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case DARK_GOLBAT_34:
        return evolution (this, from:"Zubat", hp:HP070, type:[DARKNESS, GRASS], retreatCost:0) {
          weakness PSYCHIC
          move "Night Ambush", {
            text "Does 30 damage to 1 of your opponent’s Pokémon. Dark Golbat can’t attack during your next turn. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost G
            attackRequirement {}
            onAttack {
              damage 30, opp.all.select()
              cantAttackNextTurn self
            }
          }

        };
      case DARK_GOLDUCK_35:
        return evolution (this, from:"Psyduck", hp:HP070, type:[DARKNESS, WATER], retreatCost:1) {
          weakness LIGHTNING
          move "Darkness Shield", {
            text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to each of your Active Pokémon during your opponent’s next turn."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
              flip{preventAllEffectsNextTurn()}
            }
          }
          move "Cold Crush", {
            text "40 damage. You may discard an Energy card attached to Dark Golduck. If you do, discard an Energy attached to the Defending Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 40
              if(confirm("discard an Energy card attached to Dark Golduck. If you do, discard an Energy attached to the Defending Pokémon")){
                discardSelfEnergy C
                discardDefendingEnergy()
              }
            }
          }

        };
      case DARK_GYARADOS_36:
        return evolution (this, from:"Magikarp", hp:HP080, type:[DARKNESS, WATER], retreatCost:2) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokeBody "Dark Scale", {
            text "If Dark Gyarados is your Active Pokémon and is Knocked Out by an opponent’s attack, put 3 damage counters on the Attacking Pokémon."
            delayedA {
              before KNOCKOUT, self, {
                if((ef as Knockout).byDamageFromAttack){
                  directDamage 30,bg.currentTurn.pbg.active
                }
              }
            }
          }
          move "Sharp Fang", {
            text "30 damage."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Dark Streak", {
            text "40 damage. Flip a coin. If heads, each Defending Pokémon is now Paralyzed."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flipThenApplySC PARALYZED
            }
          }

        };
      case DARK_HOUNDOOM_37:
        return evolution (this, from:"Houndour", hp:HP070, type:[DARKNESS, FIRE], retreatCost:1) {
          weakness WATER
          pokePower "Fire Breath", {
            text "Once during your turn (before your attack), if Dark Houndoom is your Active Pokémon, you may flip a coin. If heads, the Defending Pokémon (choose 1 if there are 2) is now Burned. This power can’t be used if Dark Houndoom is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              powerUsed()
              flip{apply BURNED}
            }
          }
          move "Fire Payback", {
            text "40+ damage. If you have less Benched Pokémon than your opponent, this attack does 40 damage plus 20 more damage."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 40
              if(my.bench.size() < opp.bench.size()) damage 20
            }
          }

        };
      case DARK_MAGCARGO_38:
        return evolution (this, from:"Slugma", hp:HP080, type:[DARKNESS, FIRE], retreatCost:2) {
          weakness WATER
          move "Energy Press", {
            text "10+ damage. Does 10 damage plus 10 more damage for each basic Energy card attached to all of your Active Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10+10*self.cards.filterByType(BASIC_ENERGY).size()
            }
          }
          move "Linear Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 40, opp.all.select()
            }
          }

        };
      case DARK_MAGNETON_39:
        return evolution (this, from:"Magnemite", hp:HP070, type:[DARKNESS, LIGHTNING], retreatCost:1) {
          weakness FIGHTING
          move "Magnetic Lines", {
            text "20 damage. If your opponent has at least 2 Pokémon in play, move a basic Energy card attached to the Defending Pokémon to another of your opponent’s Pokémon."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
              if(opp.bench) moveEnergy(basic : true, defending, opp.bench)
            }
          }
          move "Poison Pulse", {
            text "40 damage. The Defending Pokémon is now Poisoned."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 40
              applyAfterDamage POISONED
            }
          }

        };
      case DARK_PUPITAR_40:
        return evolution (this, from:"Larvitar", hp:HP070, type:[DARKNESS, FIGHTING], retreatCost:1) {
          weakness GRASS
          move "Explosive Evolution", {
            text "Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance.) Then, search your deck for a card that evolves from Dark Pupitar and put it on Dark Pupitar. (This counts as evolving Dark Pupitar.) Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              flip{
                opp.all.each{
                  damage 10, it
                }
                if(my.deck){
                  def tar = my.deck.search(max:1,"Search for a card that evolves from Dark Pupitar",{it.cardTypes.is(EVOLUTION) && self.name == it.predecessor})
                  if(tar) evolve(self, tar.first(), OTHER)
                  shuffleDeck()
                }
              }
            }
          }
          move "Double Tackle", {
            text "Does 20 damage to each Defending Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case DARK_PUPITAR_41:
        return evolution (this, from:"Larvitar", hp:HP080, type:[DARKNESS, FIGHTING], retreatCost:2) {
          weakness GRASS
          move "Dark Streak", {
            text "20 damage. Flip a coin. If heads, each Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC PARALYZED
            }
          }
          move "Rock Tumble", {
            text "40 damage. This attack’s damage is not affected by Resistance."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 40
              dontApplyResistance()
            }
          }

        };
      case DARK_WEEZING_42:
        return evolution (this, from:"Koffing", hp:HP080, type:[DARKNESS, GRASS], retreatCost:2) {
          weakness PSYCHIC
          pokeBody "Methane Leak", {
            text "As long as Dark Weezing is your Active Pokémon, put 1 damage counter on each Pokémon that remains Poisoned between turns."
            delayedA {
              before BEGIN_TURN, {
                if(self.active){
                  if(my.active.isSPC(POISONED)) directDamage 10, my.active
                  if(opp.active.isSPC(POISONED)) directDamage 10, opp.active
                }
              }
            }
          }
          move "Smog", {
            text "The Defending Pokémon is now Poisoned."
            energyCost C
            attackRequirement {}
            onAttack {
              apply POISONED
            }
          }
          move "Darkness Charge", {
            text "50 damage. Put 2 damage counters on Dark Weezing."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 50
              directDamage 20, self
            }
          }

        };
      case HERACROSS_43:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          pokeBody "Crust", {
            text "Any damage done to Heracross by attacks from your opponent’s Basic Pokémon is reduced by 20 (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to == self && !it.from.evolution && it.notNoEffect && it.dmg.value) {
                    bc "Crust -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
          move "Get Even", {
            text "20+ damage. If you have more Prize cards left than your opponent, this attack does 20 damage plus 10 more damage for each Prize card more than your opponent."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
              if(my.prizeCardSet.size() > opp.prizeCardSet.size()) damage 10*(my.prizeCardSet.size() - opp.prizeCardSet.size())
            }
          }

        };
      case MAGMAR_44:
        return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Dump and Draw", {
            text "Discard up to 2 Energy cards from your hand. Then, draw 2 cards for each Energy card you discarded."
            energyCost C
            attackRequirement {
              assert my.hand.filterByType(ENERGY)
            }
            onAttack {
              def dscNB = my.hand.filterByType(ENERGY).select(max : 2, "Select the energy to discard").discard().size()
              draw 2*dscNB
            }
          }
          move "Flame Tail", {
            text "40 damage."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }

        };
      case MANTINE_45:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          pokePower "Ripples", {
            text "Once during your turn (before your attack), you may remove 1 damage counter from 1 of your Pokémon (excluding Mantine). This power can’t be used if Mantine is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.all.findAll{it.numberOfDamageCounters && it != self} : "There is no Pokémon with damage counter outside from ${self}."
              powerUsed()
              heal 10, my.all.findAll{it.numberOfDamageCounters && it != self}.select("Select the pokemon to heal.")
            }
          }
          move "Aqua Slash", {
            text "30 damage. Mantine can’t attack during your next turn."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
              cantAttackNextTurn self
            }
          }

        };
      case ROCKET_S_MEOWTH_46:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          move "Snatch and Run", {
            text "Search your deck for a Pokémon Tool card or Rocket’s Secret Machine card, show it to your opponent, and put it into your hand. If you do, you may switch Rocket’s Meowth with 1 of your Benched Pokémon. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              if(my.deck.search(max : 1,"Select a Pokémon Tool card or Rocket’s Secret Machine.",cardTypeFilter(POKEMON_TOOL)).showToOpponent("Selected card.").moveTo(my.hand)){
                if(my.bench){
                  if(confirm("switch $self ?")) sw self, my.bench.select()
                }
              }
            }
          }
          move "Miraculous Comeback", {
            text "10× damage. Flip a coin for each Pokémon in play (both yours and your opponent’s). This attack does 10 damage times the number of heads. Rocket’s Meowth does 10 damage times the number of tails to itself."
            energyCost C, C
            attackRequirement {}
            onAttack {
              def flipCnt = my.all.size() + opp.all.size()
              flip flipCnt, {damage 10}, {damage 10, self}
            }
          }

        };
      case ROCKET_S_WOBBUFFET_47:
        return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
          weakness PSYCHIC
          move "Dark Aid", {
            text "Search your discard pile for Pokémon Tool cards and Rocket’s Secret Machine cards. You may show either 1 Pokémon Tool card or Rocket’s Secret Machine card to your opponent and put it into your hand, or show a combination of 3 Pokémon Tool cards or Rocket’s Secret Machine cards to your opponent and shuffle them into your deck."
            energyCost C
            attackRequirement {
              assert my.discard.filterByType(POKEMON_TOOL)
            }
            onAttack {
              if(my.discard.filterByType(POKEMON_TOOL).size() < 3){
                my.discard.filterByType(POKEMON_TOOL).select(count : 1,"Select 1 Pokémon Tool card or Rocket’s Secret Machine").showToOpponent("Selected card.").moveTo(my.hand)
              }
              else{
                def choice = choose([0,1],["Select 1 card : put it in your hand","Select 3 cards : shuffle them in your deck"],"What do you want to do?")
                if(choice){
                  my.discard.filterByType(POKEMON_TOOL).select(count : 3,"Select a combination of 3 Pokémon Tool card and Rocket’s Secret Machine").showToOpponent("Selected cards.").moveTo(my.deck)
                  shuffleDeck()
                }
                else{
                  my.discard.filterByType(POKEMON_TOOL).select(count : 1,"Select 1 Pokémon Tool card or Rocket’s Secret Machine").showToOpponent("Selected card.").moveTo(my.hand)
                }
              }
            }
          }
          move "Amnesia", {
            text "10 damage. Choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 10
              amnesia delegate
            }
          }

        };
      case SEADRA_48:
        return evolution (this, from:"Horsea", hp:HP070, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Confuse Ray", {
            text "10 damage. The Defending Pokémon is now Confused."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage CONFUSED
            }
          }
          move "Aqua Trick", {
            text "30 damage. Move 1 Energy card attached to the Defending Pokémon to 1 of your opponent’s Benched Pokémon. If your opponent has no Benched Pokémon, this effect does nothing."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 30
              if(opp.bench) moveEnergy(defending,opp.bench.select())
            }
          }

        };
      case SKIPLOOM_49:
        return evolution (this, from:"Hoppip", hp:HP060, type:GRASS, retreatCost:0) {
          weakness FIRE
          resistance WATER, MINUS30
          pokeBody "Buffer", {
            text "If Skiploom would be Knocked Out by an opponent’s attack, flip a coin. If heads, Skiploom is not Knocked Out and its remaining HP becomes 10 instead."
            delayedA {
              before KNOCKOUT, self, {
                if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite){
                  flip "Buffer", {
                    self.damage = self.fullHP - hp(10)
                    bc "Buffer saved $self!"
                    prevent()
                  }
                }
              }
            }
          }
          move "Miracle Powder", {
            text "10 damage. Flip a coin. If heads, choose 1 Special Condition. The Defending Pokémon is now affected by that Special Condition."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                applyAfterDamage choose([POISONED,ASLEEP,CONFUSED,BURNED,PARALYZED],"Choose 1 Special Condition to apply to the defending pokemon")
              }
            }
          }

        };
      case TOGEPI_50:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Yawn", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Mini-Metronome", {
            text "Flip a coin. If heads, choose 1 of the Defending Pokémon’s attacks. Mini-Metronome copies that attack except for its Energy cost. (You must still do anything else required for that attack.) (No matter what type that Pokémon is, Togepi’s type is still [C].) Togepi performs that attack."
            energyCost C, C
            attackRequirement {}
            onAttack {
              def moveList = []
              def labelList = []

              moveList.addAll(defending.topPokemonCard.moves);
              labelList.addAll(defending.topPokemonCard.moves.collect{it.name})

              def move=choose(moveList, labelList, "Which move do you want to use")
              def bef=blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
              attack (move as Move)
              bef.unregisterItself(bg().em())
            }
          }

        };
      case CUBONE_51:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Look for Friends", {
            text "Reveal cards from your deck until you reveal a Basic Pokémon. Show that card to your opponent and put it into your hand. Shuffle the other revealed cards into your deck. (If you don’t reveal a Basic Pokémon, shuffle all the revealed cards back into your deck.)"
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def revealCard = new CardList();
              def ind = 0
              def curCard
              while(ind < my.deck.size()){
                curCard = my.deck.get(ind)
                ind+=1
                revealCard.add(curCard)
                if(curCard.cardTypes.is(BASIC))
                  break
              }
              revealCard.showToMe("Drawn cards")
              revealCard.showToOpponent("revealed cards")
              revealCard.clear()
              revealCard.add(curCard)
              revealCard.moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Bonemerang", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost F
            attackRequirement {}
            onAttack {
              flip 2, {damage 10}
            }
          }

        };
      case DRATINI_52:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          move "Pound", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case DRATINI_53:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness COLORLESS
          resistance GRASS
          resistance FIGHTING
          move "Dragon Song", {
            text "Each Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Tail Strike", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost W, L
            attackRequirement {}
            onAttack {
              damage 20
              flip {damage 10}
            }
          }

        };
      case DROWZEE_54:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokePower "Insomnia", {
            text "Drowzee can’t be Asleep."
            delayedA {
              after APPLY_SPECIAL_CONDITION, {
                if(self.active){
                  if(self.isSPC(ASLEEP)){
                    bc "Insomnia prevents $self from being Asleep."
                    clearSpecialCondition(self, SRC_ABILITY, [ASLEEP])
                  }
                }
              }
            }
          }
          move "Soothing Wave", {
            text "10 damage. Flip a coin. If heads, each Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flipThenApplySC ASLEEP
            }
          }

        };
      case EKANS_55:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Tail Wrap", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              flip{apply PARALYZED}
            }
          }

        };
      case GRIMER_56:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Taunt", {
            text "Choose 1 of your opponent’s Benched Pokémon and switch it with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
            energyCost C
            attackRequirement {
              assert opp.bench : "There is no Pokémon on your opponent’s bench."
            }
            onAttack {
              sw opp.active, opp.bench.select()
            }
          }
          move "Spit Poison", {
            text "10 damage. The Defending Pokémon is now Poisoned."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              apply POISONED
            }
          }

        };
      case HOPPIP_57:
        return basic (this, hp:HP030, type:GRASS, retreatCost:1) {
          weakness FIRE
          resistance WATER, MINUS30
          pokeBody "Buffer", {
            text "If Hoppip would be Knocked Out by an opponent’s attack, flip a coin. If heads, Hoppip is not Knocked Out and its remaining HP becomes 10 instead."
            delayedA {
              before KNOCKOUT, self, {
                if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite){
                  flip "Buffer", {
                    self.damage = self.fullHP - hp(10)
                    bc "Buffer saved $self!"
                    prevent()
                  }
                }
              }
            }
          }
          move "Miracle Powder", {
            text "Flip a coin. If heads, choose 1 Special Condition. The Defending Pokémon is now affected by that Special Condition."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                applyAfterDamage choose([POISONED,ASLEEP,CONFUSED,BURNED,PARALYZED],"Choose 1 Special Condition to apply to the defending pokemon")
              }
            }
          }

        };
      case HORSEA_58:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Water Plant", {
            text "Search your discard pile for up to 2 [W] Energy cards, show them to your opponent, and put them into your hand."
            energyCost C
            attackRequirement {
              assert my.discard.filterByType(BASIC_ENERGY).filterByEnergyType(W)
            }
            onAttack {
              my.discard.filterByType(BASIC_ENERGY).filterByEnergyType(W).select(max : 2,).showToOpponent("Selected cards").moveTo(my.hand)
            }
          }
          move "Swift", {
            text "30 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost W, W
            attackRequirement {}
            onAttack {
              swiftDamage(30,defending)
            }
          }

        };
      case HOUNDOUR_59:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Rear Kick", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Smokescreen", {
            text "20 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 20
              sandAttack(thisMove)
            }
          }

        };
      case HOUNDOUR_60:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness WATER
          pokeBody "Dark Lift", {
            text "If Houndour has any [D] Energy attached to it, the Retreat Cost for Houndour is 0."
            getterA (GET_RETREAT_COST,BEFORE_LAST ,self) {h->
              if(self.cards.energyCount(D)) {
                h.object = 0
              }
            }
          }
          move "Firebreathing", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 10
              flip {damage 10}
            }
          }

        };
      case KOFFING_61:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          pokeBody "Knockout Gas", {
            text "If Koffing is your Active Pokémon and is Knocked Out by an opponent’s attack, the Attacking Pokémon is now Confused and Poisoned."
            delayedA {
              before KNOCKOUT, self, {
                if((ef as Knockout).byDamageFromAttack){
                  apply CONFUSED, self.owner.opposite.pbg.active
                  apply POISONED, self.owner.opposite.pbg.active
                }
              }
            }
          }
          move "Gnaw", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case LARVITAR_62:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Fury Attack", {
            text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost F
            attackRequirement {}
            onAttack {
              flip 3, {damage 10}
            }
          }

        };
      case LARVITAR_63:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Light Punch", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Dig Drain", {
            text "20 damage. Remove 1 damage counter from Larvitar."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
              heal 10, self
            }
          }

        };
      case LEDYBA_64:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Call for Family", {
            text "Search your deck for a [G] Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              my.deck.search (count: 1,{it.cardTypes.is(BASIC) && it.asPokemonCard().types.contains(G)}).each {
                my.deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Beat", {
            text "20 damage."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case MAGIKARP_65:
        return basic (this, hp:HP030, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Call for Friends", {
            text "Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
            energyCost W
            attackRequirement {
              assert deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              int count = bench.freeBenchCount>=2?2:1
              deck.search (max: count, cardTypeFilter(BASIC)).each {
                deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
        };
      case MAGNEMITE_66:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Sonicboom", {
            text "10 damage. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost C
            attackRequirement {}
            onAttack {
              noWrDamage(10,defending)
            }
          }

        };
      case MAREEP_67:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Minor Errand-Running", {
            text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search(max : 1, "Select a basic Energy card.",cardTypeFilter(BASIC_ENERGY)).showToOpponent("Selected card.").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 10
              flip {damage 10}
            }
          }

        };
      case MARILL_68:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Minor Errand-Running", {
            text "Search your deck for up to 2 basic Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search(max : 2, "Select 2 basic Energy cards.",cardTypeFilter(BASIC_ENERGY)).showToOpponent("Selected card.").moveTo(my.hand)
              shuffleDeck()
            }
          }

        };
      case ONIX_69:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:3) {
          weakness WATER
          move "Horn Rush", {
            text "10 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {damage 10}
            }
          }
          move "Granite Head", {
            text "20 damage. During your opponent’s next turn, any damage done to Onix by attacks is reduced by 10 (after applying Weakness and Resistance)."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
              reduceDamageNextTurn(hp(10),thisMove)
            }
          }

        };
      case PSYDUCK_70:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Gentle Slap", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Headache", {
            text "Flip a coin. If heads, your opponent can’t play a Trainer card from his or her hand until the end of your opponent’s next turn."
            energyCost W
            attackRequirement {}
            onAttack {
              flip{
                delayed{
                  before PLAY_TRAINER, {
                    if (bg.currentTurn == self.owner.opposite) {
                      wcu "Psyduck's Headache prevents playing this card!"
                      prevent()
                    }
                  }
                  unregisterAfter 2
                }
              }
            }
          }
        };
      case RATTATA_71:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          pokeBody "Scramble", {
            text "As long as your opponent has any Pokémon-ex as his or her Active Pokémon, the Retreat Cost for Rattata is 0."
            getterA (GET_RETREAT_COST,BEFORE_LAST ,self) {h->
              if(self.owner.opposite.pbg.active.pokemonEX){
                h.object = 0
              }
            }
          }
          move "Fury Swipes", {
            text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 3, {damage 10}
            }
          }

        };
      case RATTATA_72:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(basic:true, 1, delegate)
          }
          move "Snarl", {
            text "Flip a coin. If heads, this attack does 10 damage to the Defending Pokémon. If tails, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 1, {damage 10},{apply PARALYZED}
            }
          }

        };
      case REMORAID_73:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Energy Draw", {
            text "Flip a coin. If heads, search your deck for a basic Energy card and attach it to Remoraid. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              flip{attachEnergyFrom(basic : true, my.deck, self)}
            }
          }
          move "Razor Fin", {
            text "10 damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case SANDSHREW_74:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Rear Kick", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Swift", {
            text "20 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              swiftDamage 20, defending
            }
          }

        };
      case SENTRET_75:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          move "Friend Search", {
            text "Look at the top 5 cards of your deck. Choose a Basic Pokémon or Evolution card you find there, show it to your opponent, and put it into your hand. Put the other 4 cards back on top of your deck. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.subList(0,Math.min(my.deck.size(),5)).showToMe("The top 5 cards of your deck.")
              if(my.deck.subList(0,Math.min(my.deck.size(),5)).filterByType(BASIC,STAGE1,STAGE2)) my.deck.subList(0,Math.min(my.deck.size(),5)).filterByType(BASIC,STAGE1,STAGE2).select().showToOpponent("selectedCard").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Surprise Attack", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {damage 20}
            }
          }

        };
      case SLOWPOKE_76:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokeBody "Dense", {
            text "Any damage done to Slowpoke by attacks from your opponent’s Evolved Pokémon is reduced by 10 (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to == self && it.from.evolution && it.notNoEffect && it.dmg.value) {
                    bc "Dense -10"
                    it.dmg -= hp(10)
                  }
                }
              }
            }
          }

          move "Bite", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case SLUGMA_77:
        return basic (this, hp:HP050, type:FIRE, retreatCost:2) {
          weakness WATER
          move "Singe", {
            text "Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost R
            attackRequirement {}
            onAttack {
              flip {apply BURNED}
            }
          }
          move "Heat Tackle", {
            text "30 damage. Slugma does 10 damage to itself."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              damage 10, self
            }
          }

        };
      case SPINARAK_78:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Rising Lunge", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              flip {damage 10}
            }
          }

        };
      case SWINUB_79:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          move "Tackle", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Rest", {
            text "Remove all Special Conditions and all damage counters from Swinub. Swinub is now Asleep."
            energyCost C, C
            attackRequirement {}
            onAttack {
              heal self.damage.value, self
              clearSpecialCondition(self,Source.ATTACK)
              afterDamage{
                apply ASLEEP, self
              }
            }
          }

        };
      case VOLTORB_80:
        return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Psycho Waves", {
            text "Discard an Energy card attached to Voltorb. The Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {
              assert self.cards.energyCount(C) : "Voltorb don't have energies to discard."
            }
            onAttack {
              discardSelfEnergy(C)
              apply CONFUSED
            }
          }
          move "Thunder Wave", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flipThenApplySC PARALYZED
            }
          }

        };
      case WOOPER_81:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness GRASS
          pokeBody "Saturation", {
            text "When you attach a [W] Energy card from your hand to Wooper, remove all Special Conditions and 1 damage counter from Wooper."
            delayedA {
              before ATTACH_ENERGY, self, {
                if(ef.reason==PLAY_FROM_HAND && ef.card instanceof BasicEnergyCard && ef.card.basicType == W){
                  clearSpecialCondition(self,Source.SRC_ABILITY)
                  heal 10, self
                }
              }
            }
          }
          move "Wave Splash", {
            text "10 damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case ZUBAT_82:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Dark Streak", {
            text "Flip a coin. If heads, each Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {apply PARALYZED}
            }
          }
          move "Ambush", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              flip {damage 10}
            }
          }

        };
      case COPYCAT_83:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nShuffle your hand into your deck. Then, count the number of cards in your opponent’s hand and draw that many cards."
          onPlay {
            my.hand.getExcludedList(thisCard).moveTo(hidden:true,my.deck)
            shuffleDeck()
            draw opp.hand.size()
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard) || my.deck
          }
        };
      case POKEMON_RETRIEVER_84:
        return basicTrainer (this) {
          text "Search your discard pile for Basic Pokémon and Evolution cards. You may either show 1 Basic Pokémon or Evolution card to your opponent and put it into your hand, or show a combination of 3 Basic Pokémon or Evolution cards to your opponent and shuffle them into your deck."
          onPlay {
            def choice = choose([0,1],["Select 1 card : put it in your hand","Select 3 cards : shuffle them in your deck"],"What do you want to do?")
            if(choice){
              my.discard.filterByType(BASIC, EVOLUTION).select(count : 3,"Select a combination of 3 Basic Pokémon or Evolution cards.").showToOpponent("Selected cards.").moveTo(my.deck)
              shuffleDeck()
            }
            else{
              my.discard.filterByType(BASIC, EVOLUTION).select(count : 1,"Select 1 Basic Pokémon or Evolution").showToOpponent("Selected card.").moveTo(my.hand)
            }
          }
          playRequirement{
            assert my.discard.filterByType(BASIC, EVOLUTION)
          }
        };
      case POW__HAND_EXTENSION_85:
        return basicTrainer (this) {
          text "You may use this card only if you have more Prize cards left than your opponent.\nMove 1 Energy card attached to the Defending Pokémon to another of your opponent’s Pokémon. Or, switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
          onPlay {
            if(opp.bench){
              def choice = 1
              if(opp.active.cards.energyCount(C)){
                choice = choose([0,1],["Move 1 Energy card attached to the Defending Pokémon to another of your opponent’s Pokémon","Switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon"])
              }
              if(choice){
                sw opp.active, opp.bench.select(), TRAINER_CARD
              }else{
                moveEnergy(basic: false, opp.active, opp.bench.select("Select the pokemon getting the Energy"), TRAINER_CARD)
              }
            }
          }
          playRequirement{
            assert my.prizeCardSet.size() > opp.prizeCardSet.size() : "You need more Prize cards left than your opponent to use this card"
            assert opp.bench : "Your opponent has no Benched Pokémon"
          }
        };
      case ROCKET_S_ADMIN__86:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nEach player shuffles his or her hand into his or her deck. Then, each player counts his or her Prize cards left and draws up to that many cards. (You draw your cards first.)"
          onPlay {
            my.hand.getExcludedList(thisCard).moveTo(hidden:true, my.deck)
            opp.hand.getExcludedList(thisCard).moveTo(hidden:true, opp.deck)
            shuffleDeck()
            shuffleDeck(null,TargetPlayer.OPPONENT)
            draw choose(1..my.prizeCardSet.size(),"How many cards would you like to draw?")
            draw(oppChoose(1..opp.prizeCardSet.size(),"How many cards would you like to draw?"),TargetPlayer.OPPONENT)
          }
          playRequirement{
          }
        };
      case ROCKET_S_HIDEOUT_87:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play.\nEach Pokémon in play with Dark or Rocket’s in its name (both yours and your opponent’s) gets +20 HP."
          def eff
          onPlay {
            eff = getter GET_FULL_HP, {h->
              if(h.effect.target.topPokemonCard.name.contains("Dark ") || h.effect.target.topPokemonCard.name.contains("Rocket's ")) {
                h.object += hp(20)
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case ROCKET_S_MISSION_88:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDiscard a card from your hand. Then, draw 3 cards. If you discarded a Pokémon that has Dark or Rocket’s in its name, draw 4 cards instead."
          onPlay {
            def tar = my.hand.getExcludedList(thisCard).select("Select a card to discard (If you discard a Pokémon that has Dark or Rocket’s in its name you will draw 1 more card.)")
            tar.discard()
            bc "${tar.first().name} / ${tar.first().name.contains('Rocket')}"
            if(tar.first().cardTypes.is(POKEMON) &&  (tar.first().name.contains("Dark ") || tar.first().name.contains("Rocket's ")))
            {
              draw 4
            }
            else{
              draw 3
            }
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard)
          }
        };
      case ROCKET_S_POKE_BALL_89:
        return basicTrainer (this) {
          text "Search your deck for a Pokémon that has Dark in its name, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          onPlay {
            my.deck.search(max:1,"Select a Pokémon with Dark in its name",{it.cardTypes.is(POKEMON) && it.name.contains("Dark")}).showToOpponent("Selected card.").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck
          }
        };
      case ROCKET_S_TRICKY_GYM_90:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play." +
          "Each Pokémon with Dark or Rocket’s in its name (both yours and your opponent’s) can use attacks on this card instead of its own." +
          "[C] Feint Attack: Does 20 damage to 1 of your opponent’s Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
        def eff
        onPlay {
          def moveBody = {
            text "Does 20 damage to 1 of your opponent’s Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost C
            onAttack {
              swiftDamage(20, opp.all.select())
            }
          }
          Move move=new Move("Feint Attack")
          moveBody.delegate=new MoveBuilder(thisMove:move)
          moveBody.call()
          eff = getter GET_MOVE_LIST, {h->
            def pcs = h.effect.target
            if (pcs.topPokemonCard.name.contains("Dark ") || pcs.topPokemonCard.name.contains("Rocket's ")) { h.object.add(move) }
          }
        }
        onRemoveFromPlay{
          eff.unregister()
        }
        };
      case SURPRISE__TIME_MACHINE_91:
        return basicTrainer (this) {
          text "Choose 1 of your Evolved Pokémon, remove the highest Stage Evolution card from it, and shuffle it into your deck (this counts as devolving that Pokémon). If that Pokémon remains in play, search your deck for an Evolution card that evolves from that Pokémon and put it onto that Pokémon (this counts as evolving that Pokémon). Shuffle your deck afterward."
          onPlay {
            def pcs = my.all.findAll{it.evolution}.select("Select the Pokémon to devolve.")
            if(pcs.evolution) {
              targeted (pcs, SRC_ABILITY) {
                def top=pcs.topPokemonCard
                bc "$top Devolved"
                moveCard(top, my.deck)
                devolve(pcs, top)
                shuffleDeck()
                checkFaint()
                if(pcs) {
                  def tar = my.deck.search(max:1,"Search for an Evolution card that evolves from that Pokémon",{it.cardTypes.is(EVOLUTION) && it.predecessor==pcs.name})
                  if(tar) {
                    evolve(pcs,tar.first(),OTHER)
                  }
                }
              }
            }
          }
          playRequirement{
            assert my.all.findAll{it.evolution}
          }
        };
      case SWOOP__TELEPORTER_92:
        return basicTrainer (this) {
          text "Search your deck for a Basic Pokémon (excluding Pokémon-ex) and switch it with 1 of your Basic Pokémon (excluding Pokémon-ex) in play. (Any cards attached to that Pokémon, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Place the first Basic Pokémon in the discard pile. Shuffle your deck afterward."
          onPlay {
            def pcs = my.all.findAll{it.topPokemonCard.cardTypes.is(BASIC) && it.topPokemonCard.cardTypes.isNot(EX)}.select()
            def tpc = pcs.topPokemonCard
            def selected = my.deck.search(max:1,"Select a Basic Pokémon (excluding Pokémon-ex)",{it.cardTypes.is(BASIC) && it.cardTypes.isNot(EX)})
            if (selected) {
              selected.moveTo(pcs.cards)
              discard tpc
              new CheckAbilities().run(bg)
            }
          }
          playRequirement{
            assert my.all.findAll {it.topPokemonCard.cardTypes.is(BASIC) && it.topPokemonCard.cardTypes.isNot(EX)} : "No basic in play"
          }
        };
      case VENTURE_BOMB_93:
        return basicTrainer (this) {
          text "Flip a coin. If heads, put 1 damage counter on 1 of your opponent’s Pokémon. If tails, put 1 damage counter on 1 of your Pokémon."
          onPlay {
            flip 1,{
              directDamage(10, opp.active,TRAINER_CARD)
            },
              {
                directDamage(10, my.active,TRAINER_CARD)
              }
          }
          playRequirement{
          }
        };
      case DARK_METAL_ENERGY_94:
        return specialEnergy (this, [[]]) {
          text "Attach Dark Metal Energy to 1 of your Pokémon. While in play, Dark Metal Energy provides [D] Energy and [M] Energy, but provides only 1 Energy at a time. (Doesn’t count as a basic Energy card when not in play and has no effect other than providing Energy.)"
          // TODO: Request appropriate typeImageOverride be added
          onPlay {reason->
          }
          onRemoveFromPlay {
          }
          getEnergyTypesOverride {
            return [[D,M] as Set]
          }
        };
      case R_ENERGY_95:
        return specialEnergy (this, [[]]) {
          text "R Energy can be attached only to a Pokémon that have Dark or Rocket’s in its name. While in play, R Energy provides 2 [D] Energy. (Doesn’t count as a basic Energy card.) If the Pokémon R Energy is attached to attacks, the attack does 10 more damage to the Active Pokémon (before applying Weakness and Resistance). When your turn ends, discard R Energy."
          def eff
          def check = {
            if(!(it.name.contains("Dark ") || it.name.contains("Rocket's "))){discard thisCard}
          }
          onPlay {reason->
            eff = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if(it.from == self && it.to.active && it.notNoEffect && it.dmg.value){
                    bc "R Energy +10"
                    it.dmg += hp(10)
                  }
                }
              }
              before BETWEEN_TURNS, {
                discard thisCard
              }
              after EVOLVE, self, {check(self)} //some pokemon evolve into different type
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
          onMove {to->
            check(to)
          }
          allowAttach {to->
            to.name.contains("Dark ") || to.name.contains("Rocket's ")
          }
          getEnergyTypesOverride {
            return [[D] as Set, [D] as Set]
          }
        };
      case ROCKET_S_ARTICUNO_EX_96:
        return basic (this, hp:HP100, type:DARKNESS, retreatCost:1) {
          weakness METAL
          pokeBody "Darkness Veil", {
            text "As long as Rocket’s Articuno ex has any [D] Energy attached to it, prevent all effects, except damage, by an opponent’s attack done to Rocket’s Articuno ex."
            delayedA {
              before null, self, Source.ATTACK, {
                if(bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && !(ef instanceof ApplyDamages) && self.cards.energyCount(D)){
                  bc "Darkness Veil prevents effect"
                  prevent()
                }
              }
            }
          }
          move "Freeze Solid", {
            text "10 damage. Search your discard pile for a [W] Energy card and attach it to Rocket’s Articuno ex."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              if(my.discard.filterByType(BASIC_ENERGY).filterByEnergyType(W)) attachEnergyFrom(type:W,my.discard,self)
            }
          }
          move "Ice Wing", {
            text "50 damage."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case ROCKET_S_ENTEI_EX_97:
        return basic (this, hp:HP100, type:DARKNESS, retreatCost:1) {
          weakness WATER
          pokeBody "Dark Condition", {
            text "As long as Rocket’s Entei ex has any [D] Energy attached to it, Rocket’s Entei ex has no Weakness."
            getterA (GET_WEAKNESSES) { h->
              if(h.effect.target == self && self.cards.energyCount(D)) {
                def list = h.object as List<Weakness>
                list.clear()
              }
            }
          }
          move "Energy Link", {
            text "10 damage. Search your discard pile for an Energy card and attach it to Rocket’s Entei ex."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              if(my.discard.filterByType(ENERGY)) attachEnergyFrom(my.discard,self)
            }
          }
          move "Volcanic Ash", {
            text "Discard 2 Energy attached to Rocket’s Entei ex and then choose 1 of your opponent’s Pokémon. This attack does 60 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              discardSelfEnergy C,C
              damage 60, opp.all.select()
            }
          }

        };
      case ROCKET_S_HITMONCHAN_EX_98:
        return basic (this, hp:HP100, type:DARKNESS, retreatCost:1) {
          weakness PSYCHIC
          pokeBody "Strikes Back", {
            text "If Rocket’s Hitmonchan ex is your Active Pokémon and is damaged by an opponent’s attack (even if Rocket’s Hitmonchan ex is Knocked Out), put 2 damage counters on the Attacking Pokémon."
            delayedA (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if(self.active && bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
                  bc "$self Strikes Back!"
                  directDamage 20, (ef.attacker as PokemonCardSet)
                }
              }
            }
          }
          move "Mach Punch", {
            text "10 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F
            attackRequirement {}
            onAttack {
              damage 10
              if(opp.bench) damage 10, opp.bench.select()
            }
          }
          move "Magnum Punch", {
            text "60 damage."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }

        };
      case ROCKET_S_MEWTWO_EX_99:
        return basic (this, hp:HP100, type:DARKNESS, retreatCost:2) {
          weakness PSYCHIC
          move "Darkness Switch", {
            text "Discard an Energy card attached to Rocket’s Mewtwo ex, and then switch all damage counters on Rocket’s Mewtwo ex with those on the Defending Pokémon. (If an effect of this attack is prevented, this attack does nothing.)"
            energyCost P
            attackRequirement {}
            onAttack {
              discardSelfEnergy(C)
              targeted (defending) {
                def oldDamage = defending.damage
                defending.damage = self.damage
                self.damage = oldDamage
              }
            }
          }
          move "Hypnoblast", {
            text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flipThenApplySC ASLEEP
            }
          }
          move "Psyburn", {
            text "70 damage."
            energyCost P, C, C, C
            attackRequirement {}
            onAttack {
              damage 70
            }
          }

        };
      case ROCKET_S_MOLTRES_EX_100:
        return basic (this, hp:HP100, type:DARKNESS, retreatCost:2) {
          weakness WATER
          pokeBody "Dark Lift", {
            text "If Rocket’s Moltres ex has any [D] Energy attached to it, the Retreat Cost for Rocket’s Moltres ex is 0."
            getterA (GET_RETREAT_COST, BEFORE_LAST,self) {h->
              if(self.cards.energyCount(D)) {
                h.object = 0
              }
            }
          }
          move "Fire Dance", {
            text "30 damage. Search your discard pile for a [R] Energy card and attach it to 1 of your Pokémon."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 30
              attachEnergyFrom(type : R, my.discard,my.all)
            }
          }
          move "Combustion", {
            text "50 damage."
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case ROCKET_S_SCIZOR_EX_101:
        return evolution (this, from:"Rocket's Scyther Ex", hp:HP120, type:DARKNESS, retreatCost:1) {
          weakness FIRE
          resistance GRASS, MINUS30
          pokeBody "Dual Armor", {
            text "As long as Rocket’s Scizor ex has any [M] Energy attached to it, Rocket’s Scizor ex is both [M] and [D] type."
            getterA GET_POKEMON_TYPE, self, {h->
              if(self.cards.energyCount(M)) h.object.add(M)
            }
          }
          move "Rotating Claws", {
            text "50 damage. You may discard an Energy card attached to Rocket’s Scizor ex. If you do, search your discard pile for an Energy card (excluding the one you just discarded) and attach it to Rocket’s Scizor ex."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 50
              afterDamage{
                if(confirm("discard an Energy card attached to Rocket’s Scizor ex?")){
                  discardSelfEnergy C
                  attachEnergyFrom(my.discard,self)
                }
              }
            }
          }

        };
      case ROCKET_S_SCYTHER_EX_102:
        return basic (this, hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness FIRE
          resistance FIGHTING, MINUS30
          pokeBody "Dual Armor", {
            text "As long as Rocket’s Scyther ex has any [G] Energy attached to it, Rocket’s Scyther ex is both [G] and [D] type."
            getterA GET_POKEMON_TYPE, self, {h->
              if(self.cards.energyCount(G)) h.object.add(G)
            }
          }
          move "Bounce", {
            text "10 damage. After your attack, you may switch Rocket’s Scyther ex with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              if(my.bench){
                if(confirm("Switch Rocket’s Scyther ex with 1 of your Benched Pokémon?")) sw self, my.bench.select()
              }
            }
          }
          move "Slashing Strike", {
            text "40 damage. Rocket’s Scyther ex can’t use Slashing Strike during your next turn."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              cantUseAttack thisMove, self
            }
          }

        };
      case ROCKET_S_SNEASEL_EX_103:
        return basic (this, hp:HP090, type:DARKNESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Drag Off", {
            text "10 damage. Before doing damage, you may switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon. If you do, this attack does 10 damage to the new Defending Pokémon. Your opponent chooses the Defending Pokémon to switch."
            energyCost D
            attackRequirement {}
            onAttack {
              def pcs = defending
              if(opp.bench){
                if(confirm("Switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon.")){
                  pcs = opp.bench.select()
                  sw defending, pcs
                }
              }
              damage 10, pcs
            }
          }
          move "Dark Ring", {
            text "30+ damage. Does 30 damage plus 10 more damage for each of your [D] Pokémon in play."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 30
              my.all.each{
                if(it.types.contains(D)) damage 10
              }
            }
          }

        };
      case ROCKET_S_SNORLAX_EX_104:
        return basic (this, hp:HP100, type:DARKNESS, retreatCost:3) {
          weakness FIGHTING
          pokeBody "Dark Healer", {
            text "As long as Rocket’s Snorlax ex has any [D] Energy attached to it, remove 1 damage counter from Rocket’s Snorlax ex between turns."
            delayedA {
              before BEGIN_TURN, {
                if(self.cards.energyCount(D)){
                  heal 10, self
                }
              }
            }
          }
          move "Poison Claws", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC POISONED
            }
          }
          move "Collapse", {
            text "60 damage. Rocket’s Snorlax ex is now Asleep."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              apply ASLEEP, self
            }
          }

        };
      case ROCKET_S_SUICUNE_EX_105:
        return basic (this, hp:HP100, type:DARKNESS, retreatCost:1) {
          weakness LIGHTNING
          pokeBody "Dark and Clear", {
            text "As long as Rocket’s Suicune ex has any [D] Energy attached to it, Rocket’s Suicune ex can’t be affected by any Special Conditions."
            delayedA {
              before APPLY_SPECIAL_CONDITION,self, {
                if(e.getTarget(bg)==self && self.cards.energyCount(D)){
                  bc "Dark and Clear prevents special conditions"
                  prevent()
                }
              }
            }
          }
          move "Icy Wind", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage ASLEEP
            }
          }
          move "Hyper Splash", {
            text "50+ damage. If the Defending Pokémon is a Stage 2 Evolved Pokémon, this attack does 50 damage plus 40 more damage."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 50
              if(opp.active.topPokemonCard.cardTypes.is(STAGE2)) damage 40
            }
          }

        };
      case ROCKET_S_ZAPDOS_EX_106:
        return basic (this, hp:HP100, type:DARKNESS, retreatCost:1) {
          weakness LIGHTNING
          pokeBody "Darkness Guard", {
            text "As long as Rocket’s Zapdos ex has any [D] Energy attached to it, damage done to Rocket’s Zapdos ex by an opponent’s attack is reduced by 10 (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && it.from.owner == self.owner.opposite && it.notNoEffect && self.cards.energyCount(D)){
                    it.dmg -= hp(10)
                  }
                }
              }
            }
          }
          move "Plasma", {
            text "10 damage. Search your discard pile for a [L] Energy card and attach it to Rocket’s Zapdos ex."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              attachEnergyFrom(type : L,my.discard,self)
            }
          }
          move "Raging Thunder", {
            text "60 damage. This attack does 30 damage to 1 of your Pokémon."
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              damage 60
              damage 30, my.all.select()
            }
          }

        };
      case MUDKIP_STAR_107:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Whirlpool", {
            text "Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              flip{discardDefendingEnergy()}
            }
          }
          move "Spring Back", {
            text "20+ damage. If your opponent has only 1 Prize card left, this attack does 20 damage plus 50 more damage and the Defending Pokémon is now Asleep."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 20
              if(opp.prizeCardSet.size() == 1){
                damage 50
                applyAfterDamage ASLEEP
              }
            }
          }

        };
      case TORCHIC_STAR_108:
        return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Fireworks", {
            text "20 damage. Flip a coin. If tails, discard a [R] Energy card attached to Torchic."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 20
              flip 1, {}, {discardSelfEnergy R}
            }
          }
          move "Spring Back", {
            text "20+ damage. If your opponent has only 1 Prize card left, this attack does 20 damage plus 50 more damage and the Defending Pokémon is now Confused."
            energyCost R, R
            attackRequirement {}
            onAttack {
              damage 20
              if(opp.prizeCardSet.size() == 1){
                damage 50
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case TREECKO_STAR_109:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          resistance WATER, MINUS30
          move "Tackle", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Spring Back", {
            text "20+ damage. If your opponent has only 1 Prize card left, this attack does 20 damage plus 50 more damage and the Defending Pokémon is now Poisoned."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              if(opp.prizeCardSet.size() == 1){
                damage 50
                applyAfterDamage POISONED
              }
            }
          }

        };
      case CHARMELEON_110:
        return evolution (this, from:"Charmander", hp:HP070, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Smokescreen", {
            text "10 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 10
              sandAttack(thisMove)
            }
          }
          move "Fireworks", {
            text "40 damage. Flip a coin. If tails, discard a [R] Energy card attached to Charmeleon."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 40
              flip 1, {}, {discardSelfEnergy R}
            }
          }

        };
      case HERE_COMES_TEAM_ROCKET__111:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nEach player plays with his or her Prize cards face up for the rest of the game."
          onPlay {
            my.prizeCardSet.allVisible=true
            opp.prizeCardSet.allVisible=true
            bc "All prizes are visible until the end of game!"
          }
          playRequirement {
            assert !(my.prizeCardSet.allVisible && opp.prizeCardSet.allVisible) : "All prizes are already visible"
          }
        };
      default:
        return null;
    }
  }

}
