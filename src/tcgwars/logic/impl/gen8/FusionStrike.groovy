package tcgwars.logic.impl.gen8


import static tcgwars.logic.card.Type.*
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*

import tcgwars.logic.card.*

/**
 * @author
 */
public enum FusionStrike implements ImplOnlyCardInfo {

  CATERPIE_1,
  METAPOD_2,
  BUTTERFREE_3,
  SHROOMISH_4,
  BRELOOM_5,
  BRELOOM_V_6,
  PANSAGE_7,
  SIMISAGE_8,
  SEWADDLE_9,
  SWADLOON_10,
  LEAVANNY_11,
  MARACTUS_12,
  SHELMET_13,
  ACCELGOR_14,
  VIRIZION_15,
  PHANTUMP_16,
  TREVENANT_17,
  GRUBBIN_18,
  DEWPIDER_19,
  ARAQUANID_20,
  TSAREENA_V_21,
  RILLABOOM_V_22,
  RILLABOOM_VMAX_23,
  GOSSIFLEUR_24,
  ELDEGOSS_25,
  APPLETUN_V_26,
  ZARUDE_27,
  VULPIX_28,
  VULPIX_29,
  NINETALES_30,
  NINETALES_31,
  GROWLITHE_32,
  ARCANINE_33,
  SLUGMA_34,
  MAGCARGO_35,
  VICTINI_36,
  PANSEAR_37,
  SIMISEAR_38,
  CHANDELURE_V_39,
  CHANDELURE_VMAX_40,
  HEATMOR_41,
  ORICORIO_42,
  CINDERACE_V_43,
  CINDERACE_V_44,
  CINDERACE_VMAX_45,
  SIZZLIPEDE_46,
  SIZZLIPEDE_47,
  CENTISKORCH_48,
  CENTISKORCH_49,
  SHELLDER_50,
  CLOYSTER_51,
  STARYU_52,
  STARMIE_53,
  LAPRAS_54,
  TOTODILE_55,
  CROCONAW_56,
  FERALIGATR_57,
  MARILL_58,
  AZUMARILL_59,
  QWILFISH_60,
  MANTINE_61,
  MUDKIP_62,
  MARSHTOMP_63,
  SWAMPERT_64,
  CLAMPERL_65,
  HUNTAIL_66,
  GOREBYSS_67,
  PANPOUR_68,
  SIMIPOUR_69,
  BASCULIN_70,
  GALARIAN_DARUMAKA_71,
  GALARIAN_DARMANITAN_72,
  GRENINJA_V_73,
  CLAUNCHER_74,
  CLAWITZER_75,
  CRABOMINABLE_V_76,
  PYUKUMUKU_77,
  INTELEON_V_78,
  INTELEON_VMAX_79,
  CHEWTLE_80,
  DREDNAW_81,
  ARROKUDA_82,
  BARRASKEWDA_83,
  SNOM_84,
  FROSMOTH_85,
  PIKACHU_V_86,
  VOLTORB_87,
  ELECTRODE_88,
  PLUSLE_89,
  MINUN_90,
  SHINX_91,
  LUXIO_92,
  LUXRAY_93,
  ROTOM_94,
  TYNAMO_95,
  EELEKTRIK_96,
  EELEKTROSS_97,
  HELIOPTILE_98,
  HELIOLISK_99,
  CHARJABUG_100,
  VIKAVOLT_101,
  ZERAORA_102,
  BOLTUND_V_103,
  BOLTUND_VMAX_104,
  TOXEL_105,
  TOXEL_106,
  TOXTRICITY_107,
  TOXTRICITY_108,
  MORPEKO_109,
  JIGGLYPUFF_110,
  WIGGLYTUFF_111,
  JYNX_112,
  MEW_V_113,
  MEW_VMAX_114,
  SNUBBULL_115,
  GRANBULL_116,
  GALARIAN_CORSOLA_117,
  GALARIAN_CURSOLA_118,
  MAWILE_119,
  DEOXYS_120,
  MUNNA_121,
  MUSHARNA_122,
  SIGILYPH_123,
  MELOETTA_124,
  SANDYGAST_125,
  PALOSSAND_126,
  INDEEDEE_127,
  DREEPY_128,
  DRAKLOAK_129,
  DRAGAPULT_130,
  SANDSHREW_131,
  SANDSLASH_132,
  MANKEY_133,
  PRIMEAPE_134,
  GEODUDE_135,
  GRAVELER_136,
  GOLEM_137,
  ONIX_138,
  STEELIX_139,
  GLIGAR_140,
  GLISCOR_141,
  MAKUHITA_142,
  HARIYAMA_143,
  BALTOY_144,
  CLAYDOL_145,
  LUCARIO_V_146,
  DRILBUR_147,
  LANDORUS_148,
  PANCHAM_149,
  STUFFUL_150,
  BEWEAR_151,
  CLOBBOPUS_152,
  GRAPPLOCT_153,
  FALINKS_154,
  FALINKS_155,
  GENGAR_V_156,
  GENGAR_VMAX_157,
  TYRANITAR_V_158,
  GALARIAN_ZIGZAGOON_159,
  GALARIAN_LINOONE_160,
  GALARIAN_OBSTAGOON_161,
  CARVANHA_162,
  SHARPEDO_163,
  ABSOL_164,
  CROAGUNK_165,
  TOXICROAK_166,
  DARKRAI_167,
  TRUBBISH_168,
  GARBODOR_169,
  ZORUA_170,
  ZOROARK_171,
  VULLABY_172,
  MANDIBUZZ_173,
  PANGORO_174,
  YVELTAL_175,
  IMPIDIMP_176,
  MORGREM_177,
  GRIMMSNARL_178,
  MORPEKO_179,
  GALARIAN_MEOWTH_180,
  GALARIAN_PERRSERKER_181,
  SKARMORY_182,
  EXCADRILL_183,
  DURANT_184,
  GENESECT_V_185,
  KLEFKI_186,
  TOGEDEMARU_187,
  MELTAN_188,
  MELMETAL_189,
  CORVIKNIGHT_190,
  CUFANT_191,
  COPPERAJAH_192,
  LATIAS_193,
  LATIOS_194,
  GOOMY_195,
  SLIGGOO_196,
  GOODRA_197,
  TURTONATOR_198,
  MEOWTH_199,
  PERSIAN_200,
  DODRIO_V_201,
  CHANSEY_202,
  BLISSEY_203,
  KANGASKHAN_204,
  EEVEE_205,
  SNORLAX_206,
  DUNSPARCE_207,
  STANTLER_208,
  SMEARGLE_209,
  SKITTY_210,
  DELCATTY_211,
  BUNEARY_212,
  LOPUNNY_213,
  BUNNELBY_214,
  DIGGERSBY_215,
  HAWLUCHA_216,
  GREEDENT_V_217,
  GREEDENT_VMAX_218,
  ROOKIDEE_219,
  CORVISQUIRE_220,
  WOOLOO_221,
  WOOLOO_222,
  DUBWOOL_223,
  ADVENTURER_S_DISCOVERY_224,
  BATTLE_VIP_PASS_225,
  BUG_CATCHER_226,
  CHILI_CILAN_CRESS_227,
  COOK_228,
  CRAM_O_MATIC_229,
  CROSS_SWITCHER_230,
  CROSSCEIVER_231,
  DANCER_232,
  ELESA_S_SPARKLE_233,
  FAREWELL_BELL_234,
  JUDGE_235,
  POWER_TABLET_236,
  QUICK_BALL_237,
  SCHOOLBOY_238,
  SCHOOLGIRL_239,
  SHAUNA_240,
  SIDNEY_241,
  SKATERS_PARK_242,
  SPONGY_GLOVES_243,
  FUSION_STRIKE_ENERGY_244,
  CELEBI_V_245,
  TSAREENA_V_246,
  CHANDELURE_V_247,
  CRABOMINABLE_V_248,
  BOLTUND_V_249,
  MEW_V_250,
  MEW_V_251,
  SANDACONDA_V_252,
  HOOPA_V_253,
  GENESECT_V_254,
  GENESECT_V_255,
  GREEDENT_V_256,
  GREEDENT_V_257,
  CHILI_CILAN_CRESS_258,
  DANCER_259,
  ELESA_S_SPARKLE_260,
  SCHOOLBOY_261,
  SCHOOLGIRL_262,
  SHAUNA_263,
  SIDNEY_264,
  CHANDELURE_VMAX_265,
  INTELEON_VMAX_266,
  BOLTUND_VMAX_267,
  MEW_VMAX_268,
  MEW_VMAX_269,
  ESPEON_VMAX_270,
  GENGAR_VMAX_271,
  GREEDENT_VMAX_272,
  CHILI_CILAN_CRESS_273,
  DANCER_274,
  ELESA_S_SPARKLE_275,
  SCHOOLBOY_276,
  SCHOOLGIRL_277,
  SHAUNA_278,
  SIDNEY_279,
  FLAAFFY_280,
  POWER_TABLET_281,
  TRAINING_COURT_282,
  GRASS_ENERGY_283,
  FIRE_ENERGY_284
;

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  @Override
  public String toEnumId() {
    return name()+":FUSION_STRIKE";
  }

