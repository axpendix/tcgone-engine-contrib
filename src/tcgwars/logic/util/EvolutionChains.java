package tcgwars.logic.util;

import static tcgwars.logic.impl.gen2.Aquapolis.*;
import static tcgwars.logic.impl.gen1.BaseSet.*;
import static tcgwars.logic.impl.gen2.Expedition.*;
import static tcgwars.logic.impl.gen1.Fossil.*;
import static tcgwars.logic.impl.gen1.Jungle.*;
import static tcgwars.logic.impl.gen1.GymHeroes.*;
import static tcgwars.logic.impl.gen1.GymChallenge.*;
import static tcgwars.logic.impl.gen2.NeoDiscovery.*;
import static tcgwars.logic.impl.gen2.NeoRevelation.*;
import static tcgwars.logic.impl.gen2.NeoDestiny.*;
import static tcgwars.logic.impl.gen3.RubySapphire.*;
import static tcgwars.logic.impl.gen3.Sandstorm.*;
import static tcgwars.logic.impl.gen2.Skyridge.*;
import static tcgwars.logic.impl.gen3.Dragon.*;
import static tcgwars.logic.impl.gen3.TeamMagmaVsTeamAqua.*;
import static tcgwars.logic.impl.gen3.HiddenLegends.*;
import static tcgwars.logic.impl.gen5.BlackWhite.*;
import static tcgwars.logic.impl.gen5.EmergingPowers.*;
import static tcgwars.logic.impl.gen5.NobleVictories.*;
import static tcgwars.logic.impl.gen5.NextDestinies.*;
import static tcgwars.logic.impl.gen5.DarkExplorers.*;
import static tcgwars.logic.impl.gen5.DragonsExalted.*;
import static tcgwars.logic.impl.gen5.BoundariesCrossed.*;
import static tcgwars.logic.impl.gen5.PlasmaStorm.*;
import static tcgwars.logic.impl.gen5.PlasmaFreeze.*;
import static tcgwars.logic.impl.gen5.PlasmaBlast.*;
import static tcgwars.logic.impl.gen6.Xy.*;
import static tcgwars.logic.impl.gen6.Flashfire.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import gnu.trove.map.hash.THashMap;
import tcgwars.logic.card.CardInfo;
import tcgwars.logic.impl.gen1.BaseSet;
import tcgwars.logic.impl.gen5.BlackWhite;
import tcgwars.logic.impl.gen5.NobleVictories;
import tcgwars.logic.impl.gen1.TeamRocket;

/**
 * @author axpendix@hotmail.com
 */
public class EvolutionChains {


//  static HashMap<String, HashSet<String>> map=new HashMap<String, HashSet<String>>();
//  private static HashMap<String, String> map2=new HashMap<String, String>();
  private static Map<String, List<String>> map2=new THashMap<>();
  
