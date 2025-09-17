package tcgwars.logic.impl.gen8


import static tcgwars.logic.card.Type.*
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*

import tcgwars.logic.card.*

/**
 * @author
 */
public enum CrownZenith implements ImplOnlyCardInfo {

  ODDISH_1,
  GLOOM_2,
  BELLOSSOM_3,
  TANGELA_4,
  TANGROWTH_5,
  SCYTHER_6,
  SUNKERN_7,
  YANMA_8,
  YANMEGA_9,
  KRICKETOT_10,
  CHERUBI_11,
  CARNIVINE_12,
  LEAFEON_V_13,
  LEAFEON_VSTAR_14,
  GRUBBIN_15,
  ZARUDE_16,
  CALYREX_17,
  CHARIZARD_V_18,
  CHARIZARD_VSTAR_19,
  RADIANT_CHARIZARD_20,
  ENTEI_21,
  SIMISEAR_V_22,
  SIMISEAR_VSTAR_23,
  LARVESTA_24,
  VOLCARONA_25,
  VOLCANION_26,
  SALANDIT_27,
  SALAZZLE_28,
  SEEL_29,
  GALARIAN_MR_MIME_30,
  WAILMER_31,
  WAILORD_32,
  CORPHISH_33,
  SNORUNT_34,
  LUVDISC_35,
  KYOGRE_36,
  KYOGRE_V_37,
  GLACEON_V_38,
  SHINX_39,
  SHINX_40,
  LUXIO_41,
  LUXIO_42,
  LUXRAY_43,
  LUXRAY_44,
  ROTOM_V_45,
  ROTOM_VSTAR_46,
  EMOLGA_47,
  EELEKTRIK_48,
  HELIOPTILE_49,
  HELIOLISK_50,
  RADIANT_CHARJABUG_51,
  ZERAORA_52,
  ZERAORA_V_53,
  ZERAORA_VMAX_54,
  ZERAORA_VSTAR_55,
  PINCURCHIN_56,
  EXEGGCUTE_57,
  EXEGGUTOR_58,
  MEWTWO_59,
  MEW_V_60,
  GIRAFARIG_61,
  LUNATONE_62,
  DUSCLOPS_63,
  TAPU_LELE_64,
  HATTERENE_V_65,
  HATTERENE_VMAX_66,
  ENAMORUS_67,
  GRAVELER_68,
  SOLROCK_69,
  BALTOY_70,
  RIOLU_71,
  PANCHAM_72,
  ROCKRUFF_73,
  LYCANROC_74,
  KOFFING_75,
  ABSOL_76,
  PURRLOIN_77,
  LIEPARD_78,
  KROKOROK_79,
  PANGORO_80,
  SKRELP_81,
  DRAGALGE_82,
  HOOPA_83,
  GALARIAN_MEOWTH_84,
  GALARIAN_PERRSERKER_85,
  SCIZOR_86,
  ARON_87,
  LAIRON_88,
  AGGRON_89,
  METANG_90,
  PAWNIARD_91,
  PAWNIARD_92,
  BISHARP_93,
  ZACIAN_94,
  ZACIAN_V_95,
  ZACIAN_VSTAR_96,
  ZAMAZENTA_97,
  ZAMAZENTA_V_98,
  ZAMAZENTA_VSTAR_99,
  RAYQUAZA_V_100,
  RAYQUAZA_VMAX_101,
  RAYQUAZA_VMAX_102,
  DURALUDON_V_103,
  DURALUDON_VMAX_104,
  RADIANT_ETERNATUS_105,
  TAUROS_106,
  DITTO_107,
  EEVEE_V_108,
  SNORLAX_109,
  STARLY_110,
  BIDOOF_111,
  CHATOT_112,
  REGIGIGAS_V_113,
  REGIGIGAS_VSTAR_114,
  SHAYMIN_115,
  STOUTLAND_V_116,
  YUNGOOS_117,
  GUMSHOOS_118,
  ORANGURU_119,
  GREEDENT_V_120,
  WOOLOO_121,
  DUBWOOL_122,
  BEA_123,
  BEDE_124,
  CRUSHING_HAMMER_125,
  DIGGING_DUO_126,
  ENERGY_RETRIEVAL_127,
  ENERGY_SEARCH_128,
  ENERGY_SWITCH_129,
  FRIENDS_IN_HISUI_130,
  FRIENDS_IN_SINNOH_131,
  GREAT_BALL_132,
  HOP_133,
  LEON_134,
  LOST_VACUUM_135,
  NESSA_136,
  POKE_BALL_137,
  POKEMON_CATCHER_138,
  POTION_139,
  RAIHAN_140,
  RARE_CANDY_141,
  RESCUE_CARRIER_142,
  SKY_SEAL_STONE_143,
  SWITCH_144,
  TREKKING_SHOES_145,
  ULTRA_BALL_146,
  ELESA_S_SPARKLE_147,
  FRIENDS_IN_HISUI_148,
  FRIENDS_IN_SINNOH_149,
  PROFESSOR_S_RESEARCH_150,
  VOLO_151,
  GRASS_ENERGY_152,
  FIRE_ENERGY_153,
  WATER_ENERGY_154,
  LIGHTNING_ENERGY_155,
  PSYCHIC_ENERGY_156,
  FIGHTING_ENERGY_157,
  DARKNESS_ENERGY_158,
  METAL_ENERGY_159,
  PIKACHU_160,
  HISUIAN_VOLTORB_GG01,
  KRICKETUNE_GG02,
  MAGMORTAR_GG03,
  ORICORIO_GG04,
  LAPRAS_GG05,
  MANAPHY_GG06,
  KELDEO_GG07,
  ELECTIVIRE_GG08,
  TOXTRICITY_GG09,
  MEW_GG10,
  LUNATONE_GG11,
  DEOXYS_GG12,
  DIANCIE_GG13,
  COMFEY_GG14,
  SOLROCK_GG15,
  ABSOL_GG16,
  THIEVUL_GG17,
  MAGNEZONE_GG18,
  ALTARIA_GG19,
  LATIAS_GG20,
  HISUIAN_GOODRA_GG21,
  DITTO_GG22,
  DUNSPARCE_GG23,
  MILTANK_GG24,
  BIBAREL_GG25,
  RIOLU_GG26,
  SWABLU_GG27,
  DUSKULL_GG28,
  BIDOOF_GG29,
  PIKACHU_GG30,
  TURTWIG_GG31,
  PARAS_GG32,
  POOCHYENA_GG33,
  MAREEP_GG34,
  LEAFEON_VSTAR_GG35,
  ENTEI_V_GG36,
  SIMISEAR_VSTAR_GG37,
  SUICUNE_V_GG38,
  LUMINEON_V_GG39,
  GLACEON_VSTAR_GG40,
  RAIKOU_V_GG41,
  ZERAORA_VMAX_GG42,
  ZERAORA_VSTAR_GG43,
  MEWTWO_VSTAR_GG44,
  DEOXYS_VMAX_GG45,
  DEOXYS_VSTAR_GG46,
  HATTERENE_VMAX_GG47,
  ZACIAN_V_GG48,
  DRAPION_V_GG49,
  DARKRAI_VSTAR_GG50,
  HISUIAN_SAMUROTT_V_GG51,
  HISUIAN_SAMUROTT_VSTAR_GG52,
  HOOPA_V_GG53,
  ZAMAZENTA_V_GG54,
  REGIGIGAS_VSTAR_GG55,
  HISUIAN_ZOROARK_VSTAR_GG56,
  ADAMAN_GG57,
  CHEREN_S_CARE_GG58,
  COLRESS_S_EXPERIMENT_GG59,
  CYNTHIA_S_AMBITION_GG60,
  GARDENIA_S_VIGOR_GG61,
  GRANT_GG62,
  IRIDA_GG63,
  MELONY_GG64,
  RAIHAN_GG65,
  ROXANNE_GG66,
  ORIGIN_FORME_PALKIA_VSTAR_GG67,
  ORIGIN_FORME_DIALGA_VSTAR_GG68,
  GIRATINA_VSTAR_GG69,
  ARCEUS_VSTAR_GG70
;

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  @Override
  public String toEnumId() {
    return name()+":CROWN_ZENITH";
  }

