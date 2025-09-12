package tcgwars.logic.impl.gen8

import tcgwars.logic.effect.special.SpecialConditionType

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
          damage 50, opp.all.select()

				}
				moveAttack "Fire Blast", {
					// 120 damage. Discard an Energy from this Pokémon.
					damage 120
          discardSelfEnergy(C)
				}
			}

      case RESHIRAM_2: return cardng (stub) {
				moveAttack "Scorching Wind", {
					// This attack does 20 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
          opp.bench.each {damage 20, it}
				}
				moveAttack "Black Flame", {
					// 80+ damage. If Zekrom is on your Bench, this attack does 80 more damage.
					damage 80
          if (my.bench.find{it.name == "Zekrom"}) damage 80
				}
			}

      case KYOGRE_3: return cardng (stub) {
				moveFull "Aqua Storm", {
					// Discard the top 5 cards of your deck, and then choose 2 of your opponent's Benched Pokémon. This attack does 50 damage for each Energy card you discarded in this way to each of those Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
          attackRequirement {
            assert my.deck
            assertOppBench()
          }
          onAttack {
            def count = my.deck.subList(0, 5).discard().energyCardCount()
            if (count) {
              multiSelect(opp.bench, 2, "Deal damage to?").each {
                damage 50 * count, it
              }
            }
          }
        }
				moveAttack "Surf", {
					// 120 damage.
					damage 120
				}
			}

      case PALKIA_4: return cardng (stub) {
				bwAbility "Absolute Space", {
					// As long as this Pokémon is in the Active Spot, your opponent can't play any Stadium cards from their hand.
					delayedA {
            before PLAY_TRAINER, {
              if (ef.cardToPlay.cardTypes.is(STADIUM) && bg.currentTurn == self.owner.opposite && self.active) {
                wcu "Absolute Space prevents playing this card"
                prevent()
              }
            }
					}
				}
				moveAttack "Overdrive Smash", {
					// 80+ damage. During your next turn, this Pokémon's Overdrive Smash attack does 80 more damage (before applying Weakness and Resistance).
					damage 80
          increasedBaseDamageNextTurn("Overdrive Smash",hp(80))
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
          flipTails {damage 10, self}
				}
			}

      case FLYING_PIKACHU_V_6: return cardng (stub) {
				moveAttack "Thunder Shock", {
					// 20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed.
					damage 20
          flipThenApplySC PARALYZED
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
          preventAllDamageFromCustomPokemonNextTurn thisMove, self, { it.basic }
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
          opp.bench.each{damage 30,it}
				}
			}

      case ZEKROM_10: return cardng (stub) {
				moveAttack "Field Crush", {
					// 30 damage. If your opponent has a Stadium in play, discard it.
					damage 30
          if (bg.stadiumInfoStruct?.stadiumCard?.player==self.owner.opposite)
            afterDamage {discard(bg.stadiumInfoStruct.stadiumCard)}
				}
				moveAttack "White Thunder", {
					// 80+ damage. If Reshiram is on your Bench, this attack does 80 more damage.
					damage 80
          if (my.bench.find {it.name=="Reshiram"}) damage 80
				}
			}

      case MEW_11: return cardng (stub) {				
				bwAbility "Mysterious Tail", {
				// Once during your turn, if this Pokémon is in the Active Spot, you may look at the top 6 cards of your deck, reveal an Item card you find there, and put it into your hand. Shuffle the other cards back into your deck.
					actionA {
						assert self.active // Check if Mew is active
						assert my.deck     // Make sure there are cards in deck

						def topCards = my.deck.subList(0, 6)
						topCards.select2(min:0, filter:cardTypeFilter(ITEM), text:"You may select an Item card to add to your hand").moveTo(my.hand)
						shuffleDeck()
					}
				}
				moveAttack "Psyshot", {
					// 30 damage.
					damage 30
				}
			}

      case XERNEAS_12: return cardng (stub) {
				moveFull "Breath of Life", {
          attackRequirement {
            assert my.deck
          }
          onAttack {
            // Search your deck for up to 3 basic Energy cards of different types and attach them to your Pokémon in any way you like. Then, shuffle your deck.
            my.deck.select2(min: 0, max: 3,
              text: "Search your deck for up to 3 basic Energy cards of different types and attach them to your Pokémon in any way you like",
              filter: cardTypeFilter(BASIC_ENERGY),
              passFilter: { CardList cardList ->
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
				moveAttack "Aurora Horns", {
					// 100 damage.
					damage 100
				}
			}

      case COSMOG_13: return cardng (stub) {
				moveAttack "Star Protection", {
					// Flip a coin. If heads, during your opponent's next turn, prevent all damage done to this Pokémon by attacks.
          flip {
            preventAllDamageNextTurn()
          }
				}
			}

      case COSMOEM_14: return cardng (stub) {
				moveAttack "Star Protection", {
					// Flip a coin. If heads, during your opponent's next turn, prevent all damage done to this Pokémon by attacks.
          flip {
            preventAllDamageNextTurn()
          }
				}
			}

      case LUNALA_15: return cardng (stub) {
				moveFull "Lunar Pain", {
          // Double the number of damage counters on each of your opponent's Pokémon.
          attackRequirement {
            assert opp.all.find {it.numberOfDamageCounters > 0} : "No damage counters on opponent's Pokémon"
          }
          onAttack {
            opp.all.each {pcs->
              directDamage(pcs.numberOfDamageCounters * 10, pcs)
            }
          }
				}
				moveAttack "Psychic Shot", {
					// 130 damage. This attack also does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
					damage 130
          if (opp.bench) damage 30, opp.bench.select()
				}
			}

      case ZACIAN_V_16: return cardng (stub) {
				bwAbility "Roar of the Sword", {
					// Once during your turn, you may search your deck for a [P] Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck. If you use this Ability, your turn ends.
					actionA {
            assert my.deck
            checkLastTurn()
            powerUsed()
            my.deck.search(energyFilter(P)).each {attachEnergy(my.all.select("Attach $it to?"), it)}
            shuffleDeck()
            bg.gm().betweenTurns()
          }
				}
				moveAttack "Storm Slash", {
					// 60+ damage. This attack does 30 more damage for each [P] Energy attached to this Pokémon.
					damage 60+30*self.cards.energyCount(P)
				}
			}

      case GROUDON_17: return cardng (stub) {
				moveFull "Magma Volcano", {
					// 80x damage. Discard the top 5 cards of your deck. This attack does 80 damage for each Energy card you discarded in this way.
          attackRequirement {
            assert my.deck
          }
          onAttack {
					  damage 80*my.deck.subList(0, 5).discard().energyCardCount()
          }
				}
				moveAttack "Massive Rend", {
					// 120 damage.
					damage 120
				}
			}

      case ZAMAZENTA_V_18: return cardng (stub) {
				bwAbility "Growl of the Shield", {
					// All of your [F] Pokémon take 20 less damage from attacks from your opponent's Pokémon VMAX (after applying Weakness and Resistance). You can't apply more than 1 Growl of the Shield Ability at a time.
					delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each {
                if(it.to == self && it.from.pokemonVMAX && it.from.owner == self.owner.opposite && it.dmg.value && it.notNoEffect && bg.em().retrieveObject("GROWL_OF_THE_SHIELD_"+it.to.hashCode()) == null) {
                  bc "Growl of the Shield -20"
                  it.dmg -= hp(20)
                  bg.em().storeObject("GROWL_OF_THE_SHIELD_"+it.to.hashCode(), 1)
                }
              }
            }
					}
				}
				moveAttack "Heavy Impact", {
					// 150 damage.
					damage 150
				}
			}

      case YVELTAL_19: return cardng (stub) {
				moveFull "Cry of Destruction", {
          attackRequirement {
            assert opp.all.find {it.cards.filterByType(SPECIAL_ENERGY).size() > 0} : "No Special Energy in opponent's Pokémon"
          }
          onAttack {
					  // Discard up to 3 Special Energy from your opponent's Pokémon.
            opp.all.each {pcs->
              targeted (pcs) {
                pcs.cards.filterByType(SPECIAL_ENERGY).select2(min: 0, max: 3, text: "Discard up to 3 Special Energy from $pcs").discard()
              }
            }
          }
				}
				moveAttack "Dark Feather", {
					// 100 damage.
					damage 100
				}
			}

      case DIALGA_20: return cardng (stub) {
				moveFull "Temporal Backflow", {
					// Put a card from your discard pile into your hand.
          attackRequirement {
            assert my.discard : "No card in discard"
          }
          onAttack {
            my.discard.select("Put into hand").moveTo(my.hand)
          }
				}
				moveAttack "Metal Blast", {
					// 60+ damage. This attack does 20 more damage for each [M] Energy attached to this Pokémon.
					damage 60+20*self.cards.energyCount(M)
				}
			}

      case SOLGALEO_21: return cardng (stub) {
				bwAbility "Rush In", {
					// Once during your turn, if this Pokémon is on your Bench, you may switch it with your Active Pokémon.
					actionA {
            assert self.benched : "$self is not on your bench"
            checkLastTurn()
            powerUsed()
            sw my.active, self
					}
				}
				moveAttack "Solar Geyser", {
					// 100 damage. Attach up to 2 basic Energy cards from your discard pile to 1 of your Benched Pokémon.
					damage 100
          afterDamage {
            attachEnergyFrom(basic: true, max: 2, my.discard, my.bench)
          }
				}
			}

      case LUGIA_22: return cardng (stub) {
				moveAttack "Aero Ball", {
					// 20x damage. This attack does 20 damage for each Energy attached to both Active Pokémon.
					damage 20*(opp.active.cards.energyCardCount()+my.active.cards.energyCardCount())
				}
				moveAttack "Deep Crush", {
					// 160 damage. During your next turn, this Pokémon can't attack.
					damage 160
          cantAttackNextTurn self
				}
			}

      case PROFESSOR_S_RESEARCH_PROFESSOR_OAK__23: return cardng (stub) {
				// Discard your hand and draw 7 cards.
				onPlay {
          my.hand.getExcludedList(thisCard).discard()
          draw 7
				}
				playRequirement{
          assert my.hand.getExcludedList(thisCard) && my.deck : "No card in hand or deck"
				}
			}

      case CHARIZARD_4: return cardng (stub) {
				pokemonPower "Energy Burn", {
					// As often as you like during your turn (before your attack), you may turn all Energy attached to Charizard into [R] Energy for the rest of the turn. This power can't be used if Charizard is Asleep, Confused, or Paralyzed.
           def set = [] as Set
            def eff1, eff2
            onActivate {
              if(eff1) eff1.unregister()
              if(eff2) eff2.unregister()
              eff1 = delayed {
                before BETWEEN_TURNS, {
                  set.clear()
                }
              }
              eff2 = getter GET_ENERGY_TYPES, { holder->
                if(set.contains(holder.effect.card)) {
                  int count = holder.object.size()
                  holder.object = [(1..count).collect{[FIRE] as Set}]
                }
              }
            }
            actionA {
              checkNoSPCForClassic()
              def newSet = [] as Set
              newSet.addAll(self.cards.filterByType(ENERGY))
              if(newSet != set){
                powerUsed()
                set.clear()
                set.addAll(newSet)
              } else {
                wcu "Nothing to burn more"
              }
            }
          }
 				}
				moveAttack "Fire Spin", {
					// 100 damage. Discard 2 Energy cards attached to Charizard in order to use this attack.
					damage 100
          discardSelfEnergyInOrderTo(C) // one energy card
          discardSelfEnergyInOrderTo(C) // one energy card
				}
			}

      case ROCKET_S_ZAPDOS_15: return cardng (stub) {
				moveAttack "Plasma", {
					// 20 damage. If there are any [L] Energy cards in your discard pile, attach 1 of them to Rocket's Zapdos.
					damage 20
          afterDamage {
            attachEnergyFromDiscardPile(L)
          }
				}
				moveAttack "Electroburn", {
					// 70 damage. Rocket's Zapdos does damage to itself equal to 10 times the number of [L] Energy cards attached to it.
					damage 70
          damage 10*self.cards.energyCardCount(L), self
				}
			}

      case DARK_GYARADOS_8: return cardng (stub) {
				pokemonPower "Final Beam", {
					// When Dark Gyarados is Knocked Out by an attack, flip a coin. If heads, this power does 20 damage for each [W] Energy attached to Dark Gyarados to the Pokémon that Knocked Out Dark Gyarados. Apply Weakness and Resistance. This power doesn't work if Dark Gyarados is Asleep, Confused, or Paralyzed.
					delayedA {
            before KNOCKOUT, self, {
              if((ef as Knockout).byDamageFromAttack && !self.checkNoSPCForClassic() && self.cards.energyCardCount(W) > 0){
                powerUsed()
                flip "Final Beam", {
                  def pcs = bg.currentTurn.pbg.active
                  new ResolvedDamage(hp(20*self.cards.energyCount(W)), self, pcs, DamageManager.DamageFlag.FORCE_WEAKNESS_RESISTANCE).run(bg)
                  bg.dm().applyWeakness()
                  bg.dm().applyResistance()
                  def damage = bg.dm().getTotalDamage(self, pcs)
                  bg.dm().clearDamages()
                  bg.em().run(new DirectDamage(damage, pcs))
                }
              }
            }
					}
				}
				moveAttack "Ice Beam", {
					// 30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed.
					damage 30
          flipThenApplySC PARALYZED
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
          my.hand.moveTo(hidden:true, my.deck)
          draw 7
				}
			}

      case SHINING_MAGIKARP_66: return cardng (stub) {
				moveAttack "Gold Scale", {
					// Your opponent may draw 2 cards. Either way, you may draw 2 cards.
          draw oppChoose([0,2], ["0","2"], "Opponent used Gold Scale. Draw how many cards?", 2), TargetPlayer.OPPONENT
          draw choose([0,2], ["0","2"], "Draw how many cards?", 2)
				}
				moveAttack "Dragon Bond", {
					// Search your deck for a card named Gyarados, Dark Gyarados, or Shining Gyarados. Show it to your opponent and put it into your hand. Shuffle your deck afterward.
          my.deck.search {it.name=="Gyarados"||it.name=="Dark Gyarados"||it.name=="Shining Gyarados"}.moveTo(my.hand)
          shuffleDeck()
				}
			}

      case TEAM_MAGMA_S_GROUDON_9: return cardng (stub) {
				pokeBody "Power Saver", {
					// As long as the number of Pokémon in play (both yours and your opponent's) that has Team Magma in its name is 3 or less, Team Magma's Groudon can't attack.
					delayedA {
            before CHECK_ATTACK_REQUIREMENTS, {
              if (ef.attacker == self && my.all.findAll {it.topPokemonCard.cardTypes.is(TEAM_MAGMA)}.size() <= 3) {
                wcu "Power Saver prevents attack"
                prevent()
              }
            }
					}
				}
				moveAttack "Linear Attack", {
					// Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)
          damage 20, opp.all.select("Choose 1 of your opponent's Pokémon")
				}
				moveAttack "Pulverize", {
					// 50+ damage. If the Defending Pokémon already has at least 2 damage counters on it, this attack does 50 damage plus 20 more damage.
					damage 50
          if(defending.numberOfDamageCounters >= 2) damage 20
				}
			}



      case ROCKET_S_ADMIN__86: return cardng (stub) {
				// Each player shuffles his or her hand into his or her deck. Then, each player counts his or her Prize cards left and draws up to that many cards. (You draw your cards first.)
				onPlay {
          my.hand.getExcludedList(thisCard).moveTo(hidden:true, my.deck)
          opp.hand.moveTo(hidden:true, opp.deck)
          shuffleDeck()
          shuffleOppDeck()
          drawUpTo my.prizeCardSet.size()
          drawUpTo opp.prizeCardSet.size(), TargetPlayer.OPPONENT
				}
				playRequirement{
				}
			}

        default:
      return null;
    }
  }
}