  static{
    //BASE SET
    ADD(BULBASAUR,IVYSAUR,VENUSAUR);
    ADD(SQUIRTLE,WARTORTLE,BLASTOISE);
    ADD(CHARMANDER,CHARMELEON,CHARIZARD);
    ADD(WEEDLE,KAKUNA,BEEDRILL);
    ADD(POLIWAG,POLIWHIRL,POLIWRATH);
    ADD(MACHOP,MACHOKE,MACHAMP);
    ADD(ABRA,KADABRA,ALAKAZAM);
    ADD(NIDORAN_MALE,NIDORINO,NIDOKING);
    
    //JUNGLE
    ADD(NIDORAN_FEMALE,NIDORINA,NIDOQUEEN);
    ADD(PIDGEY,PIDGEOTTO,PIDGEOT);
    ADD(BELLSPROUT,WEEPINBELL,VICTREEBEL);
    ADD(ODDISH,GLOOM,VILEPLUME);
    ADD(CATERPIE,METAPOD,BUTTERFREE);
    
    //FOSSIL
    ADD(DRATINI,DRAGONAIR,DRAGONITE);
    ADD(BaseSet.GASTLY,BaseSet.HAUNTER,GENGAR);
    ADD(MYSTERIOUS_FOSSIL,KABUTO,KABUTOPS);
    ADD(MYSTERIOUS_FOSSIL,OMANYTE,OMASTAR);
    ADD(GEODUDE,GRAVELER,GOLEM);
    
    //TEAM ROCKET
    ADD(ABRA, TeamRocket.DARK_KADABRA, TeamRocket.DARK_ALAKAZAM);
    ADD(SQUIRTLE, TeamRocket.DARK_WARTORTLE, TeamRocket.DARK_BLASTOISE);
    ADD(CHARMANDER, TeamRocket.DARK_CHARMELEON, TeamRocket.DARK_CHARIZARD);
    ADD(DRATINI, TeamRocket.DARK_DRAGONAIR, TeamRocket.DARK_DRAGONITE);
    ADD(MACHOP, TeamRocket.DARK_MACHOKE, TeamRocket.DARK_MACHAMP);
    ADD(ODDISH, TeamRocket.DARK_GLOOM, TeamRocket.DARK_VILEPLUME);
    ADD(GASTLY_109, DARK_HAUNTER_36, DARK_GENGAR_6);

    //GYM SERIES
    ADD(ERIKA_S_ODDISH_47, ERIKA_S_GLOOM_45, ERIKA_S_VILEPLUME_5);
    ADD(SABRINA_S_GASTLY_93, SABRINA_S_HAUNTER_55, SABRINA_S_GENGAR_14);
    ADD(BROCK_S_GEODUDE_38, BROCK_S_GRAVELER_34, BROCK_S_GOLEM_20);
    ADD(ERIKA_S_BELLSPROUT_38, ERIKA_S_WEEPINBELL_48, ERIKA_S_VICTREEBEL_26);
    ADD(MISTY_S_POLIWAG_89, MISTY_S_POLIWHIRL_53, MISTY_S_POLIWRATH_31);
    ADD(BLAINE_S_CHARMANDER_60, BLAINE_S_CHARMELEON_31, BLAINE_S_CHARIZARD_2);
    ADD(ERIKA_S_BULBASAUR_39, ERIKA_S_IVYSAUR_41, ERIKA_S_VENUSAUR_4);
    ADD(GIOVANNI_S_MACHOP_72, GIOVANNI_S_MACHOKE_42, GIOVANNI_S_MACHAMP_6);
    ADD(GIOVANNI_S_NIDORAN_MALE_76, GIOVANNI_S_NIDORINO_45, GIOVANNI_S_NIDOKING_7);
    ADD(GIOVANNI_S_NIDORAN_FEMALE_75, GIOVANNI_S_NIDORINA_44, GIOVANNI_S_NIDOQUEEN_23);
    ADD(KOGA_S_WEEDLE_82, KOGA_S_KAKUNA_47, KOGA_S_BEEDRILL_9);
    ADD(SABRINA_S_ABRA_93, SABRINA_S_KADABRA_58, SABRINA_S_ALAKAZAM_16);

    //NEO_SERIES
    ADD(MAREEP_119, DARK_FLAAFFY_34, DARK_AMPHAROS_1);
    ADD(ZUBAT_59, TeamRocket.DARK_GOLBAT, DARK_CROBAT_2);
    ADD(TOTODILE_134, DARK_CROCONAW_32, DARK_FERALIGATR_5);
    ADD(CYNDAQUIL_104, DARK_QUILAVA_39, DARK_TYPHLOSION_10);
    ADD(LARVITAR_116, DARK_PUPITAR_38, DARK_TYRANITAR_11);
    ADD(DRATINI, LIGHT_DRAGONAIR_22, LIGHT_DRAGONITE_14);
    ADD(MACHOP, LIGHT_MACHOKE_49, LIGHT_MACHAMP_25);
    ADD(MYSTERIOUS_FOSSIL, DARK_OMANYTE_37, DARK_OMASTAR_19);

    //ECARDS
    ADD(MAREEP_119, FLAAFFY_77, AMPHAROS_2);
    ADD(TOTODILE_134, CROCONAW_74, FERALIGATR_12);
    ADD(CYNDAQUIL_104, QUILAVA_91, TYPHLOSION_28);
    ADD(CHIKORITA_100, BAYLEEF_71, MEGANIUM_18);
    ADD(LARVITAR_116, PUPITAR_90, TYRANITAR_29);
    ADD(ZUBAT_117, GOLBAT_60, CROBAT_6);
    ADD(POLIWAG_87, POLIWHIRL_89, POLITOED_25);
    ADD(ODDISH_97, GLOOM_49, BELLOSSOM_5);
    ADD(HORSEA_84, SEADRA_58, KINGDRA_148);
    ADD(HOPPIP_112, SKIPLOOM_60, JUMPLUFF_17);
    ADD(BURIED_FOSSIL_47, KABUTO, KABUTOPS);
    ADD(BURIED_FOSSIL_47, OMANYTE, OMASTAR);
    
    //RS
    ADD(ARON_25, LAIRON_36, AGGRON_1);
    ADD(WURMPLE_78, SILCOON_43, BEAUTIFLY_2);
    ADD(WURMPLE_78, CASCOON_26, DUSTOX_6);
    ADD(TORCHIC_73, COMBUSKEN_27, BLAZIKEN_15);
    ADD(TREECKO_75, GROVYLE_32, SCEPTILE_11);
    ADD(MUDKIP_59, MARSHTOMP_40, SWAMPERT_13);
    ADD(RALTS_66, KIRLIA_34, GARDEVOIR_7);
    ADD(SLAKOTH_45, VIGOROTH_47, SLAKING_12);
    //SS
    ADD(CLAW_FOSSIL_90, ANORITH_27, ARMALDO_1);
    ADD(ROOT_FOSSIL_92, LILEEP_42, CRADILY_3);
    ADD(LOTAD_66, LOMBRE_45, LUDICOLO_7);
    ADD(SEEDOT_76, NUZLEAF_48, SHIFTRY_12);
    ADD(ARON_25, LAIRON_36, AGGRON_EX_95);
    ADD(RALTS_66, KIRLIA_34, GARDEVOIR_EX_96);
    ADD(MYSTERIOUS_FOSSIL, KABUTO, KABUTOPS_EX_97);
    ADD(BURIED_FOSSIL_47, KABUTO, KABUTOPS_EX_97);
    ADD(CYNDAQUIL_104, QUILAVA_51, TYPHLOSION_EX_99);
    //DR
    ADD(TRAPINCH_78,VIBRAVA_22,FLYGON_15);
    ADD(BAGON_23,SHELGON_20,SALAMENCE_10);
    ADD(MAREEP_64,FLAAFFY_27,AMPHAROS_EX_89);
    ADD(DRATINI_26,DRAGONAIR_14,DRAGONITE_EX_90);
    ADD(GEODUDE_55,GRAVELER_29,GOLEM_EX_91);
    ADD(HORSEA_33,SEADRA_40,KINGDRA_EX_92);
    //MA
    ADD(TEAM_AQUA_S_SPHEAL_56, TEAM_AQUA_S_SEALEO_16, TEAM_AQUA_S_WALREIN_6);
    ADD(TEAM_MAGMA_S_ARON_58, TEAM_MAGMA_S_LAIRON_20, TEAM_MAGMA_S_AGGRON_7);
    ADD(TORCHIC_73, COMBUSKEN_25, BLAZIKEN_EX_89);
    ADD(ROOT_FOSSIL_92, LILEEP_42, CRADILY_EX_90);
    ADD(TREECKO_75, GROVYLE_32, SCEPTILE_EX_93);
    ADD(MUDKIP_59, MARSHTOMP_36, SWAMPERT_EX_95);
    //HL
    ADD(WHISMUR_82, LOUDRED_39, EXPLOUD_6);
    ADD(BELDUM_28, METANG_21, METAGROSS_11);
    ADD(BELDUM_28, METANG_21, METAGROSS_EX_95);
    ADD(ODDISH, GLOOM, VILEPLUME_EX_100);
    //FRLG
    ADD("Charmander", "Charmeleon", "Charizard ex");
    ADD("Squirtle", "Wartortle", "Blastoise ex");
    ADD("Bulbasaur", "Ivysaur", "Venusaur ex");
    ADD("Gastly", "Haunter", "Gengar ex");
    ADD("Zubat", "Golbat", "Crobat ex");
    ADD("Bagon", "Shelgon", "Salamence ex");
    //BLW-EPO-NVI-NXD
    ADD(DEINO_77,ZWEILOUS_78,HYDREIGON_103);
    ADD(LITWICK_18,LAMPENT_19,CHANDELURE_101);
    ADD("Vanillite","Vanillish","Vanilluxe");
    ADD(SHINX_42,LUXIO_44,LUXRAY_46);
    ADD(TEPIG_15,PIGNITE_17,EMBOAR_19);
    ADD(SOLOSIS_55,DUOSION_56,REUNICLUS_57);
    ADD(TYMPOLE_22,PALPITOAD_23,SEISMITOAD_24);
    ADD(SEWADDLE_3,SWADLOON_5,LEAVANNY_7);
    ADD(AXEW_86,FRAXURE_87,HAXORUS_88);
    ADD(TIMBURR_59,GURDURR_60,CONKELDURR_64);
    ADD(TYNAMO_38,EELEKTRIK_40,EELEKTROSS_41);
    ADD(ROGGENROLA_49,BOLDORE_51,GIGALITH_53);
    ADD(GOTHITA_43,GOTHORITA_45,GOTHITELLE_47);
    ADD("Klink","Klang","Klinklang");
    ADD(VENIPEDE_38,WHIRLIPEDE_39,SCOLIPEDE_40);
    ADD(PIDOVE_80,TRANQUILL_81,UNFEZANT_82);
    ADD(SANDILE_60,KROKOROK_61,KROOKODILE_62);
    ADD(OSHAWOTT_27,DEWOTT_29,SAMUROTT_31);
    ADD(SNIVY_1,SERVINE_3,SERPERIOR_5);
    ADD(LILLIPUP_80,HERDIER_82,STOUTLAND_83);
    //DEX-DRE-DRV-BCR-PLS-PLF-PLB-LTR
    ADD(PORYGON, PORYGON2_73, PORYGON_Z_74);
    ADD(DUSKULL_62, DUSCLOPS_4, DUSKNOIR_63);
    ADD(GIBLE_86, GABITE_88, GARCHOMP_90);
    ADD(STARLY_95, STARAVIA_96, STARAPTOR_97);
    ADD(PIPLUP_27, PRINPLUP_28, EMPOLEON_29);
    ADD(MAGNEMITE_26, MAGNETON_10, MAGNEZONE_46);
    ADD(RALTS_55, KIRLIA_34, GALLADE_61);
    ADD(TOGEPI_102,TOGETIC_103,TOGEKISS_104);
    ADD(TURTWIG_1, GROTLE_2, TORTERRA_3);
    ADD(CHIMCHAR_15, MONFERNO_16, INFERNAPE_17);
    ADD(SWINUB_107, PILOSWINE_24, MAMOSWINE_28);
    ADD(SPHEAL_29, SEALEO_30, WALREIN_31);

    //XY
    ADD(GOOMY_72, SLIGGOO_73, GOODRA_74);
    ADD(FLABEBE_62, FLOETTE_64, FLORGES_66);
    ADD(HONEDGE_83, DOUBLADE_84, AEGISLASH_85);
    ADD(RHYHORN, RHYDON, RHYPERIOR_62);
    ADD(FLETCHLING_113, FLETCHINDER_17, TALONFLAME_28);
    ADD(SCATTERBUG_15, SPEWPA_16, VIVILLON_17);
    ADD(FROAKIE_39, FROGADIER_40, GRENINJA_41);
    ADD(CHESPIN_12, QUILLADIN_13, CHESNAUGHT_14);
    ADD(FENNEKIN_24, BRAIXEN_25, DELPHOX_26);

    //SM
    ADD("Rowlet", "Dartrix", "Decidueye");
    ADD("Rowlet", "Dartrix", "Decidueye-GX");
    ADD("Bounsweet", "Steenee", "Tsareena");
    ADD("Bounsweet", "Steenee", "Tsareena-GX");
    ADD("Litten", "Torracat", "Incineroar");
    ADD("Litten", "Torracat", "Incineroar-GX");
    ADD("Popplio", "Brionne", "Primarina");
    ADD("Popplio", "Brionne", "Primarina-GX");
    ADD("Grubbin", "Charjabug", "Vikavolt");
    ADD("Grubbin", "Charjabug", "Vikavolt-GX");
    ADD("Cosmog", "Cosmoem", "Lunala");
    ADD("Cosmog", "Cosmoem", "Lunala-GX");
    ADD("Cosmog", "Cosmoem", "Solgaleo");
    ADD("Cosmog", "Cosmoem", "Solgaleo-GX");
    ADD("Pikipek", "Trumbeak", "Toucannon");
    ADD("Pikipek", "Trumbeak", "Toucannon-GX");
    ADD("Alolan Geodude", "Alolan Graveler", "Alolan Golem");
    ADD("Beldum", "Metang", "Metagross-GX");
    ADD("Jangmo-o", "Hakamo-o", "Kommo-o");
    ADD("Jangmo-o", "Hakamo-o", "Kommo-o-GX");
    ADD("Charmander", "Charmeleon", "Charizard-GX");
    ADD("Ralts", "Kirlia", "Gardevoir-GX");
    ADD("Machop", "Machoke", "Machamp-GX");
    ADD("Alolan Geodude", "Alolan Graveler", "Alolan Golem-GX");
    ADD("Froakie", "Frogadier", "Greninja-GX");
    ADD("Unidentified Fossil", "Amaura", "Aurorus");
    ADD("Unidentified Fossil", "Shieldon", "Bastiodon");
    ADD("Unidentified Fossil", "Cranidos", "Rampardos");
    ADD("Unidentified Fossil", "Tyrunt", "Tyrantrum");
    ADD("Unidentified Fossil", "Kabuto", "Kabutops");
    ADD("Unidentified Fossil", "Omanyte", "Omastar");
    ADD("Seedot", "Nuzleaf", "Shiftry-GX");
    ADD("Torchic", "Combusken", "Blaziken-GX");
    ADD("Dratini", "Dragonair", "Dragonite-GX");
    ADD("Bagon", "Shelgon", "Salamence-GX");
    ADD("Horsea", "Seadra", "Kingdra-GX");
    ADD("Treecko", "Grovyle", "Sceptile-GX");
    ADD("Larvitar", "Pupitar", "Tyranitar-GX");
    ADD("Mareep", "Flaaffy", "Ampharos-GX");

    // SM
    ADD("Squirtle", "Wartortle", "Blastoise-GX");
  }
  
