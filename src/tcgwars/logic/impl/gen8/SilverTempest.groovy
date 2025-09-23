package tcgwars.logic.impl.gen8


import static tcgwars.logic.card.Type.*
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*

import tcgwars.logic.card.*

/**
 * @author
 */
public enum SilverTempest implements ImplOnlyCardInfo {

  VENONAT_1,
  VENOMOTH_2,
  SPINARAK_3,
  ARIADOS_4,
  SUNKERN_5,
  SUNFLORA_6,
  SERPERIOR_V_7,
  SERPERIOR_VSTAR_8,
  PETILIL_9,
  HISUIAN_LILLIGANT_10,
  FOONGUS_11,
  AMOONGUSS_12,
  DURANT_13,
  VIRIZION_14,
  CHESNAUGHT_V_15,
  RADIANT_TSAREENA_16,
  VULPIX_17,
  NINETALES_18,
  GROWLITHE_19,
  ARCANINE_20,
  PONYTA_21,
  RAPIDASH_22,
  VICTINI_23,
  RESHIRAM_V_24,
  FENNEKIN_25,
  BRAIXEN_26,
  DELPHOX_27,
  FLETCHINDER_28,
  TALONFLAME_29,
  LITTEN_30,
  TORRACAT_31,
  INCINEROAR_32,
  ALOLAN_VULPIX_V_33,
  ALOLAN_VULPIX_VSTAR_34,
  OMASTAR_V_35,
  ARTICUNO_36,
  WAILMER_37,
  WAILORD_38,
  FEEBAS_39,
  MILOTIC_40,
  SNORUNT_41,
  GLALIE_42,
  FROSLASS_43,
  RELICANTH_44,
  PHIONE_45,
  KELDEO_46,
  DEWPIDER_47,
  ARAQUANID_48,
  PIKACHU_49,
  RAICHU_50,
  CHINCHOU_51,
  LANTURN_52,
  ROTOM_53,
  EMOLGA_54,
  STUNFISK_55,
  ZERAORA_56,
  REGIELEKI_V_57,
  REGIELEKI_VMAX_58,
  RADIANT_ALAKAZAM_59,
  DROWZEE_60,
  HYPNO_61,
  JYNX_62,
  MISDREAVUS_63,
  MISMAGIUS_64,
  UNOWN_V_65,
  UNOWN_VSTAR_66,
  RALTS_67,
  KIRLIA_68,
  GARDEVOIR_69,
  MAWILE_V_70,
  MAWILE_VSTAR_71,
  MEDITITE_72,
  MEDICHAM_73,
  CHIMECHO_74,
  SIGILYPH_75,
  SOLOSIS_76,
  DUOSION_77,
  REUNICLUS_78,
  ELGYEM_79,
  BEHEEYEM_80,
  ESPURR_81,
  MEOWSTIC_82,
  SWIRLIX_83,
  SLURPUFF_84,
  DEDENNE_85,
  INDEEDEE_86,
  DREEPY_87,
  DRAKLOAK_88,
  DRAGAPULT_89,
  HISUIAN_ARCANINE_V_90,
  PHANPY_91,
  DONPHAN_92,
  BALTOY_93,
  CLAYDOL_94,
  ANORITH_95,
  ARMALDO_96,
  TERRAKION_97,
  HAWLUCHA_98,
  SANDYGAST_99,
  PALOSSAND_100,
  STONJOURNER_101,
  URSALUNA_V_102,
  ZUBAT_103,
  GOLBAT_104,
  CROBAT_105,
  MURKROW_106,
  HONCHKROW_107,
  SKUNTANK_V_108,
  CROAGUNK_109,
  TOXICROAK_110,
  SANDILE_111,
  KROKOROK_112,
  KROOKODILE_113,
  MAREANIE_114,
  TOXAPEX_115,
  MORPEKO_116,
  BELDUM_117,
  METANG_118,
  METAGROSS_119,
  RADIANT_JIRACHI_120,
  FERROSEED_121,
  FERROTHORN_122,
  KLINK_123,
  KLANG_124,
  KLINKLANG_125,
  COBALION_126,
  TOGEDEMARU_127,
  MAGEARNA_V_128,
  DRATINI_129,
  DRAGONAIR_130,
  DRAGONITE_131,
  NOIBAT_132,
  NOIVERN_133,
  ZYGARDE_134,
  REGIDRAGO_V_135,
  REGIDRAGO_VSTAR_136,
  SMEARGLE_137,
  LUGIA_V_138,
  LUGIA_VSTAR_139,
  HO_OH_V_140,
  SPINDA_141,
  SWABLU_142,
  ALTARIA_143,
  BUNEARY_144,
  LOPUNNY_145,
  ARCHEN_146,
  ARCHEOPS_147,
  RUFFLET_148,
  HISUIAN_BRAVIARY_149,
  FLETCHLING_150,
  BRANDON_151,
  CANDICE_152,
  CAPTURING_AROMA_153,
  EARTHEN_SEAL_STONE_154,
  EMERGENCY_JELLY_155,
  FOREST_SEAL_STONE_156,
  FURISODE_GIRL_157,
  GYM_TRAINER_158,
  LANCE_159,
  LEAFY_CAMO_PONCHO_160,
  PRIMORDIAL_ALTAR_161,
  PROFESSOR_LAVENTON_162,
  QUAD_STONE_163,
  SERENA_164,
  UNIDENTIFIED_FOSSIL_165,
  WALLACE_166,
  WORKER_167,
  REGENERATIVE_ENERGY_168,
  V_GUARD_ENERGY_169,
  SERPERIOR_V_170,
  CHESNAUGHT_V_171,
  RESHIRAM_V_172,
  ALOLAN_VULPIX_V_173,
  OMASTAR_V_174,
  REGIELEKI_V_175,
  UNOWN_V_176,
  UNOWN_V_177,
  MAWILE_V_178,
  HISUIAN_ARCANINE_V_179,
  SKUNTANK_V_180,
  SKUNTANK_V_181,
  MAGEARNA_V_182,
  REGIDRAGO_V_183,
  REGIDRAGO_V_184,
  LUGIA_V_185,
  LUGIA_V_186,
  HO_OH_V_187,
  BRANDON_188,
  CANDICE_189,
  FURISODE_GIRL_190,
  GYM_TRAINER_191,
  LANCE_192,
  SERENA_193,
  WALLACE_194,
  WORKER_195,
  SERPERIOR_VSTAR_196,
  ALOLAN_VULPIX_VSTAR_197,
  REGIELEKI_VMAX_198,
  UNOWN_VSTAR_199,
  MAWILE_VSTAR_200,
  REGIDRAGO_VSTAR_201,
  LUGIA_VSTAR_202,
  BRANDON_203,
  CANDICE_204,
  FURISODE_GIRL_205,
  LANCE_206,
  SERENA_207,
  WALLACE_208,
  WORKER_209,
  SERPERIOR_VSTAR_210,
  LUGIA_VSTAR_211,
  ENERGY_SWITCH_212,
  GAPEJAW_BOG_213,
  LEAFY_CAMO_PONCHO_214,
  V_GUARD_ENERGY_215,
  BRAIXEN_TG01,
  MILOTIC_TG02,
  FLAAFFY_TG03,
  JYNX_TG04,
  GARDEVOIR_TG05,
  MALAMAR_TG06,
  ROCKRUFF_TG07,
  PASSIMIAN_TG08,
  DRUDDIGON_TG09,
  SMEARGLE_TG10,
  ALTARIA_TG11,
  KRICKETUNE_V_TG12,
  SERPERIOR_V_TG13,
  BLAZIKEN_V_TG14,
  BLAZIKEN_VMAX_TG15,
  ZERAORA_V_TG16,
  MAWILE_V_TG17,
  CORVIKNIGHT_V_TG18,
  CORVIKNIGHT_VMAX_TG19,
  RAYQUAZA_VMAX_TG20,
  DURALUDON_VMAX_TG21,
  BLISSEY_V_TG22,
  FRIENDS_IN_GALAR_TG23,
  GORDIE_TG24,
  JUDGE_TG25,
  PROFESSOR_BURNET_TG26,
  RAIHAN_TG27,
  SORDWARD_SHIELBERT_TG28,
  RAYQUAZA_VMAX_TG29,
  DURALUDON_VMAX_TG30
;

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  @Override
  public String toEnumId() {
    return name()+":SILVER_TEMPEST";
  }