  @Override
  public Card getImplementation(EnhancedCardInfo stub) {
    switch (this) {


      case CATERPIE_1: return cardng (stub) {
				moveAttack "Flock", {
					// Search your deck for a Caterpie and put it onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Bug Bite", {
					// 10 damage.
					damage 10
				}
			}



      case METAPOD_2: return cardng (stub) {
				bwAbility "Exoskeleton", {
					// This Pokémon takes 20 less damage from attacks (after applying Weakness and Resistance).
					actionA {
					}
				}
				moveAttack "Ram", {
					// 10 damage.
					damage 10
				}
			}



      case BUTTERFREE_3: return cardng (stub) {
				bwAbility "Tricolored Scales", {
					// When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may make your opponent's Active Pokémon Burned, Confused, and Poisoned.
					actionA {
					}
				}
				moveAttack "Gust", {
					// 90 damage.
					damage 90
				}
			}



      case SHROOMISH_4: return cardng (stub) {
				moveAttack "Tackle", {
					// 10 damage.
					damage 10
				}
				moveAttack "Seed Bomb", {
					// 20 damage.
					damage 20
				}
			}



      case BRELOOM_5: return cardng (stub) {
				moveAttack "Headbutt", {
					// 30 damage.
					damage 30
				}
				moveAttack "Impact Blow", {
					// 150 damage. During your next turn, this Pokémon can't use Impact Blow.
					damage 150
				}
			}



      case BRELOOM_V_6: return cardng (stub) {
				moveAttack "Counter", {
					// 20+ damage. If this Pokémon was damaged by an attack during your opponent's last turn, this attack does that much more damage.
					damage 20
				}
				moveAttack "Mach Cross", {
					// 140 damage.
					damage 140
				}
			}



      case PANSAGE_7: return cardng (stub) {
				moveAttack "Scratch", {
					// 20 damage.
					damage 20
				}
			}



      case SIMISAGE_8: return cardng (stub) {
				moveAttack "Return", {
					// 30 damage. You may draw cards until you have 6 cards in your hand.
					damage 30
				}
				moveAttack "Whip Smash", {
					// 70 damage.
					damage 70
				}
			}



      case SEWADDLE_9: return cardng (stub) {
				moveAttack "Grass Munch", {
					// 10 damage. Discard a [G] Energy from your opponent's Active Pokémon.
					damage 10
				}
			}



      case SWADLOON_10: return cardng (stub) {
				moveAttack "Trip Over", {
					// 10+ damage. Flip a coin. If heads, this attack does 20 more damage.
					damage 10
				}
				moveAttack "Seed Bomb", {
					// 60 damage.
					damage 60
				}
			}



      case LEAVANNY_11: return cardng (stub) {
				moveAttack "Healing Circle", {
					// Heal all damage from each of your Benched Pokémon. If you healed any damage in this way, shuffle this Pokémon and all attached cards into your deck.

				}
				moveAttack "Razor Leaf", {
					// 120 damage.
					damage 120
				}
			}



      case MARACTUS_12: return cardng (stub) {
				moveAttack "Peck", {
					// 20 damage.
					damage 20
				}
				moveAttack "Ditch and Shake", {
					// 50x damage. Discard any number of Pokémon Tool cards from your hand. This attack does 50 damage for each card you discarded in this way.
					damage 50
				}
			}



      case SHELMET_13: return cardng (stub) {
				moveAttack "Spit Beam", {
					// 20 damage.
					damage 20
				}
			}



      case ACCELGOR_14: return cardng (stub) {
				moveAttack "Ninja Tornado", {
					// 120 damage. If this Pokémon moved from your Bench to the Active Spot this turn, this attack can be used for Grass.
					damage 120
				}
			}



      case VIRIZION_15: return cardng (stub) {
				moveAttack "Bail Out", {
					// Put up to 2 Pokémon from your discard pile into your hand.

				}
				moveAttack "Solar Beam", {
					// 90 damage.
					damage 90
				}
			}



      case PHANTUMP_16: return cardng (stub) {
				moveAttack "Tackle", {
					// 10 damage.
					damage 10
				}
				moveAttack "Seed Bomb", {
					// 20 damage.
					damage 20
				}
			}



      case TREVENANT_17: return cardng (stub) {
				moveAttack "Gentle Slap", {
					// 40 damage.
					damage 40
				}
				moveAttack "Wood Hammer", {
					// 90 damage.
					damage 90
				}
			}



      case GRUBBIN_18: return cardng (stub) {
				moveAttack "Energize", {
					// Attach a [L] Energy card from your discard pile to this Pokémon.

				}
				moveAttack "Surprise Attack", {
					// 50 damage. Flip a coin. If tails, this attack does nothing.
					damage 50
				}
			}



      case DEWPIDER_19: return cardng (stub) {
				moveAttack "Bug Bite", {
					// 20 damage.
					damage 20
				}
			}



      case ARAQUANID_20: return cardng (stub) {
				moveAttack "Bug Bite", {
					// 30 damage.
					damage 30
				}
				moveAttack "Bubble Launch", {
					// 110 damage. Move an Energy from this Pokémon to 1 of your Benched Pokémon.
					damage 110
				}
			}



      case TSAREENA_V_21: return cardng (stub) {
				moveAttack "Queen's Orders", {
					// 20+ damage. You may discard any number of your Benched Pokémon. This attack does 40 more damage for each Benched Pokémon you discarded in this way.
					damage 20
				}
			}



      case RILLABOOM_V_22: return cardng (stub) {
				moveAttack "Drain Punch", {
					// 60 damage. Heal 30 damage from this Pokémon.
					damage 60
				}
				moveAttack "Drum Rush", {
					// 160 damage.
					damage 160
				}
			}



      case RILLABOOM_VMAX_23: return cardng (stub) {
				moveAttack "G-Max Drum Solo", {
					// 180 damage. This attack also does 40 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 180
				}
			}



      case GOSSIFLEUR_24: return cardng (stub) {
				moveAttack "Leafage", {
					// 10 damage.
					damage 10
				}
			}



      case ELDEGOSS_25: return cardng (stub) {
				moveAttack "Sunny Wind", {
					// 50 damage. Heal 20 damage from this Pokémon.
					damage 50
				}
			}



      case APPLETUN_V_26: return cardng (stub) {
				moveAttack "Headbutt", {
					// 30 damage.
					damage 30
				}
				moveAttack "Sweet Impact", {
					// 100 damage. Heal 30 damage from this Pokémon.
					damage 100
				}
			}



      case ZARUDE_27: return cardng (stub) {
				moveAttack "Scratch", {
					// 20 damage.
					damage 20
				}
				moveAttack "Wild Whip", {
					// 40+ damage. Flip a coin. If heads, this attack does 30 more damage.
					damage 40
				}
			}



      case VULPIX_28: return cardng (stub) {
				moveAttack "Live Coal", {
					// 30 damage.
					damage 30
				}
			}



      case VULPIX_29: return cardng (stub) {
				moveAttack "Smash Kick", {
					// 10 damage.
					damage 10
				}
			}



      case NINETALES_30: return cardng (stub) {
				moveAttack "Supernatural Flames", {
					// 70 damage.
					damage 70
				}
			}



      case NINETALES_31: return cardng (stub) {
				bwAbility "Byway of the Nine-Tailed Fox", {
					// The Retreat Cost of each of your Pokémon that has any [R] Energy attached is [C][C] less.
					actionA {
					}
				}
				moveAttack "Flame Tail", {
					// 60 damage.
					damage 60
				}
			}



      case GROWLITHE_32: return cardng (stub) {
				moveAttack "Warm Up", {
					// Search your deck for a [R] Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck.

				}
				moveAttack "Combustion", {
					// 30 damage.
					damage 30
				}
			}



      case ARCANINE_33: return cardng (stub) {
				moveAttack "Fire Claws", {
					// 40 damage.
					damage 40
				}
				moveAttack "Heat Tackle", {
					// 160 damage. This Pokémon also does 30 damage to itself.
					damage 160
				}
			}



      case SLUGMA_34: return cardng (stub) {
				moveAttack "Live Coal", {
					// 10 damage.
					damage 10
				}
				moveAttack "Flare", {
					// 20 damage.
					damage 20
				}
			}



      case MAGCARGO_35: return cardng (stub) {
				moveAttack "Rock Throw", {
					// 40 damage.
					damage 40
				}
				moveAttack "Body Splash", {
					// 150 damage. Flip 3 coins. For each tails, discard an Energy from this Pokémon.
					damage 150
				}
			}



      case VICTINI_36: return cardng (stub) {
				moveAttack "Fiery Cheering", {
					// Attach a basic Energy card from your discard pile to 1 of your Benched Pokémon.

				}
				moveAttack "Flare", {
					// 20 damage.
					damage 20
				}
			}



      case PANSEAR_37: return cardng (stub) {
				moveAttack "Surprise Attack", {
					// 30 damage. Flip a coin. If tails, this attack does nothing.
					damage 30
				}
			}



      case SIMISEAR_38: return cardng (stub) {
				moveAttack "Light Punch", {
					// 20 damage.
					damage 20
				}
				moveAttack "Fling Fire", {
					// 60x damage. Discard up to 2 basic Energy cards from your hand. This attack does 60 damage for each card you discarded in this way.
					damage 60
				}
			}



      case CHANDELURE_V_39: return cardng (stub) {
				moveAttack "Confuse Ray", {
					// Your opponent's Active Pokémon is now Confused.

				}
				moveAttack "Poltergeist", {
					// 40x damage. Your opponent reveals their hand. This attack does 40 damage for each Trainer card you find there.
					damage 40
				}
			}



      case CHANDELURE_VMAX_40: return cardng (stub) {
				bwAbility "Cursed Shimmer", {
					// As long as this Pokémon is in the Active Spot, your opponent can't play any Pokémon Tool cards from their hand.
					actionA {
					}
				}
				moveAttack "Max Poltergeist", {
					// 70x damage. Your opponent reveals their hand. This attack does 70 damage for each Trainer card you find there.
					damage 70
				}
			}



      case HEATMOR_41: return cardng (stub) {
				moveAttack "Flame Cloak", {
					// 20 damage. Attach a [R] Energy card from your discard pile to this Pokémon.
					damage 20
				}
				moveAttack "Exciting Flame", {
					// 90 damage. If this Pokémon has at least 3 extra Energy attached (in addition to this attack's cost), this attack also does 180 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 90
				}
			}





      case CINDERACE_V_43: return cardng (stub) {
				moveAttack "Blaze Kick", {
					// 210 damage. Discard 2 [R] Energy from this Pokémon.
					damage 210
				}
			}



      case CINDERACE_V_44: return cardng (stub) {
				moveAttack "Flare", {
					// 50 damage.
					damage 50
				}
				moveAttack "All-Out Shot", {
					// 210 damage. During your next turn, this Pokémon can't attack.
					damage 210
				}
			}



      case CINDERACE_VMAX_45: return cardng (stub) {
				moveAttack "G-Max Fireball", {
					// 230 damage. Your opponent's Active Pokémon is now Burned. During your next turn, this Pokémon can't attack.
					damage 230
				}
			}



      case SIZZLIPEDE_46: return cardng (stub) {
				moveAttack "Gnaw", {
					// 10 damage.
					damage 10
				}
				moveAttack "Ember", {
					// 20 damage.
					damage 20
				}
			}



      case SIZZLIPEDE_47: return cardng (stub) {
				moveAttack "Singe", {
					// Your opponent's Active Pokémon is now Burned.

				}
			}



      case CENTISKORCH_48: return cardng (stub) {
				moveAttack "Coil", {
					// 30 damage. During your next turn, this Pokémon's attacks do 90 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance).
					damage 30
				}
				moveAttack "Burning Train", {
					// 120 damage.
					damage 120
				}
			}



      case CENTISKORCH_49: return cardng (stub) {
				moveAttack "Steady Firebreathing", {
					// 30 damage.
					damage 30
				}
				moveAttack "Heat Blast", {
					// 100 damage.
					damage 100
				}
			}



      case SHELLDER_50: return cardng (stub) {
				moveAttack "Tongue Slap", {
					// 10 damage.
					damage 10
				}
				moveAttack "Wave Splash", {
					// 20 damage.
					damage 20
				}
			}



      case CLOYSTER_51: return cardng (stub) {
				bwAbility "Shell Armor", {
					// This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
					actionA {
					}
				}
				moveAttack "Aqua Split", {
					// 60 damage. This attack also does 30 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 60
				}
			}



      case STARYU_52: return cardng (stub) {
				moveAttack "Soak in Water", {
					// Attach a [W] Energy card from your hand to this Pokémon.

				}
				moveAttack "Spinning Attack", {
					// 10 damage.
					damage 10
				}
			}



      case STARMIE_53: return cardng (stub) {
				moveAttack "Multishot Star", {
					// Discard any amount of [W] Energy from this Pokémon. Then, for each Energy card you discarded in this way, choose 1 of your opponent's Pokémon and do 30 damage to it. (You can choose the same Pokémon more than once.) This damage isn't affected by Weakness or Resistance.

				}
			}



      case LAPRAS_54: return cardng (stub) {
				moveAttack "Icy Wind", {
					// Your opponent's Active Pokémon is now Asleep.

				}
				moveAttack "Splash Arch", {
					// Put all Energy attached to this Pokémon into your hand. This attack does 100 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
			}



      case TOTODILE_55: return cardng (stub) {
				moveAttack "Rain Splash", {
					// 20 damage.
					damage 20
				}
			}



      case CROCONAW_56: return cardng (stub) {
				moveAttack "Wave Splash", {
					// 30 damage.
					damage 30
				}
				moveAttack "Surf", {
					// 60 damage.
					damage 60
				}
			}



      case FERALIGATR_57: return cardng (stub) {
				bwAbility "Rowdy", {
					// When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you must flip a coin. If heads, discard the top 5 cards of your opponent's deck. If tails, discard the top 5 cards of your deck.
					actionA {
					}
				}
				moveAttack "Crunch", {
					// 140 damage. Discard an Energy from your opponent's Active Pokémon.
					damage 140
				}
			}



      case MARILL_58: return cardng (stub) {
				moveAttack "Aqua Liner", {
					// This attack does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Let's All Rollout", {
					// 20x damage. This attack does 20 damage for each of your Benched Pokémon that has the Let's All Rollout attack.
					damage 20
				}
			}



      case AZUMARILL_59: return cardng (stub) {
				moveAttack "Dive and Rescue", {
					// Put up to 3 in any combination of Pokémon and Supporter cards from your discard pile into your hand.

				}
				moveAttack "Surf", {
					// 90 damage.
					damage 90
				}
			}



      case QWILFISH_60: return cardng (stub) {
				moveAttack "Collect", {
					// Draw a card.

				}
				moveAttack "Spike Sting", {
					// 30 damage.
					damage 30
				}
			}



      case MANTINE_61: return cardng (stub) {
				moveAttack "Bounce", {
					// 20 damage. You may switch this Pokémon with 1 of your Benched Pokémon.
					damage 20
				}
				moveAttack "Wave Splash", {
					// 80 damage.
					damage 80
				}
			}



      case MUDKIP_62: return cardng (stub) {
				moveAttack "Mud-Slap", {
					// 20 damage.
					damage 20
				}
				moveAttack "Playful Kick", {
					// 30 damage.
					damage 30
				}
			}



      case MARSHTOMP_63: return cardng (stub) {
				moveAttack "Mud-Slap", {
					// 30 damage.
					damage 30
				}
				moveAttack "Energy Loop", {
					// 80 damage. Put an Energy attached to this Pokémon into your hand.
					damage 80
				}
			}



      case SWAMPERT_64: return cardng (stub) {
				bwAbility "Muddy Maker", {
					// Once during your turn, you may attach a [W] Energy card or a [F] Energy card from your hand to 1 of your Pokémon.
					actionA {
					}
				}
				moveAttack "Earthquake", {
					// 180 damage. This attack also does 20 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 180
				}
			}



      case CLAMPERL_65: return cardng (stub) {
				moveAttack "Bursting Bubble", {
					// 10 damage.
					damage 10
				}
			}



      case HUNTAIL_66: return cardng (stub) {
				bwAbility "Single Strike Jammer", {
					// Your opponent's Single Strike Pokémon's attacks cost [C] more.
					actionA {
					}
				}
				moveAttack "Cavernous Chomp", {
					// 80 damage.
					damage 80
				}
			}



      case GOREBYSS_67: return cardng (stub) {
				bwAbility "Rapid Strike Canceler", {
					// Your opponent's Rapid Strike Pokémon in play have no Abilities.
					actionA {
					}
				}
				moveAttack "Draining Kiss", {
					// 50 damage. Heal 30 damage from this Pokémon.
					damage 50
				}
			}



      case PANPOUR_68: return cardng (stub) {
				moveAttack "Pry", {
					// 10 damage. Your opponent reveals their hand.
					damage 10
				}
			}



      case SIMIPOUR_69: return cardng (stub) {
				moveAttack "Water Pulse", {
					// 20 damage. Your opponent's Active Pokémon is now Asleep.
					damage 20
				}
				moveAttack "Circus Soaking", {
					// 60x damage. Your opponent reveals their hand. This attack does 60 damage for each Supporter card you find there.
					damage 60
				}
			}



      case BASCULIN_70: return cardng (stub) {
				moveAttack "Swarm the Wound", {
					// 30+ damage. This attack does 10 more damage for each damage counter on your opponent's Active Pokémon.
					damage 30
				}
			}



      case GALARIAN_DARUMAKA_71: return cardng (stub) {
				moveAttack "Reckless Charge", {
					// 20 damage. Flip a coin. If tails, this Pokémon also does 10 damage to itself.
					damage 20
				}
			}



      case GALARIAN_DARMANITAN_72: return cardng (stub) {
				moveAttack "Powder Snow", {
					// 30 damage. Your opponent's Active Pokémon is now Asleep.
					damage 30
				}
				moveAttack "Daruma Headbutt", {
					// 130 damage. If this Pokémon has any damage counters on it, this attack can be used for Water.
					damage 130
				}
			}



      case GRENINJA_V_73: return cardng (stub) {
				moveAttack "Water Drip", {
					// 40 damage.
					damage 40
				}
				moveAttack "Dancing Shuriken", {
					// 80x damage. Flip 3 coins. This attack does 80 damage for each heads.
					damage 80
				}
			}



      case CLAUNCHER_74: return cardng (stub) {
				moveAttack "Water Gun", {
					// 10 damage.
					damage 10
				}
				moveAttack "Vise Grip", {
					// 20 damage.
					damage 20
				}
			}



      case CLAWITZER_75: return cardng (stub) {
				moveAttack "Snipe Shot", {
					// This attack does 50 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Crabhammer", {
					// 110 damage.
					damage 110
				}
			}



      case CRABOMINABLE_V_76: return cardng (stub) {
				moveAttack "Trigger Avalanche", {
					// Discard the top 2 cards of your opponent's deck.

				}
				moveAttack "Destroyer Punch", {
					// 90+ damage. This attack does 60 more damage for each damage counter on your opponent's Active Pokémon.
					damage 90
				}
			}





      case INTELEON_V_78: return cardng (stub) {
				moveAttack "Surf", {
					// 40 damage.
					damage 40
				}
				moveAttack "Aqua Bullet", {
					// 120 damage. This attack also does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 120
				}
			}



      case INTELEON_VMAX_79: return cardng (stub) {
				bwAbility "Double Gunner", {
					// You must discard a [W] Energy card from your hand in order to use this Ability. Once during your turn, you may choose 2 of your opponent's Benched Pokémon and put 2 damage counters on each of them.
					actionA {
					}
				}
				moveAttack "G-Max Spiral", {
					// 70+ damage. You may put an Energy attached to this Pokémon into your hand. If you do, this attack does 70 more damage.
					damage 70
				}
			}



      case CHEWTLE_80: return cardng (stub) {
				moveAttack "Bite", {
					// 30 damage.
					damage 30
				}
			}



      case DREDNAW_81: return cardng (stub) {
				moveAttack "Hard Bite", {
					// 80+ damage. Flip a coin. If heads, this attack does 50 more damage.
					damage 80
				}
			}



      case ARROKUDA_82: return cardng (stub) {
				moveAttack "Peck", {
					// 10 damage.
					damage 10
				}
			}



      case BARRASKEWDA_83: return cardng (stub) {
				moveAttack "Pierce", {
					// 50 damage.
					damage 50
				}
			}



      case SNOM_84: return cardng (stub) {
				moveAttack "Find Ice", {
					// Search your deck for up to 2 [W] Energy cards, reveal them, and put them into your hand. Then, shuffle your deck.

				}
			}



      case FROSMOTH_85: return cardng (stub) {
				moveAttack "Icy Wind", {
					// Your opponent's Active Pokémon is now Asleep.

				}
				moveAttack "Blizzard Loop", {
					// 160 damage. Put all Energy attached to this Pokémon into your hand.
					damage 160
				}
			}



      case PIKACHU_V_86: return cardng (stub) {
				moveAttack "Tail Whap", {
					// 20 damage.
					damage 20
				}
				moveAttack "Thunderbolt", {
					// 100 damage.
					damage 100
				}
			}



      case VOLTORB_87: return cardng (stub) {
				moveAttack "Single Shot Blast", {
					// 30 damage. Flip a coin. If tails, this attack does nothing.
					damage 30
				}
			}



      case ELECTRODE_88: return cardng (stub) {
				moveAttack "Sonic Boom", {
					// 40 damage. This attack's damage isn't affected by Weakness or Resistance.
					damage 40
				}
				moveAttack "Explosion", {
					// 120 damage. This Pokémon also does 90 damage to itself.
					damage 120
				}
			}



      case PLUSLE_89: return cardng (stub) {
				moveAttack "Spark Duo", {
					// 20+ damage. If 1 of your Minun used an attack during your last turn, this attack does 100 more damage.
					damage 20
				}
			}



      case MINUN_90: return cardng (stub) {
				moveAttack "Call for Family", {
					// Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Static Shock", {
					// 20 damage.
					damage 20
				}
			}



      case SHINX_91: return cardng (stub) {
				moveAttack "Gnaw", {
					// 10 damage.
					damage 10
				}
				moveAttack "Electric Claws", {
					// 20 damage.
					damage 20
				}
			}



      case LUXIO_92: return cardng (stub) {
				moveAttack "Electric Claws", {
					// 50 damage.
					damage 50
				}
			}



      case LUXRAY_93: return cardng (stub) {
				moveAttack "Thunder Claws", {
					// 90 damage.
					damage 90
				}
			}



      case ROTOM_94: return cardng (stub) {
				moveAttack "Surprise Short", {
					// Discard all Pokémon Tools from all of your opponent's Pokémon.

				}
				moveAttack "Static Shock", {
					// 30 damage.
					damage 30
				}
			}



      case TYNAMO_95: return cardng (stub) {
				moveAttack "Thunder Wave", {
					// Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.

				}
				moveAttack "Tackle", {
					// 20 damage.
					damage 20
				}
			}



      case EELEKTRIK_96: return cardng (stub) {
				moveAttack "Lightning Ball", {
					// 20 damage.
					damage 20
				}
				moveAttack "Thunder", {
					// 80 damage. This Pokémon also does 20 damage to itself.
					damage 80
				}
			}



      case EELEKTROSS_97: return cardng (stub) {
				moveAttack "Upper Shock", {
					// 40 damage. If this Pokémon evolved from Eelektrik during this turn, your opponent's Active Pokémon is now Paralyzed.
					damage 40
				}
				moveAttack "Wild Charge", {
					// 160 damage. This Pokémon also does 30 damage to itself.
					damage 160
				}
			}



      case HELIOPTILE_98: return cardng (stub) {
				moveAttack "Gnaw", {
					// 10 damage.
					damage 10
				}
				moveAttack "Electro Ball", {
					// 20 damage.
					damage 20
				}
			}



      case HELIOLISK_99: return cardng (stub) {
				moveAttack "Gnaw", {
					// 20 damage.
					damage 20
				}
				moveAttack "Electrobullet", {
					// 60 damage. This attack also does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 60
				}
			}



      case CHARJABUG_100: return cardng (stub) {
				moveAttack "Vise Grip", {
					// 30 damage.
					damage 30
				}
				moveAttack "Head Bolt", {
					// 60 damage.
					damage 60
				}
			}



      case VIKAVOLT_101: return cardng (stub) {
				moveAttack "Bite", {
					// 70 damage.
					damage 70
				}
				moveAttack "Electro Blaster", {
					// Discard 2 [L] Energy from this Pokémon. This attack does 200 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
			}



      case ZERAORA_102: return cardng (stub) {
				moveAttack "Wild Charge", {
					// 70 damage. This Pokémon also does 20 damage to itself.
					damage 70
				}
			}





      case BOLTUND_VMAX_104: return cardng (stub) {
				moveAttack "Bolt Storm", {
					// 30+ damage. This attack does 30 more damage for each [L] Energy attached to all of your Pokémon.
					damage 30
				}
				moveAttack "Max Bolt", {
					// 230 damage. During your next turn, this Pokémon can't use Max Bolt.
					damage 230
				}
			}



      case TOXEL_105: return cardng (stub) {
				moveAttack "Ram", {
					// 20 damage.
					damage 20
				}
			}





      case TOXTRICITY_107: return cardng (stub) {
				moveAttack "Punk Shock", {
					// 70 damage. You may choose to make your opponent's Active Pokémon Paralyzed. If you do, this Pokémon also does 70 damage to itself.
					damage 70
				}
			}



      case TOXTRICITY_108: return cardng (stub) {
				bwAbility "Maximum Downer", {
					// If all your Pokémon in play are Fusion Strike Pokémon, your opponent's Pokémon VMAX in play get -30 HP.
					actionA {
					}
				}
				moveAttack "Head Bolt", {
					// 90 damage.
					damage 90
				}
			}



      case MORPEKO_109: return cardng (stub) {
				moveAttack "Targeted Spark", {
					// This attack does 30 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
			}



      case JIGGLYPUFF_110: return cardng (stub) {
				moveAttack "Pound", {
					// 20 damage.
					damage 20
				}
				moveAttack "Let's All Rollout", {
					// 20x damage. This attack does 20 damage for each of your Benched Pokémon that has the Let's All Rollout attack.
					damage 20
				}
			}



      case WIGGLYTUFF_111: return cardng (stub) {
				moveAttack "Find Treasure", {
					// Search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck.

				}
				moveAttack "Hyper Voice", {
					// 90 damage.
					damage 90
				}
			}



      case JYNX_112: return cardng (stub) {
				moveAttack "Double Draw", {
					// Draw 2 cards.

				}
				moveAttack "Dazzle Dance", {
					// 30 damage. Your opponent's Active Pokémon is now Confused.
					damage 30
				}
			}



      case MEW_V_113: return cardng (stub) {
				moveAttack "Energy Mix", {
					// Search your deck for an Energy card and attach it to 1 of your Fusion Strike Pokémon. Then, shuffle your deck.

				}
				moveAttack "Psychic Leap", {
					// 70 damage. You may shuffle this Pokémon and all attached cards into your deck.
					damage 70
				}
			}



      case MEW_VMAX_114: return cardng (stub) {
				moveAttack "Cross Fusion Strike", {
					// Choose 1 of your Benched Fusion Strike Pokémon's attacks and use it as this attack.

				}
				moveAttack "Max Miracle", {
					// 130 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon.
					damage 130
				}
			}



      case SNUBBULL_115: return cardng (stub) {
				moveAttack "Headbutt", {
					// 10 damage.
					damage 10
				}
				moveAttack "Bite", {
					// 30 damage.
					damage 30
				}
			}



      case GRANBULL_116: return cardng (stub) {
				bwAbility "Dig Up", {
					// When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may put up to 2 Pokémon Tool cards from your discard pile into your hand.
					actionA {
					}
				}
				moveAttack "Bite", {
					// 90 damage.
					damage 90
				}
			}



      case GALARIAN_CORSOLA_117: return cardng (stub) {
				moveAttack "Tackle", {
					// 30 damage.
					damage 30
				}
			}



      case GALARIAN_CURSOLA_118: return cardng (stub) {
				moveAttack "Force Regeneration", {
					// Put a Basic Pokémon V from your opponent's discard pile onto their Bench. If you do, put damage counters on that Pokémon until its remaining HP is 30.

				}
				moveAttack "Spooky Shot", {
					// 80 damage.
					damage 80
				}
			}



      case MAWILE_119: return cardng (stub) {
				moveAttack "Chomp Chomp Hold", {
					// 30 damage. During your opponent's next turn, the Defending Pokémon's attacks cost [C] more, and its Retreat Cost is [C] more.
					damage 30
				}
			}





      case MUNNA_121: return cardng (stub) {
				moveAttack "Ram", {
					// 10 damage.
					damage 10
				}
			}



      case MUSHARNA_122: return cardng (stub) {
				moveAttack "Sleep Inducer", {
					// Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. The new Active Pokémon is now Asleep.

				}
				moveAttack "Psychic", {
					// 30+ damage. This attack does 30 more damage for each Energy attached to your opponent's Active Pokémon.
					damage 30
				}
			}



      case SIGILYPH_123: return cardng (stub) {
				moveAttack "Joust", {
					// 20 damage. Before doing damage, discard all Pokémon Tools from your opponent's Active Pokémon.
					damage 20
				}
				moveAttack "Reflect Energy", {
					// 60 damage. Move an Energy from this Pokémon to 1 of your Benched Pokémon.
					damage 60
				}
			}



      case MELOETTA_124: return cardng (stub) {
				moveAttack "Melodious Echo", {
					// 70x damage. This attack does 70 damage for each Fusion Strike Energy attached to all of your Pokémon.
					damage 70
				}
			}



      case SANDYGAST_125: return cardng (stub) {
				moveAttack "Vibration", {
					// 10 damage.
					damage 10
				}
				moveAttack "Spooky Shot", {
					// 30 damage.
					damage 30
				}
			}



      case PALOSSAND_126: return cardng (stub) {
				moveAttack "Spooky Sand", {
					// 120 damage.
					damage 120
				}
				moveAttack "Oppressing Sandstorm", {
					// If your opponent's Active Pokémon is a Basic Pokémon, it is Knocked Out.

				}
			}



      case INDEEDEE_127: return cardng (stub) {
				moveAttack "Call for Family", {
					// Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Heart Sign", {
					// 80 damage.
					damage 80
				}
			}



      case DREEPY_128: return cardng (stub) {
				moveAttack "Infestation", {
					// 10 damage. During your opponent's next turn, the Defending Pokémon can't retreat.
					damage 10
				}
			}



      case DRAKLOAK_129: return cardng (stub) {
				moveAttack "Spooky Shot", {
					// 20 damage.
					damage 20
				}
				moveAttack "U-turn", {
					// 30 damage. Switch this Pokémon with 1 of your Benched Pokémon.
					damage 30
				}
			}



      case DRAGAPULT_130: return cardng (stub) {
				moveAttack "Fusion Strike Assault", {
					// 30x damage. This attack does 30 damage for each of your Fusion Strike Pokémon in play.
					damage 30
				}
				moveAttack "Speed Attack", {
					// 120 damage.
					damage 120
				}
			}



      case SANDSHREW_131: return cardng (stub) {
				moveAttack "Dig It Up", {
					// Look at the top card of your deck. You may discard that card.

				}
				moveAttack "Let's All Rollout", {
					// 20x damage. This attack does 20 damage for each of your Benched Pokémon that has the Let's All Rollout attack.
					damage 20
				}
			}



      case SANDSLASH_132: return cardng (stub) {
				moveAttack "Dig Uppercut", {
					// 60 damage. Put a card from your discard pile into your hand.
					damage 60
				}
			}



      case MANKEY_133: return cardng (stub) {
				moveAttack "Scratch", {
					// 10 damage.
					damage 10
				}
			}



      case PRIMEAPE_134: return cardng (stub) {
				moveAttack "Gut Punch", {
					// 30+ damage. If your opponent's Active Pokémon is a Pokémon V, this attack does 60 more damage.
					damage 30
				}
			}



      case GEODUDE_135: return cardng (stub) {
				moveAttack "Rollout", {
					// 10 damage.
					damage 10
				}
				moveAttack "Light Punch", {
					// 20 damage.
					damage 20
				}
			}



      case GRAVELER_136: return cardng (stub) {
				moveAttack "Tackle", {
					// 30 damage.
					damage 30
				}
				moveAttack "Boulder Crush", {
					// 70 damage.
					damage 70
				}
			}



      case GOLEM_137: return cardng (stub) {
				bwAbility "Desperate Blast", {
					// If this Pokémon is in the Active Spot and is Knocked Out by damage from an attack from your opponent's Pokémon, put 10 damage counters on the Attacking Pokémon.
					actionA {
					}
				}
				moveAttack "Double-Edge", {
					// 160 damage. This Pokémon also does 30 damage to itself.
					damage 160
				}
			}



      case ONIX_138: return cardng (stub) {
				moveAttack "Guard Press", {
					// 30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
					damage 30
				}
				moveAttack "Rock Throw", {
					// 90 damage.
					damage 90
				}
			}



      case STEELIX_139: return cardng (stub) {
				moveAttack "Powerful Rage", {
					// 20x damage. This attack does 20 damage for each damage counter on this Pokémon.
					damage 20
				}
				moveAttack "Earthquake", {
					// 180 damage. This attack also does 30 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 180
				}
			}



      case GLIGAR_140: return cardng (stub) {
				moveAttack "Poison Sting", {
					// Your opponent's Active Pokémon is now Poisoned.

				}
				moveAttack "Pierce", {
					// 30 damage.
					damage 30
				}
			}



      case GLISCOR_141: return cardng (stub) {
				moveAttack "Cut Down", {
					// 30 damage. Discard an Energy from your opponent's Active Pokémon.
					damage 30
				}
				moveAttack "Venomous Hit", {
					// 100 damage. Your opponent's Active Pokémon is now Poisoned.
					damage 100
				}
			}



      case MAKUHITA_142: return cardng (stub) {
				moveAttack "Lunge Out", {
					// 10 damage.
					damage 10
				}
				moveAttack "Hammer In", {
					// 60 damage.
					damage 60
				}
			}



      case HARIYAMA_143: return cardng (stub) {
				bwAbility "Guts", {
					// If this Pokémon would be Knocked Out by damage from an attack, flip a coin. If heads, this Pokémon is not Knocked Out, and its remaining HP becomes 10.
					actionA {
					}
				}
				moveAttack "Hammer In", {
					// 100 damage.
					damage 100
				}
			}



      case BALTOY_144: return cardng (stub) {
				moveAttack "Smack", {
					// 20 damage.
					damage 20
				}
			}



      case CLAYDOL_145: return cardng (stub) {
				moveAttack "Rapid Spin", {
					// 30 damage. Switch this Pokémon with 1 of your Benched Pokémon. If you do, your opponent switches their Active Pokémon with 1 of their Benched Pokémon.
					damage 30
				}
				moveAttack "Ancient Imprint", {
					// Put damage counters on your opponent's Active Pokémon until its remaining HP is 60.

				}
			}



      case LUCARIO_V_146: return cardng (stub) {
				moveAttack "Aura Sphere", {
					// 120 damage.
					damage 120
				}
			}



      case DRILBUR_147: return cardng (stub) {
				moveAttack "Scratch", {
					// 20 damage.
					damage 20
				}
			}



      case LANDORUS_148: return cardng (stub) {
				moveAttack "Strafe", {
					// 20 damage. You may switch this Pokémon with 1 of your Benched Pokémon.
					damage 20
				}
				moveAttack "Earthen Boom", {
					// 120 damage. Move all Energy from this Pokémon to your Benched Pokémon in any way you like.
					damage 120
				}
			}



      case PANCHAM_149: return cardng (stub) {
				moveAttack "Raised Bad", {
					// Search your deck for up to 2 [D] Energy cards and attach them to this Pokémon. Then, shuffle your deck.

				}
				moveAttack "Smash Kick", {
					// 30 damage.
					damage 30
				}
			}



      case STUFFUL_150: return cardng (stub) {
				moveAttack "Beat", {
					// 10 damage.
					damage 10
				}
				moveAttack "Rollout", {
					// 30 damage.
					damage 30
				}
			}



      case BEWEAR_151: return cardng (stub) {
				moveAttack "Split Spiral Punch", {
					// 40 damage. Your opponent's Active Pokémon is now Confused.
					damage 40
				}
				moveAttack "Strength", {
					// 130 damage.
					damage 130
				}
			}



      case CLOBBOPUS_152: return cardng (stub) {
				moveAttack "Beat", {
					// 10 damage.
					damage 10
				}
				moveAttack "Knuckle Punch", {
					// 20 damage.
					damage 20
				}
			}



      case GRAPPLOCT_153: return cardng (stub) {
				moveAttack "Lunge Out", {
					// 40 damage.
					damage 40
				}
				moveAttack "Magnum Punch", {
					// 90 damage.
					damage 90
				}
			}



      case FALINKS_154: return cardng (stub) {
				moveAttack "Headbutt", {
					// 30 damage.
					damage 30
				}
				moveAttack "Cliff Edge Formation", {
					// 60+ damage. If your opponent has exactly 1 Prize card remaining, this attack does 160 more damage.
					damage 60
				}
			}



      case FALINKS_155: return cardng (stub) {
				moveAttack "Invade", {
					// 30 damage.
					damage 30
				}
			}



      case GENGAR_V_156: return cardng (stub) {
				moveAttack "Dark Slumber", {
					// 40 damage. Your opponent's Active Pokémon is now Asleep.
					damage 40
				}
				moveAttack "Pain Explosion", {
					// 190 damage. Put 3 damage counters on this Pokémon.
					damage 190
				}
			}



      case GENGAR_VMAX_157: return cardng (stub) {
				moveAttack "Fear and Panic", {
					// 60x damage. This attack does 60 damage for each of your opponent's Pokémon V and Pokémon-GX in play.
					damage 60
				}
				moveAttack "G-Max Swallow Up", {
					// 250 damage. During your next turn, this Pokémon can't attack.
					damage 250
				}
			}



      case TYRANITAR_V_158: return cardng (stub) {
				moveAttack "Hammer In", {
					// 80 damage.
					damage 80
				}
				moveAttack "Land Crush", {
					// 150 damage.
					damage 150
				}
			}



      case GALARIAN_ZIGZAGOON_159: return cardng (stub) {
				moveAttack "Lick", {
					// 10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
					damage 10
				}
			}



      case GALARIAN_LINOONE_160: return cardng (stub) {
				moveAttack "Rear Kick", {
					// 30 damage.
					damage 30
				}
			}



      case GALARIAN_OBSTAGOON_161: return cardng (stub) {
				moveAttack "Silence", {
					// 30 damage. Choose 1 of your opponent's Active Pokémon's attacks. During your opponent's next turn, that Pokémon can't use that attack.
					damage 30
				}
				moveAttack "Merciless Strike", {
					// 60+ damage. If your opponent's Active Pokémon already has any damage counters on it, this attack does 90 more damage.
					damage 60
				}
			}



      case CARVANHA_162: return cardng (stub) {
				moveAttack "Bite", {
					// 10 damage.
					damage 10
				}
			}



      case SHARPEDO_163: return cardng (stub) {
				moveAttack "Sharp Fang", {
					// 70 damage.
					damage 70
				}
			}



      case ABSOL_164: return cardng (stub) {
				moveAttack "Drag Off", {
					// Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. This attack does 30 damage to the new Active Pokémon.

				}
				moveAttack "Slash", {
					// 80 damage.
					damage 80
				}
			}





      case TOXICROAK_166: return cardng (stub) {
				moveAttack "Severe Poison", {
					// Your opponent's Active Pokémon is now Poisoned. During Pokémon Checkup, put 4 damage counters on that Pokémon instead of 1.

				}
				moveAttack "Magnum Punch", {
					// 90 damage.
					damage 90
				}
			}



      case DARKRAI_167: return cardng (stub) {
				moveAttack "Dark Cutter", {
					// 90 damage.
					damage 90
				}
			}



      case TRUBBISH_168: return cardng (stub) {
				moveAttack "Call for Family", {
					// Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Super Poison Breath", {
					// 20 damage. Your opponent's Active Pokémon is now Poisoned.
					damage 20
				}
			}



      case GARBODOR_169: return cardng (stub) {
				moveAttack "Poison Gas", {
					// 30 damage. Your opponent's Active Pokémon is now Poisoned.
					damage 30
				}
				moveAttack "Sludge Whirlpool", {
					// 130 damage.
					damage 130
				}
			}



      case ZORUA_170: return cardng (stub) {
				moveAttack "Ram", {
					// 10 damage.
					damage 10
				}
				moveAttack "Rear Kick", {
					// 20 damage.
					damage 20
				}
			}



      case ZOROARK_171: return cardng (stub) {
				moveAttack "Double Claw", {
					// 40x damage. Flip 2 coins. This attack does 40 damage for each heads.
					damage 40
				}
				moveAttack "Night Daze", {
					// 100 damage.
					damage 100
				}
			}



      case VULLABY_172: return cardng (stub) {
				moveAttack "Razor Wing", {
					// 10 damage.
					damage 10
				}
				moveAttack "Air Slash", {
					// 30 damage. Discard an Energy from this Pokémon.
					damage 30
				}
			}



      case MANDIBUZZ_173: return cardng (stub) {
				moveAttack "Bone Block", {
					// 20 damage. During your opponent's next turn, Pokémon can't be played from your opponent's hand to evolve the Defending Pokémon.
					damage 20
				}
				moveAttack "Dark Cutter", {
					// 70 damage.
					damage 70
				}
			}



      case PANGORO_174: return cardng (stub) {
				moveAttack "Knocking Hammer", {
					// 90 damage. Discard the top card of your opponent's deck.
					damage 90
				}
				moveAttack "Shakedown", {
					// 150 damage. Discard a random card from your opponent's hand.
					damage 150
				}
			}



      case YVELTAL_175: return cardng (stub) {
				moveAttack "Dark Cutter", {
					// 50 damage.
					damage 50
				}
				moveAttack "Single Strike Wings", {
					// 110 damage.
					damage 110
				}
			}



      case IMPIDIMP_176: return cardng (stub) {
				moveAttack "Play Rough", {
					// 10+ damage. Flip a coin. If heads, this attack does 30 more damage.
					damage 10
				}
			}



      case MORGREM_177: return cardng (stub) {
				moveAttack "Bite", {
					// 20 damage.
					damage 20
				}
				moveAttack "Crushing Blow", {
					// 40 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon.
					damage 40
				}
			}



      case GRIMMSNARL_178: return cardng (stub) {
				moveAttack "Bite", {
					// 60 damage.
					damage 60
				}
				moveAttack "Rear Attack", {
					// 100+ damage. If you have 2 or fewer Benched Pokémon, this attack does 140 more damage.
					damage 100
				}
			}



      case MORPEKO_179: return cardng (stub) {
				moveAttack "Explosive Discontent", {
					// 30x damage. This attack does 30 damage for each damage counter on this Pokémon.
					damage 30
				}
			}



      case GALARIAN_MEOWTH_180: return cardng (stub) {
				moveAttack "Growl", {
					// During your opponent's next turn, the Defending Pokémon's attacks do 20 less damage (before applying Weakness and Resistance).

				}
				moveAttack "Slash", {
					// 20 damage.
					damage 20
				}
			}



      case GALARIAN_PERRSERKER_181: return cardng (stub) {
				moveAttack "Call to Muster", {
					// Search your deck for up to 2 basic Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck.

				}
				moveAttack "Headbang", {
					// 80 damage.
					damage 80
				}
			}



      case SKARMORY_182: return cardng (stub) {
				moveAttack "Steel Wing", {
					// 30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
					damage 30
				}
				moveAttack "Slicing Blade", {
					// 110 damage.
					damage 110
				}
			}



      case EXCADRILL_183: return cardng (stub) {
				moveAttack "Metal Claw", {
					// 50 damage.
					damage 50
				}
				moveAttack "Rock Tomb", {
					// 120 damage. During your opponent's next turn, the Defending Pokémon can't retreat.
					damage 120
				}
			}



      case DURANT_184: return cardng (stub) {
				moveAttack "Adversity Jaws", {
					// 70 damage. If your opponent's Active Pokémon is a [R] Pokémon, it is now Paralyzed.
					damage 70
				}
			}



      case GENESECT_V_185: return cardng (stub) {
				bwAbility "Fusion Strike System", {
					// Once during your turn, you may draw cards until you have as many cards in your hand as you have Fusion Strike Pokémon in play.
					actionA {
					}
				}
				moveAttack "Techno Blast", {
					// 210 damage. During your next turn, this Pokémon can't attack.
					damage 210
				}
			}



      case KLEFKI_186: return cardng (stub) {
				moveAttack "Unlock", {
					// 10 damage. Draw 2 cards.
					damage 10
				}
			}



      case TOGEDEMARU_187: return cardng (stub) {
				moveAttack "Let's All Rollout", {
					// 20x damage. This attack does 20 damage for each of your Benched Pokémon that has the Let's All Rollout attack.
					damage 20
				}
				moveAttack "Rolling Attack", {
					// 50 damage.
					damage 50
				}
			}



      case MELTAN_188: return cardng (stub) {
				moveAttack "Iron Intake", {
					// Heal 30 damage from this Pokémon.

				}
				moveAttack "Headbutt", {
					// 20 damage.
					damage 20
				}
			}



      case MELMETAL_189: return cardng (stub) {
				moveAttack "Ingot Swing", {
					// 80 damage. During your opponent's next turn, prevent all damage done to this Pokémon by attacks from Pokémon that have an Ability.
					damage 80
				}
				moveAttack "Blasting Hammer", {
					// 150 damage. Discard an Energy from this Pokémon.
					damage 150
				}
			}



      case CORVIKNIGHT_190: return cardng (stub) {
				moveAttack "Steel Wing", {
					// 50 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
					damage 50
				}
				moveAttack "Power Cyclone", {
					// 160 damage. Move an Energy from this Pokémon to 1 of your Benched Pokémon.
					damage 160
				}
			}



      case CUFANT_191: return cardng (stub) {
				moveAttack "Rollout", {
					// 10 damage.
					damage 10
				}
				moveAttack "High Horsepower", {
					// 80 damage. This Pokémon also does 20 damage to itself.
					damage 80
				}
			}



      case COPPERAJAH_192: return cardng (stub) {
				moveAttack "Strength", {
					// 90 damage.
					damage 90
				}
				moveAttack "High Horsepower", {
					// 160 damage. This Pokémon also does 30 damage to itself.
					damage 160
				}
			}





      case LATIOS_194: return cardng (stub) {
				bwAbility "Blue Assist", {
					// Once during your turn, you may attach a [P] Energy card from your hand to 1 of your Latias.
					actionA {
					}
				}
				moveAttack "Luster Purge", {
					// 210 damage. Discard 2 Energy from this Pokémon.
					damage 210
				}
			}



      case GOOMY_195: return cardng (stub) {
				moveAttack "Tackle", {
					// 10 damage.
					damage 10
				}
				moveAttack "Melt", {
					// 20 damage.
					damage 20
				}
			}



      case SLIGGOO_196: return cardng (stub) {
				moveAttack "Melt", {
					// 20 damage.
					damage 20
				}
				moveAttack "Body Slam", {
					// 50 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
					damage 50
				}
			}



      case GOODRA_197: return cardng (stub) {
				bwAbility "Slimy Room", {
					// As long as this Pokémon is in the Active Spot, whenever your opponent tries to attach an Energy card from their hand to a Pokémon, they must flip a coin. If tails, your opponent discards that Energy card instead of attaching it, and this doesn't use up their Energy attachment for the turn.
					actionA {
					}
				}
				moveAttack "Buster Tail", {
					// 120 damage.
					damage 120
				}
			}



      case TURTONATOR_198: return cardng (stub) {
				moveAttack "Shell Trap", {
					// 30 damage. During your opponent's next turn, if this Pokémon is damaged by an attack (even if it is Knocked Out), put 8 damage counters on the Attacking Pokémon.
					damage 30
				}
				moveAttack "Heat Crash", {
					// 80 damage.
					damage 80
				}
			}



      case MEOWTH_199: return cardng (stub) {
				moveAttack "Pay Day", {
					// 10 damage. Draw a card.
					damage 10
				}
			}



      case PERSIAN_200: return cardng (stub) {
				moveAttack "Pay Day", {
					// 30 damage. Draw a card.
					damage 30
				}
				moveAttack "Bite", {
					// 70 damage.
					damage 70
				}
			}



      case DODRIO_V_201: return cardng (stub) {
				moveAttack "No Reprieve", {
					// 20 damage. During your next turn, this Pokémon's attacks do 80 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance).
					damage 20
				}
				moveAttack "Rampage Drill", {
					// 160 damage. This Pokémon also does 30 damage to itself.
					damage 160
				}
			}



      case CHANSEY_202: return cardng (stub) {
				moveAttack "Drain Slap", {
					// 30 damage. Heal 30 damage from this Pokémon.
					damage 30
				}
				moveAttack "Gentle Slap", {
					// 70 damage.
					damage 70
				}
			}



      case BLISSEY_203: return cardng (stub) {
				bwAbility "Expert in Roundness", {
					// Prevent all damage done to each of your Pokémon that has the Let's All Rollout attack by attacks from your opponent's Pokémon VMAX.
					actionA {
					}
				}
				moveAttack "Let's All Rollout", {
					// 20x damage. This attack does 20 damage for each of your Benched Pokémon that has the Let's All Rollout attack.
					damage 20
				}
			}



      case KANGASKHAN_204: return cardng (stub) {
				moveAttack "Pound", {
					// 30 damage.
					damage 30
				}
				moveAttack "Coordinated One-Two Punch", {
					// 60+ damage. Flip a coin. If heads, this attack does 100 more damage.
					damage 60
				}
			}



      case EEVEE_205: return cardng (stub) {
				moveAttack "Continuous Steps", {
					// 30x damage. Flip a coin until you get tails. This attack does 30 damage for each heads.
					damage 30
				}
			}



      case SNORLAX_206: return cardng (stub) {
				moveAttack "Heavy Impact", {
					// 80 damage.
					damage 80
				}
			}



      case DUNSPARCE_207: return cardng (stub) {
				bwAbility "Mysterious Nest", {
					// [C] Pokémon in play (both yours and your opponent's) have no Weakness.
					actionA {
					}
				}
				moveAttack "Rollout", {
					// 30 damage.
					damage 30
				}
			}



      case STANTLER_208: return cardng (stub) {
				moveAttack "Rear Kick", {
					// 20 damage.
					damage 20
				}
				moveAttack "Wild Dive", {
					// 30x damage. This attack does 30 damage for each Energy attached to your opponent's Active Pokémon.
					damage 30
				}
			}



      case SMEARGLE_209: return cardng (stub) {
				moveAttack "Sketching Trash", {
					// Put up to 2 Fusion Strike Trainer cards from your discard pile into your hand.

				}
				moveAttack "Tail Whap", {
					// 80 damage.
					damage 80
				}
			}



      case SKITTY_210: return cardng (stub) {
				moveAttack "Whimsy Tackle", {
					// 30 damage. Flip a coin. If tails, this attack does nothing.
					damage 30
				}
			}



      case DELCATTY_211: return cardng (stub) {
				moveAttack "Willful Busybody", {
					// Your opponent reveals their hand. Choose a card you find there and put it on the bottom of their deck.

				}
				moveAttack "Double Slap", {
					// 50x damage. Flip 2 coins. This attack does 50 damage for each heads.
					damage 50
				}
			}



      case BUNEARY_212: return cardng (stub) {
				moveAttack "Double Kick", {
					// 20x damage. Flip 2 coins. This attack does 20 damage for each heads.
					damage 20
				}
			}



      case LOPUNNY_213: return cardng (stub) {
				moveAttack "Hopping Shot", {
					// 70 damage.
					damage 70
				}
			}



      case BUNNELBY_214: return cardng (stub) {
				moveAttack "Find a Friend", {
					// Search your deck for a Pokémon, reveal it, and put it into your hand. Then, shuffle your deck.

				}
				moveAttack "Take Down", {
					// 30 damage. This Pokémon also does 10 damage to itself.
					damage 30
				}
			}



      case DIGGERSBY_215: return cardng (stub) {
				moveAttack "Hammer In", {
					// 80 damage.
					damage 80
				}
				moveAttack "Take Down", {
					// 150 damage. This Pokémon also does 30 damage to itself.
					damage 150
				}
			}



      case HAWLUCHA_216: return cardng (stub) {
				moveAttack "Flying Stomp", {
					// 20 damage. Discard a Special Energy from your opponent's Active Pokémon.
					damage 20
				}
			}



      case GREEDENT_V_217: return cardng (stub) {
				moveAttack "Body Slam", {
					// 40 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
					damage 40
				}
				moveAttack "Nom-Nom-Nom Incisors", {
					// 120 damage. Draw 3 cards.
					damage 120
				}
			}



      case GREEDENT_VMAX_218: return cardng (stub) {
				moveAttack "Turn a Profit", {
					// 30 damage. If your opponent's Basic Pokémon is Knocked Out by damage from this attack, take 2 more Prize cards.
					damage 30
				}
				moveAttack "Max Gimme Gimme", {
					// 160 damage. Draw 3 cards.
					damage 160
				}
			}



      case ROOKIDEE_219: return cardng (stub) {
				moveAttack "Fury Attack", {
					// 10x damage. Flip 3 coins. This attack does 10 damage for each heads.
					damage 10
				}
			}



      case CORVISQUIRE_220: return cardng (stub) {
				moveAttack "Fury Attack", {
					// 30x damage. Flip 3 coins. This attack does 30 damage for each heads.
					damage 30
				}
			}



      case WOOLOO_221: return cardng (stub) {
				moveAttack "Derail", {
					// 10 damage. Discard a Special Energy from your opponent's Active Pokémon.
					damage 10
				}
				moveAttack "Let's All Rollout", {
					// 20x damage. This attack does 20 damage for each of your Benched Pokémon that has the Let's All Rollout attack.
					damage 20
				}
			}



      case WOOLOO_222: return cardng (stub) {
				moveAttack "Knock Away", {
					// 20+ damage. Flip a coin. If heads, this attack does 40 more damage.
					damage 20
				}
			}



      case DUBWOOL_223: return cardng (stub) {
				moveAttack "Bounce", {
					// 30 damage. You may switch this Pokémon with 1 of your Benched Pokémon.
					damage 30
				}
				moveAttack "Rolling Tackle", {
					// 70 damage.
					damage 70
				}
			}



      case ADVENTURER_S_DISCOVERY_224: return cardng (stub) {
				// Search your deck for up to 3 Pokémon V, reveal them, and put them into your hand. Then, shuffle your deck.
				onPlay {
				}
				playRequirement{
				}
			}



      case BATTLE_VIP_PASS_225: return cardng (stub) {
				// You can use this card only during your first turn.Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck.
				onPlay {
				}
				playRequirement{
				}
			}



      case BUG_CATCHER_226: return cardng (stub) {
				// Draw 2 cards. Flip a coin. If heads, draw 2 more cards.
				onPlay {
				}
				playRequirement{
				}
			}



      case CHILI_CILAN_CRESS_227: return cardng (stub) {
				// Search your deck for up to 3 Fusion Strike Pokémon, reveal them, and put them into your hand. Then, shuffle your deck.
				onPlay {
				}
				playRequirement{
				}
			}



      case COOK_228: return cardng (stub) {
				// Heal 70 damage from your Active Pokémon.
				onPlay {
				}
				playRequirement{
				}
			}



      case CRAM_O_MATIC_229: return cardng (stub) {
				// You can use this card only if you discard another Item card from your hand. Flip a coin. If heads, search your deck for a card and put it into your hand. Then, shuffle your deck.
				onPlay {
				}
				playRequirement{
				}
			}



      case CROSS_SWITCHER_230: return cardng (stub) {
				// You must play 2 Cross Switcher cards at once. (This effect works one time for 2 cards.)Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. If you do, switch your Active Pokémon with 1 of your Benched Pokémon.
				onPlay {
				}
				playRequirement{
				}
			}



      case CROSSCEIVER_231: return cardng (stub) {
				// You must play 2 Crossceiver cards at once. (This effect works one time for 2 cards.)Put a Pokémon or a Supporter card from your discard pile into your hand.
				onPlay {
				}
				playRequirement{
				}
			}



      case DANCER_232: return cardng (stub) {
				// Draw 2 cards. If you go second and it's your first turn, draw 3 more cards.
				onPlay {
				}
				playRequirement{
				}
			}



      case ELESA_S_SPARKLE_233: return cardng (stub) {
				// Choose up to 2 of your Fusion Strike Pokémon. For each of those Pokémon, search your deck for a Fusion Strike Energy card and attach it to that Pokémon. Then, shuffle your deck.
				onPlay {
				}
				playRequirement{
				}
			}



      case FAREWELL_BELL_234: return cardng (stub) {
				// If the Pokémon VMAX this card is attached to is Knocked Out by damage from an attack from your opponent's Pokémon, search your deck for a card and put it into your hand. Then, shuffle your deck.
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			}



      case JUDGE_235: return cardng (stub) {
				// Each player shuffles their hand into their deck and draws 4 cards.
				onPlay {
				}
				playRequirement{
				}
			}



      case POWER_TABLET_236: return cardng (stub) {
				// During this turn, your Fusion Strike Pokémon's attacks do 30 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance).
				onPlay {
				}
				playRequirement{
				}
			}



      case QUICK_BALL_237: return cardng (stub) {
				// You can play this card only if you discard another card from your hand. Search your deck for a Basic Pokémon, reveal it, and put it into your hand. Then, shuffle your deck.
				onPlay {
				}
				playRequirement{
				}
			}



      case SCHOOLBOY_238: return cardng (stub) {
				// Draw 2 cards. If your opponent has exactly 1, 3, or 5 Prize cards remaining, draw 2 more cards.
				onPlay {
				}
				playRequirement{
				}
			}



      case SCHOOLGIRL_239: return cardng (stub) {
				// Draw 2 cards. If your opponent has exactly 2, 4, or 6 Prize cards remaining, draw 2 more cards.
				onPlay {
				}
				playRequirement{
				}
			}



      case SHAUNA_240: return cardng (stub) {
				// Shuffle your hand into your deck. Then, draw 5 cards.
				onPlay {
				}
				playRequirement{
				}
			}



      case SIDNEY_241: return cardng (stub) {
				// Your opponent reveals their hand. Discard up to 2 in any combination of Pokémon Tool cards, Special Energy cards, and Stadium cards from it.
				onPlay {
				}
				playRequirement{
				}
			}



      case SKATERS_PARK_242: return cardng (stub) {
				// Whenever either player's Active Pokémon retreats, put any basic Energy that would be discarded into their hand instead of the discard pile.
				onPlay {
				}
				onRemoveFromPlay{
				}
			}



      case SPONGY_GLOVES_243: return cardng (stub) {
				// The attacks of the Pokémon this card is attached to do 30 more damage to your opponent's Active [W] Pokémon (before applying Weakness and Resistance).
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			}



      case FUSION_STRIKE_ENERGY_244: return cardng (stub) {
				// This card can only be attached to a Fusion Strike Pokémon. If this card is attached to anything other than a Fusion Strike Pokémon, discard this card. As long as this card is attached to a Pokémon, it provides every type of Energy but provides only 1 Energy at a time. Prevent all effects of your opponent's Pokémon's Abilities done to the Pokémon this card is attached to.
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			}













































































      case TRAINING_COURT_282: return cardng (stub) {
				// Once during each player's turn, that player may put a basic Energy card from their discard pile into their hand.
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