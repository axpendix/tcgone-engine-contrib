package tcgwars.logic.card;

import org.apache.commons.lang.WordUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * @author axpendix@hotmail.com
 */
public enum Collection {

	//CLASSIC
	BASE_SET(111, "BS", "gen1.BaseSet"),
	JUNGLE(112, "JU", "gen1.Jungle"),
	FOSSIL(113, "FO", "gen1.Fossil"),
	BASE_SET_2(114, "BS2", "gen1.BaseSet2"),
	TEAM_ROCKET(115, "TR", "gen1.TeamRocket"),

	//GYM
	GYM_HEROES(121, "G1", "gen1.GymHeroes"),
	GYM_CHALLENGE(122, "G2", "gen1.GymChallenge"),

  WIZARDS_BLACK_STAR_PROMOS(110, "WBSP", "gen1.WizardsBlackStarPromos"),
  WIZARDS_BLACK_STAR_PROMOS_NG(111, "WBSP", "gen1.WizardsBlackStarPromosNG"),
	VENDING_MACHINE(131, "VM", "gen1.VendingMachine"),
	SOUTHERN_ISLANDS(132, "SI", "gen2.SouthernIslands"),
	LEGENDARY_COLLECTION(133, "LC", "gen1.LegendaryCollection"),

	//NEO
	NEO_GENESIS(161, "N1", "gen2.NeoGenesis"),
	NEO_DISCOVERY(162, "N2", "gen2.NeoDiscovery"),
	NEO_REVELATION(163, "N3", "gen2.NeoRevelation"),
	NEO_DESTINY(164, "N4", "gen2.NeoDestiny"),

	//E-CARD
	EXPEDITION(171, "EXP", "gen2.Expedition"),
	AQUAPOLIS(172, "AQP", "gen2.Aquapolis"),
	SKYRIDGE(173, "SKR", "gen2.Skyridge"),

	//EX
	RUBY_SAPPHIRE(211, "Ruby & Sapphire", "RS", "gen3.RubySapphire"),
	SANDSTORM(212, "SS", "gen3.Sandstorm"),
	DRAGON(213, "DR", "gen3.Dragon"),
	TEAM_MAGMA_VS_TEAM_AQUA(214, "Team Magma vs Team Aqua", "MA", "gen3.TeamMagmaVsTeamAqua"),
	HIDDEN_LEGENDS(215, "HL", "gen3.HiddenLegends"),
	FIRERED_LEAFGREEN(216, "FireRed & LeafGreen", "FRLG", "gen3.FireRedLeafGreen"),
	TEAM_ROCKET_RETURNS(217, "TRR", "gen3.TeamRocketReturns"),
	DEOXYS(218, "DX", "gen3.Deoxys"),
	EMERALD(219, "EM", "gen3.Emerald"),
	UNSEEN_FORCES(220, "UF", "gen3.UnseenForces"),
	DELTA_SPECIES(221, "DS", "gen3.DeltaSpecies"),
	LEGEND_MAKER(222, "LM", "gen3.LegendMaker"),
	HOLON_PHANTOMS(223, "HP", "gen3.HolonPhantoms"),
	CRYSTAL_GUARDIANS(224, "CG", "gen3.CrystalGuardians"),
	DRAGON_FRONTIERS(225, "DF", "gen3.DragonFrontiers"),
	POWER_KEEPERS(226, "PK", "gen3.PowerKeepers"),

	//DIAMOND & PEARL
	DIAMOND_PEARL_PROMOS(250, "Diamond & Pearl Promos", "DPP", "gen4.DiamondPearlPromos"),
	DIAMOND_PEARL(251, "Diamond & Pearl", "DP", "gen4.DiamondPearl"),
	MYSTERIOUS_TREASURES(252, "MT", "gen4.MysteriousTreasures"),
	SECRET_WONDERS(253, "SW", "gen4.SecretWonders"),
	GREAT_ENCOUNTERS(254, "GE", "gen4.GreatEncounters"),
	MAJESTIC_DAWN(255, "MD", "gen4.MajesticDawn"),
	LEGENDS_AWAKENED(256, "LA", "gen4.LegendsAwakened"),
	STORMFRONT(257, "SF", "gen4.Stormfront"),

	//PLATINUM
	PLATINUM(261, "PL", "gen4.Platinum"),
	RISING_RIVALS(262, "RR", "gen4.RisingRivals"),
	SUPREME_VICTORS(263, "SV", "gen4.SupremeVictors"),
	ARCEUS(264, "AR", "gen4.Arceus"),

