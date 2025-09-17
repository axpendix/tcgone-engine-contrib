package tcgwars.logic.impl.gen8


import static tcgwars.logic.card.Type.*
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*

import tcgwars.logic.card.*

/**
 * @author
 */
public enum LostOrigin implements ImplOnlyCardInfo {

  ODDISH_1,
  GLOOM_2,
  VILEPLUME_3,
  PARAS_4,
  PARASECT_5,
  WURMPLE_6,
  SILCOON_7,
  BEAUTIFLY_8,
  CASCOON_9,
  DUSTOX_10,
  SEEDOT_11,
  NUZLEAF_12,
  SHIFTRY_13,
  ROSELIA_14,
  ROSERADE_15,
  PHANTUMP_16,
  TREVENANT_17,
  BLIPBUG_18,
  DOTTLER_19,
  ORBEETLE_20,
  SLUGMA_21,
  MAGCARGO_22,
  TORKOAL_23,
  LITWICK_24,
  LAMPENT_25,
  CHANDELURE_26,
  DELPHOX_V_27,
  LITLEO_28,
  PYROAR_29,
  POLIWAG_30,
  POLIWHIRL_31,
  POLITOED_32,
  SEEL_33,
  DEWGONG_34,
  HORSEA_35,
  SEADRA_36,
  KINGDRA_37,
  LUVDISC_38,
  SHELLOS_39,
  FINNEON_40,
  LUMINEON_41,
  SNOVER_42,
  ABOMASNOW_43,
  HISUIAN_BASCULIN_44,
  HISUIAN_BASCULEGION_45,
  DUCKLETT_46,
  SWANNA_47,
  KYUREM_V_48,
  KYUREM_VMAX_49,
  CRAMORANT_50,
  GLASTRIER_51,
  PIKACHU_52,
  RAICHU_53,
  ELECTRIKE_54,
  MANECTRIC_55,
  MAGNEZONE_V_56,
  MAGNEZONE_VSTAR_57,
  ROTOM_V_58,
  TYNAMO_59,
  EELEKTRIK_60,
  EELEKTROSS_61,
  CLEFAIRY_62,
  CLEFABLE_63,
  GASTLY_64,
  HAUNTER_65,
  GENGAR_66,
  MR_MIME_67,
  JYNX_68,
  RADIANT_GARDEVOIR_69,
  SABLEYE_70,
  MAWILE_71,
  SHUPPET_72,
  BANETTE_73,
  CRESSELIA_74,
  HISUIAN_ZORUA_75,
  HISUIAN_ZOROARK_76,
  INKAY_77,
  MALAMAR_78,
  COMFEY_79,
  MIMIKYU_80,
  SPECTRIER_81,
  ENAMORUS_V_82,
  HISUIAN_GROWLITHE_83,
  HISUIAN_ARCANINE_84,
  POLIWRATH_85,
  MACHOP_86,
  MACHOKE_87,
  MACHAMP_88,
  RHYHORN_89,
  RHYDON_90,
  RHYPERIOR_91,
  AERODACTYL_V_92,
  AERODACTYL_VSTAR_93,
  SUDOWOODO_94,
  GLIGAR_95,
  GLISCOR_96,
  MAKUHITA_97,
  HARIYAMA_98,
  MEDITITE_99,
  MEDICHAM_100,
  RELICANTH_101,
  GASTRODON_102,
  MIENFOO_103,
  MIENSHAO_104,
  LANDORUS_105,
  BINACLE_106,
  BARBARACLE_107,
  CARBINK_108,
  ROCKRUFF_109,
  FALINKS_110,
  STONJOURNER_111,
  SPINARAK_112,
  ARIADOS_113,
  MURKROW_114,
  HONCHKROW_115,
  SEVIPER_116,
  SPIRITOMB_117,
  DRAPION_V_118,
  DRAPION_VSTAR_119,
  DARKRAI_120,
  INKAY_121,
  HOOPA_122,
  RADIANT_HISUIAN_SNEASLER_123,
  RADIANT_STEELIX_124,
  BRONZOR_125,
  BRONZONG_126,
  GALARIAN_STUNFISK_127,
  MAGEARNA_128,
  GALARIAN_PERRSERKER_V_129,
  GIRATINA_V_130,
  GIRATINA_VSTAR_131,
  GOOMY_132,
  HISUIAN_SLIGGOO_133,
  HISUIAN_GOODRA_134,
  HISUIAN_GOODRA_V_135,
  HISUIAN_GOODRA_VSTAR_136,
  PIDGEOT_V_137,
  LICKITUNG_138,
  LICKILICKY_139,
  PORYGON_140,
  PORYGON2_141,
  PORYGON_Z_142,
  SNORLAX_143,
  AIPOM_144,
  AMBIPOM_145,
  HISUIAN_ZOROARK_V_146,
  HISUIAN_ZOROARK_VSTAR_147,
  BOUFFALANT_148,
  KOMALA_149,
  SKWOVET_150,
  GREEDENT_151,
  ARC_PHONE_152,
  AREZU_153,
  BOX_OF_DISASTER_154,
  COLRESS_S_EXPERIMENT_155,
  DAMAGE_PUMP_156,
  FANTINA_157,
  ISCAN_158,
  LADY_159,
  LAKE_ACUITY_160,
  LOST_CITY_161,
  LOST_VACUUM_162,
  MIRAGE_GATE_163,
  MISS_FORTUNE_SISTERS_164,
  PANIC_MASK_165,
  RILEY_166,
  THORTON_167,
  TOOL_BOX_168,
  VOLO_169,
  WINDUP_ARM_170,
  GIFT_ENERGY_171,
  HISUIAN_ELECTRODE_V_172,
  DELPHOX_V_173,
  KYUREM_V_174,
  MAGNEZONE_V_175,
  ROTOM_V_176,
  ROTOM_V_177,
  ENAMORUS_V_178,
  AERODACTYL_V_179,
  AERODACTYL_V_180,
  GALLADE_V_181,
  DRAPION_V_182,
  GALARIAN_PERRSERKER_V_183,
  GALARIAN_PERRSERKER_V_184,
  GIRATINA_V_185,
  GIRATINA_V_186,
  HISUIAN_GOODRA_V_187,
  PIDGEOT_V_188,
  AREZU_189,
  COLRESS_S_EXPERIMENT_190,
  FANTINA_191,
  ISCAN_192,
  LADY_193,
  MISS_FORTUNE_SISTERS_194,
  THORTON_195,
  VOLO_196,
  KYUREM_VMAX_197,
  MAGNEZONE_VSTAR_198,
  AERODACTYL_VSTAR_199,
  DRAPION_VSTAR_200,
  GIRATINA_VSTAR_201,
  HISUIAN_GOODRA_VSTAR_202,
  HISUIAN_ZOROARK_VSTAR_203,
  AREZU_204,
  COLRESS_S_EXPERIMENT_205,
  FANTINA_206,
  ISCAN_207,
  LADY_208,
  MISS_FORTUNE_SISTERS_209,
  THORTON_210,
  VOLO_211,
  GIRATINA_VSTAR_212,
  HISUIAN_ZOROARK_VSTAR_213,
  BOX_OF_DISASTER_214,
  COLLAPSED_STADIUM_215,
  DARK_PATCH_216,
  LOST_VACUUM_217,
  PARASECT_TG01,
  ROSERADE_TG02,
  CHARIZARD_TG03,
  CHANDELURE_TG04,
  PIKACHU_TG05,
  GENGAR_TG06,
  BANETTE_TG07,
  HISUIAN_ARCANINE_TG08,
  SPIRITOMB_TG09,
  SNORLAX_TG10,
  CASTFORM_TG11,
  ORBEETLE_V_TG12,
  ORBEETLE_VMAX_TG13,
  CENTISKORCH_V_TG14,
  CENTISKORCH_VMAX_TG15,
  PIKACHU_V_TG16,
  PIKACHU_VMAX_TG17,
  ENAMORUS_V_TG18,
  GALLADE_V_TG19,
  CROBAT_V_TG20,
  ETERNATUS_V_TG21,
  ETERNATUS_VMAX_TG22,
  ADVENTURER_S_DISCOVERY_TG23,
  BOSS_S_ORDERS_TG24,
  COOK_TG25,
  KABU_TG26,
  NESSA_TG27,
  OPAL_TG28,
  PIKACHU_VMAX_TG29,
  MEW_VMAX_TG30
;

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  @Override
  public String toEnumId() {
    return name()+":LOST_ORIGIN";
  }

