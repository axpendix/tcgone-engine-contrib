package tcgwars.logic.impl.gen8


import static tcgwars.logic.card.Type.*
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*

import tcgwars.logic.card.*
import tcgwars.logic.util.CardList

/**
 * @author
 */
public enum AstralRadiance implements ImplOnlyCardInfo {

  BEEDRILL_V_1,
  HISUIAN_VOLTORB_2,
  HISUIAN_ELECTRODE_3,
  SCYTHER_4,
  SCYTHER_5,
  YANMA_6,
  YANMEGA_7,
  HERACROSS_8,
  KRICKETOT_9,
  KRICKETUNE_10,
  COMBEE_11,
  VESPIQUEN_12,
  LEAFEON_13,
  SHAYMIN_14,
  PETILIL_15,
  HISUIAN_LILLIGANT_16,
  HISUIAN_LILLIGANT_V_17,
  HISUIAN_LILLIGANT_VSTAR_18,
  ROWLET_19,
  DARTRIX_20,
  PONYTA_21,
  RAPIDASH_22,
  CYNDAQUIL_23,
  QUILAVA_24,
  HEATRAN_V_25,
  HEATRAN_VMAX_26,
  RADIANT_HEATRAN_27,
  PSYDUCK_28,
  GOLDUCK_29,
  STARMIE_V_30,
  SWINUB_31,
  PILOSWINE_32,
  MAMOSWINE_33,
  MANTINE_34,
  BARBOACH_35,
  WHISCASH_36,
  REGICE_37,
  GLACEON_38,
  ORIGIN_FORME_PALKIA_V_39,
  ORIGIN_FORME_PALKIA_VSTAR_40,
  OSHAWOTT_41,
  DEWOTT_42,
  HISUIAN_BASCULIN_43,
  HISUIAN_BASCULEGION_44,
  KELDEO_45,
  RADIANT_GRENINJA_46,
  BERGMITE_47,
  HISUIAN_AVALUGG_48,
  GALARIAN_MR_RIME_V_49,
  LUXRAY_V_50,
  REGIELEKI_51,
  HISUIAN_TYPHLOSION_52,
  HISUIAN_TYPHLOSION_V_53,
  HISUIAN_TYPHLOSION_VSTAR_54,
  TOGEPI_55,
  TOGETIC_56,
  TOGEKISS_57,
  MISDREAVUS_58,
  MISMAGIUS_59,
  RALTS_60,
  KIRLIA_61,
  GALLADE_62,
  DRIFLOON_63,
  DRIFBLIM_64,
  UXIE_65,
  MESPRIT_66,
  AZELF_67,
  DIANCIE_68,
  WYRDEER_69,
  HISUIAN_GROWLITHE_70,
  HISUIAN_ARCANINE_71,
  MACHAMP_V_72,
  MACHAMP_VMAX_73,
  SUDOWOODO_74,
  REGIROCK_75,
  CRANIDOS_76,
  RAMPARDOS_77,
  LUCARIO_V_78,
  HIPPOPOTAS_79,
  HIPPOWDON_80,
  RADIANT_HAWLUCHA_81,
  HISUIAN_DECIDUEYE_82,
  HISUIAN_DECIDUEYE_V_83,
  HISUIAN_DECIDUEYE_VSTAR_84,
  KLEAVOR_85,
  KLEAVOR_86,
  KLEAVOR_V_87,
  HISUIAN_QWILFISH_88,
  HISUIAN_QWILFISH_89,
  HISUIAN_OVERQWIL_90,
  HISUIAN_OVERQWIL_91,
  HISUIAN_SNEASEL_92,
  HISUIAN_SNEASLER_93,
  HISUIAN_SNEASLER_V_94,
  POOCHYENA_95,
  MIGHTYENA_96,
  ABSOL_97,
  DARKRAI_V_98,
  DARKRAI_VSTAR_99,
  HISUIAN_SAMUROTT_100,
  HISUIAN_SAMUROTT_V_101,
  HISUIAN_SAMUROTT_VSTAR_102,
  NICKIT_103,
  THIEVUL_104,
  MAGNEMITE_105,
  MAGNETON_106,
  MAGNEZONE_107,
  REGISTEEL_108,
  SHIELDON_109,
  BASTIODON_110,
  BRONZOR_111,
  BRONZONG_112,
  ORIGIN_FORME_DIALGA_V_113,
  ORIGIN_FORME_DIALGA_VSTAR_114,
  PAWNIARD_115,
  BISHARP_116,
  GARCHOMP_V_117,
  REGIDRAGO_118,
  EEVEE_119,
  HOOTHOOT_120,
  NOCTOWL_121,
  TEDDIURSA_122,
  URSARING_123,
  URSALUNA_124,
  STANTLER_125,
  MILTANK_126,
  GLAMEOW_127,
  PURUGLY_128,
  CHATOT_129,
  REGIGIGAS_130,
  RUFFLET_131,
  HISUIAN_BRAVIARY_132,
  ORANGURU_V_133,
  WYRDEER_V_134,
  ADAMAN_135,
  CANCELING_COLOGNE_136,
  CHOY_137,
  CYLLENE_138,
  DARK_PATCH_139,
  ENERGY_LOTO_140,
  FEATHER_BALL_141,
  GAPEJAW_BOG_142,
  GARDENIA_S_VIGOR_143,
  GRANT_144,
  GUTSY_PICKAXE_145,
  HISUIAN_HEAVY_BALL_146,
  IRIDA_147,
  JUBILIFE_VILLAGE_148,
  KAMADO_149,
  ROXANNE_150,
  SPICY_SEASONED_CURRY_151,
  SUPEREFFECTIVE_GLASSES_152,
  SWEET_HONEY_153,
  SWITCH_CART_154,
  TEMPLE_OF_SINNOH_155,
  TREKKING_SHOES_156,
  UNIDENTIFIED_FOSSIL_157,
  WAIT_AND_SEE_TURBO_158,
  ZISU_159,
  BEEDRILL_V_160,
  BEEDRILL_V_161,
  HISUIAN_LILLIGANT_V_162,
  HISUIAN_LILLIGANT_V_163,
  VIRIZION_V_164,
  HEATRAN_V_165,
  STARMIE_V_166,
  ORIGIN_FORME_PALKIA_V_167,
  LUXRAY_V_168,
  HISUIAN_TYPHLOSION_V_169,
  JIRACHI_V_170,
  MACHAMP_V_171,
  MACHAMP_V_172,
  HISUIAN_DECIDUEYE_V_173,
  HISUIAN_SNEASLER_V_174,
  HISUIAN_SNEASLER_V_175,
  HISUIAN_SAMUROTT_V_176,
  ORIGIN_FORME_DIALGA_V_177,
  GARCHOMP_V_178,
  ORANGURU_V_179,
  WYRDEER_V_180,
  ADAMAN_181,
  CHOY_182,
  CYLLENE_183,
  GARDENIA_S_VIGOR_184,
  GRANT_185,
  IRIDA_186,
  KAMADO_187,
  ROXANNE_188,
  ZISU_189,
  HISUIAN_LILLIGANT_VSTAR_190,
  HEATRAN_VMAX_191,
  ORIGIN_FORME_PALKIA_VSTAR_192,
  HISUIAN_TYPHLOSION_VSTAR_193,
  MACHAMP_VMAX_194,
  HISUIAN_DECIDUEYE_VSTAR_195,
  KLEAVOR_VSTAR_196,
  HISUIAN_SAMUROTT_VSTAR_197,
  ORIGIN_FORME_DIALGA_VSTAR_198,
  ADAMAN_199,
  CHOY_200,
  CYLLENE_201,
  GARDENIA_S_VIGOR_202,
  GRANT_203,
  IRIDA_204,
  KAMADO_205,
  ROXANNE_206,
  ZISU_207,
  ORIGIN_FORME_PALKIA_VSTAR_208,
  HISUIAN_SAMUROTT_VSTAR_209,
  ORIGIN_FORME_DIALGA_VSTAR_210,
  CHOICE_BELT_211,
  JUBILIFE_VILLAGE_212,
  PATH_TO_THE_PEAK_213,
  TEMPLE_OF_SINNOH_214,
  TREKKING_SHOES_215,
  DOUBLE_TURBO_ENERGY_216,
  ABOMASNOW_TG01,
  FLAPPLE_TG02,
  KINGDRA_TG03,
  FROSMOTH_TG04,
  GARDEVOIR_TG05,
  WYRDEER_TG06,
  FALINKS_TG07,
  KLEAVOR_TG08,
  MIGHTYENA_TG09,
  GALARIAN_OBSTAGOON_TG10,
  BRONZONG_TG11,
  HOOTHOOT_TG12,
  STARMIE_V_TG13,
  ICE_RIDER_CALYREX_V_TG14,
  ICE_RIDER_CALYREX_VMAX_TG15,
  GALARIAN_ARTICUNO_V_TG16,
  SHADOW_RIDER_CALYREX_V_TG17,
  SHADOW_RIDER_CALYREX_VMAX_TG18,
  GALARIAN_ZAPDOS_V_TG19,
  GALARIAN_MOLTRES_V_TG20,
  ZACIAN_V_TG21,
  ZAMAZENTA_V_TG22,
  GARCHOMP_V_TG23,
  ALLISTER_TG24,
  BEA_TG25,
  MELONY_TG26,
  MILO_TG27,
  PIERS_TG28,
  ICE_RIDER_CALYREX_VMAX_TG29,
  SHADOW_RIDER_CALYREX_VMAX_TG30
;

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  @Override
  public String toEnumId() {
    return name()+":ASTRAL_RADIANCE";
  }

