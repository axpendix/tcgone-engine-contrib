package tcgwars.logic.impl.gen8


import static tcgwars.logic.card.Type.*
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*

import tcgwars.logic.card.*

/**
 * @author
 */
public enum Celebrations implements ImplOnlyCardInfo {

  HO_OH_1,
  RESHIRAM_2,
  KYOGRE_3,
  PALKIA_4,
  PIKACHU_5,
  FLYING_PIKACHU_V_6,
  FLYING_PIKACHU_VMAX_7,
  SURFING_PIKACHU_V_8,
  SURFING_PIKACHU_VMAX_9,
  ZEKROM_10,
  MEW_11,
  XERNEAS_12,
  COSMOG_13,
  COSMOEM_14,
  LUNALA_15,
  ZACIAN_V_16,
  GROUDON_17,
  ZAMAZENTA_V_18,
  YVELTAL_19,
  DIALGA_20,
  SOLGALEO_21,
  LUGIA_22,
  PROFESSOR_S_RESEARCH_PROFESSOR_OAK__23,
  PROFESSOR_S_RESEARCH_PROFESSOR_OAK__24,
  MEW_25,
  BLASTOISE_2,
  CHARIZARD_4,
  VENUSAUR_15,
  HERE_COMES_TEAM_ROCKET__15,
  ROCKET_S_ZAPDOS_15,
  CLAYDOL_15,
  IMPOSTER_PROFESSOR_OAK_73,
  DARK_GYARADOS_8,
  _S_PIKACHU_24,
  CLEFFA_20,
  SHINING_MAGIKARP_66,
  TEAM_MAGMA_S_GROUDON_9,
  ROCKET_S_ADMIN__86,
  MEW_EX_88,
  GARDEVOIR_EX_DELTA_93,
  UMBREON_STAR_17,
  LUXRAY_GL_LV_X_109,
  GARCHOMP_C_LV_X_145,
  DONPHAN_107,
  RESHIRAM_113,
  ZEKROM_114,
  MEWTWO_EX_54,
  XERNEAS_EX_97,
  M_RAYQUAZA_EX_76,
  TAPU_LELE_GX_60
;

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  @Override
  public String toEnumId() {
    return name()+":CELEBRATIONS";
  }

