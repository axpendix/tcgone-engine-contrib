package tcgwars.logic.card;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Locale;

import org.apache.commons.lang.WordUtils;

/**
 * @author axpendix@hotmail.com
 */
public enum CardType {

	TOP(-100),
	
	POKEMON(10),
	ENERGY(20),
	TRAINER(30),

	MEGA_POKEMON(-6),
	LEVEL_UP(-5),
	BREAK(-4),
	STAGE2(-2),
	STAGE1(-1),
	EVOLUTION(0),
	RESTORED(4),
	BASIC(7),
	BABY(8),
	BASIC_ENERGY(18),
	SPECIAL_ENERGY(19),
	ITEM(23),
	SUPPORTER(24),
	STADIUM(25),
	POKEMON_TOOL(26),
	TECHNICAL_MACHINE(27),
	FLARE(28),
	ROCKETS_SECRET_MACHINE(29),

	_GRASS_(41),
	_FIRE_(42),
	_WATER_(43),
	_LIGHTNING_(44),
	_PSYCHIC_(45),
	_FIGHTING_(46),
	_DARKNESS_(47),
	_METAL_(48),
	_FAIRY_(49),
	_DRAGON_(50),
	_COLORLESS_(51),

	LEGEND(92),
	TAG_TEAM(93),
	ULTRA_BEAST(94),
	PRISM_STAR(95),
	POKEMON_GX(96),
	POKEMON_PRIME(97),
	POKEMON_STAR(98),
	POKEMON_EX(99, "Pokémon-EX"), //UPPERCASE
	EX(100, "Pokémon-ex"), //LOWERCASE
	FOSSIL(101),
	TEAM_MAGMA(102),
	TEAM_AQUA(103),
	OWNERS_POKEMON(104),
	DARK_POKEMON(105),
	LIGHT_POKEMON(106),
	SHINING_POKEMON(107),
	TEAM_PLASMA(108),
	ACE_SPEC(109),
  HAS_ANCIENT_TRAIT(110),
	
	NOT_IMPLEMENTED(201),

	;

	private String label;
	private int priority;

	CardType(int priority) {
		this.priority = priority;
	}
	
	CardType(int priority, String label) {
		this.priority = priority;
		this.label = label;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		if(label!=null) return label;
		else return WordUtils.capitalizeFully(this.name().toLowerCase(Locale.ENGLISH), "_".toCharArray()).replaceAll("_", " ");
	}
	
	public Type toElementalType(){
		switch (this) {
			case _GRASS_:
				return Type.GRASS;
			case _FIRE_:
				return Type.FIRE;
			case _WATER_:
				return Type.WATER;
			case _LIGHTNING_:
				return Type.LIGHTNING;
			case _PSYCHIC_:
				return Type.PSYCHIC;
			case _FIGHTING_:
				return Type.FIGHTING;
			case _DARKNESS_:
				return Type.DARKNESS;
			case _METAL_:
				return Type.METAL;
			case _FAIRY_:
				return Type.FAIRY;
			case _DRAGON_:
				return Type.DRAGON;
			case _COLORLESS_:
				return Type.COLORLESS;
			default:
				return null;
		}
	}
	
	public static class CardTypeComparator implements Comparator<CardType>, Serializable {

		@Override
		public int compare(CardType o1, CardType o2) {
			Integer i1 = o1.getPriority(), i2 = o2.getPriority();
			return i1.compareTo(i2);
		}

	}

}
