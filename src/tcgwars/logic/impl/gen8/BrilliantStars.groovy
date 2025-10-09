package tcgwars.logic.impl.gen8

import static tcgwars.logic.card.Type.*
import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.EffectPriority.*

import tcgwars.logic.card.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*

/**
 * @author
 */
public enum BrilliantStars implements ImplOnlyCardInfo {

  EXEGGCUTE_1,
  EXEGGUTOR_2,
  SHROOMISH_3,
  BRELOOM_4,
  TROPIUS_5,
  TURTWIG_6,
  GROTLE_7,
  TORTERRA_8,
  BURMY_9,
  WORMADAM_10,
  MOTHIM_11,
  CHERUBI_12,
  SHAYMIN_V_13,
  SHAYMIN_VSTAR_14,
  KARRABLAST_15,
  ZARUDE_V_16,
  CHARIZARD_V_17,
  CHARIZARD_VSTAR_18,
  MAGMAR_19,
  MAGMORTAR_20,
  MOLTRES_21,
  ENTEI_V_22,
  TORKOAL_23,
  CHIMCHAR_24,
  MONFERNO_25,
  INFERNAPE_26,
  SIMISEAR_V_27,
  KINGLER_V_28,
  KINGLER_VMAX_29,
  STARYU_30,
  LAPRAS_31,
  CORPHISH_32,
  CRAWDAUNT_33,
  SNORUNT_34,
  PIPLUP_35,
  PRINPLUP_36,
  EMPOLEON_37,
  BUIZEL_38,
  FLOATZEL_39,
  LUMINEON_V_40,
  MANAPHY_41,
  CUBCHOO_42,
  BEARTIC_43,
  EISCUE_44,
  RAICHU_V_45,
  ELECTABUZZ_46,
  ELECTIVIRE_47,
  RAIKOU_V_48,
  SHINX_49,
  LUXIO_50,
  LUXRAY_51,
  PACHIRISU_52,
  CLEFAIRY_53,
  CLEFABLE_54,
  STARMIE_55,
  MEWTWO_56,
  GRANBULL_V_57,
  BALTOY_58,
  CLAYDOL_59,
  DUSKULL_60,
  DUSCLOPS_61,
  DUSKNOIR_62,
  CHIMECHO_63,
  WHIMSICOTT_V_64,
  WHIMSICOTT_VSTAR_65,
  SIGILYPH_66,
  DEDENNE_67,
  MIMIKYU_V_68,
  MIMIKYU_VMAX_69,
  MILCERY_70,
  ALCREMIE_71,
  HITMONTOP_72,
  NOSEPASS_73,
  TRAPINCH_74,
  VIBRAVA_75,
  FLYGON_76,
  WORMADAM_77,
  RIOLU_78,
  LUCARIO_79,
  THROH_80,
  SAWK_81,
  GOLETT_82,
  GOLURK_83,
  GRIMER_84,
  MUK_85,
  SNEASEL_86,
  WEAVILE_87,
  HONCHKROW_V_88,
  SPIRITOMB_89,
  PURRLOIN_90,
  LIEPARD_91,
  IMPIDIMP_92,
  MORGREM_93,
  GRIMMSNARL_94,
  MORPEKO_V_95,
  AGGRON_V_96,
  AGGRON_VMAX_97,
  WORMADAM_98,
  PROBOPASS_99,
  HEATRAN_100,
  ESCAVALIER_101,
  KLINK_102,
  KLANG_103,
  KLINKLANG_104,
  ZAMAZENTA_V_105,
  FLYGON_V_106,
  GIBLE_107,
  GABITE_108,
  GARCHOMP_109,
  AXEW_110,
  FRAXURE_111,
  HAXORUS_112,
  DRUDDIGON_113,
  DRACOVISH_V_114,
  FARFETCH_D_115,
  CASTFORM_116,
  STARLY_117,
  STARAVIA_118,
  STARAPTOR_119,
  BIDOOF_120,
  BIBAREL_121,
  ARCEUS_V_122,
  ARCEUS_VSTAR_123,
  MINCCINO_124,
  CINCCINO_125,
  TORNADUS_126,
  HAWLUCHA_127,
  DRAMPA_V_128,
  ACEROLA_S_PREMONITION_129,
  BARRY_130,
  BLUNDER_POLICY_131,
  BOSS_S_ORDERS_132,
  CAFE_MASTER_133,
  CHEREN_S_CARE_134,
  CHOICE_BELT_135,
  CLEANSING_GLOVES_136,
  COLLAPSED_STADIUM_137,
  CYNTHIA_S_AMBITION_138,
  FRESH_WATER_SET_139,
  FRIENDS_IN_GALAR_140,
  GLORIA_141,
  HUNTING_GLOVES_142,
  KINDLER_143,
  MAGMA_BASIN_144,
  MARNIE_S_PRIDE_145,
  POT_HELMET_146,
  PROFESSOR_S_RESEARCH_147,
  ROSEANNE_S_BACKUP_148,
  TEAM_YELL_S_CHEER_149,
  ULTRA_BALL_150,
  DOUBLE_TURBO_ENERGY_151,
  SHAYMIN_V_152,
  CHARIZARD_V_153,
  CHARIZARD_V_154,
  LUMINEON_V_155,
  LUMINEON_V_156,
  PIKACHU_V_157,
  RAICHU_V_158,
  GRANBULL_V_159,
  WHIMSICOTT_V_160,
  HONCHKROW_V_161,
  HONCHKROW_V_162,
  ZAMAZENTA_V_163,
  FLYGON_V_164,
  ARCEUS_V_165,
  ARCEUS_V_166,
  BARRY_167,
  CHEREN_S_CARE_168,
  CYNTHIA_S_AMBITION_169,
  KINDLER_170,
  MARNIE_S_PRIDE_171,
  ROSEANNE_S_BACKUP_172,
  SHAYMIN_VSTAR_173,
  CHARIZARD_VSTAR_174,
  WHIMSICOTT_VSTAR_175,
  ARCEUS_VSTAR_176,
  CHEREN_S_CARE_177,
  CYNTHIA_S_AMBITION_178,
  KINDLER_179,
  ROSEANNE_S_BACKUP_180,
  GALARIAN_ARTICUNO_V_181,
  GALARIAN_ZAPDOS_V_182,
  GALARIAN_MOLTRES_V_183,
  ARCEUS_VSTAR_184,
  MAGMA_BASIN_185,
  ULTRA_BALL_186,
  FLAREON_TG01,
  VAPOREON_TG02,
  OCTILLERY_TG03,
  JOLTEON_TG04,
  ZEKROM_TG05,
  DUSKNOIR_TG06,
  DEDENNE_TG07,
  ALCREMIE_TG08,
  ARIADOS_TG09,
  HOUNDOOM_TG10,
  EEVEE_TG11,
  ORANGURU_TG12,
  BOLTUND_V_TG13,
  SYLVEON_V_TG14,
  SYLVEON_VMAX_TG15,
  MIMIKYU_V_TG16,
  MIMIKYU_VMAX_TG17,
  SINGLE_STRIKE_URSHIFU_V_TG18,
  SINGLE_STRIKE_URSHIFU_VMAX_TG19,
  RAPID_STRIKE_URSHIFU_V_TG20,
  RAPID_STRIKE_URSHIFU_VMAX_TG21,
  UMBREON_V_TG22,
  UMBREON_VMAX_TG23,
  ACEROLA_S_PREMONITION_TG24,
  CAFE_MASTER_TG25,
  GLORIA_TG26,
  RAPID_STRIKE_STYLE_MUSTARD_TG27,
  SINGLE_STRIKE_STYLE_MUSTARD_TG28,
  SINGLE_STRIKE_URSHIFU_VMAX_TG29,
  RAPID_STRIKE_URSHIFU_VMAX_TG30
;

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  @Override
  public String toEnumId() {
    return name()+":BRILLIANT_STARS";
  }