  @Override
  public Card getImplementation(EnhancedCardInfo stub) {
    switch (this) {


      case HO_OH_1: return cardng (stub) {
				moveAttack "Sacred Fire", {
					// This attack does 50 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Fire Blast", {
					// 120 damage. Discard an Energy from this Pokémon.
					damage 120
				}
			}



      case RESHIRAM_2: return cardng (stub) {
				moveAttack "Scorching Wind", {
					// This attack does 20 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Black Flame", {
					// 80+ damage. If Zekrom is on your Bench, this attack does 80 more damage.
					damage 80
				}
			}



      case KYOGRE_3: return cardng (stub) {
				moveAttack "Aqua Storm", {
					// Discard the top 5 cards of your deck, and then choose 2 of your opponent's Benched Pokémon. This attack does 50 damage for each Energy card you discarded in this way to each of those Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Surf", {
					// 120 damage.
					damage 120
				}
			}



      case PALKIA_4: return cardng (stub) {
				bwAbility "Absolute Space", {
					// As long as this Pokémon is in the Active Spot, your opponent can't play any Stadium cards from their hand.
					actionA {
					}
				}
				moveAttack "Overdrive Smash", {
					// 80+ damage. During your next turn, this Pokémon's Overdrive Smash attack does 80 more damage (before applying Weakness and Resistance).
					damage 80
				}
			}



      case PIKACHU_5: return cardng (stub) {
				moveAttack "Gnaw", {
					// 10 damage.
					damage 10
				}
				moveAttack "Thunder Jolt", {
					// 30 damage. Flip a coin. If tails, this Pokémon also does 10 damage to itself.
					damage 30
				}
			}



      case FLYING_PIKACHU_V_6: return cardng (stub) {
				moveAttack "Thunder Shock", {
					// 20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
					damage 20
				}
				moveAttack "Fly", {
					// 120 damage. Flip a coin. If tails, this attack does nothing. If heads, during your opponent's next turn, prevent all damage from and effects of attacks done to this Pokémon.
					damage 120
				}
			}



      case FLYING_PIKACHU_VMAX_7: return cardng (stub) {
				moveAttack "Max Balloon", {
					// 160 damage. During your opponent's next turn, prevent all damage done to this Pokémon by attacks from Basic Pokémon.
					damage 160
				}
			}



      case SURFING_PIKACHU_V_8: return cardng (stub) {
				moveAttack "Surf", {
					// 150 damage.
					damage 150
				}
			}



      case SURFING_PIKACHU_VMAX_9: return cardng (stub) {
				moveAttack "Max Surfer", {
					// 160 damage. This attack also does 30 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 160
				}
			}



      case ZEKROM_10: return cardng (stub) {
				moveAttack "Field Crush", {
					// 30 damage. If your opponent has a Stadium in play, discard it.
					damage 30
				}
				moveAttack "White Thunder", {
					// 80+ damage. If Reshiram is on your Bench, this attack does 80 more damage.
					damage 80
				}
			}



      case MEW_11: return cardng (stub) {
				bwAbility "Mysterious Tail", {
					// Once during your turn, if this Pokémon is in the Active Spot, you may look at the top 6 cards of your deck, reveal an Item card you find there, and put it into your hand. Shuffle the other cards back into your deck.
					actionA {
					}
				}
				moveAttack "Psyshot", {
					// 30 damage.
					damage 30
				}
			}



      case XERNEAS_12: return cardng (stub) {
				moveAttack "Breath of Life", {
					// Search your deck for up to 3 basic Energy cards of different types and attach them to your Pokémon in any way you like. Then, shuffle your deck.

				}
				moveAttack "Aurora Horns", {
					// 100 damage.
					damage 100
				}
			}



      case COSMOG_13: return cardng (stub) {
				moveAttack "Star Protection", {
					// Flip a coin. If heads, during your opponent's next turn, prevent all damage done to this Pokémon by attacks.

				}
			}



      case COSMOEM_14: return cardng (stub) {
				moveAttack "Star Protection", {
					// Flip a coin. If heads, during your opponent's next turn, prevent all damage done to this Pokémon by attacks.

				}
			}



      case LUNALA_15: return cardng (stub) {
				moveAttack "Lunar Pain", {
					// Double the number of damage counters on each of your opponent's Pokémon.

				}
				moveAttack "Psychic Shot", {
					// 130 damage. This attack also does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 130
				}
			}



      case ZACIAN_V_16: return cardng (stub) {
				bwAbility "Roar of the Sword", {
					// Once during your turn, you may search your deck for a [P] Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck. If you use this Ability, your turn ends.
					actionA {
					}
				}
				moveAttack "Storm Slash", {
					// 60+ damage. This attack does 30 more damage for each [P] Energy attached to this Pokémon.
					damage 60
				}
			}



      case GROUDON_17: return cardng (stub) {
				moveAttack "Magma Volcano", {
					// 80x damage. Discard the top 5 cards of your deck. This attack does 80 damage for each Energy card you discarded in this way.
					damage 80
				}
				moveAttack "Massive Rend", {
					// 120 damage.
					damage 120
				}
			}



      case ZAMAZENTA_V_18: return cardng (stub) {
				bwAbility "Growl of the Shield", {
					// All of your [F] Pokémon take 20 less damage from attacks from your opponent's Pokémon VMAX (after applying Weakness and Resistance). You can't apply more than 1 Growl of the Shield Ability at a time.
					actionA {
					}
				}
				moveAttack "Heavy Impact", {
					// 150 damage.
					damage 150
				}
			}



      case YVELTAL_19: return cardng (stub) {
				moveAttack "Cry of Destruction", {
					// Discard up to 3 Special Energy from your opponent's Pokémon.

				}
				moveAttack "Dark Feather", {
					// 100 damage.
					damage 100
				}
			}



      case DIALGA_20: return cardng (stub) {
				moveAttack "Temporal Backflow", {
					// Put a card from your discard pile into your hand.

				}
				moveAttack "Metal Blast", {
					// 60+ damage. This attack does 20 more damage for each [M] Energy attached to this Pokémon.
					damage 60
				}
			}



      case SOLGALEO_21: return cardng (stub) {
				bwAbility "Rush In", {
					// Once during your turn, if this Pokémon is on your Bench, you may switch it with your Active Pokémon.
					actionA {
					}
				}
				moveAttack "Solar Geyser", {
					// 100 damage. Attach up to 2 basic Energy cards from your discard pile to 1 of your Benched Pokémon.
					damage 100
				}
			}



      case LUGIA_22: return cardng (stub) {
				moveAttack "Aero Ball", {
					// 20x damage. This attack does 20 damage for each Energy attached to both Active Pokémon.
					damage 20
				}
				moveAttack "Deep Crush", {
					// 160 damage. During your next turn, this Pokémon can't attack.
					damage 160
				}
			}



      case PROFESSOR_S_RESEARCH_PROFESSOR_OAK__23: return cardng (stub) {
				// Discard your hand and draw 7 cards.
				onPlay {
				}
				playRequirement{
				}
			}









      case CHARIZARD_4: return cardng (stub) {
				pokemonPower "Energy Burn", {
					// As often as you like during your turn (before your attack), you may turn all Energy attached to Charizard into [R] Energy for the rest of the turn. This power can't be used if Charizard is Asleep, Confused, or Paralyzed.
					actionA {
					}
				}
				moveAttack "Fire Spin", {
					// 100 damage. Discard 2 Energy cards attached to Charizard in order to use this attack.
					damage 100
				}
			}







      case ROCKET_S_ZAPDOS_15: return cardng (stub) {
				moveAttack "Plasma", {
					// 20 damage. If there are any [L] Energy cards in your discard pile, attach 1 of them to Rocket's Zapdos.
					damage 20
				}
				moveAttack "Electroburn", {
					// 70 damage. Rocket's Zapdos does damage to itself equal to 10 times the number of [L] Energy cards attached to it.
					damage 70
				}
			}







      case DARK_GYARADOS_8: return cardng (stub) {
				pokemonPower "Final Beam", {
					// When Dark Gyarados is Knocked Out by an attack, flip a coin. If heads, this power does 20 damage for each [W] Energy attached to Dark Gyarados to the Pokémon that Knocked Out Dark Gyarados. Apply Weakness and Resistance. This power doesn't work if Dark Gyarados is Asleep, Confused, or Paralyzed.
					actionA {
					}
				}
				moveAttack "Ice Beam", {
					// 30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed.
					damage 30
				}
			}



      case _S_PIKACHU_24: return cardng (stub) {
				moveAttack "Birthday Surprise", {
					// 30+ damage. If it's not your birthday, this attack does 30 damage. If it is your birthday, flip a coin. If heads, this attack does 30 damage plus 50 more damage; if tails, this attack does 30 damage.
					damage 30
				}
			}



      case CLEFFA_20: return cardng (stub) {
				moveAttack "Eeeeeeek", {
					// Shuffle your hand into your deck, then draw 7 cards.

				}
			}



      case SHINING_MAGIKARP_66: return cardng (stub) {
				moveAttack "Gold Scale", {
					// Your opponent may draw 2 cards. Either way, you may draw 2 cards.

				}
				moveAttack "Dragon Bond", {
					// Search your deck for a card named Gyarados, Dark Gyarados, or Shining Gyarados. Show it to your opponent and put it into your hand. Shuffle your deck afterward.

				}
			}



      case TEAM_MAGMA_S_GROUDON_9: return cardng (stub) {
				pokeBody "Power Saver", {
					// As long as the number of Pokémon in play (both yours and your opponent's) that has Team Magma in its name is 3 or less, Team Magma's Groudon can't attack.
					delayedA {
					}
				}
				moveAttack "Linear Attack", {
					// Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)

				}
				moveAttack "Pulverize", {
					// 50+ damage. If the Defending Pokémon already has at least 2 damage counters on it, this attack does 50 damage plus 20 more damage.
					damage 50
				}
			}



      case ROCKET_S_ADMIN__86: return cardng (stub) {
				// Each player shuffles his or her hand into his or her deck. Then, each player counts his or her Prize cards left and draws up to that many cards. (You draw your cards first.)
				onPlay {
				}
				playRequirement{
				}
			}





      case GARDEVOIR_EX_DELTA_93: return cardng (stub) {
				pokePower "Imprison", {
					// Once during your turn (before your attack), if Gardevoir ex is your Active Pokémon, you may put an Imprison marker on 1 of your opponent's Pokémon. Any Pokémon that has any Imprison markers on it can't use any Poké-Powers or Poké-Bodies. This power can't be used if Gardevoir ex is affected by a Special Condition.
					actionA {
					}
				}
				moveAttack "Flame Ball", {
					// 80 damage. You may move a [R] Energy card attached to Gardevoir ex to 1 of your Benched Pokémon.
					damage 80
				}
			}



      case UMBREON_STAR_17: return cardng (stub) {
				pokePower "Dark Ray", {
					// Once during your turn, when you put Umbreon Star from your hand onto your Bench, you may choose 1 card from your opponent's hand without looking and discard it.
					actionA {
					}
				}
				moveAttack "Feint Attack", {
					// Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon.

				}
			}



      case LUXRAY_GL_LV_X_109: return cardng (stub) {
				pokePower "Bright Look", {
					// Once during your turn (before your attack), when you put Luxray GL LV.X from your hand onto your Active Luxray GL, you may switch the Defending Pokémon with 1 of your opponent's Benched Pokémon.
					actionA {
					}
				}
				moveAttack "Flash Impact", {
					// 60 damage. Does 30 damage to 1 of your Pokémon, and don't apply Weakness and Resistance to this damage.
					damage 60
				}
			}



      case GARCHOMP_C_LV_X_145: return cardng (stub) {
				pokePower "Healing Breath", {
					// Once during your turn (before your attack), when you put Garchomp C LV.X from your hand onto your Active Garchomp C, you may remove all damage counters from each of your Pokémon SP.
					actionA {
					}
				}
				moveAttack "Dragon Rush", {
					// Discard 2 Energy attached to Garchomp C. Choose 1 of your opponent's Pokémon. This attack does 80 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) Garchomp C can't use Dragon Rush during your next turn.

				}
			}



      case DONPHAN_107: return cardng (stub) {
				pokeBody "Exoskeleton", {
					// Any damage done to Donphan by attacks is reduced by 20 (after applying Weakness and Resistance).
					delayedA {
					}
				}
				moveAttack "Earthquake", {
					// 60 damage. Does 10 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 60
				}
				moveAttack "Heavy Impact", {
					// 90 damage.
					damage 90
				}
			}







      case MEWTWO_EX_54: return cardng (stub) {
				moveAttack "X Ball", {
					// 20x damage. Does 20 damage times the amount of Energy attached to this Pokémon and the Defending Pokémon.
					damage 20
				}
				moveAttack "Psydrive", {
					// 120 damage. Discard an Energy attached to this Pokémon.
					damage 120
				}
			}



      case XERNEAS_EX_97: return cardng (stub) {
				moveAttack "Break Through", {
					// 60 damage. This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 60
				}
				moveAttack "X Blast", {
					// 140 damage. This Pokémon can't use X Blast during your next turn.
					damage 140
				}
			}



      case M_RAYQUAZA_EX_76: return cardng (stub) {
				ancientTrait "Δ Evolution", {
					// You may play this card from your hand to evolve a Pokémon during your first turn or the turn you play that Pokémon.
					delayedA {
					}
				}
				moveAttack "Emerald Break", {
					// 30x damage. This attack does 30 damage times the number of your Benched Pokémon.
					damage 30
				}
			}



      case TAPU_LELE_GX_60: return cardng (stub) {
				bwAbility "Wonder Tag", {
					// When you play this Pokémon from your hand onto your Bench during your turn, you may search your deck for a Supporter card, reveal it, and put it into your hand. Then, shuffle your deck.
					actionA {
					}
				}
				moveAttack "Energy Drive", {
					// 20x damage. This attack does 20 damage times the amount of Energy attached to both Active Pokémon. This damage isn't affected by Weakness or Resistance.
					damage 20
				}
				moveAttack "Tapu Cure-GX", {
					// Heal all damage from 2 of your Benched Pokémon. (You can't use more than 1 GX attack in a game.)

				}
			}

        default:
      return null;
    }
  }
}