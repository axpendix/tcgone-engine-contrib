package tcgwars.logic.impl.gen4;

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
import static tcgwars.logic.card.Weakness.*

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
 */
public enum Arceus implements CardInfo {

	CHARIZARD_1 ("Charizard", 1, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
	FROSLASS_2 ("Froslass", 2, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	HEATRAN_3 ("Heatran", 3, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
	KABUTOPS_4 ("Kabutops", 4, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	LUXRAY_5 ("Luxray", 5, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
	MOTHIM_6 ("Mothim", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	PROBOPASS_7 ("Probopass", 7, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
	SALAMENCE_8 ("Salamence", 8, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	SWALOT_9 ("Swalot", 9, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	TANGROWTH_10 ("Tangrowth", 10, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	TOXICROAK_11 ("Toxicroak", 11, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	ZAPDOS_G_12 ("Zapdos G", 12, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	AERODACTYL_13 ("Aerodactyl", 13, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	BRONZONG_14 ("Bronzong", 14, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
	CHERRIM_15 ("Cherrim", 15, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	GENGAR_16 ("Gengar", 16, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	GENGAR_17 ("Gengar", 17, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
	GLALIE_18 ("Glalie", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	GOLEM_19 ("Golem", 19, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
	HARIYAMA_20 ("Hariyama", 20, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	LOPUNNY_21 ("Lopunny", 21, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	MANECTRIC_22 ("Manectric", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	OMASTAR_23 ("Omastar", 23, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
	PELIPPER_24 ("Pelipper", 24, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	PICHU_25 ("Pichu", 25, Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
	PORYGON_Z_G_26 ("Porygon-Z G", 26, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	RAICHU_27 ("Raichu", 27, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	RAPIDASH_28 ("Rapidash", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	RATICATE_29 ("Raticate", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	SCEPTILE_30 ("Sceptile", 30, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	SCEPTILE_31 ("Sceptile", 31, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	SPIRITOMB_32 ("Spiritomb", 32, Rarity.RARE, [BASIC, POKEMON, _DARKNESS_]),
	BRONZONG_33 ("Bronzong", 33, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
	BRONZOR_34 ("Bronzor", 34, Rarity.UNCOMMON, [BASIC, POKEMON, _METAL_]),
	CHARMELEON_35 ("Charmeleon", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	GASTLY_36 ("Gastly", 36, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	GRAVELER_37 ("Graveler", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	GROVYLE_38 ("Grovyle", 38, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	GROVYLE_39 ("Grovyle", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	GULPIN_40 ("Gulpin", 40, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
	HAUNTER_41 ("Haunter", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	HAUNTER_42 ("Haunter", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
	LUXIO_43 ("Luxio", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	MANECTRIC_44 ("Manectric", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	PELIPPER_45 ("Pelipper", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	PONYTA_46 ("Ponyta", 46, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
	RAPIDASH_47 ("Rapidash", 47, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	SHELGON_48 ("Shelgon", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	WORMADAM_PLANT_CLOAK_49 ("Wormadam Plant Cloak", 49, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	WORMADAM_SANDY_CLOAK_50 ("Wormadam Sandy Cloak", 50, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	WORMADAM_TRASH_CLOAK_51 ("Wormadam Trash Cloak", 51, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
	BAGON_52 ("Bagon", 52, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	BEEDRILL_G_53 ("Beedrill G", 53, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	BRONZOR_54 ("Bronzor", 54, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
	BUNEARY_55 ("Buneary", 55, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	BURMY_PLANT_CLOAK_56 ("Burmy Plant Cloak", 56, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	BURMY_SANDY_CLOAK_57 ("Burmy Sandy Cloak", 57, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	BURMY_TRASH_CLOAK_58 ("Burmy Trash Cloak", 58, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	CHARMANDER_59 ("Charmander", 59, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	CHERUBI_60 ("Cherubi", 60, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	CROAGUNK_61 ("Croagunk", 61, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	ELECTRIKE_62 ("Electrike", 62, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	ELECTRIKE_63 ("Electrike", 63, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	GASTLY_64 ("Gastly", 64, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	GEODUDE_65 ("Geodude", 65, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	GULPIN_66 ("Gulpin", 66, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
	KABUTO_67 ("Kabuto", 67, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	MAKUHITA_68 ("Makuhita", 68, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	NOSEPASS_69 ("Nosepass", 69, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	OMANYTE_70 ("Omanyte", 70, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	PIKACHU_71 ("Pikachu", 71, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	PONYTA_72 ("Ponyta", 72, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
	RATTATA_73 ("Rattata", 73, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	SHINX_74 ("Shinx", 74, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	SNORUNT_75 ("Snorunt", 75, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	TANGELA_76 ("Tangela", 76, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	TANGELA_77 ("Tangela", 77, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	TREECKO_78 ("Treecko", 78, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	TREECKO_79 ("Treecko", 79, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	WINGULL_80 ("Wingull", 80, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	WINGULL_81 ("Wingull", 81, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	BEGINNING_DOOR_82 ("Beginning Door", 82, Rarity.UNCOMMON, [TRAINER]),
	BENCH_SHIELD_83 ("Bench Shield", 83, Rarity.UNCOMMON, [TRAINER]),
	BUFFER_PIECE_84 ("Buffer Piece", 84, Rarity.UNCOMMON, [TRAINER]),
	DEPARTMENT_STORE_GIRL_85 ("Department Store Girl", 85, Rarity.UNCOMMON, [TRAINER]),
	ENERGY_RESTORE_86 ("Energy Restore", 86, Rarity.UNCOMMON, [TRAINER]),
	EXPERT_BELT_87 ("Expert Belt", 87, Rarity.UNCOMMON, [TRAINER]),
	LUCKY_EGG_88 ("Lucky Egg", 88, Rarity.UNCOMMON, [TRAINER]),
	OLD_AMBER_89 ("Old Amber", 89, Rarity.COMMON, [TRAINER]),
	PROFESSOR_OAK_S_VISIT_90 ("Professor Oak's Visit", 90, Rarity.UNCOMMON, [TRAINER]),
	ULTIMATE_ZONE_91 ("Ultimate Zone", 91, Rarity.UNCOMMON, [TRAINER]),
	DOME_FOSSIL_92 ("Dome Fossil", 92, Rarity.COMMON, [TRAINER]),
	HELIX_FOSSIL_93 ("Helix Fossil", 93, Rarity.COMMON, [TRAINER]),
	ARCEUS_LV_X_94 ("Arceus LV.X", 94, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _COLORLESS_]),
	ARCEUS_LV_X_95 ("Arceus LV.X", 95, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _COLORLESS_]),
	ARCEUS_LV_X_96 ("Arceus LV.X", 96, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _COLORLESS_]),
	GENGAR_LV_X_97 ("Gengar LV.X", 97, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _PSYCHIC_]),
	SALAMENCE_LV_X_98 ("Salamence LV.X", 98, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _COLORLESS_]),
	TANGROWTH_LV_X_99 ("Tangrowth LV.X", 99, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _GRASS_]),
	BAGON_SH10 ("Bagon", 100, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	PONYTA_SH11 ("Ponyta", 101, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
	SHINX_SH12 ("Shinx", 102, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	ARCEUS_AR1 ("Arceus", 103, Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_]),
	ARCEUS_AR2 ("Arceus", 104, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
	ARCEUS_AR3 ("Arceus", 105, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
	ARCEUS_AR4 ("Arceus", 106, Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
	ARCEUS_AR5 ("Arceus", 107, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	ARCEUS_AR6 ("Arceus", 108, Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
	ARCEUS_AR7 ("Arceus", 109, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
	ARCEUS_AR8 ("Arceus", 110, Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
	ARCEUS_AR9 ("Arceus", 111, Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]);

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	Arceus(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.ARCEUS;
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
			case CHARIZARD_1:
			return evolution (this, from:"Charmeleon", hp:HP140, type:FIRE, retreatCost:3) {
				weakness W, PLUS30
				resistance F, MINUS20
				pokeBody "Fire Formation", {
					text "Each of Charizard’s attacks does 10 more damage for each Fire Pokémon on your Bench to your opponent’s Active Pokémon (before applying Weakness and Resistance)."
					delayedA {
						after PROCESS_ATTACK_EFFECTS, {
							bg.dm().each{if(it.from==self && it.to.active && it.to.owner!=self.owner && it.dmg.value){
								int dmg = 10*my.bench.findAll{it.types.contains(R)}.size()
								it.dmg+=hp(dmg)
								if(dmg) bc "Fire Formation +$dmg"
							}}
						}
					}
				}
				move "Fire Wing", {
					text "30 damage. "
					energyCost R
					attackRequirement {}
					onAttack {
						damage 30
					}
				}
				move "Burning Tail", {
					text "80 damage. Discard a Fire Energy attached to Charizard."
					energyCost R, R, C, R
					attackRequirement {}
					onAttack {
						damage 80
						discardSelfEnergy(R)
					}
				}
				
			};
			case FROSLASS_2:
			return evolution (this, from:"Snorunt", hp:HP080, type:WATER, retreatCost:1) {
				weakness M, PLUS20
				pokePower "Snow Gift", {
					text "Once during your turn, when you play Froslass from your hand to evolve 1 of your Pokémon, you may search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
					actionA {
					}
				}
				move "Ground Frost", {
					text "50 damage. If there is any Stadium Card in play, this attack does nothing."
					energyCost W, C
					attackRequirement {
						assert (bg.stadiumInfoStruct) == null
						}
					onAttack {
						damage 50
					}
				}
				
			};
			case HEATRAN_3:
			return basic (this, hp:HP100, type:FIRE, retreatCost:3) {
				weakness W
				move "Fire Fang", {
					text "20 damage. The Defending Pokémon is now Burned."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Magma Mantle", {
					text "Energy card you discarded."
					energyCost R, R, C, C, R, M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KABUTOPS_4:
			return evolution (this, from:"Kabuto", hp:HP130, type:FIGHTING, retreatCost:2) {
				weakness G, PLUS30
				move "Primal Scythe", {
					text "20+ damage. You may discard Helix Fossil, Dome Fossil, or Old Amber from your hand. If you do, this attack does 20 damage plus 50 more damage."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rock Slide", {
					text "60 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUXRAY_5:
			return evolution (this, from:"Luxio", hp:HP120, type:LIGHTNING, retreatCost:0) {
				weakness F, PLUS30
				resistance M, MINUS20
				move "Flash", {
					text "30 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, this attack does nothing."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Gadget Bolt", {
					text "60 damage. If Luxray has a Pokémon Tool card attached to it, you may do 100 damage instead of 60 to the Defending Pokémon. If you do, discard that Pokémon Tool card."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MOTHIM_6:
			return evolution (this, from:"Burmy", hp:HP090, type:GRASS, retreatCost:0) {
				weakness R, PLUS20
				resistance F, MINUS20
				move "Cloak Party", {
					text "Search your deck for up to 3 in any combination of Burmy and Wormadam, show them to your opponent, and put them into your hand. Shuffle your deck afterwards."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Energy Assist", {
					text "30 damage. Seach your discard pile for a basic Energy card and attach it to 1 of your Benched Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PROBOPASS_7:
			return evolution (this, from:"Nosepass", hp:HP100, type:METAL, retreatCost:3) {
				weakness R, PLUS20
				resistance P, MINUS20
				pokeBody "Competitiveness", {
					text "If you don’t have a Supporter card in play, each of Probopass’s attacks does 30 more damage to the Active Pokémon ."
					delayedA {
					}
				}
				move "Top Chop", {
					text "30 damage. Draw a card."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tumbling Attack", {
					text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 20 more damage."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SALAMENCE_8:
			return evolution (this, from:"Shelgon", hp:HP140, type:COLORLESS, retreatCost:2) {
				weakness C, PLUS30
				resistance F, MINUS20
				pokePower "Top Accelerator", {
					text "Once during your turn , you may reveal the top card of your deck. If that card is a basic Energy card, attach it to 1 of your Pokémon. If that card isn’t a basic Energy card, discard it. This power can’t be used if Salamence is affected by a Special Condition."
					actionA {
					}
				}
				move "Shoot Through", {
					text "50 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
					energyCost R, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dragon Claw", {
					text "70 damage. "
					energyCost C, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SWALOT_9:
			return evolution (this, from:"Gulpin", hp:HP100, type:PSYCHIC, retreatCost:3) {
				weakness P, PLUS20
				move "Damage Roller", {
					text "Put damage counters on the Defending Pokémon until the Defending Pokémon has the same remaining HP as Swalot. (If the Defending Pokémon has the same or less remaining HP as Swalot, this attack does nothing.)"
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Entangle Tackle", {
					text "50+ damage. You may do 50 damage plus 30 more damage. If you do, this attack does 30 damage to 1 of your Pokémon, and don’t apply Weakness and Resistance to this damage."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TANGROWTH_10:
			return evolution (this, from:"Tangela", hp:HP110, type:GRASS, retreatCost:3) {
				weakness R, PLUS30
				resistance W, MINUS20
				move "Leaf Guard", {
					text "30 damage. ."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Swallow Up", {
					text "50 damage. Before doing damage, count the remaining HP of the Defending Pokémon and Tangrowth. If the Defending Pokémon has fewer remaining HP than Tangrowth’s, this attack does 120 damage instead."
					energyCost G, G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TOXICROAK_11:
			return evolution (this, from:"Croagunk", hp:HP090, type:FIGHTING, retreatCost:1) {
				weakness P, PLUS20
				move "Corner", {
					text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Convert Blow", {
					text "30+ damage. Energy attached to it, this attack does 30 damage plus 30 more damage."
					energyCost C, C, P, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ZAPDOS_G_12:
			return basic (this, hp:HP090, type:LIGHTNING, retreatCost:2) {
				weakness L
				resistance F, MINUS20
				move "Charge Beam", {
					text "10 damage. ."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Lightning Strike", {
					text "40 damage. . If you do, this attack’s base damage is 80 instead of 40."
					energyCost L, L, C, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case AERODACTYL_13:
			return evolution (this, from:"Old Amber", hp:HP080, type:FIGHTING, retreatCost:1) {
				weakness L, PLUS20
				resistance F, MINUS20
				pokePower "Unearth", {
					text "Once during your turn , you may search your deck for Helix Fossil, Dome Fossil, or Old Amber, show it your opponent, and put it into your hand. Shuffle your deck afterward. This power can’t be used if Aerodactyl is affected by a Special Condition."
					actionA {
					}
				}
				move "Hyper Beam", {
					text "30 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BRONZONG_14:
			return evolution (this, from:"Bronzor", hp:HP090, type:METAL, retreatCost:3) {
				weakness R, PLUS20
				resistance P, MINUS20
				move "Oracle Arrow", {
					text "Choose 1 of your opponent’s Pokémon that has any damage counters on it. This attack does 40 damage to that Pokémon."
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Antigravity", {
					text "60 damage. The Retreat Cost for Bronzong is 0 until the end of your next turn."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHERRIM_15:
			return evolution (this, from:"Cherubi", hp:HP080, type:GRASS, retreatCost:1) {
				weakness R, PLUS20
				resistance W, MINUS20
				pokeBody "Cloudy Sky", {
					text "If any of your Pokémon or Pokémon would be damaged by an attack, reduce this damage by 10 ."
					delayedA {
					}
				}
				move "Worry Seed", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GENGAR_16:
			return evolution (this, from:"Haunter", hp:HP110, type:PSYCHIC, retreatCost:0) {
				weakness D, PLUS30
				resistance C, MINUS20
				pokePower "Curse", {
					text "Once during your turn , you may move 1 damage counter from 1 of your opponent’s Pokémon to another of your opponent’s Pokémon. This power can’t be used if Gengar is affected by a Special Condition."
					actionA {
					}
				}
				move "Shadow Skip", {
					text "60 damage. You may switch Gengar with 1 of your Benched Pokémon."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GENGAR_17:
			return evolution (this, from:"Haunter", hp:HP120, type:PSYCHIC, retreatCost:0) {
				weakness D, PLUS30
				resistance C, MINUS20
				move "Sharpshooting", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poison Jab", {
					text "60 damage. The Defending Pokémon is now Poisoned."
					energyCost P, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GLALIE_18:
			return evolution (this, from:"Snorunt", hp:HP090, type:WATER, retreatCost:1) {
				weakness M, PLUS20
				move "Wreck", {
					text "20+ damage. If there is any Stadium card in play, this attack does 20 damage plus 50 more damage. Discard that Stadium card."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Avalanche", {
					text "50 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Benched Pokémon."
					energyCost W, W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GOLEM_19:
			return evolution (this, from:"Graveler", hp:HP140, type:FIGHTING, retreatCost:4) {
				weakness G, PLUS30
				resistance L, MINUS20
				move "Lunge Out", {
					text "50 damage. "
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tumble Down", {
					text "30× damage. Energy cards you discarded."
					energyCost F, C, C, F, F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rock Tumble", {
					text "80 damage. This attack’s damage isn’t affected by Resistance."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HARIYAMA_20:
			return evolution (this, from:"Makuhita", hp:HP110, type:FIGHTING, retreatCost:4) {
				weakness P, PLUS30
				move "Push Out", {
					text "50 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Vortex Chop", {
					text "60 damage. If the Defending Pokémon has any Resistance, this attack’s base damage is 120 instead of 60."
					energyCost F, F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LOPUNNY_21:
			return evolution (this, from:"Buneary", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS20
				pokePower "Relaxing Shower", {
					text "Once during your turn , you may discard an Energy card from your hand. If you do, remove 1 damage counter from each of your Pokémon. This power can’t be used if Lopunny is affected by a Special Condition."
					actionA {
					}
				}
				move "Hover Heal", {
					text "40 damage. Remove all Special Conditions from Lopunny."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MANECTRIC_22:
			return evolution (this, from:"Electrike", hp:HP090, type:LIGHTNING, retreatCost:0) {
				weakness F, PLUS20
				resistance M, MINUS20
				move "Second Bite", {
					text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on the Defending Pokémon."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Swift", {
					text "50 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case OMASTAR_23:
			return evolution (this, from:"Omanyte", hp:HP120, type:WATER, retreatCost:1) {
				weakness G, PLUS30
				move "Time Spiral", {
					text "Choose 1 of your opponent’s Evolved Pokémon. Remove the highest Stage Evolution card from that Pokémon and have your opponent shuffle that card into his or her deck."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Primal Tentacles", {
					text "30+ damage. Does 30 damage plus 10 more damage for each Helix Fossil, Dome Fossil, and Old Amber in your discard pile."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PELIPPER_24:
			return evolution (this, from:"Wingull", hp:HP090, type:WATER, retreatCost:2) {
				weakness L, PLUS20
				resistance F, MINUS20
				move "Water Pulse", {
					text "30 damage. The Defending Pokémon is now Asleep."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Continuous Crush", {
					text "70 damage. Flip a coin until you get tails. For each heads, discard an Energy card attached to the Defending Pokémon."
					energyCost W, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PICHU_25:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS10
				resistance M, MINUS20
				pokePower "Baby Evolution", {
					text "Once during your turn , you may put Pikachu from your hand onto Pichu (this counts as evolving Pichu) and remove all damage counters from Pichu."
					actionA {
					}
				}
				move "Baby Steps", {
					text "Look at the top 5 cards of your deck, choose 1 of them, and put it into your hand. Shuffle the other cards back into your deck."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PORYGON_Z_G_26:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness F
				pokePower "Dowsing Code", {
					text "Once during your turn, when you put Porygon-Z from your hand onto your Bench, you may search your discard pile for up to 2 Pokémon Tool cards, show them to your opponent, and shuffle them into your deck."
					actionA {
					}
				}
				move "Ambush", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 40 more damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAICHU_27:
			return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS20
				resistance M, MINUS20
				move "Boosted Voltage", {
					text "20 damage. If Raichu has a Pokémon Tool card attached to it, this attack does 20 damage to each of your opponent’s Benched Pokémon that isn’t an Evolved Pokémon."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder Blast", {
					text "70 damage. Discard a Lightning Energy card attached to Raichu."
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAPIDASH_28:
			return evolution (this, from:"Ponyta", hp:HP080, type:FIRE, retreatCost:0) {
				weakness W, PLUS20
				pokeBody "Wild Guard", {
					text "Prevent all effects of attacks, including damage, done to Rapidash by your opponent’s Pokémon ."
					delayedA {
					}
				}
				move "Fire Mane", {
					text "20 damage. "
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Rising Lunge", {
					text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 20 more damage."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RATICATE_29:
			return evolution (this, from:"Rattata", hp:HP070, type:COLORLESS, retreatCost:0) {
				weakness F, PLUS20
				move "Recruit", {
					text "Look at your opponent’s hand, choose a Supporter card you find there, and discard it. Then, use the effect of that card as the effect of this attack."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Extend Fang", {
					text "20+ damage. If Raticate has a Pokémon Tool card attached to it, this attack does 20 damage plus 40 more damage."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SCEPTILE_30:
			return evolution (this, from:"Grovyle", hp:HP120, type:GRASS, retreatCost:2) {
				weakness R, PLUS30
				resistance W, MINUS20
				pokeBody "Green Breath", {
					text "When you attach a Energy card from your hand to Sceptile, remove 2 damage counters from Sceptile."
					delayedA {
					}
				}
				move "Leaf Blast", {
					text "20× damage. Energy attached to Sceptile."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Poison Claws", {
					text "60 damage. The Defending Pokémon is now Poisoned."
					energyCost G, C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SCEPTILE_31:
			return evolution (this, from:"Grovyle", hp:HP130, type:GRASS, retreatCost:1) {
				weakness R, PLUS30
				resistance W, MINUS20
				move "Leaf Supply", {
					text "30 damage. You may attach a basic Energy card from your hand to 1 of your Pokémon."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dual Cut", {
					text "70× damage. Flip 2 coins. This attack does 70 damage times the number of heads."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SPIRITOMB_32:
			return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
				resistance C, MINUS20
				pokeBody "Keystone Seal", {
					text "As long as Spiritomb is your Active Pokémon, each player can’t play any Trainer cards from his or her hand."
					delayedA {
					}
				}
				move "Darkness Grace", {
					text "Search your deck for a card that evolves from 1 of your Pokémon and put it onto that Pokémon. (This counts as evolving that Pokémon.) If you do, put 1 damage counter on Spiritomb. Shuffle your deck afterward."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Will-o’-the-wisp", {
					text "10 damage. "
					energyCost D
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BRONZONG_33:
			return evolution (this, from:"Bronzor", hp:HP090, type:METAL, retreatCost:3) {
				weakness R, PLUS20
				resistance P, MINUS20
				move "Wide Laser", {
					text "This attack does 10 damage to each of your opponent’s Pokémon."
					energyCost M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Hyper Beam", {
					text "50 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BRONZOR_34:
			return basic (this, hp:HP050, type:METAL, retreatCost:2) {
				weakness R, PLUS10
				resistance P, MINUS20
				move "Speed Dive", {
					text "10 damage. "
					energyCost M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Extrasensory", {
					text "30+ damage. If you have the same number of cards in your hand as your opponent, this attack does 30 damage plus 30 more damage."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARMELEON_35:
			return evolution (this, from:"Charmander", hp:HP080, type:FIRE, retreatCost:1) {
				weakness W, PLUS20
				move "Slam", {
					text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fire Punch", {
					text "50 damage. "
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GASTLY_36:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness D
				resistance C, MINUS20
				move "Lick", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Night Shade", {
					text "10 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GRAVELER_37:
			return evolution (this, from:"Geodude", hp:HP090, type:FIGHTING, retreatCost:3) {
				weakness G, PLUS20
				resistance L, MINUS20
				move "Tackle", {
					text "30 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double-edge", {
					text "70 damage. Graveler does 10 damage to itself."
					energyCost F, F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GROVYLE_38:
			return evolution (this, from:"Treecko", hp:HP080, type:GRASS, retreatCost:1) {
				weakness R, PLUS20
				resistance W, MINUS20
				move "Detect", {
					text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Grovyle during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Blade Arms", {
					text "30 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GROVYLE_39:
			return evolution (this, from:"Treecko", hp:HP080, type:GRASS, retreatCost:1) {
				weakness R, PLUS20
				resistance W, MINUS20
				move "Quick Attack", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Cut", {
					text "50 damage. "
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GULPIN_40:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
				weakness P, PLUS10
				move "Endure", {
					text "Flip a coin. If heads, during your opponent’s next turn, if Gulpin would be Knocked Out by damage from an attack, Gulpin is not Knocked Out and its remaining HP becomes 10 instead."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Pound", {
					text "10 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HAUNTER_41:
			return evolution (this, from:"Gastly", hp:HP070, type:PSYCHIC, retreatCost:1) {
				weakness D, PLUS20
				resistance C, MINUS20
				pokeBody "Hidden Poison", {
					text "If Haunter is your Active Pokémon and is damaged by an opponent’s attack (even if Haunter is Knocked Out), the Attacking Pokémon is now Poisoned."
					delayedA {
					}
				}
				move "Tongue Spring", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon."
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case HAUNTER_42:
			return evolution (this, from:"Gastly", hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness D, PLUS20
				resistance C, MINUS20
				move "Psyshot", {
					text "20 damage. "
					energyCost P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Shadow Bind", {
					text "30 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case LUXIO_43:
			return evolution (this, from:"Shinx", hp:HP080, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS20
				resistance M, MINUS20
				move "Kick", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Discharge", {
					text "40× damage. Energy attached to Luxio. Flip a coin for each Energy card you discarded. This attack does 40 damage times the number of heads."
					energyCost L, C, C, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MANECTRIC_44:
			return evolution (this, from:"Electrike", hp:HP090, type:LIGHTNING, retreatCost:0) {
				weakness F, PLUS20
				resistance M, MINUS20
				move "Tackle", {
					text "20 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Head Bolt", {
					text "60 damage. "
					energyCost L, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PELIPPER_45:
			return evolution (this, from:"Wingull", hp:HP090, type:WATER, retreatCost:2) {
				weakness L, PLUS20
				resistance F, MINUS20
				move "Water Ball", {
					text "Energy attached to Pelipper."
					energyCost C, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Wing Attack", {
					text "60 damage. "
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PONYTA_46:
			return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
				weakness W
				move "Ascension", {
					text "Search your deck for a card that evolves from Ponyta and put it onto Ponyta. (This counts as evolving Ponyta.) Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Combustion", {
					text "20 damage. "
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RAPIDASH_47:
			return evolution (this, from:"Ponyta", hp:HP090, type:FIRE, retreatCost:0) {
				weakness W, PLUS20
				move "Searing Flame", {
					text "10 damage. The Defending Pokémon is now Burned."
					energyCost R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Flare", {
					text "40 damage. "
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHELGON_48:
			return evolution (this, from:"Bagon", hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness C, PLUS20
				move "Scrunch", {
					text "Flip a coin. If heads, prevent all damage done to Shelgon during your opponent’s next turn."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Dragon Bump", {
					text "40+ damage. Energy attached to it, this attack does 40 damage plus 20 more damage."
					energyCost C, C, C, R, W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WORMADAM_PLANT_CLOAK_49:
			return evolution (this, from:"Burmy Plant Cloak", hp:HP080, type:GRASS, retreatCost:1) {
				weakness R, PLUS20
				move "Magical Needle", {
					text "20 damage. Remove 2 damage counters from 1 of your Benched Pokémon."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Cloak Scale", {
					text "50 damage. If you have Wormadam Sandy Cloak in play, the Defending Pokémon is now Burned, Confused, and Poisoned."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WORMADAM_SANDY_CLOAK_50:
			return evolution (this, from:"Burmy Sandy Cloak", hp:HP090, type:FIGHTING, retreatCost:1) {
				weakness R, PLUS20
				resistance L, MINUS20
				move "Hang Down", {
					text "30 damage. "
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Cloak Headbutt", {
					text "60+ damage. If you have Wormadam Trash Cloak in play, this attack does 60 damage plus 30 more damage."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WORMADAM_TRASH_CLOAK_51:
			return evolution (this, from:"Burmy Trash Cloak", hp:HP090, type:METAL, retreatCost:1) {
				weakness R, PLUS20
				resistance P, MINUS20
				move "Cloak Shard", {
					text "Choose 1 of your Pokémon. This attack does 10 damage to that Pokémon. If you have Wormadam Plant Cloak in play, this attack does 40 damage to that Pokémon instead."
					energyCost M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Serve Trash", {
					text "30 damage. You may search your opponent’s discard pile for any 1 card, show it to your opponent, and put it on top of his or her deck."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BAGON_52:
			return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
				weakness C, PLUS10
				move "Smash Kick", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Super Singe", {
					text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BEEDRILL_G_53:
			return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
				weakness R
				move "Raid", {
					text "10 damage. from your hand during this turn, this attack’s base damage is 40 instead of 10."
					energyCost G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Fury Attack", {
					text "30× damage. Flip 3 coins. This attack does 30 damage times the number of heads."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BRONZOR_54:
			return basic (this, hp:HP060, type:METAL, retreatCost:2) {
				weakness R, PLUS10
				resistance P, MINUS20
				move "Hypnosis", {
					text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
					energyCost M
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Spinning Attack", {
					text "20 damage. "
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BUNEARY_55:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness F, PLUS10
				move "Bunny Hop", {
					text "Choose 1 of your opponent’s Pokémon that doesn’t have any damage counters on it. This attack does 20 damage to that Pokémon."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BURMY_PLANT_CLOAK_56:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				pokeBody "Cloak Evolution", {
					text "Burmy Trash Cloak can evolve during the turn you play it."
					delayedA {
					}
				}
				move "Tackle", {
					text "20 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BURMY_SANDY_CLOAK_57:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				pokeBody "Cloak Evolution", {
					text "Burmy Sandy Cloak can evolve during the turn you play it."
					delayedA {
					}
				}
				move "Tackle", {
					text "20 damage. "
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BURMY_TRASH_CLOAK_58:
			return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				pokeBody "Cloak Evolution", {
					text "Burmy Trash Cloak can evolve during the turn you play it."
					delayedA {
					}
				}
				move "Tackle", {
					text "20 damage. "
					energyCost M, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHARMANDER_59:
			return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
				weakness W, PLUS10
				move "Call for Friends", {
					text "Basic Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
					energyCost C, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Steady Firebreathing", {
					text "20 damage. "
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CHERUBI_60:
			return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				resistance W, MINUS20
				move "Ram", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Solarbeam", {
					text "20 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case CROAGUNK_61:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
				weakness P, PLUS10
				move "Astonish", {
					text "Choose 1 card from your opponent’s hand without looking. Look at that card you chose, then have your opponent shuffle that card into his or her deck."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Punch", {
					text "30 damage. "
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTRIKE_62:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Zap Kick", {
					text "10 damage. "
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Thunder Jolt", {
					text "30 damage. Flip a coin. If tails, Electrike does 10 damage to itself."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ELECTRIKE_63:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Bite", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GASTLY_64:
			return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
				weakness D
				resistance C, MINUS20
				move "Gnaw", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Suffocating Gas", {
					text "20 damage. "
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GEODUDE_65:
			return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
				weakness G, PLUS10
				resistance L, MINUS20
				move "Stone Barrage", {
					text "10× damage. Flip a coin until you get tails. This attack does 10 damage times the number of heads."
					energyCost F
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GULPIN_66:
			return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
				weakness P, PLUS10
				move "Collect", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Drool", {
					text "20 damage. "
					energyCost P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case KABUTO_67:
			return evolution (this, from:"Dome Fossil", hp:HP080, type:FIGHTING, retreatCost:1) {
				weakness G, PLUS20
				move "Fast Evolution", {
					text "Search your deck for up to 2 Evolution cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Speed Attack", {
					text "30 damage. "
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case MAKUHITA_68:
			return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
				weakness P, PLUS10
				move "Sand Attack", {
					text "If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Magnum Punch", {
					text "30 damage. "
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case NOSEPASS_69:
			return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
				weakness W, PLUS10
				move "Harden", {
					text "During your opponent’s next turn, if Nosepass would be damaged by an attack, prevent that attack’s damage done to Nosepass if that damage is 30 or less."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Knock Away", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost F, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case OMANYTE_70:
			return evolution (this, from:"Helix Fossil", hp:HP080, type:WATER, retreatCost:1) {
				weakness G, PLUS20
				move "Collect", {
					text "Draw 3 cards."
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Tickle", {
					text "20 damage. Flip a coin. If heads, the Defendign Pokémon is now Paralyzed."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PIKACHU_71:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS10
				resistance M, MINUS20
				move "Pika Ball", {
					text "10 damage. "
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Mega Shot", {
					text "Energy attached to Pikachu and then choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon."
					energyCost L, C, C, L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PONYTA_72:
			return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
				weakness W, PLUS10
				move "Tackle", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Stomp", {
					text "10 damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
					energyCost R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case RATTATA_73:
			return basic (this, hp:HP030, type:COLORLESS, retreatCost:0) {
				weakness F, PLUS10
				move "Lunge", {
					text "30 damage. Flip a coin. If tails, this attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHINX_74:
			return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
				weakness F, PLUS10
				resistance M, MINUS20
				move "Gnaw", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Swagger", {
					text "20 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SNORUNT_75:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness M, PLUS10
				move "Ice Breath", {
					text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Double Headbutt", {
					text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TANGELA_76:
			return basic (this, hp:HP070, type:GRASS, retreatCost:2) {
				weakness R, PLUS10
				resistance W, MINUS20
				move "Absorb", {
					text "10 damage. Remove 1 damage counter from Tangela."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sleep Powder", {
					text "20 damage. The Defending Pokémon is now Asleep."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TANGELA_77:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				resistance W, MINUS20
				move "Collect", {
					text "Draw a card."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Stun Spore", {
					text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
					energyCost G, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TREECKO_78:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				resistance W, MINUS20
				move "Tail Crush", {
					text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
					energyCost C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TREECKO_79:
			return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
				weakness R, PLUS10
				resistance W, MINUS20
				move "Pound", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Slash", {
					text "20 damage. "
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WINGULL_80:
			return basic (this, hp:HP040, type:WATER, retreatCost:1) {
				weakness L, PLUS10
				resistance F, MINUS20
				move "Glide", {
					text "10 damage. "
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Slashing Strike", {
					text "30 damage. During your next turn, Wingull can’t use Slashing Strike."
					energyCost W, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case WINGULL_81:
			return basic (this, hp:HP050, type:WATER, retreatCost:1) {
				weakness L, PLUS10
				resistance F, MINUS20
				move "Rain Splash", {
					text "20 damage. "
					energyCost W
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BEGINNING_DOOR_82:
			return basicTrainer (this) {
				text "Search your deck for Arceus, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case BENCH_SHIELD_83:
			return basicTrainer (this) {
				text "Attach Bench Shield to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nAs long as the Pokémon this card is attached to is on your Bench, prevent all damage done to that Pokémon by attacks (both yours and your opponent’s)."
				onPlay {
				}
				playRequirement{
				}
			};
			case BUFFER_PIECE_84:
			return basicTrainer (this) {
				text "Attach Buffer Piece to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nAny damage done to the Pokémon this card is attached to by an opponent’s attack is reduced by 20 (after applying Weakness and Resistance). At the end of your opponent’s turn after you played Buffer Piece, discard Buffer Piece."
				onPlay {
				}
				playRequirement{
				}
			};
			case DEPARTMENT_STORE_GIRL_85:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck for up to 3 Pokémon Tool cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case ENERGY_RESTORE_86:
			return basicTrainer (this) {
				text "Flip 3 coins. For each heads, put a basic Energy card from your discard pile into your hand. If you don’t have that many basic Energy cards in your discard pile, put all of them into your hand."
				onPlay {
				}
				playRequirement{
				}
			};
			case EXPERT_BELT_87:
			return basicTrainer (this) {
				text "Attach Expert Belt to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nThe Pokémon this card is attached to gets +20 HP and that Pokémon’s attacks do 20 more damage to your opponent’s Active Pokémon (before applying Weakness and Resistance). When the Pokémon this card is attached to is Knocked Out, your opponent takes 1 more Prize card."
				onPlay {
				}
				playRequirement{
				}
			};
			case LUCKY_EGG_88:
			return basicTrainer (this) {
				text "Attach Lucky Egg to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nWhen the Pokémon this card is attached to is Knocked Out by damage from an opponent’s attack, draw cards until you have 7 cards into your hands."
				onPlay {
				}
				playRequirement{
				}
			};
			case OLD_AMBER_89:
			return basicTrainer (this) {
				text "Play Old Amber as if it were a [C] Basic Pokémon. (Old Amber counts as a Trainer card as well, but if Old Amber is Knocked Out, this counts as a Knocked Out Pokémon.) Old Amber can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Old Amber from play. (This doesn’t count as a Knocked Out Pokémon.)\nPoké-BODY: Hard Amber As long as Old Amber is on your Bench, prevent all damage done to Old Amber by attacks (both yours and your opponent’s)."
				onPlay {
				}
				playRequirement{
				}
			};
			case PROFESSOR_OAK_S_VISIT_90:
			return basicTrainer (this) {
				text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDraw 3 cards. Then, choose a card from your hand and put it on the bottom of your deck."
				onPlay {
				}
				playRequirement{
				}
			};
			case ULTIMATE_ZONE_91:
			return basicTrainer (this) {
				text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nDuring each player’s turn, the player may move an Energy card attached to 1 of his or her Benched Pokémon to his or her Active Arceus as often as he or she likes."
				onPlay {
				}
				playRequirement{
				}
			};
			case DOME_FOSSIL_92:
			return basicTrainer (this) {
				text "Play Dome Fossil as if it were a [C] Basic Pokémon. (Dome Fossil counts as a Trainer card as well, but if Dome Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Dome Fossil can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Dome Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\nPoké-BODY: Rock Reaction When you attach a [F] Energy card from your hand to Dome Fossil (excluding effects of attacks or Poké-Powers), search your deck for a card that evolves from Dome Fossil and put it onto Dome Fossil (this counts as evolving Dome Fossil). Shuffle your deck afterward."
				onPlay {
				}
				playRequirement{
				}
			};
			case HELIX_FOSSIL_93:
			return basicTrainer (this) {
				text "Play Helix Fossil as if it were a [C] Basic Pokémon. (Helix Fossil counts as a Trainer card as well, but if Helix Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Helix Fossil can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Helix Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\nPoké-BODY: Aqua Reaction When you attach a [W] Energy card from your hand to Helix Fossil (excluding effects of attacks or Poké-Powers), search your deck for a card that evolves from Helix Fossil and put it onto Helix Fossil (this counts as evolving Helix Fossil). Shuffle your deck afterwards."
				onPlay {
				}
				playRequirement{
				}
			};
			case ARCEUS_LV_X_94:
			return evolution (this, from:"Arceus", hp:HP120, type:COLORLESS, retreatCost:1) {
				pokeBody "Multitype", {
					text "Arceus LV.‘s type is the same type as its previous Level."
					delayedA {
					}
				}
				pokeBody "Omniscient", {
					text "Arceus can use the attacks of all Arceus you have in play as its own."
					delayedA {
					}
				}
				move "", {
					text "You may have as many of this card in your deck as you like."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Arceus. Arceus LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCEUS_LV_X_95:
			return evolution (this, from:"Arceus", hp:HP120, type:COLORLESS, retreatCost:1) {
				pokeBody "Multitype", {
					text "Arceus LV.‘s type is the same as its previous Level."
					delayedA {
					}
				}
				move "", {
					text "You may have as many of this card in your deck as you like."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Meteor Blast", {
					text "100 damage. Flip a coin. If tails, this attack’s base damage is 50 instead of 100."
					energyCost G, R, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Arceus. Arceus LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCEUS_LV_X_96:
			return evolution (this, from:"Arceus", hp:HP120, type:COLORLESS, retreatCost:1) {
				pokeBody "Multitype", {
					text "Arceus LV.‘s type is the same type as its previous Level."
					delayedA {
					}
				}
				move "", {
					text "You may have as many of this card in your deck as you like."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Psychic Bolt", {
					text "100 damage. Energy attached to Arceus."
					energyCost L, P, C, L, P
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Arceus. Arceus LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case GENGAR_LV_X_97:
			return evolution (this, from:"Gengar", hp:HP140, type:PSYCHIC, retreatCost:0) {
				weakness D
				resistance C, MINUS20
				pokePower "Level-Down", {
					text "Once during your turn , you may choose 1 of your opponent’s Pokémon LV.. Remove the Level-Up card from that Pokémon and have your opponent shuffle the card into his or her deck. The power can’t be used if Gengar is affected by a Special Condition."
					actionA {
					}
				}
				move "Compound Pain", {
					text "This attack does 30 damage to each of your opponent’s Pokémon that already has damage counters on it."
					energyCost P, P, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Gengar. Gengar LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SALAMENCE_LV_X_98:
			return evolution (this, from:"Salamence", hp:HP160, type:COLORLESS, retreatCost:2) {
				weakness C
				resistance F, MINUS20
				pokePower "Double Fall", {
					text "Once during your turn , when you put Salamence LV. from your hand onto your Active Salamence, you may use this power. For each of your opponent’s Pokémon that is Knocked Out by damage from Salamence’s attacks this turn, take 1 more Prize card."
					actionA {
					}
				}
				move "Steam Blast", {
					text "100 damage. Discard an Energy card attached to Salamence."
					energyCost R, W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Salamence. Salamence LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case TANGROWTH_LV_X_99:
			return evolution (this, from:"Tangrowth", hp:HP130, type:GRASS, retreatCost:3) {
				weakness R
				resistance W, MINUS20
				pokePower "Healing Growth", {
					text "Once during your turn , you may flip a coin. If heads, remove 4 damage counters from 1 of your Pokémon. This power can’t be used if Tangrowth is affected by a Special Condition."
					actionA {
					}
				}
				move "Big Growth", {
					text "Energy cards as you like and attach them to your Pokémon in any way you like."
					energyCost G, G
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "", {
					text "Put this card onto your Active Tangrowth. Tangrowth LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case BAGON_SH10:
			return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
				weakness C
				pokeBody "Star Barrier", {
					text "As long as Bagon has any Energy attached to it, Bagon has no Weakness."
					delayedA {
					}
				}
				move "Dragon Rage", {
					text "40 damage. Flip 2 coins. If either of them is tails, this attack does nothing."
					energyCost C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case PONYTA_SH11:
			return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
				weakness W, PLUS10
				pokeBody "Star Barrier", {
					text "As long as Ponyta has any Energy attached to it, Ponyta has no Weakness."
					delayedA {
					}
				}
				move "Blue Fire", {
					text "50 damage. Energy attached to Ponyta."
					energyCost R, R, R
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case SHINX_SH12:
			return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				pokeBody "Star Barrier", {
					text "As long as Shinx has any Energy attached to it, Shinx has no Weakness."
					delayedA {
					}
				}
				move "Payback", {
					text "10+ damage. If your opponent has only 1 Prize card left, this attack does 10 damage plus 30 more damage."
					energyCost L
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCEUS_AR1:
			return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
				weakness F
				resistance P, MINUS20
				move "Prize Count", {
					text "20+ damage. If you have more Prize cards left than your opponent, this attack does 20 damage plus 60 more damage"
					energyCost D, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCEUS_AR2:
			return basic (this, hp:HP090, type:GRASS, retreatCost:2) {
				weakness R
				resistance W, MINUS20
				move "Leaf Refresh", {
					text "30 damage. Remove 3 damage counters from each of your Benched Pokémon."
					energyCost G, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCEUS_AR3:
			return basic (this, hp:HP080, type:FIRE, retreatCost:1) {
				weakness W
				move "Bright Flame", {
					text "80 damage. Flip a coin. If tails, discard 2 Energy attached to Arceus."
					energyCost R, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCEUS_AR4:
			return basic (this, hp:HP090, type:WATER, retreatCost:2) {
				weakness L
				move "Fastwave", {
					text "50 damage. This attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
					energyCost W, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCEUS_AR5:
			return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
				weakness F
				move "Ripple Swell", {
					text "If you have 6 Arceus in play and each of them is a different type, search your deck for up to 6 basic Energy cards. Attach each of those Energy cards to a different Pokémon you have in play. Shuffle your deck afterward."
					energyCost ()
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				move "Sky Spear", {
					text "Choose 1 of your opponent’s Pokémon. This attack does 80 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon). Remove all Energy cards attached to Arceus and put them in the Lost Zone."
					energyCost C, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCEUS_AR6:
			return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
				weakness F
				resistance M, MINUS20
				move "Lightning Turn", {
					text "30 damage. Switch Arceus with 1 of your Benched Pokémon."
					energyCost L, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCEUS_AR7:
			return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
				weakness P
				move "Mind Bend", {
					text "40 damage. The Defending Pokémon is now Confused."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCEUS_AR8:
			return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
				weakness W
				resistance L, MINUS20
				move "Break Ground", {
					text "60 damage. Does 10 damage to each of your Benched Pokémon."
					energyCost F, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
			case ARCEUS_AR9:
			return basic (this, hp:HP090, type:METAL, retreatCost:2) {
				weakness R
				resistance P, MINUS20
				move "Metal Barrier", {
					text "40 damage. during your opponent’s next turn."
					energyCost M, C, C
					attackRequirement {}
					onAttack {
						damage 0
					}
				}
				
			};
				default:
			return null;
		}
	}

}