  @Override
  public Card getImplementation(EnhancedCardInfo stub) {
    switch (this) {


      case ODDISH_1: return cardng (stub) {
        moveAttack "Ram", {
          // 30 damage.
          damage 30
        }
      }



      case GLOOM_2: return cardng (stub) {
        moveAttack "Absorb", {
          // 30 damage. Heal 30 damage from this Pokémon.
          damage 30
        }
      }



      case VILEPLUME_3: return cardng (stub) {
        moveAttack "Mega Drain", {
          // 50 damage. Heal 30 damage from this Pokémon.
          damage 50
        }
        moveAttack "Allergy Storm", {
          // 90 damage. Flip a coin. If heads, during your opponent's next turn, they can't play any Supporter cards from their hand. If tails, during your opponent's next turn, they can't play any Item cards from their hand.
          damage 90
        }
      }



      case PARAS_4: return cardng (stub) {
        moveAttack "Absorb", {
          // 20 damage. Heal 10 damage from this Pokémon.
          damage 20
        }
      }



      case PARASECT_5: return cardng (stub) {
      bwAbility "Lethargy Spores", {
        // When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may make both Active Pokémon Asleep and Poisoned.
        onActivate { reason ->
          if (reason == PLAY_FROM_HAND && confirm("Use Lethargy Spores?")) {
            powerUsed()
            apply ASLEEP, my.active
            apply POISONED, my.active
            apply ASLEEP, opp.active
            apply POISONED, opp.active
          }
        }
      }
      moveAttack "X-Scissor", {
        // 50+ damage. Flip a coin. If heads, this attack does 50 more damage.
        damage 50
        flip { damage 50 }
      }
      }



      case WURMPLE_6: return cardng (stub) {
        moveAttack "Sting", {
          // 10 damage.
          damage 10
        }
        moveAttack "Creepy-Crawly Congregation", {
          // Search your deck for any number of Wurmple, Silcoon, Beautifly, Cascoon, and Dustox, reveal them, and put them into your hand. Then, shuffle your deck.

        }
      }



      case SILCOON_7: return cardng (stub) {
        moveAttack "Entangling String", {
          // Flip a coin. If heads, during your opponent's next turn, the Defending Pokémon can't attack.

        }
        moveAttack "Ram", {
          // 30 damage.
          damage 30
        }
      }



      case BEAUTIFLY_8: return cardng (stub) {
      bwAbility "Stoked Straw", {
        // Once during your turn, you may draw cards until you have 6 cards in your hand.
        actionA {
          checkLastTurn()
          assert my.hand.size() < 6 : "You already have 6 cards in your hand"
          powerUsed()
          draw 6 - my.hand.size()
        }
      }
      moveAttack "Mega Drain", {
        // 70 damage. Heal 30 damage from this Pokémon.
        damage 70
        afterDamage {
          heal 30, self
        }
      }
      }



      case CASCOON_9: return cardng (stub) {
        moveAttack "Harden", {
          // During your opponent's next turn, prevent all damage done to this Pokémon by attacks if that damage is 60 or less.

        }
        moveAttack "Rolling Tackle", {
          // 20 damage.
          damage 20
        }
      }



      case DUSTOX_10: return cardng (stub) {
        moveAttack "Nadir Powder", {
          // Your opponent's Active Pokémon is now Confused and Poisoned. During Pokémon Checkup, put 8 damage counters on that Pokémon instead of 1.

        }
        moveAttack "Cutting Wind", {
          // 110 damage.
          damage 110
        }
      }



      case SEEDOT_11: return cardng (stub) {
        moveAttack "Absorb", {
          // 10 damage. Heal 10 damage from this Pokémon.
          damage 10
        }
      }



      case NUZLEAF_12: return cardng (stub) {
        moveAttack "Push Down", {
          // 30 damage. You may have your opponent switch their Active Pokémon with 1 of their Benched Pokémon.
          damage 30
        }
      }



      case SHIFTRY_13: return cardng (stub) {
        moveAttack "Fan Tornado", {
          // 50 damage. You may have your opponent switch their Active Pokémon with 1 of their Benched Pokémon.
          damage 50
        }
        moveAttack "Tearing Gust", {
          // 210 damage. Put this Pokémon and all attached cards in the Lost Zone.
          damage 210
        }
      }



      case ROSELIA_14: return cardng (stub) {
        moveAttack "Soothing Scent", {
          // Your opponent's Active Pokémon is now Asleep.

        }
      }



      case ROSERADE_15: return cardng (stub) {
        moveAttack "Poisonous Whip", {
          // 30 damage. Your opponent's Active Pokémon is now Poisoned.
          damage 30
        }
        moveAttack "Assassin's Rose", {
          // 60 damage. If your opponent's Active Pokémon is affected by a Special Condition, this attack also does 60 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
          damage 60
        }
      }



      case PHANTUMP_16: return cardng (stub) {
        moveAttack "Hook", {
          // 10 damage.
          damage 10
        }
      }



      case TREVENANT_17: return cardng (stub) {
        bwAbility "Elder Tree Barrier", {
          // If this Pokémon is Knocked Out by damage from an attack from your opponent's Pokémon V, your opponent can't take any Prize cards for it.
          actionA {
          }
        }
        moveAttack "Giga Impact", {
          // 150 damage. During your next turn, this Pokémon can't attack.
          damage 150
        }
      }



      case BLIPBUG_18: return cardng (stub) {
        moveAttack "Gnaw", {
          // 30 damage.
          damage 30
        }
      }



      case DOTTLER_19: return cardng (stub) {
        moveAttack "Barrier Attack", {
          // 30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
          damage 30
        }
      }



      case ORBEETLE_20: return cardng (stub) {
        bwAbility "Jamming Attachment", {
          // When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may attach up to 3 Energy cards from your opponent's discard pile to your opponent's Pokémon in any way you like.
          actionA {
          }
        }
        moveAttack "Mysterious Wave", {
          // 30+ damage. This attack does 50 more damage for each Energy attached to your opponent's Active Pokémon.
          damage 30
        }
      }



      case SLUGMA_21: return cardng (stub) {
        moveAttack "Draw In", {
          // Attach a [R] Energy card from your discard pile to this Pokémon.

        }
        moveAttack "Combustion", {
          // 50 damage.
          damage 50
        }
      }



      case MAGCARGO_22: return cardng (stub) {
        moveAttack "Flare", {
          // 30 damage.
          damage 30
        }
        moveAttack "Lost Volcano", {
          // 220 damage. Put all Energy attached to this Pokémon in the Lost Zone.
          damage 220
        }
      }



      case TORKOAL_23: return cardng (stub) {
        moveAttack "Stampede", {
          // 30 damage.
          damage 30
        }
        moveAttack "Flamethrower", {
          // 130 damage. Discard an Energy from this Pokémon.
          damage 130
        }
      }



      case LITWICK_24: return cardng (stub) {
        moveAttack "Kindling Panic", {
          // Discard the top card of your opponent's deck.

        }
      }



      case LAMPENT_25: return cardng (stub) {
        moveAttack "Flickering Glow", {
          // 20 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon.
          damage 20
        }
      }



      case CHANDELURE_26: return cardng (stub) {
        bwAbility "Mountain Roasting", {
          // When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may discard the top 3 cards of your opponent's deck.
          actionA {
          }
        }
        moveAttack "Heat Blast", {
          // 90 damage.
          damage 90
        }
      }



      case DELPHOX_V_27: return cardng (stub) {
        moveAttack "Eerie Glow", {
          // Your opponent's Active Pokémon is now Burned and Confused.

        }
        moveAttack "Magical Fire", {
          // 120 damage. Put 2 Energy attached to this Pokémon in the Lost Zone. This attack also does 120 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
          damage 120
        }
      }



      case LITLEO_28: return cardng (stub) {
        moveAttack "Singe", {
          // Your opponent's Active Pokémon is now Burned.

        }
      }



      case PYROAR_29: return cardng (stub) {
        bwAbility "Scorching Aura", {
          // During Pokémon Checkup, put 4 damage counters on your opponent's Burned Pokémon instead of 2.
          actionA {
          }
        }
        moveAttack "Fire Fang", {
          // 90 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Burned.
          damage 90
        }
      }



      case POLIWAG_30: return cardng (stub) {
        moveAttack "Splashing Dodge", {
          // 10 damage. Flip a coin. If heads, during your opponent's next turn, prevent all damage from and effects of attacks done to this Pokémon.
          damage 10
        }
      }



      case POLIWHIRL_31: return cardng (stub) {
        moveAttack "Light Punch", {
          // 30 damage.
          damage 30
        }
        moveAttack "Double Smash", {
          // 50x damage. Flip 2 coins. This attack does 50 damage for each heads.
          damage 50
        }
      }



      case POLITOED_32: return cardng (stub) {
        moveAttack "Lordly Songleader", {
          // 10+ damage. If Poliwag is on your Bench, this attack does 60 more damage. If Poliwhirl is on your Bench, this attack does 90 more damage. If Poliwrath is on your Bench, this attack does 120 more damage.
          damage 10
        }
        moveAttack "Hydro Splash", {
          // 100 damage.
          damage 100
        }
      }



      case SEEL_33: return cardng (stub) {
        moveAttack "Headbutt", {
          // 10 damage.
          damage 10
        }
        moveAttack "Rain Splash", {
          // 20 damage.
          damage 20
        }
      }



      case DEWGONG_34: return cardng (stub) {
        moveAttack "Swim Freely", {
          // 10 damage. Flip a coin. If heads, during your opponent's next turn, prevent all damage from and effects of attacks done to this Pokémon.
          damage 10
        }
        moveAttack "Floe Return", {
          // 40x damage. Shuffle any amount of [W] Energy from your Pokémon into your deck. This attack does 40 damage for each card you shuffled into your deck in this way.
          damage 40
        }
      }



      case HORSEA_35: return cardng (stub) {
        moveAttack "Reverse Thrust", {
          // 10 damage. Switch this Pokémon with 1 of your Benched Pokémon.
          damage 10
        }
      }



      case SEADRA_36: return cardng (stub) {
        moveAttack "Swim Freely", {
          // 10 damage. Flip a coin. If heads, during your opponent's next turn, prevent all damage from and effects of attacks done to this Pokémon.
          damage 10
        }
        moveAttack "Hydro Jet", {
          // This attack does 20 damage to 1 of your opponent's Pokémon for each [W] Energy attached to this Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

        }
      }



      case KINGDRA_37: return cardng (stub) {
        bwAbility "Seething Currents", {
          // Once during your turn, you may have either player shuffle their hand and put it on the bottom of their deck. If that player put any cards on the bottom of their deck in this way, they draw 4 cards.
          actionA {
          }
        }
        moveAttack "Hydro Splash", {
          // 130 damage.
          damage 130
        }
      }



      case LUVDISC_38: return cardng (stub) {
        moveAttack "Matching Look", {
          // Each player reveals the top 2 cards of their deck, then draws those cards.

        }
        moveAttack "Tackle", {
          // 30 damage.
          damage 30
        }
      }



      case SHELLOS_39: return cardng (stub) {
        moveAttack "Rain Splash", {
          // 10 damage.
          damage 10
        }
        moveAttack "Surf", {
          // 30 damage.
          damage 30
        }
      }





      case LUMINEON_41: return cardng (stub) {
        moveAttack "Swim Freely", {
          // 10 damage. Flip a coin. If heads, during your opponent's next turn, prevent all damage from and effects of attacks done to this Pokémon.
          damage 10
        }
        moveAttack "Waterfall", {
          // 120 damage.
          damage 120
        }
      }



      case SNOVER_42: return cardng (stub) {
        moveAttack "Corkscrew Punch", {
          // 10 damage.
          damage 10
        }
        moveAttack "Icicle Missile", {
          // 60 damage.
          damage 60
        }
      }



      case ABOMASNOW_43: return cardng (stub) {
        moveAttack "Icicle Punch", {
          // 50 damage.
          damage 50
        }
        moveAttack "Double-Edge", {
          // 160 damage. This Pokémon also does 30 damage to itself.
          damage 160
        }
      }



      case HISUIAN_BASCULIN_44: return cardng (stub) {
        moveAttack "Surprise Attack", {
          // 40 damage. Flip a coin. If tails, this attack does nothing.
          damage 40
        }
      }



      case HISUIAN_BASCULEGION_45: return cardng (stub) {
        moveAttack "Upstream Spirits", {
          // 20x damage. This attack does 20 damage for each basic Energy card in your discard pile. Then, shuffle those cards into your deck.
          damage 20
        }
        moveAttack "Water Shot", {
          // 70 damage. Discard an Energy from this Pokémon.
          damage 70
        }
      }



      case DUCKLETT_46: return cardng (stub) {
        moveAttack "Rain Splash", {
          // 20 damage.
          damage 20
        }
      }



      case SWANNA_47: return cardng (stub) {
        moveAttack "Water Pulse", {
          // 20 damage. Your opponent's Active Pokémon is now Asleep.
          damage 20
        }
        moveAttack "Air Slash", {
          // 130 damage. Discard an Energy from this Pokémon.
          damage 130
        }
      }



      case KYUREM_V_48: return cardng (stub) {
        moveAttack "Rapid Freeze", {
          // Attach any number of [W] Energy cards from your hand to your Pokémon in any way you like.

        }
        moveAttack "Frost Smash", {
          // 140 damage.
          damage 140
        }
      }



      case KYUREM_VMAX_49: return cardng (stub) {
        bwAbility "Glaciated World", {
          // Once during your turn, you may discard the top card of your deck. If that card is a [W] Energy card, attach it to 1 of your Pokémon.
          actionA {
          }
        }
        moveAttack "Max Frost", {
          // 120+ damage. You may discard any amount of [W] Energy from this Pokémon. This attack does 50 more damage for each card you discarded in this way.
          damage 120
        }
      }



      case CRAMORANT_50: return cardng (stub) {
        bwAbility "Lost Provisions", {
          // If you have 4 or more cards in the Lost Zone, ignore all Energy in this Pokémon's attack costs.
          actionA {
          }
        }
        moveAttack "Spit Innocently", {
          // 110 damage. This attack's damage isn't affected by Weakness.
          damage 110
        }
      }



      case GLASTRIER_51: return cardng (stub) {
        moveAttack "Freeze Down", {
          // 40 damage. If the Defending Pokémon is a Basic Pokémon, it can't attack during your opponent's next turn.
          damage 40
        }
        moveAttack "Wild Tackle", {
          // 130 damage. This Pokémon also does 30 damage to itself.
          damage 130
        }
      }



      case PIKACHU_52: return cardng (stub) {
        bwAbility "Pika Dash", {
          // If this Pokémon has any Energy attached, it has no Retreat Cost.
          actionA {
          }
        }
        moveAttack "Whimsy Tackle", {
          // 50 damage. Flip a coin. If tails, this attack does nothing.
          damage 50
        }
      }



      case RAICHU_53: return cardng (stub) {
        moveAttack "Thunder Shock", {
          // 30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
          damage 30
        }
        moveAttack "Ace Spark", {
          // 100+ damage. If you have used your VSTAR Power, this attack does 120 more damage.
          damage 100
        }
      }



      case ELECTRIKE_54: return cardng (stub) {
        moveAttack "Zap Kick", {
          // 10 damage.
          damage 10
        }
        moveAttack "Thunder Fang", {
          // 20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
          damage 20
        }
      }



      case MANECTRIC_55: return cardng (stub) {
        moveAttack "Bite", {
          // 50 damage.
          damage 50
        }
        moveAttack "Assault Laser", {
          // 80+ damage. If your opponent's Active Pokémon has a Pokémon Tool attached, this attack does 80 more damage.
          damage 80
        }
      }



      case MAGNEZONE_V_56: return cardng (stub) {
        moveAttack "Magnetic Tension", {
          // Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. This attack does 40 damage to the new Active Pokémon.

        }
        moveAttack "Splitting Beam", {
          // 90 damage. This attack also does 30 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
          damage 90
        }
      }



      case MAGNEZONE_VSTAR_57: return cardng (stub) {
        moveAttack "Magnetic Grip", {
          // 180 damage. Search your deck for up to 2 Item cards, reveal them, and put them into your hand. Then, shuffle your deck.
          damage 180
        }
        moveAttack "Electro Star", {
          // This attack does 90 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can't use more than 1 VSTAR Power in a game.)

        }
      }



      case ROTOM_V_58: return cardng (stub) {
        bwAbility "Instant Charge", {
          // Once during your turn, you may draw 3 cards. If you use this Ability, your turn ends.
          actionA {
          }
        }
        moveAttack "Scrap Short", {
          // 40+ damage. Put any number of Pokémon Tool cards from your discard pile in the Lost Zone. This attack does 40 more damage for each card you put in the Lost Zone in this way.
          damage 40
        }
      }



      case TYNAMO_59: return cardng (stub) {
        moveAttack "Call Sign", {
          // Search your deck for a [L] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck.

        }
        moveAttack "Tiny Charge", {
          // 10 damage.
          damage 10
        }
      }



      case EELEKTRIK_60: return cardng (stub) {
        bwAbility "Ad Hoc Shock", {
          // When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
          actionA {
          }
        }
        moveAttack "Static Shock", {
          // 30 damage.
          damage 30
        }
      }



      case EELEKTROSS_61: return cardng (stub) {
        moveAttack "Coil", {
          // 10 damage. During your next turn, this Pokémon's attacks do 120 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance).
          damage 10
        }
        moveAttack "Extreme Current", {
          // 160 damage. Discard 2 Energy from this Pokémon.
          damage 160
        }
      }



      case CLEFAIRY_62: return cardng (stub) {
        bwAbility "Moon-Watching Party", {
          // Once during your turn, if this Pokémon is in the Active Spot, for each of your Benched Clefairy, you may search your deck for a [P] Energy card and attach it to that Clefairy. Then, shuffle your deck.
          actionA {
          }
        }
        moveAttack "Wonder Storm", {
          // 20x damage. This attack does 20 damage for each [P] Energy attached to all of your Pokémon.
          damage 20
        }
      }



      case CLEFABLE_63: return cardng (stub) {
        bwAbility "Spirit Charm", {
          // All of your Pokémon take 30 less damage from attacks from your opponent's [N] Pokémon (after applying Weakness and Resistance). You can't apply more than 1 Spirit Charm Ability at a time.
          actionA {
          }
        }
        moveAttack "Moon Impact", {
          // 90 damage.
          damage 90
        }
      }



      case GASTLY_64: return cardng (stub) {
        moveAttack "Furtive Drop", {
          // Put 1 damage counter on your opponent's Active Pokémon.

        }
      }



      case HAUNTER_65: return cardng (stub) {
        moveAttack "Cursed Drop", {
          // Put 3 damage counters on your opponent's Pokémon in any way you like.

        }
      }





      case MR_MIME_67: return cardng (stub) {
        moveAttack "Pound", {
          // 20 damage.
          damage 20
        }
        moveAttack "Tricky Slap", {
          // 90 damage. You and your opponent play Rock-Paper-Scissors until someone wins. If you win, during your opponent's next turn, prevent all damage from and effects of attacks done to this Pokémon.
          damage 90
        }
      }



      case JYNX_68: return cardng (stub) {
        moveAttack "Alluring Dance", {
          // Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. The new Active Pokémon is now Confused.

        }
        moveAttack "Super Psy Bolt", {
          // 80 damage.
          damage 80
        }
      }



      case RADIANT_GARDEVOIR_69: return cardng (stub) {
        bwAbility "Loving Veil", {
          // All of your Pokémon take 20 less damage from attacks from your opponent's Pokémon V (after applying Weakness and Resistance).
          actionA {
          }
        }
        moveAttack "Psychic", {
          // 70+ damage. This attack does 20 more damage for each Energy attached to your opponent's Active Pokémon.
          damage 70
        }
      }



      case SABLEYE_70: return cardng (stub) {
        moveAttack "Scratch", {
          // 20 damage.
          damage 20
        }
        moveAttack "Lost Mine", {
          // You can use this attack only if you have 10 or more cards in the Lost Zone. Put 12 damage counters on your opponent's Pokémon in any way you like.

        }
      }



      case MAWILE_71: return cardng (stub) {
        moveAttack "Tempting Trap", {
          // During your opponent's next turn, the Defending Pokémon can't retreat. During your next turn, the Defending Pokémon takes 90 more damage from attacks (after applying Weakness and Resistance).

        }
        moveAttack "Bite", {
          // 90 damage.
          damage 90
        }
      }



      case SHUPPET_72: return cardng (stub) {
        moveAttack "Tongue Slap", {
          // 30 damage.
          damage 30
        }
      }



      case BANETTE_73: return cardng (stub) {
        bwAbility "Puppet Offering", {
          // Once during your turn, you may put a Supporter card from your discard pile into your hand. If you do, put this Pokémon in the Lost Zone. (Discard all attached cards.)
          actionA {
          }
        }
        moveAttack "Spooky Shot", {
          // 50 damage.
          damage 50
        }
      }



      case CRESSELIA_74: return cardng (stub) {
        moveAttack "Moonglow Reverse", {
          // Move 2 damage counters from each of your Pokémon to 1 of your opponent's Pokémon.

        }
        moveAttack "Lunar Blast", {
          // 110 damage.
          damage 110
        }
      }



      case HISUIAN_ZORUA_75: return cardng (stub) {
        moveAttack "Collect", {
          // Draw a card.

        }
        moveAttack "Mumble", {
          // 10 damage.
          damage 10
        }
      }



      case HISUIAN_ZOROARK_76: return cardng (stub) {
        moveAttack "Doom Curse", {
          // At the end of your opponent's next turn, the Defending Pokémon will be Knocked Out.

        }
        moveAttack "Call Back", {
          // Put a card from your discard pile into your hand.

        }
      }



      case INKAY_77: return cardng (stub) {
        moveAttack "Fickle Attack", {
          // 30 damage. Flip a coin. If tails, this attack does nothing.
          damage 30
        }
      }



      case MALAMAR_78: return cardng (stub) {
        moveAttack "Synchro Kinesis", {
          // 30+ damage. Each player reveals their hand. If a card in your opponent's hand has the same name as a card in your hand, this attack does 90 more damage.
          damage 30
        }
        moveAttack "Psychic Sphere", {
          // 80 damage.
          damage 80
        }
      }





      case MIMIKYU_80: return cardng (stub) {
        moveAttack "Perplex", {
          // Your opponent's Active Pokémon is now Confused.

        }
        moveAttack "Worst Gift", {
          // 10x damage. This attack does 10 damage for each damage counter on all of your opponent's Pokémon.
          damage 10
        }
      }



      case SPECTRIER_81: return cardng (stub) {
        moveAttack "Night Footsteps", {
          // Choose 2 of your opponent's Pokémon and put 2 damage counters on each of them.

        }
        moveAttack "Phantom Strike", {
          // 120 damage. During your next turn, this Pokémon can't use Phantom Strike.
          damage 120
        }
      }



      case ENAMORUS_V_82: return cardng (stub) {
        bwAbility "Guardian of Love", {
          // Prevent all effects of your opponent's Pokémon's Abilities done to each of your Pokémon that has any [P] Energy attached, except any Enamorus V.
          actionA {
          }
        }
        moveAttack "Blossom Tail", {
          // 100 damage. Attach up to 2 basic Energy cards from your discard pile to your Benched Pokémon in any way you like.
          damage 100
        }
      }



      case HISUIAN_GROWLITHE_83: return cardng (stub) {
        moveAttack "Singe", {
          // Your opponent's Active Pokémon is now Burned.

        }
      }



      case HISUIAN_ARCANINE_84: return cardng (stub) {
        moveAttack "Very Vulnerable", {
          // 10+ damage. If you have no cards in your hand, this attack does 150 more damage.
          damage 10
        }
        moveAttack "Sharp Fang", {
          // 100 damage.
          damage 100
        }
      }



      case POLIWRATH_85: return cardng (stub) {
        moveAttack "Split Spiral Punch", {
          // 60 damage. Your opponent's Active Pokémon is now Confused.
          damage 60
        }
        moveAttack "Splash Loop", {
          // 160 damage. Put 2 Energy attached to this Pokémon into your hand.
          damage 160
        }
      }



      case MACHOP_86: return cardng (stub) {
        moveAttack "Punch", {
          // 20 damage.
          damage 20
        }
      }



      case MACHOKE_87: return cardng (stub) {
        moveAttack "Strength", {
          // 30 damage.
          damage 30
        }
        moveAttack "Seismic Toss", {
          // 50 damage.
          damage 50
        }
      }





      case RHYHORN_89: return cardng (stub) {
        moveAttack "Take Down", {
          // 70 damage. This Pokémon also does 20 damage to itself.
          damage 70
        }
      }



      case RHYDON_90: return cardng (stub) {
        moveAttack "Horn Drill", {
          // 30 damage.
          damage 30
        }
        moveAttack "Take Down", {
          // 120 damage. This Pokémon also does 30 damage to itself.
          damage 120
        }
      }



      case RHYPERIOR_91: return cardng (stub) {
        moveAttack "Geo Cannon", {
          // 50+ damage. Discard the top card of your deck. If that card is an Energy card, this attack does 100 more damage, and attach that card to this Pokémon.
          damage 50
        }
        moveAttack "Rocky Tackle", {
          // 180 damage. This Pokémon also does 30 damage to itself.
          damage 180
        }
      }



      case AERODACTYL_V_92: return cardng (stub) {
        moveAttack "Bite", {
          // 40 damage.
          damage 40
        }
        moveAttack "Rock Crush", {
          // 120 damage. Discard an Energy from your opponent's Active Pokémon.
          damage 120
        }
      }



      case AERODACTYL_VSTAR_93: return cardng (stub) {
        moveAttack "Lost Dive", {
          // 240 damage. Put the top 3 cards of your deck in the Lost Zone.
          damage 240
        }
        moveAttack "Ancient Star", {
          // Until this Pokémon leaves play, it gains an Ability that has the effect "Your opponent's Pokémon V in play, except any Aerodactyl VSTAR, have no Abilities." (You can't use more than 1 VSTAR Power in a game.)

        }
      }



      case SUDOWOODO_94: return cardng (stub) {
        moveAttack "Joust", {
          // 20 damage. Before doing damage, discard all Pokémon Tools from your opponent's Active Pokémon.
          damage 20
        }
        moveAttack "Impound", {
          // 50 damage. During your opponent's next turn, the Defending Pokémon can't retreat.
          damage 50
        }
      }



      case GLIGAR_95: return cardng (stub) {
        moveAttack "Cyclone Pincers", {
          // 10x damage. Flip 4 coins. This attack does 10 damage for each heads.
          damage 10
        }
      }



      case GLISCOR_96: return cardng (stub) {
        moveAttack "Hurricane Shock", {
          // 50x damage. Flip 4 coins. This attack does 50 damage for each heads. If at least 2 of them are heads, your opponent's Active Pokémon is now Paralyzed.
          damage 50
        }
      }



      case MAKUHITA_97: return cardng (stub) {
        moveAttack "Fake Out", {
          // 20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
          damage 20
        }
      }



      case HARIYAMA_98: return cardng (stub) {
        moveAttack "Shove", {
          // 40 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
          damage 40
        }
        moveAttack "Muscular Slap", {
          // 100 damage. This attack's damage isn't affected by Resistance.
          damage 100
        }
      }



      case MEDITITE_99: return cardng (stub) {
        moveAttack "Focus Fist", {
          // 30 damage. Flip a coin. If tails, this attack does nothing.
          damage 30
        }
      }



      case MEDICHAM_100: return cardng (stub) {
        moveAttack "Battle Step", {
          // 50 damage. Search your deck for up to 2 [F] Energy cards and attach them to your Benched Pokémon in any way you like. Then, shuffle your deck.
          damage 50
        }
      }



      case RELICANTH_101: return cardng (stub) {
        moveAttack "Into the Deep", {
          // Put up to 2 basic Energy cards from your discard pile into your hand.

        }
        moveAttack "Tackle", {
          // 80 damage.
          damage 80
        }
      }



      case GASTRODON_102: return cardng (stub) {
        moveAttack "Recover", {
          // Discard an Energy from this Pokémon and heal all damage from it.

        }
        moveAttack "Earthquake", {
          // 170 damage. This attack also does 20 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
          damage 170
        }
      }



      case MIENFOO_103: return cardng (stub) {
        moveAttack "Chop", {
          // 10 damage.
          damage 10
        }
        moveAttack "Spiral Kick", {
          // 30 damage.
          damage 30
        }
      }



      case MIENSHAO_104: return cardng (stub) {
        moveAttack "Pound", {
          // 30 damage.
          damage 30
        }
        moveAttack "Double Smash", {
          // 70x damage. Flip 2 coins. This attack does 70 damage for each heads.
          damage 70
        }
      }



      case LANDORUS_105: return cardng (stub) {
        moveAttack "Slap Push", {
          // 20 damage.
          damage 20
        }
        moveAttack "Smashing Edge", {
          // 130 damage. Discard 2 Energy from this Pokémon.
          damage 130
        }
      }



      case BINACLE_106: return cardng (stub) {
        moveAttack "Mud-Slap", {
          // 10 damage.
          damage 10
        }
        moveAttack "Slash", {
          // 20 damage.
          damage 20
        }
      }



      case BARBARACLE_107: return cardng (stub) {
        bwAbility "Lost Block", {
          // Your opponent puts any Prize cards they would take in the Lost Zone instead of into their hand.
          actionA {
          }
        }
        moveAttack "Dynamic Chop", {
          // 100 damage.
          damage 100
        }
      }



      case CARBINK_108: return cardng (stub) {
        moveAttack "Lucky Find", {
          // Search your deck for up to 2 Item cards, reveal them, and put them into your hand. Then, shuffle your deck.

        }
        moveAttack "Power Gem", {
          // 80 damage.
          damage 80
        }
      }



      case ROCKRUFF_109: return cardng (stub) {
        moveAttack "Double Draw", {
          // Draw 2 cards.

        }
        moveAttack "Rear Kick", {
          // 30 damage.
          damage 30
        }
      }



      case FALINKS_110: return cardng (stub) {
        moveAttack "Fighting Headbutt", {
          // 10+ damage. This attack's damage isn't affected by Weakness. If your opponent's Active Pokémon is a Pokémon V, this attack does 50 more damage.
          damage 10
        }
        moveAttack "Jet Headbutt", {
          // 80 damage.
          damage 80
        }
      }



      case STONJOURNER_111: return cardng (stub) {
        moveAttack "Power Stone", {
          // Attach up to 2 [F] Energy cards from your hand to your Pokémon in any way you like.

        }
        moveAttack "Lost Shot", {
          // 120 damage. Put the top card of your opponent's deck in the Lost Zone.
          damage 120
        }
      }



      case SPINARAK_112: return cardng (stub) {
        moveAttack "Poison Sting", {
          // 10 damage. Your opponent's Active Pokémon is now Poisoned.
          damage 10
        }
      }



      case ARIADOS_113: return cardng (stub) {
        moveAttack "String Bind", {
          // 10+ damage. This attack does 30 more damage for each [C] in your opponent's Active Pokémon's Retreat Cost.
          damage 10
        }
        moveAttack "Venomous Fang", {
          // 80 damage. Your opponent's Active Pokémon is now Poisoned.
          damage 80
        }
      }



      case MURKROW_114: return cardng (stub) {
        moveAttack "Peck", {
          // 10 damage.
          damage 10
        }
        moveAttack "Wing Attack", {
          // 30 damage.
          damage 30
        }
      }



      case HONCHKROW_115: return cardng (stub) {
        moveAttack "Peck", {
          // 20 damage.
          damage 20
        }
        moveAttack "Night Cyclone", {
          // 160 damage. Move all Energy from this Pokémon to your Benched Pokémon in any way you like.
          damage 160
        }
      }



      case SEVIPER_116: return cardng (stub) {
        moveAttack "Sucker Punch and Turn", {
          // 60 damage. Switch this Pokémon with 1 of your Benched [D] Pokémon.
          damage 60
        }
      }



      case SPIRITOMB_117: return cardng (stub) {
        bwAbility "Cursed Message", {
          // If this Pokémon is Knocked Out by damage from an attack from your opponent's Pokémon, search your deck for a card and put it into your hand. Then, shuffle your deck.
          actionA {
          }
        }
        moveAttack "Chain of Spirits", {
          // 10+ damage. This attack does 60 more damage for each Spiritomb in your discard pile.
          damage 10
        }
      }



      case DRAPION_V_118: return cardng (stub) {
        bwAbility "Wild Style", {
          // This Pokémon's attacks cost [C] less for each of your opponent's Single Strike, Rapid Strike, and Fusion Strike Pokémon in play.
          actionA {
          }
        }
        moveAttack "Dynamic Tail", {
          // 190 damage. This attack also does 60 damage to 1 of your Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
          damage 190
        }
      }



      case DRAPION_VSTAR_119: return cardng (stub) {
        bwAbility "Hazard Star", {
          // During your turn, you may make your opponent's Active Pokémon Paralyzed and Poisoned. During Pokémon Checkup, put 3 damage counters on that Pokémon instead of 1. (You can't use more than 1 VSTAR Power in a game.)
          actionA {
          }
        }
        moveAttack "Big Bang Arm", {
          // 250- damage. This attack does 10 less damage for each damage counter on this Pokémon.
          damage 250
        }
      }



      case DARKRAI_120: return cardng (stub) {
        moveAttack "Nightmare", {
          // 30 damage. Your opponent's Active Pokémon is now Asleep.
          damage 30
        }
        moveAttack "Pitch-Black Blade", {
          // 130 damage. During your next turn, this Pokémon can't attack.
          damage 130
        }
      }



      case INKAY_121: return cardng (stub) {
        moveAttack "Call for Family", {
          // Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck.

        }
        moveAttack "Tackle", {
          // 20 damage.
          damage 20
        }
      }



      case HOOPA_122: return cardng (stub) {
        moveAttack "Hand of Djinn", {
          // Search your deck for a [D] Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck.

        }
        moveAttack "Tyrannical Hole", {
          // 100 damage.
          damage 100
        }
      }



      case RADIANT_HISUIAN_SNEASLER_123: return cardng (stub) {
        bwAbility "Poison Peak", {
          // During Pokémon Checkup, put 2 more damage counters on your opponent's Poisoned Pokémon.
          actionA {
          }
        }
        moveAttack "Poison Jab", {
          // 90 damage. Your opponent's Active Pokémon is now Poisoned.
          damage 90
        }
      }



      case RADIANT_STEELIX_124: return cardng (stub) {
        moveAttack "Energy Stream", {
          // 20 damage. Attach up to 2 [M] Energy cards from your discard pile to this Pokémon.
          damage 20
        }
        moveAttack "Destructive Finish", {
          // 60+ damage. Discard cards from the top of your deck until only 1 card remains. This attack does 30 more damage for each Energy card you discarded in this way.
          damage 60
        }
      }



      case BRONZOR_125: return cardng (stub) {
        moveAttack "Spinning Attack", {
          // 10 damage.
          damage 10
        }
      }



      case BRONZONG_126: return cardng (stub) {
        moveAttack "Ram", {
          // 30 damage.
          damage 30
        }
        moveAttack "Gravitational Drop", {
          // 40+ damage. This attack does 40 more damage for each [C] in your opponent's Active Pokémon's Retreat Cost.
          damage 40
        }
      }



      case GALARIAN_STUNFISK_127: return cardng (stub) {
        moveAttack "Field Trap", {
          // 20 damage. If your opponent has a Stadium in play, discard it. If you discarded a Stadium in this way, discard 2 Energy from your opponent's Active Pokémon.
          damage 20
        }
        moveAttack "Tackle", {
          // 50 damage.
          damage 50
        }
      }



      case MAGEARNA_128: return cardng (stub) {
        moveAttack "Gear Cutter", {
          // 20 damage.
          damage 20
        }
        moveAttack "Windup Beam", {
          // 60+ damage. If this Pokémon has a Pokémon Tool attached, this attack does 60 more damage, and your opponent's Active Pokémon is now Confused.
          damage 60
        }
      }



      case GALARIAN_PERRSERKER_V_129: return cardng (stub) {
        moveAttack "Feelin' Fine", {
          // Draw 3 cards.

        }
        moveAttack "Treasure Rush", {
          // 20x damage. This attack does 20 damage for each card in your hand.
          damage 20
        }
      }





      case GIRATINA_VSTAR_131: return cardng (stub) {
        moveAttack "Lost Impact", {
          // 280 damage. Put 2 Energy attached to your Pokémon in the Lost Zone.
          damage 280
        }
        moveAttack "Star Requiem", {
          // You can use this attack only if you have 10 or more cards in the Lost Zone. Your opponent's Active Pokémon is Knocked Out. (You can't use more than 1 VSTAR Power in a game.)

        }
      }



      case GOOMY_132: return cardng (stub) {
        moveAttack "Tackle", {
          // 10 damage.
          damage 10
        }
        moveAttack "Melt", {
          // 30 damage.
          damage 30
        }
      }



      case HISUIAN_SLIGGOO_133: return cardng (stub) {
        moveAttack "Rigidify", {
          // During your opponent's next turn, this Pokémon takes 50 less damage from attacks (after applying Weakness and Resistance).

        }
        moveAttack "Gentle Slap", {
          // 40 damage.
          damage 40
        }
      }



      case HISUIAN_GOODRA_134: return cardng (stub) {
        bwAbility "Metal Lodging", {
          // Prevent all damage done to each of your Basic Pokémon that has any [M] Energy attached by attacks from your opponent's Pokémon V.
          actionA {
          }
        }
        moveAttack "Heavy Impact", {
          // 140 damage.
          damage 140
        }
      }



      case HISUIAN_GOODRA_V_135: return cardng (stub) {
        moveAttack "Slip-'n'-Trip", {
          // 60 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon.
          damage 60
        }
        moveAttack "Rolling Shell", {
          // 140 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
          damage 140
        }
      }



      case HISUIAN_GOODRA_VSTAR_136: return cardng (stub) {
        bwAbility "Moisture Star", {
          // During your turn, you may heal all damage from this Pokémon. (You can't use more than 1 VSTAR Power in a game.)
          actionA {
          }
        }
        moveAttack "Rolling Iron", {
          // 200 damage. During your opponent's next turn, this Pokémon takes 80 less damage from attacks (after applying Weakness and Resistance).
          damage 200
        }
      }



      case PIDGEOT_V_137: return cardng (stub) {
        bwAbility "Vanishing Wings", {
          // Once during your turn, if this Pokémon is on your Bench, you may shuffle it and all attached cards into your deck.
          actionA {
          }
        }
        moveAttack "Flight Surf", {
          // 80+ damage. If you have a Stadium in play, this attack does 80 more damage.
          damage 80
        }
      }



      case LICKITUNG_138: return cardng (stub) {
        moveAttack "Drool", {
          // 30 damage.
          damage 30
        }
      }



      case LICKILICKY_139: return cardng (stub) {
        moveAttack "Tongue Slap", {
          // 50 damage.
          damage 50
        }
        moveAttack "Heavy Impact", {
          // 130 damage.
          damage 130
        }
      }



      case PORYGON_140: return cardng (stub) {
        moveAttack "Branch Calculation", {
          // Look at the top 4 cards of either player's deck and put them back in any order.

        }
        moveAttack "Beam", {
          // 10 damage.
          damage 10
        }
      }



      case PORYGON2_141: return cardng (stub) {
        moveAttack "Garbage Attack", {
          // 20x damage. This attack does 20 damage for each Pokémon Tool card in the Lost Zone (both yours and your opponent's).
          damage 20
        }
      }



      case PORYGON_Z_142: return cardng (stub) {
        moveAttack "Downgrading Beam", {
          // Devolve 1 of your opponent's evolved Pokémon by removing any number of Evolution cards from it. Your opponent shuffles those cards into their deck.

        }
        moveAttack "Power Beam", {
          // 130 damage.
          damage 130
        }
      }



      case SNORLAX_143: return cardng (stub) {
        bwAbility "Unfazed Fat", {
          // Prevent all effects of attacks from your opponent's Pokémon done to this Pokémon. (Damage is not an effect.)
          actionA {
          }
        }
        moveAttack "Thumping Snore", {
          // 180 damage. This Pokémon is now Asleep. During Pokémon Checkup, flip 2 coins instead of 1. If either of them is tails, this Pokémon is still Asleep.
          damage 180
        }
      }



      case AIPOM_144: return cardng (stub) {
        moveAttack "Mischievous Tail", {
          // Look at the top card of your opponent's deck. You may have your opponent shuffle their deck.

        }
        moveAttack "Scratch", {
          // 10 damage.
          damage 10
        }
      }



      case AMBIPOM_145: return cardng (stub) {
        moveAttack "All-You-Can-Grab", {
          // Flip a coin until you get tails. Search your deck for a number of cards up to the number of heads and put them into your hand. Then, shuffle your deck.

        }
        moveAttack "Knock Off", {
          // 50 damage. Discard a random card from your opponent's hand.
          damage 50
        }
      }







      case BOUFFALANT_148: return cardng (stub) {
        moveAttack "Lost Headbutt", {
          // 50 damage. Put an Energy attached to your opponent's Active Pokémon in the Lost Zone.
          damage 50
        }
        moveAttack "Superpowered Horns", {
          // 120 damage.
          damage 120
        }
      }



      case KOMALA_149: return cardng (stub) {
        bwAbility "All Just a Dream", {
          // If this Pokémon is Asleep and is Knocked Out by damage from an attack from your opponent's Pokémon, your opponent can't take any Prize cards for it.
          actionA {
          }
        }
        moveAttack "Collapse", {
          // 60 damage. This Pokémon is now Asleep.
          damage 60
        }
      }



      case SKWOVET_150: return cardng (stub) {
        moveAttack "Gnaw", {
          // 20 damage.
          damage 20
        }
      }



      case GREEDENT_151: return cardng (stub) {
        moveAttack "Collect", {
          // Draw 2 cards.

        }
        moveAttack "Spill Out", {
          // 60+ damage. Discard your hand. If you discarded 5 or more cards in this way, this attack does 150 more damage.
          damage 60
        }
      }



      case ARC_PHONE_152: return cardng (stub) {
        // Look at the top card of your deck. You may switch that card with 1 of your face-down Prize cards. (The cards stay face down.)
        onPlay {
        }
        playRequirement{
        }
      }



      case AREZU_153: return cardng (stub) {
        // Search your deck for up to 3 Evolution Pokémon that don't have a Rule Box, reveal them, and put them into your hand. Then, shuffle your deck. (Pokémon V, Pokémon-GX, etc. have Rule Boxes.)
        onPlay {
        }
        playRequirement{
        }
      }



      case BOX_OF_DISASTER_154: return cardng (stub) {
        // If the Pokémon V this card is attached to has full HP and is Knocked Out by damage from an attack from your opponent's Pokémon, put 8 damage counters on the Attacking Pokémon.
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      }



      case COLRESS_S_EXPERIMENT_155: return cardng (stub) {
        // Look at the top 5 cards of your deck and put 3 of them into your hand. Put the other cards in the Lost Zone.
        onPlay {
        }
        playRequirement{
        }
      }



      case DAMAGE_PUMP_156: return cardng (stub) {
        // Move up to 2 damage counters from 1 of your Pokémon to your other Pokémon in any way you like.
        onPlay {
        }
        playRequirement{
        }
      }



      case FANTINA_157: return cardng (stub) {
        // You can use this card only if you have 10 or more cards in the Lost Zone. During your opponent's next turn, all of your Pokémon take 120 less damage from attacks from your opponent's Pokémon V (after applying Weakness and Resistance). (This includes Pokémon that come into play during that turn.)
        onPlay {
        }
        playRequirement{
        }
      }



      case ISCAN_158: return cardng (stub) {
        // Draw 2 cards. If your Active Pokémon has "Hisuian" in its name, draw 2 more cards.
        onPlay {
        }
        playRequirement{
        }
      }



      case LADY_159: return cardng (stub) {
        // Search your deck for up to 4 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck.
        onPlay {
        }
        playRequirement{
        }
      }



      case LAKE_ACUITY_160: return cardng (stub) {
        // All Pokémon that have any Water or [F] Energy attached (both yours and your opponent's) take 20 less damage from attacks from the opponent's Pokémon (after applying Weakness and Resistance).
        onPlay {
        }
        onRemoveFromPlay{
        }
      }



      case LOST_CITY_161: return cardng (stub) {
        // Whenever a Pokémon (either yours or your opponent's) is Knocked Out, put that Pokémon in the Lost Zone instead of the discard pile. (Discard all attached cards.)
        onPlay {
        }
        onRemoveFromPlay{
        }
      }



      case LOST_VACUUM_162: return cardng (stub) {
        // You can use this card only if you put another card from your hand in the Lost Zone. Choose a Pokémon Tool attached to any Pokémon, or any Stadium in play, and put it in the Lost Zone.
        onPlay {
        }
        playRequirement{
        }
      }



      case MIRAGE_GATE_163: return cardng (stub) {
        // You can use this card only if you have 7 or more cards in the Lost Zone. Search your deck for up to 2 basic Energy cards of different types and attach them to your Pokémon in any way you like. Then, shuffle your deck.
        onPlay {
        }
        playRequirement{
        }
      }



      case MISS_FORTUNE_SISTERS_164: return cardng (stub) {
        // Look at the top 5 cards of your opponent's deck and discard any number of Item cards you find there. Your opponent shuffles the other cards back into their deck.
        onPlay {
        }
        playRequirement{
        }
      }



      case PANIC_MASK_165: return cardng (stub) {
        // Prevent all damage done to the Pokémon this card is attached to by attacks from your opponent's Pokémon that have 40 HP or less remaining.
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      }



      case RILEY_166: return cardng (stub) {
        // Reveal the top 5 cards of your deck and have your opponent choose 2 of them. Discard the chosen cards and put the remaining cards into your hand.
        onPlay {
        }
        playRequirement{
        }
      }



      case THORTON_167: return cardng (stub) {
        // Choose a Basic Pokémon in your discard pile and switch it with 1 of your Basic Pokémon in play. Any attached cards, damage counters, Special Conditions, turns in play, and any other effects remain on the new Pokémon.
        onPlay {
        }
        playRequirement{
        }
      }



      case TOOL_BOX_168: return cardng (stub) {
        // Look at the top 7 cards of your deck. You may reveal any number of Pokémon Tool cards you find there and put them into your hand. Shuffle the other cards back into your deck.
        onPlay {
        }
        playRequirement{
        }
      }



      case VOLO_169: return cardng (stub) {
        // Discard 1 of your Benched Pokémon V and all attached cards.
        onPlay {
        }
        playRequirement{
        }
      }



      case WINDUP_ARM_170: return cardng (stub) {
        // The Pokémon this card is attached to can attack even if it's Asleep or Paralyzed.
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      }



      case GIFT_ENERGY_171: return cardng (stub) {
        // As long as this card is attached to a Pokémon, it provides [C] Energy. If the Pokémon this card is attached to is Knocked Out by damage from an attack from your opponent's Pokémon, draw cards until you have 7 cards in your hand.
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      }





















































































































      case ORBEETLE_V_TG12: return cardng (stub) {
        moveAttack "Strafe", {
          // 20 damage. You may switch this Pokémon with 1 of your Benched Pokémon.
          damage 20
        }
        moveAttack "Mysterious Wave", {
          // 50+ damage. This attack does 30 more damage for each Energy attached to your opponent's Active Pokémon.
          damage 50
        }
      }









      case PIKACHU_V_TG16: return cardng (stub) {
        moveAttack "Charge", {
          // Search your deck for up to 2 [L] Energy cards and attach them to this Pokémon. Then, shuffle your deck.

        }
        moveAttack "Thunderbolt", {
          // 200 damage. Discard all Energy from this Pokémon.
          damage 200
        }
      }



      case PIKACHU_VMAX_TG17: return cardng (stub) {
        moveAttack "G-Max Volt Tackle", {
          // 120+ damage. You may discard all Energy from this Pokémon. If you do, this attack does 150 more damage.
          damage 120
        }
      }







      case CROBAT_V_TG20: return cardng (stub) {
        bwAbility "Dark Asset", {
          // When you play this Pokémon from your hand onto your Bench during your turn, you may draw cards until you have 6 cards in your hand. You can't use more than 1 Dark Asset Ability each turn.
          actionA {
          }
        }
        moveAttack "Venomous Fang", {
          // 70 damage. Your opponent's Active Pokémon is now Poisoned.
          damage 70
        }
      }



      case ETERNATUS_V_TG21: return cardng (stub) {
        moveAttack "Power Accelerator", {
          // 30 damage. You may attach a [D] Energy card from your hand to 1 of your Benched Pokémon.
          damage 30
        }
        moveAttack "Dynamax Cannon", {
          // 120+ damage. If your opponent's Active Pokémon is a Pokémon VMAX, this attack does 120 more damage.
          damage 120
        }
      }



      case ETERNATUS_VMAX_TG22: return cardng (stub) {
        bwAbility "Eternal Zone", {
          // If all of your Pokémon in play are Darkness type, you can have up to 8 Pokémon on your Bench, and you can't put non-[D] Pokémon into play. (If this Ability stops working, discard Pokémon from your Bench until you have 5.)
          actionA {
          }
        }
        moveAttack "Dread End", {
          // 30x damage. This attack does 30 damage for each of your [D] Pokémon in play.
          damage 30
        }
      }

















        default:
      return null;
    }
  }
}