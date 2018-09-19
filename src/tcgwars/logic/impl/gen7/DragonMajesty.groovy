package tcgwars.logic.impl.gen7;

import tcgwars.logic.effect.gm.Attack
import tcgwars.logic.effect.gm.PlayTrainer

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

import java.util.*;
import org.apache.commons.lang.WordUtils;
import tcgwars.entity.*;
import tcgwars.logic.*;
import tcgwars.logic.card.*;
import tcgwars.logic.card.energy.*;
import tcgwars.logic.card.pokemon.*;
import tcgwars.logic.card.trainer.*;
import tcgwars.logic.effect.*;
import tcgwars.logic.effect.ability.*;
import tcgwars.logic.effect.ability.Ability.*;
import tcgwars.logic.effect.advanced.*;
import tcgwars.logic.effect.basic.*;
import tcgwars.logic.effect.blocking.*;
import tcgwars.logic.effect.event.*;
import tcgwars.logic.effect.getter.*;
import tcgwars.logic.effect.special.*;
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 * @author itrezad@gmail.com
 */
public enum DragonMajesty implements CardInfo {

	CHARMANDER_1("Charmander", 1, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
	CHARMELEON_2("Charmeleon", 2, Rarity.UNCOMMON, [POKEMON,_FIRE_,STAGE1,EVOLUTION]),
	CHARIZARD_3("Charizard", 3, Rarity.HOLORARE, [POKEMON,_FIRE_,STAGE2,EVOLUTION]),
	TORCHIC_4("Torchic", 4, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
	COMBUSKEN_5("Combusken", 5, Rarity.UNCOMMON, [POKEMON,_FIRE_,STAGE1,EVOLUTION]),
	BLAZIKEN_6("Blaziken", 6, Rarity.HOLORARE, [POKEMON,_FIRE_,STAGE2,EVOLUTION]),
	VICTINI_PRISM_STAR_7("Victini Prism Star", 7, Rarity.HOLORARE, [PRISM_STAR,POKEMON,_FIRE_,BASIC]),
	DARUMAKA_8("Darumaka", 8, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
	DARMANITAN_9("Darmanitan", 9, Rarity.UNCOMMON, [POKEMON,_FIRE_,STAGE1,EVOLUTION]),
	HEATMOR_10("Heatmor", 10, Rarity.UNCOMMON, [POKEMON,_FIRE_,BASIC]),
	RESHIRAM_GX_11("Reshiram-GX", 11, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_FIRE_,BASIC]),
	LITTEN_12("Litten", 12, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
	SALANDIT_13("Salandit", 13, Rarity.COMMON, [POKEMON,_FIRE_,BASIC]),
	SALAZZLE_14("Salazzle", 14, Rarity.UNCOMMON, [POKEMON,_FIRE_,STAGE1,EVOLUTION]),
	HORSEA_15("Horsea", 15, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	HORSEA_16("Horsea", 16, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	SEADRA_17("Seadra", 17, Rarity.UNCOMMON, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
	KINGDRA_GX_18("Kingdra-GX", 18, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_WATER_,STAGE2,EVOLUTION]),
	MAGIKARP_19("Magikarp", 19, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	GYARADOS_20("Gyarados", 20, Rarity.HOLORARE, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
	LAPRAS_21("Lapras", 21, Rarity.UNCOMMON, [POKEMON,_WATER_,BASIC]),
	TOTODILE_22("Totodile", 22, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	CROCONAW_23("Croconaw", 23, Rarity.UNCOMMON, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
	FERALIGATR_24("Feraligatr", 24, Rarity.HOLORARE, [POKEMON,_WATER_,STAGE2,EVOLUTION]),
	WOOPER_25("Wooper", 25, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	QUAGSIRE_26("Quagsire", 26, Rarity.UNCOMMON, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
	CORSOLA_27("Corsola", 27, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	FEEBAS_28("Feebas", 28, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	MILOTIC_29("Milotic", 29, Rarity.UNCOMMON, [POKEMON,_WATER_,STAGE1,EVOLUTION]),
	PHIONE_30("Phione", 30, Rarity.UNCOMMON, [POKEMON,_WATER_,BASIC]),
	WISHIWASHI_31("Wishiwashi", 31, Rarity.COMMON, [POKEMON,_WATER_,BASIC]),
	TRAPINCH_32("Trapinch", 32, Rarity.COMMON, [POKEMON,_FIGHTING_,BASIC]),
	HYDREIGON_33("Hydreigon", 33, Rarity.HOLORARE, [POKEMON,_DARKNESS_,STAGE2,EVOLUTION]),
	DRATINI_34("Dratini", 34, Rarity.COMMON, [POKEMON,_DRAGON_,BASIC]),
	DRATINI_35("Dratini", 35, Rarity.COMMON, [POKEMON,_DRAGON_,BASIC]),
	DRAGONAIR_36("Dragonair", 36, Rarity.UNCOMMON, [POKEMON,_DRAGON_,STAGE1,EVOLUTION]),
	DRAGONITE_GX_37("Dragonite-GX", 37, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_DRAGON_,STAGE2,EVOLUTION]),
	VIBRAVA_38("Vibrava", 38, Rarity.COMMON, [POKEMON,_DRAGON_,STAGE1,EVOLUTION]),
	FLYGON_39("Flygon", 39, Rarity.UNCOMMON, [POKEMON,_DRAGON_,STAGE2,EVOLUTION]),
	ALTARIA_40("Altaria", 40, Rarity.HOLORARE, [POKEMON,_DRAGON_,STAGE1,EVOLUTION]),
	ALTARIA_GX_41("Altaria-GX", 41, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_DRAGON_,STAGE1,EVOLUTION]),
	BAGON_42("Bagon", 42, Rarity.COMMON, [POKEMON,_DRAGON_,BASIC]),
	SHELGON_43("Shelgon", 43, Rarity.UNCOMMON, [POKEMON,_DRAGON_,STAGE1,EVOLUTION]),
	SALAMENCE_GX_44("Salamence-GX", 44, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_DRAGON_,STAGE2,EVOLUTION]),
	DRUGGIDON_45("Druggidon", 45, Rarity.UNCOMMON, [POKEMON,_DRAGON_,BASIC]),
	ZEKROM_46("Zekrom", 46, Rarity.HOLORARE, [POKEMON,_DRAGON_,BASIC]),
	KYUREM_47("Kyurem", 47, Rarity.HOLORARE, [POKEMON,_DRAGON_,BASIC]),
	WHITE_KYUREM_GX_48("White Kyurem-GX", 48, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_DRAGON_,BASIC]),
	ZYGARDE_49("Zygarde", 49, Rarity.UNCOMMON, [POKEMON,_DRAGON_,BASIC]),
	TURTONATOR_50("Turtonator", 50, Rarity.UNCOMMON, [POKEMON,_DRAGON_,BASIC]),
	DRAMPA_51("Drampa", 51, Rarity.UNCOMMON, [POKEMON,_DRAGON_,BASIC]),
	JANGMO_O_52("Jangmo-o", 52, Rarity.COMMON, [POKEMON,_DRAGON_,BASIC]),
	HAKAMO_O_53("Hakamo-o", 53, Rarity.COMMON, [POKEMON,_DRAGON_,STAGE1,EVOLUTION]),
	KOMMO_O_54("Kommo-o", 54, Rarity.HOLORARE, [POKEMON,_DRAGON_,STAGE2,EVOLUTION]),
	KANGASKHAN_55("Kangaskhan", 55, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
	SWABLU_56("Swablu", 56, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
	SWABLU_57("Swablu", 57, Rarity.COMMON, [POKEMON,_COLORLESS_,BASIC]),
	BLAINE_S_LAST_STAND_58("Blaine's Last Stand", 58, Rarity.HOLORARE, [TRAINER,SUPPORTER]),
	DRAGON_TALON_59("Dragon Talon", 59, Rarity.UNCOMMON, [TRAINER,ITEM,TOOL]),
	FIERY_FLINT_60("Fiery Flint", 60, Rarity.UNCOMMON, [TRAINER,ITEM]),
	LANCE_PRISM_STAR_61("Lance Prism Star", 61, Rarity.HOLORARE, [PRISM_STAR,TRAINER,SUPPORTER]),
	SWITCH_RAFT_62("Switch Raft", 62, Rarity.UNCOMMON, [TRAINER,ITEM]),
	WELA_VOLCANO_PARK_63("Wela Volcano Park", 63, Rarity.UNCOMMON, [TRAINER,STADIUM]),
	ZINNIA_64("Zinnia", 64, Rarity.UNCOMMON, [TRAINER,SUPPORTER]),
	RESHIRAM_GX_65("Reshiram-GX", 65, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_FIRE_,BASIC]),
	KINGDRA_GX_66("Kingdra-GX", 66, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_WATER_,STAGE2,EVOLUTION]),
	DRAGONITE_GX_67("Dragonite-GX", 67, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_DRAGON_,STAGE2,EVOLUTION]),
	ALTARIA_GX_68("Altaria-GX", 68, Rarity.ULTRARARE, [POKEMON_GX,POKEMON,_DRAGON_,STAGE1,EVOLUTION]),
	BLAINE_S_LAST_STAND_69("Blaines Last Stand", 69, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
	ZINNIA_70("Zinnia", 70, Rarity.ULTRARARE, [TRAINER,SUPPORTER]),
	RESHIRAM_GX_71("Reshiram-GX", 71, Rarity.SECRET, [POKEMON_GX,POKEMON,_FIRE_,BASIC]),
	ALTARIA_GX_72("Altaria-GX", 72, Rarity.SECRET, [POKEMON_GX,POKEMON,_DRAGON_,STAGE1,EVOLUTION]),
	SALAMENCE_GX_73("Salamence-GX", 73, Rarity.SECRET, [POKEMON_GX,POKEMON,_DRAGON_,STAGE2,EVOLUTION]),
	WHITE_KYUREM_GX_74("White Kyurem-GX", 74, Rarity.SECRET, [POKEMON_GX,POKEMON,_DRAGON_,BASIC]),
	DRAGON_TALON_75("Dragon Talon", 75, Rarity.SECRET, [TRAINER,ITEM,TOOL]),
	FIERY_FLINT_76("Fiery Flint", 76, Rarity.SECRET, [TRAINER,ITEM]),
	SWITCH_RAFT_77("Switch Raft", 77, Rarity.SECRET, [TRAINER,ITEM]),
	ULTRA_NECROZMA_GX_78 ("Ultra Necrozma-GX", 78, Rarity.SECRET, [BASIC, POKEMON, POKEMON_GX, ULTRA_BEAST, _DRAGON_]),

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	DragonMajesty(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.BURNING_SHADOWS;
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
			case CHARMANDER_1:
			return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Fire Fang" , {
					text "20 damage. Your opponent's Active Pokémon is now Burned."
					energyCost R,C
					onAttack {
						damage 20
						applyAfterDamage BURNED
					}
				}
			};
			case CHARMELEON_2:
			return 	evolution (this, from:"Charmander", hp:HP080, type:FIRE, retreatCost:2) {
				weakness WATER
				bwAbility "Burning Fighter" , {
					text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may discard the top 5 cards of your deck. If any of those cards are [R] Energy cards, attach them to this Pokémon."
					onActivate{reason ->
	            if(reason == PLAY_FROM_HAND && confirm("Burning Fighter")){
								def list = my.deck.subList(0,5).filterByType(BASIC_ENERGY).filterByEnergyType(R)
		            def num = list.size()
		            if(num){
		              list.each{attachEnergy(self, it)}
		            }
		            my.deck.subList(0,5-num).discard()
	            }
	          }
					}
				}
				move "Flamethrower" , {
					text "80 damage. Discard an Energy from this Pokémon."
					energyCost R,R,C
					onAttack{
						discardSelfEnergy C
						damage 80
					}
				}
			};
			case CHARIZARD_3:
			return 	evolution (this, from:"Charmeleon", hp:HP160, type:FIRE, retreatCost:2) {
				weakness WATER
				bwAbility "Resolute Flame" , {
					text "This Pokémon's attacks do 30 more damage to your opponent's Active Pokémon for each of their Pokémon-GX and Pokémon-EX in play."
					delayedA{
						before APPLY_ATTACK_DAMAGES, {
							bg.dm().each {
								def plusDmg = self.owner.opposite.pbg.all.findAll{it.pokemonEX || it.pokemonGX}.size() * 30
								if(it.from == self && plusDmg && it.dmg.value && it.notNoEffect) {
									bc "Resolute Flame +$plusDmg"
									it.dmg += hp(plusDmg)
								}
							}
						}
					}
				}
				move "Fiery Blast" , {
					text "130 damage. Discard an Energy from this Pokémon."
					energyCost R,R,C
					onAttack{
						discardSelfEnergy C
						damage 130
					}
				}
			};
			case TORCHIC_4:
			return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Singe" , {
					text "Flip a coin. If heads, your opponent's Active Pokémon is now Burned."
					energyCost C
					onAttack{
						flip{apply BURNED}
					}
				}
			};
			case COMBUSKEN_5:
			return 	evolution (this, from:"Torchic", hp:HP080, type:FIRE, retreatCost:1) {
				weakness WATER
				bwAbility "Natural Cure" , {
					text "Whenever you attach an Energy card from your hand to this Pokémon, remove all Special Conditions from it."
					delayedA{
						before ATTACH_ENERGY, {
							if (ef.reason == PLAY_FROM_HAND && bg.currentTurn == self.owner) {
								bc "Natural Cure cure your Pokémon from its Special Conditions."
								clearSpecialCondition(self, SRC_ABILITY)
							}
						}
					}
				}
				move "Lunge" , {
					text "60 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C,C
					onAttack{
						flip 1,{damage 60},{bc "Lunge failed"}
					}
				}
			};
			case BLAZIKEN_6:
			return 	evolution (this, from:"Combusken", hp:HP150, type:FIRE, retreatCost:2) {
				weakness WATER
				bwAbility "Firestarter" , {
					text "Once during your turn (before your attack), you may attach a [R] Energy card from your discard pile to 1 of your Benched Pokémon."
					actionA {
						checkLastTurn()
						assert my.bench
						assert my.discard.filterByEnergyType(R)
						powerUsed()
						attachEnergyFrom(type : R, my.discard, my.bench)
					}
				}
				move "Fire Stream" , {
					text "90 damage. Discard a [R] Energy from this Pokémon. This attack does 20 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost R,C,C
					onAttack{
						damage 90
						discardSelfEnergy R
						opp.bench.each{damage 20, it}
					}
				}
			};
			case VICTINI_PRISM_STAR_7:
			return basic (this, hp:HP090, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Infinity" , {
					text "20× damage. This attack does 20 damage for each basic Energy card in your discard pile. Then, shuffle those cards into your deck."
					energyCost R,R
					onAttack{
						def basicInDscd = my.discard.filterByType(BASIC_ENERGY)
						damage 20*basicInDscd.size()
						basicInDscd.moveTo(my.deck)
						shuffleDeck()
					}
				}
			};
			case DARUMAKA_8:
			return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Damage Rush" , {
					text "10+ damage. Flip a coin until you get tails. This attack does 30 more damage for each heads."
					energyCost C,C
					onAttack{
						damage 10
						flipUntilTails{damage 30}
					}
				}
			};
			case DARMANITAN_9:
			return 	evolution (this, from:"Darumaka", hp:HP130, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Heat Assist" , {
					text "Attach up to 3 [R] Energy cards from your hand to your Pokémon in any way you like."
					energyCost R
					onAttack{
						attachEnergyFrom(type:R,my.hand,my.all)
						attachEnergyFrom(type:R,my.hand,my.all)
						attachEnergyFrom(type:R,my.hand,my.all)
					}
				}
				move "Darmani-Hands" , {
					text "30+ damage. Flip 4 coins. This attack does 50 more damage for each heads."
					energyCost R,R,C
					onAttack{
						damage 30
						flip 4,{damage 50}
					}
				}
			};
			case HEATMOR_10:
			return basic (this, hp:HP110, type:FIRE, retreatCost:2) {
				weakness WATER
				move "Singe" , {
					text "Your opponent's Active Pokémon is now Burned."
					energyCost R
					onAttack{
						apply BURNED
					}
				}
				move "Charring Breath" , {
					text "120 damage. If your opponent's Active Pokémon isn't Burned, this attack does nothing."
					energyCost R,R
					onAttack{
						if(defending.isSPC(BURNED)){
							damage 120
						}
						else{bc"Charring Breath has no effect"}
					}
				}
			};
			case RESHIRAM_GX_11:
			return basic (this, hp:HP180, type:FIRE, retreatCost:2) {
				weakness METAL
				move "Flame Charge" , {
					text "Search your deck for up to 2 [R] Energy cards and attach them to this Pokémon. Then, shuffle your deck."
					energyCost C
					attackRequirement{
						assert my.deck : "There is no cards in your deck"
					}
					onAttack{
						my.deck.search(max : 2,"Search your deck for up to 2 [R] Energy cards",basicEnergyFilter(R)).each{
							attachEnergy(self,it)
						}
						shuffleDeck()
					}
				}
				move "Scorching Column" , {
					text "110 damage. Your opponent's Active Pokémon is now Burned."
					energyCost R,R,R,C
					onAttack{
						damage 110
						applyAfterDamage BURNED
					}
				}
				move "Vermilion GX" , {
					text "180 damage. You may attach up to 5 Fire Energy cards from your hand to your Pokémon in any way you like. (You can't use more than 1 GX attack in a game.)"
					energyCost R,R,R,C
					attackRequirement{
						gxCheck()
						assert my.deck : "There is no cards in your deck"
					}
					onAttack{
						gxPerform()
						damage 180
						afterDamage{
							my.deck.filterByType(BASIC_ENERGY).filterByEnergyType(R).select(max : 5,"Select up to 5 Fire Energy cards.").each{
								attachEnergy(my.all,it)
							}
						}
					}
				}
			};
			case LITTEN_12:
			return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Fury Swipes" , {
					text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
					energyCost R
					onAttack{
						flip 3,{damage 10}
					}
				}
			};
			case SALANDIT_13:
			return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Call for Family" , {
					text "Search your deck for a Basic Pokémon and put it onto your Bench. Then, shuffle your deck."
					energyCost C
					callForFamily(basic:true,1,delegate)
				}
				move "Dig Claws" , {
					text "20 damage."
					energyCost R,C
					onAttack{
						damage 20
					}
				}
			};
			case SALAZZLE_14:
			return 	evolution (this, from:"Salandit", hp:HP110, type:FIRE, retreatCost:1) {
				weakness WATER
				move "Ring of Fire" , {
					text "20 damage. Your opponent's Active Pokémon is now Burned. It can't retreat during your opponent's next turn."
					energyCost R
					onAttack{
						damage 20
						afterDamage{
							apply BURNED
							cantRetreat defending
						}
					}
				}
				move "Flamethrower" , {
					text "80 damage. Discard an Energy from this Pokémon."
					energyCost R,C
					onAttack{
						damage 80
						discardSelfEnergy C
					}
				}
			};
			case HORSEA_15:
			return basic (this, hp:HP040, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Splatter" , {
					text "This attack does 20 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost W
					onAttack{
						damage 20, opp.all.select("Select the Pokémon to target")
					}
				}
			};
			case HORSEA_16:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Hydro Pump" , {
					text "10+ damage. This attack does 10 more damage times the amount of [W] Energy attached to this Pokémon."
					energyCost C
					onAttack{
						damage 10+10*self.cards.energyCount(W)
					}
				}
			};
			case SEADRA_17:
			return 	evolution (this, from:"Horsea", hp:HP090, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Hydro Pump" , {
					text "10+ damage. This attack does 20 more damage times the amount of [W] Energy attached to this Pokémon."
					energyCost C
					onAttack{
						damage 10+20*self.cards.energyCount(W)
					}
				}
			};
			case KINGDRA_GX_18:
			return 	evolution (this, from:"Seadra", hp:HP230, type:WATER, retreatCost:2) {
				weakness GRASS
				move "Hydro Pump" , {
					text "10+ damage. This attack does 50 more damage times the amount of [W] Energy attached to this Pokémon."
					energyCost C
					onAttack{
						damage 10+50*self.cards.energyCount(W)
					}
				}
				move "Reverse Thrust" , {
					text "30 damage. Switch this Pokémon with 1 of your Benched Pokémon."
					energyCost W
					onAttack{
						damage 30
						afterDamage{
							if(my.bench){
								sw self, my.bench.select("Select the new active")
							}
						}
					}
				}
				move "Maelstrom GX" , {
					text "This attack does 40 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can't use more than 1 GX attack in a game.)"
					energyCost W
					attackRequirement{
						gxCheck()
					}
					onAttack{
						opp.each{
							damage 40, it
						}
					}
				}
			};
			case MAGIKARP_19:
			return basic (this, hp:HP030, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				move "Water Splash" , {
					text "10+ damage. Flip a coin. If heads, this attack does 10 more damage."
					energyCost W
					onAttack{
						damage 10
						flip {damage 10}
					}
				}
			};
			case GYARADOS_20:
			return 	evolution (this, from:"Magikarp", hp:HP160, type:WATER, retreatCost:4) {
				weakness LIGHTNING
				bwAbility "Commotion" , {
					text "If this Pokémon is your Active Pokémon and is damaged by an opponent's attack (even if this Pokémon is Knocked Out), put 2 damage counters on each of your Benched Pokémon."
					delayedA (priority: LAST) {
						before APPLY_ATTACK_DAMAGES, {
							if(self.active && bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
								bc "Commotion activates"
								directDamage(20, ef.attacker)
							}
						}
					}
				}
				move "Wild Tail" , {
					text "160 damage. You may discard any Stadium card in play."
					energyCost W,W,C
					onAttack{
						damage 160
						if(bg.stadiumInfoStruct.stadiumCard) {
							if(confirm("Discard the stadium in play?")){
								discard bg.stadiumInfoStruct.stadiumCard
							}
						}
					}
				}
			};
			case LAPRAS_21:
			return basic (this, hp:HP120, type:WATER, retreatCost:2) {
				weakness GRASS
				move "Aqua Bullet" , {
					text "20 damage. This attack does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost W
					onAttack{
						damage 20
						if(opp.bench){
							damage 20, opp.bench.select("Select the Pokémon to target")
						}
					}
				}
				move "Hydro Pump" , {
					text "70+ damage. This attack does 10 more damage times the amount of [W] Energy attached to this Pokémon."
					energyCost C,C,C
					onAttack{
						damage 70+10*self.cards.energyCount(W)
					}
				}
			};
			case TOTODILE_22:
			return basic (this, hp:HP060, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Leer" , {
					text "Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
					energyCost C
					onAttack{
						flip{apply PARALYZED}
					}
				}
				move "Fury Swipes" , {
					text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
					energyCost W
					onAttack{
						flip 3,{damage 10}
					}
				}
			};
			case CROCONAW_23:
			return 	evolution (this, from:"Totodile", hp:HP090, type:WATER, retreatCost:2) {
				weakness GRASS
				move "Tackle" , {
					text "30 damage."
					energyCost C,C
					onAttack{
						damage 30
					}
				}
				move "Sweep Away" , {
					text "90 damage. Discard the top 3 cards of your deck."
					energyCost W,W,C
					onAttack{
						damage 90
						my.deck.subList(0,3).discard()
					}
				}
			};
			case FERALIGATR_24:
			return 	evolution (this, from:"Croconaw", hp:HP160, type:WATER, retreatCost:3) {
				weakness GRASS
				bwAbility "Downpour" , {
					text "As often as you like during your turn (before your attack), you may discard a [W] Energy card from your hand."
					actionA{
						assert my.hand.filterByType(BASIC_ENERGY).filterByEnergyType(W)
						my.hand.filterByType(BASIC_ENERGY).filterByEnergyType(W).select("Select a [W] to discard").discard()
					}
				}
				move "Riptide" , {
					text "10+ damage. This attack does 20 more damage for each [W] Energy card in your discard pile. Then, shuffle those cards into your deck."
					energyCost W,W
					onAttack{
						def basicInDscd = my.discard.filterByType(BASIC_ENERGY).filterByEnergyType(W)
						damage 10+20*basicInDscd.size()
						basicInDscd.moveTo(my.deck)
						shuffleDeck()
					}
				}
			};
			case WOOPER_25:
			return basic (this, hp:HP070, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Ram" , {
					text "10 damage."
					energyCost C
					onAttack{
						damage 10
					}
				}
				move "Rain Splash" , {
					text "20 damage."
					energyCost W,C
					onAttack{
						damage 20
					}
				}
			};
			case QUAGSIRE_26:
			return 	evolution (this, from:"Wooper", hp:HP120, type:WATER, retreatCost:2) {
				weakness GRASS
				bwAbility "Wash Out" , {
					text "As often as you like during your turn (before your attack), you may move a [W] Energy from 1 of your Benched Pokémon to your Active Pokémon."
					actionA{
						assert my.bench : "You don't have Pokémon on your bench"
						moveEnergy(type:W,my.bench,my.active)
					}
				}
				move "Hydro Pump" , {
					text "60+ damage. This attack does 20 more damage times the amount of [W] Energy attached to this Pokémon."
					energyCost C,C,C
					onAttack{
						damage 60+20*self.cards.energyCount(W)
					}
				}
			};
			case CORSOLA_27:
			return basic (this, hp:HP090, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Bubble Shoot" , {
					text "This attack does 20 damage times the amount of [W] Energy attached to this Pokémon to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost W
					onAttack{
						damage 20*self.cards.energyCount(W), opp.all.select("Select the Pokémon to target")
					}
				}
			};
			case FEEBAS_28:
			return basic (this, hp:HP030, type:WATER, retreatCost:1) {
				weakness GRASS
				bwAbility "Submerge" , {
					text "As long as this Pokémon is on your Bench, prevent all damage done to this Pokémon by attacks (both yours and your opponent's)."
					delayedA {
						before APPLY_ATTACK_DAMAGES, {
							bg.dm().each{
								if(!self.active && it.to == self){
									bc "Submerge prevent all damage to $self"
									it.dmg=hp(0)
								}
							}
						}
					}
				}
				move "Rain Splash" , {
					text "10 damage."
					energyCost W
					onAttack{
						damage 10
					}
				}
			};
			case MILOTIC_29:
			return 	evolution (this, from:"Feebas", hp:HP120, type:WATER, retreatCost:1) {
				weakness GRASS
				move "Aurora Wave" , {
					text "30 damage. Your opponent's Active Pokémon is now Confused."
					energyCost W
					onAttack{
						damage 30
						applyAfterDamage CONFUSED
					}
				}
				move "Aqua Split" , {
					text "40 damage. This attack does 40 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost W,W,W
					onAttack{
						damage 40
						if(opp.bench){
							multiSelect(opp.bench, 2).each{
						    targeted(it){
						      damage 40, it
						    }
						  }
						}
					}
				}
			};
			case PHIONE_30:
			return basic (this, hp:HP070, type:WATER, retreatCost:1) {
				weakness GRASS
				bwAbility "Murmurs of the Sea" , {
					text "Your [W] Pokémon can't be Confused. If those Pokémon are already Confused, remove that Special Condition."
					def murmursOfSea={
						for(pcs in all){
							if(pcs.isSPC(CONFUSED) && pcs.owner==self.owner && pcs.types.contains(W)){
								bc "Murmurs of the Sea clears confusion"
								clearSpecialCondition(pcs, SRC_ABILITY)
							}
						}
					}
					delayedA {
						before APPLY_SPECIAL_CONDITION, {
							def pcs=e.getTarget(bg)
							if(pcs.owner==self.owner && ef.type == CONFUSED && pcs.types.contains(W)){
								bc "Murmurs of the Sea prevents special conditions"
								prevent()
							}
						}
					}
					onActivate {
						murmursOfSea()
					}
				}
				move "Water Pulse" , {
					text "30 damage. Your opponent's Active Pokémon is now Asleep."
					energyCost W,W
					onAttack{
						damage 30
						applyAfterDamage ASLEEP
					}
				}
			};
			case WISHIWASHI_31:
			return basic (this, hp:HP030, type:WATER, retreatCost:1) {
				weakness LIGHTNING
				bwAbility "Meet Up" , {
					text "Your Wishiwashi-GX in play get +20 HP, and their attacks do 20 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
					def effect1
					def effect2
					onActivate {
						effect1 = getter GET_FULL_HP, { Holder h->
							if(h.effect.target.name == "Wishiwashi-GXs" && h.effect.target.owner == self.owner) {
						    h.object += hp(20)
						  }
						}
						effect2 = delayed{
							before APPLY_ATTACK_DAMAGES, {
								bg.dm().each {
									if(it.from.name == "Wishiwashi-GXs" &&  && it.dmg.value && it.notNoEffect) {
										bc "Meet Up +$20"
										it.dmg += hp(20)
									}
								}
							}
						}
					}
					onDeactivate {
						effect1.unregister()
						effect2.unregister()
						new CheckAbilities().run(bg)
					}
				}
				move "Water Gun" , {
					text "20 damage."
					energyCost W
					onAttack{
						damage 20
					}
				}
			};
			case TRAPINCH_32:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness GRASS
				move "Mini Earthquake" , {
					text "20 damage. This attack does 10 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost F
					onAttack{
						damage 20
						if(my.bench){
							my.bench.each{
								damage 10, it
							}
						}
					}
				}
			};
			case HYDREIGON_33:
			return copy(CrimsonInvasion.HYDREIGON_62, this);
			case DRATINI_34:
			return basic (this, hp:HP060, type:DRAGON, retreatCost:2) {
				weakness FAIRY
				move "Wrap" , {
					text "10 damage. Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
					energyCost L
					onAttack{
						damage 10
						flipThenApplySC PARALYZED
					}
				}
			};
			case DRATINI_35:
			return basic (this, hp:HP070, type:DRAGON, retreatCost:2) {
				weakness FAIRY
				move "Tail Whap" , {
					text "30 damage."
					energyCost W,C
					onAttack{
						damage 30
					}
				}
			};
			case DRAGONAIR_36:
			return 	evolution (this, from:"Dratini", hp:HP100, type:DRAGON, retreatCost:2) {
				weakness FAIRY
				move "Dragon Tail" , {
					text "60× damage. Flip 2 coins. This attack does 60 damage for each heads."
					energyCost C,C,C
					onAttack{
						flip 2,{damage 60}
					}
				}
				move "Waterfall" , {
					text "60 damage."
					energyCost W,L,C,C
					onAttack{
						damage 60
					}
				}
			};
			case DRAGONITE_GX_37:
			return 	evolution (this, from:"Dragonair", hp:HP250, type:DRAGON, retreatCost:3) {
				weakness FAIRY
				move "Dragon Claw" , {
					text "70 damage."
					energyCost L
					onAttack{
						damage 70
					}
				}
				move "Giga Impact" , {
					text "200 damage. This Pokémon can't attack during your next turn."
					energyCost W,L,C,C
					onAttack{
						damage 200
						cantAttackNextTurn self
					}
				}
				move "Dragonporter GX" , {
					text "Put 3 [N] Pokémon from your discard pile onto your Bench. (You can't use more than 1 GX attack in a game.)"
					energyCost C,C,C
					attackRequirement{
						gxCheck()
						assert my.discard.findAll{it.types.contains(N)}
					}
					onAttack{
						def maxSpace = Math.min(my.bench.freeBenchCount,3)
						my.discard.findAll{it.types.contains(N)}.select(max:maxSpace,"Select $maxSpace [N] Pokémon to put onto your Bench").each{
	            my.discard.remove(it);
							benchPCS(it)
						}
					}
				}
			};
			case VIBRAVA_38:
			return 	evolution (this, from:"Trapinch", hp:HP080, type:DRAGON, retreatCost:1) {
				resistance FAIRY, MINUS20
				move "Sonic Edge" , {
					text "50 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
					energyCost F,C
					onAttack{
						 shredDamage 50, defending
					}
				}
			};
			case FLYGON_39:
			return 	evolution (this, from:"Vibrava", hp:HP140, type:DRAGON, retreatCost:1) {
				weakness FAIRY
				bwAbility "Dragon Guard" , {
					text "Prevent all effects of your opponent's attacks, except damage, done to your [N] Pokémon. (Existing effects are not removed.)"
					delayedA {
		        before null, null, ATTACK, {
		            if(ef instanceof TargetedEffect && bg.currentTurn==self.owner && ef.effectType != DAMAGE){
		                def pcs = (ef as TargetedEffect).getResolvedTarget(bg, e)
		                if(pcs != null && pcs.benched && pcs.owner == self.owner){
		                    bc "Dragon Guard prevents effect to [N] Pokémon"
		                    prevent()
		                }
		            }
		        }
					}
				}
				move "Sand Tomb" , {
					text "110 damage. The Defending Pokémon can't retreat during your opponent's next turn."
					energyCost F,F,C
					onAttack{
						damage 110
						cantRetreat defending
					}
				}
			};
			case ALTARIA_40:
			return 	evolution (this, from:"Swablu", hp:HP080, type:DRAGON, retreatCost:1) {
				weakness FAIRY
				bwAbility "Fight Song" , {
					text "Your [N] Pokémon's attacks do 20 more damage to your opponent's Active Pokémon (before applying Weakness and Resistance)."
					delayedA{
						before APPLY_ATTACK_DAMAGES, {
							bg.dm().each {
								if(it.from.owner == self.owner && it.dmg.value && it.notNoEffect && it.from.types.contains(N)) {
									bc "Fight Song +20"
									it.dmg += hp(plusDmg)
								}
							}
						}
					}
				}
				move "Pierce" , {
					text "20 damage."
					energyCost C,C
					onAttack{
						damage 20
					}
				}
			};
			case ALTARIA_GX_41:
			return 	evolution (this, from:"Swablu", hp:HP200, type:DRAGON, retreatCost:1) {
				weakness FAIRY
				move "Bright Tone" , {
					text "50 damage. Prevent all damage done to this Pokémon by attacks from Pokémon-GX and Pokémon-EX during your opponent's next turn."
					energyCost Y,C
					attack{
						damage 50
						afterDamage{
							preventAllDamageFromCustomPokemonNextTurn(thisMove, self, {it.pokemonGX || it.pokemonEX})
						}
					}
				}
				move "Sonic Edge" , {
					text "110 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
					energyCost W,Y,C
					onAttack{
						shredDamage 110, defending
					}
				}
				move "Euphoria GX" , {
					text "Your opponent's Active Pokémon is now Asleep. Heal all damage from all of your Pokémon. (You can't use more than 1 GX attack in a game.)"
					energyCost Y,C
					attackRequirement{
						gxCheck()
					}
					onAttack{
						gxPerform()
						apply ASLEEP
						my.all.each{
							heal it.numberOfDamageCounters*10,it
						}
					}
				}
			};
			case BAGON_42:
			return basic (this, hp:HP060, type:DRAGON, retreatCost:1) {
				weakness FAIRY
				move "Risky Kick" , {
					text "10 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C
					onAttack{
						flip 1,{damage 10},{bc "Risky Kick failed"}
					}
				}
				move "Dragon Eye" , {
					text "20 damage. Your opponent's Active Pokémon is now Asleep."
					energyCost R,W
					onAttack{
						damage 20
						applyAfterDamage ASLEEP
					}
				}
			};
			case SHELGON_43:
			return 	evolution (this, from:"Bagon", hp:HP080, type:DRAGON, retreatCost:2) {
				weakness FAIRY
				bwAbility "Energy Guard" , {
					text "If this Pokémon has any basic Energy attached to it, it takes 20 less damage from attacks (after applying Weakness and Resistance)."
					delayedA {
						before APPLY_ATTACK_DAMAGES, {
							bg.dm().each {
								if(it.to==self && it.cards.filterByType(BASIC_ENERGY) && it.dmg.value && it.notNoEffect){
									bc "Energy Guard -20"
									it.dmg -= hp(20)
								}
							}
						}
					}
				}
				move "Rollout" , {
					text "30 damage."
					energyCost C,C
					onAttack{
						damage 30
					}
				}
			};
			case SALAMENCE_GX_44:
			return 	evolution (this, from:"Shelgon", hp:HP250, type:DRAGON, retreatCost:2) {
				weakness FAIRY
				bwAbility "Dragon Lift" , {
					text "Your Pokémon in play have no Retreat Cost, except Pokémon-GX and Pokémon-EX."
					getterA (GET_RETREAT_COST, BEFORE_LAST,self) {h->
						if(!h.effect.target.pokemonEX && !h.effect.target.pokemonGX) {
							h.object = 0
						}
					}
				}
				move "Bright Flame" , {
					text "200 damage. Discard 2 Energy from this Pokémon."
					energyCost R,W,C,C
					onAttack{
						damage 200
						discardSelfEnergy C,C
					}
				}
				move "Flame Jet GX" , {
					text "This attack does 120 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) (You can't use more than 1 GX attack in a game.)"
					energyCost R,C,C
					attackRequirement{
						gxCheck()
					}
					onAttack{
						gxPerform()
						damage 120, opp.all.select("Select the Pokémon to target.")
					}
				}
			};
			case DRUGGIDON_45:
			return basic (this, hp:HP110, type:DRAGON, retreatCost:1) {
				weakness FAIRY
				bwAbility "Rough Skin" , {
					text "If this Pokémon is your Active Pokémon and is damaged by an opponent's attack (even if this Pokémon is Knocked Out), put 3 damage counters on the Attacking Pokémon."
					delayedA (priority: LAST) {
						before APPLY_ATTACK_DAMAGES, {
							if(self.active && bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
								bc "Rough Skin activates"
								directDamage(30, ef.attacker)
							}
						}
					}
				}
				move "Dragon Claw" , {
					text "100 damage."
					energyCost R,W,C
					onAttack{
						damage 100
					}
				}
			};
			case ZEKROM_46:
			return basic (this, hp:HP130, type:DRAGON, retreatCost:3) {
				weakness FAIRY
				move "Shred" , {
					text "70 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
					energyCost L,C,C
					onAttack{
						shredDamage 70, defending
					}
				}
				move "Bolt Strike" , {
					text "150 damage. Flip a coin. If tails, this Pokémon does 50 damage to itself."
					energyCost L,L,C,C
					onAttack{
						flip 1,{damage 150},{
							damage 150
							damage 50, self
						}
					}
				}
			};
			case KYUREM_47:
			return basic (this, hp:HP130, type:DRAGON, retreatCost:2) {
				weakness FAIRY
				move "Outrage" , {
					text "20+ damage. This attack does 10 more damage for each damage counter on this Pokémon."
					energyCost C,C
					onAttack{
						damage 20+10*self.numberOfDamageCounters
					}
				}
				move "Frost Spear" , {
					text "100 damage. This attack does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
					energyCost W,W,C
					onAttack{
						damage 100
						if(opp.bench){
							damage 20, opp.bench.select("Select the Pokémon to target")
						}
					}
				}
			};
			case WHITE_KYUREM_GX_48:
			return basic (this, hp:HP190, type:DRAGON, retreatCost:3) {
				weakness FAIRY
				move "Shred" , {
					text "40 damage. This attack's damage isn't affected by any effects on your opponent's Active Pokémon."
					energyCost R
					onAttack{
						shredDamage 40, defending
					}
				}
				move "Raging Blade" , {
					text "80+ damage. If this Pokémon has any damage counters on it, this attack does 80 more damage."
					energyCost R,W,C
					onAttack{
						damage 80
						if(self.numberOfDamageCounters) damage 80
					}
				}
				move "Dragon Nova GX" , {
					text "200 damage. Your opponent's Active Pokémon is now Burned and Paralyzed. (You can't use more than 1 GX attack in a game.)"
					energyCost R,R,W,C
					attackRequirement{
						gxCheck()
					}
					onAttack{
						damage 200
						afterDamage{
							apply BURNED
							apply PARALYZED
						}
					}
				}
			};
			case ZYGARDE_49:
			return basic (this, hp:HP130, type:DRAGON, retreatCost:3) {
				weakness FAIRY
				move "Rumble" , {
					text "20 damage. The Defending Pokémon can't retreat during your opponent's next turn."
					energyCost F
					onAttack{
						damage 20
						CantRetreat defending
					}
				}
				move "Raging Blade" , {
					text "60+ damage. If this Pokémon has any damage counters on it, this attack does 60 more damage."
					energyCost F,C,C
					onAttack{
						damage 60
						if(self.numberOfDamageCounters) damage 60
					}
				}
			};
			case TURTONATOR_50:
			return basic (this, hp:HP110, type:DRAGON, retreatCost:3) {
				weakness FAIRY
				move "Explosive Jet" , {
					text "50× damage. Discard any amount of [R] Energy from your Pokémon. This attack does 50 damage for each card you discarded in this way."
					energyCost R,R,R
					onAttack {
						def count=0
						while (1) {
							def tar = my.all.findAll {it.cards.filterByEnergyType(R).notEmpty()}
							if (!tar) break
							def pcs = tar.select("Pokemon that has [R] energy to discard. Cancel to stop", false)
							if (!pcs) break
							pcs.cards.filterByEnergyType(R).select("[R] Energy to discard").discard()
							count++
						}
						damage 50*count
					}
				}
			};
			case DRAMPA_51:
			return basic (this, hp:HP120, type:DRAGON, retreatCost:1) {
				weakness FAIRY
				move "Dragon Wisdom" , {
					text "20 damage. Attach a basic Energy card from your discard pile to 1 of your [N] Pokémon."
					energyCost C
					onAttack{
						damage 20
						if(my.discard.filterByType(BASIC_ENERGY)){
							attachEnergyFrom(basic:true, my.discard, my.all.findAll{it.types.contains(N)})
						}
					}
				}
				move "Hyper Voice" , {
					text "80 damage."
					energyCost C,C,C
					onAttack{
						damage 80
					}
				}
			};
			case JANGMO_O_52:
			return basic (this, hp:HP060, type:DRAGON, retreatCost:1) {
				weakness FAIRY
				move "Rigidify" , {
					text "During your opponent's next turn, this Pokémon takes 20 less damage from attacks (after applying Weakness and Resistance)."
					energyCost L
					onAttack {
						reduceDamageNextTurn(hp(20),thisMove)
					}
				}
				move "Dragon Claw" , {
					text "20 damage."
					energyCost F,C
					onAttack{
						damage 20
					}
				}
			};
			case HAKAMO_O_53:
			return 	evolution (this, from:"Jangmo-o", hp:HP090, type:DRAGON, retreatCost:2) {
				weakness FAIRY
				move "Guard Press" , {
					text "30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
					energyCost C,C
					onAttack {
						damage 30
						reduceDamageNextTurn(hp(30),thisMove)
					}
				}
				move "Dragon Claw" , {
					text "70 damage."
					energyCost L,F,C
					onAttack{
						damage 70
					}
				}
			};
			case KOMMO_O_54:
			return 	evolution (this, from:"Hakamo-o", hp:HP160, type:DRAGON, retreatCost:2) {
				weakness FAIRY
				move "Guard Press" , {
					text "60 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
					energyCost L,C
					onAttack{
						damage 60
						reduceDamageNextTurn(hp(30),thisMove)
					}
				}
				move "Raging Uppercut" , {
					text "90+ damage. If this Pokémon has 8 or more damage counters on it, this attack does 120 more damage."
					energyCost F,C,C
					onAttack{
						damage 90
						if(self.numberOfDamageCounters >= 8) damage 120
					}
				}
			};
			case KANGASKHAN_55:
			return basic (this, hp:HP120, type:COLORLESS, retreatCost:2) {
				weakness FIGHTING
				move "Fetch" , {
					text "Draw a card."
					energyCost C
					attackRequirement{
						assert my.deck : "There is no cards in your deck"
					}
					onAttack{
						draw 1
					}
				}
				move "Headbutt" , {
					text "30 damage."
					energyCost C,C
					onAttack{
						damage 30
					}
				}
				move "One-Two Punch" , {
					text "60+ damage. Flip a coin. If heads, this attack does 30 more damage."
					energyCost C,C,C
					onAttack{
						damage 60
						flip {damage 30}
					}
				}
			};
			case SWABLU_56:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				move "Collect" , {
					text "Draw a card."
					energyCost C
					attackRequirement{
						assert my.deck : "There is no cards in your deck"
					}
					onAttack{
						draw 1
					}
				}
				move "Peck" , {
					text "20 damage."
					energyCost C,C
					onAttack{
						damage 20
					}
				}
			};
			case SWABLU_57:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness LIGHTNING
				resistance FIGHTING, MINUS20
				move "Sing" , {
					text "Your opponent's Active Pokémon is now Asleep."
					energyCost C
					onAttack{
						apply ASLEEP
					}
				}
			};
			case BLAINES_LAST_STAND_58:
			return supporter(this) {
			text "You can play this card only when it is the last card in your hand.\nDraw 2 cards for each [R] Pokémon you have in play.\nYou may play only 1 Supporter card during your turn (before your attack).\n"
				onPlay {
					draw 2*my.all.findAll{it.types.contains(R)}
				}
				playRequirement{
					assert !my.hand.getExcludedList(thisCard) : "this is not your only card in hand"
				}
			};
			case DRAGON_TALON_59:
			return pokemonTool (this) {
				text "Attach a Pokémon Tool to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it.\nIf the [N] Pokémon this card is attached to is your Active Pokémon and is damaged by an opponent's attack (even if that Pokémon is Knocked Out), put 3 damage counters on the Attacking Pokémon.\nYou may play as many Item cards as you like during your turn (before your attack).\n"
				def eff
				onPlay {reason->
					eff = delayed{
						before APPLY_ATTACK_DAMAGES, {
							bg.dm().each{
								if(self.active && self.types.contains(N) && bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
									bc "Dragon Talon activates"
									directDamage(30, ef.attacker)
								}
							}
						}
					}
				}
				onRemoveFromPlay {
					eff.unregister()
				}
			};
			case FIERY_FLINT_60:
			return itemCard (this) {
				text "You can play this card only if you discard 2 other cards from your hand.\nSearch your deck for up to 4 [R] Energy cards, reveal them, and put them into your hand. Then, shuffle your deck.\nYou may play as many Item cards as you like during your turn (before your attack).\n"
				onPlay {
					my.hand.getExcludedList(thisCard).select(count: 2, "Discard").discard()
					my.deck.search(max:4,"Select up to 4 [R] Energy cards",energyFilter(R)).showToOpponent("The selected [R] Energy cards").moveTo(my.hand)
					shuffleDeck()
				}
				playRequirement{
					assert my.hand.getExcludedList(thisCard).size() >= 2
					assert my.deck
				}
			};
			case LANCE_PRISM_STAR_61:
			return supporter(this) {
				text "You can play this card only if 1 of your Pokémon was Knocked Out during your opponent's last turn.\nSearch your deck for up to 2 [N] Pokémon and put them onto your Bench. Then, shuffle your deck.\nYou may play only 1 Supporter card during your turn (before your attack).\n"
				onPlay {
					def maxSpace = Math.min(my.bench.freeBenchCount,2)
					my.deck.search(max:maxSpace,"Select $maxSpace [N] Pokémon to put onto your Bench",{it.types.contains(N)}).each{
						my.deck.remove(it);
						benchPCS(it)
					}
					shuffleDeck()
				}
				playRequirement{
					assert bg.turnCount
					assert my.lastKnockoutByOpponentDamageTurn == bg.turnCount - 1: "No Pokémon has been Knocked Out during your opponent’s last turn"
				}
			};
			case SWITCH_RAFT_62:
			return itemCard (this) {
				text "Switch your Active [W] Pokémon with 1 of your Benched Pokémon. If you do, heal 30 damage from the Pokémon you moved to your Bench.\nYou may play as many Item cards as you like during your turn (before your attack).\n"
				onPlay {
					heal 30, my.active
					sw my.active, my.bench.select("Select the new active")
				}
				playRequirement{
					assert my.active.types.contains(W)
					assert my.bench
				}
			};
			case WELA_VOLCANO_PARK_63:
			return stadium(this) {
				text "Whenever a player flips a coin for the Special Condition Burned between turns, that Special Condition isn't removed even if the result is heads.\nThis card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card.\n"
				def eff
				onPlay {
					eff = delayed {
						before BURNED_SPC, null, null, BETWEEN_TURNS, {
						prevent()
						}
					}
				}
				onRemoveFromPlay{
					eff.unregister()
				}
			};
			case ZINNIA_64:
			return supporter(this) {
				text "You can play this card only if 1 of your Pokémon was Knocked Out during your opponent's last turn.\nAttach up to 2 basic Energy cards from your hand to 1 of your [N] Pokémon.\nYou may play only 1 Supporter card during your turn (before your attack).\n"
				onPlay {
					def tar = my.all.findAll{it.types.contains(N)}.select("Select the Pokémon to which you want to attach 2 basic Energy.")
					attachEnergyFrom(basic:true,my.hand,tar)
					attachEnergyFrom(basic:true,my.hand,tar)
				}
				playRequirement{
					assert bg.turnCount
					assert my.lastKnockoutByOpponentDamageTurn == bg.turnCount - 1: "No Pokémon has been Knocked Out during your opponent’s last turn"
					assert my.all.findAll{it.types.contains(N)}
				}
			};
			case RESHIRAM_GX_65:
			return copy(RESHIRAM_GX_11, this);
			case KINGDRA_GX_66:
			return copy(KINGDRA_GX_18, this);
			case DRAGONITE_GX_67:
			return copy(DRAGONITE_GX_37, this);
			case ALTARIA_GX_68:
			return copy(ALTARIA_GX_41, this);
			case BLAINES_LAST_STAND_69:
			return copy(BLAINE_S_LAST_STAND_58, this);
			case ZINNIA_70:
			return copy(ZINNIA_64, this);
			case RESHIRAM_GX_71:
			return copy(RESHIRAM_GX_11, this);
			case ALTARIA_GX_72:
			return copy(ALTARIA_GX_41, this);
			case SALAMENCE_GX_73:
			return copy(SALAMENCE_GX_44, this);
			case WHITE_KYUREM_GX_74:
			return copy(WHITE_KYUREM_GX_48, this);
			case DRAGON_TALON_75:
			return copy(DRAGON_TALON_59, this);
			case FIERY_FLINT_76:
			return copy(FIERY_FLINT_60, this);
			case SWITCH_RAFT_77:
			return copy(SWITCH_RAFT_62, this);
			case ULTRA_NECROZMA_GX_78:
			return copy(ForbiddenLight.ULTRA_NECROZMA_GX_95, this);
			default:
			return null;
		}
	}
}