  @Override
  public Card getImplementation(EnhancedCardInfo stub) {
    switch (this) {


      case VENONAT_1: return cardng (stub) {
				moveAttack "Tackle", {
					// 20 damage.
					damage 20
				}
			}



      case VENOMOTH_2: return cardng (stub) {
				moveAttack "Miracle Powder", {
					// 30 damage. Flip a coin. If heads, choose a Special Condition. Your opponent's Active Pokémon is now affected by that Special Condition.
					damage 30
				}
				moveAttack "Gust", {
					// 70 damage.
					damage 70
				}
			}



      case SPINARAK_3: return cardng (stub) {
				moveAttack "Bug Bite", {
					// 30 damage.
					damage 30
				}
			}



      case ARIADOS_4: return cardng (stub) {
				bwAbility "Hidden Threads", {
					// Your opponent's Pokémon VSTAR's attacks cost [C] more. You can't apply more than 1 Hidden Threads Ability at a time.
					actionA {
					}
				}
				moveAttack "Pierce", {
					// 50 damage.
					damage 50
				}
			}



      case SUNKERN_5: return cardng (stub) {
				moveAttack "Seed Bomb", {
					// 20 damage.
					damage 20
				}
			}





      case SERPERIOR_V_7: return cardng (stub) {
				moveAttack "Noble Light", {
					// Heal 30 damage from each Pokémon (both yours and your opponent's).

				}
				moveAttack "Solar Beam", {
					// 120 damage.
					damage 120
				}
			}



      case SERPERIOR_VSTAR_8: return cardng (stub) {
				moveAttack "Regal Blender", {
					// 190 damage. You may move any amount of Energy from your Pokémon to your other Pokémon in any way you like.
					damage 190
				}
				moveAttack "Star Winder", {
					// 60x damage. This attack does 60 damage for each Energy attached to this Pokémon. Switch this Pokémon with 1 of your Benched Pokémon. (You can't use more than 1 VSTAR Power in a game.)
					damage 60
				}
			}



      case PETILIL_9: return cardng (stub) {
				moveAttack "Ram", {
					// 10 damage.
					damage 10
				}
				moveAttack "Flop", {
					// 20 damage.
					damage 20
				}
			}



      case HISUIAN_LILLIGANT_10: return cardng (stub) {
				moveAttack "Swelling Scent", {
					// Search your deck for up to 2 [G] Energy cards and attach them to your Benched Pokémon in any way you like. Then, shuffle your deck.

				}
				moveAttack "Spiral Kick", {
					// 50 damage.
					damage 50
				}
			}



      case FOONGUS_11: return cardng (stub) {
				moveAttack "Ram", {
					// 10 damage.
					damage 10
				}
			}



      case AMOONGUSS_12: return cardng (stub) {
			bwAbility "Surprise Spores", {
				// During your opponent's turn, if this Pokémon is discarded from your hand by an effect of an attack or Ability from your opponent's Pokémon, or by an effect of your opponent's Item or Supporter cards, discard your opponent's hand.
				// TODO: Implement complex discard trigger from hand
				delayedA {
					// This would need to trigger when discarded from hand by opponent effects
					// Complex implementation requiring discard event tracking
				}
			}
			moveAttack "Hypno Hammer", {
				// 50 damage. Your opponent's Active Pokémon is now Asleep.
				damage 50
				afterDamage {
					apply ASLEEP, defending
				}
			}
			}



      case DURANT_13: return cardng (stub) {
				moveAttack "Energy Digging", {
					// Search your deck for up to 2 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck.

				}
				moveAttack "Bite", {
					// 50 damage.
					damage 50
				}
			}



      case VIRIZION_14: return cardng (stub) {
				moveAttack "Four as One", {
					// 20+ damage. If Cobalion, Terrakion, and Keldeo are on your Bench, this attack does 70 more damage.
					damage 20
				}
				moveAttack "Leaf Drain", {
					// 50 damage. Heal 20 damage from this Pokémon.
					damage 50
				}
			}



      case CHESNAUGHT_V_15: return cardng (stub) {
				bwAbility "Needle Line", {
					// If your Active Chesnaught V is damaged by an attack from your opponent's Pokémon (even if it is Knocked Out), put 3 damage counters on the Attacking Pokémon.
					actionA {
					}
				}
				moveAttack "Touchdown", {
					// 130 damage. Heal 30 damage from this Pokémon.
					damage 130
				}
			}



      case RADIANT_TSAREENA_16: return cardng (stub) {
				bwAbility "Elegant Heal", {
					// Once during your turn, you may heal 20 damage from each of your Pokémon.
					actionA {
					}
				}
				moveAttack "Aroma Shot", {
					// 90 damage. This Pokémon recovers from all Special Conditions.
					damage 90
				}
			}



      case VULPIX_17: return cardng (stub) {
				moveAttack "Jump On", {
					// 10+ damage. Flip a coin. If heads, this attack does 20 more damage.
					damage 10
				}
			}



      case NINETALES_18: return cardng (stub) {
				moveAttack "Hypnotic Gaze", {
					// Your opponent's Active Pokémon is now Asleep.

				}
				moveAttack "Scorching Breath", {
					// 120 damage. During your next turn, this Pokémon can't attack.
					damage 120
				}
			}



      case GROWLITHE_19: return cardng (stub) {
				moveAttack "Flare", {
					// 10 damage.
					damage 10
				}
				moveAttack "Ram", {
					// 20 damage.
					damage 20
				}
			}



      case ARCANINE_20: return cardng (stub) {
				moveAttack "Flame Cloak", {
					// 30 damage. Attach a [R] Energy card from your discard pile to this Pokémon.
					damage 30
				}
				moveAttack "Fighting Tackle", {
					// 100+ damage. If your opponent's Active Pokémon is a Pokémon V, this attack does 100 more damage.
					damage 100
				}
			}



      case PONYTA_21: return cardng (stub) {
				moveAttack "Take Down", {
					// 50 damage. This Pokémon also does 10 damage to itself.
					damage 50
				}
			}





      case VICTINI_23: return cardng (stub) {
				moveAttack "Assisting Flame", {
					// 20 damage. Attach up to 2 [R] Energy cards from your discard pile to your Pokémon in any way you like.
					damage 20
				}
				moveAttack "Flare", {
					// 40 damage.
					damage 40
				}
			}



      case RESHIRAM_V_24: return cardng (stub) {
				moveAttack "Sparkling Wing", {
					// Search your deck for up to 2 basic Energy cards and attach them to 1 of your Pokémon. Then, shuffle your deck.

				}
				moveAttack "White Blaze", {
					// 200 damage. Flip a coin. If tails, during your next turn, this Pokémon can't attack.
					damage 200
				}
			}



      case FENNEKIN_25: return cardng (stub) {
				moveAttack "Lead", {
					// Search your deck for a Supporter card, reveal it, and put it into your hand. Then, shuffle your deck.

				}
				moveAttack "Live Coal", {
					// 10 damage.
					damage 10
				}
			}



      case BRAIXEN_26: return cardng (stub) {
				moveAttack "Combustion", {
					// 30 damage.
					damage 30
				}
				moveAttack "Flare Parade", {
					// 60x damage. This attack does 60 damage for each Serena card in your discard pile.
					damage 60
				}
			}



      case DELPHOX_27: return cardng (stub) {
				moveAttack "Flare Parade", {
					// 60x damage. This attack does 60 damage for each Serena card in your discard pile.
					damage 60
				}
				moveAttack "Energy Crush", {
					// 50x damage. This attack does 50 damage for each Energy attached to all of your opponent's Pokémon.
					damage 50
				}
			}



      case FLETCHINDER_28: return cardng (stub) {
				moveAttack "Steady Firebreathing", {
					// 30 damage.
					damage 30
				}
			}



      case TALONFLAME_29: return cardng (stub) {
				moveAttack "Quick Dive", {
					// This attack does 50 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Merciless Strike", {
					// 80+ damage. If your opponent's Active Pokémon already has any damage counters on it, this attack does 80 more damage.
					damage 80
				}
			}



      case LITTEN_30: return cardng (stub) {
				moveAttack "Gnaw", {
					// 10 damage.
					damage 10
				}
				moveAttack "Reprisal", {
					// 20x damage. This attack does 20 damage for each damage counter on this Pokémon.
					damage 20
				}
			}



      case TORRACAT_31: return cardng (stub) {
				moveAttack "Gritty Claws", {
					// 40 damage. During your opponent's next turn, if this Pokémon has full HP and would be Knocked Out by damage from an attack, it is not Knocked Out, and its remaining HP becomes 10.
					damage 40
				}
				moveAttack "Combustion", {
					// 70 damage.
					damage 70
				}
			}



      case INCINEROAR_32: return cardng (stub) {
				moveAttack "Secret Attack", {
					// Choose an attack from 1 of this Pokémon's previous Evolutions and use it as this attack.

				}
				moveAttack "Flare Shot", {
					// 180 damage. Discard all Energy from this Pokémon.
					damage 180
				}
			}



      case ALOLAN_VULPIX_V_33: return cardng (stub) {
				moveAttack "White Drop", {
					// 10+ damage. If your opponent's Active Pokémon is a Pokémon V, this attack does 50 more damage.
					damage 10
				}
				moveAttack "Frost Smash", {
					// 110 damage.
					damage 110
				}
			}



      case ALOLAN_VULPIX_VSTAR_34: return cardng (stub) {
				moveAttack "Snow Mirage", {
					// 160 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon. During your opponent's next turn, prevent all damage done to this Pokémon by attacks from Pokémon that have an Ability.
					swiftDamage 160, defending
          preventAllDamageFromCustomPokemonNextTurn thisMove, self, { it.hasModernAbility }
				}
				moveAttack "Silvery Snow Star", {
					// 70x damage. This attack does 70 damage for each of your opponent's Pokémon V in play. This damage isn't affected by Weakness or Resistance. (You can't use more than 1 VSTAR Power in a game.)
					damage 70
				}
			}



      case OMASTAR_V_35: return cardng (stub) {
				moveAttack "Primal Guidance", {
					// Search your deck for up to 2 Pokémon that evolve from an Item card that has "Fossil" in its name and put them onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Tentacle Lock", {
					// 110 damage. If the Defending Pokémon is an Evolution Pokémon, it can't attack during your opponent's next turn.
					damage 110
				}
			}



      case ARTICUNO_36: return cardng (stub) {
				moveAttack "Ice Wing", {
					// 20 damage.
					damage 20
				}
				moveAttack "Wild Freeze", {
					// 70 damage. This Pokémon also does 50 damage to itself. Your opponent's Active Pokémon is now Paralyzed.
					damage 70
				}
			}



      case WAILMER_37: return cardng (stub) {
				moveAttack "Gulp Down", {
					// 30 damage. Heal from this Pokémon the same amount of damage you did to your opponent's Active Pokémon.
					damage 30
				}
				moveAttack "Wave Splash", {
					// 60 damage.
					damage 60
				}
			}



      case WAILORD_38: return cardng (stub) {
				bwAbility "Jumbo-Sized", {
					// This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
					actionA {
					}
				}
				moveAttack "Special Wave", {
					// 120+ damage. If this Pokémon has any Special Energy attached, this attack does 120 more damage.
					damage 120
				}
			}



      case FEEBAS_39: return cardng (stub) {
				moveAttack "Ascension", {
					// Search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck.

				}
				moveAttack "Splash", {
					// 10 damage.
					damage 10
				}
			}



      case MILOTIC_40: return cardng (stub) {
				moveAttack "Water Arrow", {
					// This attack does 50 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Mellow Wave", {
					// 60 damage. Your opponent's Active Pokémon is now Asleep.
					damage 60
				}
			}



      case SNORUNT_41: return cardng (stub) {
				moveAttack "Collect", {
					// Draw a card.

				}
				moveAttack "Icy Snow", {
					// 20 damage.
					damage 20
				}
			}



      case GLALIE_42: return cardng (stub) {
				moveAttack "Bite", {
					// 60 damage.
					damage 60
				}
				moveAttack "Big Mouth", {
					// 130+ damage. If you played Candice from your hand during this turn, this attack does 130 more damage.
					damage 130
				}
			}



      case FROSLASS_43: return cardng (stub) {
				moveAttack "Frosty Jail", {
					// 20+ damage. If you played Candice from your hand during this turn, this attack does 90 more damage, and your opponent's Active Pokémon is now Paralyzed.
					damage 20
				}
				moveAttack "Frost Breath", {
					// 60 damage.
					damage 60
				}
			}



      case RELICANTH_44: return cardng (stub) {
				moveAttack "Fossil Finding", {
					// Shuffle up to 4 in any combination of Unidentified Fossil and Rare Fossil cards from your discard pile into your deck.

				}
				moveAttack "Water Pulse", {
					// 30 damage. Your opponent's Active Pokémon is now Asleep.
					damage 30
				}
			}



      case PHIONE_45: return cardng (stub) {
				moveAttack "Sea Feast", {
					// Search your deck for up to 3 Basic [W] Pokémon and put them onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Wave Splash", {
					// 20 damage.
					damage 20
				}
			}



      case KELDEO_46: return cardng (stub) {
				moveAttack "Wave Splash", {
					// 20 damage.
					damage 20
				}
				moveAttack "Four as One", {
					// 50+ damage. If Cobalion, Terrakion, and Virizion are on your Bench, this attack does 170 more damage.
					damage 50
				}
			}



      case DEWPIDER_47: return cardng (stub) {
				moveAttack "Hook", {
					// 30 damage.
					damage 30
				}
			}



      case ARAQUANID_48: return cardng (stub) {
				moveAttack "Drowning Ball", {
					// 20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed, and discard an Energy from that Pokémon.
					damage 20
				}
				moveAttack "Headbutt Bounce", {
					// 60 damage.
					damage 60
				}
			}



      case PIKACHU_49: return cardng (stub) {
				moveAttack "Pika Strike", {
					// 20+ damage. If 1 of your Dedenne used Dede-Short during your last turn, this attack does 180 more damage.
					damage 20
				}
			}



      case RAICHU_50: return cardng (stub) {
				moveAttack "Ambushing Spark", {
					// 40+ damage. If your opponent has used their VSTAR Power during this game, this attack does 100 more damage.
					damage 40
				}
				moveAttack "Electric Ball", {
					// 120 damage.
					damage 120
				}
			}



      case CHINCHOU_51: return cardng (stub) {
				moveAttack "Lightning Ball", {
					// 10 damage.
					damage 10
				}
				moveAttack "Gentle Slap", {
					// 20 damage.
					damage 20
				}
			}



      case LANTURN_52: return cardng (stub) {
				moveAttack "Ram", {
					// 30 damage.
					damage 30
				}
				moveAttack "Strong Volt", {
					// 160 damage. Discard 2 Energy from this Pokémon.
					damage 160
				}
			}



      case ROTOM_53: return cardng (stub) {
				moveAttack "Overhaul", {
					// Shuffle your hand into your deck. Then, draw 6 cards.

				}
				moveAttack "Mach Bolt", {
					// 80 damage.
					damage 80
				}
			}



      case EMOLGA_54: return cardng (stub) {
				moveAttack "Lucky Find", {
					// Search your deck for an Item card, reveal it, and put it into your hand. Then, shuffle your deck.

				}
				moveAttack "Static Shock", {
					// 40 damage.
					damage 40
				}
			}



      case STUNFISK_55: return cardng (stub) {
				moveAttack "Mud Shot", {
					// 30 damage.
					damage 30
				}
				moveAttack "Mystery Bolt", {
					// You can use this attack only if you have no Supporter cards in your discard pile. This attack does 100 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
			}



      case ZERAORA_56: return cardng (stub) {
				moveAttack "Battle Claw", {
					// 30+ damage. If your opponent's Active Pokémon is an Evolution Pokémon, this attack does 30 more damage.
					damage 30
				}
				moveAttack "Mach Bolt", {
					// 80 damage.
					damage 80
				}
			}





      case REGIELEKI_VMAX_58: return cardng (stub) {
				bwAbility "Transistor", {
					// Your Basic [L] Pokémon's attacks do 30 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance).
					actionA {
					}
				}
				moveAttack "Max Thunder and Lightning", {
					// 220 damage. During your next turn, this Pokémon can't attack.
					damage 220
				}
			}



      case RADIANT_ALAKAZAM_59: return cardng (stub) {
				bwAbility "Painful Spoons", {
					// Once during your turn, you may move up to 2 damage counters from 1 of your opponent's Pokémon to another of their Pokémon.
					actionA {
					}
				}
				moveAttack "Mind Ruler", {
					// 20x damage. This attack does 20 damage for each card in your opponent's hand.
					damage 20
				}
			}



      case DROWZEE_60: return cardng (stub) {
				moveAttack "Psypunch", {
					// 10 damage.
					damage 10
				}
				moveAttack "Hypnotic Ray", {
					// 20 damage. Your opponent's Active Pokémon is now Asleep.
					damage 20
				}
			}



      case HYPNO_61: return cardng (stub) {
				moveAttack "Psy Call", {
					// Search your deck for up to 2 Stage 1 Pokémon and put them onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Zen Headbutt", {
					// 90 damage.
					damage 90
				}
			}



      case JYNX_62: return cardng (stub) {
				bwAbility "Selfish Lips", {
					// If this Pokémon is Knocked Out by damage from an attack from your opponent's Pokémon V, your opponent can't take any Prize cards for it.
					actionA {
					}
				}
				moveAttack "Psychic Assault", {
					// 10+ damage. This attack does 10 more damage for each damage counter on your opponent's Active Pokémon.
					damage 10
				}
			}



      case MISDREAVUS_63: return cardng (stub) {
				moveAttack "Confuse Ray", {
					// 10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Confused.
					damage 10
				}
			}



      case MISMAGIUS_64: return cardng (stub) {
				bwAbility "Spiteful Magic", {
					// If this Pokémon has full HP and is Knocked Out by damage from an attack from your opponent's Pokémon, put 8 damage counters on the Attacking Pokémon.
					actionA {
					}
				}
				moveAttack "Eerie Voice", {
					// Put 2 damage counters on each of your opponent's Pokémon.

				}
			}



      case UNOWN_V_65: return cardng (stub) {
				moveAttack "Shady Stamp", {
					// 30 damage. Your opponent's Active Pokémon is now Confused.
					damage 30
				}
				moveAttack "Victory Symbol", {
					// If you use this attack when you have only 1 Prize card remaining, you win this game.

				}
			}



      case UNOWN_VSTAR_66: return cardng (stub) {
				moveAttack "Tri Power", {
					// 70x damage. Flip 3 coins. This attack does 70 damage for each heads.
					damage 70
				}
				moveAttack "Star Cipher", {
					// Until this Pokémon leaves play, it gains an Ability that has the effect "The Weakness of each of your opponent's Pokémon in play is now Psychic. (The amount of Weakness doesn't change.)" (You can't use more than 1 VSTAR Power in a game.)

				}
			}



      case RALTS_67: return cardng (stub) {
				moveAttack "Memory Skip", {
					// 10 damage. Choose 1 of your opponent's Active Pokémon's attacks. During your opponent's next turn, that Pokémon can't use that attack.
					damage 10
				}
			}





      case GARDEVOIR_69: return cardng (stub) {
				bwAbility "Refinement", {
					// You must discard a card from your hand in order to use this Ability. Once during your turn, you may draw 2 cards.
					actionA {
					}
				}
				moveAttack "Magical Shot", {
					// 120 damage.
					damage 120
				}
			}



      case MAWILE_V_70: return cardng (stub) {
				moveAttack "Pouty Slap", {
					// 30 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon.
					damage 30
				}
				moveAttack "Chomp Down", {
					// 100 damage. Discard a random card from your opponent's hand.
					damage 100
				}
			}



      case MAWILE_VSTAR_71: return cardng (stub) {
				bwAbility "Star Rondo", {
					// During your turn, if this Pokémon is on your Bench, you may switch it with your Active Pokémon. If you do, switch 1 of your opponent's Benched Pokémon with their Active Pokémon. (You can't use more than 1 VSTAR Power in a game.)
					actionA {
					}
				}
				moveAttack "Sudden Eater", {
					// 90+ damage. If this Pokémon moved from your Bench to the Active Spot this turn, this attack does 90 more damage.
					damage 90
				}
			}



      case MEDITITE_72: return cardng (stub) {
				bwAbility "Yoga Guard", {
					// As long as this Pokémon is on your Bench, prevent all damage done to this Pokémon by attacks (both yours and your opponent's).
					actionA {
					}
				}
				moveAttack "Psyshot", {
					// 20 damage.
					damage 20
				}
			}



      case MEDICHAM_73: return cardng (stub) {
				bwAbility "Chakra Awakening", {
					// If you have exactly 4 cards in your hand, this Pokémon's attacks cost [C][C][C] less.
					actionA {
					}
				}
				moveAttack "Vigorous Kick", {
					// 80+ damage. If your opponent has any Pokémon VMAX in play, this attack does 90 more damage.
					damage 80
				}
			}



      case CHIMECHO_74: return cardng (stub) {
				moveAttack "Dreaming Tone", {
					// During your opponent's next turn, if an Energy card is attached to the Defending Pokémon from your opponent's hand, that Pokémon will be Asleep.

				}
				moveAttack "Hang Down", {
					// 30 damage.
					damage 30
				}
			}



      case SIGILYPH_75: return cardng (stub) {
				moveAttack "Warning", {
					// Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck. If your opponent's Active Pokémon is a Pokémon V, you may put up to 5 Basic Pokémon onto your Bench in this way instead.

				}
				moveAttack "Cutting Wind", {
					// 70 damage.
					damage 70
				}
			}



      case SOLOSIS_76: return cardng (stub) {
				moveAttack "Ram", {
					// 20 damage.
					damage 20
				}
			}



      case DUOSION_77: return cardng (stub) {
				moveAttack "Cell Spear", {
					// 20 damage. Put 2 damage counters on 1 of your opponent's Benched Pokémon.
					damage 20
				}
			}



      case REUNICLUS_78: return cardng (stub) {
				bwAbility "Persistent Cells", {
					// If this Pokémon is Knocked Out by damage from an attack from your opponent's Pokémon, put it into your hand instead of the discard pile. (Discard all attached cards.)
					actionA {
					}
				}
				moveAttack "Cell Fork", {
					// 60 damage. Choose 2 of your opponent's Benched Pokémon and put 3 damage counters on each of them.
					damage 60
				}
			}



      case ELGYEM_79: return cardng (stub) {
				moveAttack "Headbutt", {
					// 20 damage.
					damage 20
				}
			}



      case BEHEEYEM_80: return cardng (stub) {
				moveAttack "Psychic Sphere", {
					// 30 damage.
					damage 30
				}
				moveAttack "Psychic Arrow", {
					// This attack does 60 damage to 1 of your opponent's Pokémon. Also apply Weakness and Resistance for Benched Pokémon.

				}
			}



      case ESPURR_81: return cardng (stub) {
				moveAttack "Mumble", {
					// 10 damage.
					damage 10
				}
				moveAttack "Gentle Slap", {
					// 20 damage.
					damage 20
				}
			}



      case MEOWSTIC_82: return cardng (stub) {
				bwAbility "Inviting Ears", {
					// When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may search your deck for up to 2 Supporter cards, reveal them, and put them into your hand. Then, shuffle your deck.
					actionA {
					}
				}
				moveAttack "Super Psy Bolt", {
					// 80 damage.
					damage 80
				}
			}



      case SWIRLIX_83: return cardng (stub) {
				moveAttack "Flop", {
					// 10 damage.
					damage 10
				}
				moveAttack "Tackle", {
					// 20 damage.
					damage 20
				}
			}



      case SLURPUFF_84: return cardng (stub) {
				moveAttack "Draining Kiss", {
					// 30 damage. Heal 30 damage from this Pokémon.
					damage 30
				}
				moveAttack "Magical Shot", {
					// 100 damage.
					damage 100
				}
			}



      case DEDENNE_85: return cardng (stub) {
				moveAttack "Tail Smack", {
					// 10 damage.
					damage 10
				}
				moveAttack "Dede-Short", {
					// 60 damage. You can use this attack only if 1 of your Togedemaru used Toge Dash during your last turn. Your opponent's Active Pokémon is now Paralyzed.
					damage 60
				}
			}



      case INDEEDEE_86: return cardng (stub) {
				moveAttack "Smart Service", {
					// If you go first, you can use this attack during your first turn. Search your deck for a card and put it into your hand. Then, shuffle your deck.

				}
				moveAttack "Smack", {
					// 40 damage.
					damage 40
				}
			}



      case DREEPY_87: return cardng (stub) {
				moveAttack "Reckless Charge", {
					// 30 damage. This Pokémon also does 10 damage to itself.
					damage 30
				}
			}



      case DRAKLOAK_88: return cardng (stub) {
				moveAttack "Spooky Shot", {
					// 40 damage.
					damage 40
				}
			}



      case DRAGAPULT_89: return cardng (stub) {
				moveAttack "Dragon Launcher", {
					// Discard a number of your Benched Dreepy up to the number of your opponent's Pokémon in play. Then, for each Dreepy you discarded in this way, choose 1 of your opponent's Pokémon and do 100 damage to it. You can't choose the same Pokémon more than once. This damage isn't affected by Weakness or Resistance.

				}
				moveAttack "Spooky Shot", {
					// 120 damage.
					damage 120
				}
			}



      case HISUIAN_ARCANINE_V_90: return cardng (stub) {
				bwAbility "Irresistible Force", {
					// As often as you like during your turn, you may move a [F] Energy from 1 of your other Pokémon to this Pokémon.
					actionA {
					}
				}
				moveAttack "Rock Bullet", {
					// 90+ damage. This attack does 30 more damage for each [F] Energy attached to this Pokémon.
					damage 90
				}
			}



      case PHANPY_91: return cardng (stub) {
				moveAttack "Knock Away", {
					// 10+ damage. Flip a coin. If heads, this attack does 20 more damage.
					damage 10
				}
			}



      case DONPHAN_92: return cardng (stub) {
				moveAttack "Overspin", {
					// 110 damage. If this Pokémon evolved during this turn, this attack does nothing.
					damage 110
				}
				moveAttack "Giant Fangs", {
					// 170 damage.
					damage 170
				}
			}



      case BALTOY_93: return cardng (stub) {
				moveAttack "Find a Friend", {
					// Search your deck for a Pokémon, reveal it, and put it into your hand. Then, shuffle your deck.

				}
				moveAttack "Slap", {
					// 10 damage.
					damage 10
				}
			}



      case CLAYDOL_94: return cardng (stub) {
				bwAbility "Mystery Charge", {
					// You can use this Ability only if you have no Supporter cards in your discard pile. Once during your turn, you may attach a [F] Energy card from your discard pile to 1 of your Pokémon.
					actionA {
					}
				}
				moveAttack "Spinning Attack", {
					// 70 damage.
					damage 70
				}
			}



      case ANORITH_95: return cardng (stub) {
				moveAttack "Fossil Drop", {
					// 30+ damage. You may discard an Unidentified Fossil card from your hand. If you do, this attack does 120 more damage.
					damage 30
				}
			}



      case ARMALDO_96: return cardng (stub) {
				moveAttack "Reaping Claw", {
					// If your opponent's Active Pokémon has 100 HP or less remaining, it is Knocked Out.

				}
				moveAttack "Boulder Crush", {
					// 160 damage.
					damage 160
				}
			}



      case TERRAKION_97: return cardng (stub) {
				moveAttack "Cavern Tackle", {
					// 120 damage. During your opponent's next turn, prevent all damage from attacks done to this Pokémon. If 1 of your Pokémon used Cavern Tackle during your last turn, this attack can't be used.
					damage 120
				}
			}



      case HAWLUCHA_98: return cardng (stub) {
				moveAttack "Allure", {
					// Draw 2 cards.

				}
				moveAttack "Acrobatics", {
					// 30+ damage. Flip 2 coins. This attack does 20 more damage for each heads.
					damage 30
				}
			}



      case SANDYGAST_99: return cardng (stub) {
				moveAttack "Corner", {
					// 10 damage. During your opponent's next turn, the Defending Pokémon can't retreat.
					damage 10
				}
			}



      case PALOSSAND_100: return cardng (stub) {
				moveAttack "Sandpot Trap", {
					// This attack does 30 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Land Crush", {
					// 120 damage.
					damage 120
				}
			}



      case STONJOURNER_101: return cardng (stub) {
				moveAttack "Rock Throw", {
					// 20 damage.
					damage 20
				}
				moveAttack "Mystery Press", {
					// 60+ damage. If you have no Supporter cards in your discard pile, this attack does 130 more damage.
					damage 60
				}
			}



      case URSALUNA_V_102: return cardng (stub) {
				bwAbility "Hard Coat", {
					// This Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance).
					actionA {
					}
				}
				moveAttack "Peat Shoulder", {
					// 220- damage. This attack does 10 less damage for each damage counter on this Pokémon.
					damage 220
				}
			}



      case ZUBAT_103: return cardng (stub) {
				moveAttack "Bite", {
					// 10 damage.
					damage 10
				}
			}



      case GOLBAT_104: return cardng (stub) {
				moveAttack "Bite", {
					// 30 damage.
					damage 30
				}
			}



      case CROBAT_105: return cardng (stub) {
				moveAttack "Venomous Fang", {
					// 50 damage. Your opponent's Active Pokémon is now Poisoned.
					damage 50
				}
				moveAttack "Critical Bite", {
					// This attack does 30 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) If 1 of your opponent's Pokémon is Knocked Out by damage from this attack, take 2 more Prize cards.

				}
			}



      case MURKROW_106: return cardng (stub) {
				moveAttack "Flock", {
					// Search your deck for up to 2 Murkrow and put them onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Peck", {
					// 10 damage.
					damage 10
				}
			}



      case HONCHKROW_107: return cardng (stub) {
				moveAttack "Triple Draw", {
					// Draw 3 cards.

				}
				moveAttack "Callous Wings", {
					// 120 damage. You may switch this Pokémon with 1 of your Benched Murkrow.
					damage 120
				}
			}



      case SKUNTANK_V_108: return cardng (stub) {
				moveAttack "Pursuit Blast", {
					// This attack does 30 damage to 1 of your opponent's Benched Pokémon. If that Pokémon retreated from the Active Spot during your opponent's last turn, this attack does 120 damage instead. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Shrieking Poison", {
					// 90 damage. Your opponent's Active Pokémon is now Confused and Poisoned.
					damage 90
				}
			}



      case CROAGUNK_109: return cardng (stub) {
				moveAttack "Corkscrew Punch", {
					// 30 damage.
					damage 30
				}
			}



      case TOXICROAK_110: return cardng (stub) {
				moveAttack "Pierce", {
					// 30 damage.
					damage 30
				}
				moveAttack "Diving Uppercut", {
					// 120 damage. During your opponent's next turn, this Pokémon takes 50 more damage from attacks (after applying Weakness and Resistance).
					damage 120
				}
			}



      case SANDILE_111: return cardng (stub) {
				moveAttack "Bite", {
					// 30 damage.
					damage 30
				}
			}



      case KROKOROK_112: return cardng (stub) {
				moveAttack "Crunch", {
					// 60 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon.
					damage 60
				}
			}



      case KROOKODILE_113: return cardng (stub) {
				bwAbility "Bully of the Sands", {
					// When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may discard a random card from your opponent's hand. If this Pokémon is your Active Pokémon and is Knocked Out by damage from an opponent's attack, you may discard a random card from your opponent's hand.
					actionA {
					}
				}
				moveAttack "Double-Edge", {
					// 160 damage. This Pokémon also does 30 damage to itself.
					damage 160
				}
			}



      case MAREANIE_114: return cardng (stub) {
				moveAttack "Poison Sting", {
					// Your opponent's Active Pokémon is now Poisoned.

				}
			}



      case TOXAPEX_115: return cardng (stub) {
				moveAttack "Venoshock", {
					// 10+ damage. If your opponent's Active Pokémon is Poisoned, this attack does 120 more damage.
					damage 10
				}
				moveAttack "Spike Shot", {
					// 90 damage.
					damage 90
				}
			}



      case MORPEKO_116: return cardng (stub) {
				moveAttack "Peko Blaster", {
					// You can use this attack only if 1 of your Dedenne used Dede-Short during your last turn. This attack does 60 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
			}



      case BELDUM_117: return cardng (stub) {
				moveAttack "Magnetic Lift", {
					// Search your deck for a card. Shuffle your deck, then put that card on top of it.

				}
				moveAttack "Tackle", {
					// 20 damage.
					damage 20
				}
			}



      case METANG_118: return cardng (stub) {
				moveAttack "Bullet Punch", {
					// 30+ damage. Flip 2 coins. This attack does 30 more damage for each heads.
					damage 30
				}
			}



      case METAGROSS_119: return cardng (stub) {
				bwAbility "Emergency Entry", {
					// Once during your turn, if you drew this Pokémon from your deck at the beginning of your turn and your Bench isn't full, before you put it into your hand, you may put it onto your Bench. If you do, draw 3 cards.
					actionA {
					}
				}
				moveAttack "Meteor Mash", {
					// 100 damage. During your next turn, this Pokémon's Meteor Mash attack does 100 more damage (before applying Weakness and Resistance).
					damage 100
				}
			}



      case RADIANT_JIRACHI_120: return cardng (stub) {
				bwAbility "Entrusted Wishes", {
					// If this Pokémon is in the Active Spot and is Knocked Out by damage from an attack from your opponent's Pokémon, search your deck for up to 3 cards and put them into your hand. Then, shuffle your deck.
					actionA {
					}
				}
				moveAttack "Astral Misfortune", {
					// Flip 2 coins. If both of them are heads, your opponent's Active Pokémon is Knocked Out.

				}
			}



      case FERROSEED_121: return cardng (stub) {
				moveAttack "Tackle", {
					// 10 damage.
					damage 10
				}
				moveAttack "Rolling Tackle", {
					// 20 damage.
					damage 20
				}
			}



      case FERROTHORN_122: return cardng (stub) {
				moveAttack "Spinning Attack", {
					// 50 damage.
					damage 50
				}
				moveAttack "Whip Smash", {
					// 130 damage.
					damage 130
				}
			}



      case KLINK_123: return cardng (stub) {
				moveAttack "Call Sign", {
					// Search your deck for a Pokémon, reveal it, and put it into your hand. Then, shuffle your deck.

				}
			}



      case KLANG_124: return cardng (stub) {
				moveAttack "Gear Grind", {
					// 80x damage. Flip 2 coins. This attack does 80 damage for each heads.
					damage 80
				}
			}



      case KLINKLANG_125: return cardng (stub) {
				bwAbility "Triple Gears", {
					// When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may search your deck for up to 3 basic Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck.
					actionA {
					}
				}
				moveAttack "Power Beam", {
					// 130 damage.
					damage 130
				}
			}



      case COBALION_126: return cardng (stub) {
				bwAbility "Justified Law", {
					// Your Basic Pokémon's attacks do 30 more damage to your opponent's Active [D] Pokémon (before applying Weakness and Resistance).
					actionA {
					}
				}
				moveAttack "Follow-Up", {
					// 30 damage. Choose up to 2 of your Benched Pokémon. For each of those Pokémon, search your deck for a basic Energy card and attach it to that Pokémon. Then, shuffle your deck.
					damage 30
				}
			}



      case TOGEDEMARU_127: return cardng (stub) {
				moveAttack "Toge Dash", {
					// 10 damage. Flip a coin. If heads, during your opponent's next turn, if this Pokémon is Knocked Out, your opponent can't take any Prize cards for it.
					damage 10
				}
			}



      case MAGEARNA_V_128: return cardng (stub) {
				moveAttack "Gear Throw", {
					// This attack does 30 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Special Laser", {
					// 100+ damage. If this Pokémon has any Special Energy attached, this attack does 120 more damage.
					damage 100
				}
			}



      case DRATINI_129: return cardng (stub) {
				moveAttack "Slam", {
					// 30x damage. Flip 2 coins. This attack does 30 damage for each heads.
					damage 30
				}
			}



      case DRAGONAIR_130: return cardng (stub) {
				moveAttack "Wrap", {
					// 30 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
					damage 30
				}
				moveAttack "Surf", {
					// 80 damage.
					damage 80
				}
			}



      case DRAGONITE_131: return cardng (stub) {
				moveAttack "Dragon Claw", {
					// 80 damage.
					damage 80
				}
				moveAttack "Energy Hurricane", {
					// 180 damage. Search your deck for up to 3 basic Energy cards and attach them to your Pokémon in any way you like. Then, shuffle your deck.
					damage 180
				}
			}



      case NOIBAT_132: return cardng (stub) {
				moveAttack "Flap", {
					// 10 damage.
					damage 10
				}
				moveAttack "Glide", {
					// 30 damage.
					damage 30
				}
			}



      case NOIVERN_133: return cardng (stub) {
				moveAttack "Radiant Hunt", {
					// Knock Out 1 of your opponent's Radiant Pokémon.

				}
				moveAttack "Seventh Echo", {
					// 70 damage. Draw cards until you have 7 cards in your hand.
					damage 70
				}
			}



      case ZYGARDE_134: return cardng (stub) {
				moveAttack "Shout of Power", {
					// 20 damage. Attach a basic Energy card from your discard pile to 1 of your Benched Pokémon.
					damage 20
				}
				moveAttack "Speed Attack", {
					// 70 damage.
					damage 70
				}
			}





      case REGIDRAGO_VSTAR_136: return cardng (stub) {
				bwAbility "Legacy Star", {
					// During your turn, you may discard the top 7 cards of your deck. Then, put up to 2 cards from your discard pile into your hand. (You can't use more than 1 VSTAR Power in a game.)
					actionA {
					}
				}
				moveAttack "Apex Dragon", {
					// Choose an attack from a [N] Pokémon in your discard pile and use it as this attack.

				}
			}



      case SMEARGLE_137: return cardng (stub) {
				moveAttack "Colorful Palette", {
					// Look at the top 5 cards of your deck. You may attach any number of basic Energy cards you find there to 1 of your Pokémon. Shuffle the other cards back into your deck.

				}
				moveAttack "Ram", {
					// 30 damage.
					damage 30
				}
			}



      case LUGIA_V_138: return cardng (stub) {
				moveAttack "Read the Wind", {
					// Discard a card from your hand. If you do, draw 3 cards.

				}
				moveAttack "Aero Dive", {
					// 130 damage. You may discard a Stadium in play.
					damage 130
				}
			}



      case LUGIA_VSTAR_139: return cardng (stub) {
				bwAbility "Summoning Star", {
					// During your turn, you may put up to 2 [C] Pokémon that don't have a Rule Box from your discard pile onto your Bench. (Pokémon V, Pokémon-GX, etc. have Rule Boxes.) (You can't use more than 1 VSTAR Power in a game.)
					actionA {
					}
				}
				moveAttack "Tempest Dive", {
					// 220 damage. You may discard a Stadium in play.
					damage 220
				}
			}



      case HO_OH_V_140: return cardng (stub) {
				bwAbility "Reviving Flame", {
					// Once during your turn, if this Pokémon is in your discard pile, you may put it onto your Bench. If you do, attach up to 4 basic Energy cards from your discard pile to this Pokémon. If you use this Ability, your turn ends.
					actionA {
					}
				}
				moveAttack "Rainbow Burn", {
					// 100+ damage. This attack does 30 more damage for each type of basic Energy attached to this Pokémon.
					damage 100
				}
			}



      case SPINDA_141: return cardng (stub) {
				moveAttack "Dizzying Spin", {
					// This attack does 10 damage to each of your opponent's Pokémon. Your opponent's Active Pokémon is now Confused. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
			}



      case SWABLU_142: return cardng (stub) {
				moveAttack "Continuous Spin", {
					// 20x damage. Flip a coin until you get tails. This attack does 20 damage for each heads.
					damage 20
				}
			}



      case ALTARIA_143: return cardng (stub) {
				moveAttack "Magical Echo", {
					// Move all damage counters from 1 of your Benched Pokémon to your opponent's Active Pokémon.

				}
				moveAttack "Blasting Wind", {
					// 90 damage.
					damage 90
				}
			}



      case BUNEARY_144: return cardng (stub) {
				moveAttack "Try Bouncing", {
					// 30 damage. Flip a coin. If tails, this attack does nothing.
					damage 30
				}
			}



      case LOPUNNY_145: return cardng (stub) {
				moveAttack "Smash Kick", {
					// 30 damage.
					damage 30
				}
				moveAttack "Double Kick", {
					// 100x damage. Flip 2 coins. This attack does 100 damage for each heads.
					damage 100
				}
			}



      case ARCHEN_146: return cardng (stub) {
				moveAttack "Flap", {
					// 30 damage.
					damage 30
				}
				moveAttack "Claw Slash", {
					// 80 damage.
					damage 80
				}
			}





      case RUFFLET_148: return cardng (stub) {
				moveAttack "Jump On", {
					// 10+ damage. Flip a coin. If heads, this attack does 30 more damage.
					damage 10
				}
			}



      case HISUIAN_BRAVIARY_149: return cardng (stub) {
				moveAttack "Eerie Cry", {
					// Put 3 damage counters on each of your opponent's Pokémon that has any damage counters on it.

				}
				moveAttack "Mind Bend", {
					// 80 damage. Your opponent's Active Pokémon is now Confused.
					damage 80
				}
			}



      case FLETCHLING_150: return cardng (stub) {
				moveAttack "Peck", {
					// 10 damage.
					damage 10
				}
			}



      case BRANDON_151: return cardng (stub) {
				// You can use this card only when it is the last card in your hand. Draw a card for each Benched Pokémon (both yours and your opponent's).
				onPlay {
				}
				playRequirement{
				}
			}



      case CANDICE_152: return cardng (stub) {
				// Look at the top 7 cards of your deck. You may reveal any number of [W] Pokémon and [W] Energy cards you find there and put them into your hand. Shuffle the other cards back into your deck.
				onPlay {
				}
				playRequirement{
				}
			}



      case CAPTURING_AROMA_153: return cardng (stub) {
				// Flip a coin. If heads, search your deck for an Evolution Pokémon, reveal it, and put it into your hand. If tails, search your deck for a Basic Pokémon, reveal it, and put it into your hand. Then, shuffle your deck.
				onPlay {
				}
				playRequirement{
				}
			}



      case EARTHEN_SEAL_STONE_154: return cardng (stub) {
				// The Pokémon V this card is attached to can use the VSTAR Power on this card. (You still need the necessary Energy to use this attack.)
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			}



      case EMERGENCY_JELLY_155: return cardng (stub) {
				// At the end of each turn, if the Pokémon this card is attached to has 30 HP or less remaining and has any damage counters on it, heal 120 damage from it. If you healed any damage in this way, discard this card.
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			}



      case FOREST_SEAL_STONE_156: return cardng (stub) {
				// The Pokémon V this card is attached to can use the VSTAR Power on this card.
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			}



      case FURISODE_GIRL_157: return cardng (stub) {
				// Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck. You may switch that Pokémon with your Active Pokémon.
				onPlay {
				}
				playRequirement{
				}
			}





      case LANCE_159: return cardng (stub) {
				// Search your deck for up to 3 [N] Pokémon, reveal them, and put them into your hand. Then, shuffle your deck.
				onPlay {
				}
				playRequirement{
				}
			}



      case LEAFY_CAMO_PONCHO_160: return cardng (stub) {
				// Whenever your opponent plays a Supporter card from their hand, prevent all effects of that card done to the Pokémon VSTAR or Pokémon VMAX this card is attached to.
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			}



      case PRIMORDIAL_ALTAR_161: return cardng (stub) {
				// Once during each player's turn, that player may look at the top card of their deck. They may discard that card.
				onPlay {
				}
				onRemoveFromPlay{
				}
			}



      case PROFESSOR_LAVENTON_162: return cardng (stub) {
				// Put up to 3 Pokémon that have "Hisuian" in their names from your discard pile into your hand.
				onPlay {
				}
				playRequirement{
				}
			}



      case QUAD_STONE_163: return cardng (stub) {
				// You may use 4 Quad Stone cards at once.• If you used 1 card, heal 10 damage from your Active Pokémon.• If you used 4 cards, heal all damage from each of your Pokémon. (This effect works one time for 4 cards.)
				onPlay {
				}
				playRequirement{
				}
			}



      case SERENA_164: return cardng (stub) {
				// Choose 1:• Discard up to 3 cards from your hand. (You must discard at least 1 card.) If you do, draw cards until you have 5 cards in your hand.• Switch 1 of your opponent's Benched Pokémon V with their Active Pokémon.
				onPlay {
				}
				playRequirement{
				}
			}





      case WALLACE_166: return cardng (stub) {
				// Draw 3 cards. Your opponent may draw a card. If they do, draw 1 more card.
				onPlay {
				}
				playRequirement{
				}
			}



      case WORKER_167: return cardng (stub) {
				// Draw 3 cards. Discard a Stadium in play.
				onPlay {
				}
				playRequirement{
				}
			}



      case REGENERATIVE_ENERGY_168: return cardng (stub) {
				// As long as this card is attached to a Pokémon, it provides [C] Energy. Whenever you play a Pokémon from your hand to evolve the Pokémon V this card is attached to, heal 100 damage from that Pokémon.
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			}



      case V_GUARD_ENERGY_169: return cardng (stub) {
				// As long as this card is attached to a Pokémon, it provides [C] Energy. The Pokémon this card is attached to takes 30 less damage from attacks from your opponent's Pokémon V (after applying Weakness and Resistance). This effect can't be applied more than once at a time to the same Pokémon.
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			}

























































































































































        default:
      return null;
    }
  }
}