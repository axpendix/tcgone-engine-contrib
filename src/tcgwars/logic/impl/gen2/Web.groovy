package tcgwars.logic.impl.gen2

// I don't know what the enumid is for vending machine, unnumbered promos, best of game
import tcgwars.logic.impl.gen1.VendingMachine;
import tcgwars.logic.impl.gen1.BestOfGame;
import tcgwars.logic.impl.gen1.UnnumberedPromos;

import tcgwars.logic.impl.gen1.BaseSet;
import tcgwars.logic.impl.gen1.Jungle;
import tcgwars.logic.impl.gen1.TeamRocket;
import tcgwars.logic.impl.gen1.GymChallenge
import tcgwars.logic.impl.gen1.WizardsBlackStarPromos;
import tcgwars.logic.impl.gen2.NeoGenesis;
import tcgwars.logic.impl.gen2.NeoDiscovery;

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
import tcgwars.entity.*;
import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*;
import tcgwars.logic.effect.blocking.*;
import tcgwars.logic.effect.event.*;
import tcgwars.logic.effect.getter.*;
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

public enum Web implements LogicCardInfo {

  IVYSAUR_1("Ivysaur", "1", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  NIDORAN_MALE_2("Nidoran♂", "2", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  VENONAT_3("Venonat", "3", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  EXEGGCUTE_4("Exeggcute", "4", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TANGELA_5("Tangela", "5", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GROWLITHE_6("Growlithe", "6", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CHARMELEON_7("Charmeleon", "7", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  VULPIX_8("Vulpix", "8", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  WARTORTLE_9("Wartortle", "9", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MARILL_10("Marill", "10", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  VOLTORB_11("Voltorb", "11", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  SLOWPOKE_12("Slowpoke", "12", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DIGLETT_13("Diglett", "13", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  HITMONLEE_14("Hitmonlee", "14", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  BILL_S_TELEPORTER_15("Bill's Teleporter", "15", Rarity.COMMON, [TRAINER, SUPPORTER]),
  NEW_POKEDEX_16("New Pokédex", "16", Rarity.COMMON, [TRAINER, ITEM]),
  DARK_IVYSAUR_17("Dark Ivysaur", "17", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  NIDORINO_18("Nidorino", "18", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VENOMOTH_19("Venomoth", "19", Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  EXEGGUTOR_20("Exeggutor", "20", Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  DARK_WEEZING_21("Dark Weezing", "21", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DARK_CHARMELEON_22("Dark Charmeleon", "22", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  ARCANINE_23("Arcanine", "23", Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  DARK_WARTORTLE_24("Dark Wartortle", "24", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SURFING_PIKACHU_25("Surfing Pikachu", "25", Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ELECTRODE_26("Electrode", "26", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  DARK_KADABRA_27("Dark Kadabra", "27", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DARK_SLOWBRO_28("Dark Slowbro", "28", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  DUGTRIO_29("Dugtrio", "29", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MAX_REVIVE_30("Max Revive", "30", Rarity.UNCOMMON, [TRAINER, ITEM]),
  HYPER_DEVOLUTION_SPRAY_31("Hyper Devolution Spray", "31", Rarity.UNCOMMON, [TRAINER, ITEM]),
  POKEMON_RETRANSFER_32("Pokémon Retransfer", "32", Rarity.UNCOMMON, [TRAINER, ITEM]),
  NIDOKING_33("Nidoking", "33", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  NINETALES_34("Ninetales", "34", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  MAGIKARP_35("Magikarp", "35", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  RAICHU_36("Raichu", "36", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  DARK_ALAKAZAM_37("Dark Alakazam", "37", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  DRAGONITE_38("Dragonite", "38", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  TEAM_ROCKET_S_MEOWTH_39("Team Rocket's Meowth", "39", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  ROCKET_S_SNEAK_ATTACK_40("Rocket's Sneak Attack", "40", Rarity.RARE, [TRAINER, SUPPORTER]),
  DARK_VENUSAUR_41("Dark Venusaur", "41", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  DARK_CHARIZARD_42("Dark Charizard", "42", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  MOLTRES_43("Moltres", "43", Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  DARK_BLASTOISE_44("Dark Blastoise", "44", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  ARTICUNO_45("Articuno", "45", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  ZAPDOS_46("Zapdos", "46", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  GENGAR_47("Gengar", "47", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  MACHAMP_48("Machamp", "48", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  Web(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.WEB;
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
      case IVYSAUR_1:
        return evolution (this, from:"Bulbasaur", hp:HP070, type:GRASS, retreatCost:2) {
          weakness R
          move "Leech Seed", {
            text "20 Damage. Unless all damage from this attack is prevented, you may remove one damage counter from Ivysaur."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              delayed (priority: LAST){
                before APPLY_ATTACK_DAMAGES, {
                  if(bg.dm().find{it.to == defending && it.from == self && it.dmg.value}) {
                    heal 10, self
                  }
                }
                unregisterAfter 1
              }
            }
          }
          move "Vine Whip", {
            text "40 damage."
            energyCost G, G, C
            onAttack {
              damage 40
            }
          }
        };
      case NIDORAN_MALE_2:
        return copy(VendingMachine.NIDORAN_M_9, this);
      case VENONAT_3:
        return copy(VendingMachine.VENONAT_15, this);
      case EXEGGCUTE_4:
        return copy(Jungle.EXEGGCUTE, this);
      case TANGELA_5:
        return basic (this, hp:HP050, type:G, retreatCost:2) {
          weakness R
          move "Stun Spore", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G
            onAttack {
              damage 10
              flip { applyAfterDamage PARALYZED }
            }
          }
          move "Poisonpowder", {
            text "10 damage. The Defending Pokémon is now Poisoned."
            energyCost G, G, C
            onAttack {
              damage 10
              applyAfterDamage POISONED
            }
          }
        };
      case GROWLITHE_6:
        return basic (this, hp:HP040, type:R, retreatCost:1) {
          weakness W
          move "Lunge", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            onAttack {
              flip { damage 20 }
            }
          }
          move "Ember", {
            text "30 damage. Discard a [R] Energy card attached to Growlithe or this attack does nothing."
            energyCost R, C
            onAttack {
              damage 30
              discardSelfEnergyAfterDamage R
            }
          }
        };
      case CHARMELEON_7:
        return copy(BaseSet.CHARMELEON, this);
      case VULPIX_8:
        return copy(VendingMachine.VULPIX_26, this);
      case WARTORTLE_9:
        return evolution (this, from:"Squirtle", hp:HP070, type:W, retreatCost:2) {
          weakness L
          move "Bubble", {
            text "10 damage. Flip a coin. If heads, the Defending Pokemon is now Paralyzed"
            energyCost W
            onAttack {
              damage 10
              flip { applyAfterDamage PARALYZED }
            }
          }
          move "Surf", {
            text "30 damage"
            energyCost W, W
            onAttack {
              damage 30
            }
          }
        };
      case MARILL_10:
        return copy (WizardsBlackStarPromos.MARILL_29, this);
      case VOLTORB_11:
        return copy (BaseSet.VOLTORB, this);
//      case SLOWPOKE_12:
//        return copy (UnnumberedPromos.SLOWPOKE_1, this);
      case DIGLETT_13:
        return basic (this, hp:HP050, type:F, retreatCost:1) {
          weakness G
          resistance L, MINUS30
          move "Peck", {
            text "10 damage."
            energyCost F
            onAttack {
              damage 10
            }
          }
          move "Trip Over", {
            text "20 damage. Flip a coin.  If heads, this attack does 10 more damage."
            energyCost F, C
            onAttack {
              damage 20
              flip { damage 10 }
            }
          }
        };
      case HITMONLEE_14:
        return copy(VendingMachine.HITMONLEE_79, this);
      case BILL_S_TELEPORTER_15:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." + "Flip a coin. If heads, draw 4 cards"
          onPlay {
            flip { draw 4 }
          }
          playRequirement{
            assert my.deck : "Deck is empty"
          }
        };
      case NEW_POKEDEX_16:
        return copy(NeoGenesis.NEW_POKEDEX_95, this);
      case DARK_IVYSAUR_17:
        return copy(BestOfGame.DARK_IVYSAUR_6, this);
      case NIDORINO_18:
        return copy(VendingMachine.NIDORINO_10, this);
      case VENOMOTH_19:
        return copy(VendingMachine.VENOMOTH_16, this);
      case EXEGGUTOR_20:
        return copy(Jungle.EXEGGUTOR, this);
      case DARK_WEEZING_21:
        return copy(TeamRocket.DARK_WEEZING_14, this);
      case DARK_CHARMELEON_22:
        return copy(TeamRocket.DARK_CHARMELEON, this);
      case ARCANINE_23:
        return evolution (this, from:"Growlithe", hp:HP070, type:R, retreatCost:2) {
          weakness W
          move "Take Down", {
            text "50 damage. Arcanine does 20 damage to itself"
            energyCost R, R, C
            onAttack {
              damage 50
              damage 20, self
            }
          }
        };
      case DARK_WARTORTLE_24:
        return copy(TeamRocket.DARK_WARTORTLE, this);
      case SURFING_PIKACHU_25:
        return copy(WizardsBlackStarPromos.SURFING_PIKACHU_28, this);
      case ELECTRODE_26:
        return evolution (this, from:"Voltorb", hp:HP070, type:L, retreatCost:1) {
          weakness F
          move "Sonicboom", {
            text "30 damage. Don't apply Weakness or Resistance."
            energyCost L, L
            onAttack {
              noWrDamage 30
            }
          }
          move "Energy Spike", {
            text "Search your deck for a basic Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward."
            energyCost L, L, L
            attackRequirement {
              assert my.deck : "Deck is empty"
            }
            onAttack {
              deck.search (cardTypeFilter(BASIC_ENERGY)).each{
                attachEnergy(my.all.select("Attach the Energy to?"), it)
              }
            }
          }
        };
      case DARK_KADABRA_27:
        return copy(TeamRocket.DARK_KADABRA, this);
      case DARK_SLOWBRO_28:
        return copy(TeamRocket.DARK_SLOWBRO_12, this);
      case DUGTRIO_29:
        return evolution (this, from:"Diglett", hp:HP080, type:F, retreatCost:2) {
          weakness G
          resistance L, MINUS30
          pokeBody "Go Underground", {
            text "As long as Dugtrio is on your Bench, prevent all damage done to Dugtrio by attacks (both yours and your opponent's)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (self.benched && it.to == self && it.notNoEffect && it.dmg.value) {
                    bc "Go Underground prevents all damage"
                    it.dmg=hp(0)
                  }
                }
              }
            }
          }
          move "Earth Wave", {
            text "30 damage. This attack does 10 damage to 2 of your opponent's benched pokemon"
            energyCost F, F, F
            onAttack {
              damage 30
              if (opp.bench) {
                multiSelect(opp.bench, 2, text).each {
                  damage 10, it
                }
              }
            }
          }
        };
      case MAX_REVIVE_30:
        return copy(GymChallenge.MAX_REVIVE_117, this);
      case HYPER_DEVOLUTION_SPRAY_31:
        return copy(NeoDiscovery.HYPER_DEVOLUTION_SPRAY_73, this);
      case POKEMON_RETRANSFER_32:
        return copy(VendingMachine.POKEMON_RETRANSFER_108, this);
      case NIDOKING_33:
        return copy(BaseSet.NIDOKING, this);
      case NINETALES_34:
        return copy(BaseSet.NINETALES, this);
      case MAGIKARP_35:
        return basic (this, hp:HP030, type:W, retreatCost:1) {
          weakness L
          move "Trickle", {
            text "Flip 2 coins. This attack does 10 damage times the number of heads"
            energyCost W
            onAttack {
              flip 2, {damage 10}
            }
          }
          move "Trip Over", {
            text "50 damage. Flip 2 coins.  If either of them is tails, this attack does nothing."
            energyCost W, W
            onAttack {
              flip 2, {}, {}, [2:{ damage 50 }]
            }
          }
        };
      case RAICHU_36:
        return copy(BaseSet.RAICHU, this);
      case DARK_ALAKAZAM_37:
        return copy(TeamRocket.DARK_ALAKAZAM_1, this);
      case DRAGONITE_38:
        return copy(WizardsBlackStarPromos.DRAGONITE_5, this);
      case TEAM_ROCKET_S_MEOWTH_39:
        return copy(WizardsBlackStarPromos.TEAM_ROCKET_S_MEOWTH_18, this);
      case ROCKET_S_SNEAK_ATTACK_40:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
            "Look at your opponent's hand. If he or she has any Trainer cards, choose 1 of them. Your opponent shuffles that card into his or her deck."
          onPlay {
            def list = opp.hand.shuffledCopy()
            if (list.filterByType(TRAINER).empty) {
              list.showToMe("Your opponent's hand. No trainers found in it.")
            } else {
              list = list.select(count: 1, "Opponent's hand. If there is a Trainer card, choose 1 of them to have your opponent shuffle that card into their deck", cardTypeFilter(TRAINER))
              if(list) {
                list.showToOpponent("Opponent played Rocket's Sneak Attack and this card from your hand will be shuffled into your deck").moveTo(opp.deck)
                shuffleOppDeck()
              }
            }
          }
          playRequirement{
            assert opp.hand
          }
        };
      case DARK_VENUSAUR_41:
        return copy(BestOfGame.DARK_VENUSAUR_7, this);
      case DARK_CHARIZARD_42:
        return copy(TeamRocket.DARK_CHARIZARD_4, this);
      case MOLTRES_43:
        return basic (this, hp:HP070, type:R, retreatCost:1) {
          weakness W
          resistance F, MINUS30
          move "Hyper Flame", {
            text "60 damage. Flip a coin. If heads, discard 1 Fire Energy card attached to Moltres. If tails, discard all Energy cards attached to Moltres. If you can't discard Energy cards, this attack does nothing."
            energyCost R, R, R
            onAttack {
              damage 60
              flip 1, {
                discardSelfEnergyAfterDamage R
              }, {
                afterDamage{
                  discardAllSelfEnergy()
                }
              }
            }
          }
        };
      case DARK_BLASTOISE_44:
        return copy(TeamRocket.DARK_BLASTOISE, this);
      case ARTICUNO_45:
        return basic (this, hp:HP070, type:W, retreatCost:1) {
          weakness M
          resistance F, MINUS30
          move "Diamond Dust", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed, and this attack does 10 damage to each of your opponent's Benched Pokémon."
            energyCost W, W, W
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
                opp.bench.each{
                  damage 10, it
                }
              }
            }
          }
        };
      case ZAPDOS_46:
        return basic (this, hp:HP070, type:L, retreatCost:1) {
          weakness L
          resistance F, MINUS30
          move "Lightning Burn", {
            text "30 damage. Flip a coin. If heads, and if your opponent has any Benched Pokémon, choose 1 of them. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) If tails, Zapdos does 30 damage to itself."
            energyCost L, L, L
            onAttack {
              damage 30
              flip 1, {
                damage 30, opp.bench.select("Does 30 damage to one of your opponent's Benched Pokémon")
              }, {
                damage 30, self
              }
            }
          }
        };
      case GENGAR_47:
        return evolution (this, from:"Haunter", hp:HP080, type:P, retreatCost:2) {
          resistance F, MINUS30
          pokePower "Power of Darkness", {
            text "Once during your turn, when you play Gengar from your hand to evolve 1 of your Pokémon, you may flip a coin. If heads, choose 1 of your opponent's Pokémon. Your opponent returns that Pokémon and all cards attached to it to his or her hand."
            onActivate {r->
              if (r==PLAY_FROM_HAND && confirm('Use Power of Darkness?')) {
                powerUsed()
                flip {
                  def tar = opp.all.select("Choose a Pokémon to return to your opponent's hand.")
                  scoopUpPokemon(tar, delegate)
                }
              }
            }
          }
          move "Psy Horror", {
            text "30 damage. Flip a coin. If heads, the defending Pokemon is now Asleep. If tailsn the Defending Pokemon is now Confused"
            energyCost P, P, P
            onAttack {
              damage 30
              flip 1, {
                applyAfterDamage ASLEEP
              }, {
                applyAfterDamage CONFUSED
              }
            }
          }
        };
      case MACHAMP_48:
        return copy(WizardsBlackStarPromos.MACHAMP_43, this);
      default:
        return null;
      }
    }
  };