	//HEARTGOLD & SOULSILVER
	HEARTGOLD_SOULSILVER_PROMOS(270, "HeartGold & SoulSilver Promos", "HGSSP", "gen4.HeartgoldSoulsilverPromos"),
	HEARTGOLD_SOULSILVER(271, "HeartGold & SoulSilver", "HS", "gen4.HeartgoldSoulsilver"),
	UNLEASHED(272, "UL", "gen4.Unleashed"),
	UNDAUNTED(273, "UD", "gen4.Undaunted"),
	TRIUMPHANT(274, "TM", "gen4.Triumphant"),
	CALL_OF_LEGENDS(275, "Call of Legends", "CL", "gen4.CallOfLegends"),

	POP_SERIES_1(281, "POP Series 1", "POP1", "gen3.PopSeries1"),
	POP_SERIES_2(282, "POP Series 2", "POP2", "gen3.PopSeries2"),
	POP_SERIES_3(283, "POP Series 3", "POP3", "gen3.PopSeries3"),
	POP_SERIES_4(284, "POP Series 4", "POP4", "gen3.PopSeries4"),
	POP_SERIES_5(285, "POP Series 5", "POP5", "gen3.PopSeries5"),
	POP_SERIES_6(286, "POP Series 6", "POP6", "gen4.PopSeries6"),
	POP_SERIES_7(287, "POP Series 7", "POP7", "gen4.PopSeries7"),
	POP_SERIES_8(288, "POP Series 8", "POP8", "gen4.PopSeries8"),
	POP_SERIES_9(289, "POP Series 9", "POP9", "gen4.PopSeries9"),

	POKEMON_RUMBLE(290, "Pokemon Rumble", "RUMBLE", "gen4.PokemonRumble"),

	//BLACK & WHITE
	BLACK_WHITE_PROMOS(310, "Black & White Promos", "BLWP", "gen5.BlackWhitePromos"),
	BLACK_WHITE(311, "Black & White", "BLW", "gen5.BlackWhite"),
	EMERGING_POWERS(312, "EPO", "gen5.EmergingPowers"),
	NOBLE_VICTORIES(313, "NVI", "gen5.NobleVictories"),
	NEXT_DESTINIES(314, "NXD", "gen5.NextDestinies"),
	DARK_EXPLORERS(315, "DEX", "gen5.DarkExplorers"),
	DRAGONS_EXALTED(316, "DRX", "gen5.DragonsExalted"),
	DRAGON_VAULT(317, "DRV", "gen5.DragonVault"),
	BOUNDARIES_CROSSED(318, "BCR", "gen5.BoundariesCrossed"),
	PLASMA_STORM(319, "PLS", "gen5.PlasmaStorm"),
	PLASMA_FREEZE(320, "PLF", "gen5.PlasmaFreeze"),
	PLASMA_BLAST(321, "PLB", "gen5.PlasmaBlast"),
	LEGENDARY_TREASURES(322, "LTR", "gen5.LegendaryTreasures"),

	//XY
	KALOS_STARTER_SET(359, "KSS", "gen6.KalosStarterSet"),
	XY_PROMOS(360, "XY Promos", "XYP", "gen6.XyPromos"),
	XY(361, "XY", "XY", "gen6.Xy"),
	FLASHFIRE(362, "FLF", "gen6.Flashfire"),
	FURIOUS_FISTS(363, "FUF", "gen6.FuriousFists"),
	PHANTOM_FORCES(364, "PHF", "gen6.PhantomForces"),
	PRIMAL_CLASH(365, "PCL", "gen6.PrimalClash"),
	DOUBLE_CRISIS(366, "DCR", "gen6.DoubleCrisis"),
	ROARING_SKIES(367, "ROS", "gen6.RoaringSkies"),
	ANCIENT_ORIGINS(368, "AOR", "gen6.AncientOrigins"),
	BREAKTHROUGH(369, "BREAKthrough", "BKT", "gen6.Breakthrough"),
	BREAKPOINT(370, "BREAKpoint", "BKP", "gen6.Breakpoint"),
	GENERATIONS(371, "GEN", "gen6.Generations"),
	FATES_COLLIDE(372, "FCO", "gen6.FatesCollide"),
	STEAM_SIEGE(373, "STS", "gen6.SteamSiege"),
	EVOLUTIONS(374, "EVO", "gen6.Evolutions"),

	//Sun & Moon
	SUN_MOON_PROMOS(410, "Sun & Moon Promos", "SMP", "gen7.SunMoonPromos"),
	SUN_MOON(411, "Sun & Moon", "SM", "gen7.SunMoon"),
	GUARDIANS_RISING(412, "GRI", "gen7.GuardiansRising"),
	BURNING_SHADOWS(413, "BUS", "gen7.BurningShadows"),
	SHINING_LEGENDS(414, "SLG", "gen7.ShiningLegends"),
	CRIMSON_INVASION(415, "CIN", "gen7.CrimsonInvasion"),
	ULTRA_PRISM(416, "UPR", "gen7.UltraPrism"),
	FORBIDDEN_LIGHT(417, "FLI", "gen7.ForbiddenLight"),
	CELESTIAL_STORM(418, "CLS", "gen7.CelestialStorm"),
	DRAGON_MAJESTY(419, "DRM", "gen7.DragonMajesty"),
	LOST_THUNDER(420, "LOT", "gen7.LostThunder"),
	TEAM_UP(421, "TEU", "gen7.TeamUp"),
	DETECTIVE_PIKACHU(422, "DET", "gen7.DetectivePikachu"),
	UNBROKEN_BONDS(423, "UNB", "gen7.UnbrokenBonds"),
	UNIFIED_MINDS(424, "UNM", "gen7.UnifiedMinds"),
	HIDDEN_FATES(425, "HIF", "gen7.HiddenFates"),
	SHINY_VAULT(426, "SMA", "gen7.ShinyVault"),
  COSMIC_ECLIPSE(427, "CEC", "gen7.CosmicEclipse"),