  @Override
  public Card getImplementation(EnhancedCardInfo stub) {
    switch (this) {


      case EXEGGCUTE_1: return cardng (stub) {
        moveAttack "Ram", {
          // 10 damage.
          damage 10
        }
        moveAttack "Seed Bomb", {
          // 20 damage.
          damage 20
        }
      }



      case EXEGGUTOR_2: return cardng (stub) {
        moveAttack "Mega Drain", {
          // 70 damage. Heal 30 damage from this Pokémon.
          damage 70
          afterDamage {
            heal 30, self
          }
        }
        moveAttack "Seed Bomb", {
          // 130 damage.
          damage 130
        }
      }



      case SHROOMISH_3: return cardng (stub) {
        moveAttack "Headbutt", {
          // 20 damage.
          damage 20
        }
      }



      case BRELOOM_4: return cardng (stub) {
        moveAttack "Spore Ball", {
          // 30 damage. Your opponent's Active Pokémon is now Asleep.
          damage 30
          applyAfterDamage ASLEEP
        }
        moveAttack "Powdery Uppercut", {
          // 130 damage. You can use this attack only if this Pokémon used Spore Ball during your last turn.
          damage 130
        }
      }



      case TROPIUS_5: return cardng (stub) {
      bwAbility "Curative Bower", {
        // All of your Pokémon that have [G] Energy attached can't be Confused, and if they are already Confused, they recover from that Special Condition.
        delayedA {
          before APPLY_SPECIAL_CONDITION, {
            if(ef.getTargetPokemon().cards.energyCount(G) > 0){
              bc "Curative Bower prevents from being Confused."
              prevent()
            }
          }
        }
        onActivate {
          my.all.findAll{it.cards.energyCount(G) > 0}.each { pokemon ->
            if(pokemon.isSPC(CONFUSED)){
              bc "Curative Bower prevents from being Confused."
              clearSpecialCondition(pokemon, [CONFUSED])
            }
          }
        }
      }
        moveAttack "Slicing Blade", {
          // 100 damage.
          damage 100
        }
      }



      case TURTWIG_6: return cardng (stub) {
        moveAttack "Bite", {
          // 10 damage.
          damage 10
        }
        moveAttack "Headbutt Bounce", {
          // 20 damage.
          damage 20
        }
      }



      case GROTLE_7: return cardng (stub) {
      bwAbility "Sun-Drenched Shell", {
        // Once during your turn, you may search your deck for a [G] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck.
        actionA {
          checkLastTurn()
          assert my.deck : "Your deck is empty"
          powerUsed()
          my.deck.search("Search for a [G] Pokémon", {it.cardTypes.is(POKEMON) && it.types.contains(G)}).moveTo(my.hand)
          shuffleDeck()
        }
      }
        moveAttack "Razor Leaf", {
          // 50 damage.
          damage 50
        }
      }



      case TORTERRA_8: return cardng (stub) {
      moveAttack "Evopress", {
        // 50x damage. This attack does 50 damage for each of your Evolution Pokémon in play.
        damage 50*my.all.count{it.realEvolution()}
      }
        moveAttack "Hammer In", {
          // 160 damage.
          damage 160
        }
      }



      case BURMY_9: return cardng (stub) {
        moveAttack "Hang Down", {
          // 20 damage.
          damage 20
        }
      }



      case WORMADAM_10: return cardng (stub) {
        moveAttack "Matron's Anger", {
          // 30+ damage. This attack does 10 more damage for each Pokémon in your discard pile.
          damage 30
        }
        moveAttack "Leaf Drain", {
          // 80 damage. Heal 30 damage from this Pokémon.
          damage 80
        }
      }



      case MOTHIM_11: return cardng (stub) {
        moveAttack "Raid", {
          // 30+ damage. If this Pokémon evolved from Burmy during this turn, this attack does 90 more damage.
          damage 30
        }
        moveAttack "Gust", {
          // 80 damage.
          damage 80
        }
      }



      case CHERUBI_12: return cardng (stub) {
      bwAbility "Lively Fruit", {
        // Prevent all effects of attacks from your opponent's Pokémon done to this Pokémon. (Damage is not an effect.)
        delayedA {
          before null, self, Source.ATTACK, {
            if(e.sourceAttack.attacker.owner == self.owner.opposite && ef.effectType != DAMAGE && !(ef instanceof ApplyDamages)){
              bc "Lively Fruit prevents effect"
              prevent()
            }
          }
        }
      }
        moveAttack "Leafage", {
          // 20 damage.
          damage 20
        }
      }



      case SHAYMIN_V_13: return cardng (stub) {
        moveAttack "Flap", {
          // 30 damage.
          damage 30
        }
      moveAttack "Revenge Blast", {
        // 60+ damage. This attack does 40 more damage for each Prize card your opponent has taken.
        damage 60 + 40*opp.prizeCardSet.takenCount
      }
      }



      case SHAYMIN_VSTAR_14: return cardng (stub) {
      bwAbility "Star Bloom", {
        // During your turn, you may heal 120 damage from each of your Benched [G] Pokémon. (You can't use more than 1 VSTAR Power in a game.)
        actionA {
          checkLastTurn()
          vStarCheck()
          assert my.bench.findAll{it.types.contains(G) && it.numberOfDamageCounters} : "No [G] Pokémon on your Bench with damage counters"
          powerUsed()
          vStarPerform()
          my.bench.findAll{it.types.contains(G) && it.numberOfDamageCounters}.each {
            heal 120, it
          }
        }
      }
      moveAttack "Revenge Blast", {
        // 120+ damage. This attack does 40 more damage for each Prize card your opponent has taken.
        damage 120 + 40*opp.prizeCardSet.takenCount
      }
      }



      case KARRABLAST_15: return cardng (stub) {
        moveAttack "Peck", {
          // 10 damage.
          damage 10
        }
      }



      case ZARUDE_V_16: return cardng (stub) {
        moveAttack "Leap to Leap", {
          // 30 damage. This attack also does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
          damage 30
          if(opp.bench) damage 30, opp.bench.select("Pokémon to deal 30 damage to?")
        }
        moveAttack "Jungle Rage", {
          // 120+ damage. If your opponent's Active Pokémon is a Pokémon V, this attack does 120 more damage.
          damage 120
          if(defending.isPokemonV()) damage 120
        }
      }







      case MAGMAR_19: return cardng (stub) {
        moveAttack "Low Kick", {
          // 20 damage.
          damage 20
        }
        moveAttack "Fiery Punch", {
          // 70 damage.
          damage 70
        }
      }



      case MAGMORTAR_20: return cardng (stub) {
        moveAttack "Mega Punch", {
          // 50 damage.
          damage 50
        }
      moveAttack "Boltsplosion", {
        // 120+ damage. If Electivire is on your Bench, this attack does 120 more damage.
        damage 120
        if(my.bench.find{it.name=="Electivire"}) damage 120
      }
      }



      case MOLTRES_21: return cardng (stub) {
      moveAttack "Inferno Wings", {
        // 20+ damage. If this Pokémon has any damage counters on it, this attack does 70 more damage. This attack's damage isn't affected by Weakness.
        noWeaknessDamage 20, defending
        if(self.numberOfDamageCounters) noWeaknessDamage 70, defending
      }
      }



      case ENTEI_V_22: return cardng (stub) {
      bwAbility "Fleet-Footed", {
        // Once during your turn, if this Pokémon is in the Active Spot, you may draw a card.
        actionA {
          checkLastTurn()
          assert self.active : "$self is not your Active Pokémon."
          powerUsed()
          draw 1
        }
      }
      moveAttack "Burning Rondo", {
        // 20+ damage. This attack does 20 more damage for each Benched Pokémon (both yours and your opponent's).
        damage 20 + 20*(my.bench.size() + opp.bench.size())
      }
      }



      case TORKOAL_23: return cardng (stub) {
      moveAttack "Firebreathing", {
        // 30+ damage. Flip a coin. If heads, this attack does 30 more damage.
        damage 30
        flip { damage 30 }
      }
      moveAttack "Guard Press", {
        // 90 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
        damage 90
        reduceDamageNextTurn(hp(30), thisMove)
      }
      }



      case CHIMCHAR_24: return cardng (stub) {
      moveAttack "Ember", {
        // 30 damage. Discard an Energy from this Pokémon.
        damage 30
        discardSelfEnergy C
      }
      }



      case MONFERNO_25: return cardng (stub) {
        moveAttack "Flare", {
          // 30 damage.
          damage 30
        }
        moveAttack "Flamethrower", {
          // 50 damage. Discard an Energy from this Pokémon.
          damage 50
        }
      }



      case INFERNAPE_26: return cardng (stub) {
        moveAttack "Infernal Vortex", {
          // 80x damage. Reveal the top 5 cards of your deck. This attack does 80 damage for each Energy card you find there. Then, discard those Energy cards and shuffle the other cards back into your deck.
          damage 80
        }
        moveAttack "Burning Kick", {
          // 160 damage. Discard all Energy from this Pokémon.
          damage 160
        }
      }



      case SIMISEAR_V_27: return cardng (stub) {
        moveAttack "Bursting Power", {
          // 20 damage. You may attach up to 2 basic Energy cards from your hand to your Pokémon in any way you like.
          damage 20
        }
        moveAttack "Flare Juggling", {
          // 90+ damage. This attack does 30 more damage for each Energy attached to your opponent's Active Pokémon.
          damage 90
        }
      }



      case KINGLER_V_28: return cardng (stub) {
        moveAttack "Falling Bubbles", {
          // Flip a coin. If heads, search your deck for up to 5 [W] Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck.

        }
        moveAttack "Raging Pincer", {
          // 200 damage. This Pokémon also does 30 damage to itself.
          damage 200
        }
      }



      case KINGLER_VMAX_29: return cardng (stub) {
        moveAttack "Bubbles Galore", {
          // Search your deck for up to 5 [W] Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck.

        }
        moveAttack "G-Max Pincer", {
          // 240 damage. This Pokémon also does 30 damage to itself.
          damage 240
        }
      }



      case STARYU_30: return cardng (stub) {
        moveAttack "Double Spin", {
          // 10x damage. Flip 2 coins. This attack does 10 damage for each heads.
          damage 10
        }
      }



      case LAPRAS_31: return cardng (stub) {
        moveAttack "Raging Freeze", {
          // 110 damage. If any of your Pokémon were Knocked Out by damage from an attack from your opponent's Pokémon during their last turn, your opponent's Active Pokémon is now Paralyzed.
          damage 110
        }
      }



      case CORPHISH_32: return cardng (stub) {
        moveAttack "Water Gun", {
          // 10 damage.
          damage 10
        }
        moveAttack "Crabhammer", {
          // 50 damage.
          damage 50
        }
      }



      case CRAWDAUNT_33: return cardng (stub) {
        moveAttack "Corkscrew Punch", {
          // 30 damage.
          damage 30
        }
      moveAttack "Crab Impact", {
        // 150 damage. Discard 2 Energy from this Pokémon.
        damage 150
        discardSelfEnergy C, C
      }
      }



      case SNORUNT_34: return cardng (stub) {
      moveAttack "Ice Breath", {
        // Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
        flip { apply PARALYZED, defending }
      }
        moveAttack "Icy Snow", {
          // 20 damage.
          damage 20
        }
      }



      case PIPLUP_35: return cardng (stub) {
        moveAttack "Bubble", {
          // 10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
          damage 10
        }
      }



      case PRINPLUP_36: return cardng (stub) {
        moveAttack "Peck", {
          // 30 damage.
          damage 30
        }
      }



      case EMPOLEON_37: return cardng (stub) {
        bwAbility "Emergency Surfacing", {
          // Once during your turn, if this Pokémon is in your discard pile and you have no cards in your hand, you may put this Pokémon onto your Bench. If you do, draw 3 cards.
          actionA {
          }
        }
        moveAttack "Water Arrow", {
          // This attack does 60 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

        }
      }



      case BUIZEL_38: return cardng (stub) {
        moveAttack "Agility", {
          // 20 damage. Flip a coin. If heads, during your opponent's next turn, prevent all damage from and effects of attacks done to this Pokémon.
          damage 20
        }
      }



      case FLOATZEL_39: return cardng (stub) {
        moveAttack "Floatify", {
          // Put up to 2 Item cards from your discard pile into your hand.

        }
        moveAttack "Water Gun", {
          // 60 damage.
          damage 60
        }
      }





      case MANAPHY_41: return cardng (stub) {
        bwAbility "Wave Veil", {
          // Prevent all damage done to your Benched Pokémon by attacks from your opponent's Pokémon.
          actionA {
          }
        }
        moveAttack "Rain Splash", {
          // 20 damage.
          damage 20
        }
      }



      case CUBCHOO_42: return cardng (stub) {
        moveAttack "Chilly", {
          // 20 damage.
          damage 20
        }
      }



      case BEARTIC_43: return cardng (stub) {
        moveAttack "Sheer Cold", {
          // 40 damage. During your opponent's next turn, the Defending Pokémon can't attack.
          damage 40
        }
        moveAttack "Frost Smash", {
          // 130 damage.
          damage 130
        }
      }



      case EISCUE_44: return cardng (stub) {
        moveAttack "Block Slider", {
          // This attack does 40 damage to 1 of your opponent's Pokémon for each Fusion Strike Energy attached to all of your Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

        }
        moveAttack "Icicle Missile", {
          // 100 damage.
          damage 100
        }
      }



      case RAICHU_V_45: return cardng (stub) {
        moveAttack "Fast Charge", {
          // If you go first, you can use this attack during your first turn. Search your deck for a [L] Energy card and attach it to this Pokémon. Then, shuffle your deck.

        }
        moveAttack "Dynamic Spark", {
          // 60x damage. You may discard any amount of [L] Energy from your Pokémon. This attack does 60 damage for each card you discarded in this way.
          damage 60
        }
      }



      case ELECTABUZZ_46: return cardng (stub) {
        moveAttack "Thunder Wave", {
          // Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.

        }
        moveAttack "Head Bolt", {
          // 30 damage.
          damage 30
        }
      }



      case ELECTIVIRE_47: return cardng (stub) {
        moveAttack "Explosive Bolt", {
          // 30+ damage. If any of your Benched Magmortar have any damage counters on them, this attack does 90 more damage.
          damage 30
        }
        moveAttack "High-Voltage Current", {
          // This attack does 50 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

        }
      }



      case RAIKOU_V_48: return cardng (stub) {
        bwAbility "Fleet-Footed", {
          // Once during your turn, if this Pokémon is in the Active Spot, you may draw a card.
          actionA {
          }
        }
        moveAttack "Lightning Rondo", {
          // 20+ damage. This attack does 20 more damage for each Benched Pokémon (both yours and your opponent's).
          damage 20
        }
      }



      case SHINX_49: return cardng (stub) {
        moveAttack "Gnaw", {
          // 10 damage.
          damage 10
        }
      }



      case LUXIO_50: return cardng (stub) {
        moveAttack "Thunder Shock", {
          // 30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
          damage 30
        }
      }



      case LUXRAY_51: return cardng (stub) {
        moveAttack "Energy Crush", {
          // 50x damage. This attack does 50 damage for each Energy attached to all of your opponent's Pokémon.
          damage 50
        }
        moveAttack "Flash Impact", {
          // 110 damage. This attack also does 30 damage to 1 of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
          damage 110
        }
      }



      case PACHIRISU_52: return cardng (stub) {
        moveAttack "Windup Thunder", {
          // 30x damage. This attack does 30 damage for each Pokémon Tool attached to all of your Pokémon.
          damage 30
        }
      }



      case CLEFAIRY_53: return cardng (stub) {
        moveAttack "Pound", {
          // 10 damage.
          damage 10
        }
        moveAttack "Magical Shot", {
          // 30 damage.
          damage 30
        }
      }



      case CLEFABLE_54: return cardng (stub) {
        moveAttack "Moonlit Miracle", {
          // Flip 3 coins. Choose a number of your Pokémon in play up to the number of heads. For each of those Pokémon, search your deck for a card that evolves from that Pokémon and put it onto that Pokémon to evolve it. Then, shuffle your deck.

        }
        moveAttack "Magical Shot", {
          // 90 damage.
          damage 90
        }
      }



      case STARMIE_55: return cardng (stub) {
        moveAttack "Psychic", {
          // 10+ damage. This attack does 30 more damage for each Energy attached to your opponent's Active Pokémon.
          damage 10
        }
        moveAttack "Power Gem", {
          // 60 damage.
          damage 60
        }
      }



      case MEWTWO_56: return cardng (stub) {
        moveAttack "Life Sucker", {
          // 20 damage. Heal 20 damage from this Pokémon.
          damage 20
        }
        moveAttack "Psyburn", {
          // 110 damage.
          damage 110
        }
      }



      case GRANBULL_V_57: return cardng (stub) {
        moveAttack "Chomp", {
          // 30+ damage. This attack does 10 more damage for each damage counter on this Pokémon.
          damage 30
        }
        moveAttack "Bull Dash", {
          // 190 damage. This Pokémon also does 30 damage to itself.
          damage 190
        }
      }



      case BALTOY_58: return cardng (stub) {
        moveAttack "Triple Spin", {
          // 20x damage. Flip 3 coins. This attack does 20 damage for each heads.
          damage 20
        }
      }



      case CLAYDOL_59: return cardng (stub) {
        moveAttack "Spinning Attack", {
          // 40 damage.
          damage 40
        }
        moveAttack "Coinciding Figures", {
          // 90+ damage. If you and your opponent have the same number of Benched Pokémon, this attack does 90 more damage.
          damage 90
        }
      }



      case DUSKULL_60: return cardng (stub) {
        moveAttack "Perplex", {
          // 10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Confused.
          damage 10
        }
      }



      case DUSCLOPS_61: return cardng (stub) {
        moveAttack "Fade to Black", {
          // 30 damage. Your opponent's Active Pokémon is now Confused.
          damage 30
        }
      }



      case DUSKNOIR_62: return cardng (stub) {
        bwAbility "Special Transfer", {
          // As often as you like during your turn, you may move a Special Energy from 1 of your Pokémon to another of your Pokémon.
          actionA {
          }
        }
        moveAttack "Devour Soul", {
          // 120 damage.
          damage 120
        }
      }



      case CHIMECHO_63: return cardng (stub) {
        moveAttack "Clear Tone", {
          // Search your deck for up to 2 Special Energy cards, reveal them, and put them into your hand. Then, shuffle your deck.

        }
        moveAttack "Hang Down", {
          // 30 damage.
          damage 30
        }
      }



      case WHIMSICOTT_V_64: return cardng (stub) {
        moveAttack "Fluff Gets in the Way", {
          // 20 damage. If the Defending Pokémon is a Basic Pokémon, it can't attack during your opponent's next turn.
          damage 20
        }
        moveAttack "Cotton Guard", {
          // 90 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
          damage 90
        }
      }



      case WHIMSICOTT_VSTAR_65: return cardng (stub) {
        moveAttack "Trick Wind", {
          // 160 damage. During your opponent's next turn, they can't play any Pokémon Tool or Special Energy cards from their hand.
          damage 160
        }
        moveAttack "Fluffball Star", {
          // This attack does 60 damage to 1 of your opponent's Pokémon for each Energy attached to this Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can't use more than 1 VSTAR Power in a game.)

        }
      }



      case SIGILYPH_66: return cardng (stub) {
        moveAttack "Tri Recharge", {
          // Flip 3 coins. Attach a number of basic Energy cards up to the number of heads from your discard pile to your Benched Pokémon in any way you like.

        }
        moveAttack "Psychic", {
          // 10+ damage. This attack does 30 more damage for each Energy attached to your opponent's Active Pokémon.
          damage 10
        }
      }



      case DEDENNE_67: return cardng (stub) {
        moveAttack "Dede-Flash", {
          // 20+ damage. If your opponent has exactly 1 Prize card remaining, this attack does 60 more damage, and your opponent's Active Pokémon is now Confused.
          damage 20
        }
      }





      case MIMIKYU_VMAX_69: return cardng (stub) {
        moveAttack "Ominous Numbers", {
          // Put 4 damage counters on your opponent's Pokémon in any way you like. If you played Acerola's Premonition from your hand during this turn, place 13 damage counters instead.

        }
        moveAttack "Max Shadow", {
          // 120 damage. Discard a random card from your opponent's hand.
          damage 120
        }
      }



      case MILCERY_70: return cardng (stub) {
        moveAttack "Lead", {
          // Search your deck for a Supporter card, reveal it, and put it into your hand. Then, shuffle your deck.

        }
        moveAttack "Ram", {
          // 10 damage.
          damage 10
        }
      }



      case ALCREMIE_71: return cardng (stub) {
        bwAbility "Additional Order", {
          // As long as this Pokémon is in the Active Spot, your turn does not end when you use Café Master.
          actionA {
          }
        }
        moveAttack "Rainbow Flavor", {
          // 10+ damage. This attack does 40 more damage for each type of basic Energy attached to all of your Pokémon.
          damage 10
        }
      }



      case HITMONTOP_72: return cardng (stub) {
        moveAttack "Spinning Draw", {
          // 20 damage. Draw a card.
          damage 20
        }
        moveAttack "Cyclone Kick", {
          // 100 damage.
          damage 100
        }
      }



      case NOSEPASS_73: return cardng (stub) {
        moveAttack "Ram", {
          // 20 damage.
          damage 20
        }
      }



      case TRAPINCH_74: return cardng (stub) {
        moveAttack "Rising Lunge", {
          // 10+ damage. Flip a coin. If heads, this attack does 10 more damage.
          damage 10
        }
      }



      case VIBRAVA_75: return cardng (stub) {
        moveAttack "Razor Wing", {
          // 30 damage.
          damage 30
        }
      }



      case FLYGON_76: return cardng (stub) {
        moveAttack "Desert Pillar", {
          // 50x damage. This attack does 50 damage for each [C] in your opponent's Active Pokémon's Retreat Cost.
          damage 50
        }
        moveAttack "Blasting Wind", {
          // 110 damage.
          damage 110
        }
      }



      case WORMADAM_77: return cardng (stub) {
        moveAttack "Matron's Anger", {
          // 30+ damage. This attack does 10 more damage for each Pokémon in your discard pile.
          damage 30
        }
        moveAttack "Bind Down", {
          // 80 damage. During your opponent's next turn, the Defending Pokémon can't retreat.
          damage 80
        }
      }



      case RIOLU_78: return cardng (stub) {
        moveAttack "Low Kick", {
          // 50 damage.
          damage 50
        }
      }





      case THROH_80: return cardng (stub) {
        moveAttack "Lunge Out", {
          // 30 damage.
          damage 30
        }
        moveAttack "Seismic Toss", {
          // 110 damage.
          damage 110
        }
      }



      case SAWK_81: return cardng (stub) {
        moveAttack "Sweep the Leg", {
          // 30 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon.
          damage 30
        }
      }



      case GOLETT_82: return cardng (stub) {
        moveAttack "Mud-Slap", {
          // 10 damage.
          damage 10
        }
        moveAttack "Pound", {
          // 20 damage.
          damage 20
        }
      }



      case GOLURK_83: return cardng (stub) {
        moveAttack "Big Hand", {
          // 30+ damage. This attack does 10 more damage for each card in your hand.
          damage 30
        }
        moveAttack "Mega Punch", {
          // 120 damage.
          damage 120
        }
      }



      case GRIMER_84: return cardng (stub) {
        moveAttack "Poison Gas", {
          // Your opponent's Active Pokémon is now Poisoned.

        }
      }



      case MUK_85: return cardng (stub) {
        bwAbility "Sludge Street", {
          // The Retreat Cost of your opponent's Poisoned Pokémon is [C] more.
          actionA {
          }
        }
        moveAttack "Shrieking Poison", {
          // 90 damage. Your opponent's Active Pokémon is now Confused and Poisoned.
          damage 90
        }
      }



      case SNEASEL_86: return cardng (stub) {
        moveAttack "Scratch", {
          // 10 damage.
          damage 10
        }
        moveAttack "Slash", {
          // 20 damage.
          damage 20
        }
      }



      case WEAVILE_87: return cardng (stub) {
        moveAttack "Ransack", {
          // Flip 2 coins. If either of them is heads, your opponent reveals their hand. For each heads, choose a card you find there and put it on the bottom of your opponent's deck in any order.

        }
        moveAttack "Slash", {
          // 100 damage.
          damage 100
        }
      }



      case HONCHKROW_V_88: return cardng (stub) {
        bwAbility "Boss Pockets", {
          // This Pokémon may have up to 4 Pokémon Tools attached to it. If it loses this Ability, discard Pokémon Tools from it until only 1 remains.
          actionA {
          }
        }
        moveAttack "Fearsome Shadow", {
          // 130 damage. Your opponent reveals their hand.
          damage 130
        }
      }



      case SPIRITOMB_89: return cardng (stub) {
        moveAttack "Ticking Terror", {
          // Until the end of your next turn, the Defending Pokémon's Weakness is now Darkness. (The amount of Weakness doesn't change.)

        }
        moveAttack "Cursed Drop", {
          // Put 2 damage counters on your opponent's Pokémon in any way you like.

        }
      }



      case PURRLOIN_90: return cardng (stub) {
        moveAttack "Surprise Attack", {
          // 30 damage. Flip a coin. If tails, this attack does nothing.
          damage 30
        }
      }





      case IMPIDIMP_92: return cardng (stub) {
        moveAttack "Call for Family", {
          // Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck.

        }
        moveAttack "Bite", {
          // 30 damage.
          damage 30
        }
      }



      case MORGREM_93: return cardng (stub) {
        moveAttack "Smash Kick", {
          // 30 damage.
          damage 30
        }
        moveAttack "Pierce", {
          // 50 damage.
          damage 50
        }
      }



      case GRIMMSNARL_94: return cardng (stub) {
        moveAttack "Longhair Shot", {
          // This attack does 30 damage to 1 of your opponent's Pokémon for each [D] Energy attached to this Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

        }
        moveAttack "Darkness Fang", {
          // 110 damage.
          damage 110
        }
      }



      case MORPEKO_V_95: return cardng (stub) {
        moveAttack "Gnaw and Run", {
          // 30 damage. You may switch this Pokémon with 1 of your Benched Pokémon.
          damage 30
        }
        moveAttack "Hangry Spike", {
          // 120+ damage. If you played Marnie's Pride from your hand during this turn, this attack does 120 more damage.
          damage 120
        }
      }



      case AGGRON_V_96: return cardng (stub) {
        moveAttack "Rock Slide", {
          // 90 damage. This attack also does 30 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
          damage 90
        }
        moveAttack "Merciless Strike", {
          // 150+ damage. If your opponent's Active Pokémon already has any damage counters on it, this attack does 150 more damage.
          damage 150
        }
      }



      case AGGRON_VMAX_97: return cardng (stub) {
        moveAttack "Cracking Stomp", {
          // 150 damage. Discard the top card of your opponent's deck.
          damage 150
        }
        moveAttack "Max Take Down", {
          // 270 damage. This Pokémon also does 30 damage to itself.
          damage 270
        }
      }



      case WORMADAM_98: return cardng (stub) {
        moveAttack "Matron's Anger", {
          // 30+ damage. This attack does 10 more damage for each Pokémon in your discard pile.
          damage 30
        }
        moveAttack "Scrap Drop", {
          // 90 damage.
          damage 90
        }
      }



      case PROBOPASS_99: return cardng (stub) {
        moveAttack "Magnetic Tension", {
          // Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. This attack does 40 damage to the new Active Pokémon.

        }
        moveAttack "Iron Tackle", {
          // 120 damage. This Pokémon also does 20 damage to itself.
          damage 120
        }
      }



      case HEATRAN_100: return cardng (stub) {
        moveAttack "Guard Claw", {
          // 30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
          damage 30
        }
        moveAttack "Iron Hammer", {
          // 80+ damage. If this Pokémon has any [R] Energy attached, this attack does 80 more damage.
          damage 80
        }
      }



      case ESCAVALIER_101: return cardng (stub) {
        bwAbility "Miraculous Armor", {
          // This Pokémon takes 100 less damage from attacks from your opponent's Pokémon V (after applying Weakness and Resistance).
          actionA {
          }
        }
        moveAttack "Pike", {
          // 90 damage. This attack also does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
          damage 90
        }
      }



      case KLINK_102: return cardng (stub) {
        moveAttack "Vise Grip", {
          // 10 damage.
          damage 10
        }
        moveAttack "Spinning Attack", {
          // 20 damage.
          damage 20
        }
      }



      case KLANG_103: return cardng (stub) {
        moveAttack "Beam", {
          // 20 damage.
          damage 20
        }
        moveAttack "Guard Press", {
          // 70 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
          damage 70
        }
      }



      case KLINKLANG_104: return cardng (stub) {
        bwAbility "Gear Wall", {
          // Your Basic Pokémon take 20 less damage from attacks from your opponent's Pokémon (after applying Weakness and Resistance).
          actionA {
          }
        }
        moveAttack "Tumbling Attack", {
          // 90+ damage. Flip a coin. If heads, this attack does 90 more damage.
          damage 90
        }
      }



      case ZAMAZENTA_V_105: return cardng (stub) {
        bwAbility "Regal Stance", {
          // Once during your turn, you may discard your hand and draw 5 cards. If you use this Ability, your turn ends.
          actionA {
          }
        }
        moveAttack "Revenge Blast", {
          // 120+ damage. This attack does 30 more damage for each Prize card your opponent has taken.
          damage 120
        }
      }



      case FLYGON_V_106: return cardng (stub) {
        moveAttack "Sand Spray", {
          // 70 damage.
          damage 70
        }
        moveAttack "Draconic Impulse", {
          // 160+ damage. If your opponent's Active Pokémon is a Pokémon VMAX, this attack does 160 more damage, and discard 3 Energy from this Pokémon.
          damage 160
        }
      }



      case GIBLE_107: return cardng (stub) {
        moveAttack "Gnaw", {
          // 30 damage.
          damage 30
        }
      }



      case GABITE_108: return cardng (stub) {
        moveAttack "Dragon Claw", {
          // 70 damage.
          damage 70
        }
      }



      case GARCHOMP_109: return cardng (stub) {
        bwAbility "Sonic Slip", {
          // When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may prevent all damage from and effects of attacks from your opponent's Pokémon done to this Pokémon until the end of your opponent's next turn.
          actionA {
          }
        }
        moveAttack "Dragonblade", {
          // 160 damage. Discard the top 2 cards of your deck.
          damage 160
        }
      }



      case AXEW_110: return cardng (stub) {
        moveAttack "Ultra Evolution", {
          // Flip a coin. If heads, search your deck for a Haxorus and put it onto this Axew to evolve it. Then, shuffle your deck.

        }
      }



      case FRAXURE_111: return cardng (stub) {
        moveAttack "Sharp Fang", {
          // 30 damage.
          damage 30
        }
        moveAttack "Dragon Claw", {
          // 60 damage.
          damage 60
        }
      }



      case HAXORUS_112: return cardng (stub) {
        moveAttack "Slash", {
          // 60 damage.
          damage 60
        }
        moveAttack "Wild Axe", {
          // 160 damage. This Pokémon also does 30 damage to itself.
          damage 160
        }
      }



      case DRUDDIGON_113: return cardng (stub) {
        moveAttack "Revenge", {
          // 40+ damage. If any of your Pokémon were Knocked Out by damage from an attack from your opponent's Pokémon during their last turn, this attack does 120 more damage.
          damage 40
        }
        moveAttack "Dragon Claw", {
          // 120 damage.
          damage 120
        }
      }



      case DRACOVISH_V_114: return cardng (stub) {
        moveAttack "Slosh 'n' Crash", {
          // 60+ damage. Before doing damage, discard all Pokémon Tools from your opponent's Active Pokémon. If you discarded a Pokémon Tool in this way, this attack does 120 more damage.
          damage 60
        }
        moveAttack "Dragon Strike", {
          // 210 damage. During your next turn, this Pokémon can't use Dragon Strike.
          damage 210
        }
      }



      case FARFETCH_D_115: return cardng (stub) {
        moveAttack "Leek Lash", {
          // 20+ damage. This attack does 10 more damage for each damage counter on your opponent's Active Pokémon.
          damage 20
        }
      }



      case CASTFORM_116: return cardng (stub) {
        moveAttack "Double Draw", {
          // Draw 2 cards.

        }
        moveAttack "Hurricane", {
          // 30 damage. Move a basic Energy from this Pokémon to 1 of your Benched Pokémon.
          damage 30
        }
      }



      case STARLY_117: return cardng (stub) {
        moveAttack "Claw", {
          // 30 damage. Flip a coin. If tails, this attack does nothing.
          damage 30
        }
      }



      case STARAVIA_118: return cardng (stub) {
        moveAttack "Wing Attack", {
          // 50 damage.
          damage 50
        }
      }



      case STARAPTOR_119: return cardng (stub) {
        moveAttack "Strong Breeze", {
          // Your opponent shuffles their Active Pokémon and all attached cards into their deck.

        }
        moveAttack "Spinning Bird", {
          // 180 damage. Discard 2 Energy from this Pokémon.
          damage 180
        }
      }



      case BIDOOF_120: return cardng (stub) {
        moveAttack "Rollout", {
          // 30 damage.
          damage 30
        }
      }









      case MINCCINO_124: return cardng (stub) {
        moveAttack "Call for Family", {
          // Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck.

        }
        moveAttack "Pound", {
          // 10 damage.
          damage 10
        }
      }



      case CINCCINO_125: return cardng (stub) {
        moveAttack "Slap", {
          // 40 damage.
          damage 40
        }
        moveAttack "Triple Axel", {
          // 50x damage. Flip 3 coins. This attack does 50 damage for each heads.
          damage 50
        }
      }



      case TORNADUS_126: return cardng (stub) {
        bwAbility "Sudden Cyclone", {
          // When you play this Pokémon from your hand onto your Bench, you may have your opponent switch their Active Pokémon with 1 of their Benched Pokémon.
          actionA {
          }
        }
        moveAttack "Blasting Wind", {
          // 100 damage.
          damage 100
        }
      }



      case HAWLUCHA_127: return cardng (stub) {
        moveAttack "Showboating Pose", {
          // Attach up to 2 basic Energy cards from your discard pile to 1 of your Benched Pokémon.

        }
        moveAttack "Cross-Cut", {
          // 30+ damage. If your opponent's Active Pokémon is an Evolution Pokémon, this attack does 30 more damage.
          damage 30
        }
      }



      case DRAMPA_V_128: return cardng (stub) {
        moveAttack "Spike Draw", {
          // 20 damage. Draw 2 cards.
          damage 20
        }
        moveAttack "Dragon Pulse", {
          // 160 damage. Discard the top 2 cards of your deck.
          damage 160
        }
      }



      case ACEROLA_S_PREMONITION_129: return cardng (stub) {
        // Your opponent reveals their hand, and you draw a card for each Trainer card you find there.
        onPlay {
        }
        playRequirement{
        }
      }



      case BARRY_130: return cardng (stub) {
        // Draw 3 cards.
        onPlay {
        }
        playRequirement{
        }
      }



      case BLUNDER_POLICY_131: return cardng (stub) {
        // If the Pokémon this card is attached to uses an attack, if you flip any coins for the damage or effect of that attack, and if any of them are tails, draw 3 cards at the end of your turn.
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      }





      case CAFE_MASTER_133: return cardng (stub) {
        // Choose up to 3 of your Benched Pokémon. For each of those Pokémon, search your deck for a different type of basic Energy card and attach it to that Pokémon. Then, shuffle your deck. Your turn ends.
        onPlay {
        }
        playRequirement{
        }
      }



      case CHEREN_S_CARE_134: return cardng (stub) {
        // Put 1 of your [C] Pokémon that has any damage counters on it and all attached cards into your hand.
        onPlay {
        }
        playRequirement{
        }
      }



      case CHOICE_BELT_135: return cardng (stub) {
        // The attacks of the Pokémon this card is attached to do 30 more damage to your opponent's Active Pokémon V (before applying Weakness and Resistance).
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      }



      case CLEANSING_GLOVES_136: return cardng (stub) {
        // The attacks of the Pokémon this card is attached to do 30 more damage to your opponent's Active [P] Pokémon (before applying Weakness and Resistance).
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      }



      case COLLAPSED_STADIUM_137: return cardng (stub) {
        // Each player can't have more than 4 Benched Pokémon. If a player has 5 or more Benched Pokémon, they discard Benched Pokémon until they have 4 Pokémon on the Bench. The player who played this card discards first. If more than one effect changes the number of Benched Pokémon allowed, use the smaller number.
        onPlay {
        }
        onRemoveFromPlay{
        }
      }



      case CYNTHIA_S_AMBITION_138: return cardng (stub) {
        // Draw cards until you have 5 cards in your hand. If any of your Pokémon were Knocked Out during your opponent's last turn, draw cards until you have 8 cards in your hand instead.
        onPlay {
        }
        playRequirement{
        }
      }



      case FRESH_WATER_SET_139: return cardng (stub) {
        // Heal 20 damage from each of your Pokémon.
        onPlay {
        }
        playRequirement{
        }
      }



      case FRIENDS_IN_GALAR_140: return cardng (stub) {
        // Draw 3 cards.
        onPlay {
        }
        playRequirement{
        }
      }



      case GLORIA_141: return cardng (stub) {
        // Search your deck for up to 3 Basic Pokémon that don't have a Rule Box and put them onto your Bench. Then, shuffle your deck. (Pokémon V, Pokémon-GX, etc. have Rule Boxes.)
        onPlay {
        }
        playRequirement{
        }
      }



      case HUNTING_GLOVES_142: return cardng (stub) {
        // The attacks of the Pokémon this card is attached to do 30 more damage to your opponent's Active [N] Pokémon (before applying Weakness and Resistance).
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      }



      case KINDLER_143: return cardng (stub) {
        // You can use this card only if you discard a [R] Energy card from your hand. Look at the top 7 cards of your deck and put up to 2 of them into your hand. Shuffle the other cards back into your deck.
        onPlay {
        }
        playRequirement{
        }
      }



      case MAGMA_BASIN_144: return cardng (stub) {
        // Once during each player's turn, that player may attach a [R] Energy card from their discard pile to 1 of their Benched [R] Pokémon. If a player attached Energy to a Pokémon in this way, put 2 damage counters on that Pokémon.
        onPlay {
        }
        onRemoveFromPlay{
        }
      }



      case MARNIE_S_PRIDE_145: return cardng (stub) {
        // Attach a basic Energy card from your discard pile to 1 of your Benched Pokémon.
        onPlay {
        }
        playRequirement{
        }
      }



      case POT_HELMET_146: return cardng (stub) {
        // If the Pokémon this card is attached to doesn't have a Rule Box, it takes 30 less damage from attacks from your opponent's Pokémon (after applying Weakness and Resistance). (Pokémon V, Pokémon-GX, etc. have Rule Boxes.)
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      }





      case ROSEANNE_S_BACKUP_148: return cardng (stub) {
        // Choose 1 or more:• Shuffle a Pokémon from your discard pile into your deck.• Shuffle a Pokémon Tool card from your discard pile into your deck.• Shuffle a Stadium card from your discard pile into your deck.• Shuffle an Energy card from your discard pile into your deck.
        onPlay {
        }
        playRequirement{
        }
      }



      case TEAM_YELL_S_CHEER_149: return cardng (stub) {
        // Shuffle up to 3 in any combination of Pokémon and Supporter cards, except for Team Yell's Cheer, from your discard pile into your deck.
        onPlay {
        }
        playRequirement{
        }
      }



      case ULTRA_BALL_150: return cardng (stub) {
        // You can use this card only if you discard 2 other cards from your hand. Search your deck for a Pokémon, reveal it, and put it into your hand. Then, shuffle your deck.
        onPlay {
        }
        playRequirement{
        }
      }



      case DOUBLE_TURBO_ENERGY_151: return cardng (stub) {
        // As long as this card is attached to a Pokémon, it provides [C][C] Energy. The attacks of the Pokémon this card is attached to do 20 less damage to your opponent's Pokémon (before applying Weakness and Resistance).
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      }

































































































      case BOLTUND_V_TG13: return cardng (stub) {
        moveAttack "Electrify", {
          // Search your deck for up to 2 [L] Energy cards and attach them to your Benched Pokémon in any way you like. Then, shuffle your deck.

        }
        moveAttack "Bolt Storm", {
          // 10+ damage. This attack does 30 more damage for each [L] Energy attached to all of your Pokémon.
          damage 10
        }
      }



































        default:
      return null;
    }
  }
}