package tcgwars.logic.impl.gen8


import static tcgwars.logic.card.Type.*
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*

import tcgwars.logic.card.*

/**
 * @author
 */
public enum PokemonGo implements ImplOnlyCardInfo {

  BULBASAUR_1,
  IVYSAUR_2,
  VENUSAUR_3,
  RADIANT_VENUSAUR_4,
  ALOLAN_EXEGGUTOR_V_5,
  SPINARAK_6,
  ARIADOS_7,
  CHARMANDER_8,
  CHARMELEON_9,
  CHARIZARD_10,
  RADIANT_CHARIZARD_11,
  MOLTRES_12,
  NUMEL_13,
  CAMERUPT_14,
  SQUIRTLE_15,
  WARTORTLE_16,
  BLASTOISE_17,
  RADIANT_BLASTOISE_18,
  SLOWPOKE_19,
  SLOWBRO_20,
  MAGIKARP_21,
  GYARADOS_22,
  LAPRAS_23,
  ARTICUNO_24,
  WIMPOD_25,
  GOLISOPOD_26,
  PIKACHU_27,
  PIKACHU_28,
  ZAPDOS_29,
  MEWTWO_V_30,
  MEWTWO_VSTAR_31,
  NATU_32,
  XATU_33,
  LUNATONE_34,
  SYLVEON_35,
  ONIX_36,
  LARVITAR_37,
  PUPITAR_38,
  SOLROCK_39,
  CONKELDURR_V_40,
  ALOLAN_RATTATA_41,
  ALOLAN_RATICATE_42,
  TYRANITAR_43,
  STEELIX_44,
  MELTAN_45,
  MELMETAL_46,
  MELMETAL_V_47,
  MELMETAL_VMAX_48,
  DRAGONITE_V_49,
  DRAGONITE_VSTAR_50,
  CHANSEY_51,
  BLISSEY_52,
  DITTO_53,
  EEVEE_54,
  SNORLAX_55,
  AIPOM_56,
  AMBIPOM_57,
  SLAKING_V_58,
  BIDOOF_59,
  BIBAREL_60,
  PIDOVE_61,
  TRANQUILL_62,
  UNFEZANT_63,
  BLANCHE_64,
  CANDELA_65,
  EGG_INCUBATOR_66,
  LURE_MODULE_67,
  POKESTOP_68,
  RARE_CANDY_69,
  SPARK_70,
  ALOLAN_EXEGGUTOR_V_71,
  MEWTWO_V_72,
  CONKELDURR_V_73,
  CONKELDURR_V_74,
  MELMETAL_V_75,
  DRAGONITE_V_76,
  SLAKING_V_77,
  PROFESSOR_S_RESEARCH_78,
  MEWTWO_VSTAR_79,
  MELMETAL_VMAX_80,
  DRAGONITE_VSTAR_81,
  BLANCHE_82,
  CANDELA_83,
  PROFESSOR_S_RESEARCH_84,
  SPARK_85,
  MEWTWO_VSTAR_86,
  EGG_INCUBATOR_87,
  LURE_MODULE_88
;

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  @Override
  public String toEnumId() {
    return name()+":POKEMON_GO";
  }