  @Override
  public Card getImplementation(EnhancedCardInfo stub) {
    switch (this) {


      case BEEDRILL_V_1: return cardng (stub) {
				moveAttack "Twineedle", {
					// 40x damage. Flip 2 coins. This attack does 40 damage for each heads.
					damage 40
				}
				moveAttack "Swarming Sting", {
					// This attack does 50 damage to 1 of your opponent's Pokémon for each of your Beedrill V in play. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
			}



      case HISUIAN_VOLTORB_2: return cardng (stub) {
				moveAttack "Cheerful Charge", {
					// You can use this attack only if you go second, and only during your first turn. Choose up to 2 of your Benched Pokémon. For each of those Pokémon, search your deck for a basic Energy card and attach it to that Pokémon. Then, shuffle your deck.

				}
				moveAttack "Ram", {
					// 10 damage.
					damage 10
				}
			}



      case HISUIAN_ELECTRODE_3: return cardng (stub) {
				moveAttack "Triple Draw", {
					// Draw 3 cards.

				}
				moveAttack "Irritated Bomb", {
					// 50 damage.
					damage 50
				}
			}



      case SCYTHER_4: return cardng (stub) {
				moveAttack "Blinding Scythe", {
					// 20 damage.
					damage 20
				}
			}



      case SCYTHER_5: return cardng (stub) {
				moveAttack "Quick Blow", {
					// 30+ damage. Flip a coin. If heads, this attack does 30 more damage.
					damage 30
				}
			}



      case YANMA_6: return cardng (stub) {
				moveAttack "Speed Dive", {
					// 20 damage.
					damage 20
				}
			}



      case YANMEGA_7: return cardng (stub) {
				moveAttack "Razor Wing", {
					// 30 damage.
					damage 30
				}
				moveAttack "Wide Wing", {
					// 40+ damage. If you have more cards in your hand than your opponent, this attack does 80 more damage.
					damage 40
				}
			}



      case HERACROSS_8: return cardng (stub) {
				moveAttack "Horn Attack", {
					// 40 damage.
					damage 40
				}
				moveAttack "Overhead Throw", {
					// 120 damage. This attack also does 30 damage to 1 of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 120
				}
			}



      case KRICKETOT_9: return cardng (stub) {
				moveAttack "Trip Over", {
					// 10+ damage. Flip a coin. If heads, this attack does 20 more damage.
					damage 10
				}
			}



      case KRICKETUNE_10: return cardng (stub) {
			bwAbility "Swelling Tune", {
				// Your [G] Pokémon in play, except any Kricketune, get +40 HP. You can't apply more than 1 Swelling Tune Ability at a time.
				getterA(GET_FULL_HP) { h ->
          def pcs = h.effect.target
          if (pcs.owner == self.owner && pcs.types.contains(G) && !pcs.name.contains("Kricketune") && !h.context['Swelling_Tune']) {
            h.object += hp(40)
            h.context['Swelling_Tune'] = 1
          }
        }
			}
				moveAttack "Slash", {
					// 50 damage.
					damage 50
				}
			}



      case COMBEE_11: return cardng (stub) {
				moveAttack "Honey Courier", {
					// Search your deck for an Item card, reveal it, and put it into your hand. Then, shuffle your deck.

				}
				moveAttack "Bug Bite", {
					// 20 damage.
					damage 20
				}
			}



      case VESPIQUEN_12: return cardng (stub) {
				moveAttack "Honey Rush", {
					// 60x damage. Reveal any number of Sweet Honey cards from your hand. This attack does 60 damage for each card you revealed in this way.
					damage 60
				}
				moveAttack "Pierce", {
					// 90 damage.
					damage 90
				}
			}



      case LEAFEON_13: return cardng (stub) {
				moveFull "Energy Garden", {
					// Search your deck for up to 3 basic Energy cards of different types and attach them to your Pokémon in any way you like. Then, shuffle your deck.
          attackRequirement {
            assert my.deck
          }
          onAttack {
            my.deck.select2(min: 0, max: 3,
              text: "Search your deck for up to 3 basic Energy cards of different types and attach them to your Pokémon in any way you like",
              filter: cardTypeFilter(BASIC_ENERGY),
              passFilter: { cardList ->
                for (Card card : cardList) {
                  for (Card card2 : cardList) {
                    if (card != card2 && card.getBasicType() == card2.getBasicType()) {
                      return false
                    }
                  }
                }
                return true
              }).each {attachEnergy(my.all.select("Attach $it to?"), it)}
            shuffleDeck()
          }
				}
				moveAttack "Leafy Cyclone", {
					// 120 damage. During your next turn, this Pokémon can't attack.
					damage 120
          cantAttackNextTurn self
				}
			}



      case SHAYMIN_14: return cardng (stub) {
				moveAttack "Encouraging Gift", {
					// You can use this attack only if you go second, and only during your first turn. Search your deck for up to 3 cards and put them into your hand. Then, shuffle your deck.

				}
				moveAttack "Flop", {
					// 30 damage.
					damage 30
				}
			}



      case PETILIL_15: return cardng (stub) {
				moveAttack "Spin Turn", {
					// 10 damage. Switch this Pokémon with 1 of your Benched Pokémon.
					damage 10
				}
			}



      case HISUIAN_LILLIGANT_16: return cardng (stub) {
				moveAttack "Twister Lutz", {
					// This attack does 20 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) Switch this Pokémon with 1 of your Benched Pokémon.

				}
				moveAttack "Leaf Step", {
					// 100 damage.
					damage 100
				}
			}



      case HISUIAN_LILLIGANT_V_17: return cardng (stub) {
				moveAttack "Dance Gracefully", {
					// Draw cards until you have 6 cards in your hand.

				}
				moveAttack "Leaf Step", {
					// 130 damage.
					damage 130
				}
			}



      case HISUIAN_LILLIGANT_VSTAR_18: return cardng (stub) {
			bwAbility "Star Perfume", {
				// During your turn, you may search your deck for up to 5 in any combination of [G] Pokémon and [G] Energy cards, reveal them, and put them into your hand. Then, shuffle your deck. (You can't use more than 1 VSTAR Power in a game.)
				actionA {
					checkLastTurn()
					vStarCheck()
          assert my.deck : "Your deck is empty"
					powerUsed()
					vStarPerform()
					my.deck.search(max: 5, "Search for up to 5 [G] Pokémon and [G] Energy cards", {
						(it.cardTypes.is(POKEMON) && it.types.contains(G)) ||
						(it.cardTypes.is(ENERGY) && it.containsType(G))
					}).moveTo(my.hand)
					shuffleDeck()
				}
			}
			moveAttack "Parallel Spin", {
				// 130+ damage. You may put an Energy attached to this Pokémon into your hand. If you do, this attack does 100 more damage.
				damage 130
				if (self.cards.energyCount(C) > 0 && confirm("Put an Energy into your hand for 100 more damage?")) {
					damage 100
          afterDamage {
            self.cards.filterByType(ENERGY).select("Put an Energy into your hand").moveTo(my.hand)
          }
				}
			}
			}





      case DARTRIX_20: return cardng (stub) {
				moveAttack "Flap", {
					// 30 damage.
					damage 30
				}
				moveAttack "Razor Wing", {
					// 60 damage.
					damage 60
				}
			}



      case PONYTA_21: return cardng (stub) {
				moveAttack "Flame Tail", {
					// 20 damage.
					damage 20
				}
			}



      case RAPIDASH_22: return cardng (stub) {
				moveAttack "Combustion", {
					// 30 damage.
					damage 30
				}
				moveAttack "Ring of Fire", {
					// 50 damage. Your opponent's Active Pokémon is now Burned. During your opponent's next turn, that Pokémon can't retreat.
					damage 50
				}
			}





      case QUILAVA_24: return cardng (stub) {
				moveAttack "Tackle", {
					// 20 damage.
					damage 20
				}
				moveAttack "Flare", {
					// 40 damage.
					damage 40
				}
			}



      case HEATRAN_V_25: return cardng (stub) {
				moveAttack "Heat Burn", {
					// 30 damage. Your opponent's Active Pokémon is now Burned.
					damage 30
				}
				moveAttack "Magma Fall", {
					// 90+ damage. If you have a Stadium in play, this attack does 90 more damage.
					damage 90
				}
			}



      case HEATRAN_VMAX_26: return cardng (stub) {
				bwAbility "Magma Gain", {
					// Once during your turn, if you have a Stadium in play, you may heal 50 damage from this Pokémon.
					actionA {
					}
				}
				moveAttack "Max Heat Burst", {
					// 180 damage. Your opponent's Active Pokémon is now Burned.
					damage 180
				}
			}



      case RADIANT_HEATRAN_27: return cardng (stub) {
				moveAttack "Raging Blast", {
					// 70x damage. This attack does 70 damage for each damage counter on this Pokémon.
					damage 70
				}
			}



      case PSYDUCK_28: return cardng (stub) {
				moveAttack "Spacing Out", {
					// Flip a coin. If heads, heal 10 damage from this Pokémon.

				}
				moveAttack "Ram", {
					// 20 damage.
					damage 20
				}
			}



      case GOLDUCK_29: return cardng (stub) {
				moveAttack "Aqua Edge", {
					// 50 damage.
					damage 50
				}
				moveAttack "Entangled Dive", {
					// Discard each player's Active Pokémon and all attached cards. (You choose a new Active Pokémon first.)

				}
			}



      case STARMIE_V_30: return cardng (stub) {
				moveAttack "Swift", {
					// 50 damage. This attack's damage isn't affected by Weakness or Resistance, or by any effects on your opponent's Active Pokémon.
					damage 50
				}
				moveAttack "Energy Spiral", {
					// 50x damage. This attack does 50 damage for each Energy attached to all of your opponent's Pokémon.
					damage 50
				}
			}



      case SWINUB_31: return cardng (stub) {
				moveAttack "Stampede", {
					// 20 damage.
					damage 20
				}
				moveAttack "Icy Wind", {
					// 40 damage. Your opponent's Active Pokémon is now Asleep.
					damage 40
				}
			}



      case PILOSWINE_32: return cardng (stub) {
				moveAttack "Stampede", {
					// 30 damage.
					damage 30
				}
				moveAttack "Blizzard", {
					// 50 damage. This attack also does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 50
				}
			}



      case MAMOSWINE_33: return cardng (stub) {
				moveAttack "Blizzard", {
					// 80 damage. This attack also does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 80
				}
				moveAttack "Iceberg Press", {
					// 170 damage. Discard an Energy from this Pokémon. During your opponent's next turn, the Defending Pokémon can't attack.
					damage 170
				}
			}



      case MANTINE_34: return cardng (stub) {
				moveAttack "Borne Ashore", {
					// Put a Basic Pokémon from either player's discard pile onto that player's Bench.

				}
				moveAttack "Aqua Edge", {
					// 100 damage.
					damage 100
				}
			}



      case BARBOACH_35: return cardng (stub) {
				moveAttack "Rain Splash", {
					// 40 damage.
					damage 40
				}
			}



      case WHISCASH_36: return cardng (stub) {
				moveAttack "Mud Shot", {
					// 80 damage.
					damage 80
				}
				moveAttack "Thrash", {
					// 120+ damage. Flip a coin. If tails, this Pokémon also does 60 damage to itself. If heads, this attack does 60 more damage.
					damage 120
				}
			}



      case REGICE_37: return cardng (stub) {
				moveAttack "Regi Gate", {
					// Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Blizzard Bind", {
					// 100 damage. If the Defending Pokémon is a Pokémon V, it can't attack during your opponent's next turn.
					damage 100
				}
			}



      case GLACEON_38: return cardng (stub) {
				moveAttack "Frost Wall", {
					// 30 damage. During your opponent's next turn, prevent all damage done to this Pokémon by attacks from Evolution Pokémon.
					damage 30
				}
				moveAttack "Ice Blast", {
					// 120 damage.
					damage 120
				}
			}









      case DEWOTT_42: return cardng (stub) {
				moveAttack "Razor Shell", {
					// 20+ damage. Flip a coin. If heads, this attack does 20 more damage.
					damage 20
				}
			}



      case HISUIAN_BASCULIN_43: return cardng (stub) {
				moveAttack "Gather the Crew", {
					// Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Tackle", {
					// 10 damage.
					damage 10
				}
			}





      case KELDEO_45: return cardng (stub) {
				moveAttack "Smash Kick", {
					// 20 damage.
					damage 20
				}
				moveAttack "Line Force", {
					// 10+ damage. This attack does 20 more damage for each of your Benched Pokémon.
					damage 10
				}
			}



      case RADIANT_GRENINJA_46: return cardng (stub) {
				bwAbility "Concealed Cards", {
					// You must discard an Energy card from your hand in order to use this Ability. Once during your turn, you may draw 2 cards.
					actionA {
					}
				}
				moveAttack "Moonlight Shuriken", {
					// Discard 2 Energy from this Pokémon. This attack does 90 damage to 2 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
			}



      case BERGMITE_47: return cardng (stub) {
				moveAttack "Icicle", {
					// 40 damage.
					damage 40
				}
			}



      case HISUIAN_AVALUGG_48: return cardng (stub) {
				bwAbility "Massive Ice", {
					// This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
					actionA {
					}
				}
				moveAttack "Mountain Gale", {
					// 100+ damage. If a Stadium is in play, this attack does 120 more damage. Then, discard that Stadium.
					damage 100
				}
			}



      case GALARIAN_MR_RIME_V_49: return cardng (stub) {
				moveAttack "Surprising Hand", {
					// Search your deck for up to 3 Item cards, reveal them, and put them into your hand. Then, shuffle your deck.

				}
				moveAttack "Customized Cane", {
					// 90+ damage. If this Pokémon has a Pokémon Tool attached, this attack does 90 more damage.
					damage 90
				}
			}



      case LUXRAY_V_50: return cardng (stub) {
				moveAttack "Fang Snipe", {
					// 30 damage. Your opponent reveals their hand. Discard a Trainer card you find there.
					damage 30
				}
				moveAttack "Radiating Pulse", {
					// 120 damage. Discard 2 Energy from this Pokémon. Your opponent's Active Pokémon is now Paralyzed.
					damage 120
				}
			}



      case REGIELEKI_51: return cardng (stub) {
				moveAttack "Electromagnetic Sonar", {
					// Put a Trainer card from your discard pile into your hand.

				}
				moveAttack "Targeted Bolt", {
					// Discard 2 [L] Energy from this Pokémon. This attack does 120 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
			}



      case HISUIAN_TYPHLOSION_52: return cardng (stub) {
				bwAbility "Supernatural Orb", {
					// You must discard a [P] Energy card from your hand in order to use this Ability. Once during your turn, you may make your opponent's Active Pokémon Burned and Confused.
					actionA {
					}
				}
				moveAttack "Shadow Bind", {
					// 90 damage. During your opponent's next turn, the Defending Pokémon can't retreat.
					damage 90
				}
			}





      case HISUIAN_TYPHLOSION_VSTAR_54: return cardng (stub) {
				moveAttack "Hollow Flame", {
					// 180 damage. Put 3 damage counters on your opponent's Benched Pokémon in any way you like.
					damage 180
				}
				moveAttack "Shimmering Star", {
					// If your opponent's Active Pokémon has exactly 4 damage counters on it, that Pokémon is Knocked Out. (You can't use more than 1 VSTAR Power in a game.)

				}
			}



      case TOGEPI_55: return cardng (stub) {
				bwAbility "Touch of Happiness", {
					// When you play this Pokémon from your hand onto your Bench during your turn, you may heal 10 damage from your Active Pokémon.
					actionA {
					}
				}
				moveAttack "Rollout", {
					// 10 damage.
					damage 10
				}
			}





      case TOGEKISS_57: return cardng (stub) {
				bwAbility "Shine of Happiness", {
					// When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may heal 90 damage from your Active Pokémon.
					actionA {
					}
				}
				moveAttack "Magical Shot", {
					// 120 damage.
					damage 120
				}
			}



      case MISDREAVUS_58: return cardng (stub) {
				moveAttack "Mumble", {
					// 10 damage.
					damage 10
				}
			}



      case MISMAGIUS_59: return cardng (stub) {
				moveAttack "Ominous Prose", {
					// Your opponent reveals their hand. If they have 4 or more cards in their hand, choose all but 3, and your opponent shuffles the chosen cards into their deck.

				}
				moveAttack "Psybeam", {
					// 50 damage. Your opponent's Active Pokémon is now Confused.
					damage 50
				}
			}



      case RALTS_60: return cardng (stub) {
				moveAttack "Teleportation Burst", {
					// 10 damage. Switch this Pokémon with 1 of your Benched Pokémon.
					damage 10
				}
			}



      case KIRLIA_61: return cardng (stub) {
				moveAttack "Teleportation Burst", {
					// 30 damage. Switch this Pokémon with 1 of your Benched Pokémon.
					damage 30
				}
			}



      case GALLADE_62: return cardng (stub) {
				bwAbility "Buddy Catch", {
					// Once during your turn, you may search your deck for a Supporter card, reveal it, and put it into your hand. Then, shuffle your deck.
					actionA {
					}
				}
				moveAttack "Swirling Slice", {
					// 160 damage. Move an Energy from this Pokémon to 1 of your Benched Pokémon.
					damage 160
				}
			}



      case DRIFLOON_63: return cardng (stub) {
				moveAttack "Triple Spin", {
					// 10x damage. Flip 3 coins. This attack does 10 damage for each heads.
					damage 10
				}
			}



      case DRIFBLIM_64: return cardng (stub) {
				moveAttack "Spooky Balloon", {
					// 50 damage. Put 2 damage counters on 1 of your opponent's Benched Pokémon.
					damage 50
				}
			}



      case UXIE_65: return cardng (stub) {
				moveAttack "Wise Guidance", {
					// Search your deck for a card and put it into your hand. Then, shuffle your deck.

				}
				moveAttack "Psyshot", {
					// 20 damage.
					damage 20
				}
			}



      case MESPRIT_66: return cardng (stub) {
				bwAbility "Mental Shroud", {
					// If you have Uxie and Azelf in play, each of your Pokémon has no Weakness.
					actionA {
					}
				}
				moveAttack "Zen Headbutt", {
					// 30 damage.
					damage 30
				}
			}



      case AZELF_67: return cardng (stub) {
				moveAttack "Mind Bend", {
					// 30 damage. Your opponent's Active Pokémon is now Confused.
					damage 30
				}
			}



      case DIANCIE_68: return cardng (stub) {
				bwAbility "Princess's Curtain", {
					// As long as this Pokémon is in the Active Spot, whenever your opponent plays a Supporter card from their hand, prevent all effects of that card done to your Benched Basic Pokémon.
					actionA {
					}
				}
				moveAttack "Spike Draw", {
					// 20 damage. Draw 2 cards.
					damage 20
				}
			}





      case HISUIAN_GROWLITHE_70: return cardng (stub) {
				moveAttack "Defensive Posture", {
					// Flip a coin. If heads, during your opponent's next turn, prevent all damage done to this Pokémon by attacks.

				}
				moveAttack "Bite", {
					// 30 damage.
					damage 30
				}
			}



      case HISUIAN_ARCANINE_71: return cardng (stub) {
				moveAttack "Boulder Crush", {
					// 50 damage.
					damage 50
				}
				moveAttack "Scorching Horn", {
					// 80+ damage. If this Pokémon has any [R] Energy attached, this attack does 80 more damage, and your opponent's Active Pokémon is now Burned.
					damage 80
				}
			}



      case MACHAMP_V_72: return cardng (stub) {
				moveAttack "Revenge Buster", {
					// 50+ damage. If your Benched Pokémon have any damage counters on them, this attack does 50 more damage.
					damage 50
				}
				moveAttack "Seismic Toss", {
					// 140 damage.
					damage 140
				}
			}



      case MACHAMP_VMAX_73: return cardng (stub) {
				moveAttack "Revenge Buster", {
					// 80+ damage. If your Benched Pokémon have any damage counters on them, this attack does 140 more damage.
					damage 80
				}
				moveAttack "G-Max Chi Strike", {
					// 240 damage. During your next turn, this Pokémon can't use G-Max Chi Strike.
					damage 240
				}
			}



      case SUDOWOODO_74: return cardng (stub) {
				bwAbility "Vamoose", {
					// If this Pokémon has any damage counters on it, it has no Retreat Cost.
					actionA {
					}
				}
				moveAttack "Double-Edge", {
					// 90 damage. This Pokémon also does 30 damage to itself.
					damage 90
				}
			}



      case REGIROCK_75: return cardng (stub) {
				moveAttack "Regi Gate", {
					// Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Giga Impact", {
					// 140 damage. During your next turn, this Pokémon can't attack.
					damage 140
				}
			}





      case RAMPARDOS_77: return cardng (stub) {
				moveAttack "Headbutt Bounce", {
					// 60 damage.
					damage 60
				}
				moveAttack "Jurassic Hammer", {
					// 240 damage. If your opponent has 3 or fewer cards in their hand, this attack does nothing.
					damage 240
				}
			}





      case HIPPOPOTAS_79: return cardng (stub) {
				moveAttack "Mud-Slap", {
					// 30 damage.
					damage 30
				}
				moveAttack "Rolling Tackle", {
					// 90 damage.
					damage 90
				}
			}



      case HIPPOWDON_80: return cardng (stub) {
				moveAttack "Bite", {
					// 80 damage.
					damage 80
				}
				moveAttack "Sand Breath", {
					// 180 damage. Discard 2 Energy from this Pokémon.
					damage 180
				}
			}



      case RADIANT_HAWLUCHA_81: return cardng (stub) {
				bwAbility "Big Match", {
					// As long as this Pokémon is on your Bench, your Pokémon's attacks do 30 more damage to your opponent's Active Pokémon VMAX (before applying Weakness and Resistance).
					actionA {
					}
				}
				moveAttack "Spiral Kick", {
					// 50 damage.
					damage 50
				}
			}



      case HISUIAN_DECIDUEYE_82: return cardng (stub) {
				moveAttack "Piercing Claw", {
					// 30x damage. This attack does 30 damage for each damage counter on your opponent's Active Pokémon.
					damage 30
				}
				moveAttack "Direct Arrow", {
					// This attack does 80 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
			}





      case HISUIAN_DECIDUEYE_VSTAR_84: return cardng (stub) {
				bwAbility "Star of Fortune", {
					// During your turn, you may draw cards until you have 8 cards in your hand. (You can't use more than 1 VSTAR Power in a game.)
					actionA {
					}
				}
				moveAttack "Somersault Feathers", {
					// 160+ damage. You may discard up to 3 Energy cards from your hand. This attack does 30 more damage for each card you discarded in this way.
					damage 160
				}
			}



      case KLEAVOR_85: return cardng (stub) {
				moveAttack "Rout", {
					// 10+ damage. This attack does 30 more damage for each of your opponent's Benched Pokémon.
					damage 10
				}
				moveAttack "Rocky Tackle", {
					// 150 damage. This Pokémon also does 50 damage to itself.
					damage 150
				}
			}



      case KLEAVOR_86: return cardng (stub) {
				moveAttack "Timber Cleave", {
					// Flip 2 coins. If both of them are heads, your opponent's Active Pokémon is Knocked Out.

				}
				moveAttack "Berserker Tackle", {
					// 120 damage. This Pokémon also does 30 damage to itself.
					damage 120
				}
			}





      case HISUIAN_QWILFISH_88: return cardng (stub) {
				moveAttack "Ram", {
					// 10 damage.
					damage 10
				}
				moveAttack "Rolling Tackle", {
					// 30 damage.
					damage 30
				}
			}



      case HISUIAN_QWILFISH_89: return cardng (stub) {
				moveAttack "Spiny Rush", {
					// 10x damage. Flip a coin until you get tails. This attack does 10 damage for each heads.
					damage 10
				}
			}



      case HISUIAN_OVERQWIL_90: return cardng (stub) {
				moveAttack "Tormenting Poison", {
					// Your opponent's Active Pokémon is now Poisoned. During Pokémon Checkup, put 5 damage counters on that Pokémon instead of 1.

				}
				moveAttack "Pinning", {
					// 50 damage. During your opponent's next turn, the Defending Pokémon can't retreat.
					damage 50
				}
			}



      case HISUIAN_OVERQWIL_91: return cardng (stub) {
				moveAttack "Dirty Press", {
					// 30+ damage. If you have at least 3 [D] Energy in play, this attack does 90 more damage.
					damage 30
				}
				moveAttack "Pierce", {
					// 70 damage.
					damage 70
				}
			}



      case HISUIAN_SNEASEL_92: return cardng (stub) {
				moveAttack "Scratch", {
					// 10 damage.
					damage 10
				}
				moveAttack "Claw Slash", {
					// 30 damage.
					damage 30
				}
			}



      case HISUIAN_SNEASLER_93: return cardng (stub) {
				bwAbility "Carry and Climb", {
					// As long as this Pokémon is on your Bench, your Active Pokémon's Retreat Cost is [C][C] less.
					actionA {
					}
				}
				moveAttack "Claw Slash", {
					// 60 damage.
					damage 60
				}
			}



      case HISUIAN_SNEASLER_V_94: return cardng (stub) {
				moveAttack "Poison Claws", {
					// Your opponent's Active Pokémon is now Poisoned.

				}
				moveAttack "Dire Claw", {
					// 80x damage. This attack does 80 damage for each Special Condition affecting your opponent's Active Pokémon.
					damage 80
				}
			}



      case POOCHYENA_95: return cardng (stub) {
				moveAttack "Gnaw", {
					// 10 damage.
					damage 10
				}
				moveAttack "Slight Intrusion", {
					// 30 damage. This Pokémon also does 10 damage to itself.
					damage 30
				}
			}



      case MIGHTYENA_96: return cardng (stub) {
				bwAbility "Hustle Bark", {
					// If your opponent has any Pokémon VMAX in play, this Pokémon's attacks cost [C][C][C] less.
					actionA {
					}
				}
				moveAttack "Wild Tackle", {
					// 160 damage. This Pokémon also does 50 damage to itself.
					damage 160
				}
			}



      case ABSOL_97: return cardng (stub) {
				moveAttack "Swirling Disaster", {
					// This attack does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Claw Rend", {
					// 50+ damage. If your opponent's Active Pokémon already has any damage counters on it, this attack does 70 more damage.
					damage 50
				}
			}



      case DARKRAI_V_98: return cardng (stub) {
				moveAttack "Wind of Darkness", {
					// 50 damage.
					damage 50
				}
				moveAttack "Dark Void", {
					// 130 damage. Your opponent's Active Pokémon is now Asleep.
					damage 130
				}
			}



      case DARKRAI_VSTAR_99: return cardng (stub) {
				bwAbility "Star Abyss", {
					// During your turn, you may put up to 2 Item cards from your discard pile into your hand. (You can't use more than 1 VSTAR Power in a game.)
					actionA {
					}
				}
				moveAttack "Dark Pulse", {
					// 30+ damage. This attack does 30 more damage for each [D] Energy attached to all of your Pokémon.
					damage 30
				}
			}







      case HISUIAN_SAMUROTT_VSTAR_102: return cardng (stub) {
				bwAbility "Moon Cleave Star", {
					// During your turn, you may put 4 damage counters on 1 of your opponent's Pokémon. (You can't use more than 1 VSTAR Power in a game.)
					actionA {
					}
				}
				moveAttack "Merciless Blade", {
					// 110+ damage. If your opponent's Active Pokémon already has any damage counters on it, this attack does 110 more damage.
					damage 110
				}
			}



      case NICKIT_103: return cardng (stub) {
				moveAttack "Rear Kick", {
					// 10 damage.
					damage 10
				}
			}



      case THIEVUL_104: return cardng (stub) {
				bwAbility "Baffling", {
					// If your opponent has 2 or fewer Prize cards remaining, whenever your opponent plays a Supporter card from their hand, prevent all effects of that card done to your Benched Pokémon V.
					actionA {
					}
				}
				moveAttack "Sharp Fang", {
					// 110 damage.
					damage 110
				}
			}



      case MAGNEMITE_105: return cardng (stub) {
				moveAttack "Magnetic Catch", {
					// Shuffle up to 3 [M] Energy cards from your discard pile into your deck.

				}
				moveAttack "Rolling Attack", {
					// 30 damage.
					damage 30
				}
			}



      case MAGNETON_106: return cardng (stub) {
				moveAttack "Bounce Back", {
					// 50 damage. Your opponent switches their Active Pokémon with 1 of their Benched Pokémon.
					damage 50
				}
			}





      case REGISTEEL_108: return cardng (stub) {
				moveAttack "Regi Gate", {
					// Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Heavy Slam", {
					// 220- damage. This attack does 50 less damage for each [C] in your opponent's Active Pokémon's Retreat Cost.
					damage 220
				}
			}



      case SHIELDON_109: return cardng (stub) {
				moveAttack "Hard Headbutt", {
					// 30 damage. Flip a coin. If heads, during your opponent's next turn, prevent all damage from and effects of attacks done to this Pokémon.
					damage 30
				}
				moveAttack "Confront", {
					// 100 damage.
					damage 100
				}
			}



      case BASTIODON_110: return cardng (stub) {
				bwAbility "Primal Fortress", {
					// Your Pokémon take 30 less damage from attacks from your opponent's Pokémon V (after applying Weakness and Resistance).
					actionA {
					}
				}
				moveAttack "Iron Tackle", {
					// 180 damage. This Pokémon also does 30 damage to itself.
					damage 180
				}
			}



      case BRONZOR_111: return cardng (stub) {
				moveAttack "Metal Press", {
					// 20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
					damage 20
				}
			}



      case BRONZONG_112: return cardng (stub) {
				bwAbility "Heatproof", {
					// Prevent all damage done to this Pokémon by attacks from your opponent's [R] Pokémon.
					actionA {
					}
				}
				moveAttack "Hammer In", {
					// 100 damage.
					damage 100
				}
			}







      case PAWNIARD_115: return cardng (stub) {
				moveAttack "Reckless Charge", {
					// 30 damage. This Pokémon also does 10 damage to itself.
					damage 30
				}
			}



      case BISHARP_116: return cardng (stub) {
				moveAttack "Vengeful Cut", {
					// 30+ damage. This attack does 30 more damage for each damage counter on all of your Benched Pawniard.
					damage 30
				}
				moveAttack "Slicing Blade", {
					// 90 damage.
					damage 90
				}
			}



      case GARCHOMP_V_117: return cardng (stub) {
				moveAttack "Dragon Claw", {
					// 120 damage.
					damage 120
				}
				moveAttack "Sonic Strike", {
					// Discard 3 Energy from this Pokémon. This attack does 220 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
			}



      case REGIDRAGO_118: return cardng (stub) {
				bwAbility "Dragon's Hoard", {
					// Once during your turn, if this Pokémon is in the Active Spot, you may draw cards until you have 4 cards in your hand. You can't use more than 1 Dragon's Hoard Ability each turn.
					actionA {
					}
				}
				moveAttack "Giant Fangs", {
					// 160 damage.
					damage 160
				}
			}



      case EEVEE_119: return cardng (stub) {
				bwAbility "Resonant Evolution", {
					// Once during your turn, when you play a Pokémon from your hand to evolve 1 of your other Eevee, you may search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck.
					actionA {
					}
				}
				moveAttack "Tackle", {
					// 20 damage.
					damage 20
				}
			}



      case HOOTHOOT_120: return cardng (stub) {
				bwAbility "Stand Sentry", {
					// Basic Energy attached to your Benched Pokémon can't be discarded by an effect of your opponent's Item or Supporter cards.
					actionA {
					}
				}
				moveAttack "Flap", {
					// 20 damage.
					damage 20
				}
			}



      case NOCTOWL_121: return cardng (stub) {
				moveAttack "Silent Wing", {
					// 50 damage. Your opponent reveals their hand.
					damage 50
				}
				moveAttack "Air Slash", {
					// 120 damage. Discard an Energy from this Pokémon.
					damage 120
				}
			}



      case TEDDIURSA_122: return cardng (stub) {
				moveAttack "Gather Food", {
					// Flip a coin. If heads, put an Item card from your discard pile into your hand.

				}
				moveAttack "Dig Claws", {
					// 20 damage.
					damage 20
				}
			}



      case URSARING_123: return cardng (stub) {
				moveAttack "Continuous Slap", {
					// 40x damage. Flip a coin until you get tails. This attack does 40 damage for each heads.
					damage 40
				}
				moveAttack "Strength", {
					// 100 damage.
					damage 100
				}
			}



      case URSALUNA_124: return cardng (stub) {
				moveAttack "Peat Hunt", {
					// Put up to 2 cards from your discard pile into your hand.

				}
				moveAttack "Bulky Bump", {
					// 200 damage. Discard 2 Energy from this Pokémon.
					damage 200
				}
			}



      case STANTLER_125: return cardng (stub) {
				moveAttack "Guard Press", {
					// 30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
					damage 30
				}
			}



      case MILTANK_126: return cardng (stub) {
				bwAbility "Miracle Body", {
					// Prevent all damage done to this Pokémon by attacks from your opponent's Pokémon V.
					actionA {
					}
				}
				moveAttack "Rout", {
					// 10+ damage. This attack does 20 more damage for each of your opponent's Benched Pokémon.
					damage 10
				}
			}



      case GLAMEOW_127: return cardng (stub) {
				moveAttack "Fake Out", {
					// 20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
					damage 20
				}
			}



      case PURUGLY_128: return cardng (stub) {
				moveAttack "Body Slam", {
					// 30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
					damage 30
				}
				moveAttack "Slashing Claw", {
					// 100 damage.
					damage 100
				}
			}



      case CHATOT_129: return cardng (stub) {
				moveAttack "Collect", {
					// Draw a card.

				}
				moveAttack "Jabber On", {
					// 30 damage. During your opponent's next turn, the Defending Pokémon can't retreat.
					damage 30
				}
			}



      case REGIGIGAS_130: return cardng (stub) {
				bwAbility "Ancient Wisdom", {
					// Once during your turn, if you have Regirock, Regice, Registeel, Regieleki, and Regidrago in play, you may attach up to 3 Energy cards from your discard pile to 1 of your Pokémon.
					actionA {
					}
				}
				moveAttack "Gigaton Break", {
					// 150+ damage. If your opponent's Active Pokémon is a Pokémon VMAX, this attack does 150 more damage.
					damage 150
				}
			}



      case RUFFLET_131: return cardng (stub) {
				moveAttack "Claw", {
					// 30 damage. Flip a coin. If tails, this attack does nothing.
					damage 30
				}
			}



      case HISUIAN_BRAVIARY_132: return cardng (stub) {
				moveAttack "Psywave", {
					// 30x damage. This attack does 30 damage for each Energy attached to your opponent's Active Pokémon.
					damage 30
				}
				moveAttack "Slashing Strike", {
					// 120 damage. During your next turn, this Pokémon can't use Slashing Strike.
					damage 120
				}
			}



      case ORANGURU_V_133: return cardng (stub) {
				bwAbility "Back Order", {
					// Once during your turn, if this Pokémon is in the Active Spot, you may search your deck for up to 2 Pokémon Tool cards, reveal them, and put them into your hand. Then, shuffle your deck.
					actionA {
					}
				}
				moveAttack "Psychic", {
					// 30+ damage. This attack does 50 more damage for each Energy attached to your opponent's Active Pokémon.
					damage 30
				}
			}



      case WYRDEER_V_134: return cardng (stub) {
				bwAbility "Frontier Road", {
					// Once during your turn, when this Pokémon moves from your Bench to the Active Spot, you may move any amount of Energy from your other Pokémon to it.
					actionA {
					}
				}
				moveAttack "Psyshield Bash", {
					// 40x damage. This attack does 40 damage for each Energy attached to this Pokémon.
					damage 40
				}
			}



      case ADAMAN_135: return cardng (stub) {
				// You can use this card only if you discard 2 [M] Energy cards from your hand. Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck.
				onPlay {
				}
				playRequirement{
				}
			}



      case CANCELING_COLOGNE_136: return cardng (stub) {
				// Until the end of your turn, your opponent's Active Pokémon has no Abilities. (This includes Pokémon that come into play during that turn.)
				onPlay {
				}
				playRequirement{
				}
			}



      case CHOY_137: return cardng (stub) {
				// Each player reveals their hand. Draw 3 cards.
				onPlay {
				}
				playRequirement{
				}
			}



      case CYLLENE_138: return cardng (stub) {
				// Flip 2 coins. Put a number of cards up to the number of heads from your discard pile on top of your deck in any order.
				onPlay {
				}
				playRequirement{
				}
			}



      case DARK_PATCH_139: return cardng (stub) {
				// Attach a basic [D] Energy card from your discard pile to 1 of your Benched [D] Pokémon.
				onPlay {
				}
				playRequirement{
				}
			}



      case ENERGY_LOTO_140: return cardng (stub) {
				// Look at the top 7 cards of your deck. You may reveal an Energy card you find there and put it into your hand. Shuffle the other cards back into your deck.
				onPlay {
				}
				playRequirement{
				}
			}



      case FEATHER_BALL_141: return cardng (stub) {
				// Search your deck for a Pokémon that has no Retreat Cost, reveal it, and put it into your hand. Then, shuffle your deck.
				onPlay {
				}
				playRequirement{
				}
			}



      case GAPEJAW_BOG_142: return cardng (stub) {
				// Whenever either player puts a Basic Pokémon from their hand onto their Bench, put 2 damage counters on that Pokémon.
				onPlay {
				}
				onRemoveFromPlay{
				}
			}



      case GARDENIA_S_VIGOR_143: return cardng (stub) {
				// Draw 2 cards. If you drew any cards in this way, attach up to 2 [G] Energy cards from your hand to 1 of your Benched Pokémon.
				onPlay {
				}
				playRequirement{
				}
			}



      case GRANT_144: return cardng (stub) {
				// During this turn, your [F] Pokémon's attacks do 30 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance). During your turn, if this Grant is in your discard pile, you may discard 2 cards, except any Grant, from your hand. If you do, put this Grant into your hand. (This effect doesn't use up your Supporter card for the turn.)
				onPlay {
				}
				playRequirement{
				}
			}



      case GUTSY_PICKAXE_145: return cardng (stub) {
				// Reveal the top card of your deck. If that card is a [F] Energy card, attach it to 1 of your Benched Pokémon. If it is not a [F] Energy card, put it into your hand.
				onPlay {
				}
				playRequirement{
				}
			}



      case HISUIAN_HEAVY_BALL_146: return cardng (stub) {
				// Look at your face-down Prize cards. You may reveal a Basic Pokémon you find there, put it into your hand, and put this Hisuian Heavy Ball in its place as a face-down Prize card. (If you don't reveal a Basic Pokémon, put this card in the discard pile.) Then, shuffle your face-down Prize cards.
				onPlay {
				}
				playRequirement{
				}
			}



      case IRIDA_147: return cardng (stub) {
				// Search your deck for a [W] Pokémon and an Item card, reveal them, and put them into your hand. Then, shuffle your deck.
				onPlay {
				}
				playRequirement{
				}
			}



      case JUBILIFE_VILLAGE_148: return cardng (stub) {
				// Once during each player's turn, that player may shuffle their hand into their deck and draw 5 cards. If they do, their turn ends.
				onPlay {
				}
				onRemoveFromPlay{
				}
			}



      case KAMADO_149: return cardng (stub) {
				// Choose a card in your hand, and discard the other cards. If you do, draw 4 cards. (If you have no other cards in your hand, you can't use this card.)
				onPlay {
				}
				playRequirement{
				}
			}



      case ROXANNE_150: return cardng (stub) {
				// You can use this card only if your opponent has 3 or fewer Prize cards remaining. Each player shuffles their hand into their deck. Then, you draw 6 cards, and your opponent draws 2 cards.
				onPlay {
				}
				playRequirement{
				}
			}



      case SPICY_SEASONED_CURRY_151: return cardng (stub) {
				// Your Active Pokémon is now Burned. Heal 40 damage from it.
				onPlay {
				}
				playRequirement{
				}
			}



      case SUPEREFFECTIVE_GLASSES_152: return cardng (stub) {
				// When applying Weakness to damage from the attacks of the Pokémon this card is attached to done to your opponent's Active Pokémon, apply it as ×3.
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			}



      case SWEET_HONEY_153: return cardng (stub) {
				// Choose 1 of your Pokémon, and then flip a coin until you get tails. For each heads, heal 40 damage from that Pokémon.
				onPlay {
				}
				playRequirement{
				}
			}



      case SWITCH_CART_154: return cardng (stub) {
				// Switch your Active Basic Pokémon with 1 of your Benched Pokémon. If you do, heal 30 damage from the Pokémon you moved to your Bench.
				onPlay {
				}
				playRequirement{
				}
			}



      case TEMPLE_OF_SINNOH_155: return cardng (stub) {
				// All Special Energy attached to Pokémon (both yours and your opponent's) provide [C] Energy and have no other effect.
				onPlay {
				}
				onRemoveFromPlay{
				}
			}



      case TREKKING_SHOES_156: return cardng (stub) {
				// Look at the top card of your deck. You may put that card into your hand. If you don't, discard that card and draw a card.
				onPlay {
				}
				playRequirement{
				}
			}



      case UNIDENTIFIED_FOSSIL_157: return cardng (stub) {
				// Play this card as if it were a 60-HP Basic [C] Pokémon. At any time during your turn, you may discard this card from play. This card can't retreat.
				onPlay {
				}
				playRequirement{
				}
			}



      case WAIT_AND_SEE_TURBO_158: return cardng (stub) {
				// You can use this card only if you go second, and only during your first turn. Search your deck for a basic Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck. Your turn ends.
				onPlay {
				}
				playRequirement{
				}
			}



      case ZISU_159: return cardng (stub) {
				// Draw cards until you have 1 more card in your hand than your opponent.
				onPlay {
				}
				playRequirement{
				}
			}























      case JIRACHI_V_170: return cardng (stub) {
				bwAbility "Wish Connector", {
					// When 1 of your Basic Pokémon V is Knocked Out by damage from an attack from your opponent's Pokémon, you may move a basic Energy card from that Pokémon to another of your Pokémon.
					actionA {
					}
				}
				moveAttack "Hypnostrike", {
					// 60 damage. Both Active Pokémon are now Asleep.
					damage 60
				}
			}























































































      case PATH_TO_THE_PEAK_213: return cardng (stub) {
				// Pokémon with a Rule Box in play (both yours and your opponent's) have no Abilities. (Pokémon V, Pokémon-GX, etc. have Rule Boxes.)
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