package tcgwars.logic.impl.pokemod;

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
 */
public enum PokemodJungle implements CardInfo {

	CLEFABLE_1 ("Clefable", 1, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	ELECTRODE_2 ("Electrode", 2, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	FLAREON_3 ("Flareon", 3, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	JOLTEON_4 ("Jolteon", 4, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	KANGASKHAN_5 ("Kangaskhan", 5, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	MR_MIME_6 ("Mr. Mime", 6, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
	NIDOQUEEN_7 ("Nidoqueen", 7, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	PIDGEOT_8 ("Pidgeot", 8, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	PINSIR_9 ("Pinsir", 9, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
	SCYTHER_10 ("Scyther", 10, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
	SNORLAX_11 ("Snorlax", 11, Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
	VAPOREON_12 ("Vaporeon", 12, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	VENOMOTH_13 ("Venomoth", 13, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	VICTREEBEL_14 ("Victreebel", 14, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	VILEPLUME_15 ("Vileplume", 15, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	WIGGLYTUFF_16 ("Wigglytuff", 16, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),

	CLEFABLE_17 ("Clefable", 17, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	ELECTRODE_18 ("Electrode", 18, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	FLAREON_19 ("Flareon", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	JOLTEON_20 ("Jolteon", 20, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
	KANGASKHAN_21 ("Kangaskhan", 21, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	MR_MIME_22 ("Mr. Mime", 22, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
	NIDOQUEEN_23 ("Nidoqueen", 23, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	PIDGEOT_24 ("Pidgeot", 24, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
	PINSIR_25 ("Pinsir", 25, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
	SCYTHER_26 ("Scyther", 26, Rarity.RARE, [BASIC, POKEMON, _GRASS_]),
	SNORLAX_27 ("Snorlax", 27, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
	VAPOREON_28 ("Vaporeon", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	VENOMOTH_29 ("Venomoth", 29, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	VICTREEBEL_30 ("Victreebel", 30, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	VILEPLUME_31 ("Vileplume", 31, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	WIGGLYTUFF_32 ("Wigglytuff", 32, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	BUTTERFREE_33 ("Butterfree", 33, Rarity.UNCOMMON, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
	DODRIO_34 ("Dodrio", 34, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	EXEGGUTOR_35 ("Exeggutor", 35, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	FEAROW_36 ("Fearow", 36, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	GLOOM_37 ("Gloom", 37, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	LICKITUNG_38 ("Lickitung", 38, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	MAROWAK_39 ("Marowak", 39, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	NIDORINA_40 ("Nidorina", 40, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	PARASECT_41 ("Parasect", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	PERSIAN_42 ("Persian", 42, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
	PRIMEAPE_43 ("Primeape", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	RAPIDASH_44 ("Rapidash", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
	RHYDON_45 ("Rhydon", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
	SEAKING_46 ("Seaking", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
	TAUROS_47 ("Tauros", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
	WEEPINBELL_48 ("Weepinbell", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
	BELLSPROUT_49 ("Bellsprout", 49, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	CUBONE_50 ("Cubone", 50, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	EEVEE_51 ("Eevee", 51, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	EXEGGCUTE_52 ("Exeggcute", 52, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	GOLDEEN_53 ("Goldeen", 53, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
	JIGGLYPUFF_54 ("Jigglypuff", 54, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	MANKEY_55 ("Mankey", 55, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	MEOWTH_56 ("Meowth", 56, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	NIDORAN_FEMALE_57 ("Nidoran ♀", 57, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	ODDISH_58 ("Oddish", 58, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	PARAS_59 ("Paras", 59, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	PIKACHU_60 ("Pikachu", 60, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
	RHYHORN_61 ("Rhyhorn", 61, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
	SPEAROW_62 ("Spearow", 62, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
	VENONAT_63 ("Venonat", 63, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
	POKE_BALL_64 ("Poké Ball", 64, Rarity.COMMON, [TRAINER]);

	static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING;

	protected CardTypeSet cardTypes;
	protected String name;
	protected Rarity rarity;
	protected int collectionLineNo;

	PokemodJungle(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
		return tcgwars.logic.card.Collection.POKEMOD_JUNGLE;
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
			case CLEFABLE_1:
				break
			case ELECTRODE_2:
				break
			case FLAREON_3:
				break
			case JOLTEON_4:
				break
			case KANGASKHAN_5:
				break
			case MR_MIME_6:
				break
			case NIDOQUEEN_7:
				break
			case PIDGEOT_8:
				break
			case PINSIR_9:
				break
			case SCYTHER_10:
				break
			case SNORLAX_11:
				break
			case VAPOREON_12:
				break
			case VENOMOTH_13:
				break
			case VICTREEBEL_14:
				break
			case VILEPLUME_15:
				break
			case WIGGLYTUFF_16:
				break
			case CLEFABLE_17:
				break
			case ELECTRODE_18:
				break
			case FLAREON_19:
				break
			case JOLTEON_20:
				break
			case KANGASKHAN_21:
				break
			case MR_MIME_22:
				break
			case NIDOQUEEN_23:
				break
			case PIDGEOT_24:
				break
			case PINSIR_25:
				break
			case SCYTHER_26:
				break
			case SNORLAX_27:
				break
			case VAPOREON_28:
				break
			case VENOMOTH_29:
				break
			case VICTREEBEL_30:
				break
			case VILEPLUME_31:
				break
			case WIGGLYTUFF_32:
				break
			case BUTTERFREE_33:
				break
			case DODRIO_34:
				break
			case EXEGGUTOR_35:
				break
			case FEAROW_36:
				break
			case GLOOM_37:
				break
			case LICKITUNG_38:
				break
			case MAROWAK_39:
				break
			case NIDORINA_40:
				break
			case PARASECT_41:
				break
			case PERSIAN_42:
				break
			case PRIMEAPE_43:
				break
			case RAPIDASH_44:
				break
			case RHYDON_45:
				break
			case SEAKING_46:
				break
			case TAUROS_47:
				break
			case WEEPINBELL_48:
				break
			case BELLSPROUT_49:
				break
			case CUBONE_50:
				break
			case EEVEE_51:
				break
			case EXEGGCUTE_52:
				break
			case GOLDEEN_53:
				break
			case JIGGLYPUFF_54:
				break
			case MANKEY_55:
				break
			case MEOWTH_56:
				break
			case NIDORAN_FEMALE_57:
				break
			case ODDISH_58:
				break
			case PARAS_59:
				break
			case PIKACHU_60:
				break
			case RHYHORN_61:
				break
			case SPEAROW_62:
				break
			case VENONAT_63:
				break
			case POKE_BALL_64:
				break
			default:
				return null;
		}
	}

}