  @Override
  public Card getImplementation(EnhancedCardInfo stub) {
    switch (this) {




      case IVYSAUR_2: return cardng (stub) {
        moveAttack "Summoning Aroma", {
          // Search your deck for up to 2 Pokémon, reveal them, and put them into your hand. Then, shuffle your deck.

        }
        moveAttack "Razor Leaf", {
          // 60 damage.
          damage 60
        }
      }



      case VENUSAUR_3: return cardng (stub) {
      bwAbility "Loopy Lasso", {
        // Once during your turn, you may flip a coin. If heads, switch 1 of your opponent's Benched Pokémon with their Active Pokémon, and the new Active Pokémon is now Asleep and Poisoned.
        actionA {
          checkLastTurn()
          assert opp.bench : "No opponent bench"
          powerUsed()
          flip {
            def newActive = opp.bench.select("Select a Pokémon to switch with the Active Pokémon")
            sw opp.active, newActive
            apply ASLEEP, opp.active
            apply POISONED, opp.active
          }
        }
      }
        moveAttack "Solar Beam", {
          // 130 damage.
          damage 130
        }
      }



      case RADIANT_VENUSAUR_4: return cardng (stub) {
      bwAbility "Sunny Bloom", {
        // Once at the end of your turn (after your attack), you may use this Ability. Draw cards until you have 4 cards in your hand.
        delayedA {
          before BETWEEN_TURNS, {
            if (bg.currentTurn == self.owner && self.owner.pbg.hand.size() < 4 && confirm("Use Sunny Bloom to draw cards?")) {
              def cardsToDraw = 4 - self.owner.pbg.hand.size()
              draw cardsToDraw, self.owner
              bc "Sunny Bloom: drew $cardsToDraw cards"
            }
          }
        }
      }
      moveAttack "Pollen Hazard", {
        // 90 damage. Your opponent's Active Pokémon is now Burned, Confused, and Poisoned.
        damage 90
        afterDamage {
          apply BURNED, defending
          apply CONFUSED, defending
          apply POISONED, defending
        }
      }
      }





      case SPINARAK_6: return cardng (stub) {
        moveAttack "Poison Sting", {
          // 10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Poisoned.
          damage 10
        }
      }



      case ARIADOS_7: return cardng (stub) {
        moveAttack "Poison String-Up", {
          // 20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed and Poisoned.
          damage 20
        }
        moveAttack "Absorb", {
          // 50 damage. Heal 50 damage from this Pokémon.
          damage 50
        }
      }





      case CHARMELEON_9: return cardng (stub) {
        moveAttack "Scratch", {
          // 30 damage.
          damage 30
        }
        moveAttack "Flamethrower", {
          // 100 damage. Discard a [R] Energy from this Pokémon.
          damage 100
        }
      }



      case CHARIZARD_10: return cardng (stub) {
        bwAbility "Burn Brightly", {
          // Each basic [R] Energy attached to your Pokémon provides Fire[R] Energy. You can't apply more than 1 Burn Brightly Ability at a time.
          actionA {
          }
        }
        moveAttack "Flare Blitz", {
          // 170 damage. Discard all [R] Energy from this Pokémon.
          damage 170
        }
      }



      case RADIANT_CHARIZARD_11: return cardng (stub) {
        bwAbility "Excited Heart", {
          // This Pokémon's attacks cost [C] less for each Prize card your opponent has taken.
          actionA {
          }
        }
        moveAttack "Combustion Blast", {
          // 250 damage. During your next turn, this Pokémon can't use Combustion Blast.
          damage 250
        }
      }



      case MOLTRES_12: return cardng (stub) {
        bwAbility "Flare Symbol", {
          // Your Basic [R] Pokémon's attacks, except any Moltres, do 10 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance).
          actionA {
          }
        }
        moveAttack "Fire Wing", {
          // 110 damage.
          damage 110
        }
      }



      case NUMEL_13: return cardng (stub) {
        moveAttack "Tackle", {
          // 20 damage.
          damage 20
        }
        moveAttack "Stomp", {
          // 50+ damage. Flip a coin. If heads, this attack does 50 more damage.
          damage 50
        }
      }



      case CAMERUPT_14: return cardng (stub) {
        moveAttack "Split Bomb", {
          // This attack does 50 damage to 2 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

        }
        moveAttack "Heat Blast", {
          // 120 damage.
          damage 120
        }
      }





      case WARTORTLE_16: return cardng (stub) {
        moveAttack "Water Gun", {
          // 30 damage.
          damage 30
        }
        moveAttack "Hydro Pump", {
          // 50+ damage. This attack does 10 more damage for each [W] Energy attached to this Pokémon.
          damage 50
        }
      }



      case BLASTOISE_17: return cardng (stub) {
        bwAbility "Vitality Spring", {
          // Once during your turn, you may search your deck for up to 6 Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck. If you use this Ability, your turn ends.
          actionA {
          }
        }
        moveAttack "Hydro Pump", {
          // 90+ damage. This attack does 30 more damage for each [W] Energy attached to this Pokémon.
          damage 90
        }
      }



      case RADIANT_BLASTOISE_18: return cardng (stub) {
        bwAbility "Pump Shot", {
          // You must discard a [W] Energy card from your hand in order to use this Ability. Once during your turn, you may put 2 damage counters on 1 of your opponent's Benched Pokémon.
          actionA {
          }
        }
        moveAttack "Torrential Cannon", {
          // 170 damage. During your next turn, this Pokémon can't use Torrential Cannon.
          damage 170
        }
      }



      case SLOWPOKE_19: return cardng (stub) {
        moveAttack "Hold Still", {
          // Heal 30 damage from this Pokémon.

        }
        moveAttack "Ideal Fishing Day", {
          // Put an Item card from your discard pile into your hand.

        }
      }



      case SLOWBRO_20: return cardng (stub) {
        moveAttack "Tumbling Tackle", {
          // 20 damage. Both Active Pokémon are now Asleep.
          damage 20
        }
        moveAttack "Twilight Inspiration", {
          // You can use this attack only if your opponent has exactly 1 Prize card remaining. Take 2 Prize cards.

        }
      }



      case MAGIKARP_21: return cardng (stub) {
        moveAttack "Lively Grouping", {
          // Search your deck for any number of Magikarp, reveal them, and put them into your hand. Then, shuffle your deck.

        }
        moveAttack "Raging Fin", {
          // 10+ damage. This attack does 30 more damage for each Magikarp and Gyarados in your discard pile.
          damage 10
        }
      }



      case GYARADOS_22: return cardng (stub) {
        moveAttack "Wreak Havoc", {
          // Flip a coin until you get tails. For each heads, discard the top 2 cards of your opponent's deck.

        }
        moveAttack "Wild Splash", {
          // 230 damage. Discard the top 5 cards of your deck.
          damage 230
        }
      }



      case LAPRAS_23: return cardng (stub) {
        moveAttack "Ice Beam", {
          // 20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
          damage 20
        }
        moveAttack "Surf", {
          // 110 damage.
          damage 110
        }
      }



      case ARTICUNO_24: return cardng (stub) {
        bwAbility "Ice Symbol", {
          // Your Basic [W] Pokémon's attacks, except any Articuno, do 10 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance).
          actionA {
          }
        }
        moveAttack "Freezing Wind", {
          // 110 damage.
          damage 110
        }
      }



      case WIMPOD_25: return cardng (stub) {
        bwAbility "Punk Out", {
          // If your opponent has any Pokémon V in play, this Pokémon has no Retreat Cost.
          actionA {
          }
        }
        moveAttack "Gnaw", {
          // 10 damage.
          damage 10
        }
      }



      case GOLISOPOD_26: return cardng (stub) {
        moveAttack "First Impression", {
          // 20+ damage. If this Pokémon moved from your Bench to the Active Spot this turn, this attack does 90 more damage.
          damage 20
        }
        moveAttack "Slash", {
          // 100 damage.
          damage 100
        }
      }



      case PIKACHU_27: return cardng (stub) {
        moveAttack "Buddy Bolt", {
          // 30+ damage. If you played a Supporter card from your hand during this turn, this attack does 30 more damage.
          damage 30
        }
      }



      case PIKACHU_28: return cardng (stub) {
        moveAttack "Wild Charge", {
          // 90 damage. This Pokémon also does 30 damage to itself.
          damage 90
        }
      }



      case ZAPDOS_29: return cardng (stub) {
        bwAbility "Lightning Symbol", {
          // Your Basic [L] Pokémon's attacks, except any Zapdos, do 10 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance).
          actionA {
          }
        }
        moveAttack "Electric Ball", {
          // 110 damage.
          damage 110
        }
      }





      case MEWTWO_VSTAR_31: return cardng (stub) {
      moveFull "Psy Purge", {
        // 90x damage. Discard up to 3 [P] Energy from your Pokémon. This attack does 90 damage for each card you discarded in this way.
        attackRequirement {
          assert my.all.findAll {it.cards.filterByEnergyType(P).notEmpty()}
        }
        onAttack {
          int count=0
          def first=true
          while (count < 3) {
            def pcs = my.all.findAll {it.cards.filterByEnergyType(P).notEmpty()}.select("Pokemon that has [P] energy to discard. Cancel to stop after first one", first)
            first = false
            if (!pcs) break
            pcs.cards.filterByEnergyType(P).select("[P] Energy to discard").discard()
            count++
          }
          damage 90 * count
        }
      }
      moveFull "Star Raid", {
        // This attack does 120 damage to each of your opponent's Pokémon V. This damage isn't affected by Weakness or Resistance. (You can't use more than 1 VSTAR Power in a game.)
        attackRequirement {
          assert opp.all.findAll {it.pokemonV} : "No opponent Pokémon V"
        }
        onAttack {
          vStarCheck()
          vStarPerform()
          opp.all.findAll{it.pokemonV}.each {
            noWrDamage 120, it
          }
        }
      }
      }



      case NATU_32: return cardng (stub) {
        moveAttack "Nap", {
          // Heal 20 damage from this Pokémon.

        }
        moveAttack "Peck", {
          // 20 damage.
          damage 20
        }
      }



      case XATU_33: return cardng (stub) {
        moveAttack "Pinpoint Wave", {
          // This attack does 90 damage to 1 of your opponent's Pokémon V. This damage isn't affected by Weakness or Resistance.

        }
        moveAttack "Mind Bend", {
          // 50 damage. Your opponent's Active Pokémon is now Confused.
          damage 50
        }
      }



      case LUNATONE_34: return cardng (stub) {
        moveAttack "Cycle Draw", {
          // Discard a card from your hand. If you do, draw 3 cards.

        }
        moveAttack "Moon Kinesis", {
          // 30+ damage. This attack does 30 more damage for each [P] Energy attached to this Pokémon.
          damage 30
        }
      }



      case SYLVEON_35: return cardng (stub) {
        moveAttack "Souvenir", {
          // Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck.

        }
        moveAttack "Wonder Flash", {
          // 90+ damage. If your opponent's Active Pokémon is a [N] Pokémon, this attack does 90 more damage.
          damage 90
        }
      }



      case ONIX_36: return cardng (stub) {
        moveAttack "Rock Tomb", {
          // 50 damage. During your opponent's next turn, the Defending Pokémon can't retreat.
          damage 50
        }
        moveAttack "Raging Swing", {
          // 50x damage. This attack does 50 damage for each damage counter on this Pokémon.
          damage 50
        }
      }



      case LARVITAR_37: return cardng (stub) {
        moveAttack "Rock Smash", {
          // 10+ damage. Flip a coin. If heads, this attack does 10 more damage.
          damage 10
        }
      }



      case PUPITAR_38: return cardng (stub) {
        moveAttack "Crashing Bullet", {
          // 20 damage. This attack also does 20 damage to each Benched Pokémon (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.)
          damage 20
        }
        moveAttack "Tackle", {
          // 70 damage.
          damage 70
        }
      }



      case SOLROCK_39: return cardng (stub) {
        bwAbility "Sun Energy", {
          // Once during your turn, you may attach a [P] Energy card from your discard pile to 1 of your Lunatone.
          actionA {
          }
        }
        moveAttack "Spinning Attack", {
          // 50 damage.
          damage 50
        }
      }



      case CONKELDURR_V_40: return cardng (stub) {
        moveAttack "Counter", {
          // 20+ damage. If this Pokémon was damaged by an attack during your opponent's last turn, this attack does that much more damage.
          damage 20
        }
        moveAttack "Dynamic Punch", {
          // 90+ damage. Flip a coin. If heads, this attack does 90 more damage, and your opponent's Active Pokémon is now Confused.
          damage 90
        }
      }



      case ALOLAN_RATTATA_41: return cardng (stub) {
        moveAttack "Hyper Fang", {
          // 50 damage. Flip a coin. If tails, this attack does nothing.
          damage 50
        }
      }



      case ALOLAN_RATICATE_42: return cardng (stub) {
        moveAttack "Chase Up", {
          // Search your deck for a card and put it into your hand. Then, shuffle your deck.

        }
        moveAttack "Super Fang", {
          // Put damage counters on your opponent's Active Pokémon until its remaining HP is 10.

        }
      }



      case TYRANITAR_43: return cardng (stub) {
        moveAttack "Raging Crash", {
          // 10x damage. This attack does 10 damage for each damage counter on all of your Benched Pokémon.
          damage 10
        }
        moveAttack "Earthquake", {
          // 180 damage. This attack also does 20 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
          damage 180
        }
      }



      case STEELIX_44: return cardng (stub) {
        moveAttack "Body Slam", {
          // 70 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
          damage 70
        }
        moveAttack "Iron Buster", {
          // 170 damage. During your next turn, this Pokémon can't attack.
          damage 170
        }
      }



      case MELTAN_45: return cardng (stub) {
        moveAttack "Thunder Shock", {
          // 20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
          damage 20
        }
      }



      case MELMETAL_46: return cardng (stub) {
        moveAttack "Headbutt", {
          // 60 damage.
          damage 60
        }
        moveAttack "Swinging Smash", {
          // 30+ damage. Flip 2 coins. This attack does 90 more damage for each heads.
          damage 30
        }
      }





      case MELMETAL_VMAX_48: return cardng (stub) {
        moveAttack "G-Max Juggernaut", {
          // 160+ damage. This attack does 60 more damage for each extra [M] Energy attached to this Pokémon (in addition to this attack's cost). You can't add more than 120 damage in this way.
          damage 160
        }
      }







      case CHANSEY_51: return cardng (stub) {
        moveAttack "Delicious Egg", {
          // Heal 30 damage from 1 of your Benched Pokémon.

        }
        moveAttack "Gentle Slap", {
          // 30 damage.
          damage 30
        }
      }



      case BLISSEY_52: return cardng (stub) {
        moveAttack "Enriching Egg", {
          // Heal all damage from 1 of your Benched Pokémon.

        }
        moveAttack "Zen Headbutt", {
          // 100 damage.
          damage 100
        }
      }



      case DITTO_53: return cardng (stub) {
        bwAbility "Sudden Transformation", {
          // This Pokémon can use the attacks of any Basic Pokémon in your discard pile, except for Pokémon with a Rule Box (Pokémon V, Pokémon-GX, etc. have Rule Boxes). (You still need the necessary Energy to use each attack.)
          actionA {
          }
        }

      }



      case EEVEE_54: return cardng (stub) {
        moveAttack "Whiny Voice", {
          // Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck.

        }
        moveAttack "Tackle", {
          // 20 damage.
          damage 20
        }
      }



      case SNORLAX_55: return cardng (stub) {
        bwAbility "Block", {
          // As long as this Pokémon is in the Active Spot, your opponent's Active Pokémon can't retreat.
          actionA {
          }
        }
        moveAttack "Collapse", {
          // 150 damage. This Pokémon is now Asleep.
          damage 150
        }
      }



      case AIPOM_56: return cardng (stub) {
        moveAttack "Bustle", {
          // Flip a coin. If heads, during your opponent's next turn, prevent all damage from and effects of attacks done to this Pokémon.

        }
        moveAttack "Slap", {
          // 30 damage.
          damage 30
        }
      }



      case AMBIPOM_57: return cardng (stub) {
        bwAbility "Primate Dexterity", {
          // If any damage is done to this Pokémon by attacks, flip a coin. If heads, prevent that damage.
          actionA {
          }
        }
        moveAttack "Full Tilt Fling", {
          // 60x damage. Flip a coin for each Energy attached to this Pokémon. This attack does 60 damage for each heads.
          damage 60
        }
      }



      case SLAKING_V_58: return cardng (stub) {
        bwAbility "Kinda Lazy", {
          // If you have exactly 2, 4, or 6 Prize cards remaining, this Pokémon can't attack.
          actionA {
          }
        }
        moveAttack "Heavy Impact", {
          // 260 damage.
          damage 260
        }
      }



      case BIDOOF_59: return cardng (stub) {
        moveAttack "Take Down", {
          // 50 damage. This Pokémon also does 10 damage to itself.
          damage 50
        }
      }



      case BIBAREL_60: return cardng (stub) {
        bwAbility "Reassuring Dam", {
          // As long as this Pokémon is on your Bench, cards in your deck can't be discarded by effects of your opponent's attacks, Abilities, Item cards, or Supporter cards.
          actionA {
          }
        }
        moveAttack "Hammer In", {
          // 80 damage.
          damage 80
        }
      }



      case PIDOVE_61: return cardng (stub) {
        moveAttack "Growl", {
          // During your opponent's next turn, the Defending Pokémon's attacks do 20 less damage (before applying Weakness and Resistance).

        }
        moveAttack "Flap", {
          // 20 damage.
          damage 20
        }
      }



      case TRANQUILL_62: return cardng (stub) {
        moveAttack "Aerial Ace", {
          // 20+ damage. Flip a coin. If heads, this attack does 20 more damage.
          damage 20
        }
        moveAttack "Flap", {
          // 30 damage.
          damage 30
        }
      }



      case UNFEZANT_63: return cardng (stub) {
        moveAttack "Gust", {
          // 30 damage.
          damage 30
        }
        moveAttack "Hurricane Wing", {
          // 70x damage. Flip 4 coins. This attack does 70 damage for each heads.
          damage 70
        }
      }







      case EGG_INCUBATOR_66: return cardng (stub) {
        // Flip a coin. If heads, search your deck for a Basic Pokémon, put it onto your Bench, and shuffle your deck. If tails, put this Egg Incubator on the bottom of your deck instead of in the discard pile.
        onPlay {
        }
        playRequirement{
        }
      }



      case LURE_MODULE_67: return cardng (stub) {
        // Each player reveals the top 3 cards of their deck and puts all Pokémon they find there into their hand. Then, each player shuffles the other cards back into their deck.
        onPlay {
        }
        playRequirement{
        }
      }



      case POKESTOP_68: return cardng (stub) {
        // Once during each player's turn, that player may discard 3 cards from the top of their deck. If a player discarded any Item cards in this way, they put those Item cards into their hand.
        onPlay {
        }
        onRemoveFromPlay{
        }
      }









































        default:
      return null;
    }
  }
}