  private static void ADD(CardInfo...a){
    ADD(java.util.Arrays.stream(a).map(CardInfo::getName).toArray(String[]::new));
  }

  private static void ADD(String...a){
    if (a.length==3) {
      if (map2.get(a[2])==null) {
        map2.put(a[2], new ArrayList<String>());
      }
      map2.get(a[2]).add(a[1]);
      
      if (map2.get(a[1])==null) {
        map2.put(a[1], new ArrayList<String>());
      }
      map2.get(a[1]).add(a[0]);
    }
    else if (a.length==2) {
      if (map2.get(a[1])==null) {
        map2.put(a[1], new ArrayList<String>());
      }
      map2.get(a[1]).add(a[0]);
    }
//    if (a.length==3) {
//      map2.put(a[2], a[1]);
//      map2.put(a[1], a[0]);
//    }
//    else if (a.length==2) {
//      map2.put(a[1], a[0]);
//    }
//    if (map.get(a[0])==null) {
//      map.put(a[0], new HashSet<String>());
//    }
//    map.get(a[0]).add(a[1]);
//    if (a.length>2) {
//      ADD(a[1],a[2]);
//    }
  }
  
  public static List<String> getBasicsFromStage2(String stage2){
    List<String> stage1s = map2.get(stage2), basicsFinal=new ArrayList<String>();
    if (stage1s==null||stage1s.isEmpty()) {
      return basicsFinal;
    }
    for (String stage1: stage1s) {
      List<String> basics = map2.get(stage1);
      if (basics==null||basics.isEmpty()) {
        continue;
      }
      basicsFinal.addAll(basics);
    }
    return basicsFinal;
  }
  
}