  // Sword & Shield
  SWORD_SHIELD_PROMOS(429, "SSHP", "gen8.SwordShieldPromos"),
  SWORD_SHIELD(430, "SSH", "gen8.SwordShield"),
  REBEL_CLASH(431, "RCL", "gen8.RebelClash"),
  DARKNESS_ABLAZE(432, "DAB", "gen8.DarknessAblaze"),

	//POKEMOD
  POKEMOD_BASE_SET(910, "MODBS", "pokemod.PokemodBaseSet"),
	POKEMOD_JUNGLE(911, "MODJU", "pokemod.PokemodJungle"),
	POKEMOD_FOSSIL(912, "MODFO", "pokemod.PokemodFossil"),
  POKEMOD_BASE_SET_2(913, "MODBS", "pokemod.PokemodBaseSet2"),
	POKEMOD_TEAM_ROCKET(914, "MODTR", "pokemod.PokemodTeamRocket"),
	POKEMOD_GYM_HEROES(915, "MODG1", "pokemod.PokemodGymHeroes"),
	POKEMOD_GYM_CHALLENGE(916, "MODG2", "pokemod.PokemodGymChallenge"),
	POKEMOD_NEO_GENESIS(917, "MODN1", "pokemod.PokemodNeoGenesis"),
	POKEMOD_NEO_DISCOVERY(918, "MODN2", "pokemod.PokemodNeoDiscovery"),
	POKEMOD_NEO_REVELATION(919, "MODN3", "pokemod.PokemodNeoRevelation"),
	POKEMOD_NEO_DESTINY(920, "MODN4", "pokemod.PokemodNeoDestiny"),
	POKEMOD_EXPEDITION(921, "MODEXP", "pokemod.PokemodExpedition"),
	POKEMOD_AQUAPOLIS(922, "MODAQP", "pokemod.PokemodAquapolis"),
	POKEMOD_SKYRIDGE(923, "MODSKR", "pokemod.PokemodSkyridge"),
	POKEMOD_VENDING_MACHINE(924, "MODVM", "pokemod.PokemodVendingMachine"),
	POKEMOD_PROMOS(925, "MODPRO", "pokemod.PokemodPromos"),
//	POKEMOD_(900, "MOD", "pokemod.Pokemod"),

	;

	int id;
	String shortName;
	String fullName;
	Class enumClass;

	Collection(int id, String shortName, String enumClassName) {
		this(id, null, shortName, enumClassName);
	}

	Collection(int id, String fullName, String shortName, String enumClassName) {
		this.id = id;
		this.fullName = fullName;
		this.shortName = shortName;
		try {
			this.enumClass = Class.forName("tcgwars.logic.impl."+enumClassName);
		} catch (ClassNotFoundException e) {
			this.enumClass = null;
		}
	}

	public String getShortName(){
		return shortName;
	}

	public String getName(){
		return toString();
	}

	public int getCardCount() {
		return cards().length;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString(){
		return fullName==null?WordUtils.capitalizeFully(this.name(), "_".toCharArray()).replaceAll("_", " "):fullName;
	}

	public CardInfo[] cards() {
		if(enumClass == null) return new CardInfo[0];
		Object[] xCardInfos=enumClass.getEnumConstants();
		return (CardInfo[]) xCardInfos ;
	}

	public List<CardInfo> cardList(){
		return Arrays.asList(cards());
	}

	public Class getEnumClass() {
		return enumClass;
	}

	public String getLowercaseName(){
		return name().toLowerCase(Locale.ENGLISH);
	}

	public static Collection findById(int id){
		for (Collection item : values()) {
			if(item.id == id) return item;
		}
		throw new IllegalArgumentException("Collection "+id+" not found");
	}

	public static Collection findByName(String name){
		for(Collection item : values()){
			if(item.toString().equals(name)) return item;
		}
		throw new IllegalArgumentException("Collection "+name+" not found");
	}

	public static Collection findByShortName(String shortName){
		for(Collection item : values()){
			if(item.shortName.equals(shortName)) return item;
		}
		throw new IllegalArgumentException("Collection "+shortName+" not found");
	}

}
