package tcgwars.logic.impl.gen;

import tcgwars.logic.impl.gen6.Breakthrough;

import tcgwars.logic.impl.gen7.CelestialStorm;
import tcgwars.logic.impl.gen7.DragonMajesty;
import tcgwars.logic.impl.gen7.ForbiddenLight;
import tcgwars.logic.impl.gen7.BurningShadows;
import tcgwars.logic.impl.gen7.SunMoon;
import tcgwars.logic.impl.gen7.GuardiansRising;
import tcgwars.logic.impl.gen7.UltraPrism;
import tcgwars.logic.impl.gen7.ShiningLegends;
import tcgwars.logic.impl.gen7.CrimsonInvasion;
import tcgwars.logic.impl.gen7.TeamUp;
import tcgwars.logic.impl.gen7.LostThunder;
import tcgwars.logic.impl.gen7.SunMoonPromos;

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
 * @author thezipcompany@gmail.com
 */
public enum ShinyVault implements CardInfo {
	
	SCYTHER_SV1 ("Scyther", SV1, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
	QUAGSIRE_SV10 ("Quagsire", SV10, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	FROAKIE_SV11 ("Froakie", SV11, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
	FROGADIER_SV12 ("Frogadier", SV12, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
	VOLTORB_SV13 ("Voltorb", SV13, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
	XURKITREE_SV14 ("Xurkitree", SV14, Rarity.HOLORARE, [POKEMON, BASIC, _LIGHTNING_]),
	SEVIPER_SV15 ("Seviper", SV15, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
	SHUPPET_SV16 ("Shuppet", SV16, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
	INKAY_SV17 ("Inkay", SV17, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
	MALAMAR_SV18 ("Malamar", SV18, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
	POIPOLE_SV19 ("Poipole", SV19, Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
	ROWLET_SV2 ("Rowlet", SV2, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
	SUDOWOODO_SV20 ("Sudowoodo", SV20, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
	RIOLU_SV21 ("Riolu", SV21, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
	LUCARIO_SV22 ("Lucario", SV22, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
	ROCKRUFF_SV23 ("Rockruff", SV23, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
	BUZZWOLE_SV24 ("Buzzwole", SV24, Rarity.HOLORARE, [POKEMON, BASIC, _FIGHTING_]),
	ZORUA_SV25 ("Zorua", SV25, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
	GUZZLORD_SV26 ("Guzzlord", SV26, Rarity.HOLORARE, [POKEMON, BASIC, _DARKNESS_]),
	MAGNEMITE_SV27 ("Magnemite", SV27, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
	MAGNETON_SV28 ("Magneton", SV28, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
	MAGNEZONE_SV29 ("Magnezone", SV29, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
	DARTRIX_SV3 ("Dartrix", SV3, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
	BELDUM_SV30 ("Beldum", SV30, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
	METANG_SV31 ("Metang", SV31, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
	CELESTEELA_SV32 ("Celesteela", SV32, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
	KARTANA_SV33 ("Kartana", SV33, Rarity.HOLORARE, [POKEMON, BASIC, _METAL_]),
	RALTS_SV34 ("Ralts", SV34, Rarity.HOLORARE, [POKEMON, BASIC, _FAIRY_]),
	KIRLIA_SV35 ("Kirlia", SV35, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FAIRY_]),
	DIANCIE_SV36 ("Diancie", SV36, Rarity.HOLORARE, [POKEMON, BASIC, _FAIRY_]),
	ALTARIA_SV37 ("Altaria", SV37, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DRAGON_]),
	GIBLE_SV38 ("Gible", SV38, Rarity.HOLORARE, [POKEMON, BASIC, _DRAGON_]),
	GABITE_SV39 ("Gabite", SV39, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DRAGON_]),
	WIMPOD_SV4 ("Wimpod", SV4, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
	GARCHOMP_SV40 ("Garchomp", SV40, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DRAGON_]),
	EEVEE_SV41 ("Eevee", SV41, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
	SWABLU_SV42 ("Swablu", SV42, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
	NOIBAT_SV43 ("Noibat", SV43, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
	ORANGURU_SV44 ("Oranguru", SV44, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
	TYPE_NULL_SV45 ("Type: Null", SV45, Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
	LEAFEON_GX_SV46 ("Leafeon-GX", SV46, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _GRASS_]),
	DECIDUEYE_GX_SV47 ("Decidueye-GX", SV47, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _GRASS_]),
	GOLISOPOD_GX_SV48 ("Golisopod-GX", SV48, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _GRASS_]),
	CHARIZARD_GX_SV49 ("Charizard-GX", SV49, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FIRE_]),
	PHEROMOSA_SV5 ("Pheromosa", SV5, Rarity.HOLORARE, [POKEMON, BASIC, _GRASS_]),
	HO_OH_GX_SV50 ("Ho-Oh-GX", SV50, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FIRE_]),
	RESHIRAM_GX_SV51 ("Reshiram-GX", SV51, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FIRE_]),
	TURTONATOR_GX_SV52 ("Turtonator-GX", SV52, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FIRE_]),
	ALOLAN_NINETALES_GX_SV53 ("Alolan Ninetales-GX", SV53, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _WATER_]),
	ARTICUNO_GX_SV54 ("Articuno-GX", SV54, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _WATER_]),
	GLACEON_GX_SV55 ("Glaceon-GX", SV55, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _WATER_]),
	GRENINJA_GX_SV56 ("Greninja-GX", SV56, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _WATER_]),
	ELECTRODE_GX_SV57 ("Electrode-GX", SV57, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _LIGHTNING_]),
	XURKITREE_GX_SV58 ("Xurkitree-GX", SV58, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _LIGHTNING_]),
	MEWTWO_GX_SV59 ("Mewtwo-GX", SV59, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
	CHARMANDER_SV6 ("Charmander", SV6, Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
	ESPEON_GX_SV60 ("Espeon-GX", SV60, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
	BANETTE_GX_SV61 ("Banette-GX", SV61, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
	NIHILEGO_GX_SV62 ("Nihilego-GX", SV62, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
	NAGANADEL_GX_SV63 ("Naganadel-GX", SV63, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]),
	LUCARIO_GX_SV64 ("Lucario-GX", SV64, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FIGHTING_]),
	ZYGARDE_GX_SV65 ("Zygarde-GX", SV65, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FIGHTING_]),
	LYCANROC_GX_SV66 ("Lycanroc-GX", SV66, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FIGHTING_]),
	LYCANROC_GX_SV67 ("Lycanroc-GX", SV67, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FIGHTING_]),
	BUZZWOLE_GX_SV68 ("Buzzwole-GX", SV68, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FIGHTING_]),
	UMBREON_GX_SV69 ("Umbreon-GX", SV69, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _DARKNESS_]),
	CHARMELEON_SV7 ("Charmeleon", SV7, Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
	DARKRAI_GX_SV70 ("Darkrai-GX", SV70, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _DARKNESS_]),
	GUZZLORD_GX_SV71 ("Guzzlord-GX", SV71, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _DARKNESS_]),
	SCIZOR_GX_SV72 ("Scizor-GX", SV72, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _METAL_]),
	KARTANA_GX_SV73 ("Kartana-GX", SV73, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _METAL_]),
	STAKATAKA_GX_SV74 ("Stakataka-GX", SV74, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _METAL_]),
	GARDEVOIR_GX_SV75 ("Gardevoir-GX", SV75, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FAIRY_]),
	SYLVEON_GX_SV76 ("Sylveon-GX", SV76, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _FAIRY_]),
	ALTARIA_GX_SV77 ("Altaria-GX", SV77, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _DRAGON_]),
	NOIVERN_GX_SV78 ("Noivern-GX", SV78, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _DRAGON_]),
	SILVALLY_GX_SV79 ("Silvally-GX", SV79, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _COLORLESS_]),
	ALOLAN_VULPIX_SV8 ("Alolan Vulpix", SV8, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
	DRAMPA_GX_SV80 ("Drampa-GX", SV80, Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_GX, _COLORLESS_]),
	AETHER_FOUNDATION_EMPLOYEE_SV81 ("Aether Foundation Employee", SV81, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
	CYNTHIA_SV82 ("Cynthia", SV82, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
	FISHERMAN_SV83 ("Fisherman", SV83, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
	GUZMA_SV84 ("Guzma", SV84, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
	HIKER_SV85 ("Hiker", SV85, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
	LADY_SV86 ("Lady", SV86, Rarity.ULTRARARE, [TRAINER, SUPPORTER]),
	AETHER_PARADISE_CONSERVATION_AREA_SV87 ("Aether Paradise Conservation Area", SV87, Rarity.SECRET, [TRAINER, STADIUM]),
	BROOKLET_HILL_SV88 ("Brooklet Hill", SV88, Rarity.SECRET, [TRAINER, STADIUM]),
	MT_CORONET_SV89 ("Mt. Coronet", SV89, Rarity.SECRET, [TRAINER, STADIUM]),
	WOOPER_SV9 ("Wooper", SV9, Rarity.HOLORARE, [POKEMON, BASIC, _WATER_]),
	SHRINE_OF_PUNISHMENT_SV90 ("Shrine of Punishment", SV90, Rarity.SECRET, [TRAINER, STADIUM]),
	TAPU_BULU_GX_SV91 ("Tapu Bulu-GX", SV91, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, _GRASS_]),
	TAPU_FINI_GX_SV92 ("Tapu Fini-GX", SV92, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, _WATER_]),
	TAPU_KOKO_GX_SV93 ("Tapu Koko-GX", SV93, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, _LIGHTNING_]),
	TAPU_LELE_GX_SV94 ("Tapu Lele-GX", SV94, Rarity.SECRET, [POKEMON, BASIC, POKEMON_GX, _PSYCHIC_]);
	
	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;
	
	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	ShinyVault(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.SHINY_VAULT;
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
			case SCYTHER_SV1:
			return copy(CelestialStorm.SCYTHER_4, this);
			case QUAGSIRE_SV10:
			return copy(DragonMajesty.QUAGSIRE_26, this);
			case FROAKIE_SV11:
			return copy(ForbiddenLight.FROAKIE_21, this);
			case FROGADIER_SV12:
			return copy(ForbiddenLight.FROGADIER_23, this);
			case VOLTORB_SV13:
			return copy(CelestialStorm.VOLTORB_47, this);
			case XURKITREE_SV14:
			return copy(ForbiddenLight.XURKITREE_39, this);
			case SEVIPER_SV15:
			return copy (SunMoonPromos.SEVIPER_SM46, this)
			case SHUPPET_SV16:
			return copy(CelestialStorm.SHUPPET_63, this);
			case INKAY_SV17:
			return copy(ForbiddenLight.INKAY_50, this);
			case MALAMAR_SV18:
			return copy(ForbiddenLight.MALAMAR_51, this);
			case POIPOLE_SV19:
			return copy(ForbiddenLight.POIPOLE_55, this);
			case ROWLET_SV2:
			return copy(SunMoon.ROWLET_9, this);
			case SUDOWOODO_SV20:
			return copy(GuardiansRising.SUDOWOODO_66, this);
			case RIOLU_SV21:
			return copy(UltraPrism.RIOLU_66, this);
			case LUCARIO_SV22:
			return copy(UltraPrism.LUCARIO_67, this);
			case ROCKRUFF_SV23:
			return copy(ForbiddenLight.ROCKRUFF_75, this);
			case BUZZWOLE_SV24:
			return copy(ForbiddenLight.BUZZWOLE_77, this);
			case ZORUA_SV25:
			return copy(ShiningLegends.ZORUA_52, this);
			case GUZZLORD_SV26:
			return copy(ForbiddenLight.GUZZLORD_80, this);
			case MAGNEMITE_SV27:
			return copy(UltraPrism.MAGNEMITE_80, this);
			case MAGNETON_SV28:
			return copy(UltraPrism.MAGNETON_82, this);
			case MAGNEZONE_SV29:
			return copy(UltraPrism.MAGNEZONE_83, this);
			case DARTRIX_SV3:
			return copy(SunMoon.DARTRIX_10, this);
			case BELDUM_SV30:
			return copy(GuardiansRising.BELDUM_83, this);
			case METANG_SV31:
			return copy(GuardiansRising.METANG_84, this);
			case CELESTEELA_SV32:
			return copy(CelestialStorm.CELESTEELA_100, this);
			case KARTANA_SV33:
			return copy(CelestialStorm.KARTANA_101, this);
			case RALTS_SV34:
			return copy(BurningShadows.RALTS_91, this);
			case KIRLIA_SV35:
			return copy(BurningShadows.KIRLIA_92, this);
			case DIANCIE_SV36:
			return copy(BurningShadows.DIANCIE_94, this);
			case ALTARIA_SV37:
			return copy(DragonMajesty.ALTARIA_40, this);
			case GIBLE_SV38:
			return copy(UltraPrism.GIBLE_96, this);
			case GABITE_SV39:
			return copy(UltraPrism.GABITE_98, this);
			case WIMPOD_SV4:
			return copy(BurningShadows.WIMPOD_16, this);
			case GARCHOMP_SV40:
			return copy(UltraPrism.GARCHOMP_99, this);
			case EEVEE_SV41:
			return copy(SunMoon.EEVEE_101, this);
			case SWABLU_SV42:
			return copy(DragonMajesty.SWABLU_56, this);
			case NOIBAT_SV43:
			return copy(BurningShadows.NOIBAT_109, this);
			case ORANGURU_SV44:
			return copy(SunMoon.ORANGURU_113, this);
			case TYPE_NULL_SV45:
			return copy(CrimsonInvasion.TYPE__NULL_89, this);
			case LEAFEON_GX_SV46:
			return copy(UltraPrism.LEAFEON_GX_13, this);
			case DECIDUEYE_GX_SV47:
			return copy(SunMoon.DECIDUEYE_GX_12, this);
			case GOLISOPOD_GX_SV48:
			return copy(BurningShadows.GOLISOPOD_GX_17, this);
			case CHARIZARD_GX_SV49:
			return copy(BurningShadows.CHARIZARD_GX_20, this);
			case PHEROMOSA_SV5:
			return copy(ForbiddenLight.PHEROMOSA_11, this);
			case HO_OH_GX_SV50:
			return copy(BurningShadows.HO_OH_GX_21, this);
			case RESHIRAM_GX_SV51:
			return copy(DragonMajesty.RESHIRAM_GX_11, this);
			case TURTONATOR_GX_SV52:
			return copy(GuardiansRising.TURTONATOR_GX_18, this);
			case ALOLAN_NINETALES_GX_SV53:
			return copy(GuardiansRising.ALOLAN_NINETALESGX_22, this);
			case ARTICUNO_GX_SV54:
			return copy(CelestialStorm.ARTICUNO_GX_31, this);
			case GLACEON_GX_SV55:
			return copy(UltraPrism.GLACEON_GX_39, this);
			case GRENINJA_GX_SV56:
			return copy(ForbiddenLight.GRENINJA_GX_24, this);
			case ELECTRODE_GX_SV57:
			return copy(CelestialStorm.ELECTRODE_GX_48, this);
			case XURKITREE_GX_SV58:
			return copy(UltraPrism.XURKITREE_GX_142, this);
			case MEWTWO_GX_SV59:
			return copy(ShiningLegends.MEWTWO_GX_39, this);
			case CHARMANDER_SV6:
			return copy(DragonMajesty.CHARMANDER_1, this);
			case ESPEON_GX_SV60:
			return copy(SunMoon.ESPEON_GX_61, this);
			case BANETTE_GX_SV61:
			return copy(CelestialStorm.BANETTE_GX_66, this);
			case NIHILEGO_GX_SV62:
			return copy(CrimsonInvasion.NIHILEGO_GX_49, this);
			case NAGANADEL_GX_SV63:
			return copy(ForbiddenLight.NAGANDEL_GX_56, this);
			case LUCARIO_GX_SV64:
			return copy(ForbiddenLight.LUCARIO_GX_122, this);
			case ZYGARDE_GX_SV65:
			return copy(ForbiddenLight.ZYGARDE_GX_73, this);
			case LYCANROC_GX_SV66:
			return copy(GuardiansRising.LYCANROC_GX_74, this);
			case LYCANROC_GX_SV67:
			return copy(TeamUp.LYCANROC_GX_82, this);
			case BUZZWOLE_GX_SV68:
			return copy(CrimsonInvasion.BUZZWOLE_GX_57, this);
			case UMBREON_GX_SV69:
			return copy(SunMoon.UMBREON_GX_80, this);
			case CHARMELEON_SV7:
			return copy(DragonMajesty.CHARMELEON_2, this);
			case DARKRAI_GX_SV70:
			return copy(BurningShadows.DARKRAI_GX_88, this);
			case GUZZLORD_GX_SV71:
			return copy(CrimsonInvasion.GUZZLORD_GX_63, this);
			case SCIZOR_GX_SV72:
			return copy(CelestialStorm.SCIZOR_GX_90, this);
			case KARTANA_GX_SV73:
			return copy(CrimsonInvasion.KARTANA_GX_70, this);
			case STAKATAKA_GX_SV74:
			return copy(CelestialStorm.STAKATAKA_GX_102, this);
			case GARDEVOIR_GX_SV75:
			return copy(BurningShadows.GARDEVOIR_GX_93, this);
			case SYLVEON_GX_SV76:
			return copy(GuardiansRising.SYLVEON_GX_92, this);
			case ALTARIA_GX_SV77:
			return copy(DragonMajesty.ALTARIA_GX_41, this);
			case NOIVERN_GX_SV78:
			return copy(BurningShadows.NOIVERN_GX_99, this);
			case SILVALLY_GX_SV79:
			return copy(CrimsonInvasion.SILVALLY_GX_90, this);
			case ALOLAN_VULPIX_SV8:
			return copy(GuardiansRising.ALOLAN_VULPIX_21, this);
			case DRAMPA_GX_SV80:
			return copy(GuardiansRising.DRAMPA_GX_115, this);
			case AETHER_FOUNDATION_EMPLOYEE_SV81:
			return copy(LostThunder.AETHER_FOUNDATION_EMPLOYEE_168, this);
			case CYNTHIA_SV82:
			return copy(UltraPrism.CYNTHIA_119, this);
			case FISHERMAN_SV83:
			return copy(Breakthrough.FISHERMAN_136, this);
			case GUZMA_SV84:
			return copy(BurningShadaows.GUZMA_115, this);
			case HIKER_SV85:
			return copy(CelestialStorm.HIKER_133, this);
			case LADY_SV86:
			return copy(ForbiddenLight.LADY_109, this);
			case AETHER_PARADISE_CONSERVATION_AREA_SV87:
			return copy(GuardiansRising.AETHER_PARADISE_CONSERVATION_AREA_116, this);
			case BROOKLET_HILL_SV88:
			return copy(GuardiansRising.BROOKLET_HILL_120, this);
			case MT_CORONET_SV89:
			return copy(UltraPrism.MT__CORONET_130, this);
			case WOOPER_SV9:
			return copy(DragonMajesty.WOOPER_25, this);
			case SHRINE_OF_PUNISHMENT_SV90:
			return copy(CelestialStorm.SHRINE_OF_PUNISHMENT_143, this);
			case TAPU_BULU_GX_SV91:
			return copy(BurningShadows.TAPU_BULU_GX_130, this);
			case TAPU_FINI_GX_SV92:
			return copy(BurningShadows.TAPU_FINI_GX_39, this);
			case TAPU_KOKO_GX_SV93:
			return copy(GuardiansRising.TAPU_KOKO_GX_47, this);
			case TAPU_LELE_GX_SV94:
			return copy(GuardiansRising.TAPU_LELE_GX_60, this);
				}
				
			};
				default:
			return null;
		}
	}
	
}