  @Override
  public Card getImplementation(EnhancedCardInfo stub) {
    switch (this) {


      case ODDISH_1: return cardng (stub) {
				moveAttack "Leaf Boomerang", {
					// 10x damage. Flip 2 coins. This attack does 10 damage for each heads.
					damage 10
				}
			}



      case GLOOM_2: return cardng (stub) {
				moveAttack "Offensive Scent", {
					// 20 damage. Your opponent's Active Pokémon is now Confused and Poisoned.
					damage 20
				}
			}



      case BELLOSSOM_3: return cardng (stub) {
				moveAttack "Flower Spin", {
					// 80x damage. Flip 3 coins. This attack does 80 damage for each heads. Switch this Pokémon with 1 of your Benched Pokémon.
					damage 80
				}
			}



      case TANGELA_4: return cardng (stub) {
				moveAttack "Beat", {
					// 10 damage.
					damage 10
				}
				moveAttack "Vine Whip", {
					// 60 damage.
					damage 60
				}
			}



      case TANGROWTH_5: return cardng (stub) {
				moveAttack "Suctioning Vines", {
					// 50 damage. Heal 30 damage from this Pokémon.
					damage 50
				}
				moveAttack "Hammer In", {
					// 130 damage.
					damage 130
				}
			}



      case SCYTHER_6: return cardng (stub) {
				moveAttack "Mach Cut", {
					// 10 damage. Discard a Special Energy from your opponent's Active Pokémon.
					damage 10
				}
			}





      case YANMA_8: return cardng (stub) {
				moveAttack "Swoop Across", {
					// This attack does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Cutting Wind", {
					// 70 damage.
					damage 70
				}
			}



      case YANMEGA_9: return cardng (stub) {
				moveAttack "Shoot Through", {
					// 20 damage. This attack also does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 20
				}
				moveAttack "Jet Wing", {
					// 160 damage. During your next turn, this Pokémon can't attack.
					damage 160
				}
			}







      case CARNIVINE_12: return cardng (stub) {
				moveAttack "Festering Saliva", {
					// Your opponent's Active Pokémon is now Burned and Poisoned.

				}
				moveAttack "Bind Down", {
					// 40 damage. During your opponent's next turn, the Defending Pokémon can't retreat.
					damage 40
				}
			}









      case ZARUDE_16: return cardng (stub) {
				moveAttack "Drag Off", {
					// Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. This attack does 20 damage to the new Active Pokémon.

				}
				moveAttack "Triple Whip", {
					// 70x damage. Flip 3 coins. This attack does 70 damage for each heads.
					damage 70
				}
			}



      case CALYREX_17: return cardng (stub) {
				moveAttack "King's Instructions", {
					// 30 damage. You may search your deck for up to 2 cards and put them into your hand. Then, shuffle your deck.
					damage 30
				}
				moveAttack "Bloomshine", {
					// 90 damage. Heal 20 damage from each of your Pokémon.
					damage 90
				}
			}









      case ENTEI_21: return cardng (stub) {
			bwAbility "Explosive Heat Dash", {
				// If this Pokémon has any [R] Energy attached, it has no Retreat Cost.
				getterA(GET_RETREAT_COST, self) { h ->
					if (self.cards.energyCount(R) > 0) {
						h.object = 0
					}
				}
			}
				moveAttack "Claw Slash", {
					// 90 damage.
					damage 90
				}
			}





      case SIMISEAR_VSTAR_23: return cardng (stub) {
				moveAttack "Fireball Fever", {
					// 40+ damage. You may discard up to 5 cards from the top of your deck. This attack does 40 more damage for each card you discarded in this way.
					damage 40
				}
				moveAttack "Ember Star", {
					// 30x damage. This attack does 30 damage for each Energy card in your discard pile. (You can't use more than 1 VSTAR Power in a game.)
					damage 30
				}
			}



      case LARVESTA_24: return cardng (stub) {
				moveAttack "Live Coal", {
					// 20 damage.
					damage 20
				}
			}



      case VOLCARONA_25: return cardng (stub) {
				moveAttack "Will-O-Wisp", {
					// 40 damage.
					damage 40
				}
				moveAttack "Volcanic Heat", {
					// 120 damage. During your next turn, this Pokémon can't attack.
					damage 120
				}
			}



      case VOLCANION_26: return cardng (stub) {
				moveAttack "Hammer In", {
					// 30 damage.
					damage 30
				}
				moveAttack "Hydro Burn", {
					// 80+ damage. If this Pokémon has any [W] Energy attached, this attack does 80 more damage.
					damage 80
				}
			}



      case SALANDIT_27: return cardng (stub) {
				moveAttack "Call for Family", {
					// Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Scratch", {
					// 10 damage.
					damage 10
				}
			}



      case SALAZZLE_28: return cardng (stub) {
				moveAttack "Tail Trickery", {
					// 20 damage. Your opponent's Active Pokémon is now Confused.
					damage 20
				}
				moveAttack "Super Singe", {
					// 60 damage. Your opponent's Active Pokémon is now Burned.
					damage 60
				}
			}







      case WAILMER_31: return cardng (stub) {
				moveAttack "Nap", {
					// Heal 30 damage from this Pokémon.

				}
				moveAttack "Water Gun", {
					// 70 damage.
					damage 70
				}
			}



      case WAILORD_32: return cardng (stub) {
				moveAttack "Bubble Drain", {
					// 80 damage. Heal 30 damage from this Pokémon.
					damage 80
				}
				moveAttack "Heavy Impact", {
					// 180 damage.
					damage 180
				}
			}







      case LUVDISC_35: return cardng (stub) {
				moveAttack "Emotional Draw", {
					// Shuffle your hand into your deck. Then, draw 5 cards.

				}
				moveAttack "Tackle", {
					// 20 damage.
					damage 20
				}
			}



      case KYOGRE_36: return cardng (stub) {
				moveAttack "Wave Summoning", {
					// Search your deck for a [W] Energy card and attach it to this Pokémon. Then, shuffle your deck.

				}
				moveAttack "Dynamic Wave", {
					// Put 3 Energy attached to this Pokémon into your hand. This attack does 180 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
			}



      case KYOGRE_V_37: return cardng (stub) {
				moveAttack "Dual Splash", {
					// This attack does 50 damage to 2 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Aqua Typhoon", {
					// 210 damage. During your next turn, this Pokémon can't use Aqua Typhoon.
					damage 210
				}
			}







      case SHINX_40: return cardng (stub) {
				moveAttack "Thunder Jolt", {
					// 30 damage. This Pokémon also does 10 damage to itself.
					damage 30
				}
			}





      case LUXIO_42: return cardng (stub) {
				moveAttack "Shorting Spark", {
					// This attack does 90 damage to each of your opponent's Pokémon that has a Pokémon Tool attached. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Bite", {
					// 40 damage.
					damage 40
				}
			}





      case LUXRAY_44: return cardng (stub) {
			bwAbility "Explosiveness", {
				// If this Pokémon is in your hand when you are setting up to play, you may put it face down as your Active Pokémon.
        // Implementation is in BeginGame
			}
			moveAttack "Seeking Fang", {
				// 50 damage. Search your deck for up to 2 Trainer cards, reveal them, and put them into your hand. Then, shuffle your deck.
				damage 50
				afterDamage {
          if (my.deck) {
            my.deck.search(max: 2, "Search for up to 2 Trainer cards", {it.cardTypes.is(TRAINER)}).moveTo(my.hand)
            shuffleDeck()
  				}
        }
			}
			}





      case ROTOM_VSTAR_46: return cardng (stub) {
				bwAbility "Conversion Star", {
					// During your turn, you may use this Ability. Discard any number of cards from your hand. Then, draw that many cards. (You can't use more than 1 VSTAR Power in a game.)
					actionA {
					}
				}
				moveAttack "Scrap Pulse", {
					// 80+ damage. Put any number of Pokémon Tool cards from your discard pile in the Lost Zone. This attack does 40 more damage for each card you put in the Lost Zone in this way.
					damage 80
				}
			}







      case HELIOPTILE_49: return cardng (stub) {
				moveAttack "Static Shock", {
					// 10 damage.
					damage 10
				}
				moveAttack "Rear Kick", {
					// 20 damage.
					damage 20
				}
			}



      case HELIOLISK_50: return cardng (stub) {
				moveAttack "Static Shock", {
					// 30 damage.
					damage 30
				}
				moveAttack "Wild Charge", {
					// 150 damage. This Pokémon also does 50 damage to itself.
					damage 150
				}
			}



      case RADIANT_CHARJABUG_51: return cardng (stub) {
				bwAbility "Shocking Block", {
					// Whenever any player attaches an Energy card from their hand to 1 of their Pokémon V, put 2 damage counters on that Pokémon.
					actionA {
					}
				}
				moveAttack "Linear Attack", {
					// This attack does 30 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
			}











      case PINCURCHIN_56: return cardng (stub) {
				moveAttack "Call for Family", {
					// Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck.

				}
				moveAttack "Continuous Tumble", {
					// 30+ damage. Flip a coin until you get tails. This attack does 30 more damage for each heads.
					damage 30
				}
			}



      case EXEGGCUTE_57: return cardng (stub) {
				moveAttack "Psy Bolt", {
					// 20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
					damage 20
				}
			}



      case EXEGGUTOR_58: return cardng (stub) {
				moveAttack "Powerful Storm", {
					// This attack does 20 damage for each Energy attached to all of your Pokémon.

				}
				moveAttack "Stampede", {
					// 100 damage.
					damage 100
				}
			}



      case MEWTWO_59: return cardng (stub) {
				moveAttack "Psypump", {
					// Attach up to 2 [P] Energy cards from your discard pile to 1 of your Pokémon.

				}
				moveAttack "Limit Break", {
					// 90+ damage. If your opponent has 3 or fewer Prize cards remaining, this attack does 90 more damage.
					damage 90
				}
			}





      case GIRAFARIG_61: return cardng (stub) {
				moveAttack "Double Draw", {
					// Draw 2 cards.

				}
				moveAttack "Psybeam", {
					// 30 damage. Your opponent's Active Pokémon is now Confused.
					damage 30
				}
			}







      case TAPU_LELE_64: return cardng (stub) {
				moveAttack "Energy Burst", {
					// 20x damage. This attack does 20 damage for each Energy attached to both Active Pokémon.
					damage 20
				}
				moveAttack "Spiral Drain", {
					// 100 damage. Heal 30 damage from this Pokémon.
					damage 100
				}
			}



      case HATTERENE_V_65: return cardng (stub) {
				moveAttack "Horoscope", {
					// Look at the top 3 cards of your deck. You may attach any number of Energy cards you find there to this Pokémon. Put the other cards back in any order.

				}
				moveAttack "Teleportation Burst", {
					// 80 damage. Switch this Pokémon with 1 of your Benched Pokémon.
					damage 80
				}
			}



      case HATTERENE_VMAX_66: return cardng (stub) {
				bwAbility "Witch's Domain", {
					// Once during your turn, you may move up to 2 damage counters from your Pokémon to your opponent's Active Pokémon.
					actionA {
					}
				}
				moveAttack "G-Max Smite", {
					// 150 damage. Your opponent's Active Pokémon is now Confused.
					damage 150
				}
			}



      case ENAMORUS_67: return cardng (stub) {
				moveAttack "Draining Kiss", {
					// 20 damage. Heal 20 damage from this Pokémon.
					damage 20
				}
				moveAttack "Loving Sympathy", {
					// 70+ damage. If you have the same number of cards in your hand as your opponent, this attack does 70 more damage.
					damage 70
				}
			}











      case PANCHAM_72: return cardng (stub) {
				moveAttack "Chop", {
					// 30 damage.
					damage 30
				}
			}



      case ROCKRUFF_73: return cardng (stub) {
				moveAttack "Invite Out", {
					// Flip a coin. If heads, switch 1 of your opponent's Benched Pokémon with their Active Pokémon.

				}
				moveAttack "Smash Kick", {
					// 20 damage.
					damage 20
				}
			}



      case LYCANROC_74: return cardng (stub) {
				moveAttack "Midnight Fang", {
					// 240- damage. This attack does 80 less damage for each Energy attached to your opponent's Active Pokémon.
					damage 240
				}
			}





      case ABSOL_76: return cardng (stub) {
				moveAttack "Slash", {
					// 30 damage.
					damage 30
				}
				moveAttack "Lost Claw", {
					// 70 damage. Put a random card from your opponent's hand in the Lost Zone.
					damage 70
				}
			}



      case PURRLOIN_77: return cardng (stub) {
				moveAttack "Fury Swipes", {
					// 10x damage. Flip 3 coins. This attack does 10 damage for each heads.
					damage 10
				}
			}



      case LIEPARD_78: return cardng (stub) {
				moveAttack "Fury Swipes", {
					// 40x damage. Flip 3 coins. This attack does 40 damage for each heads.
					damage 40
				}
				moveAttack "Claw Slash", {
					// 110 damage.
					damage 110
				}
			}





      case PANGORO_80: return cardng (stub) {
				moveAttack "Corkscrew Punch", {
					// 60 damage.
					damage 60
				}
				moveAttack "Wild Tackle", {
					// 160 damage. This Pokémon also does 30 damage to itself.
					damage 160
				}
			}



      case SKRELP_81: return cardng (stub) {
				moveAttack "Tackle", {
					// 10 damage.
					damage 10
				}
				moveAttack "Melt", {
					// 20 damage.
					damage 20
				}
			}



      case DRAGALGE_82: return cardng (stub) {
				moveAttack "Rocket Poison", {
					// Your opponent's Active Pokémon is now Poisoned. If this Pokémon evolved from Skrelp during this turn, put 8 damage counters on that Pokémon instead of 1 during Pokémon Checkup.

				}
				moveAttack "Razor Fin", {
					// 60 damage.
					damage 60
				}
			}





      case GALARIAN_MEOWTH_84: return cardng (stub) {
				moveAttack "Fasten Claws", {
					// 10+ damage. Flip a coin. If heads, this attack does 20 more damage.
					damage 10
				}
			}



      case GALARIAN_PERRSERKER_85: return cardng (stub) {
				moveAttack "Sharp Claws", {
					// 30+ damage. Flip a coin. If heads, this attack does 60 more damage.
					damage 30
				}
				moveAttack "Slash", {
					// 90 damage.
					damage 90
				}
			}



      case SCIZOR_86: return cardng (stub) {
				moveAttack "X-Scissor", {
					// 30+ damage. Flip a coin. If heads, this attack does 30 more damage.
					damage 30
				}
				moveAttack "Dangerous Claws", {
					// 80+ damage. If your opponent's Active Pokémon is a Basic Pokémon, this attack does 80 more damage.
					damage 80
				}
			}



      case ARON_87: return cardng (stub) {
				moveAttack "Ram", {
					// 10 damage.
					damage 10
				}
				moveAttack "Slight Intrusion", {
					// 30 damage. This Pokémon also does 10 damage to itself.
					damage 30
				}
			}



      case LAIRON_88: return cardng (stub) {
				moveAttack "Confront", {
					// 40 damage.
					damage 40
				}
				moveAttack "Wreak Havoc", {
					// 80 damage. Flip a coin until you get tails. For each heads, discard the top card of your opponent's deck.
					damage 80
				}
			}



      case AGGRON_89: return cardng (stub) {
				moveAttack "Counter Press", {
					// 90 damage. During your opponent's next turn, if this Pokémon is damaged by an attack (even if this Pokémon is Knocked Out), put damage counters on the Attacking Pokémon equal to the damage done to this Pokémon.
					damage 90
				}
				moveAttack "Heavy Impact", {
					// 180 damage.
					damage 180
				}
			}







      case PAWNIARD_92: return cardng (stub) {
				moveAttack "Pierce", {
					// 20 damage.
					damage 20
				}
			}



      case BISHARP_93: return cardng (stub) {
				moveAttack "Spike Draw", {
					// 20 damage. Draw 2 cards.
					damage 20
				}
				moveAttack "Power Edge", {
					// 70 damage.
					damage 70
				}
			}



      case ZACIAN_94: return cardng (stub) {
				moveAttack "Battle Legion", {
					// 20+ damage. This attack does 10 more damage for each of your Benched Pokémon. This attack's damage isn't affected by Weakness or by any effects on your opponent's Active Pokémon.
					damage 20
				}
				moveAttack "Slicing Blade", {
					// 100 damage.
					damage 100
				}
			}



      case ZACIAN_V_95: return cardng (stub) {
				moveAttack "Piercing Strike", {
					// 40 damage. This attack's damage isn't affected by Weakness or Resistance, or by any effects on your opponent's Active Pokémon.
					damage 40
				}
				moveAttack "Behemoth Blade", {
					// 100+ damage. If your opponent's Active Pokémon is a Pokémon VMAX, this attack does 160 more damage.
					damage 100
				}
			}



      case ZACIAN_VSTAR_96: return cardng (stub) {
				moveAttack "Break Edge", {
					// 200 damage. This attack's damage isn't affected by Weakness or Resistance, or by any effects on your opponent's Active Pokémon.
					damage 200
				}
				moveAttack "Sword Star", {
					// 310 damage. This Pokémon also does 30 damage to itself. (You can't use more than 1 VSTAR Power in a game.)
					damage 310
				}
			}



      case ZAMAZENTA_97: return cardng (stub) {
				bwAbility "Metal Shield", {
					// If this Pokémon has any Energy attached, it takes 30 less damage from attacks (after applying Weakness and Resistance).
					actionA {
					}
				}
				moveAttack "Retaliate", {
					// 100+ damage. If any of your Pokémon were Knocked Out during your opponent's last turn, this attack does 120 more damage.
					damage 100
				}
			}





      case ZAMAZENTA_VSTAR_99: return cardng (stub) {
				bwAbility "Shield Star", {
					// During your turn, you may use this Ability. During your opponent's next turn, all of your Pokémon take 100 less damage from attacks from your opponent's Pokémon (after applying Weakness and Resistance). (This includes Pokémon that come into play during this turn or during your opponent's next turn.) (You can't use more than 1 VSTAR Power in a game.)
					actionA {
					}
				}
				moveAttack "Giga Impact", {
					// 220 damage. During your next turn, this Pokémon can't attack.
					damage 220
				}
			}













      case RADIANT_ETERNATUS_105: return cardng (stub) {
				bwAbility "Climactic Gate", {
					// When you play this Pokémon from your hand onto your Bench during your turn, you may search your deck for up to 2 Pokémon VMAX and put them onto your Bench. Then, shuffle your deck. If you use this Ability, your turn ends.
					actionA {
					}
				}
				moveAttack "Power Beam", {
					// 200 damage.
					damage 200
				}
			}



      case TAUROS_106: return cardng (stub) {
				moveAttack "Smash Kick", {
					// 30 damage.
					damage 30
				}
				moveAttack "Adrena-Tackle", {
					// If this Pokémon has no damage counters on it, this attack does nothing.

				}
			}





      case EEVEE_V_108: return cardng (stub) {
				moveAttack "Tackle", {
					// 30 damage.
					damage 30
				}
				moveAttack "Vee Brave", {
					// 80+ damage. If your opponent's Active Pokémon is a Pokémon V, this attack does 80 more damage.
					damage 80
				}
			}







      case BIDOOF_111: return cardng (stub) {
				bwAbility "Carefree Countenance", {
					// As long as this Pokémon is on your Bench, prevent all damage done to this Pokémon by attacks (both yours and your opponent's).
					actionA {
					}
				}
				moveAttack "Hyper Fang", {
					// 30 damage. Flip a coin. If tails, this attack does nothing.
					damage 30
				}
			}



      case CHATOT_112: return cardng (stub) {
				moveAttack "Cycle Draw", {
					// Discard a card from your hand. If you do, draw 2 cards.

				}
				moveAttack "Flap", {
					// 10 damage.
					damage 10
				}
			}



      case REGIGIGAS_V_113: return cardng (stub) {
				moveAttack "Hammer In", {
					// 50 damage.
					damage 50
				}
				moveAttack "Angry Whack", {
					// 100+ damage. This attack does 10 more damage for each damage counter on this Pokémon. This Pokémon is now Confused.
					damage 100
				}
			}



      case REGIGIGAS_VSTAR_114: return cardng (stub) {
				bwAbility "Star Guardian", {
					// During your turn, if your opponent has exactly 1 Prize card remaining, you may choose 1 of your opponent's Benched Pokémon. They discard that Pokémon and all attached cards. (You can't use more than 1 VSTAR Power in a game.)
					actionA {
					}
				}
				moveAttack "Giga Impact", {
					// 230 damage. During your next turn, this Pokémon can't attack.
					damage 230
				}
			}



      case SHAYMIN_115: return cardng (stub) {
				moveAttack "Gather Flowers", {
					// Shuffle up to 2 Energy cards from your discard pile into your deck.

				}
				moveAttack "Rear Kick", {
					// 30 damage.
					damage 30
				}
			}





      case YUNGOOS_117: return cardng (stub) {
				moveAttack "Sharp Fang", {
					// 20 damage.
					damage 20
				}
			}



      case GUMSHOOS_118: return cardng (stub) {
				moveAttack "Stakeout Headbutt", {
					// 30+ damage. If your opponent's Active Pokémon moved from the Bench to the Active Spot during your opponent's last turn, this attack does 120 more damage.
					damage 30
				}
				moveAttack "Lunge Out", {
					// 60 damage.
					damage 60
				}
			}



      case ORANGURU_119: return cardng (stub) {
				moveAttack "Primate Acting", {
					// Choose a Supporter card from your opponent's discard pile and use the effect of that card as the effect of this attack.

				}
				moveAttack "Hammer In", {
					// 70 damage.
					damage 70
				}
			}





      case WOOLOO_121: return cardng (stub) {
				moveAttack "Rolling Rollout", {
					// 30x damage. Flip a coin until you get tails. This attack does 30 damage for each heads.
					damage 30
				}
			}



      case DUBWOOL_122: return cardng (stub) {
				moveAttack "Overhead Throw", {
					// 40 damage. This attack also does 10 damage to 1 of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 40
				}
				moveAttack "Rolling Dash", {
					// 60+ damage. Flip a coin until you get tails. This attack does 30 more damage for each heads.
					damage 60
				}
			}









      case DIGGING_DUO_126: return cardng (stub) {
				// Flip a coin. If heads, look at the bottom 8 cards of your deck and put 1 of them into your hand. If tails, look at the bottom 3 cards of your deck and put 1 of them into your hand. Shuffle the other cards back into your deck.
				onPlay {
				}
				playRequirement{
				}
			}









      case FRIENDS_IN_HISUI_130: return cardng (stub) {
				// Draw 3 cards.
				onPlay {
				}
				playRequirement{
				}
			}



      case FRIENDS_IN_SINNOH_131: return cardng (stub) {
				// Draw 3 cards.
				onPlay {
				}
				playRequirement{
				}
			}

























      case SKY_SEAL_STONE_143: return cardng (stub) {
				// The Pokémon V this card is attached to can use the VSTAR Power on this card.
				onPlay {reason->
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			}















































































































































































        default:
      return null;
    }
  }
}