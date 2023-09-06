package tcgwars.logic.impl.pokemod

import static tcgwars.logic.card.HP.*
import static tcgwars.logic.card.Type.*
import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.groovy.TcgBuilders.*
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import java.util.*
import org.apache.commons.lang.WordUtils
import tcgwars.entity.*
import tcgwars.logic.*
import tcgwars.logic.card.*
import tcgwars.logic.card.energy.*
import tcgwars.logic.card.pokemon.*
import tcgwars.logic.card.trainer.*
import tcgwars.logic.effect.*
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.advanced.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.effect.blocking.*
import tcgwars.logic.effect.event.*
import tcgwars.logic.effect.getter.*
import tcgwars.logic.effect.special.*
import tcgwars.logic.util.*

/**
 * @author lithogenn@gmail.com
 */
public enum PokemodNeoRevelation implements LogicCardInfo {

  AMPHAROS_1 ("Ampharos", "1", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  BLISSEY_2 ("Blissey", "2", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  CELEBI_3 ("Celebi", "3", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  CROBAT_4 ("Crobat", "4", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  DELIBIRD_5 ("Delibird", "5", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  ENTEI_6 ("Entei", "6", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  HO_OH_7 ("Ho-oh", "7", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  HOUNDOOM_8 ("Houndoom", "8", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  JUMPLUFF_9 ("Jumpluff", "9", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  MAGNETON_10 ("Magneton", "10", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  MISDREAVUS_11 ("Misdreavus", "11", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  PORYGON2_12 ("Porygon2", "12", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  RAIKOU_13 ("Raikou", "13", Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
  SUICUNE_14 ("Suicune", "14", Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
  AERODACTYL_15 ("Aerodactyl", "15", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  CELEBI_16 ("Celebi", "16", Rarity.RARE, [POKEMON, BASIC, _GRASS_]),
  ENTEI_17 ("Entei", "17", Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  HO_OH_18 ("Ho-oh", "18", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  KINGDRA_19 ("Kingdra", "19", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  LUGIA_20 ("Lugia", "20", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  RAICHU_21 ("Raichu", "21", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  RAIKOU_22 ("Raikou", "22", Rarity.RARE, [POKEMON, BASIC, _LIGHTNING_]),
  SKARMORY_23 ("Skarmory", "23", Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  SNEASEL_24 ("Sneasel", "24", Rarity.RARE, [POKEMON, BASIC, _DARKNESS_]),
  STARMIE_25 ("Starmie", "25", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  SUDOWOODO_26 ("Sudowoodo", "26", Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  SUICUNE_27 ("Suicune", "27", Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  FLAAFFY_28 ("Flaaffy", "28", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  GOLBAT_29 ("Golbat", "29", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GRAVELER_30 ("Graveler", "30", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  JYNX_31 ("Jynx", "31", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  LANTURN_32 ("Lanturn", "32", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MAGCARGO_33 ("Magcargo", "33", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  OCTILLERY_34 ("Octillery", "34", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  PARASECT_35 ("Parasect", "35", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PILOSWINE_36 ("Piloswine", "36", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  SEAKING_37 ("Seaking", "37", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  STANTLER_38 ("Stantler", "38", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  UNOWN_B_39 ("Unown B", "39", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_Y_40 ("Unown Y", "40", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  AIPOM_41 ("Aipom", "41", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  CHINCHOU_42 ("Chinchou", "42", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  FARFETCH_D_43 ("Farfetch'd", "43", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  GEODUDE_44 ("Geodude", "44", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GOLDEEN_45 ("Goldeen", "45", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MURKROW_46 ("Murkrow", "46", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  PARAS_47 ("Paras", "47", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  QUAGSIRE_48 ("Quagsire", "48", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  QWILFISH_49 ("Qwilfish", "49", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  REMORAID_50 ("Remoraid", "50", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SHUCKLE_51 ("Shuckle", "51", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SKIPLOOM_52 ("Skiploom", "52", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  SLUGMA_53 ("Slugma", "53", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  SMOOCHUM_54 ("Smoochum", "54", Rarity.COMMON, [POKEMON, BABY, BASIC, _PSYCHIC_, BASIC]),
  SNUBBULL_55 ("Snubbull", "55", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  STARYU_56 ("Staryu", "56", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SWINUB_57 ("Swinub", "57", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  UNOWN_K_58 ("Unown K", "58", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  ZUBAT_59 ("Zubat", "59", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  VIRIDIAN_FOREST_60 ("Viridian Forest", "60", Rarity.RARE, [TRAINER, STADIUM]),
  HIGH_PRESSURE_SYSTEM_61 ("High Pressure System", "61", Rarity.RARE, [TRAINER, STADIUM]),
  POKEMON_BREEDER_FIELDS_62 ("Pokémon Breeder Fields", "62", Rarity.UNCOMMON, [TRAINER]),
  HEAVY_PRESSURE_SYSTEM_63 ("Heavy Pressure System", "63", Rarity.RARE, [TRAINER, STADIUM]),
  LOW_PRESSURE_SYSTEM_64 ("Low Pressure System", "64", Rarity.RARE, [TRAINER, STADIUM]),
  SHINING_GYARADOS_65 ("Shining Gyarados", "65", Rarity.SHINING, [POKEMON, BASIC, SHINING_POKEMON, _WATER_]),
  SHINING_MAGIKARP_66 ("Shining Magikarp", "66", Rarity.SHINING, [POKEMON, BASIC, SHINING_POKEMON, _WATER_]),
  CELEBI_EX_67 ("Celebi ex", "67", Rarity.HOLORARE, [POKEMON, BASIC, EX, _GRASS_]),
  HO_OH_EX_68 ("Ho-Oh ex", "68", Rarity.HOLORARE, [POKEMON, BASIC, EX, _FIRE_]),
  LUGIA_EX_69 ("Lugia ex", "69", Rarity.HOLORARE, [POKEMON, BASIC, EX, _COLORLESS_]),
  SCIZOR_EX ("Scizor ex", "70", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, EX, _COLORLESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON

  protected CardTypeSet cardTypes
  protected String name
  protected Rarity rarity
  protected String collectionLineNo

  PokemodNeoRevelation(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
    this.cardTypes = new CardTypeSet(cardTypes as CardType[])
    this.name = name
    this.rarity = rarity
    this.collectionLineNo = collectionLineNo
  }

  @Override
  public CardTypeSet getCardTypes() {
    return cardTypes
  }

  @Override
  public String getName() {
    return name
  }

  @Override
  public Rarity getRarity() {
    return rarity
  }

  @Override
  public String getNumber() {
    return collectionLineNo
  }

  @Override
  public tcgwars.logic.card.Collection getCollection() {
    return tcgwars.logic.card.Collection.POKEMOD_NEO_REVELATION
  }

  @Override
  public String toString() {
    return String.format("%s:%s", this.name(), this.getCollection().name())
  }

  @Override
  public String getEnumName() {
    return this.name()
  }

  @Override
  public Card getImplementation() {
    switch (this) {
      case AMPHAROS_1:
      return evolution (this, from:"Flaaffy", hp:HP090, type:L, retreatCost:3) {
        weakness F
        move "Attract Current", {
          text "20 damage. Flip 3 coins. For each heads, you may search your deck for a [L] Energy card and attach it to 1 of your [L] Pokémon. Shuffle your deck afterward."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Gigavolt", {
          text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage. If tails, this attack does 40 damage and the Defending Pokémon is now Paralyzed."
          energyCost L, L, L, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case BLISSEY_2:
      return evolution (this, from:"Chansey", hp:HP120, type:C, retreatCost:2) {
        weakness F
        resistance P, MINUS30
        pokePower "Softboiled", {
          text "When you play Blissey from your hand, you may flip a coin. If heads, remove 4 damage counters from Blissey. If tails, remove 2 damage counters from Blissey. Either way, if Blissey has fewer damage counters than that, remove all of them."
          actionA {
          }
        }
        move "Body Slam", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case CELEBI_3:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        pokePower "Time Travel", {
          text "If an opponent's attack would Knock Out Celebi, flip a coin. If heads, Celebi isn't Knocked Out and you shuffle it and all cards attached to it into your deck. This power doesn't work if Celebi is already affected by a Special Condition."
          actionA {
          }
        }
        move "Psychic Damage", {
          text "Flip 3 coins. For each heads, put 1 damage counter on the Defending Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      }
      case CROBAT_4:
      return evolution (this, from:"Golbat", hp:HP090, type:G, retreatCost:0) {
        weakness P
        resistance F, MINUS30
        move "Triggered Poison", {
          text "20 damage. If your opponent attaches an Energy card to the Defending Pokémon during his or her next turn, that Pokémon becomes Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Cross Attack", {
          text "20x damage. Flip 4 coins. This attack does 20 damage times the number of heads. If you get 2 or more heads, the Defending Pokémon is now Confused."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case DELIBIRD_5:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Present", {
          text "Flip 3 coins. If exactly 1 is heads, this attack does 40 damage. If exactly 2 are heads, remove 3 damage counters from the Defending Pokémon. If the Defending Pokémon has fewer damage counters than that, remove all of them. If all 3 are heads, this attack does 60 damage. If all 3 are tails, remove all damage counters from the Defending Pokémon."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
      }
      case ENTEI_6:
      return basic (this, hp:HP080, type:R, retreatCost:1) {
        weakness W
        pokePower "Howl", {
          text "When you play Entei from your hand, you may discard the top 5 cards of your deck. (if you have fewer cards in your deck than that, discard all of them.) If any of those are [R] Energy cards, attach them to any of your [R] Pokémon of your choice. Using this power ends your turn."
          actionA {
          }
        }
        move "Searing Flames", {
          text "60 damage. Discard 2 [R] Energy cards attached to Entei or this attack does nothing."
          energyCost R, R, R
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      }
      case HO_OH_7:
      return basic (this, hp:HP090, type:R, retreatCost:2) {
        weakness W
        resistance F, MINUS30
        move "Stoke", {
          text "You may search your deck for a [R] Energy card and attach it to Ho-Oh. Shuffle your deck afterward."
          energyCost R
          attackRequirement {}
          onAttack {

          }
        }
        move "Sacred Fire", {
          text "Flip a coin. If heads, choose 1 of your opponent's Pokémon. This attack does 40 damage to that Pokémon. Don't apply Weakness and Resistance."
          energyCost R, R, R
          attackRequirement {}
          onAttack {

          }
        }
        move "Dive Bomb", {
          text "90 damage. Flip a coin. If tails, this attack does nothing."
          energyCost R, R, R, R, R
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      }
      case HOUNDOOM_8:
      return evolution (this, from:"Houndour", hp:HP070, type:D, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Dark Flame", {
          text "20 damage. Discard 1 [R] Energy card attached to Houndoom or this attack does nothing. If there are any [D] Energy cards in your discard pile, attach 1 of them to Houndoom."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Black Fang", {
          text "30+ damage. Flip a number of coins equal to the number of [D] Energy attached to Houndoom. This attack does 30 damage plus 10 more damage for each heads."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case JUMPLUFF_9:
      return evolution (this, from:"Skiploom", hp:HP070, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Evolutionary Spore", {
          text "Choose any number of your Hoppips and Skiplooms. Then, for each Pokémon you chose in this way, you may search your deck for a card that evolves from that Pokémon and attach it to that Pokémon. (This counts as evolving those Pokémon.) Shuffle your deck afterward."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Solarbeam", {
          text "30 damage. "
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case MAGNETON_10:
      return evolution (this, from:"Magnemite", hp:HP080, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        pokePower "Electromagnetic Power", {
          text "As often as you like during your turn (before your attack), you may take 1 Energy card attached to 1 of your Magnemites, Magnetons, or Dark Magnetons and attach it to a different 1 of your Magnemites, Magnetons, or Dark Magnetons. This power can't be used if Magneton is affected by a Special Condition."
          actionA {
          }
        }
        move "Plasma", {
          text "30 damage. If there are any [L] Energy cards in your discard pile, attach 1 of them to Magneton."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case MISDREAVUS_11:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Night Eyes", {
          text "The Defending Pokémon is now Asleep."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Perish Song", {
          text "If the Defending Pokémon is Asleep and was attacked with Night Eyes during your last turn, it is Knocked Out."
          energyCost P, P, P
          attackRequirement {}
          onAttack {

          }
        }
      }
      case PORYGON2_12:
      return evolution (this, from:"Porygon", hp:HP070, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        pokePower "Energy Converter", {
          text "Once during your turn (before your attack), you may choose 1 basic Energy card attached to 1 of your Pokémon and choose an Energy type. Treat that Energy card as that type until the end of your turn. This power can't be used if Porygon2 is affected by a Special Condition. If Porygon2 becomes affected by a Special Condition, the Energy card goes back to its original type."
          actionA {
          }
        }
        move "Delta Beam", {
          text "20 damage. Flip a coin. If heads, choose whether the Defending Pokémon becomes Asleep, Confused, or Paralyzed."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case RAIKOU_13:
      return basic (this, hp:HP070, type:L, retreatCost:1) {
        weakness F
        pokeBody "Lightning Burst", {
          text "Whenever you attach a [L] Energy card from your hand to Raikou, if your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. This power stops working while Raikou is affected by a Special Condition."
          delayedA {
          }
        }
        move "Lightning Tackle", {
          text "40 damage. Flip a coin. If tails, Raikou does 20 damage to itself."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case SUICUNE_14:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        pokeBody "Crystal Body", {
          text "Prevent all effects of your opponent's attacks, other than damage, done to Suicune. This power stops working while Suicune is affected by a Special Condition."
          delayedA {
          }
        }
        move "Aurora Wave", {
          text "30 damage. Flip 2 coins. If both are heads, the Defending Pokémon is now Paralyzed. If only 1 is heads, the Defending Pokémon is now Asleep."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case AERODACTYL_15:
      return evolution (this, from:"Mysterious Fossil", hp:HP060, type:F, retreatCost:2) {
        weakness G
        resistance F, MINUS30
        pokeBody "Prehistoric Memory", {
          text "Whenever an Evolved Pokémon attacks (even if it's your opponent's), it can use any attack from its Basic Pokémon card or any Evolution card attached to it. It still has to pay for that attack's Energy cost. This power stops working while Aerodactyl is affected by a Special Condition."
          delayedA {
          }
        }
        move "Fly", {
          text "30 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Aerodactyl. If tails, this attack does nothing (not even damage)."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case CELEBI_16:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Psychic Leaf", {
          text "10+ damage. Flip a coin for each Energy attached to the Defending Pokémon. This attack does 10 damage plus 10 more damage for each heads. Remove a number of damage counters from Celebi equal to the damage done to the Defending Pokémon (after applying Weakness and Resistance). If Celebi has fewer damage counters than that, remove all of them."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case ENTEI_17:
      return basic (this, hp:HP060, type:R, retreatCost:0) {
        weakness W
        pokeBody "Legendary Body", {
          text "As long as Entei is your Active Pokémon, Entei and Energy cards attached to it aren't affected by effects from Trainer cards other than Stadium cards. As long as this power is active, discard any Trainer cards attached to Entei. (This power works even if Entei is affected by a Special Condition.)"
          legendaryBody(delegate)
        }
        move "Mega Flame", {
          text "50 damage. Flip 2 coins. For each tails, discard 1 [R] Energy card from Entei, if it has any."
          energyCost R, R, R
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      }
      case HO_OH_18:
      return basic (this, hp:HP090, type:C, retreatCost:2) {
        weakness W
        resistance F, MINUS30
        move "Rainbow Burn", {
          text "30+ damage. This attack does 30 damage plus 10 more damage for each type of Basic Energy card, if any, attached to Ho-Oh."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case KINGDRA_19:
      return evolution (this, from:"Seadra", hp:HP090, type:W, retreatCost:2) {
        weakness L
        move "Genetic Memory", {
          text "Use any attack from Kingdra's Basic Pokémon card or Evolution card. (Kingdra doesn't have to pay for that attack's Energy cost.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Twister", {
          text "50 damage. Flip 2 coins. For each heads, choose 1 Energy card attached to the Defending Pokémon, if any, and discard it. If both are tails, this attack does nothing (not even damage)."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      }
      case LUGIA_20:
      return basic (this, hp:HP090, type:P, retreatCost:2) {
        weakness P
        resistance F, MINUS30
        move "Aerowing", {
          text "40 damage. You may flip a coin. If heads, this attack does 80 damage. If tails, this attack does nothing."
          energyCost C, C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case RAICHU_21:
      return evolution (this, from:"Pikachu", hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Thundershock", {
          text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost L, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Lightning Strike", {
          text "40 damage. You may discard all [L] Energy cards attached to Raichu. If you do, this attack does 80 damage."
          energyCost L, L, L
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case RAIKOU_22:
      return basic (this, hp:HP060, type:L, retreatCost:0) {
        weakness F
        pokeBody "Legendary Body", {
          text "As long as Raikou is your Active Pokémon, Raikou and Energy cards attached to it aren't affected by effects from Trainer cards other than Stadium cards. As long as this power is active, discard any Trainer cards attached to Raikou. (This power works even if Raikou is affected by a Special Condition.)"
          legendaryBody(delegate)
        }
        move "Lightning Spark", {
          text "30 damage. If your opponent has any Benched Pokémon, flip a coin. If heads, choose 1 of them and this attack does 20 damage to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, L, L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case SKARMORY_23:
      return basic (this, hp:HP060, type:M, retreatCost:2) {
        weakness R
        resistance G, MINUS30
        move "Fury Attack", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Agility", {
          text "20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all effects of attacks, including damage, done to Skarmory."
          energyCost M, C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case SNEASEL_24:
      return basic (this, hp:HP060, type:D, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        move "Swipe", {
          text "Flip a coin. If heads, discard all Trainer cards attached to your opponent's Pokémon."
          energyCost D
          attackRequirement {}
          onAttack {

          }
        }
        move "Quick Attack", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case STARMIE_25:
      return evolution (this, from:"Staryu", hp:HP070, type:P, retreatCost:1) {
        weakness P
        move "Confuse Ray", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Core Stream", {
          text "20 damage. Choose an Energy type other than [C]. This attack does 20 damage to each of your opponent's Pokémon with any Energy cards of that type attached to it. Don't apply Weakness and Resistance."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case SUDOWOODO_26:
      return basic (this, hp:HP060, type:F, retreatCost:3) {
        weakness W
        pokeBody "Mimic", {
          text "As long as Sudowoodo is your Active Pokémon, it copies all of the Defending Pokémon's attacks, including their costs. This power can't be used if Sudowoodo is affected by a Special Condition."
          delayedA {
          }
        }
        move "Slam", {
          text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case SUICUNE_27:
      return basic (this, hp:HP060, type:W, retreatCost:0) {
        weakness L
        pokeBody "Legendary Body", {
          text "As long as Suicune is your Active Pokémon, Suicune and Energy cards attached to it aren't affected by effects from Trainer cards other than Stadium cards. As long as this power is active, discard any Trainer cards attached to Suicune. (This power works even if Suicune is affected by a Special Condition.)"
          legendaryBody(delegate)
        }
        move "Crystal Wave", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage. If tails, this attack does 30 damage and, if your opponent has any Benched Pokémon, he or she chooses 1 of them and switches it with the Defending Pokémon. (Do the damage before switching the Pokémon.)"
          energyCost W, W, W
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case FLAAFFY_28:
      return evolution (this, from:"Mareep", hp:HP070, type:L, retreatCost:1) {
        weakness F
        move "Electric Punch", {
          text "20 damage. "
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Tail Shock", {
          text "30 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case GOLBAT_29:
      return evolution (this, from:"Zubat", hp:HP060, type:G, retreatCost:0) {
        weakness P
        resistance F, MINUS30
        move "Screech", {
          text "Until the end of your next turn, if an attack damages the Defending Pokémon (after applying Weakness and Resistance), that attack does 20 more damage to the Defending Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Poison Bite", {
          text "10 damage. If this attack damages the Defending Pokémon, the Defending Pokémon is now Poisoned and you remove a number of damage counters from Golbat equal to half that damage (rounded up to the nearest 10). If Golbat has fewer damage counters than that, remove all of them. Either way, the Defending Pokémon is now Poisoned."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case GRAVELER_30:
      return evolution (this, from:"Geodude", hp:HP070, type:F, retreatCost:2) {
        weakness G
        move "Earthquake", {
          text "40 damage. Does 10 damage to each of your own Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Rock Tumble", {
          text "50 damage. Don't apply Resistance."
          energyCost F, F, F
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      }
      case JYNX_31:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness M
        move "Freezing Kiss Goodnight", {
          text "The Defending Pokémon is now Asleep."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Strange Dance", {
          text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage and the Defending Pokémon is now Confused. If tails, this attack does 20 damage."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case LANTURN_32:
      return evolution (this, from:"Chinchou", hp:HP080, type:L, retreatCost:2) {
        weakness F
        pokePower "Submerge", {
          text "Once during your turn (before your attack), you may change Lanturn's type to [W] until the end of your turn. This power can't be used if Lanturn is affected by a Special Condition. If Lanturn becomes affected by a Special Condition after you have used this power, its type changes back to [L]."
          actionA {
          }
        }
        move "Blinding Light", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case MAGCARGO_33:
      return evolution (this, from:"Slugma", hp:HP080, type:R, retreatCost:3) {
        weakness W
        pokeBody "Magma Pool", {
          text "If Magcargo is your Active Pokémon and moves to the Bench, remove 1 [R] Energy card attached to Magcargo, if any, and attach it to the new Active Pokémon. (You can't choose an Energy card that you used to pay the Retreat Cost.)"
          delayedA {
          }
        }
        move "Lava Flow", {
          text "40+ damage. You may discard any number of [R] Energy cards attached to Magcargo when you use this attack. If you do, this attack does 40 damage plus 20 more damage for each [R] Energy card you discarded in this way."
          energyCost R, R, R
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case OCTILLERY_34:
      return evolution (this, from:"Remoraid", hp:HP080, type:W, retreatCost:2) {
        weakness L
        move "Constrict", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Octazooka", {
          text "40 damage. Flip a coin. If heads, whenever the Defending Pokémon attacks, your opponent flips a coin. If tails, that attack does nothing. (Benching or evolving that Pokémon ends this effect.)"
          energyCost W, W, W, W
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case PARASECT_35:
      return evolution (this, from:"Paras", hp:HP060, type:G, retreatCost:2) {
        weakness R
        pokeBody "Allergic Pollen", {
          text "As long as Parasect is in play, cards in any player's discard piles are not affected by attacks or Poké-Powers. This power stops working if Parasect becomes affected by a Special Condition."
          delayedA {
          }
        }
        move "Sleep Pinchers", {
          text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost G, G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case PILOSWINE_36:
      return evolution (this, from:"Swinub", hp:HP090, type:F, retreatCost:3) {
        weakness G
        resistance L, MINUS30
        move "Nap", {
          text "Remove 3 damage counters from Piloswine. If it has fewer damage counters than that, remove all of them."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "High-Speed Charge", {
          text "80 damage. Piloswine does 30 damage to itself. Piloswine can't use this attack during your next turn."
          energyCost F, F, F, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      }
      case SEAKING_37:
      return evolution (this, from:"Goldeen", hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Rising Lunge", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage. If tails, this attack does 10 damage."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Horn Swipe", {
          text "20+ damage. Flip 2 coins. If both are heads, this attack does 20 damage plus 40 more damage. If 1 or both of them are tails, this attack does 20 damage."
          energyCost W, W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case STANTLER_38:
      return basic (this, hp:HP060, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Terrorize", {
          text "If the Defending Pokémon is a Basic Pokémon, choose 1 of its attacks. That Pokémon can't use that attack during your opponent's next turn."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Overhead Toss", {
          text "30 damage. If you have any Benched Pokémon, flip a coin. If tails, this attack does 10 damage to 1 of them. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case UNOWN_B_39:
      return basic (this, hp:HP050, type:P, retreatCost:1) {
        weakness P
        pokePower "Bear", {
          text "Once during your turn (before your attack), you may move 1 damage counter from 1 of your Pokémon with Unown in its name to Unown B. This power can't be used if Unown B has 10 HP left. This power can be used even if Unown B is affected by a Special Condition."
          actionA {
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case UNOWN_Y_40:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokePower "Yield", {
          text "Once during your turn (before your attack), you may flip a coin. If heads, search your deck for a [P] Energy card and attach it to 1 of your Pokémon with Unown in its name. Shuffle your deck afterward. This power can be used even if Unown Y is affected by a Special Condition."
          actionA {
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case AIPOM_41:
      return basic (this, hp:HP040, type:C, retreatCost:0) {
        weakness F
        resistance P, MINUS30
        move "Grab", {
          text "Choose a Trainer card attached to 1 of your opponent's Pokémon. Your opponent shuffles that card into his or her deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Tail Punch", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case CHINCHOU_42:
      return basic (this, hp:HP050, type:L, retreatCost:1) {
        weakness F
        move "Positive Ion", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage. If tails, this attack does 10 damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Negative Ion", {
          text "10 damage. If the Defending Pokémon attacks Chinchou during your opponent's next turn, any damage done to Chinchou is reduced by 10 (before applying Weakness and Resistance). (Benching or evolving either Pokémon ends this effect.)"
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case FARFETCH_D_43:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness L
        resistance F, MINUS30
        move "Gust", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Leek Jab", {
          text "40 damage. This attack can't be used during your next turn. (Benching Farfetch'd ends this effect.)"
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case GEODUDE_44:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness G
        move "Knuckle Punch", {
          text "20 damage. "
          energyCost F
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case GOLDEEN_45:
      return basic (this, hp:HP040, type:W, retreatCost:0) {
        weakness L
        move "Fin Smack", {
          text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case MURKROW_46:
      return basic (this, hp:HP060, type:D, retreatCost:0) {
        weakness L
        resistance P, MINUS30
        move "Call for Family", {
          text "Search your deck for a Basic Pokémon card named Murkrow and put it onto your Bench. Shuffle your deck afterward. (You can't use this attack if your Bench is full.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Flock Attack", {
          text "10+ damage. Flip a number of coins equal to the number of Murkrows on your Bench. This attack does 10 damage plus 10 more damage for each heads."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case PARAS_47:
      return basic (this, hp:HP040, type:G, retreatCost:1) {
        weakness R
        move "Sleep Spore", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Scratch", {
          text "20 damage. "
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case QUAGSIRE_48:
      return evolution (this, from:"Wooper", hp:HP070, type:W, retreatCost:2) {
        weakness G
        resistance L, MINUS30
        move "Mud Slap", {
          text "30 damage. "
          energyCost F, F
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Whirlpool", {
          text "40 damage. If the Defending Pokémon has any Energy cards attached to it, choose 1 of them and discard it."
          energyCost W, W, C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      }
      case QWILFISH_49:
      return basic (this, hp:HP060, type:W, retreatCost:1) {
        weakness L
        move "Poison Sting", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Needle Storm", {
          text "20x damage. Flip a coin until you get tails. This attack does 20 damage times the number of heads you get."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case REMORAID_50:
      return basic (this, hp:HP040, type:W, retreatCost:0) {
        weakness L
        move "Sharpshooting", {
          text "Flip a coin. If heads, choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. Don't apply Weakness and Resistance."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
      }
      case SHUCKLE_51:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness W
        pokeBody "Hard Shell", {
          text "Whenever an attack (including your own) does 40 or less damage to Shuckle (after applying Weakness and Resistance), reduce that damage to 10. (Any other effects of attacks still happen.) This power stops working while Shuckle is affected by a Special Condition."
          delayedA {
          }
        }
        move "Toxic Saliva", {
          text "Flip a coin. If heads, the Defending Pokémon is now Poisoned. It now takes 20 Poison damage instead of 10 after each player's turn (even if it was already Poisoned)."
          energyCost G, G
          attackRequirement {}
          onAttack {

          }
        }
      }
      case SKIPLOOM_52:
      return evolution (this, from:"Hoppip", hp:HP060, type:G, retreatCost:0) {
        weakness R
        resistance F, MINUS30
        move "Hop", {
          text "20 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Mysterious Powder", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case SLUGMA_53:
      return basic (this, hp:HP050, type:R, retreatCost:2) {
        weakness W
        move "Flare", {
          text "10 damage. "
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Magma Ring", {
          text "20 damage. The Defending Pokémon can't retreat during your opponent's next turn."
          energyCost R, R
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      }
      case SMOOCHUM_54:
      return baby (this, successors:'SUCCESSOR(S)', hp:HP030, type:P, retreatCost:0) {
        move "Psykiss", {
          text "Flip a coin. If heads, choose a Special Energy card attached to 1 of your opponent's Pokémon. Your opponent shuffles that card into his or her deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
      }
      case SNUBBULL_55:
      return basic (this, hp:HP050, type:C, retreatCost:1) {
        weakness F
        resistance P, MINUS30
        move "Bite", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Raging Headbutt", {
          text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 damage times the number of damage counters on Snubbull. If tails, this attack does 10 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case STARYU_56:
      return basic (this, hp:HP040, type:W, retreatCost:1) {
        weakness L
        move "Tackle", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Bubblebeam", {
          text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case SWINUB_57:
      return basic (this, hp:HP040, type:F, retreatCost:1) {
        weakness G
        resistance L, MINUS30
        move "Tackle", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Take Down", {
          text "30 damage. Swinub does 10 damage to itself."
          energyCost F, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case UNOWN_K_58:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness P
        pokeBody "Keep", {
          text "Your opponent's attacks, Poké-Powers, and Trainer cards can't discard Energy cards from your Pokémon with Unown in their names. (Any other effects still happen.)"
          delayedA {
          }
        }
        move "Hidden Power", {
          text "10 damage. "
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case ZUBAT_59:
      return basic (this, hp:HP040, type:G, retreatCost:0) {
        weakness P
        resistance F, MINUS30
        move "Bite", {
          text "10 damage. "
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Poison Spray", {
          text "10 damage. The Defending Pokémon is now Poisoned."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      }
      case VIRIDIAN_FOREST_60:
      return stadium (this) {
        text "Once during each player's turn, that player may discard a card from their hand. If they do, that player searches their deck for a basic Energy card, shows it to their opponent, and puts it into their hand. Then, that player shuffles their deck."
        onPlay {
        }
        onRemoveFromPlay{
        }
      }
      case HIGH_PRESSURE_SYSTEM_61:
      return stadium (this) {
        text "Each player pays [C] less to retreat his or her [R] and [W] Pokémon."
        onPlay {
        }
        onRemoveFromPlay{
        }
      }
      case POKEMON_BREEDER_FIELDS_62:
      return basicTrainer (this) {
        text "Flip a coin for 1 or 2 of your non-Baby Pokémon that can evolve. For each heads, search your deck for a later-Stage card that matches that Pokémon. Then put that card into your hand. Shuffle your deck afterward."
        onPlay {
        }
        playRequirement{
        }
      }
      case HEAVY_PRESSURE_SYSTEM_63:
      return stadium (this) {
        text "Any damage done by attacks from [P] Pokémon and [F] Pokémon (both yours and your opponent's) is not affected by Resistance."
        onPlay {
        }
        onRemoveFromPlay{
        }
      }
      case LOW_PRESSURE_SYSTEM_64:
      return stadium (this) {
        text "Each [G] and [L] Pokémon in play (both yours and your opponent's) gets +10 HP."
        onPlay {
        }
        onRemoveFromPlay{
        }
      }
      case SHINING_GYARADOS_65:
      return basic (this, hp:HP100, type:W, retreatCost:3) {
        weakness L
        resistance F, MINUS30
        move "Outrage", {
          text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage for each damage counter on Shining Gyarados. If tails, this attack does nothing."
          energyCost W, F, F
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Devastate", {
          text "50 damage. Discard 2 [R] Energy cards attached to Shining Gyarados or this attack does nothing. This attack does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) Then, flip a coin. If heads, choose 1 Energy card attached to each of your opponent's Pokémon that has any Energy cards attached to it and discard those Energy cards."
          energyCost W, W, R, R
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      }
      case SHINING_MAGIKARP_66:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Gold Scale", {
          text "Your opponent may draw 2 cards. Either way, you may draw 2 cards."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Dragon Bond", {
          text "Search your deck for a card named Gyarados, Dark Gyarados, or Shining Gyarados. Show it to your opponent and put it into your hand. Shuffle your deck afterward."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      }
      case CELEBI_EX_67:
      return basic (this, hp:HP070, type:G, retreatCost:1) {
        weakness R
        move "Spiral Leaf", {
          text "Flip a coin. If heads, put 1 damage counter on each of your opponent's Pokémon. If tails, remove 1 damage counter from each of your Pokémon."
          energyCost G
          attackRequirement {}
          onAttack {

          }
        }
        move "Time Trap", {
          text "30 damage. Flip a coin. If heads, look at the top 4 cards of your opponent's deck, and put them back on top of your opponent's deck in any order. If tails, look at the top 4 cards of your deck, and put them back on top of your deck in any order."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case HO_OH_EX_68:
      return basic (this, hp:HP100, type:R, retreatCost:2) {
        weakness W
        pokePower "Golden Wing", {
          text "If Ho-Oh ex would be Knocked Out by damage from an opponent's attack, you may move up to 2 Energy attached to Ho-Oh ex to your Pokémon in any way you like."
          actionA {
          }
        }
        move "Rainbow Burn", {
          text "30+ damage. Does 30 damage plus 10 more damage for each type of basic Energy card attached to Ho-Oh ex."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      }
      case LUGIA_EX_69:
      return basic (this, hp:HP100, type:C, retreatCost:1) {
        weakness P
        resistance F, MINUS30
        pokeBody "Silver Sparkle", {
          text "If Lugia ex is your Active Pokémon and is damaged by an opponent's attack (even if Lugia ex is Knocked Out), flip a coin. If heads, choose an Energy card attached to the Attacking Pokémon and return it to your opponent's hand."
          delayedA {
          }
        }
        move "Elemental Blast", {
          text "200 damage. Discard a [R] Energy, [W] Energy, and [L] Energy attached to Lugia ex."
          energyCost R, W, L
          attackRequirement {}
          onAttack {
            damage 200
          }
        }
      }
      case SCIZOR_EX:
      return evolution (this, from:"Scyther", hp:HP100, type:C, retreatCost:1) {
        weakness R
        resistance G, MINUS30
        pokeBody "Danger Perception", {
          text "As long as Scizor ex's remaining HP is 50 or less, Scizor ex does 10 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
          delayedA {
          }
        }
        move "Steel Wing", {
          text "30 damage. During your opponent's next turn, any damage done to Scizor ex by attacks is reduced by 10 (after applying Weakness and Resistance)."
          energyCost M, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Cross-Cut", {
          text "50+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 40 damage plus 20 more damage."
          energyCost M, M, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      }
        default:
      return null
    }
  }
}
