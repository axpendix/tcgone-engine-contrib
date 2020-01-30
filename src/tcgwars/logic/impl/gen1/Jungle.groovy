package tcgwars.logic.impl.gen1;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.EffectType.*
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
public enum Jungle implements LogicCardInfo {

  CLEFABLE_1 ("Clefable", 1, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ELECTRODE_2 ("Electrode", 2, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  FLAREON_3 ("Flareon", 3, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  JOLTEON_4 ("Jolteon", 4, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  KANGASKHAN_5 ("Kangaskhan", 5, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  MR_MIME_6 ("Mr. Mime", 6, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  NIDOQUEEN_7 ("Nidoqueen", 7, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  PIDGEOT_8 ("Pidgeot", 8, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  PINSIR_9 ("Pinsir", 9, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  SCYTHER_10 ("Scyther", 10, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  SNORLAX_11 ("Snorlax", 11, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  VAPOREON_12 ("Vaporeon", 12, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  VENOMOTH_13 ("Venomoth", 13, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VICTREEBEL_14 ("Victreebel", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VILEPLUME_15 ("Vileplume", 15, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  WIGGLYTUFF_16 ("Wigglytuff", 16, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),

  CLEFABLE ("Clefable", 17, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ELECTRODE ("Electrode", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  FLAREON ("Flareon", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  JOLTEON ("Jolteon", 20, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  KANGASKHAN ("Kangaskhan", 21, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  MR_MIME ("Mr. Mime", 22, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  NIDOQUEEN ("Nidoqueen", 23, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  PIDGEOT ("Pidgeot", 24, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  PINSIR ("Pinsir", 25, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  SCYTHER ("Scyther", 26, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
  SNORLAX ("Snorlax", 27, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  VAPOREON ("Vaporeon", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  VENOMOTH ("Venomoth", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VICTREEBEL ("Victreebel", 30, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  VILEPLUME ("Vileplume", 31, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  WIGGLYTUFF ("Wigglytuff", 32, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BUTTERFREE ("Butterfree", 33, Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  DODRIO ("Dodrio", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  EXEGGUTOR ("Exeggutor", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  FEAROW ("Fearow", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  GLOOM ("Gloom", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  LICKITUNG ("Lickitung", 38, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  MAROWAK ("Marowak", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  NIDORINA ("Nidorina", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PARASECT ("Parasect", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PERSIAN ("Persian", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  PRIMEAPE ("Primeape", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  RAPIDASH ("Rapidash", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  RHYDON ("Rhydon", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SEAKING ("Seaking", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  TAUROS ("Tauros", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  WEEPINBELL ("Weepinbell", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  BELLSPROUT ("Bellsprout", 49, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CUBONE ("Cubone", 50, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  EEVEE ("Eevee", 51, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  EXEGGCUTE ("Exeggcute", 52, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  GOLDEEN ("Goldeen", 53, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  JIGGLYPUFF ("Jigglypuff", 54, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  MANKEY ("Mankey", 55, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MEOWTH ("Meowth", 56, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  NIDORAN_FEMALE ("Nidoran♀", 57, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  ODDISH ("Oddish", 58, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PARAS ("Paras", 59, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PIKACHU ("Pikachu", 60, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  RHYHORN ("Rhyhorn", 61, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SPEAROW ("Spearow", 62, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  VENONAT ("Venonat", 63, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  POKE_BALL ("Poké Ball", 64, Rarity.COMMON, [TRAINER]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING;

  static SimpleDeck waterBlast() {
    SimpleDeck deck = new SimpleDeck("Water Blast Theme Deck");
    deck.setFormat(GameFormat.CLASSIC_SERIES);
    Map<CardInfo, Integer> map = new HashMap<>();
    map.put(BaseSet.POLIWAG, 4);
    map.put(BaseSet.POLIWHIRL, 2);
    map.put(BaseSet.SEEL, 1);
    map.put(VAPOREON, 1);
    map.put(BaseSet.MACHOP, 2);
    map.put(RHYHORN, 3);
    map.put(RHYDON, 1);
    map.put(MEOWTH, 4);
    map.put(PERSIAN, 2);
    map.put(EEVEE, 4);
    map.put(BaseSet.GUST_OF_WIND, 2);
    map.put(BaseSet.POTION, 2);
    map.put(BaseSet.PROFESSOR_OAK, 1);
    map.put(BaseSet.SUPER_POTION, 2);
    map.put(BaseSet.SWITCH, 1);
    map.put(BaseSet.WATER_ENERGY, 14);
    map.put(BaseSet.FIGHTING_ENERGY, 14);
    deck.setMap(map);
    return deck;
  }

  static SimpleDeck powerReserve() {
    SimpleDeck deck = new SimpleDeck("Power Reserve Theme Deck");
    deck.setFormat(GameFormat.CLASSIC_SERIES);
    Map<CardInfo, Integer> map = new HashMap<>();
    map.put(NIDORAN_FEMALE, 4);
    map.put(NIDORINA, 2);
    map.put(ODDISH, 2);
    map.put(GLOOM, 1);
    map.put(BELLSPROUT, 4);
    map.put(WEEPINBELL, 2);
    map.put(BaseSet.ABRA, 4);
    map.put(BaseSet.KADABRA, 2);
    map.put(BaseSet.JYNX, 1);
    map.put(KANGASKHAN, 1);
    map.put(BaseSet.BILL, 2);
    map.put(BaseSet.GUST_OF_WIND, 2);
    map.put(BaseSet.POKEDEX, 1);
    map.put(BaseSet.POTION, 3);
    map.put(BaseSet.SWITCH, 1);
    map.put(BaseSet.GRASS_ENERGY, 17);
    map.put(BaseSet.PSYCHIC_ENERGY, 11);
    deck.setMap(map);
    return deck;
  }

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  Jungle(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.JUNGLE;
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
      case CLEFABLE_1:
        return evolution (this, from:"Clefairy", hp:HP070, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Metronome", {
            text "Choose 1 of the Defending Pokémon’s attacks. Metronome copies that attack except for its Energy costs and anything else required in order to use that attack, such as discarding Energy cards. (No matter what type the Defending Pokémon is, Clefable’s type is still Colorless.)"
            energyCost C
            attackRequirement {}
            onAttack {
              def moveList = []
              def labelList = []

              moveList.addAll(defending.topPokemonCard.moves);
              labelList.addAll(defending.topPokemonCard.moves.collect{it.name})

              def move=choose(moveList, labelList, "Which move do you want to use")
              def bef=blockingEffect(ENERGY_COST_CALCULATOR, DISCARD_SELF_ENERGY, BETWEEN_TURNS)
              attack (move as Move)
              bef.unregisterItself(bg().em())
            }
          }
          move "Minimize", {
            text "All damage done by attacks to Clefable during your opponent’s next turn is reduced by 20 (after applying Weakness and Resistance)."
            energyCost C, C
            attackRequirement {}
            onAttack {
              reduceDamageNextTurn(hp(20), thisMove)
            }
          }

        };
      case ELECTRODE_2:
        return evolution (this, from:"Voltorb", hp:HP090, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Tackle", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Chain Lightning", {
            text "20 damage. If the Defending Pokémon isn’t Colorless, this attack does 10 damage to each Benched Pokémon of the same type as the Defending Pokémon (including your own)."
            energyCost L, L, L
            attackRequirement {}
            onAttack {
              damage 20
              def defType = (defending.types as List<Type>)
              if(!defending.types.contains(C) || defType.size() != 1){
                if(defType.size() == 1){
                  opp.bench.each{
                    if(it.types.contains(defType.get(0))) damage 10, it
                  }
                  my.bench.each{
                    if(it.types.contains(defType.get(0))) damage 10, it
                  }
                }
                else{
                  opp.bench.each{
                    if(it.types.contains(defType.get(0)) || it.types.contains(defType.get(1))) damage 10, it
                  }
                  my.bench.each{
                    if(it.types.contains(defType.get(0))) damage 10, it
                  }
                }
              }
            }
          }

        };
      case FLAREON_3:
        return evolution (this, from:"Eevee", hp:HP070, type:FIRE, retreatCost:1) {
          weakness WATER
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip {damage 20}
            }
          }
          move "Flamethrower", {
            text "60 damage. Discard 1 [R] Energy card attached to Flareon in order to use this attack."
            energyCost R, R, C, C
            attackRequirement {}
            onAttack {
              damage 60
              discardSelfEnergy R
            }
          }

        };
      case JOLTEON_4:
        return evolution (this, from:"Eevee", hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip {damage 20}
            }
          }
          move "Pin Missile", {
            text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads."
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              flip 4, {damage 20}
            }
          }

        };
      case KANGASKHAN_5:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:3) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Fetch", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Comet Punch", {
            text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              flip 4, {damage 20}
            }
          }

        };
      case MR_MIME_6:
        return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
          weakness PSYCHIC
          pokemonPower "Invisible Wall", {
            text "Whenever an attack (including your own) does 30 or more damage to Mr. Mime (after applying Weakness and Resistance), prevent that damage. (Any other effects of attacks still happen.) This power can’t be used if Mr. Mime is Asleep, Confused, or Paralyzed."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                if(!(self.specialConditions)){
                  bg.dm().each {
                    if(it.to == self & it.dmg.value > 20) {
                      bc "Invisible Wall prevents damage"
                      it.dmg = hp(0)
                    }
                  }
                }
              }
            }
          }
          move "Meditate", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on the Defending Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 10+10*defending.numberOfDamageCounters
            }
          }

        };
      case NIDOQUEEN_7:
        return evolution (this, from:"Nidorina", hp:HP090, type:GRASS, retreatCost:3) {
          weakness PSYCHIC
          move "Boyfriends", {
            text "20+ damage. Does 20 damage plus 20 more damage for each Nidoking you have in play."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              my.all.each{
                if(it.name == "Nidoking") damage 20
              }
            }
          }
          move "Mega Punch", {
            text "50 damage."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case PIDGEOT_8:
        return evolution (this, from:"Pidgeotto", hp:HP080, type:COLORLESS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Wing Attack", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Hurricane", {
            text "30 damage. Unless this attack Knocks Out the Defending Pokémon, return the Defending Pokémon and all cards attached to it to your opponent’s hand."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage{
                if(opp.bench){
                  defending.cards.moveTo(opp.hand)
                  removePCS(defending)
                }
              }
            }
          }

        };
      case PINSIR_9:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Irongrip", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              afterDamage {flipThenApplySC PARALYZED}
            }
          }
          move "Guillotine", {
            text "50 damage."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case SCYTHER_10:
        return basic (this, hp:HP070, type:GRASS, retreatCost:0) {
          weakness FIRE
          resistance FIGHTING, MINUS30
          move "Swords Dance", {
            text "During your next turn, Scyther’s Slash attack’s base damage is 60 instead of 30."
            energyCost G
            attackRequirement {}
            onAttack {
              increasedBaseDamageNextTurn("Slash",hp(30))
            }
          }
          move "Slash", {
            text "30 damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case SNORLAX_11:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:4) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          pokemonPower "Thick Skinned", {
            text "Snorlax can’t become Asleep, Confused, Paralyzed, or Poisoned. This power can’t be used if Snorlax is already Asleep, Confused, or Paralyzed."
            delayedA {
              before APPLY_SPECIAL_CONDITION,self, {
                if(!(self.specialConditions)){
                  bc (self+"is thick Skinned!")
                  prevent()
                }
              }
            }
          }
          move "Body Slam", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {flipThenApplySC PARALYZED}
            }
          }

        };
      case VAPOREON_12:
        return evolution (this, from:"Eevee", hp:HP080, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip {damage 20}
            }
          }
          move "Water Gun", {
            text "30+ damage. Does 30 damage plus 10 more damage for each [W] Energy attached to Vaporeon but not used to pay for this attack’s Energy cost. Extra [W] Energy after the 2nd doesn’t count."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 30
              extraEnergyDamage(2,hp(10),W,thisMove)
            }
          }

        };
      case VENOMOTH_13:
        return evolution (this, from:"Venonat", hp:HP070, type:GRASS, retreatCost:0) {
          weakness FIRE
          resistance FIGHTING, MINUS30
          pokemonPower "Shift", {
            text "Once during your turn (before your attack), you may change the type of Venomoth to the type of any other Pokémon in play other than Colorless. This power can’t be used if Venomoth is Asleep, Confused, or Paralyzed."
            actionA {
              assert !(self.specialConditions) : "This pokemon has a special condition"
              checkLastTurn()
              def typeList = []
              my.bench.each{
                def typesCard = it.types as List<Type>
                if(!typeList.contains(typesCard.get(0)) && typesCard.get(0) != C) typeList.add(typesCard.get(0))

                if(typesCard.size() > 1){
                  if(!typeList.contains(typesCard.get(1)) && typesCard.get(1) != C) typeList.add(typesCard.get(1))
                }
              }
              opp.all.each{
                def typesCard = it.types as List<Type>
                if(!typeList.contains(typesCard.get(0)) && typesCard.get(0) != C) typeList.add(typesCard.get(0))

                if(typesCard.size() > 1){
                  if(!typeList.contains(typesCard.get(1)) && typesCard.get(1) != C) typeList.add(typesCard.get(1))
                }
              }
              assert typeList : "There is no pokemon in play with a type different than [C]"
              powerUsed()
              def newType = choose(typeList,"Select the new type of Venomoth")
              getter GET_POKEMON_TYPE, self, {h->
                h.object.retainAll()
                h.object.add(newType)
              }
            }
          }
          move "Venom Powder", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and Poisoned."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                applyAfterDamage POISONED
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case VICTREEBEL_14:
        return evolution (this, from:"Weepinbell", hp:HP080, type:GRASS, retreatCost:2) {
          weakness FIRE
          move "Lure", {
            text "If your opponent has any Benched Pokémon, choose 1 of them and switch it with his or her Active Pokémon."
            energyCost G
            attackRequirement {}
            onAttack {
              def pcs = opp.bench.select("Switch")
              sw opp.active, pcs
            }
          }
          move "Acid", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon can’t retreat during your next turn."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              flip {cantRetreat defending}
            }
          }

        };
      case VILEPLUME_15:
        return evolution (this, from:"Gloom", hp:HP080, type:GRASS, retreatCost:2) {
          weakness FIRE
          pokemonPower "Heal", {
            text "Once during your turn (before your attack), you may flip a coin. If heads, remove 1 damage counter from 1 of your Pokémon. This power can’t be used if Vileplume is Asleep, Confused, or Paralyzed."
            actionA {
              checkLastTurn()
              assert !(self.specialConditions) : "This pokemon has a special condition"
              powerUsed()
              flip{
                heal 10, my.all.select("Select 1 pokemon to remove 1 damage")
              }
            }
          }
          move "Petal Dance", {
            text "40× damage. Flip 3 coins. This attack does 40 damage times the number of heads. Vileplume is now Confused (after doing damage)."
            energyCost G, G, G
            attackRequirement {}
            onAttack {
              flip 3, {damage 40}
              afterDamage{
                apply CONFUSED, self
              }
            }
          }

        };
      case WIGGLYTUFF_16:
        return evolution (this, from:"Jigglypuff", hp:HP080, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Lullaby", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Do the Wave", {
            text "10+ damage. Does 10 damage plus 10 more damage for each of your Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 10 + 10* my.bench.size()
            }
          }

        };
      case CLEFABLE:
        return copy (CLEFABLE_1, this)
      case ELECTRODE:
        return copy (ELECTRODE_2, this)
      case FLAREON:
        return copy (FLAREON_3, this)
      case JOLTEON:
        return copy (JOLTEON_4, this)
      case KANGASKHAN:
        return copy(KANGASKHAN_5, this)
      case MR_MIME:
        return copy (MR_MIME_6, this)
      case NIDOQUEEN:
        return copy (NIDOQUEEN_7, this)
      case PIDGEOT:
        return copy (PIDGEOT_8, this)
      case PINSIR:
        return copy (PINSIR_9, this)
      case SCYTHER:
        return copy (SCYTHER_10, this)
      case SNORLAX:
        return copy (SNORLAX_11, this)
      case VAPOREON:
        return copy (VAPOREON_12, this)
      case VENOMOTH:
        return copy (VENOMOTH_13, this)
      case VICTREEBEL:
        return copy (VICTREEBEL_14, this)
      case VILEPLUME:
        return copy (VILEPLUME_15, this)
      case WIGGLYTUFF:
        return copy (WIGGLYTUFF_16, this)
      case BUTTERFREE:
        return evolution (this, from:"Metapod", hp:HP070, type:GRASS, retreatCost:0) {
          weakness FIRE
          resistance FIGHTING, MINUS30
          move "Whirlwind", {
            text "20 damage. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              afterDamage{
                whirlwind()
              }
            }
          }
          move "Mega Drain", {
            text "40 damage. Remove a number of damage counters from Butterfree equal to half the damage done to the Defending Pokémon (after applying Weakness and Resistance) (rounded up to the nearest 10)."
            energyCost G, G, G, G
            attackRequirement {}
            onAttack {
              damage 40
              removeDamageCounterEqualToHalfDamageDone()
            }
          }

        };
      case DODRIO:
        return evolution (this, from:"Doduo", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          pokemonPower "Retreat Aid", {
            text "As long as Dodrio is Benched, pay 1 less to retreat your Active Pokémon."
            getterA GET_RETREAT_COST ,{ h->
              if(my.bench.find{it == self} && h.effect.target.owner == self.owner){
                h.object = Math.max(0,h.object-1)
              }
            }
          }
          move "Rage", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Dodrio."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 10+10*self.numberOfDamageCounters
            }
          }

        };
      case EXEGGUTOR:
        return evolution (this, from:"Exeggcute", hp:HP080, type:GRASS, retreatCost:3) {
          weakness FIRE
          move "Teleport", {
            text "Switch Exeggutor with 1 of your Benched Pokémon."
            energyCost P
            attackRequirement {
              assert my.bench.notEmpty : "there is no pokemon on your bench"
            }
            onAttack {
              def pcs = my.bench.select("Switch")
              sw my.active, pcs
            }
          }
          move "Big Eggsplosion", {
            text "20× damage. Flip a number of coins equal to the number of Energy attached to Exeggutor. This attack does 20 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              flip self.cards.energyCount(C), {
                damage 20
              }
            }
          }

        };
      case FEAROW:
        return evolution (this, from:"Spearow", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          move "Agility", {
            text "20 damage. Flip a coin. If heads, during your opponent’s next turn, prevent all effects of attacks, including damage, done to Fearow."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip{preventAllEffectsNextTurn()}
            }
          }
          move "Drill Peck", {
            text "40 damage."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }

        };
      case GLOOM:
        return evolution (this, from:"Oddish", hp:HP060, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Poisonpowder", {
            text "The Defending Pokémon is now Poisoned."
            energyCost G
            attackRequirement {}
            onAttack {
              apply POISONED
            }
          }
          move "Foul Odor", {
            text "20 damage. Both the Defending Pokémon and Gloom are now Confused (after doing damage)."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage CONFUSED
              afterDamage{apply CONFUSED, self}
            }
          }

        };
      case LICKITUNG:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:3) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Tongue Wrap", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip {applyAfterDamage PARALYZED}
            }
          }
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flipThenApplySC CONFUSED
            }
          }

        };
      case MAROWAK:
        return evolution (this, from:"Cubone", hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          resistance LIGHTNING, MINUS30
          move "Bonemerang", {
            text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost F, F
            attackRequirement {}
            onAttack {
              flip 2, {damage 30}
            }
          }
          move "Call for Friend", {
            text "Search your deck for a [F] Basic Pokémon card and put it onto your Bench. Shuffle your deck afterward. (You can’t use this attack if your bench is full.)"
            energyCost F, F, C
            attackRequirement {
              assert deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              deck.search (count: 1,{it.cardTypes.is(BASIC) && it.asPokemonCard().types.contains(F)}).each {
                deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }

        };
      case NIDORINA:
        return evolution (this, from:"Nidoran♀", hp:HP070, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost G
            attackRequirement {}
            onAttack {
              flipThenApplySC CONFUSED
            }
          }
          move "Double Kick", {
            text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              flip 2, {damage 30}
            }
          }

        };
      case PARASECT:
        return evolution (this, from:"Paras", hp:HP060, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Spore", {
            text "The Defending Pokémon is now Asleep."
            energyCost G, G
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Slash", {
            text "30 damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case PERSIAN:
        return evolution (this, from:"Meowth", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Scratch", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Pounce", {
            text "30 damage. If the Defending Pokémon attacks Persian during your next turn, any damage done by the attack is reduced by 10 (after applying Weakness and Resistance). (Benching either Pokémon ends this effect.)"
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  if(ef.attacker.owner == self.owner.opposite) {
                    bg.dm().each{
                      if(it.to == self && it.notNoEffect && it.dmg.value) {
                        bc "Pounce -10"
                        it.dmg -= hp(10)
                      }
                    }
                  }
                }
                unregisterAfter 2
                after EVOLVE,defending, {unregister()}
                after SWITCH,defending, {unregister()}
              }
            }
          }

        };
      case PRIMEAPE:
        return evolution (this, from:"Mankey", hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness PSYCHIC
          move "Fury Swipes", {
            text "20× damage. Flip 3 coins. this attack does 20 damage times the number of heads."
            energyCost F, F
            attackRequirement {}
            onAttack {
              flip 3, {damage 20}
            }
          }
          move "Tantrum", {
            text "50 damage. Flip a coin. If tails, Primeape is now Confused (after doing damage)."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 50
              flip 1, {}, {afterDamage{apply CONFUSED, self}}
            }
          }

        };
      case RAPIDASH:
        return evolution (this, from:"Ponyta", hp:HP070, type:FIRE, retreatCost:0) {
          weakness WATER
          move "Stomp", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage; if tails, this attack does 20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip {damage 10}
            }
          }
          move "Agility", {
            text "30 damage. Flip a coin. If heads, during your opponent’s next turn, prevent all effects of attacks, including damage, done to Rapidash."
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 30
              flip{preventAllEffectsNextTurn()}
            }
          }

        };
      case RHYDON:
        return evolution (this, from:"Rhyhorn", hp:HP100, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          resistance LIGHTNING, MINUS30
          move "Horn Attack", {
            text "30 damage."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Ram", {
            text "50 damage. Rhydon does 20 damage to itself. If your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon. Switch the Pokémon even if Rhydon is knocked out.)"
            energyCost F, F, F, F
            attackRequirement {}
            onAttack {
              damage 50
              damage 20, self
              afterDamage{
                if(opp.bench){
                  whirlwind()
                }
              }
            }
          }

        };
      case SEAKING:
        return evolution (this, from:"Goldeen", hp:HP070, type:WATER, retreatCost:1) {
          weakness LIGHTNING
          move "Horn Attack", {
            text "10 damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Waterfall", {
            text "30 damage."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case TAUROS:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:2) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Stomp", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage; if tails, this attack does 20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip {damage 10}
            }
          }
          move "Rampage", {
            text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Tauros. Flip a coin. If tails, Tauros is now Confused (after doing damage)."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 20+10*self.numberOfDamageCounters
              afterDamage{
                flip 1, {}, {apply CONFUSED, self}
              }
            }
          }

        };
      case WEEPINBELL:
        return evolution (this, from:"Bellsprout", hp:HP070, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Poisonpowder", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              flip {applyAfterDamage POISONED}
            }
          }
          move "Razor Leaf", {
            text "30 damage."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case BELLSPROUT:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Vine Whip", {
            text "10 damage."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon named Bellsprout and put it onto your Bench. Shuffle your deck afterward. (You can’t use this attack if your Bench is full.)"
            energyCost G
            attackRequirement {
              assert deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              deck.search (count: 1,{it.cardTypes.is(BASIC) && it.name == "Bellsprout"}).each {
                deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
        };
      case CUBONE:
        return basic (this, hp:HP040, type:FIGHTING, retreatCost:1) {
          weakness GRASS
          resistance LIGHTNING, MINUS30
          move "Snivel", {
            text "If the Defending Pokémon attacks Cubone during your opponent’s next turn, any damage done by the attack is reduced by 20 (after applying Weakness and Resistance). (Benching either Pokémon ends this effect.)"
            energyCost C
            attackRequirement {}
            onAttack {
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  if(ef.attacker.owner == self.owner.opposite) {
                    bg.dm().each{
                      if(it.to == self && it.notNoEffect && it.dmg.value) {
                        bc "Snivel -20"
                        it.dmg -= hp(20)
                      }
                    }
                  }
                }
                unregisterAfter 2
                after SWITCH,defending, {unregister()}
                after SWITCH,self, {unregister()}
              }
            }
          }
          move "Rage", {
            text "10+ damage. Does 10 damage plus 10 more damage for each damage counter on Cubone."
            energyCost F, F
            attackRequirement {}
            onAttack {
              damage 10+10*self.numberOfDamageCounters
            }
          }

        };
      case EEVEE:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Tail Wag", {
            text "Flip a coin. If heads, the Defending Pokémon can’t attack Eevee during your opponent’s next turn. (Benching either Pokémon ends this effect."
            energyCost C
            attackRequirement {}
            onAttack {
              flip{
                delayed{
                  before APPLY_ATTACK_DAMAGES, {
                    bc "Tail Wag prevent attacking Eevee"
                    prevent()
                  }
                  before null, self, Source.ATTACK, {
                    bc "Tail Wag prevent attacking Eevee"
                    prevent()
                  }

                  unregisterAfter 2
                  after SWITCH,defending, {unregister()}
                  after SWITCH,self, {unregister()}
                }
              }
            }
          }
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage; if tails, this attack does 10 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip {damage 20}
            }
          }

        };
      case EXEGGCUTE:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Hypnosis", {
            text "The Defending Pokémon is now Asleep."
            energyCost P
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Leech Seed", {
            text "20 damage. Unless all damage from this attack is prevented, you may remove 1 damage counter from Exeggcute."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              delayed {
                before APPLY_ATTACK_DAMAGES, {
                  if(bg.dm().find{it.to == defending && it.from == self && it.dmg.value}) {
                    heal 10, self
                  }
                }
                unregisterAfter 1
              }
            }
          }

        };
      case GOLDEEN:
        return basic (this, hp:HP040, type:WATER, retreatCost:0) {
          weakness LIGHTNING
          move "Horn Attack", {
            text "10 damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case JIGGLYPUFF:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Lullaby", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Pound", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case MANKEY:
        return basic (this, hp:HP030, type:FIGHTING, retreatCost:0) {
          weakness PSYCHIC
          pokemonPower "Peek", {
            text "Once during your turn (before your attack), you may look at one of the following: the top card of either player’s deck, a random card from your opponent’s hand, or one of either player’s Prizes. This power can’t be used if Mankey is Asleep, Confused, or Paralyzed."
            actionA {
              checkLastTurn()
              assert !(self.specialConditions) : "This pokemon has a special condition"
              powerUsed()
              def choice = choose([0,1,2,3,4],["Top of your deck", "Top of your opponent's deck", "Your opponent’s hand ", "Your Prizes", "Opponent's Prizes"])
              switch (choice){
                case 0: my.deck.subList(0,1).showToMe("Top of your deck"); break;
                case 1: opp.deck.subList(0,1).showToMe("Top of your opponent's deck"); break;
                case 2: opp.hand.select(hidden: true, "Select a random card from opponent's hand").showToMe("Selected card"); break;
                case 3: my.prizeCardSet.select(hidden: true, "Select a random card from your prizes").showToMe("Selected card"); break;
                case 4: opp.prizeCardSet.select(hidden: true, "Select a random card from your opponent's prizes").showToMe("Selected card"); break;
              }
            }
          }
          move "Scratch", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case MEOWTH:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness FIGHTING
          resistance PSYCHIC, MINUS30
          move "Pay Day", {
            text "10 damage. Flip a coin. If heads, draw a card."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip {draw 1}
            }
          }

        };
      case NIDORAN_FEMALE:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness PSYCHIC
          move "Fury Swipes", {
            text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost G
            attackRequirement {}
            onAttack {
              flip 3 , {damage 10}
            }
          }
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon named Nidoran♂ or Nidoran♀ and put it onto your Bench. Shuffle your deck afterward. (You can’t use this attack if your Bench is full.)"
            energyCost G, G
            attackRequirement {
              assert deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              deck.search (count: 1,{it.cardTypes.is(BASIC) && (it.name == "Nidoran♂" || it.name == "Nidoran♀")}).each {
                deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }

        };
      case ODDISH:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Stun Spore", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              flip {applyAfterDamage PARALYZED}
            }
          }
          move "Sprout", {
            text "Search your deck for a Basic Pokémon named Oddish and put it onto your Bench. Shuffle your deck afterward. (You can’t use this attack if your Bench is full.)"
            energyCost G, G
            attackRequirement {
              assert deck.notEmpty
              assert my.bench.notFull
            }
            onAttack {
              deck.search (count: 1,{it.cardTypes.is(BASIC) && it.name == "Oddish"}).each {
                deck.remove(it)
                benchPCS(it)
              }
              shuffleDeck()
            }
          }

        };
      case PARAS:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Scratch", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Spore", {
            text "The Defending Pokémon is now Asleep."
            energyCost G, G
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }

        };
      case PIKACHU:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness FIGHTING
          move "Spark", {
            text "20 damage. If your opponent has any Benched Pokémon, choose 1 of them and this attack does 10 damage to it. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L, L
            attackRequirement {}
            onAttack {
              damage 20
              if(opp.bench) damage 10, opp.bench.select()
            }
          }

        };
      case RHYHORN:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:3) {
          weakness GRASS
          resistance LIGHTNING, MINUS30
          move "Leer", {
            text "Flip a coin. If heads, the Defending Pokémon can’t attack Rhyhorn during your opponent’s next turn. (Benching either Pokémon ends this effect.)"
            energyCost C
            attackRequirement {}
            onAttack {
              flip{
                delayed{
                  before APPLY_ATTACK_DAMAGES, {
                    bc "Leer prevent attacking Rhyhorn"
                    prevent()
                  }
                  before null, self, Source.ATTACK, {
                    bc "Leer prevent attacking Rhyhorn"
                    prevent()
                  }

                  unregisterAfter 2
                  after SWITCH,defending, {unregister()}
                  after SWITCH,self, {unregister()}
                }
              }
            }
          }
          move "Slash", {
            text "30 damage."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case SPEAROW:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:0) {
          weakness LIGHTNING
          resistance FIGHTING, MINUS30
          def turnCount=-1
          HP lastDamage=null
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

          move "Peck", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Mirror Move", {
            text "If Spearow was attacked last turn, do the final result of that attack on Spearow to the Defending Pokémon."
            energyCost C, C, C
            attackRequirement {
              assert lastDamage && turnCount+1==bg.turnCount
            }
            onAttack {
              damage lastDamage.value
            }
          }

        };
      case VENONAT:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness FIRE
          move "Stun Spore", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              flip {applyAfterDamage PARALYZED}
            }
          }
          move "Leech Life", {
            text "10 damage. Remove a number of damage counters from Venonat equal to the damage done to the Defending Pokémon (after applying Weakness and Resistance)."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 10
              removeDamageCounterEqualToDamageDone()
            }
          }

        };
      case POKE_BALL:
        return basicTrainer (this) {
          text "Flip a coin. If heads, you may search your deck for any Basic Pokémon or Evolution card. Show that card to your opponent, then put it into your hand. Shuffle your deck afterward."
          onPlay {
            flip{
              my.deck.search(count : 1, "search for a Basic Pokémon or Evolution card", {it.cardTypes.is(BASIC) || it.cardTypes.is(EVOLUTION)}).moveTo(my.hand)
            }
          }
          playRequirement{
            assert my.deck
          }
        };
      default:
        return null;
    }
  }

}
