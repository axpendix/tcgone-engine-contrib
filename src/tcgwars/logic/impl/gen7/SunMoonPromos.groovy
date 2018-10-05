package tcgwars.logic.impl.gen7

import tcgwars.logic.impl.gen5.BlackWhitePromos;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.effect.Source.*;
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*

import java.util.*

import tcgwars.logic.card.*
import tcgwars.logic.card.pokemon.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum SunMoonPromos implements CardInfo {

	ROWLET_SM01 ("Rowlet", 1, Rarity.PROMO, [BASIC, POKEMON, _GRASS_]),
	LITTEN_SM02 ("Litten", 2, Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
	POPPLIO_SM03 ("Popplio", 3, Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
	PIKACHU_SM04 ("Pikachu", 4, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	SNORLAX_GX_SM05 ("Snorlax-GX", 5, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _COLORLESS_]),
	ROCKRUFF_SM06 ("Rockruff", 6, Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
	PIKIPEK_SM07 ("Pikipek", 7, Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
	LITTEN_SM08 ("Litten", 8, Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
	TOGEDEMARU_SM09 ("Togedemaru", 9, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	SHIINOTIC_SM10 ("Shiinotic", 10, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	BRUXISH_SM11 ("Bruxish", 11, Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
	PASSIMIAN_SM12 ("Passimian", 12, Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
	ORANGURU_SM13 ("Oranguru", 13, Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
	LYCANROC_GX_SM14 ("Lycanroc-GX", 14, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIGHTING_]),
	ZYGARDE_SM15 ("Zygarde", 15, Rarity.PROMO, [BASIC, POKEMON, _FIGHTING_]),
	SOLGALEO_GX_SM16 ("Solgaleo-GX", 16, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _METAL_]),
	LUNALA_GX_SM17 ("Lunala-GX", 17, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
	ALOLAN_SANDSLASH_SM18 ("Alolan Sandslash", 18, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	ORICORIO_SM19 ("Oricorio", 19, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	MUDSDALE_SM20 ("Mudsdale", 20, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	DRAMPA_SM21 ("Drampa", 21, Rarity.PROMO, [BASIC, POKEMON, _DRAGON_]),
	ROWLET_SM22 ("Rowlet", 22, Rarity.PROMO, [BASIC, POKEMON, _GRASS_]),
	LITTEN_SM23 ("Litten", 23, Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
	POPPLIO_SM24 ("Popplio", 24, Rarity.PROMO, [BASIC, POKEMON, _WATER_]),
	LURANTIS_SM25 ("Lurantis", 25, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	TSAREENA_SM26 ("Tsareena", 26, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	TURTONATOR_SM27 ("Turtonator", 27, Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
	VIKAVOLT_SM28 ("Vikavolt", 28, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
	MIMIKYU_SM29 ("Mimikyu", 29, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	TAPU_KOKO_SM30 ("Tapu Koko", 30, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	TAPU_KOKO_SM31 ("Tapu Koko", 31, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	TAPU_BULU_GX_SM32 ("Tapu Bulu-GX", 32, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _GRASS_]),
	TAPU_KOKO_GX_SM33 ("Tapu Koko-GX", 33, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _LIGHTNING_]),
	BEWEAR_GX_SM34 ("Bewear-GX", 34, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _COLORLESS_]),
	ESPEON_GX_SM35 ("Espeon-GX", 35, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _PSYCHIC_]),
	UMBREON_GX_SM36 ("Umbreon-GX", 36, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _DARKNESS_]),
	DECIDUEYE_GX_SM37 ("Decidueye-GX", 37, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
	INCINEROAR_GX_SM38 ("Incineroar-GX", 38, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FIRE_]),
	PRIMARINA_GX_SM39 ("Primarina-GX", 39, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _WATER_]),
	JANMGO_O_SM40 ("Janmgo-o", 40, Rarity.PROMO, [BASIC, POKEMON, _DRAGON_]),
	KOMALA_SM41 ("Komala", 41, Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
	COSMOG_SM42 ("Cosmog", 42, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	ALOLAN_MEOWTH_SM43 ("Alolan Meowth", 43, Rarity.PROMO, [BASIC, POKEMON, _DARKNESS_]),
	TOGEDEMARU_SM44 ("Togedemaru", 44, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	TAPU_LELE_SM45 ("Tapu Lele", 45, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	SEVIPER_SM46 ("Seviper", 46, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	CRABOMINABLE_SM47 ("Crabominable", 47, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	ZYGARDE_SM48 ("Zygarde", 48, Rarity.PROMO, [BASIC, POKEMON, _DRAGON_]),
	BEWEAR_SM49 ("Bewear", 49, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	TAPU_KOKO_GX_SM50 ("Tapu Koko-GX", 50, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _LIGHTNING_]),
	ALOLAN_MEOWTH_SM51 ("Alolan Meowth", 51, Rarity.PROMO, [BASIC, POKEMON, _DARKNESS_]),
	TSAREENA_GX_SM56 ("Tsareena-GX", 56, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
	HO_OH_GX_SM57 ("Ho-Oh-GX", 57, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _FIRE_]),
	NECROZMA_GX_SM58 ("Necrozma-GX", 58, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _PSYCHIC_]),
	MARSHADOW_GX_SM59 ("Marshadow-GX", 59, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _FIGHTING_]),
	CHARIZARD_GX_SM60 ("Charizard-GX", 60, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _FIRE_]),
	GOLISOPOD_GX_SM62 ("Golisopod-GX", 62, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _GRASS_]),
	SALAZZLE_GX_SM63 ("Salazzle-GX", 63, Rarity.PROMO, [STAGE1, EVOLUTION, POKEMON, POKEMON_GX, _FIRE_]),
	SHINING_HO_OH_SM70 ("Shining Ho-Oh", 70, Rarity.PROMO, [BASIC, POKEMON, _FIRE_]),
	KOMMO_O_GX_SM71 ("Kommo-o-GX", 71, Rarity.PROMO, [STAGE2, EVOLUTION, POKEMON, POKEMON_GX, _DRAGON_]),
	PIKACHU_SM76 ("Pikachu", 76, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	MEWTWO_SM77 ("Mewtwo", 77, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	CHAMPIONS_FESTIVAL_SM78 ("Champions Festival", 78, Rarity.PROMO, [STADIUM, TRAINER]),
	SHINING_CELEBI_SM79 ("Shining Celebi", 79, Rarity.PROMO, [BASIC, POKEMON, _GRASS_]),
	HO_OH_GX_SM80 ("Ho-Oh-GX", 80, Rarity.PROMO, [BASIC, POKEMON, POKEMON_GX, _FIRE_]),
	PIKACHU_SM81 ("Pikachu", 81, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	SHINING_LUGIA_SM82 ("Shining Lugia", 82, Rarity.PROMO, [BASIC, POKEMON, _COLORLESS_]),
	PIKACHU_SM98 ("Pikachu", 98, Rarity.PROMO, [BASIC, POKEMON, _LIGHTNING_]),
	MIMIKYU_SM99 ("Mimikyu", 99, Rarity.PROMO, [BASIC, POKEMON, _PSYCHIC_]),
	DAWN_WINGS_NECROZMA_SM106 ("Dawn Wings Necrozma", 106, Rarity.PROMO, [BASIC, POKEMON, ULTRA_BEAST, _PSYCHIC_]),
	DUSK_MANE_NECROZMA_SM107 ("Dusk Mane Necrozma", 107, Rarity.PROMO, [BASIC, POKEMON, ULTRA_BEAST, _METAL_]);

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	SunMoonPromos(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
		this.cardTypes = new CardTypeSet(cardTypes as CardType[]);
		this.name = name;
		this.rarity = rarity;
		this.collectionLineNo = collectionLineNo;
	}

	@Override
	public CardTypeSet getCardTypes() {
		return cardTypes;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Rarity getRarity() {
		return rarity;
	}

	@Override
	public int getCollectionLineNo() {
		return collectionLineNo;
	}

	@Override
	public tcgwars.logic.card.Collection getCollection() {
		return tcgwars.logic.card.Collection.SUN_MOON_PROMOS;
	}

	@Override
	public String toString() {
		return String.format("%s:%s", this.name(), this.getCollection().name());
	}

	@Override
	public String getEnumName() {
		return name();
	}

	@Override
	public Card getImplementation() {
		switch (this) {
			case ROWLET_SM01:
				return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
					weakness FIRE
					move "Fury Attack", {
						text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
						energyCost G
						onAttack {
							flip 3,{damage 10}
						}
					}

				};
			case LITTEN_SM02:
				return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
					weakness WATER
					move "Combustion", {
						text "30 damage."
						energyCost R, C
						onAttack {
							damage 30
						}
					}

				};
			case POPPLIO_SM03:
				return basic (this, hp:HP060, type:WATER, retreatCost:1) {
					weakness GRASS
					move "Sing", {
						text "Your opponent's Active Pokémon is now Asleep."
						energyCost W
						onAttack {
							apply ASLEEP
						}
					}

				};
			case PIKACHU_SM04:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Thunder Wave", {
						text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
						energyCost L
						onAttack {
							flipThenApplySC PARALYZED
						}
					}
					move "Electro Ball", {
						text "50 damage."
						energyCost L, C, C
						onAttack {
							damage 50
						}
					}

				};
			case SNORLAX_GX_SM05:
				return basic (this, hp:HP190, type:COLORLESS, retreatCost:4) {
					weakness FIGHTING
					customAbility {
						delayedA {
							before ASLEEP_SPC, self, null, CHECK_ATTACK_REQUIREMENTS, {
								if(e.parentEvent.effect.move.name=="Thunderous Snore")
									prevent()
							}
						}
					}
					move "Collapse", {
						text "80 damage. This Pokémon is now Asleep."
						energyCost C, C, C
						onAttack {
							damage 80
							afterDamage{apply ASLEEP,self}
						}
					}
					move "Thunderous Snore", {
						text "180 damage. This attack can be used if this Pokémon is Asleep. If it is not Asleep, this attack does nothing."
						energyCost C, C, C, C, C
						attackRequirement {
							assert self.isSPC(ASLEEP)
						}
						onAttack {
							damage 180
						}
					}
					move "Pulverizing Pancake GX", {
						text "210 damage. This Pokémon is now Asleep. (You can't use more than 1 GX attack in a game.)"
						energyCost C, C, C, C, C
						attackRequirement {
							gxCheck()
						}
						onAttack {
							gxPerform()
							damage 210
							afterDamage{apply ASLEEP,self}
						}
					}

				};
			case ROCKRUFF_SM06:
				return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
					weakness GRASS
					move "Tackle", {
						text "10 damage."
						energyCost C
						onAttack {
							damage 10
						}
					}
					move "Rock Throw", {
						text "20 damage."
						energyCost F, C
						onAttack {
							damage 20
						}
					}

				};
			case PIKIPEK_SM07:
				return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Nosedive", {
						text "40 damage. This Pokémon does 20 damage to itself."
						energyCost C, C
						onAttack {
							damage 40
							damage 20,self
						}
					}

				};
			case LITTEN_SM08:
				return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
					weakness WATER
					move "Collect", {
						text "Draw a card."
						energyCost C
						onAttack {
							draw 1
						}
					}
					move "Scratch", {
						text "20 damage."
						energyCost R, C
						onAttack {
							damage 20
						}
					}

				};
			case TOGEDEMARU_SM09:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Defense Curl", {
						text "Flip a coin. If heads, prevent all damage done to this Pokémon by attacks during your opponent's next turn."
						energyCost C
						onAttack {
							flip{preventAllDamageNextTurn()}
						}
					}
					move "Discharge", {
						text "30× damage. Discard all [L] Energy from this Pokémon. This attack does 30 damage for each card you discarded in this way."
						energyCost L
						onAttack {
							damage 30*discardAllSelfEnergy(L).size()
						}
					}

				};
			case SHIINOTIC_SM10:
				return evolution (this, from:"Morelull", hp:HP100, type:GRASS, retreatCost:2) {
					weakness FIRE
					bwAbility "Illuminate", {
						text "Once during your turn (before your attack), you may search your deck for a [G] Pokémon, reveal it, and put it into your hand. Then, shuffle your deck."
						actionA {
							assert deck
							checkLastTurn()
							powerUsed()
							deck.search {it.cardTypes.is(POKEMON) && (it as PokemonCard).types.contains(G)}.moveTo(my.hand)
							shuffleDeck()
						}
					}
					move "Flickering Spores", {
						text "30 damage. Your opponent's Active Pokémon is now Asleep."
						energyCost G, C
						onAttack {
							damage 30
							applyAfterDamage ASLEEP
						}
					}

				};
			case BRUXISH_SM11:
				return basic (this, hp:HP110, type:WATER, retreatCost:2) {
					weakness GRASS
					move "Vivid Charge", {
						text "Search your deck for up to 3 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
						energyCost C
						onAttack {
							deck.search(max: 3, cardTypeFilter(BASIC_ENERGY)).moveTo(hand)
							shuffleDeck()
						}
					}
					move "Psychic Fang", {
						text "90 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
						energyCost P, P, C
						onAttack {
							shredDamage 90
						}
					}

				};
			case PASSIMIAN_SM12:
				return basic (this, hp:HP110, type:FIGHTING, retreatCost:1) {
					weakness PSYCHIC
					move "Fling", {
						text "This attack does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
						energyCost F
						attackRequirement {
							assert opp.bench
						}
						onAttack {
							damage 30, opp.bench.select()
						}
					}
					move "Team Play", {
						text "10+ damage. This attack does 30 more damage for each of your Benched Passimian."
						energyCost C, C
						onAttack {
							damage 10+30*my.bench.findAll{it.name=='Passimian'}.size()
						}
					}

				};
			case ORANGURU_SM13:
				return basic (this, hp:HP120, type:COLORLESS, retreatCost:1) {
					weakness FIGHTING
					bwAbility "Instruct", {
						text "Once during your turn (before your attack), you may draw cards until you have 3 cards in your hand."
						actionA {
							checkLastTurn()
							assert deck
							assert hand.size() < 3
							powerUsed()
							draw 3-hand.size()
						}
					}
					move "Psychic", {
						text "60+ damage. This attack does 20 more damage times the amount of Energy attached to your opponent's Active Pokémon."
						energyCost C, C
						onAttack {
							damage 60+20*defending.cards.energyCount(C)
						}
					}

				};
			case LYCANROC_GX_SM14:
				return copy (BurningShadows.LYCANROC_GX_136, this);
			case ZYGARDE_SM15:
				return basic (this, hp:HP130, type:FIGHTING, retreatCost:3) {
					weakness GRASS
					move "Pulse Blast", {
						text "60 damage."
						energyCost F, C, C
						onAttack {
							damage 60
						}
					}
					move "Land's Wrath", {
						text "130 damage."
						energyCost F, F, F, C
						onAttack {
							damage 130
						}
					}

				};
			case SOLGALEO_GX_SM16:
				return copy (SunMoon.SOLGALEO_GX_89, this)
			case LUNALA_GX_SM17:
				return copy (SunMoon.LUNALA_GX_66, this)
			case ALOLAN_SANDSLASH_SM18:
				return copy(GuardiansRising.ALOLAN_SANDSLASH_20, this)
			case ORICORIO_SM19:
				return copy(GuardiansRising.ORICORIO_56, this)
			case MUDSDALE_SM20:
				return copy(GuardiansRising.MUDSDALE_76, this)
			case DRAMPA_SM21:
				return copy(GuardiansRising.DRAMPA_97, this)
			case ROWLET_SM22:
				return copy (SunMoon.ROWLET_9, this)
			case LITTEN_SM23:
				return copy (SunMoon.LITTEN_24, this)
			case POPPLIO_SM24:
				return copy (SunMoon.POPPLIO_39, this)
			case LURANTIS_SM25:
				return evolution (this, from:"Fomantis", hp:HP100, type:GRASS, retreatCost:2) {
					weakness FIRE
					bwAbility "Sunny Day", {
						text "Each of your [G] Pokémon's and [R] Pokémon's attacks does 20 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
						delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker.owner == self.owner && (ef.attacker.types.contains(G) || ef.attacker.types.contains(R))){
                  bg.dm().each {
                    if (it.from.active && it.from.owner == self.owner && it.to.active && it.to.owner != self.owner && it.dmg.value) {
                      bc "Sunny Day +20"
                      it.dmg += hp(20)
                    }
                  }
                }
              }
						}
					}
					move "Solar Beam", {
						text "80 damage."
						energyCost G, G, C
						onAttack {
							damage 80
						}
					}

				};
			case TSAREENA_SM26:
				return copy (SunMoon.TSAREENA_20, this)
			case TURTONATOR_SM27:
				return basic (this, hp:HP130, type:FIRE, retreatCost:3) {
					weakness WATER
					move "Flame Cloak", {
						text "30 damage. Attach a [R] Energy card from your discard pile to this Pokémon."
						energyCost R, C
						onAttack {
							damage 30
              afterDamage{
                attachEnergyFrom(type: FIRE, my.discard, self)
              }
						}
					}
					move "Heat Blast", {
						text "70 damage."
						energyCost R, C, C
						onAttack {
							damage 70
						}
					}

				};
			case VIKAVOLT_SM28:
				return copy (SunMoon.VIKAVOLT_52, this)
			case MIMIKYU_SM29:
				return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
					move "Haunt", {
						text "Put 1 damage counter on your opponent's Active Pokémon."
						energyCost P
						onAttack {
							directDamage 10, defending
						}
					}
					move "Astonish", {
						text "Choose a random card from your opponent's hand. Your opponent reveals that card and shuffles it into their deck."
						energyCost C, C
						onAttack {
							astonish()
						}
					}

				};
			case TAPU_KOKO_SM30:
				return basic (this, hp:HP110, type:LIGHTNING, retreatCost:0) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Flying Flip", {
						text "This attack does 20 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
						energyCost C, C
						onAttack {
							opp.all.each {damage 20,it}
						}
					}
					move "Electric Ball", {
						text "100 damage."
						energyCost L, L, C
						onAttack {
							damage 100
						}
					}

				};
			case TAPU_KOKO_SM31:
				return copy (TAPU_KOKO_SM30, this);
			case TAPU_BULU_GX_SM32:
				return copy (BurningShadows.TAPU_BULU_GX_130, this);
			case TAPU_KOKO_GX_SM33:
				return copy (GuardiansRising.TAPU_KOKO_GX_47, this);
			case BEWEAR_GX_SM34:
				return evolution (this, from:"Stufful", hp:HP210, type:COLORLESS, retreatCost:3) {
					weakness FIGHTING
					move "Bear Hug", {
						text "80 damage. The Defending Pokémon can't retreat during your opponent's next turn."
						energyCost C, C, C
						onAttack {
							damage 80
              cantRetreat defending
						}
					}
					move "Double Impact", {
						text "100× damage. Flip 2 coins. This attack does 100 damage for each heads."
						energyCost C, C, C, C
						onAttack {
							flip 2, {damage 100}
						}
					}
					move "Big Throw GX", {
						text "Discard your opponent's Active Pokémon and all cards attached to it. (You can't use more than 1 GX attack in a game.)"
						energyCost C, C, C, C
						attackRequirement {
              gxCheck()
            }
						onAttack {
              gxPerform()
							targeted (defending) {
                defending.cards.reverse().discard()
                removePCS(defending)
              }
						}
					}

				};
			case ESPEON_GX_SM35:
				return copy (SunMoon.ESPEON_GX_61, this)
			case UMBREON_GX_SM36:
				return copy (SunMoon.UMBREON_GX_80, this)
			case DECIDUEYE_GX_SM37:
				return copy (SunMoon.DECIDUEYE_GX_12, this)
			case INCINEROAR_GX_SM38:
				return copy (SunMoon.INCINEROAR_GX_27, this)
			case PRIMARINA_GX_SM39:
				return copy (SunMoon.PRIMARINA_GX_42, this)
			case JANMGO_O_SM40:
				return basic (this, hp:HP060, type:DRAGON, retreatCost:2) {
					weakness FAIRY
					move "Iron Defense", {
						text "Flip a coin. If heads, prevent all damage done to this Pokémon by attacks during your opponent's next turn."
						energyCost F
						onAttack {
							flip {preventAllDamageNextTurn()}
						}
					}
					move "Tackle", {
						text "20 damage."
						energyCost L, C
						onAttack {
							damage 20
						}
					}

				};
			case KOMALA_SM41:
			  return copy (GuardiansRising.KOMALA_114, this)
			case COSMOG_SM42:
				return copy (SunMoon.COSMOG_64, this)
			case ALOLAN_MEOWTH_SM43:
				return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "Scratch", {
						text "10 damage."
						onAttack {
							damage 10
						}
					}
					move "Fake Out", {
						text "20 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
						energyCost D, D
						onAttack {
							damage 20
              flipThenApplySC PARALYZED
						}
					}

				};
			case TOGEDEMARU_SM44:
				return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
					weakness FIGHTING
					resistance METAL, MINUS20
					move "Nuzzle", {
						text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
						energyCost L
						onAttack {
							flipThenApplySC PARALYZED
						}
					}
					move "Rollout", {
						text "50 damage."
						energyCost C, C, C
						onAttack {
							damage 50
						}
					}

				};
			case TAPU_LELE_SM45:
				return basic (this, hp:HP110, type:PSYCHIC, retreatCost:1) {
					weakness PSYCHIC
					move "Psywave", {
						text "20× damage. This attack does 20 damage times the amount of Energy attached to your opponent's Active Pokémon."
						energyCost P
						onAttack {
							damage 20*defending.cards.energyCount(C)
						}
					}
					move "Magical Swap", {
						text "Move any number of damage counters on your opponent's Pokémon to their other Pokémon in any way you like."
						energyCost P, C
						attackRequirement {
              assert opp.all.size() > 1
            }
						onAttack {
              while (1) {
                def tar = opp.all.findAll{it.numberOfDamageCounters}
                if(!tar) break
                def from = tar.select("Move counter from (cancel to stop)", false)
								if(!from) break
								tar = opp.all
								tar.remove(from)
								if(!tar) break
                def to = tar.select("To?")
                from.damage -= hp(10)
                to.damage += hp(10)
                bc "Moved a damage counter from $from to $to"
                checkFaint()
              }
						}
					}

				};
			case SEVIPER_SM46:
				return basic (this, hp:HP100, type:PSYCHIC, retreatCost:2) {
					weakness PSYCHIC
					bwAbility "More Poison", {
						text "Put 1 more damage counter on your opponent's Poisoned Pokémon between turns."
						getterA (GET_EXTRA_POISON) {h->
							if(h.effect.target.owner != self.owner) {
								h.object += 1
							}
						}
					}
					move "Venomous Fang", {
						text "30 damage. Your opponent's Active Pokémon is now Poisoned."
						energyCost P, C, C
						onAttack {
							damage 30
              applyAfterDamage POISONED
						}
					}

				};
			case CRABOMINABLE_SM47:
				return evolution (this, from:"Crabrawler", hp:HP140, type:FIGHTING, retreatCost:4) {
					weakness PSYCHIC
					move "Gutsy Hammer", {
						text "80 damage. This Pokémon does damage to itself equal to the number of damage counters already on it."
						energyCost F
						onAttack {
							damage 80
              damage self.damage.value, self
						}
					}
					move "Double Stomp", {
						text "80+ damage. Flip 2 coins. This attack does 40 more damage for each heads."
						energyCost F, F, F
						onAttack {
							damage 80
              flip 2, {damage 40}
						}
					}

				};
			case ZYGARDE_SM48:
				return basic (this, hp:HP150, type:DRAGON, retreatCost:4) {
					weakness FAIRY
					move "Land Crush", {
						text "80 damage."
						energyCost C, C, C
						onAttack {
							damage 80
						}
					}
					move "Core Enforcer", {
						text "150 damage. Discard a [D] Energy and a [Y] Energy attached to this Pokémon."
						energyCost D, Y, C, C
						onAttack {
							damage 150
              discardSelfEnergy D, Y
						}
					}

				};
			case BEWEAR_SM49:
				return evolution (this, from:"Stufful", hp:HP120, type:COLORLESS, retreatCost:2) {
					weakness FIGHTING
					move "Mix-Up", {
						text "Flip a coin. If heads, discard the top 3 cards of your opponent's deck."
						energyCost C, C
						attackRequirement {
              assert opp.deck
            }
						onAttack {
							flip {opp.deck.subList(0,3).discard()}
						}
					}
					move "Tantrum", {
						text "120 damage. This Pokémon is now Confused."
						energyCost C, C, C
						onAttack {
							damage 120
              afterDamage {
                apply CONFUSED, self
              }
						}
					}

				};
			case TAPU_KOKO_GX_SM50:
				return copy (GuardiansRising.TAPU_KOKO_GX_47, this)
			case ALOLAN_MEOWTH_SM51:
				return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
					weakness FIGHTING
					resistance PSYCHIC, MINUS20
					move "Nasty Plot", {
						text "Flip a coin. If heads, search your deck for a card and put it into your hand. Then, shuffle your deck."
						attackRequirement {
              assert deck
            }
						onAttack {
							flip {
                deck.select().moveTo(hidden: true, hand)
                shuffleDeck()
              }
						}
					}
					move "Scratch", {
						text "10 damage."
						energyCost D
						onAttack {
							damage 10
						}
					}

				};
			case TSAREENA_GX_SM56:
				return evolution (this, from:"Steenee", hp:HP230, type:GRASS, retreatCost:2) {
					weakness FIRE
					move "Side Eye", {
						text "Switch 1 of your opponent's Benched Pokémon with their Active Pokémon. The new Active Pokémon is now Confused."
						energyCost G
						attackRequirement {
							assert opp.bench
						}
						onAttack {
							sw opp.active, opp.bench.select()
							apply CONFUSED, opp.active
						}
					}
					move "Jumping Side Kick", {
						text "90+ damage. If your opponent's Active Pokémon is Confused, this attack does 90 more damage."
						energyCost G, C, C
						onAttack {
							damage 90
							if(defending.isSPC(CONFUSED)) damage 90
						}
					}
					move "Queen's Command GX", {
						text "Your opponent discards 4 cards from their hand. (You can't use more than 1 GX attack in a game.)"
						energyCost G, G, C
						attackRequirement {
							gxCheck()
							assert opp.deck
						}
						onAttack {
							gxPerform()
							opp.deck.subList(0,4).discard()
						}
					}

				};
			case HO_OH_GX_SM57:
				return copy (BurningShadows.HO_OH_GX_21, this);
			case NECROZMA_GX_SM58:
				return copy (BurningShadows.NECROZMA_GX_63, this);
			case MARSHADOW_GX_SM59:
				return copy (BurningShadows.MARSHADOW_GX_80, this);
			case CHARIZARD_GX_SM60:
        return copy (BurningShadows.CHARIZARD_GX_20, this);
			case GOLISOPOD_GX_SM62:
        return copy (BurningShadows.GOLISOPOD_GX_17, this);
			case SALAZZLE_GX_SM63:
				return copy (BurningShadows.SALAZZLE_GX_25, this);
			case SHINING_HO_OH_SM70:
				return basic (this, hp:HP130, type:FIRE, retreatCost:2) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS30
					bwAbility "Golden Wing", {
						text "If this Pokémon is your Active Pokémon and is Knocked Out by damage from an opponent's attack, move up to 2 basic Energy cards from this Pokémon to your Benched Pokémon in any way you like."
						delayedA {
							before (KNOCKOUT,self) {
								if(self.active && (ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite && self.owner.pbg.bench.notEmpty && self.cards.filterByType(ENERGY)) {
									bc "Golden Wing activates"
									moveEnergy(basic: true, self, self.owner.pbg.bench)
									moveEnergy(basic: true, self, self.owner.pbg.bench)
								}
							}
						}
					}
					move "Fire Blast", {
						text "110 damage. Discard an Energy from this Pokémon."
						energyCost R, C, C, C
						onAttack {
							damage 110
							discardSelfEnergy C
						}
					}

				};
			case KOMMO_O_GX_SM71:
			  return copy (GuardiansRising.KOMMO_O_GX_100, this)
			case PIKACHU_SM76:
				return copy (PIKACHU_SM04, this)
			case MEWTWO_SM77:
				return basic (this, hp:HP120, type:PSYCHIC, retreatCost:2) {
					weakness PSYCHIC
					bwAbility "Pressure", {
						text "As long as this Pokémon is your Active Pokémon, your opponent's Active Pokémon's attack do 20 less damage (before applying Weakness and Resistance)."
						delayedA {
							after PROCESS_ATTACK_EFFECTS, {
								bg.dm().each{
									if(self.active && it.from.active && it.from.owner != self.owner && it.dmg.value && it.notNoEffect) {
										bc "Pressure -20"
										it.dmg -= hp(20)
									}
								}
							}
						}
					}
					move "Super Psy Bolt", {
						text "100 damage."
						energyCost P, P, P
						onAttack {
							damage 100
						}
					}

				};
			case CHAMPIONS_FESTIVAL_SM78:
				return copy(BlackWhitePromos.CHAMPIONS_FESTIVAL_BW95, this)
			case SHINING_CELEBI_SM79:
				return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
					weakness FIRE
					bwAbility "Time Recall", {
						text "Each of your evolved Pokémon can use any attack from its previous Evolutions. (You still need the necessary Energy to use each attack.)"
						getterA (GET_MOVE_LIST) {holder->
							if(holder.effect.target.owner==self.owner && holder.effect.target.evolution){
								for(card in holder.effect.target.cards.filterByType(POKEMON)){
									if(card!=holder.effect.target.topPokemonCard){
										holder.object.addAll(card.moves)
									}
								}
							}
						}
					}
					move "Leaf Step", {
						text "30 damage."
						energyCost G, C
						onAttack {
							damage 30
						}
					}

				};
			case HO_OH_GX_SM80:
				return copy (BurningShadows.HO_OH_GX_21, this)
			case PIKACHU_SM81:
				return copy (PIKACHU_SM04, this)
			case SHINING_LUGIA_SM82:
				return basic (this, hp:HP130, type:COLORLESS, retreatCost:2) {
					weakness LIGHTNING
					resistance FIGHTING, MINUS20
					move "Silver Wing", {
						text "60+ damage. If your opponent's Active Pokémon has an Ability, this attack does 60 more damage."
						energyCost C, C, C
						onAttack {
							damage 60
							if(defending.hasModernAbility()) damage 60
						}
					}
					move "Aero Force", {
						text "130 damage. Discard an Energy attached to this Pokémon."
						energyCost C, C, C, C
						onAttack {
							damage 130
							discardSelfEnergy(C)
						}
					}

				};
			case PIKACHU_SM98:
                return copy (BurningShadows.PIKACHU_40, this);
			case MIMIKYU_SM99:
				return copy (GuardiansRising.MIMIKYU_58, this);
			case DAWN_WINGS_NECROZMA_SM106:
				return basic (this, hp:HP130, type:PSYCHIC, retreatCost:2) {
					weakness DARKNESS
					resistance FIGHTING, MINUS20
					move "Gulf Stream", {
						text "20+ damage. If you have exactly 6 Prize cards remaining, this attack does 20 more damage for each damage counter on this Pokémon."
						energyCost P
						onAttack {
							damage 20
							if (my.prizeCardSet.size() == 6) damage 20 * self.numberOfDamageCounters
						}
					}
					move "Sword of Dawn", {
						text "130 damage. Discard 2 Energy from this Pokémon."
						energyCost P, P, P
						onAttack {
							damage 130
							discardSelfEnergy(C, C)
						}
					}
				};
			case DUSK_MANE_NECROZMA_SM107:
				return basic (this, hp:HP130, type:METAL, retreatCost:2) {
					weakness FIRE
					resistance PSYCHIC, MINUS20
					move "Dusk Shot", {
						text "This attack does 60 damage to 1 of your opponent’s Pokémon-GX or Pokémon-EX. This damage isn’t affected by Weakness or Resistance."
						energyCost M
						attackRequirement {
							assert opp.all.findAll { it.pokemonEX || it.pokemonGX }
						}
						onAttack {
							def pcs = opp.all.findAll { it.pokemonEX || it.pokemonGX }.select()
							noWrDamage 60, pcs
						}
					}
					move "Rusty Claws", {
						text "100+ damage. If your opponent has exactly 1 Prize card remaining, this attack does 100 more damage."
						energyCost M, M, C
						onAttack {
							damage 100
							if (opp.prizeCardSet.size() == 1) damage 100
						}
					}
				};
			default:
				return null;
		}
	}

}
