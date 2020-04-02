package tcgwars.logic.impl.gen8;

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
 * @author lithogenn@gmail.com
 */
public enum RebelClash implements LogicCardInfo {

	SCYTHER_1 ("Scyther", 1, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
	HERACROSS_2 ("Heracross", 2, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
	LOTAD_3 ("Lotad", 3, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
	LOMBRE_4 ("Lombre", 4, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	LUDICOLO_5 ("Ludicolo", 5, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
	SURSKIT_6 ("Surskit", 6, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
	MASQUERAIN_7 ("Masquerain", 7, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	PHATUMP_8 ("Phatump", 8, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
	TREVENANT_9 ("Trevenant", 9, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
	ELDEGOSS_V_10 ("Eldegoss V", 10, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _GRASS_]),
	APPLIN_11 ("Applin", 11, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
	FLAPPLE_12 ("Flapple", 12, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	NINETALES_V_13 ("Ninetales V", 13, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIRE_]),
	MAGMAR_14 ("Magmar", 14, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
	MAGMORTAR_15 ("Magmortar", 15, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	LITWICK_16 ("Litwick", 16, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
	LAMPENT_17 ("Lampent", 17, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	CHANDELURE_18 ("Chandelure", 18, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIRE_]),
	HEATMOR_19 ("Heatmor", 19, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
	WINGULL_20 ("Wingull", 20, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
	PELIPPER_21 ("Pelipper", 21, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	MILOTIC_V_22 ("Milotic V", 22, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _WATER_]),
	TYMPOLE_23 ("Tympole", 23, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
	PALPITOAD_24 ("Palpitoad", 24, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	SEISMITOAD_25 ("Seismitoad", 25, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
	GALARIAN_DARUMAKA_26 ("Galarian Darumaka", 26, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
	GALARIAN_DARMANITAN_27 ("Galarian Darmanitan", 27, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	EISCUE_28 ("Eiscue", 28, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
	VOLTORB_29 ("Voltorb", 29, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
	ELECTRODE_30 ("Electrode", 30, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	ELECTABUZZ_31 ("Electabuzz", 31, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
	ELECTIVIRE_32 ("Electivire", 32, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	SHINX_33 ("Shinx", 33, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
	LUXIO_34 ("Luxio", 34, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
	LUXRAY_35 ("Luxray", 35, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
	TOXTRICITY_V_36 ("Toxtricity V", 36, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _LIGHTNING_]),
	TOXTRICITY_VMAX_37 ("Toxtricity VMAX", 37, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _LIGHTNING_]),
	MORPEKO_38 ("Morpeko", 38, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
	CLEFAIRY_39 ("Clefairy", 39, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
	CLEFABLE_40 ("Clefable", 40, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	SIGILYPH_41 ("Sigilyph", 41, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
	SANDYGAST_42 ("Sandygast", 42, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
	PALOSSAND_43 ("Palossand", 43, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	HATTENA_44 ("Hattena", 44, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
	HATTREM_45 ("Hattrem", 45, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	HATTERENE_46 ("Hatterene", 46, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
	MILCERY_47 ("Milcery", 47, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
	ALCREMIE_48 ("Alcremie", 48, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	DRAGAPULT_V_49 ("Dragapult V", 49, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _PSYCHIC_]),
	DRAGAPULT_VMAX_50 ("Dragapult VMAX", 50, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
	NOSEPASS_51 ("Nosepass", 51, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
	MEDITITE_52 ("Meditite", 52, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
	MEDICHAM_53 ("Medicham", 53, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	BARBOACH_54 ("Barboach", 54, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
	WHISCASH_55 ("Whiscash", 55, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	GALARIAN_YAMASK_56 ("Galarian Yamask", 56, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
	GALARIAN_RUNERIGUS_57 ("Galarian Runerigus", 57, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	ROLYCOLY_58 ("Rolycoly", 58, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
	CARKOAL_59 ("Carkoal", 59, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	COALOSSAL_60 ("Coalossal", 60, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
	FALINKS_V_61 ("Falinks V", 61, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _FIGHTING_]),
	STONJOURNER_62 ("Stonjourner", 62, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
	KOFFING_63 ("Koffing", 63, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
	GALARIAN_WEEZING_64 ("Galarian Weezing", 64, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
	SPIRITOMB_65 ("Spiritomb", 65, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
	TRUBBISH_66 ("Trubbish", 66, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
	GARBODOR_67 ("Garbodor", 67, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
	VULLABY_68 ("Vullaby", 68, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
	MANDIBUZZ_69 ("Mandibuzz", 69, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
	MALAMAR_V_70 ("Malamar V", 70, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _DARKNESS_]),
	MALAMAR_VMAX_71 ("Malamar VMAX", 71, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
	SCIZOR_72 ("Scizor", 72, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
	PROBOPASS_73 ("Probopass", 73, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
	DURANT_74 ("Durant", 74, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
	COPPERAJAH_V_75 ("Copperajah V", 75, Rarity.HOLORARE, [POKEMON, POKEMON_V, BASIC, _METAL_]),
	COPPERAJAH_VMAX_76 ("Copperajah VMAX", 76, Rarity.HOLORARE, [POKEMON, EVOLUTION, VMAX, _METAL_]),
	SNORLAX_77 ("Snorlax", 77, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
	CHATOT_78 ("Chatot", 78, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
	PIDOVE_79 ("Pidove", 79, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
	TRANQUIL_80 ("Tranquil", 80, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	UNFEZANT_81 ("Unfezant", 81, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
	STUFFUL_82 ("Stufful", 82, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
	BEWEAR_83 ("Bewear", 83, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	SKWOVET_84 ("Skwovet", 84, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
	GREEDENT_85 ("Greedent", 85, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
	SCOOP_UP_NET_86 ("Scoop Up Net", 86, Rarity.HOLORARE, [TRAINER, ITEM]),
	NUGGET_87 ("Nugget", 87, Rarity.HOLORARE, [TRAINER, ITEM]),
	TOOL_SCRAPPER_88 ("Tool Scrapper", 88, Rarity.HOLORARE, [TRAINER, ITEM]),
	CURSED_SHOVEL_89 ("Cursed Shovel", 89, Rarity.HOLORARE, [TRAINER, ITEM, POKEMON_TOOL]),
	OLEANA_90 ("Oleana", 90, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
	DAN_91 ("Dan", 91, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
	BOSS_S_ORDERS_92 ("Boss’s Orders", 92, Rarity.HOLORARE, [TRAINER, SUPPORTER]),
	GALAR_MINE_93 ("Galar Mine", 93, Rarity.HOLORARE, [TRAINER, STADIUM]),
	SPEED_LIGHTNING_ENERGY_94 ("Speed Lightning Energy", 94, Rarity.HOLORARE, [ENERGY, SPECIAL_ENERGY]),
	HORROR_PSYCHIC_ENERGY_95 ("Horror Psychic Energy", 95, Rarity.HOLORARE, [ENERGY, SPECIAL_ENERGY]),
	CAPTURE_ENERGY_96 ("Capture Energy", 96, Rarity.HOLORARE, [ENERGY, SPECIAL_ENERGY]);

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	RebelClash(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.REBEL_CLASH;
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
			case SCYTHER_1:
			return basic (this, hp:HP080, type:G, retreatCost:1) {
				weakness R
				move "Swords Dance", {
					text "During your next turn, the base damage of this Pokemon’s Speed Sickle is increased by 70."
					energyCost C
					attackRequirement {}
					onAttack {
            increasedBaseDamageNextTurn("Speed Sickle", hp(50))
					}
				}
				move "Speed Sickle", {
					text "20 damage."
					energyCost C
					attackRequirement {}
					onAttack {
            damage 20
					}
				}
			};
			case HERACROSS_2:
			return basic (this, hp:HP130, type:G, retreatCost:2) {
				weakness R
				move "Strong Horn", {
					text "110 damage."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
            damage 110
					}
				}
			};
			case LOTAD_3:
			return basic (this, hp:HP060, type:G, retreatCost:1) {
				weakness R
				move "Ram", {
					text "20 damage."
					energyCost G, C
					attackRequirement {}
					onAttack {
            damage 20
					}
				}
			};
			case LOMBRE_4:
			return evolution (this, from:"Lotad", hp:HP090, type:G, retreatCost:1) {
				weakness R
				move "Fury Swipes", {
					text "40x damage. Flip 3 coins. This attack does 40 damage times the number of heads."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
            flip 3, { damage 40 }
					}
				}
			};
			case LUDICOLO_5:
			return evolution (this, from:"Lombre", hp:HP160, type:G, retreatCost:2) {
				weakness R
				move "Energized Rush", {
					text "60x damage. This attack does 60 damage for each Prize card you’ve taken."
					energyCost C, C
					attackRequirement {}
					onAttack {
            damage 60*my.prizeCardSet.takenCount
					}
				}
			};
			case SURSKIT_6:
			return basic (this, hp:HP050, type:G, retreatCost:1) {
				weakness R
				move "Agility", {
					text "10 damage. Flip a coin. If heads, prevent all effects of attacks, including damage, done to this Pokemon during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
            damage 10
            flip { preventAllEffectsNextTurn() }
					}
				}
			};
			case MASQUERAIN_7:
			return evolution (this, from:"Surskit", hp:HP090, type:G, retreatCost:1) {
				weakness R
				move "Pattern Menace", {
					text "30 damage. Your opponent can’t attach Energy from their hand to the Defending Pokemon during their next turn."
					energyCost C
					attackRequirement {}
					onAttack {
            damage 30
            afterDamage {
              delayed {
                before ATTACH_ENERGY, defending, {
                  if(ef.reason == PLAY_FROM_HAND) {
                    wcu "Pattern Menace: Can't attach Energy to this Pokemon"
                    prevent()
                  }
                }
                unregisterAfter 2
                after SWITCH, defending, { unregister() }
                after EVOLVE, defending, { unregister() }
              }
            }
          }
				}
			};
			case PHATUMP_8:
			return basic (this, hp:HP060, type:G, retreatCost:1) {
				weakness R
				move "Dark Guidance", {
					text "Choose a Basic Pokemon from your discard pile and play it onto your Bench."
					energyCost C
					attackRequirement {}
					onAttack {
            // TODO
					}
				}
				move "Seed Bomb", {
					text "30 damage."
					energyCost G, C
					attackRequirement {}
					onAttack {
            damage 30
					}
				}
			};
			case TREVENANT_9:
			return basic (this, hp:HP130, type:G, retreatCost:3) {
				weakness R
				move "Seed Bomb", {
					text "40 damage."
					energyCost G
					attackRequirement {}
					onAttack {
            damage 40
					}
				}
				move "Shadow Cage", {
					text "120 damage. The Defending Pokemon can’t retreat during your opponent’s next turn."
					energyCost G, G, C
					attackRequirement {}
					onAttack {
            damage 120
            cantRetreat(defending)
					}
				}
			};
			case ELDEGOSS_V_10:
			return basic (this, hp:HP180, type:G, retreatCost:1) {
				weakness R
				bwAbility "Happy March", {
					text "Once during your turn, when you play this card from your hand to your Bench, you may put a Supporter card from your discard pile into your hand."
					onActivate {
            if (it==PLAY_FROM_HAND && bg.em().retrieveObject("Happy_March")!=bg.turnCount  && my.discard.filterByType(SUPPORTER) && confirm("Use Happy March?")) {
              bg.em().storeObject("Happy_March", bg.turnCount)
              powerUsed()
              my.discard.filterByType(SUPPORTER).select("Happy March: Put Supporter Card to your hand").moveTo(my.hand)
            }
          }
				}
				move "Soar Upward", {
					text "50 damage. You may shuffle this Pokemon and all cards attached to it into your deck."
					energyCost C, C
					attackRequirement {}
					onAttack {
            damage 50

            afterDamage {
              self.cards.moveTo(my.deck)
              shuffleDeck()
              removePCS(self)
            }
					}
				}
			};
			case APPLIN_11:
			return basic (this, hp:HP040, type:G, retreatCost:1) {
				weakness R
				move "Withdraw", {
					text "Flip a coin. If heads, prevent all damage from attacks done to this Pokemon during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
            flip { preventAllDamageNextTurn() }
					}
				}
			};
			case FLAPPLE_12:
			return evolution (this, from:"Applkin", hp:HP080, type:G, retreatCost:1) {
				weakness R
        // TODO
			};
			case NINETALES_V_13:
			return basic (this, hp:HP200, type:R, retreatCost:2) {
				weakness W
				move "Nine Tailed Transformation", {
					text "Choose 1 of your opponent's Active Pokemon's attacks and use it as this attack."
					energyCost R, C, C
					attackRequirement {
            assert opp.active.find {it.topPokemonCard.moves} : "No moves to perform"
          }
					onAttack {
            def moveList = []
            def labelList = []
            opp.active.each { pcs->
              moveList.addAll(pcs.topPokemonCard.moves);
              labelList.addAll(pcs.topPokemonCard.moves.collect{pcs.name+"-"+it.name})
            }
            def move=choose(moveList, labelList)
            def bef=blockingEffect(ENERGY_COST_CALCULATOR, BETWEEN_TURNS)
            attack (move as Move)
            bef.unregisterItself(bg().em())
					}
				}
				move "Flamethrower", {
					text "180 damage. Discard an Energy from this Pokemon."
					energyCost R, C, C, C
					attackRequirement {}
					onAttack {
            damage 180

            afterDamage {
              discardSelfEnergy R
            }
					}
				}
			};
			case MAGMAR_14:
			return basic (this, hp:HP090, type:R, retreatCost:2) {
				weakness W
				move "Punch", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
            damage 10
					}
				}
			};
			case MAGMORTAR_15:
			return evolution (this, from:"Magmar", hp:HP140, type:R, retreatCost:3) {
				weakness W
				move "Ground Burn", {
					text "80+ damage. Each player discards a card from the top of their deck. This attack does 100 more damage for each Energy card discarded in this way."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
            damage 80

            def myTop = my.deck.subList(0,1)
            def oppTop = opp.deck.subList(0,1)

            if (myTop.getCardTypes().isEnergy()) {
              damage 100
            }

            if (oppTop.getCardTypes().isEnergy()) {
              damage 100
            }
					}
				}
			};
			case LITWICK_16:
			return basic (this, hp:HP060, type:R, retreatCost:1) {
				weakness W
				move "Scorch", {
					text "Your opponent’s Active Pokemon is now Burned."
					energyCost R
					attackRequirement {}
					onAttack {
            apply BURNED
					}
				}
			};
			case LAMPENT_17:
			return evolution (this, from:"Litwick", hp:HP080, type:R, retreatCost:1) {
				weakness W
				move "Rekindle", {
					text "20 damage. Attach a [R] Energy card from your discard pile to this Pokemon."
					energyCost R
					attackRequirement {}
					onAttack {
            damage 20

            afterDamage {
              attachEnergyFrom(type:R, my.discard, my.active)
            }
					}
				}
			};
			case CHANDELURE_18:
			return evolution (this, from:"Lampent", hp:HP140, type:R, retreatCost:2) {
				weakness W
				bwAbility "Protection Lamp", {
					text "Each of your Pokemon that has any Energy attached to it has no Weakness."
					getterA (GET_WEAKNESSES) {h->
            if (h.effect.target.owner == self.owner && h.effect.target.cards.energyCount()) {
              def list = h.object as List<Weakness>
              list.clear()
            }
          }
				}
				move "Mirage Flare", {
					text "110 damage. Your opponent’s Active Pokemon is now Confused."
					energyCost R, C
					attackRequirement {}
					onAttack {
            damage 110
            apply CONFUSED
					}
				}
			};
			case HEATMOR_19:
			return basic (this, hp:HP120, type:R, retreatCost:2) {
				weakness W
				move "Lick", {
					text "20 damage. Flip a coin. If heads, your opponent's Active Pokemon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
            damage 20
            flip { apply PARALYZED }
					}
				}
				move "Flamethrower", {
					text "120 damage. Discard an Energy from this Pokemon."
					energyCost R, R, C
					attackRequirement {}
					onAttack {
            damage 120
            discardSelfEnergy C
					}
				}
			};
			case WINGULL_20:
			return basic (this, hp:HP070, type:W, retreatCost:1) {
				weakness L
				move "Collect", {
					text "Draw a card."
					energyCost C
					attackRequirement {
            assert my.deck : "Deck is empty"
          }
					onAttack {
            draw 1
					}
				}
				move "Wave Splash", {
					text "20 damage."
					energyCost W, C
					attackRequirement {}
					onAttack {
            damage 20
					}
				}
			};
			case PELIPPER_21:
			return evolution (this, from:"Wingull", hp:HP120, type:W, retreatCost:2) {
				weakness L
				resistance F, MINUS20
				move "Wing Attack", {
					text "50 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
            damage 50
					}
				}
				move "Power Cyclone", {
					text "110 damage. Move an Energy from this Pokemon to 1 of your Benched Pokemon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
            damage 110
            afterDamage { moveEnergy(self, my.bench) }
					}
				}
			};
			case MILOTIC_V_22:
			return basic (this, hp:HP210, type:W, retreatCost:null) {
				weakness L
				move "Aqua Impact", {
					text "10+ damage. This attack does 50 more damage for each [C] in your opponent's Active Pokemon's Retreat Cost."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
            damage 10+50*opp.active.retreatCost
					}
				}
				move "Hypno Splash", {
					text "150 damage. Your opponent's Active Pokemon is now Asleep."
					energyCost W, C, C, C
					attackRequirement {}
					onAttack {
            damage 150

            apply ASLEEP
					}
				}
			};
			case TYMPOLE_23:
			return basic (this, hp:HP060, type:W, retreatCost:1) {
				weakness L
				move "Spin", {
					text "Your opponent’s Active Pokemon is now Confused."
					energyCost C
					attackRequirement {}
					onAttack {
            apply CONFUSED
					}
				}
			};
			case PALPITOAD_24:
			return evolution (this, from:"Tympole", hp:HP090, type:W, retreatCost:2) {
				weakness L
				move "Twirling Sign", {
					text "30 damage. Your opponent’s Active Pokemon is now Confused."
					energyCost C, C
					attackRequirement {}
					onAttack {
            damage 30
            apply CONFUSED
					}
				}
			};
			case SEISMITOAD_25:
			return evolution (this, from:"Palpitoad", hp:HP170, type:W, retreatCost:3) {
				weakness L
				move "Split Spiral Punch", {
					text "30 damage. Your opponent’s Active Pokemon is now Confused."
					energyCost W
					attackRequirement {}
					onAttack {
            damage 30
            apply CONFUSED
					}
				}
				move "Resonance", {
					text "120 damage. If your opponent’s Active Pokemon is Confused, this attack does 120 more damage."
					energyCost W, C, C, C
					attackRequirement {}
					onAttack {
            damage 120
            if (opp.active.isSPC(CONFUSED)) damage 120
					}
				}
			};
			case GALARIAN_DARUMAKA_26:
			return basic (this, hp:HP080, type:W, retreatCost:2) {
				weakness M
				move "Ice Punch", {
					text "30 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
					energyCost W, C
					attackRequirement {}
					onAttack {
            damage 30
            flip { apply PARALYZED }
					}
				}
			};
			case GALARIAN_DARMANITAN_27:
			return evolution (this, from:"Galarian Darumaka", hp:HP140, type:W, retreatCost:3) {
				weakness M
				move "Blizzard", {
					text "80 damage. This attack does 10 damage to each of your opponent’s Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
					energyCost W, C, C
					attackRequirement {}
					onAttack {
            damage 80
            opp.bench.each {
              damage 10, it
            }
					}
				}
				move "Crushed Ice Head", {
					text "170 damage. This Pokemon can’t use Crushed Ice Head during your next turn."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
            damage 170
            cantUseAttack(thisMove, self)
					}
				}
			};
			case EISCUE_28:
			return basic (this, hp:HP120, type:W, retreatCost:2) {
				weakness M
				bwAbility "Ice Face", {
					text "If this Pokemon's HP is at max, any damage done to it by opponent’s attacks is reduced by 60."
					actionA {
            // TODO
					}
				}
				move "Blizzard", {
					text "70 damage. This attack does 10 damage to each of your opponent’s Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
					energyCost W, C, C
					attackRequirement {}
					onAttack {
            damage 70
            opp.bench.each {
              damage 10, it
            }
					}
				}
			};
			case VOLTORB_29:
			return basic (this, hp:HP050, type:L, retreatCost:1) {
				weakness F
				move "Continuous Tumble", {
					text "Flip a coin until you get tails. This attack does 20 damage times the number of heads."
					energyCost C
					attackRequirement {}
					onAttack {
            flipUntilTails { damage 20 }
					}
				}
			};
			case ELECTRODE_30:
			return evolution (this, from:"Voltorb", hp:HP090, type:L, retreatCost:0) {
				weakness F
				move "Orb Collection", {
					text "Search your deck for up to 3 Energy cards, reveal them, and put them in your hand. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {
            afterDamage {
              if (my.deck) {
                def list = my.deck.search (max: 3, cardTypeFilter(ENERGY))
                list.moveTo(my.hand)
                shuffleDeck()
              }
            }
					}
				}
				move "Ball Attack", {
					text "70 damage."
					energyCost L, C
					attackRequirement {}
					onAttack {
            damage 70
					}
				}
			};
			case ELECTABUZZ_31:
			return basic (this, hp:HP090, type:L, retreatCost:2) {
				weakness F
				move "Knuckle Punch", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
            damage 10
					}
				}
				move "Electroslug", {
					text "70 damage."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
            damage 70
					}
				}
			};
			case ELECTIVIRE_32:
			return evolution (this, from:"Electabuzz", hp:HPnull, type:L, retreatCost:3) {
				weakness F
				move "Thundershock", {
					text "50 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
					energyCost L, C
					attackRequirement {}
					onAttack {
            damage 50
            flip { apply PARALYZED }
					}
				}
				move "Powered Volt", {
					text "90 damage. If this Pokemon has a Special Energy card attached to it, this attack does 90 more damage."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
            damage 90

            if (opp.active.cards.filterByType(SPECIAL_ENERGY)) {
              damage 90
            }
					}
				}
			};
			case SHINX_33:
			return basic (this, hp:HP060, type:L, retreatCost:1) {
				weakness F
				move "Adversity", {
					text "10 damage. If your opponent has 3 or fewer Prize cards remaining, this attack does 50 more damage."
					energyCost L
					attackRequirement {}
					onAttack {
            damage 10

            if (opp.prizeCardSet.size() <= 3) {
              damage 50
            }
					}
				}
			};
			case LUXIO_34:
			return evolution (this, from:"Shinx", hp:HP090, type:L, retreatCost:1) {
				weakness F
				bwAbility "Top Entry", {
					text "If you draw this card from your deck at the beginning of your turn and there is room on your Bench, instead of putting it into your hand, you may play it directly onto your Bench.</span"
					actionA {
            // TODO
					}
				}
				move "Elekick", {
					text "30 damage."
					energyCost L
					attackRequirement {}
					onAttack {
            damage 30
					}
				}
			};
			case LUXRAY_35:
			return evolution (this, from:"Luxio", hp:HP160, type:L, retreatCost:1) {
				weakness F
				move "Raid", {
					text "60 damage. If this Pokemon evolved from Luxio during your turn, this attack does 100 more damage."
					energyCost L
					attackRequirement {}
					onAttack {
            damage 60
            // TODO
					}
				}
				move "Head Bolt", {
					text "120 damage."
					energyCost L, C
					attackRequirement {}
					onAttack {
            damage 120
					}
				}
			};
			case TOXTRICITY_V_36:
			return basic (this, hp:HP210, type:L, retreatCost:2) {
				weakness F
				move "Poison Jab", {
					text "20 damage. Your opponent’s Active Pokemon is now Poisoned."
					energyCost L
					attackRequirement {}
					onAttack {
            damage 20
            apply POISONED
					}
				}
				move "Electric Riot", {
					text "90+ damage. This attack does 90 more damage if your opponent’s Active Pokemon is Poisoned."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
            damage 90
            if (opp.active.isSPC(POISONED)) damage 90
					}
				}
			};
			case TOXTRICITY_VMAX_37:
			return evolution (this, from:"Toxtricity V", hp:HP320, type:L, retreatCost:2) {
				weakness F
				move "Giganto Riot", {
					text "160+ damage. This attack does 80 more damage if your opponent’s Active Pokemon is Poisoned."
					energyCost L, L, C
					attackRequirement {}
					onAttack {
            damage 160
            if (opp.active.isSPC(POISONED)) damage 80
					}
				}
			};
			case MORPEKO_38:
			return basic (this, hp:HP080, type:L, retreatCost:1) {
				weakness F
				move "Torment", {
					text "20 damage. Choose 1 of your opponent’s Active Pokemon’s attacks. The Defending Pokemon can’t use that attack during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
            damage 20
            amnesia delegate
					}
				}
				move "Spark", {
					text "50 damage. This attack does 20 damage to 1 of your opponent’s Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
					energyCost L, C
					attackRequirement {}
					onAttack {
            damage 50
            damage 20, opp.bench.select("Deal damage to?")
					}
				}
			};
			case CLEFAIRY_39:
			return basic (this, hp:HP060, type:P, retreatCost:1) {
				weakness M
				move "Glowing Finger", {
					text "Your opponent’s Active Pokemon is now Asleep."
					energyCost C
					attackRequirement {}
					onAttack {
            apply ASLEEP
					}
				}
				move "Magical Shot", {
					text "10 damage."
					energyCost P
					attackRequirement {}
					onAttack {
            damage 10
					}
				}
			};
			case CLEFABLE_40:
			return evolution (this, from:"Clefairy", hp:HP110, type:P, retreatCost:1) {
				weakness M
				bwAbility "Playful", {
					text "Once during your turn, when you play this card from your hand to evolve a Pokemon, you may choose an Energy attached to your  opponent’s Active Pokemon and return it to the top of your opponent’s deck."
					actionA {
            // TODO
					}
				}
				move "Moon Kick", {
					text "60 damage."
					energyCost P, C
					attackRequirement {}
					onAttack {
            damage 60
					}
				}
			};
			case SIGILYPH_41:
			return basic (this, hp:HP110, type:P, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				bwAbility "Strikes Back", {
					text "If this Pokemon is your Active Pokemon and is damaged by an opponent’s attack, place 3 damage counters on the attacking Pokemon."
					delayedA (priority: LAST) {
            before APPLY_ATTACK_DAMAGES, {
              if (self.active && bg.currentTurn == self.owner.opposite && bg.dm().find({ it.to == self && it.dmg.value })) {
                bc "Strikes Back activates"
                directDamage(30, ef.attacker)
              }
            }
          }
				}
				move "Psychic Damage", {
					text "Does 30 damage plus 10 damage for each damage counter on the opponent’s Active Pokemon."
					energyCost P, C
					attackRequirement {}
					onAttack {
            damage 30+10*opp.active.numberOfDamageCounters
					}
				}
			};
			case SANDYGAST_42:
			return basic (this, hp:HP080, type:P, retreatCost:3) {
				weakness D
				resistance F, MINUS20
				move "Sneaky Placement", {
					text "Put a damage counter on 1 of your opponent’s Pokemon."
					energyCost P
					attackRequirement {}
					onAttack {
            directDamage(10, opp.all.select("Choose an Opponent's Pokemon to put a damage counter on."))
					}
				}
			};
			case PALOSSAND_43:
			return evolution (this, from:"Sandygast", hp:HP140, type:P, retreatCost:4) {
				weakness D
				resistance F, MINUS20
				move "Sand Burial", {
					text "Discard a card from the top of your opponent’s deck. If this Pokemon has Cursed Shovel attached to it, discard 2 more cards."
					energyCost C, C
					attackRequirement {}
					onAttack {
            // TODO
					}
				}
				move "Super Absorption", {
					text "90 damage. Heal 30 damage from this Pokemon."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
            damage 90
            heal 30, self
					}
				}
			};
			case HATTENA_44:
			return basic (this, hp:HP060, type:P, retreatCost:1) {
				weakness D
				resistance F, MINUS20
				move "Find a Friend", {
					text "Search your deck for a Pokemon, reveal it, and put it into your hand. Then, shuffle your deck."
					energyCost C
					attackRequirement{
            assert my.deck : "There is no more cards in your deck."
          }
          onAttack{
            my.deck.search("Select a Pokémon to put into your hand").moveTo(my.hand)
            shuffleDeck()
          }
				}
				move "Psychic Shot", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
            damage 20
					}
				}
			};
			case HATTREM_45:
			return evolution (this, from:"Hattena", hp:HP080, type:P, retreatCost:1) {
				weakness D
				resistance F, MINUS20
				move "Calm Mind", {
					text "Heal 30 damage from this Pokemon."
					energyCost C
					attackRequirement {}
					onAttack {
            heal 30, self
					}
				}
				move "Brutal Swing", {
					text "30 damage. Flip a coin, If heads, this attack does 30 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
            damage 30
            flip { damage 30 }
					}
				}
			};
			case HATTERENE_46:
			return evolution (this, from:"Hattrem", hp:HP150, type:P, retreatCost:2) {
				weakness D
				resistance F, MINUS20
				bwAbility "Mind Hat", {
					text "Once during your turn, you may have each player discard 1 card from their hand. (Your opponent discards first. If either player has no cards in their hand, that player does not discard.)"
					actionA {
            // TODO
					}
				}
				move "Regretful Droplets", {
					text "Put damage counters on your opponent's Active Pokemon equal to the number of Pokemon in your discard pile."
					energyCost P
					attackRequirement {}
					onAttack {
            // TODO
					}
				}
			};
			case MILCERY_47:
			return basic (this, hp:HP050, type:P, retreatCost:1) {
				weakness M
				move "Aromatherapy", {
					text "Heal 10 damage from each of your Pokemon."
					energyCost C
					attackRequirement {}
					onAttack {
            my.all.each {
              heal 10, it
            }
					}
				}
				move "Tackle", {
					text "20 damage."
					energyCost P, C
					attackRequirement {}
					onAttack {
            damage 20
					}
				}
			};
			case ALCREMIE_48:
			return evolution (this, from:"Milcery", hp:HP110, type:P, retreatCost:1) {
				weakness M
				move "Decorate", {
					text "Attach any number of Basic Energy from your hand to your Pokemon in any way you like."
					energyCost C
					attackRequirement {}
					onAttack {
            // TODO
					}
				}
				move "Draining Kiss", {
					text "50 damage. Heal 30 damage from this Pokemon."
					energyCost P, C
					attackRequirement {}
					onAttack {
            damage 50
            heal 30, self
					}
				}
			};
			case DRAGAPULT_V_49:
			return basic (this, hp:HP210, type:P, retreatCost:1) {
				weakness D
				resistance F, MINUS20
				move "Bite", {
					text "30 damage."
					energyCost P
					attackRequirement {}
					onAttack {
            damage 30
					}
				}
				move "Assault Jet", {
					text "60+ damage. If this Pokemon was on your Bench and became your Active Pokemon during this turn, this attack does 80 more damage."
					energyCost P, P
					attackRequirement {}
					onAttack {
            damage 60
            if (wasSwitchedOutThisTurn(self)) {
              damage 80
            }
          }
				}
			};
			case DRAGAPULT_VMAX_50:
			return evolution (this, from:"Dragapult V", hp:HP320, type:P, retreatCost:1) {
				weakness D
				resistance F, MINUS20
				move "Shred", {
					text "60 damage. This attack’s damage isn’t affected by effects on your opponents Active Pokemon."
					energyCost P
					attackRequirement {}
					onAttack {
            shredDamage 60
					}
				}
				move "Giganto Phantom", {
					text "130 damage. Put 5 damage counters on your opponent's Benched Pokemon in any way you like."
					energyCost P, P
					attackRequirement {}
					onAttack {
            damage 130

            (1..5).each { if (opp.bench) {
              directDamage 10, opp.bench.select("Add damage counter $it/5 to a pokémon?"), Source.ATTACK
            }}
					}
				}
			};
			case NOSEPASS_51:
			return basic (this, hp:HP080, type:F, retreatCost:3) {
				weakness G
				move "Tackle", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
            damage 10
					}
				}
				move "Rolling Tackle", {
					text "50 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
            damage 50
					}
				}
			};
			case MEDITITE_52:
			return basic (this, hp:HP070, type:F, retreatCost:1) {
				weakness P
				move "Meditate", {
					text "10 damage. Flip a coin. If heads, your opponent’s Active Pokemon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
            damage 10
            flip { apply PARALYZED }
					}
				}
			};
			case MEDICHAM_53:
			return evolution (this, from:"Meditite", hp:HP110, type:F, retreatCost:1) {
				weakness P
				move "Yoga Kick", {
					text "40 damage. This attack’s damage isn’t affected by Weakness or Resistance."
					energyCost F
					attackRequirement {}
					onAttack {
            noWrDamage 40, defending
					}
				}
				move "Psychic", {
					text "60+ damage. This attack does 20 more damage for each Energy attached to your opponent’s Active Pokemon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
            damage 60+20*opp.active.cards.filterByType(ENERGY).size()
					}
				}
			};
			case BARBOACH_54:
			return basic (this, hp:HP070, type:F, retreatCost:2) {
				weakness G
				move "Razor Fin", {
					text "10 damage."
					energyCost F
					attackRequirement {}
					onAttack {
            damage 10
					}
				}
			};
			case WHISCASH_55:
			return evolution (this, from:"Barboach", hp:HP140, type:F, retreatCost:3) {
				weakness G
				bwAbility "Submerge", {
					text "As long as this Pokemon is on your Bench, it takes no damage from attacks."
					delayedA {
            before APPLY_ATTACK_DAMAGES, {
              bg.dm().each{
                if (!self.active && it.to == self) {
                  bc "Submerge prevent all damage"
                  it.dmg=hp(0)
                }
              }
            }
          }
				}
				move "Earthquake", {
					text "140 damage. This attack does 20 damage to each of your Benched Pokemon. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
					energyCost F, F
					attackRequirement {}
					onAttack {
            damage 140
            my.bench.each {
              damage 20, it
            }
					}
				}
			};
			case GALARIAN_YAMASK_56:
			return basic (this, hp:HP070, type:F, retreatCost:2) {
				weakness G
				move "Reckless Charge", {
					text "50 damage. This Pokemon does 30 damage to itself."
					energyCost C, C
					attackRequirement {}
					onAttack {
            damage 50
            damage 30, self
					}
				}
			};
			case GALARIAN_RUNERIGUS_57:
			return evolution (this, from:"Yamask", hp:HP100, type:F, retreatCost:2) {
				weakness G
				move "Grudge Distribution", {
					text "Count the number of damage counters on this Galarian Runerigus. Put twice as many damage counters on your opponent’s Active Pokemon."
					energyCost C, C
					attackRequirement {}
					onAttack {
            // TODO
					}
				}
				move "Mad Hammer", {
					text "120 damage. This Pokemon does 30 damage to itself."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
            damage 120
            damage 30, self
					}
				}
			};
			case ROLYCOLY_58:
			return basic (this, hp:HP070, type:F, retreatCost:2) {
				weakness G
				move "Ram", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
            damage 10
					}
				}
			};
			case CARKOAL_59:
			return evolution (this, from:"Rolycoly", hp:HP100, type:F, retreatCost:3) {
				weakness G
				move "Ram", {
					text "30 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
            damage 30
					}
				}
				move "Heat Stamp", {
					text "60 damage."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
            damage 60
					}
				}
			};
			case COALOSSAL_60:
			return evolution (this, from:"Carkoal", hp:HP160, type:F, retreatCost:4) {
				weakness G
				bwAbility "Tar Generator", {
					text "Once during your turn, you may search your discard pile for up to 1 [R] Energy and 1 [F] Energy and attach them to your Pokemon in any way you like."
					actionA {
            // TODO
					}
				}
				move "Burning Avalanche", {
					text "130 damage."
					energyCost F, C, C, C
					attackRequirement {}
					onAttack {
            damage 130
					}
				}
			};
			case FALINKS_V_61:
			return basic (this, hp:HP160, type:F, retreatCost:2) {
				weakness P
				bwAbility "Iron Defender", {
					text "As long as this Pokemon is in play, damage done to any of your Pokemon with Falinks in its name by your opponent's atacks is reduced by 20."
					actionA {
            // TODO
					}
				}
				move "Giga Impact", {
					text "210 damage. This Pokemon can’t attack during your next turn."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
            damage 210
            cantAttackNextTurn self
					}
				}
			};
			case STONJOURNER_62:
			return basic (this, hp:HP140, type:F, retreatCost:4) {
				weakness G
				move "Mega Kick", {
					text "80 damage."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
            damage 80
					}
				}
				move "Power Press", {
					text "120+ damage. If you have 1 more Energy attached to this Pokemon (but not used to pay for this attack), this attack does 60 more damage."
					energyCost F, C, C, C
					attackRequirement {}
					onAttack {
            damage 120
            if (self.cards.energySufficient(thisMove.energyCost + C)) {
              damage 60
            }
					}
				}
			};
			case KOFFING_63:
			return basic (this, hp:HP070, type:D, retreatCost:1) {
				weakness F
				move "Suffocating Gas", {
					text "10 damage."
					energyCost D
					attackRequirement {}
					onAttack {
            damage 10
					}
				}
			};
			case GALARIAN_WEEZING_64:
			return evolution (this, from:"Koffing", hp:HP130, type:D, retreatCost:3) {
				weakness F
				bwAbility "Chemical Change Gas", {
					text "As long as this Pokemon is your Active Pokemon, each of your opponent’s Pokemon has no Abilities (excluding Chemical Change Gas)."
					actionA {
            // TODO
					}
				}
				move "Severe Poison", {
					text "Your opponent’s Active Pokemon is now Poisoned. Put 4 damage counters for Poison between turns."
					energyCost D
					attackRequirement {}
					onAttack {
            apply POISONED
            extraPoison 3
					}
				}
			};
			case SPIRITOMB_65:
			return basic (this, hp:HP060, type:D, retreatCost:2) {
				weakness G
				move "Grudge Split", {
					text "Discard 1 card from the top of each player’s deck."
					energyCost D
					attackRequirement {}
					onAttack {
            if (opp.deck) opp.deck.subList(0, 1).discard()
            if (my.deck) my.deck.subList(0, 1).discard()
					}
				}
				move "Regretful Droplets", {
					text "Put damage counters on your opponent’s Active Pokemon equal to the number of Pokemon in your discard pile."
					energyCost D, C
					attackRequirement {}
					onAttack {
            // TODO
					}
				}
			};
			case TRUBBISH_66:
			return basic (this, hp:HP060, type:D, retreatCost:1) {
				weakness F
				move "Venom Shock", {
					text "20+ damage. If your opponent’s Active Pokemon is Poisoned, this attack does 50 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
            damage 20

            if (opp.active.isSPC(POISONED)) damage 50
					}
				}
			};
			case GARBODOR_67:
			return evolution (this, from:"Trubbish", hp:HP120, type:D, retreatCost:2) {
				weakness F
				bwAbility "Poison Pool", {
					text "Once during your turn, if there is a Stadium in play, you may leave your opponents Active Pokemon Poisoned."
					actionA {
            // TODO
					}
				}
				move "Sludge Bomb", {
					text "80 damage."
					energyCost D, C, C
					attackRequirement {}
					onAttack {
            damage 80
					}
				}
			};
			case VULLABY_68:
			return basic (this, hp:HP060, type:D, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Pluck", {
					text "10 damage. Before doing damage, discard all Pokemon Tools attached to your opponent’s Active Pokemon."
					energyCost C
					attackRequirement {}
					onAttack {
            damage 10
            // TODO
					}
				}
			};
			case MANDIBUZZ_69:
			return evolution (this, from:"Vullaby", hp:HP120, type:D, retreatCost:2) {
				weakness L
				resistance F, MINUS20
				move "Bone Rush", {
					text "Flip a coin until you get tails. This attack does 30 damage times the number of heads."
					energyCost D
					attackRequirement {}
					onAttack {
            flipUntilTails { damage 30 }
					}
				}
				move "Blindside", {
					text "This attack does 100 damage to 1 of your opponent’s Pokemon that already has damage counters on it. (Don’t apply Weakness and Resistance for Benched Pokemon.)"
					energyCost D, D
					attackRequirement {}
					onAttack {
            // TODO
					}
				}
			};
			case MALAMAR_V_70:
			return basic (this, hp:HP210, type:D, retreatCost:2) {
				weakness G
				move "Drag Off", {
					text "Choose 1 of your opponent’s Benched Pokemon and switch it with their Active Pokemon. This attack does 30 damage to the new Active Pokemon."
					energyCost D, C
					attackRequirement {}
					onAttack{
            def target = defending
            if (opp.bench) {
              target = opp.bench.select("Select the new active")
              sw defending, target
            }
            damage 30, target
          }
				}
				move "Brain Shake", {
					text "130 damage. Your opponent’s Active Pokemon is now Confused."
					energyCost D, D, C
					attackRequirement {}
					onAttack {
            damage 130
            apply CONFUSED
					}
				}
			};
			case MALAMAR_VMAX_71:
			return evolution (this, from:"Malamar V", hp:HP310, type:D, retreatCost:2) {
				weakness G
        // TODO
			};
			case SCIZOR_72:
			return evolution (this, from:"Scyther", hp:HP130, type:M, retreatCost:1) {
				weakness R
				resistance G, MINUS20
				move "Raid", {
					text "30+ damage. If this Pokemon evolved from Scyther during your turn, this attack does 90 more damage."
					energyCost M
					attackRequirement {}
					onAttack {
            damage 30
            // TODO
					}
				}
				move "Guard Claw", {
					text "90 damage. During your opponent’s next turn, any damage done to this Pokemon by attacks is reduced by 30."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
            damage 90
            reduceDamageNextTurn(hp(30), thisMove)
					}
				}
			};
			case PROBOPASS_73:
			return evolution (this, from:"Nosepass", hp:HP140, type:M, retreatCost:4) {
				weakness R
				resistance G, MINUS20
				move "Gravity Drop", {
					text "10+ damage. This attack does 30 more damage for each [C] in your opponent’s Active Pokemon’s Retreat Cost."
					energyCost M
					attackRequirement {}
					onAttack {
            damage 10+30*opp.active.retreatCost
					}
				}
				move "Heavy Impact", {
					text "120 damage."
					energyCost M, M, C
					attackRequirement {}
					onAttack {
            damage 120
					}
				}
			};
			case DURANT_74:
			return basic (this, hp:HP100, type:M, retreatCost:1) {
				weakness R
				resistance G, MINUS20
				move "Gather Bait", {
					text "For each Energy attached to this Pokemon, search your deck for a Trainer card, reveal it, and put it into your hand. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {
            // TODO
					}
				}
				move "Metal Claw", {
					text "80 damage."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
            damage 80
					}
				}
			};
			case COPPERAJAH_V_75:
			return basic (this, hp:HP220, type:M, retreatCost:4) {
				weakness R
				move "Adamantine Press", {
					text "90 damage. During your opponent’s next turn, this Pokemon takes 30 less damage from attacks."
					energyCost M, M, C
					attackRequirement {}
					onAttack {
            damage 90
            // TODO
					}
				}
			};
			case COPPERAJAH_VMAX_76:
			return evolution (this, from:"Copperajah V", hp:HP340, type:M, retreatCost:4) {
				weakness R
				resistance G, MINUS20
				move "Dangerous Nose", {
					text "100+ damage. If your opponent’s Active Pokemon is a Basic Pokemon, this attack does 100 more damage."
					energyCost M, M, C
					attackRequirement {}
					onAttack {
            damage 100
            if (opp.active.basic) {
              damage 100
            }
					}
				}
				move "Giant Hammer", {
					text "240 damage."
					energyCost M, M, M, C
					attackRequirement {}
					onAttack {
            damage 240
					}
				}
			};
			case SNORLAX_77:
			return basic (this, hp:HP150, type:C, retreatCost:4) {
				weakness F
				move "Collect", {
					text "Draw 2 cards."
					energyCost C
					attackRequirement {
            assert my.deck : "Deck is empty"
          }
					onAttack {
            draw 2
					}
				}
			};
			case CHATOT_78:
			return basic (this, hp:HP070, type:C, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				bwAbility "Lucky Match", {
					text "Once during your turn, when you play this card from your hand onto your Bench, you may flip a coin. If heads, choose a Supporter card from your discard pile, reveal it, and put it into your hand."
					actionA {
            // TODO
					}
				}
			};
			case PIDOVE_79:
			return basic (this, hp:HP060, type:C, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Chirp", {
					text "Search your deck for up to 2 Pokemon with a [F] Resistance, reveal them, and put them into your hand. Then, shuffle your deck."
					energyCost C
					attackRequirement {}
					onAttack {
            // TODO
					}
				}
				move "Sharp Wing", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
            damage 20
					}
				}
			};
			case TRANQUIL_80:
			return evolution (this, from:"Pidove", hp:HP080, type:C, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Sharp Wing", {
					text "40 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
            damage 40
					}
				}
				move "Gust", {
					text "60 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
            damage 60
					}
				}
			};
			case UNFEZANT_81:
			return evolution (this, from:"Tranquil", hp:HP150, type:C, retreatCost:1) {
				weakness L
				resistance F, MINUS20
				move "Daunt", {
					text "50 damage. The attacks of the Defending Pokemon do 50 less damage during your opponent’s next turn."
					energyCost C, C
					attackRequirement {}
					onAttack {
            damage 50
            // TODO
					}
				}
				move "Air Slash", {
					text "150 damage. Discard an Energy from this Pokemon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
            damage 150
            discardSelfEnergy C
					}
				}
			};
			case STUFFUL_82:
			return basic (this, hp:HP080, type:C, retreatCost:2) {
				weakness F
				move "Tackle", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
            damage 10
					}
				}
				move "Jump On", {
					text "40 damage. Flip a coin. If heads, this attack does 40 more damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
            damage 40
            flip { damage 40 }
					}
				}
			};
			case BEWEAR_83:
			return evolution (this, from:"Stufful", hp:HP140, type:C, retreatCost:3) {
				weakness F
				move "Big Throw", {
					text "Flip a coin. If heads, discard your opponent’s Active Pokemon and all cards attached to it."
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {

					}
				}
			};
			case SKWOVET_84:
			return basic (this, hp:HP070, type:C, retreatCost:1) {
				weakness F
				move "Tackle", {
					text "10 damage."
					energyCost C
					attackRequirement {}
					onAttack {
            damage 10
					}
				}
				move "Bite", {
					text "20 damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
            damage 20
					}
				}
			};
			case GREEDENT_85:
			return evolution (this, from:"Skwovet", hp:HP120, type:C, retreatCost:1) {
				weakness F
				bwAbility "Greedy Tail", {
					text "Once during your turn, you may search your deck for a Pokemon Tool card, reveal it, and put it into your hand. Then, shuffle your deck."
					actionA {
            // TODO
					}
				}
				move "Tail Slap", {
					text "80 damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
            damage 80
					}
				}
			};
			case SCOOP_UP_NET_86:
			return itemCard (this) {
				text "Put 1 of your Pokemon (excluding Pokemon V/GX) into your hand. (Discard all cards attached to that Pokemon.) You may play as many Item cards during your turn as you like (before your attack). (Note -  The term “Pokemon V” includes both Pokemon V and Pokemon VMAX.)"
				onPlay {
          // TODO
				}
				playRequirement{
				}
			};
			case NUGGET_87:
			return itemCard (this) {
				text "Play this card when you draw it from your deck at the start of your turn (before putting it into your hand). Draw 3 cards. You may play as many Item cards as you like during your turn (before your attack)."
				onPlay {
          // TODO
				}
				playRequirement{
				}
			};
			case TOOL_SCRAPPER_88:
			return itemCard (this) {
				text "Discard up to 2 Pokemon Tools from either player’s Pokemon. You may play as many Item cards during your turn as you like (before your attack)."
				onPlay {
          // TODO
				}
				playRequirement{
				}
			};
			case CURSED_SHOVEL_89:
			return pokemonTool (this) {
				text "Attach a Pokemon Tool to 1 of your Pokemon that doesn’t already have a Pokemon Tool attached to it. If the Pokemon this Tool is attached to is Knocked Out by damage from an opponent's attack, discard the top 2 cards of your opponent's deck. You may play as many Item cards as you like during your turn (before your attack)."
				onPlay {reason->
          // TODO
				}
				onRemoveFromPlay {
				}
				allowAttach {to->
				}
			};
			case OLEANA_90:
			return supporter (this) {
				text "Discard 2 cards from your hand in order to play this card. Your opponent reveals their hand. Choose a Trainer you find there and put it at the bottom of your opponent's deck. You may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
          // TODO
				}
				playRequirement{
				}
			};
			case DAN_91:
			return supporter (this) {
				text "Draw 2 cards. Play Rock-Paper-Scissors with your opponent. If you win, draw 2 more cards. You may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
          // TODO
				}
				playRequirement{
				}
			};
			case BOSS_S_ORDERS_92:
			return supporter (this) {
				text "Choose 1 of your opponent’s Benched Pokemon and switch it with their Active Pokemon. You may play only 1 Supporter card during your turn (before your attack)."
				onPlay {
          // TODO
				}
				playRequirement{
				}
			};
			case GALAR_MINE_93:
			return stadium (this) {
				text "The Retreat Cost of each Active Pokemon (both yours and your opponent’s) is [C][C] more. This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card."
				onPlay {
          // TODO
				}
				onRemoveFromPlay{
				}
			};
			case SPEED_LIGHTNING_ENERGY_94:
			return specialEnergy (this, [[L]]) {
				text "This card provides 1 [L] Energy while it’s attached to a Pokemon. When you attach this card from your hand to an [L] Pokemon, draw 2 cards"
				onPlay {reason->
          // TODO
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case HORROR_PSYCHIC_ENERGY_95:
			return specialEnergy (this, [[P]]) {
				text "This card provides 1 [P] Energy while it’s attached to a Pokemon. When the [P] Pokemon this card is attached to is your Active Pokemon and is damaged by an opponents attack, put 2 damage counters on the Attacking Pokemon."
				onPlay {reason->
          // TODO
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
			case CAPTURE_ENERGY_96:
			return specialEnergy (this, [[C]]) {
				text "This card provides [C] Energy only while attached to a Pokemon. When attaching this card from your hand to 1 of your Pokemon, search your deck for a Basic Pokemon and put it on your Bench. Then, shuffle your deck."
				onPlay {reason->
          // TODO
				}
				onRemoveFromPlay {
				}
				onMove {to->
				}
				allowAttach {to->
				}
			};
				default:
			return null;
		}
	}
}