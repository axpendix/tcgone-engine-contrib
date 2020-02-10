package tcgwars.logic.card;

import java.util.Arrays;
import java.util.List;

/**
 * @author axpendix@hotmail.com
 */
public enum Type {

	GRASS("G", "types/grass.png"),
	FIRE("R", "types/fire.png"),
	WATER("W", "types/water.png"),
	LIGHTNING("L", "types/lightning.png"),
	PSYCHIC("P", "types/psychic.png"),
	FIGHTING("F", "types/fighting.png"),
	DARKNESS("D", "types/darkness.png"),
	METAL("M", "types/metal.png"),
	FAIRY("Y", "types/fairy.png"),
	DRAGON("N", "types/dragon.png"),
	COLORLESS("C", "types/colorless.png"),

	RAINBOW("types/rainbow.png"),
	MAGMA("types/magma.png"),
	AQUA("types/aqua.png"),
	;

	private String iconLocation;
	private String shortChar;

	Type(String shortChar, String iconLocation) {
		this.shortChar = shortChar;
		this.iconLocation = iconLocation;
	}

	Type(String iconLocation) {
		this.iconLocation = iconLocation;
		this.shortChar = name();
	}

	public String getResourcePath(){
		return iconLocation;
	}

	public String getShortChar() {
		return shortChar;
	}

	public String getShortNotation(){
		return "[" + shortChar + "]";
	}

	public static Type fromShortChar (String shortChar){
		for (Type type : values()) {
			if(type.shortChar.equals(shortChar))
				return type;
		}
		return null;
	}
	
	public static Type valueOf2(String string){
		try {
			return valueOf(string);
		} catch (Exception e) {
			return null;
		}
	}

	public static List<Type> valuesBasicEnergy(){
		return Arrays.asList(COLORLESS, FIRE, GRASS, WATER, LIGHTNING, FIGHTING, PSYCHIC, DARKNESS, METAL, FAIRY);
	}

	public static List<Type> valuesBasicEnergyNonColorless(){
		return Arrays.asList(FIRE, GRASS, WATER, LIGHTNING, FIGHTING, PSYCHIC, DARKNESS, METAL, FAIRY);
	}

	public static List<Type> valuesPokemon(){
		return Arrays.asList(COLORLESS, FIRE, GRASS, WATER, LIGHTNING, FIGHTING, PSYCHIC, DARKNESS, METAL, FAIRY, DRAGON);
	}

}
