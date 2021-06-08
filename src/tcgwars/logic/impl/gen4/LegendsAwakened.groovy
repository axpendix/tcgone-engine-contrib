package tcgwars.logic.impl.gen4

import tcgwars.logic.effect.gm.Attack
import tcgwars.logic.impl.gen3.LegendMaker;
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
public enum LegendsAwakened implements LogicCardInfo {

  DEOXYS_NORMAL_FORME_1 ("Deoxys Normal Forme", "1", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  DRAGONITE_2 ("Dragonite", "2", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _COLORLESS_]),
  FROSLASS_3 ("Froslass", "3", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GIRATINA_4 ("Giratina", "4", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  GLISCOR_5 ("Gliscor", "5", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  HEATRAN_6 ("Heatran", "6", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  KINGDRA_7 ("Kingdra", "7", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  LUXRAY_8 ("Luxray", "8", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  MAMOSWINE_9 ("Mamoswine", "9", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  METAGROSS_10 ("Metagross", "10", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _METAL_]),
  MEWTWO_11 ("Mewtwo", "11", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  POLITOED_12 ("Politoed", "12", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  PROBOPASS_13 ("Probopass", "13", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  RAYQUAZA_14 ("Rayquaza", "14", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  REGIGIGAS_15 ("Regigigas", "15", Rarity.HOLORARE, [POKEMON, BASIC, _COLORLESS_]),
  SPIRITOMB_16 ("Spiritomb", "16", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  YANMEGA_17 ("Yanmega", "17", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  ARMALDO_18 ("Armaldo", "18", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _FIGHTING_]),
  AZELF_19 ("Azelf", "19", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  BELLOSSOM_20 ("Bellossom", "20", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  CRADILY_21 ("Cradily", "21", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  CRAWDAUNT_22 ("Crawdaunt", "22", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  DELCATTY_23 ("Delcatty", "23", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DEOXYS_ATTACK_FORME_24 ("Deoxys Attack Forme", "24", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  DEOXYS_DEFENSE_FORME_25 ("Deoxys Defense Forme", "25", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  DEOXYS_SPEED_FORME_26 ("Deoxys Speed Forme", "26", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  DITTO_27 ("Ditto", "27", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  FORRETRESS_28 ("Forretress", "28", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  GROUDON_29 ("Groudon", "29", Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  HEATRAN_30 ("Heatran", "30", Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  JIRACHI_31 ("Jirachi", "31", Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  KYOGRE_32 ("Kyogre", "32", Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  LOPUNNY_33 ("Lopunny", "33", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  MESPRIT_34 ("Mesprit", "34", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  POLIWRATH_35 ("Poliwrath", "35", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  REGICE_36 ("Regice", "36", Rarity.RARE, [POKEMON, BASIC, _WATER_]),
  REGIGIGAS_37 ("Regigigas", "37", Rarity.RARE, [POKEMON, BASIC, _COLORLESS_]),
  REGIROCK_38 ("Regirock", "38", Rarity.RARE, [POKEMON, BASIC, _FIGHTING_]),
  REGISTEEL_39 ("Registeel", "39", Rarity.RARE, [POKEMON, BASIC, _METAL_]),
  SHEDINJA_40 ("Shedinja", "40", Rarity.RARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  TORKOAL_41 ("Torkoal", "41", Rarity.RARE, [POKEMON, BASIC, _FIRE_]),
  UNOWN_EXCLAMATION_MARK_42 ("Unown !", "42", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  UXIE_43 ("Uxie", "43", Rarity.RARE, [POKEMON, BASIC, _PSYCHIC_]),
  VICTREEBEL_44 ("Victreebel", "44", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  VILEPLUME_45 ("Vileplume", "45", Rarity.RARE, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  ANORITH_46 ("Anorith", "46", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  CAMERUPT_47 ("Camerupt", "47", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  CASTFORM_48 ("Castform", "48", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  CASTFORM_RAIN_FORM_49 ("Castform Rain Form", "49", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  CASTFORM_SNOW_CLOUD_FORM_50 ("Castform Snow-Cloud Form", "50", Rarity.UNCOMMON, [POKEMON, BASIC, _WATER_]),
  CASTFORM_SUNNY_FORM_51 ("Castform Sunny Form", "51", Rarity.UNCOMMON, [POKEMON, BASIC, _FIRE_]),
  DRAGONAIR_52 ("Dragonair", "52", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  DRIFBLIM_53 ("Drifblim", "53", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  EXEGGUTOR_54 ("Exeggutor", "54", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GLISCOR_55 ("Gliscor", "55", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  GRUMPIG_56 ("Grumpig", "56", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  HOUNDOOM_57 ("Houndoom", "57", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  LANTURN_58 ("Lanturn", "58", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  LANTURN_59 ("Lanturn", "59", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  LEDIAN_60 ("Ledian", "60", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  LUCARIO_61 ("Lucario", "61", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  LUXIO_62 ("Luxio", "62", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  MAROWAK_63 ("Marowak", "63", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _FIGHTING_]),
  METANG_64 ("Metang", "64", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  METANG_65 ("Metang", "65", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _METAL_]),
  MIGHTYENA_66 ("Mightyena", "66", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  NINJASK_67 ("Ninjask", "67", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  PERSIAN_68 ("Persian", "68", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  PILOSWINE_69 ("Piloswine", "69", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SEADRA_70 ("Seadra", "70", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  STARMIE_71 ("Starmie", "71", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SWALOT_72 ("Swalot", "72", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  SWELLOW_73 ("Swellow", "73", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  TAUROS_74 ("Tauros", "74", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  TENTACRUEL_75 ("Tentacruel", "75", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  UNOWN_J_76 ("Unown J", "76", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_R_77 ("Unown R", "77", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_U_78 ("Unown U", "78", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_V_79 ("Unown V", "79", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_W_80 ("Unown W", "80", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_Y_81 ("Unown Y", "81", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  UNOWN_QUESTION_MARK_82 ("Unown ?", "82", Rarity.UNCOMMON, [POKEMON, BASIC, _PSYCHIC_]),
  BELDUM_83 ("Beldum", "83", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  BELDUM_84 ("Beldum", "84", Rarity.COMMON, [POKEMON, BASIC, _METAL_]),
  BELLSPROUT_85 ("Bellsprout", "85", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  BUNEARY_86 ("Buneary", "86", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  CHINCHOU_87 ("Chinchou", "87", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CHINCHOU_88 ("Chinchou", "88", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  CORPHISH_89 ("Corphish", "89", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  CUBONE_90 ("Cubone", "90", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  DRATINI_91 ("Dratini", "91", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  DRIFLOON_92 ("Drifloon", "92", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  EXEGGCUTE_93 ("Exeggcute", "93", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  GLIGAR_94 ("Gligar", "94", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GLIGAR_95 ("Gligar", "95", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  GLOOM_96 ("Gloom", "96", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GLOOM_97 ("Gloom", "97", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  GULPIN_98 ("Gulpin", "98", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  HITMONCHAN_99 ("Hitmonchan", "99", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  HITMONLEE_100 ("Hitmonlee", "100", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  HITMONTOP_101 ("Hitmontop", "101", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  HORSEA_102 ("Horsea", "102", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  HOUNDOUR_103 ("Houndour", "103", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  LEDYBA_104 ("Ledyba", "104", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  LILEEP_105 ("Lileep", "105", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  MEOWTH_106 ("Meowth", "106", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  MISDREAVUS_107 ("Misdreavus", "107", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  NINCADA_108 ("Nincada", "108", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  NOSEPASS_109 ("Nosepass", "109", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  NUMEL_110 ("Numel", "110", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  ODDISH_111 ("Oddish", "111", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ODDISH_112 ("Oddish", "112", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  PINECO_113 ("Pineco", "113", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  POLIWAG_114 ("Poliwag", "114", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  POLIWHIRL_115 ("Poliwhirl", "115", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  POOCHYENA_116 ("Poochyena", "116", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  RIOLU_117 ("Riolu", "117", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  SHINX_118 ("Shinx", "118", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  SKITTY_119 ("Skitty", "119", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SNEASEL_120 ("Sneasel", "120", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  SPOINK_121 ("Spoink", "121", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  STARYU_122 ("Staryu", "122", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  SWINUB_123 ("Swinub", "123", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TAILLOW_124 ("Taillow", "124", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  TENTACOOL_125 ("Tentacool", "125", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  TYROGUE_126 ("Tyrogue", "126", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  WEEPINBELL_127 ("Weepinbell", "127", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  YANMA_128 ("Yanma", "128", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  BUBBLE_COAT_129 ("Bubble Coat", "129", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL]),
  BUCK_S_TRAINING_130 ("Buck's Training", "130", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CYNTHIA_S_FEELINGS_131 ("Cynthia's Feelings", "131", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ENERGY_PICKUP_132 ("Energy Pickup", "132", Rarity.UNCOMMON, [TRAINER, ITEM]),
  POKE_RADAR_133 ("Poké Radar", "133", Rarity.UNCOMMON, [TRAINER, ITEM]),
  SNOWPOINT_TEMPLE_134 ("Snowpoint Temple", "134", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  STARK_MOUNTAIN_135 ("Stark Mountain", "135", Rarity.UNCOMMON, [TRAINER]),
  TECHNICAL_MACHINE_TS_1_136 ("Technical Machine TS-1", "136", Rarity.UNCOMMON, [TRAINER, ITEM, TECHNICAL_MACHINE]),
  TECHNICAL_MACHINE_TS_2_137 ("Technical Machine TS-2", "137", Rarity.UNCOMMON, [TRAINER, ITEM, TECHNICAL_MACHINE]),
  CLAW_FOSSIL_138 ("Claw Fossil", "138", Rarity.COMMON, [TRAINER]),
  ROOT_FOSSIL_139 ("Root Fossil", "139", Rarity.COMMON, [TRAINER]),
  AZELF_LV_X_140 ("Azelf Lv.X", "140", Rarity.HOLORARE, [LVL_X, POKEMON, _PSYCHIC_]),
  GLISCOR_LV_X_141 ("Gliscor Lv.X", "141", Rarity.HOLORARE, [LVL_X, POKEMON, _FIGHTING_]),
  MAGNEZONE_LV_X_142 ("Magnezone Lv.X", "142", Rarity.HOLORARE, [LVL_X, POKEMON, _METAL_]),
  MESPRIT_LV_X_143 ("Mesprit Lv.X", "143", Rarity.HOLORARE, [LVL_X, POKEMON, _PSYCHIC_]),
  MEWTWO_LV_X_144 ("Mewtwo Lv.X", "144", Rarity.HOLORARE, [LVL_X, POKEMON, _PSYCHIC_]),
  RHYPERIOR_LV_X_145 ("Rhyperior Lv.X", "145", Rarity.HOLORARE, [LVL_X, POKEMON, _FIGHTING_]),
  UXIE_LV_X_146 ("Uxie Lv.X", "146", Rarity.HOLORARE, [LVL_X, POKEMON, _PSYCHIC_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  LegendsAwakened(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
  public String getNumber() {
    return collectionLineNo;
  }

  @Override
  public tcgwars.logic.card.Collection getCollection() {
    return tcgwars.logic.card.Collection.LEGENDS_AWAKENED;
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
      case DEOXYS_NORMAL_FORME_1:
        return basic (this, hp:HP090, type:P, retreatCost:1) {
          weakness P
          pokePower "Form Change", {
            text "Once during your turn (before your attack), you may search your deck for any Deoxys and switch it with Deoxys Normal Forme. (Any cards attached to Deoxys Normal Forme, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys Normal Forme on top of your deck. Shuffle your deck afterward. You can't use more than 1 Form Change Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You can’t use more than 1 Form Change Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Form_Change",bg.turnCount)
              powerUsed()

              def selected = my.deck.search(max:1,"Select a Deoxys",{it.name == "Deoxys" || (it.name.contains("Deoxys") && it.name.contains("Forme"))}) //Deoxys cannot Form Change into Deoxys ex.
              if (selected) {
                def tpc = self.topPokemonCard
                selected.moveTo(suppressLog: true, self.cards)
                tpc.moveTo(suppressLog: true, my.deck)
                bc "${tpc.name} was swapped with ${selected.name}."
                new CheckAbilities().run(bg)
                checkFaint()
              }
              shuffleDeck()
            }
          }
          move "Energy Crush", {
            text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to all of your opponent's Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              def addDmg = 0
              opp.all.each {
                addDmg += it.cards.energyCount(C)
              }
              damage 20 + 10 * addDmg
            }
          }
        };
      case DRAGONITE_2:
        return evolution (this, from:"Dragonair", hp:HP140, type:C, retreatCost:3) {
          weakness C, '+30'
          resistance F, MINUS20
          move "Hyper Beam", {
            text "40 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip { discardDefendingEnergy() }
            }
          }
          move "Draco Meteor", {
            text "Flip a coin for each of your opponent's Pokémon. If that coin flip is heads, this attack does 50 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              opp.all.each {
                flip { damage 50, it }
              }
            }
          }
        };
      case FROSLASS_3:
        return evolution (this, from:"Snorunt", hp:HP090, type:W, retreatCost:1) {
          weakness M, '+20'
          move "Destiny Bond", {
            text "Discard a [P] Energy attached to Froslass. During your opponent's next turn, if Froslass would be Knocked Out by damage from an attack, the Attacking Pokémon is Knocked Out."
            energyCost P
            attackRequirement {}
            onAttack {
              self.cards.filterByEnergyType(P).select("Discard a [P] Energy to use this attack").discard()
              delayed {
                def atk_pkm = null
                before PROCESS_ATTACK_EFFECTS, {
                  if (bg.currentTurn == self.owner.opposite) {
                    atk_pkm = self.owner.opposite.pbg.active //needed to make ensure attacking pokemon is the target of Destiny Bond.
                  }
                }
                before KNOCKOUT, self, {
                  if ((ef as Knockout).byDamageFromAttack && bg.currentTurn == self.owner.opposite && atk_pkm && atk_pkm.inPlay){
                    bc "Destiny Bond activates"
                    new Knockout(self.owner.opposite.pbg.active).run(bg)
                  }
                }
                after EVOLVE, self, {unregister()}
                after DEVOLVE, self, {unregister()}
                after FALL_BACK, self, {unregister()}
                unregisterAfter 2
              }
            }
          }
          move "Icy Breath", {
            text "40 damage. The Defending Pokémon is now Asleep. Put 1 damage counter on each of your opponent's Benched Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 40
              applyAfterDamage ASLEEP
              opp.bench.each {
                directDamage 10
              }
            }
          }
        };
      case GIRATINA_4:
        return basic (this, hp:HP100, type:P, retreatCost:3) {
          weakness D
          resistance C, MINUS20
          move "Shadow Force", {
            text "Choose 1 of your opponent's Benched Pokémon. This attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) Flip a coin. If heads, prevent all effects of an attack, including damage, done to Giratina during your opponent's next turn."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20, opp.bench.select("Choose a Benched Pokémon to deal damage to")
              flip { preventAllEffectsNextTurn() }
            }
          }
          move "Brutal Edge", {
            text "50+ damage. Does 50 damage plus 10 more damage for each damage counter on the Defending Pokémon."
            energyCost P, P, C, C
            attackRequirement {}
            onAttack {
              damage 50 + 10 * defending.numberOfDamageCounters
            }
          }
        };
      case GLISCOR_5:
        return evolution (this, from:"Gligar", hp:HP080, type:F, retreatCost:1) {
          weakness W, '+20'
          resistance F, MINUS20
          move "Burning Poison", {
            text "Choose either Burned or Poisoned. The Defending Pokémon is now affected by that Special Condition. You may return Gliscor and all cards attached to it to your hand."
            attackRequirement {}
            onAttack {
              def choice = choose([1,2], ['Apply Burn', 'Apply Poison'], "Choose 1")

              if (choice == 1) {
                apply BURNED
              } else {
                apply POISONED
              }
              if (confirm("Return Gliscor and all cards attached to it to your hand?")) {
                scoopUpPokemon(self, delegate)
              }
            }
          }
          move "Pester", {
            text "40+ damage. If the Defending Pokémon is affected by a Special Condition, this attack does 40 damage plus 40 more damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 40
              if (defending.specialConditions) damage 40
            }
          }
        };
      case HEATRAN_6:
        return basic (this, hp:HP100, type:R, retreatCost:4) {
          weakness W
          pokePower "Flash Fire", {
            text "Once during your turn (before your attack), you may move a [R] Energy attached to 1 of your Pokémon to Heatran. This power can't be used if Heatran is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()

              def src = my.all.findAll {it != self && it.cards.energyCount(R)}
              assert src: "No [R] energy"
              powerUsed()
              src = src.select("Source for basic energy")
              def card = src.cards.filterByEnergyType(R).select("Card to move").first()
              energySwitch(src, self, card)
            }
          }
          move "Magma Storm", {
            text "40+ damage. You may discard as many basic Energy cards as you like attached to Heatran. If you do, this attack does 40 damage plus 20 more damage for each Energy card you discarded."
            energyCost R, R, C, C
            attackRequirement {}
            onAttack {
              damage 40
              if (confirm("Would you like to discard basic energy cards attached to Heatran?")) {
                assert self.cards.findAll(cardTypeFilter(BASIC_ENERGY)): "There are no basic energies attached to Heatran."
                def atchEnergy = self.cards.filterByType(BASIC_ENERGY)
                def lostEnergy = atchEnergy.select(max: atchEnergy.size(), "Choose basic energies to discard.")
                damage 20 * lostEnergy.size()
                lostEnergy.discard()
              }
            }
          }
        };
      case KINGDRA_7:
        return evolution (this, from:"Seadra", hp:HP130, type:W, retreatCost:1) {
          weakness L, '+30'
          move "Aqua Stream", {
            text "10x damage. Search your discard pile for as many [W] Energy cards as you like, show them to your opponent, and this attack does 10 damage for each [W] Energy card you chose. Put those cards on top of your deck. Shuffle your deck afterward."
            attackRequirement {
              assert my.discard.findAll(basicEnergyFilter(W)) : "No [W] Energy cards in your discard"
            }
            onAttack {
              def energies = my.discard.findAll(basicEnergyFilter(W))
              def usedEnergies = energies.select(max: energies.size(), "Select [W] Energies")
              damage 10 * usedEnergies.size()

              usedEnergies.moveTo(my.deck)
              shuffleDeck()
            }
          }
          move "Dragon Pump", {
            text "40+ damage. You may discard 2 cards from your hand. If you do, this attack does 40 damage plus 20 more damage and does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            attackRequirement {}
            onAttack {
              damage 40
              if (my.hand.size() >= 2 && confirm("Discard 2 cards from hand?")) {
                my.hand.select(count: 2, "Discard 2 cards from hand").discard()
                damage 20
                if (opp.bench) {
                  damage 20, opp.bench.select("Deal damage to which?")
                }
              }
            }
          }
        };
      case LUXRAY_8:
        return evolution (this, from:"Luxio", hp:HP120, type:L, retreatCost:0) {
          weakness F, '+30'
          resistance M, MINUS20
          pokeBody "Rivalry", {
            text "If your opponent has any Pokémon LV.X in play, each of Luxray's attacks does 50 more damage to the Active Pokémon (before applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if (ef.attacker == self && opp.all.any { it.pokemonLevelUp }) {
                  bg.dm().each {
                    if (it.to.active && it.notZero) {
                      bc "Rivalry +50"
                      it.dmg += hp(50)
                    }
                  }
                }
              }
            }
          }
          move "Plasma", {
            text "40 damage. Search your discard pile for a [L] Energy card and attach it to Luxray."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 40
              afterDamage {
                attachEnergyFrom(type: L, my.discard, self)
              }
            }
          }
          move "Shock Bolt", {
            text "100 damage. Discard all [L] Energy attached to Luxray."
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              damage 100
              afterDamage { discardAllSelfEnergy(L) }
            }
          }
        };
      case MAMOSWINE_9:
        return evolution (this, from:"Piloswine", hp:HP140, type:W, retreatCost:4) {
          weakness M, '+40'
          resistance L, MINUS20
          move "Ice Fang", {
            text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and discard an Energy card attached to the Defending Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip {
                applyAfterDamage PARALYZED
                discardDefendingEnergyAfterDamage()
              }
            }
          }
          move "Charge Through", {
            text "60+ damage. You may do 60 damage plus 40 more damage and 40 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) If you do, Mamoswine does 40 damage to itself."
            energyCost F, C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              if (confirm("Do an additional 40 damage and 40 damage to an Opponent's Benched Pokémon by dealing 40 damage to Mamoswine?")) {
                damage 40
                if (opp.bench) {
                  damage 40, opp.bench.select("Deal 40 damage to which Benched Pokémon?")
                }
                damage 40, self
              }
            }
          }
        };
      case METAGROSS_10:
        return evolution (this, from:"Metang", hp:HP120, type:M, retreatCost:3) {
          weakness R, '+30'
          resistance P, MINUS20
          pokePower "Magnetic Reversal", {
            text "Once during your turn (before your attack), you may flip a coin. If heads, switch 1 of your opponent's Benched Pokémon with 1 of the Defending Pokémon. This power can't be used if Metagross is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert self.active : "$self is not your active Pokémon."
              assert opp.bench : "There are no benched Pokémon to switch to"
              powerUsed()
              flip {
                switchYourOpponentsBenchedWithActive(Source.POKEPOWER)
              }
            }
          }
          move "Extra Comet Punch", {
            text "50 damage. During your next turn, Metagross's Extra Comet Punch attack's base damage is 100."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 50
              increasedBaseDamageNextTurn("Extra Comet Punch", hp(50))
            }
          }
        };
      case MEWTWO_11:
        return basic (this, hp:HP080, type:P, retreatCost:2) {
          weakness P, '+20'
          move "Hypnoblast", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage ASLEEP
            }
          }
          move "Psychic", {
            text "40+ damage. Does 40 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 40 + 10 * defending.cards.energyCount(C)
            }
          }
        };
      case POLITOED_12:
        return evolution (this, from:"Poliwhirl", hp:HP120, type:W, retreatCost:1) {
          weakness G, '+30'
          pokeBody "Enthusiasm", {
            text "If you have Poliwag, Poliwhirl, and Poliwrath in play, each of these Pokémon's attacks does 60 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if (ef.attacker.owner == self.owner)
                  bg.dm().each {
                    if (it.to.active && it.to.owner != self.owner && it.notZero) {
                      def attacker = it.from
                      def enthusiasm_cond = {
                        def toadNames = ["Poliwag", "Poliwhirl", "Poliwrath"]
                        return (attacker.name in toadNames && toadNames.every{toadName ->
                          self.owner.pbg.all.any{ pcs -> pcs.name == toadName }
                        })
                      }
                      if (enthusiasm_cond.call()) {
                        bc "Enthusiasm +60"
                        it.dmg += hp(60)
                      }
                    }
                  }
              }
            }
          }
          move "Frog Hop", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 40 more damage."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 40
              flip { damage 40 }
            }
          }
        };
      case PROBOPASS_13:
        return evolution (this, from:"Nosepass", hp:HP090, type:F, retreatCost:3) {
          weakness W, '+20'
          pokeBody "Steel Coating", {
            text "Any damage done to Probopass by your opponent's attacks is reduced by 10 for each [M] Energy attached to Probopass (after applying Weakness and Resistance). You can't reduce more than 20 damage in this way."
            delayedA {
              before APPLY_ATTACK_DAMAGES,{
                def reduceBy = Math.min(2, self.cards.energyCount(M))
                bg.dm().each {
                  if (it.to == self && it.notNoEffect && it.dmg.value && it.from.owner == self.owner.opposite) {
                    bc "Steel Coating -${10 * reduceBy}"
                    it.dmg -= hp(10 * reduceBy)
                  }
                }
              }
            }
          }
          move "Metal Bomber", {
            text "60 damage. Choose a number of your opponent's Benched Pokémon up to the amount of [M] Energy attached to Probopass. This attack does 20 damage to each of them. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 60
              def maxCount = Math.min(self.cards.filterByEnergyType(M).size(), opp.bench.size())
              multiSelect(opp.bench, 1, maxCount, text).each {
                damage 20, it
              }
            }
          }
        };
      case RAYQUAZA_14:
        return basic (this, hp:HP100, type:C, retreatCost:3) {
          weakness C
          resistance F, MINUS20
          pokePower "Speed Gain", {
            text "Once during your turn (before your attack), you may flip a coin until you get tails. For each heads, search your discard pile for a basic [R] Energy card or a basic [L] Energy card and attach it to Rayquaza. This power can't be used if Rayquaza is affected by a Special Condition or if you have another Rayquaza in play."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert my.all.findAll { it.name == "Rayquaza" }.size() == 1 : "Can't use because more than 1 Rayquaza is in play"
              assert my.discard.filterByType(ENERGY).any { it.asEnergyCard().containsTypePlain(R) || it.asEnergyCard().containsTypePlain(L)} : "There are no [R] or [L] Energy card in your discard pile."
              powerUsed()

              flipUntilTails {
                attachEnergy(self,my.discard.filterByType(ENERGY).findAll {
                  it.asEnergyCard().containsTypePlain(R) || it.asEnergyCard().containsTypePlain(L)
                }.select("Attach which Energy to Rayquaza?").first())
              }
            }
          }
          move "Sky Judgment", {
            text "150 damage. Discard all Energy attached to Rayquaza."
            energyCost R, R, L, L
            attackRequirement {}
            onAttack {
              damage 150
              afterDamage {
                discardAllSelfEnergy()
              }
            }
          }
        };
      case REGIGIGAS_15:
        return basic (this, hp:HP120, type:C, retreatCost:4) {
          weakness F
          pokeBody "Slow Start", {
            text "Regigigas can't attack until your opponent has 3 or less Prize cards left."
            delayedA {
              before CHECK_ATTACK_REQUIREMENTS, {
                if (ef.attacker == self && opp.prizeCardSet.size() > 3) {
                  wcu "Slow Start"
                  prevent()
                }
              }
            }
          }
          move "Crush Grip", {
            text "120 damage. If the Defending Pokémon already has any damage counters on it, this attack's base damage is 40 instead of 120."
            energyCost W, F, M, C
            attackRequirement {}
            onAttack {
              if (defending.numberOfDamageCounters) {
                damage 40
              } else {
                damage 120
              }
            }
          }
        };
      case SPIRITOMB_16:
        return basic (this, hp:HP070, type:P, retreatCost:2) {
          resistance C, MINUS20
          pokePower "Curse Breath", {
            text "Once during your turn, when you put Spiritomb from your hand onto your Bench, you may put 1 damage counter on all Pokémon that already have any damage counters on them (both yours and your opponent's). You can't use more than 1 Curse Breath Poké-Power each turn."
            onActivate { r->
              if (r == PLAY_FROM_HAND && self.benched && confirm("Use Curse Breath?")) {
                powerUsed()
                all.each {
                  if (it.numberOfDamageCounters) {
                    directDamage 10, it, Source.POKEPOWER
                  }
                }
              }
            }
          }
          move "Transfer Pain", {
            text "Move 1 damage counter from 1 of your Pokémon to 1 of your opponent's Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              def src = opp.all.findAll{it.numberOfDamageCounters}.select()
              def tar = opp.all.findAll{it != src}.select()
              src.damage -= hp(10)
              directDamage 10, tar
            }
          }
        };
      case YANMEGA_17:
        return evolution (this, from:"Yanma", hp:HP090, type:G, retreatCost:0) {
          weakness L, '+20'
          resistance F, MINUS20
          move "Sonic Wave", {
            text "10 damage. Does 10 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            attackRequirement {}
            onAttack {
              damage 10
              opp.bench.each {
                damage 10, it
              }
              afterDamage {
                whirlwind()
              }
            }
          }
          move "Pursue and Turn", {
            text "60+ damage. If the Defending Pokémon already has 2 or more damage counters on it, this attack does 60 damage plus 20 more damage and switch Yanmega with 1 of your Benched Pokémon."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 60

              if (defending.numberOfDamageCounters >= 2) {
                damage 20
                afterDamage {
                  switchYourActive()
                }
              }
            }
          }
        };
      case ARMALDO_18:
        return evolution (this, from:"Anorith", hp:HP140, type:F, retreatCost:2) {
          weakness G, '+30'
          pokeBody "Fossil Armor", {
            text "If Armaldo would be damaged by an attack, prevent that attack's damage done to Armaldo if that damage is 60 or less."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (it.to == self && it.notNoEffect && (it.dmg.value <= 60)) {
                    bc "Fossil Armor prevent damage"
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
          move "Crush Claw", {
            text "60 damage. During your next turn, if an attack does damage to the Defending Pokémon (after applying Weakness and Resistance), that attack does 40 more damage."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 60
              afterDamage {
                increasedDamageDoneToDefending(self, defending, 40, thisMove.name)
              }
            }
          }
        };
      case AZELF_19:
        return basic (this, hp:HP070, type:P, retreatCost:1) {
          weakness P, '+20'
          pokePower "Time Walk", {
            text "Once during your turn, when you put Azelf from your hand onto your Bench, you may look at all of your face-down Prize cards. If you do, you may choose 1 Pokémon you find there, show it to your opponent, and put it into your hand. Then, choose 1 card in your hand and put it as a Prize card face down."
            onActivate { reason ->
              if (reason == PLAY_FROM_HAND && self.benched && confirm("Use Time Walk?")) {
                assert my.prizeCardSet.faceDownCards.size() != 0 : "You cannot use Time Walk if all of your prizes are face-up."
                powerUsed()
                def tar = my.prizeCardSet.faceDownCards.select(hidden: false, min: 0, "Choose a Pokemon card from your prizes.", cardTypeFilter(POKEMON))
                if (tar) {
                  tar.moveTo(my.hand).showToOpponent("Your opponent has swapped this prize card with a card from their hand.")
                  my.hand.select("Card to put back into Prizes").moveTo(hidden:true, my.prizeCardSet)
                }
              }
            }
          }
          move "Lock Up", {
            text "20 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 20
              cantRetreat(defending)
            }
          }
        };
      case BELLOSSOM_20:
        return evolution (this, from:"Gloom", hp:HP100, type:G, retreatCost:1) {
          weakness R, '+30'
          resistance W, MINUS20
          move "Parallel Gain", {
            text "30 damage. Remove 1 damage counter from each of your Pokémon."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 30
              my.all.each {
                heal 10, it
              }
            }
          }
          move "Blend Pollen", {
            text "40+ damage. Does 40 damage plus 20 more damage for each Vileplume and each Bellossom you have in play. Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 40
              my.all.findAll { it.name == "Vileplume" || it.name == "Bellossom" }.each {
                damage 20
              }
              flip {
                applyAfterDamage BURNED
              }
            }
          }
        };
      case CRADILY_21:
        return evolution (this, from:"Lileep", hp:HP120, type:G, retreatCost:3) {
          weakness R, '+30'
          move "Drain Down", {
            text "30 damage. Before doing damage, you may switch 1 of the Defending Pokémon with 1 of your opponent's Benched Pokémon. If you do, this attack does 30 damage to the new Defending Pokémon. If the Defending Pokémon would be Knocked Out by this attack, you may remove all damage counters from Cradily."
            energyCost G
            attackRequirement {}
            onAttack {
              def pcs = defending
              if (opp.bench && confirm("Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon?")) {
                pcs = opp.bench.select("New Defending Pokémon")
                sw2 pcs
              }

              delayed {
                before KNOCKOUT, pcs, {
                  if (self.numberOfDamageCounters && confirm("Remove all damage counters from Cradily?")) {
                    healAll self
                  }
                  unregister()
                }
                unregisterAfter 1
              }
              damage 30
            }
          }
          move "Acid", {
            text "50 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 50
              cantRetreat(defending)
            }
          }
        };
      case CRAWDAUNT_22:
        return evolution (this, from:"Corphish", hp:HP090, type:W, retreatCost:2) {
          weakness L, '+20'
          resistance P, MINUS20
          move "Gripthrow", {
            text "Flip a coin. If heads, your opponent returns the Defending Pokémon and all cards attached to it to his or her hand."
            energyCost W, C
            attackRequirement {}
            onAttack {
              flip{
                scoopUpPokemon(defending, delegate)
              }
            }
          }
          move "Prop-up Pinchers", {
            text "50+ damage. If Crawdaunt has a Technical Machine card attached to it, this attack does 50 damage plus 30 more damage."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 50
              if (self.cards.filterByType(TECHNICAL_MACHINE)) {
                damage 30
              }
            }
          }
        };
      case DELCATTY_23:
        return evolution (this, from:"Skitty", hp:HP080, type:C, retreatCost:1) {
          weakness F, '+20'
          pokeBody "Attracting Body", {
            text "If Delcatty is your Active Pokémon and is damaged by an opponent's attack (even if Delcatty is Knocked Out), flip a coin. If heads, the Attacking Pokémon is now Confused."
            ifActiveAndDamagedByAttackBody(delegate) {
              bc "Attracting Body activates"
              flip {
                apply CONFUSED, ef.attacker, Source.POKEBODY
              }
            }
          }
          move "Energy Assist", {
            text "30 damage. Search your discard pile for a basic Energy card and attach it to 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 30
              attachEnergyFrom(basic: true, my.discard, my.bench)
            }
          }
        };
      case DEOXYS_ATTACK_FORME_24:
        return basic (this, hp:HP080, type:P, retreatCost:2) {
          weakness P
          pokePower "Form Change", {
            text "Once during your turn (before your attack), you may search your deck for any Deoxys and switch it with Deoxys Attack Forme. (Any cards attached to Deoxys Attack Forme, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys Attack Forme on top of your deck. Shuffle your deck afterward. You can't use more than 1 Form Change Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You can’t use more than 1 Form Change Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Form_Change",bg.turnCount)
              powerUsed()

              def selected = my.deck.search(max:1,"Select a Deoxys",{it.name == "Deoxys" || (it.name.contains("Deoxys") && it.name.contains("Forme"))}) //Deoxys cannot Form Change into Deoxys ex.
              if (selected) {
                def tpc = self.topPokemonCard
                selected.moveTo(suppressLog: true, self.cards)
                tpc.moveTo(suppressLog: true, my.deck)
                bc "${tpc.name} was swapped with ${selected.name}."
                new CheckAbilities().run(bg)
                checkFaint()
              }
              shuffleDeck()
            }
          }
          move "Psychic Boost", {
            text "80 damage. During your next turn, Deoxys's Psychic Boost attack's base damage is 20."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 80
              afterDamage {
                decreasedBaseDamageNextTurn(self, "Psychic Boost", hp(60))
              }
            }
          }
        };
      case DEOXYS_DEFENSE_FORME_25:
        return basic (this, hp:HP100, type:P, retreatCost:2) {
          weakness P
          pokePower "Form Change", {
            text "Once during your turn (before your attack), you may search your deck for any Deoxys and switch it with Deoxys Defense Forme. (Any cards attached to Deoxys Defense Forme, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys Defense Forme on top of your deck. Shuffle your deck afterward. You can't use more than 1 Form Change Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You can’t use more than 1 Form Change Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Form_Change",bg.turnCount)
              powerUsed()

              def selected = my.deck.search(max:1,"Select a Deoxys",{it.name == "Deoxys" || (it.name.contains("Deoxys") && it.name.contains("Forme"))}) //Deoxys cannot Form Change into Deoxys ex.
              if (selected) {
                def tpc = self.topPokemonCard
                selected.moveTo(suppressLog: true, self.cards)
                tpc.moveTo(suppressLog: true, my.deck)
                bc "${tpc.name} was swapped with ${selected.name}."
                new CheckAbilities().run(bg)
                checkFaint()
              }
              shuffleDeck()
            }
          }
          move "Psychic Defense", {
            text "40 damage. During your opponent's next turn, prevent all effects of an attack, and any damage done to Deoxys by attacks is reduced by 20 (after applying Weakness and Resistance)."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 40
              preventAllEffectsExcludingDamageNextTurn()
              reduceDamageNextTurn(hp(20), thisMove)
            }
          }
        };
      case DEOXYS_SPEED_FORME_26:
        return basic (this, hp:HP070, type:P, retreatCost:0) {
          weakness P
          pokePower "Form Change", {
            text "Once during your turn (before your attack), you may search your deck for any Deoxys and switch it with Deoxys Speed Forme. (Any cards attached to Deoxys Speed Forme, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys Speed Forme on top of your deck. Shuffle your deck afterward. You can't use more than 1 Form Change Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You can’t use more than 1 Form Change Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Form_Change",bg.turnCount)
              powerUsed()

              def selected = my.deck.search(max:1,"Select a Deoxys",{it.name == "Deoxys" || (it.name.contains("Deoxys") && it.name.contains("Forme"))}) //Deoxys cannot Form Change into Deoxys ex.
              if (selected) {
                def tpc = self.topPokemonCard
                selected.moveTo(suppressLog: true, self.cards)
                tpc.moveTo(suppressLog: true, my.deck)
                bc "${tpc.name} was swapped with ${selected.name}."
                new CheckAbilities().run(bg)
                checkFaint()
              }
              shuffleDeck()
            }
          }
          move "Speed Shot", {
            text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              swiftDamage 50, opp.all.select("Deal damage to?")
            }
          }
        };
      case DITTO_27:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F, '+20'
          pokeBody "Ditto DNA", {
            text "As long as Ditto is your Active Pokémon, its maximum HP is the same as your opponent's Active Pokémon. Ditto can use the attacks of that Pokémon as its own. (You still need the necessary Energy to use each attack.) If that Pokémon is no longer your opponent's Active Pokémon, choose 1 of your opponent's Active Pokémon for Ditto to copy."
            delayedA {
              def recur = false
              def tar = self.owner.opposite.pbg.active
              before GET_FULL_HP, self, {
                if (recur) {
                  recur = false
                  prevent()
                }
                if (tar.fullName == 'Ditto (LA 27)' || tar.fullName == 'Ditto (FO 3)' || tar.fullName == 'Ditto (FO 18)') {
                  recur = true
                }
              }
            }
            getterA (GET_FULL_HP, self) { Holder h->
              if (self.active) {
                h.object = tar.getFullHP()
              }
            }
            metronomeA delegate, { self.owner.opposite.pbg.active }
          }
        };
      case FORRETRESS_28:
        return evolution (this, from:"Pineco", hp:HP090, type:M, retreatCost:2) {
          weakness R, '+20'
          resistance P, MINUS20
          pokeBody "Iron Shell", {
            text "Whenever you attach a basic Energy card from your hand to Forretress (excluding effects of attacks), you may flip a coin. If tails, put 2 damage counters on each Pokémon (both yours and your opponent's) (excluding any Forretress)."
            //Errata: https://compendium.pokegym.net/compendium-lvx.html#280
            delayedA {
              after ATTACH_ENERGY, self, {
                if (ef.reason == PLAY_FROM_HAND && (ef.card as EnergyCard).cardTypes.is(BASIC_ENERGY)) {
                  flip 1, { }, {
                    all.each {
                      if (it.name != "Forretress") {
                        directDamage 20, it
                      }
                    }
                  }
                }
              }
            }
          }
          move "Explosion", {
            text "100 damage. Forretress does 40 damage to itself."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 100
              damage 40, self
            }
          }
        };
      case GROUDON_29:
        return basic (this, hp:HP100, type:F, retreatCost:3) {
          weakness G
          resistance L, MINUS20
          move "Drought", {
            text "Choose up to 2 basic [F] Energy cards from your hand and attach them to 1 of your Pokémon."
            attackRequirement {
              assert my.hand.filterByBasicEnergyType(F) : "No [F] Energy cards in your hand"
            }
            onAttack {
              def tar = my.all.select("Attach to which Pokemon?")
              attachEnergyFrom(max: 2, type: F, basic: true, my.hand, tar)
            }
          }
          move "Major Earthquake", {
            text "100 damage. Discard 2 [F] Energy attached to Groudon and this attack does 10 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 100
              discardSelfEnergyAfterDamage F, F
              my.bench.each {
                damage 10, it
              }
            }
          }
        };
      case HEATRAN_30:
        return basic (this, hp:HP100, type:M, retreatCost:3) {
          weakness W
          pokePower "Smelt", {
            text "Once during your turn (before your attack), you may move a [M] Energy attached to 1 of your Pokémon to Heatran. This power can't be used if Heatran is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              def src = my.all.findAll { it != self && it.cards.energyCount(M) }
              assert src: "No [M] energy"
              powerUsed()

              src = src.select("Source for basic energy")
              def card = src.cards.filterByEnergyType(M).select("Card to move").first()
              energySwitch(src, self, card)
            }
          }
          move "Heavy Metal", {
            text "40+ damage. Flip a coin for each [M] Energy attached to Heatran. This attack does 40 damage plus 20 more damage for each heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              self.cards.filterByEnergyType(M).each {
                flip { damage 20 }
              }
            }
          }
        };
      case JIRACHI_31:
        return basic (this, hp:HP070, type:M, retreatCost:1) {
          weakness R, '+20'
          resistance P, MINUS20
          move "One Desire", {
            text "Search your deck for any 1 card. Shuffle your deck, then put that card on top of your deck."
            attackRequirement {
              assert my.deck : "Deck is empty"
            }
            onAttack {
              def card = deck.select("Select a card to be place on top of your deck").first()
              shuffleDeck()
              deck.remove(card)
              deck.add(0, card)
              bc "Put 1 card on top of deck"
            }
          }
          move "Doom Desire", {
            text "Discard all Energy attached to Jirachi. The Defending Pokémon is Knocked Out at the end of your opponent's next turn."
            energyCost M, M
            attackRequirement {}
            onAttack {
              discardAllSelfEnergy(null)
              targeted(defending) {
                delayed {
                  def activatedTurn, card
                  register {
                    activatedTurn = bg.turnCount
                    card = defending.topPokemonCard
                  }
                  before BETWEEN_TURNS, {
                    if (activatedTurn < bg.turnCount) {
                      if (defending.inPlay) {
                        bc "Doom Desire activates"
                        new Knockout(defending).run(bg);
                      }
                      unregister()
                    }
                  }
                  after SWITCH, defending, { unregister() }
                  after EVOLVE, defending, { unregister() }
                  after REMOVE_FROM_PLAY, defending, {
                    if (ef.removedCards.contains(card)) {
                      unregister()
                    }
                  }
                }
              }
            }
          }
        };
      case KYOGRE_32:
        return basic (this, hp:HP100, type:W, retreatCost:3) {
          weakness L
          move "Drizzle", {
            text "Choose up to 2 basic [W] Energy cards from your hand and attach them to 1 of your Pokémon."
            attackRequirement {
              assert my.hand.filterByType(BASIC_ENERGY).filterByEnergyType(W) : "No [W] Energy cards in your hand"
            }
            onAttack {
              def energies = my.hand.filterByType(BASIC_ENERGY).filterByEnergyType(W).select(max: 2, "Select 2 basic [F] Energy cards to attach to 1 of your Pokémon")
              my.hand.removeAll(energies)
              energies.each {
                if (my.bench) {
                  attachEnergy(my.bench.select("Attach to which?"), it)
                } else {
                  attachEnergy(self, it)
                }
              }
              heal energies.size() * 10, self
            }
          }
          move "High Tide", {
            text "60 damage. Discard 2 [W] Energy attached to Kyogre. This attack does 20 damage to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 60
              discardSelfEnergy(W, W)
              opp.bench.each {
                damage 20
              }
            }
          }
        };
      case LOPUNNY_33:
        return evolution (this, from:"Buneary", hp:HP080, type:C, retreatCost:1) {
          weakness F, '+20'
          pokeBody "Healing Tail", {
            text "As long as Lopunny is your Active Pokémon, remove 1 damage counter from each of your Benched Pokémon between turns."
            delayedA {
              before BEGIN_TURN, {
                if (self.active) {
                  self.owner.pbg.bench.each {
                    if (it.numberOfDamageCounters) {
                      heal 10, it
                    }
                  }
                }
              }
            }
          }
          move "Collect", {
            text "Draw 3 cards."
            attackRequirement {
              assert my.deck : "Deck is empty"
            }
            onAttack {
              draw 3
            }
          }
          move "Cross-Cut", {
            text "30+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 30 damage plus 30 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              if (defending.evolution) {
                damage 30
              }
            }
          }
        };
      case MESPRIT_34:
        return basic (this, hp:HP070, type:P, retreatCost:1) {
          weakness P, '+20'
          pokePower "Psychic Bind", {
            text "Once during your turn, when you put Mesprit from your hand onto your Bench, you may use this power. Your opponent can't use any Poké-Powers on his or her Pokémon during your opponent's next turn."
            onActivate {
              checkLastTurn()
              if (it == PLAY_FROM_HAND && my.deck && confirm("Use Psychic Bind?")) {
                powerUsed()
                delayed {
                  def eff
                  register {
                    eff = getter (IS_ABILITY_BLOCKED) { Holder h ->
                      if (h.effect.target.owner == self.owner.opposite && h.effect.ability instanceof PokePower) {
                        h.object = true
                      }
                    }
                    new CheckAbilities().run(bg)
                  }
                  unregister {
                    eff.unregister()
                    new CheckAbilities().run(bg)
                  }
                  unregisterAfter 2
                }
              }
            }
          }
          move "Extrasensory", {
            text "20+ damage. If you have the same number of cards in your hand as your opponent, this attack does 20 damage plus 50 more damage."
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 20
              if (my.hand.size() == opp.hand.size()) {
                damage 50
              }
            }
          }
        };
      case POLIWRATH_35:
        return evolution (this, from:"Poliwhirl", hp:HP130, type:W, retreatCost:2) {
          weakness L, '+30'
          def turnCount = -1
          HP lastDamage = null
          customAbility {
            delayed (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if (bg().currentTurn == self.owner.opposite) {
                  turnCount = bg.turnCount
                  lastDamage = bg().dm().find({ it.to == self && it.dmg.value >= 0 })?.dmg
                }
              }
            }
          }
          move "Focus Punch", {
            text "60 damage. If Poliwrath was damaged by an attack during your opponent's last turn, this attack does nothing."
            energyCost F
            attackRequirement {
              assert turnCount + 1 != bg.turnCount || !lastDamage : "Was not damaged last turn"
            }
            onAttack {
              if (turnCount + 1 == bg.turnCount && lastDamage == hp(0)) {
                damage 60
              }
            }
          }
          move "Submission", {
            text "90 damage. Poliwrath does 20 damage to itself."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 90
              damage 20, self
            }
          }
        };
      case REGICE_36:
        return basic (this, hp:HP090, type:W, retreatCost:3) {
          weakness M
          def turnCount =- 1
          HP lastDamage = null
          customAbility {
            delayed (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if (bg().currentTurn == self.owner.opposite) {
                  turnCount = bg.turnCount
                  lastDamage = bg().dm().find({ it.to == self && it.dmg.value >= 0 })?.dmg
                }
              }
            }
          }
          pokePower "Regi Move", {
            text "Once during your turn (before your attack), you may use this power. Discard 2 cards from your hand and choose 1 of your opponent's Active Pokémon that isn't an Evolved Pokémon. Then, your opponent switches that Pokémon with 1 of his or her Benched Pokémon. This power can't be used if Regice is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert opp.bench : "Opponent has no Benched Pokémon"
              assert !opp.active.evolution : "Opponent's Active Pokemon is Evolved"
              assert my.hand.size() >= 2 : "Hand is less than 2 cards"
              powerUsed()

              my.hand.select(count: 2, "Select 2 cards to discard").discard()
              sw opp.active, opp.bench.oppSelect("New active")
            }
          }
          move "Ice Reflect", {
            text "50 damage. If Regice was damaged by an attack during your opponent's last turn, the Defending Pokémon is now Paralyzed."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 50
              if (turnCount + 1 == bg.turnCount && lastDamage > hp(0)) {
                applyAfterDamage PARALYZED
              }
            }
          }
        };
      case REGIGIGAS_37:
        return basic (this, hp:HP100, type:C, retreatCost:4) {
          weakness F
          pokeBody "Recover Mechanism", {
            text "When you attach an Energy card from your hand to Regigigas, remove all Special Conditions from Regigigas."
            delayedA {
              after ATTACH_ENERGY, self, {
                if(ef.reason==PLAY_FROM_HAND && ef.card.cardTypes.is(ENERGY)){
                  clearSpecialCondition(self, Source.POKEBODY)
                }
              }
            }
          }
          move "Gigaton Punch", {
            text "60+ damage. Flip a coin. If heads, this attack does 60 damage plus 20 more damage and does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              flip {
                damage 20
                if (opp.bench) {
                  damage 20, opp.bench.select("Deal damage to?")
                }
              }
            }
          }
        };
      case REGIROCK_38:
        return basic (this, hp:HP090, type:F, retreatCost:3) {
          weakness W
          pokePower "Regi Cycle", {
            text "Once during your turn (before your attack), if you have a [F] Energy card in your discard pile, you may discard 2 cards from your hand. Then, attach a [F] Energy card from your discard pile to Regirock. This power can't be used if Regirock is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert my.discard.filterByEnergyType(F) : "There are no [F] Energy cards in your discard pile"
              assert my.hand.size() >= 2 : "Hand is less than 2 cards"
              powerUsed()

              my.hand.select(count: 2, "Select 2 cards to discard").discard()
              attachEnergyFrom(type: F, my.discard, self)
            }
          }
          move "Stone Edge", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 30 more damage."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 40
              flip { damage 30 }
            }
          }
        };
      case REGISTEEL_39:
        return basic (this, hp:HP090, type:M, retreatCost:4) {
          weakness R
          resistance P, MINUS20
          pokePower "Regi Heal", {
            text "Once during your turn (before your attack), you may discard 2 cards from your hand. Then, remove 3 damage counters from Registeel. This power can't be used if Registeel is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.hand.size() >= 2 : "Need 2 cards or more in hand"
              powerUsed()
              my.hand.select(count: 2, "Select 2 cards to discard").discard()
              heal 30, self
            }
          }
          move "Rotating Claws", {
            text "50 damage. You may discard an Energy card attached to Registeel. If you do, search your discard pile for an Energy card (excluding the one you discarded) and attach it to Registeel."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 50
              afterDamage {
                if (my.discard.filterByType(ENERGY) && confirm(text)) {
                  def card = my.discard.filterByType(ENERGY).select(count: 1, "Search your discard pile for an Energy card").first()
                  discardSelfEnergy C
                  attachEnergy(self, card)
                }
              }
            }
          }
        };
      case SHEDINJA_40:
        return evolution (this, from:"Nincada", hp:HP060, type:G, retreatCost:0) {
          pokePower "Resent", {
            text "Once during your opponent's turn, if Shedinja would be Knocked Out by damage from an attack, you may put 4 damage counters on the Attacking Pokémon and each of your opponent's Pokémon that has the same name as the Attacking Pokémon."
            delayedA {
              before (KNOCKOUT, self) {
                if ((ef as Knockout).byDamageFromAttack && bg.currentTurn == self.owner.opposite && confirm("Use Resent?", self.owner)) {
                  self.owner.opposite.pbg.all.each {
                    if (it.name == self.owner.opposite.pbg.active.name) {
                      directDamage 40, it, Source.POKEPOWER
                    }
                  }
                }
              }
            }
          }
          move "Curse and Deceive", {
            text "Put 3 damage counters on the Defending Pokémon. If Shedinja has any damage counters on it, the Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {
              directDamage 30, defending
              if (self.numberOfDamageCounters) {
                applyAfterDamage CONFUSED
              }
            }
          }
        };
      case TORKOAL_41:
        return basic (this, hp:HP080, type:R, retreatCost:2) {
          weakness W, '+20'
          pokeBody "White Smoke", {
            text "As long as Torkoal is your Active Pokémon, prevent all effects, including damage, done to your Benched Pokémon by your opponent's attacks."
            delayedA {
              before null, null, ATTACK, {
                if (self.active && ef instanceof TargetedEffect && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE) {
                  def pcs = (ef as TargetedEffect).getResolvedTarget(bg, e)
                  if (pcs != null && pcs.benched && pcs.owner == self.owner) {
                    bc "White Smoke prevents effect"
                    prevent()
                  }
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (self.active && it.to.owner == self.owner && it.to.benched && it.notNoEffect && it.dmg.value) {
                    bc "White Smoke prevents damage"
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
          move "Black Soot", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Burned and Paralyzed."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                applyAfterDamage BURNED
                applyAfterDamage PARALYZED
              }
            }
          }
        };
      case UNOWN_EXCLAMATION_MARK_42:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P, '+10'
          pokePower "!", {
            text "Once during your turn, when you put Unown ! from your hand onto your Bench, you may flip a coin. If heads, put 2 damage counters on 1 of your opponent's Pokémon. If tails, put 2 damage counters on 1 of your Pokémon."
            onActivate {
              if (it == PLAY_FROM_HAND && confirm("Use ! PokePower?")) {
                powerUsed()
                flip 1, {
                  directDamage 20, opp.all.select("Put 2 damage counters on which?")
                }, {
                  directDamage 20, my.all.select("Put 2 damage counters on which?")
                }
              }
            }
          }
          move "Hidden Power", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage. If tails, Unown ! does 10 damage to itself, and this attack's damage isn't affected by Weakness or Resistance."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              flip 1, {
                damage 10
              }, {
                directDamage 10, self
              }
            }
          }
        };
      case UXIE_43:
        return basic (this, hp:HP070, type:P, retreatCost:1) {
          weakness P, '+20'
          pokePower "Set Up", {
            text "Once during your turn, when you put Uxie from your hand onto your Bench, you may draw cards until you have 7 cards in your hand."
            onActivate { reason ->
              if (reason == PLAY_FROM_HAND && self.benched && my.deck.notEmpty && my.hand.size() < 7 && confirm("Use Set Up?")) {
                powerUsed()
                draw 7 - my.hand.size()
              }
            }
          }
          move "Psychic Restore", {
            text "20 damage. You may put Uxie and all cards attached to it on the bottom of your deck in any order."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
              if (confirm("Put Uxie on the bottom of your deck?")) {
                def rearrangedCards = rearrange(self.cards)
                rearrangedCards.moveTo(my.deck)
                removePCS(self)
              }
            }
          }
        };
      case VICTREEBEL_44:
        return evolution (this, from:"Weepinbell", hp:HP120, type:G, retreatCost:3) {
          weakness R, '+30'
          move "Burning Scent", {
            text "The Defending Pokémon is now Burned and Poisoned. Before applying these effects, you may switch 1 of the Defending Pokémon with 1 of your opponent's Benched Pokémon. The new Defending Pokémon is now Burned and Poisoned."
            attackRequirement {}
            onAttack {
              if (opp.bench && confirm("Switch the Defending Pokémon with 1 of your opponent’s Benched Pokémon?")) {
                sw2 opp.bench.select("New Defending Pokémon")
              }

              apply BURNED
              apply POISONED
            }
          }
          move "Energy Dissolve", {
            text "60 damage. Discard an Energy attached to the Defending Pokémon at the end of your opponent's next turn."
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 60

              targeted (defending) {
                bc "An Energy will be discarded from ${opp.owner.getPlayerUsername(bg)}'s Defending ${defending} at the end of their next turn. (This effect can be removed by evolving or benching ${defending}.)"
                def pcs = defending
                delayed {
                  before BETWEEN_TURNS, {
                    if (bg.currentTurn == self.owner.opposite) {
                      bc "Energy Dissolve activates"
                      discardSelfEnergy C
                    }
                  }
                  after FALL_BACK, pcs, { unregister() }
                  after EVOLVE, pcs, { unregister() }
                  after DEVOLVE, pcs, { unregister() }
                  unregisterAfter 2
                }
              }
            }
          }
        };
      case VILEPLUME_45:
        return evolution (this, from:"Gloom", hp:HP120, type:G, retreatCost:2) {
          weakness P, '+30'
          pokePower "Energy Reaction", {
            text "Once during your turn (before your attack), when you attach a Grass or [P] Energy card from your hand to Vileplume (excluding effects of attacks or Poké-Powers), you may use this power. If you attach a [G] Energy card, the Defending Pokémon is now Asleep. If you attach a [P] Energy card, the Defending Pokémon is now Poisoned. This power can't be used if Vileplume is affected by a Special Condition."
            delayedA {
              after ATTACH_ENERGY, self, {
                if (ef.reason == PLAY_FROM_HAND && (ef.card.asEnergyCard().containsType(G) || ef.card.asEnergyCard().containsType(P)) && !self.specialConditions && confirm("Use Energy Reaction?")) {
                  if (ef.card.asEnergyCard().containsType(G)) {
                    bc "Energy Reaction inflicts Confusion"
                    apply ASLEEP, opp.active
                  }
                  if (ef.card.asEnergyCard().containsType(P)) {
                    bc "Energy Reaction inflicts Poison"
                    apply POISONED, opp.active
                  }
                }
              }
            }
          }
          move "Disturbing Pollen", {
            text "60 damage. Flip a coin. If heads, your opponent can't play any Trainer, Supporter, or Stadium cards from his or her hand during your opponent's next turn."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 60

              flip {
                delayed {
                  before PLAY_TRAINER, {
                    if (bg.currentTurn == self.owner.opposite && (ef.cardToPlay.cardTypes.is(TRAINER) || ef.cardToPlay.cardTypes.is(SUPPORTER) || ef.cardToPlay.cardTypes.is(STADIUM))) {
                      wcu "Disturbing Pollen prevents playing Trainer Cards this turn"
                      prevent()
                    }
                  }
                  unregisterAfter 2
                }
              }
            }
          }
        };
      case ANORITH_46:
        return evolution (this, from:"Claw Fossil", hp:HP080, type:F, retreatCost:1) {
          weakness G, '+20'
          move "Guard Claw", {
            text "20 damage. During your opponent's next turn, any damage done to Anorith by attacks is reduced by 20 (after applying Weakness and Resistance)."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
              reduceDamageNextTurn(hp(20), thisMove)
            }
          }
          move "X-Scissor", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
              flip { damage 20 }
            }
          }
        };
      case CAMERUPT_47:
        return evolution (this, from:"Numel", hp:HP100, type:R, retreatCost:3) {
          weakness W, '+20'
          move "Eruption", {
            text "30+ damage. Each player discards the top card of his or her deck. This attack does 30 damage plus 30 more damage for each Energy card discarded in this way."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 30

              if (opp.deck) {
                def card = opp.deck.first()
                if (card.cardTypes.isEnergy())
                  damage 30
                discard card
              }
              if (my.deck) {
                def card = my.deck.first()
                if (card.cardTypes.isEnergy())
                  damage 30
                discard card
              }
            }
          }
          move "Take Down", {
            text "80 damage. Camerupt does 20 damage to itself."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 80
              damage 20, self
            }
          }
        };
      case CASTFORM_48:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F, '+10'
          pokePower "Temperament", {
            text "Once during your turn (before your attack), you may search your deck for any Castform and switch it with Castform. (Any cards attached to Castform, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Castform on top of your deck. Shuffle your deck afterward. You can't use more than 1 Temperament Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Temperament") != bg.turnCount : "You can’t use more than 1 Temperament Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Temperament", bg.turnCount)
              powerUsed()

              def selected = my.deck.search(max:1,"Select a Castform",{it.name.contains("Castform")})
              if (selected) {
                def tpc = self.topPokemonCard
                selected.moveTo(suppressLog: true, self.cards)
                tpc.moveTo(suppressLog: true, my.deck)
                bc "${tpc.name} was swapped with ${selected.name}."
                new CheckAbilities().run(bg)
                checkFaint()
              }
              shuffleDeck()
            }
          }
          move "Weather Ball", {
            text "30+ damage. If you have a Stadium card in play, remove 3 damage counters from Castform. If your opponent has a Stadium card in play, this attack does 30 damage plus 30 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              if (bg.stadiumInfoStruct) {
                if (bg.stadiumInfoStruct.stadiumCard.player == self.owner) {
                  afterDamage { heal 30, self }
                } else {
                  damage 30
                }
              }
            }
          }
        };
      case CASTFORM_RAIN_FORM_49:
        return basic (this, hp:HP070, type:W, retreatCost:1) {
          weakness L, '+10'
          pokePower "Temperament", {
            text "Once during your turn (before your attack), you may search your deck for any Castform and switch it with Castform Rain Form. (Any cards attached to Castform Rain Form, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Castform Rain Form back into your deck. You can't use more than 1 Temperament Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Temperament") != bg.turnCount : "You can’t use more than 1 Temperament Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Temperament", bg.turnCount)
              powerUsed()

              def selected = my.deck.search(max:1,"Select a Castform",{it.name.contains("Castform")})
              if (selected) {
                def tpc = self.topPokemonCard
                selected.moveTo(suppressLog: true, self.cards)
                tpc.moveTo(suppressLog: true, my.deck)
                bc "${tpc.name} was swapped with ${selected.name}."
                new CheckAbilities().run(bg)
                checkFaint()
              }
              shuffleDeck()
            }
          }
          move "Water Pulse", {
            text "30 damage. The Defending Pokémon is now Asleep."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
              applyAfterDamage ASLEEP
            }
          }
        };
      case CASTFORM_SNOW_CLOUD_FORM_50:
        return basic (this, hp:HP070, type:W, retreatCost:1) {
          weakness M, '+10'
          pokePower "Temperament", {
            text "Once during your turn (before your attack), you may search your deck for any Castform and switch it with Castform Snow-cloud Form. (Any cards attached to Castform Snow-cloud Form, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Castform Snow-cloud Form back into your deck. You can't use more than 1 Temperament Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Temperament") != bg.turnCount : "You can’t use more than 1 Temperament Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Temperament", bg.turnCount)
              powerUsed()

              def selected = my.deck.search(max:1,"Select a Castform",{it.name.contains("Castform")})
              if (selected) {
                def tpc = self.topPokemonCard
                selected.moveTo(suppressLog: true, self.cards)
                tpc.moveTo(suppressLog: true, my.deck)
                bc "${tpc.name} was swapped with ${selected.name}."
                new CheckAbilities().run(bg)
                checkFaint()
              }
              shuffleDeck()
            }
          }
          move "Hail", {
            text "This attack does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            attackRequirement {}
            onAttack {
              opp.all.each {
                damage 10, it
              }
            }
          }
        };
      case CASTFORM_SUNNY_FORM_51:
        return basic (this, hp:HP070, type:R, retreatCost:1) {
          weakness W, '+10'
          pokePower "Temperament", {
            text "Once during your turn (before your attack), you may search your deck for any Castform and switch it with Castform Sunny Form. (Any cards attached to Castform Sunny Form, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) Shuffle Castform Sunny Form back into your deck. You can't use more than 1 Temperament Poké-Power each turn."
            actionA {
              assert bg.em().retrieveObject("Temperament") != bg.turnCount : "You can’t use more than 1 Temperament Poké-Power each turn"
              checkLastTurn()
              assert my.deck : "Deck is empty"
              bg.em().storeObject("Temperament", bg.turnCount)
              powerUsed()

              def selected = my.deck.search(max:1,"Select a Castform",{it.name.contains("Castform")})
              if (selected) {
                def tpc = self.topPokemonCard
                selected.moveTo(suppressLog: true, self.cards)
                tpc.moveTo(suppressLog: true, my.deck)
                bc "${tpc.name} was swapped with ${selected.name}."
                new CheckAbilities().run(bg)
                checkFaint()
              }
              shuffleDeck()
            }
          }
          move "Ember", {
            text "40 damage. Discard a [R] Energy attached to Castform Sunny Form."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 40
              discardSelfEnergyAfterDamage R
            }
          }
        };
      case DRAGONAIR_52:
        return evolution (this, from:"Dratini", hp:HP070, type:C, retreatCost:1) {
          weakness C, '+20'
          move "Wrap", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }
          move "Rising Lunge", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 20 more damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                damage 20
              }
            }
          }
        };
      case DRIFBLIM_53:
        return evolution (this, from:"Drifloon", hp:HP090, type:P, retreatCost:0) {
          weakness D, '+20'
          resistance C, MINUS20
          move "Expand", {
            text "30 damage. During your opponent's next turn, any damage done to Drifblim by attacks is reduced by 10 (after applying Weakness and Resistance)."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 30
              reduceDamageNextTurn(hp(10), thisMove)
            }
          }
          move "Whirlwind", {
            text "60 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              afterDamage {
                whirlwind()
              }
            }
          }
        };
      case EXEGGUTOR_54:
        return evolution (this, from:"Exeggcute", hp:HP080, type:P, retreatCost:1) {
          weakness P, '+20'
          move "Psychic Strategy", {
            text "Each player counts the number of cards in his or her opponent's hand. Each player shuffles his or her hand into his or her deck. Then, each player draws a number of cards equal to the number of cards his or her opponent had."
            attackRequirement {}
            onAttack {
              def toDraw = opp.hand.size()
              def oppToDraw = my.hand.size()

              if (my.hand) {
                my.hand.moveTo(hidden:true, my.deck)
                shuffleDeck()
              }
              draw toDraw

              if (opp.hand) {
                opp.hand.moveTo(hidden:true, my.deck)
                shuffleDeck(null, TargetPlayer.OPPONENT)
              }
              draw oppToDraw, TargetPlayer.OPPONENT
            }
          }
          move "Super Eggsplosion", {
            text "50x damage. Discard as many Energy cards as you like attached to your Pokémon. For each Energy card you discarded, flip a coin. This attack does 50 damage times the number of heads."
            energyCost P
            attackRequirement {}
            onAttack {
              def toBeDiscarded = new CardList()
              while(true) {
                def pl = my.all.findAll {
                  it.cards.filterByType(ENERGY).any { energy -> !toBeDiscarded.contains(energy) }
                }
                if (!pl) break;

                def info = "Current number of energy cards to discard + ${toBeDiscarded.size()}\n. Discard an Energy card from which Pokémon? (cancel to stop)"
                def src = pl.select(info, false)
                if (!src) break;

                def selection = src.cards.filterByType(ENERGY).findAll{!toBeDiscarded.contains(it)}.select("Card to discard")
                toBeDiscarded.addAll(selection)
              }
              flip toBeDiscarded.size(), { damage 50 }
              afterDamage { toBeDiscarded.discard() }
            }
          }
        };
      case GLISCOR_55:
        return evolution (this, from:"Gligar", hp:HP090, type:F, retreatCost:1) {
          weakness W, '+20'
          resistance F, MINUS20
          move "Poison Jab", {
            text "20 damage. The Defending Pokémon is now Poisoned."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage POISONED
            }
          }
          move "Sharp Tail", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 40 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip { damage 40 }
            }
          }
        };
      case GRUMPIG_56:
        return evolution (this, from:"Spoink", hp:HP090, type:P, retreatCost:2) {
          weakness P, '+20'
          move "Magical Step", {
            text "The Defending Pokémon is now Confused. Put 6 damage counters instead of 3 on the Confused Pokémon."
            attackRequirement {}
            onAttack {
              // TODO create GET_CONFUSED_DAMAGE static

//              def magicalStepRecipient = opp.active
//              apply CONFUSED, magicalStepRecipient, SRC_ABILITY
//              delayed {
//                def eff
//                register {
//                  eff = getter (GET_CONFUSED_DAMAGE) {h->
//                    if (h.effect.target == magicalStepRecipient && h.effect.target.active && h.object < hp(30)) {
//                      bc "Magical Step increases confused damage on $magicalStepRecipient to 60."
//                      h.object = hp(60)
//                    }
//                  }
//                }
//                unregister {
//                  eff.unregister()
//                }
//
//                after CLEAR_SPECIAL_CONDITION, magicalStepRecipient, {
//                  if(ef.types.contains(CONFUSED)){
//                    unregister()
//                  }
//                }
//              }
            }
          }
          move "Grind", {
            text "20x damage. Does 20 damage times the amount of Energy attached to Grumpig."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20 * self.cards.energyCount(C)
            }
          }
        };
      case HOUNDOOM_57:
        return evolution (this, from:"Houndour", hp:HP080, type:R, retreatCost:1) {
          weakness W, '+20'
          pokeBody "Revenge Fang", {
            text "If you have less Benched Pokémon than your opponent, each of Houndoom's attacks does 40 more damage to the Active Pokémon (before applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if (it.from == self && it.to.active && it.to.owner != self.owner && it.dmg.value && my.bench.size() < opp.bench.size()) {
                    bc "Revenge Fang +40"
                    it.dmg += hp(40)
                  }
                }
              }
            }
          }
          move "Burning Sensation", {
            text "20 damage. If the Defending Pokémon already has any damage counters on it, the Defending Pokémon is now Burned."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
              if (defending.numberOfDamageCounters) {
                applyAfterDamage BURNED
              }
            }
          }
          move "Bright Flame", {
            text "60 damage. Flip a coin. If tails, discard 2 [R] Energy attached to Houndoom."
            energyCost R, R
            attackRequirement {}
            onAttack {
              damage 60
              flip 1, {}, { discardSelfEnergyAfterDamage R, R }
            }
          }
        };
      case LANTURN_58:
        return evolution (this, from:"Chinchou", hp:HP090, type:W, retreatCost:1) {
          weakness G, '+20'
          move "Strong Current", {
            text "20 damage. Move an Energy card attached to the Defending Pokémon to another of your opponent's Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              afterDamage { moveEnergy(defending, opp.bench) }
            }
          }
          move "Confuse Ray", {
            text "40 damage. The Defending Pokémon is now Confused."
            energyCost W, L
            attackRequirement {}
            onAttack {
              damage 40
              applyAfterDamage CONFUSED
            }
          }
        };
      case LANTURN_59:
        return evolution (this, from:"Chinchou", hp:HP090, type:L, retreatCost:2) {
          weakness F, '+20'
          move "Energy Split", {
            text "This attack does 30 damage to each of your opponent's Pokémon that has any Energy cards attached to it. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L
            attackRequirement {}
            onAttack {
              opp.all.each {
                if (it.cards.filterByType(ENERGY)) {
                  damage 30, it
                }
              }
            }
          }
          move "Aqua Bolt", {
            text "60+ damage. Does 60 damage plus 10 more damage for each [W] Energy attached to Lanturn."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 60 + 10 * self.cards.energyCount(W)
            }
          }
        };
      case LEDIAN_60:
        return evolution (this, from:"Ledyba", hp:HP080, type:G, retreatCost:1) {
          weakness R, '+20'
          resistance F, MINUS20
          move "Comet Punch", {
            text "20x damage. Flip 4 coins. This attack does 20 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 4, { damage 20 }
            }
          }
          move "Baton Pass", {
            text "50 damage. You may switch Ledian with 1 of your Benched Pokémon. If you do, move as many Energy cards attached to Ledian as you like to the new Active Pokémon."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 50
              afterDamage {
                if (my.bench && confirm("You may switch $self with a Benched Pokémon. If you do, move as many Energy cards attached to $self as you like to the new Active Pokémon.")) {
                  def pcs = my.bench.select("Which Benched Pokémon to switch with?")

                  self.cards.select(min:0, max:self.cards.filterByType(ENERGY).size(), "Move any number of Energy cards to $pcs", cardTypeFilter(ENERGY)).each {
                    energySwitch(self, pcs, it)
                  }
                  sw2(pcs)
                }
              }
            }
          }
        };
      case LUCARIO_61:
        return evolution (this, from:"Riolu", hp:HP090, type:F, retreatCost:1) {
          weakness P, '+20'
          move "Focus Blast", {
            text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F
            attackRequirement {}
            onAttack {
              damage 30, opp.all.select("Deal damage to?")
            }
          }
          move "Spike Lariat", {
            text "60+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 60 damage plus 20 more damage."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 60
              if (defending.numberOfDamageCounters) {
                damage 20
              }
            }
          }
        };
      case LUXIO_62:
        return evolution (this, from:"Shinx", hp:HP080, type:L, retreatCost:1) {
          weakness F, '+20'
          resistance M, MINUS20
          move "Spark", {
            text "30 damage. Does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 30
              if (opp.bench) {
                damage 10, opp.bench.select("Deal damage to?")
              }
            }
          }
          move "Thunderous Claw", {
            text "70 damage. Flip a coin. If tails, discard all [L] Energy attached to Luxio."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 70
              afterDamage {
                flip 1, {}, {
                  discardAllSelfEnergy(L)
                }
              }
            }
          }
        };
      case MAROWAK_63:
        return evolution (this, from:"Cubone", hp:HP090, type:F, retreatCost:2) {
          weakness W, '+20'
          resistance L, MINUS20
          move "Heavy Bone", {
            text "40 damage. Flip a coin. If tails, Marowak can't use Heavy Bone during your next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 40
              flip 1, {}, {
                cantUseAttack(thisMove, self)
              }
            }
          }
          move "Bone Rush", {
            text "50x damage. Flip a coin until you get tails. This attack does 50 damage times the number of heads."
            energyCost F, F
            attackRequirement {}
            onAttack {
              flipUntilTails {
                damage 50
              }
            }
          }
        };
      case METANG_64:
        return evolution (this, from:"Beldum", hp:HP080, type:M, retreatCost:2) {
          weakness R, '+20'
          resistance P, MINUS20
          move "Agility", {
            text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Metang during your opponent's next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { preventAllEffectsNextTurn() }
            }
          }
          move "Metal Claw", {
            text "50 damage."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case METANG_65:
        return evolution (this, from:"Beldum", hp:HP080, type:M, retreatCost:2) {
          weakness R, '+20'
          resistance P, MINUS20
          move "Psyshock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Bullet Punch", {
            text "40+ damage. Flip 2 coins. This attack does 40 damage plus 20 more damage for each heads."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip 2, { damage 20 }
            }
          }
        };
      case MIGHTYENA_66:
        return evolution (this, from:"Poochyena", hp:HP090, type:D, retreatCost:1) {
          weakness F, '+20'
          resistance P, MINUS20
          move "Bite On", {
            text "30 damage. If the Defending Pokémon isn't an Evolved Pokémon, that Pokémon can't attack, retreat, or use any Poké-Powers during your opponent's next turn."
            energyCost D
            attackRequirement {}
            onAttack {
              damage 30

              if (!defending.evolution) {
                cantRetreat(defending)
                cantAttackNextTurn(defending)

                targeted (defending) {
                  bc "During ${opp.owner.getPlayerUsername(bg)}'s next turn, the Defending ${defending} can't attack, retreat or use any Poké-Powers. (This effect can be removed by evolving or benching ${defending}.)"
                  def pcs = defending
                  delayed {
                    def eff
                    register {
                      eff = getter (IS_ABILITY_BLOCKED) { Holder h->
                        if (h.effect.target == defending && h.effect.ability instanceof PokePower) {
                          h.object = true
                        }
                      }
                      new CheckAbilities().run(bg)
                    }
                    unregister{
                      eff.unregister()
                      new CheckAbilities().run(bg)
                    }
                    unregisterAfter 2
                    after FALL_BACK, pcs, {unregister()}
                    after EVOLVE, pcs, {unregister()}
                    after DEVOLVE, pcs, {unregister()}
                  }
                }
              }
            }
          }
          move "Harass", {
            text "10x damage. Does 10 damage times the number of Pokémon you have in play."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10 * my.all.size()
            }
          }
        };
      case NINJASK_67:
        return evolution (this, from:"Nincada", hp:HP080, type:G, retreatCost:0) {
          weakness R, '+20'
          resistance F, MINUS20
          pokePower "Cast-off Shell", {
            text "Once during your turn, when you play Ninjask from your hand to evolve 1 of your Pokémon and if your Bench isn't full, you may put Shedinja onto your Bench as a Basic Pokémon from your hand or your discard pile."
            onActivate { reason->
              if (reason == PLAY_FROM_HAND && my.deck.notEmpty && bench.notFull && confirm("Use Cast-off Shell?")) {
                powerUsed()
                def discardShedinja = my.discard.findAll { it.name == "Shedinja" }
                def handShedinja = my.hand.findAll { it.name == "Shedinja" }
                if (discardShedinja && confirm("Search discard pile for a Shedinja to put onto the bench?")) {
                  def selected = discardShedinja.select("Which to bench?").first()
                  if (selected) {
                    benchPCS(selected)
                  }
                } else if (handShedinja) {
                  def selected = handShedinja.select("Which to bench?").first()
                  if (selected) {
                    benchPCS(selected)
                  }
                }
              }
            }
          }
          move "Chip Off", {
            text "30 damage. If your opponent has 6 or more cards in his or her hand, discard a number of cards without looking until your opponent has 5 cards left in his or her hand."
            energyCost G
            attackRequirement {}
            onAttack {
              while(opp.hand.size() > 5) {
                opp.hand.select(hidden: true, "Opponent's hand, select 1 to discard").discard()
              }
            }
          }
        };
      case PERSIAN_68:
        return evolution (this, from:"Meowth", hp:HP080, type:C, retreatCost:0) {
          weakness F, '+20'
          move "Feint Attack", {
            text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              swiftDamage(30, opp.all.select("Deal damage to?"))
            }
          }
          move "Fasten Claws", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 10 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip { damage 10 }
            }
          }
        };
      case PILOSWINE_69:
        return evolution (this, from:"Swinub", hp:HP100, type:W, retreatCost:3) {
          weakness M, '+20'
          resistance L, MINUS20
          move "Charge Dash", {
            text "30+ damage. You may do 30 damage plus 30 more damage. If you do, Piloswine does 30 damage to itself."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
              if (confirm("Deal 30 more damage by doing 30 damage to Piloswine?")) {
                damage 30
                damage 30, self
              }
            }
          }
          move "Icy Wind", {
            text "60 damage. The Defending Pokémon is now Asleep."
            energyCost W, C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              applyAfterDamage ASLEEP
            }
          }
        };
      case SEADRA_70:
        return evolution (this, from:"Horsea", hp:HP080, type:W, retreatCost:1) {
          weakness L, '+20'
          move "Aqua Pump", {
            text "30+ damage. You may discard up to 2 [W] Energy cards from your hand. If you do, this attack does 30 damage plus 10 more damage for each Energy card you discarded."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 30

              if (my.hand.filterByBasicEnergyType(W)) {
                def toDiscard = my.hand.filterByBasicEnergyType(W).select(min: 0, max: 2, "For each [W] Energy discarded, do +10")
                if (toDiscard) {
                  damage 10 * toDiscard.size()
                }
                afterDamage {
                  if (toDiscard) {
                    toDiscard.discard()
                  }
                }
              }
            }
          }
          move "Waterfall", {
            text "50 damage."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case STARMIE_71:
        return evolution (this, from:"Staryu", hp:HP080, type:W, retreatCost:0) {
          weakness L, '+20'
          move "Star Boomerang", {
            text "30 damage. You may return Starmie and all cards attached to it to your hand."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 30
              if (confirm("Return $self and all cards attached to it to your hand?")) {
                scoopUpPokemon(self, delegate)
              }
            }
          }
          move "Core Flash", {
            text "Choose 1 of your opponent's Pokémon that has any Poké-Powers or Poké-Bodies. This attack does 50 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost P
            attackRequirement {
              assert opp.all.any {
                it.abilities.keySet().find { ability -> ability instanceof PokePower || ability instanceof PokeBody }
              } : "Your opponent has no Pokémon with Poké-Power or Poké-Bodies."
            }
            onAttack {
              def validTargets = opp.all.findAll {
                it.abilities.keySet().find { ability ->
                  ability instanceof PokePower ||
                    ability instanceof PokeBody
                }
              }
              damage 50, validTargets.select(text)
            }
          }
        };
      case SWALOT_72:
        return evolution (this, from:"Gulpin", hp:HP090, type:P, retreatCost:2) {
          weakness P, '+20'
          move "Swallow Up", {
            text "30 damage. Before doing damage, count the remaining HP of the Defending Pokémon and Swalot. If the Defending Pokémon has fewer remaining HP than Swalot's, this attack does 80 damage instead."
            energyCost P, C
            attackRequirement {}
            onAttack {
              if (defending.getRemainingHP() < self.getRemainingHP()) {
                damage 80
              } else {
                damage 30
              }
            }
          }
          move "Gunk Shot", {
            text "60 damage. The Defending Pokémon is now Poisoned."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 60
              applyAfterDamage POISONED
            }
          }
        };
      case SWELLOW_73:
        return evolution (this, from:"Taillow", hp:HP080, type:C, retreatCost:1) {
          weakness L, '+20'
          resistance F, MINUS20
          pokeBody "Big Wing", {
            text "If Swellow has no Energy attached to it, Swellow's Retreat Cost is 0."
            delayedA {
              getterA (GET_RETREAT_COST,BEFORE_LAST ,self) { h->
                if (self.cards.energyCount(C) == 0) {
                  h.object = 0
                }
              }
            }
          }
          move "Mach Descent", {
            text "30 damage. If Swellow was on your Bench this turn, this attack's base damage is 60 instead of 30."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              if (wasSwitchedOutThisTurn(self)) {
                damage 30
              }
            }
          }
        };
      case TAUROS_74:
        return basic (this, hp:HP080, type:C, retreatCost:2) {
          weakness F, '+20'
          move "Herd Charge", {
            text "20x damage. Flip a coin for each Tauros you have in play. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip my.all.findAll{it.name == "Tauros"}.size(), {
                damage 20
              }
            }
          }
          move "Thrash", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage. If tails, Tauros does 10 damage to itself."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip 1, {damage 20}, {damage 10, self}
            }
          }
        };
      case TENTACRUEL_75:
        return evolution (this, from:"Tentacool", hp:HP090, type:W, retreatCost:1) {
          weakness L, '+20'
          move "Tentacle Strike", {
            text "Search your opponent's discard pile for up to 2 Energy cards and attach them to any of your opponent's Pokémon in any way you like. For each Energy card attached in this way, this attack does 20 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            attackRequirement {}
            onAttack {
              if (opp.discard.filterByType(ENERGY)) {
                def energies = opp.discard.filterByType(ENERGY).select(min:0, max: 2, "Select up to 2 Energy Cards to attach")

                energies.each {
                  def target = opp.all.select("Attach to?")
                  attachEnergy(target, it)
                  damage 20, target
                }
              }
            }
          }
          move "Dangerous Poison", {
            text "60 damage. If Tentacruel has less Energy attached to it than the Defending Pokémon, the Defending Pokémon is now Paralyzed and Poisoned."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 60
              if (self.cards.energyCount(C) < defending.cards.energyCount(C)) {
                applyAfterDamage PARALYZED
                applyAfterDamage POISONED
              }
            }
          }
        };
      case UNOWN_J_76:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P, '+10'
          pokePower "JUNK", {
            text "Once during your turn, when you put Unown J from your hand onto your Bench, you may flip a coin. If heads, search your discard pile for a Trainer card, show it to your opponent, and put it into your hand."
            onActivate { r->
              if (r == PLAY_FROM_HAND && bg.currentTurn == self.owner && my.discard.filterByType(TRAINER) && confirm("Use $thisAbility?")) {
                powerUsed()
                flip {
                  my.discard.filterByType(TRAINER).select(max:1, "Select a Trainer card").moveTo(my.hand)
                }
              }
            }
          }
          move "Hidden Power", {
            text "10 damage. Remove the Special Condition Asleep from the Defending Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage {
                clearSpecialCondition(defending, ATTACK, [ASLEEP])
              }
            }
          }
        };
      case UNOWN_R_77:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness P, '+10'
          pokePower "RETIRE", {
            text "Once during your turn, if Unown R is on your Bench, you may discard Unown R and all cards attached to it. (This doesn't count as a Knocked Out Pokémon.) Then, draw a card."
            actionA {
              assert self.benched : "$self is not on the Bench"
              powerUsed()
              draw 1
              self.cards.discard()
              removePCS(self)
            }
          }
          move "Hidden Power", {
            text "Move any number of basic Energy cards attached to your Pokémon to your other Pokémon in any way you like."
            attackRequirement {}
            onAttack {
              while(1) {
                def pl = (my.all.findAll { it.cards.filterByType(BASIC_ENERGY) })
                if (!pl) break;
                def src = pl.select("Source for energy (cancel to stop)", false)
                if (!src) break;
                def card = src.cards.select("Card to move", cardTypeFilter(BASIC_ENERGY)).first()

                def tar = my.all.select("Target for energy (cancel to stop)", false)
                if (!tar) break;
                energySwitch(src, tar, card)
              }
            }
          }
        };
      case UNOWN_U_78:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P, '+10'
          pokeBody "UNSEEN", {
            text "As long as Unown U is on your Bench, prevent all effects of attacks, including damage, done by your opponent's Pokémon to any Unown on your Bench."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (it.to.owner==self.owner && self.benched && it.to.name.contains("Unown") && it.dmg.value) {
                    bc "UNSEEN prevents damage"
                    it.dmg = hp(0)
                  }
                }
              }
              before null, null, Source.ATTACK, {
                def pcs = (ef as TargetedEffect).getResolvedTarget(bg, e)
                if (bg.currentTurn == self.owner.opposite && ef.effectType != DAMAGE && pcs && pcs.owner == self.owner && self.benched && pcs.topPokemonCard.name == "Unown") {
                  bc "UNSEEN prevents effect"
                  prevent()
                }
              }
            }
          }
          move "Hidden Power", {
            text "Search your deck for any 1 card and discard it. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Deck is empty"
            }
            onAttack {
              deck.select(max: 1, "Discard").discard()
              shuffleDeck()
            }
          }
        };
      case UNOWN_V_79:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness P, '+10'
          pokePower "VACATION", {
            text "Once during your turn (before your attack), you may remove 2 damage counters from each of your Pokémon. If you do, your turn ends. This power can't be used if Unown V is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              powerUsed()
              my.all.each {
                heal 20, it
              }
              bg.gm().betweenTurns()
            }
          }
          move "Hidden Power", {
            text "30 damage. Does 10 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost P
            attackRequirement {}
            onAttack {
              damage 30
              my.bench.each {
                damage 10, it
              }
            }
          }
        };
      case UNOWN_W_80:
        return basic (this, hp:HP090, type:P, retreatCost:3) {
          weakness P, '+30'
          pokeBody "WALL", {
            text "As long as Unown W is your Active Pokémon, any damage done to your Pokémon by an opponent's attack is reduced by 10 (after applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if (self.active && it.to.owner == self.owner && it.dmg.value && it.notNoEffect) {
                    bc "Wall -10"
                    it.dmg -= hp(10)
                  }
                }
              }
            }
          }
          move "Hidden Power", {
            text "50 damage. Draw a card."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 50
              draw 1
            }
          }
        };
      case UNOWN_Y_81:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P, '+10'
          pokePower "YAWN", {
            text "Once during your turn (before your attack), if Unown Y is on your Bench, you may remove 1 damage counter from 1 of your Active Unown and that Unown is now Asleep."
            actionA {
              checkLastTurn()
              assert self.benched : "Unown Y not benched"
              powerUsed()
              heal 10, my.active
              apply ASLEEP, self
            }
          }
          move "Hidden Power", {
            text "Search your deck for up to 2 Trainer cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
            energyCost C, C
            attackRequirement {
              assert my.deck : "Deck is empty"
            }
            onAttack {
              deck.search(max:2, cardTypeFilter(TRAINER)).moveTo(hand)
              shuffleDeck()
            }
          }
        };
      case UNOWN_QUESTION_MARK_82:
        return basic (this, hp:HP070, type:P, retreatCost:1) {
          weakness P, '+10'
          pokePower "?", {
            text "Once during your turn (before your attack), if Unown ? is on your Bench, you may choose a Pokémon in your hand and put it face down. Your opponent guesses a type of that Pokémon. Reveal that card. If your opponent guessed wrong, draw a card. Then, put that card back into your hand."
            actionA {
              assert self.benched : "Unown ? is not on your Bench"
              assert my.hand.filterByType(POKEMON) : "No Pokémon in your hand"
              checkLastTurn()
              powerUsed()

              def myCard = my.hand.filterByType(POKEMON).select("Select a Pokémon for your opponent to guess.")

              def choices = [COLORLESS, FIRE, FIGHTING, GRASS, WATER, PSYCHIC, LIGHTNING, METAL, DARKNESS, FAIRY, DRAGON]
              def types = ['Colorless', 'Fire', 'Fighting', 'Grass', 'Water', 'Psychic', 'Lightning', 'Metal', 'Darkness', 'Fairy', 'Dragon']
              def opponentChoice = oppChoose(choices, types, "Guess the type of Pokémon your opponent has chosen")

              myCard.showToOpponent("Your Opponent's chosen card.")
              if (!myCard.cardTypes.contains(opponentChoice)) {
                bc "Hidden Power - The correct type was guessed."
                draw 1
              } else {
                bc "Hidden Power - The wrong type was guessed"
              }
            }
          }
          move "Hidden Power", {
            text "Discard up to 2 cards from your hand. For each card you discarded, draw a card."
            attackRequirement {
              def hand = my.hand.getExcludedList(thisCard).size() >= 1
              assert (hand || my.deck) : "Not enough cards in your hand or your deck is empty."
            }
            onAttack {
              def num = my.hand.getExcludedList(thisCard).select(min: 1, max:2, "Discard up to 2 cards and draw twice as many").discard().size()
              draw num
            }
          }
        };
      case BELDUM_83:
        return basic (this, hp:HP050, type:M, retreatCost:2) {
          weakness R, '+10'
          resistance P, MINUS20
          pokePower "Metal Chain", {
            text "Once during your turn (before your attack), when you attach a [M] Energy card from your hand to Beldum (excluding effects of attacks or Poké-Powers), you may search your deck for Beldum and put it onto your Bench. Shuffle your deck afterward. This power can't be used if Beldum is affected by a Special Condition."
            delayedA {
              before ATTACH_ENERGY, {
                if (ef.reason == PLAY_FROM_HAND && ef.card.asEnergyCard().containsType(M) && bg.currentTurn == self.owner && ef.resolvedTarget == self && self.noSPC() && confirm("Use Metal Chain?")) {
                  checkLastTurn()
                  assert my.bench.notFull : "Bench full"
                  assert deck.notEmpty : "Deck is empty"
                  powerUsed()
                  deck.search({Card c -> c.name == "Beldum" && c.cardTypes.is(POKEMON)}).each {
                    benchPCS(it)
                  }
                  shuffleDeck()
                }
              }
            }
          }
          move "Take Down", {
            text "30 damage. Beldum does 10 damage to itself."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 30
              damage 10, self
            }
          }
        };
      case BELDUM_84:
        return basic (this, hp:HP050, type:M, retreatCost:1) {
          weakness R, '+10'
          resistance P, MINUS20
          move "Allure", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Tackle", {
            text "20 damage."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case BELLSPROUT_85:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R, '+10'
          move "Vine Bind", {
            text "Flip a coin. If heads, the Defending Pokémon can't use any Poké-Powers during your opponent's next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                delayed {
                  def eff
                  register {
                    eff = getter (IS_ABILITY_BLOCKED) { Holder h ->
                      if (h.effect.target == defending && h.effect.ability instanceof PokePower) {
                        h.object=true
                      }
                    }
                    new CheckAbilities().run(bg)
                  }
                  unregister{
                    eff.unregister()
                    new CheckAbilities().run(bg)
                  }
                  unregisterAfter 2
                  after SWITCH, defending, {unregister()}
                  after EVOLVE, defending, {unregister()}
                  after DEVOLVE, defending, {unregister()}
                }
              }
            }
          }
          move "Careless Tackle", {
            text "20 damage. Bellsprout does 10 damage to itself."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
              damage 10, self
            }
          }
        };
      case BUNEARY_86:
        return basic (this, hp:HP050, type:C, retreatCost:1) {
          weakness F, '+10'
          move "Rest", {
            text "Remove all Special Conditions and 4 damage counters from Buneary. Buneary is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              healAll self
              clearSpecialCondition(self)
              apply ASLEEP, self
            }
          }
          move "Double Kick", {
            text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 2, { damage 20 }
            }
          }
        };
      case CHINCHOU_87:
        return basic (this, hp:HP060, type:W, retreatCost:2) {
          weakness G, '+10'
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {
              flipThenApplySC(CONFUSED)
            }
          }
          move "Wave Splash", {
            text "10 damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case CHINCHOU_88:
        return basic (this, hp:HP050, type:L, retreatCost:1) {
          weakness F, '+10'
          move "Razor Fin", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Aqua Spark", {
            text "20+ damage. If Chinchou has any [W] Energy attached to it, this attack does 20 damage plus 10 more damage."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
              if (self.cards.energyCount(W)) damage 10
            }
          }
        };
      case CORPHISH_89:
        return basic (this, hp:HP050, type:W, retreatCost:1) {
          weakness L, '+10'
          move "Knock Off", {
            text "Flip a coin. If heads, choose 1 card from your opponent's hand without looking and discard it."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                discardRandomCardFromOpponentsHand()
              }
            }
          }
          move "Irongrip", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case CUBONE_90:
        return basic (this, hp:HP060, type:F, retreatCost:1) {
          weakness W, '+10'
          resistance L, MINUS20
          move "Headbutt", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Bonemerang", {
            text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost F, C
            attackRequirement {}
            onAttack {
              flip 2, { damage 20 }
            }
          }
        };
      case DRATINI_91:
        return basic (this, hp:HP040, type:C, retreatCost:1) {
          weakness C, '+10'
          move "Tail Slap", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Slam", {
            text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 2, { damage 20 }
            }
          }
        };
      case DRIFLOON_92:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness D, '+10'
          resistance C, MINUS20
          move "Mind Bend", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              flip { applyAfterDamage CONFUSED }
            }
          }
          move "Gust", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case EXEGGCUTE_93:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P, '+10'
          move "Call for Family", {
            text "Search your deck for up to 2 in any combination of Grass Basic Pokémon and Psychic Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily([basic:true, type:[G, P]], 2, delegate)
          }
          move "Hypnosis", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage ASLEEP
            }
          }
        };
      case GLIGAR_94:
        return basic (this, hp:HP060, type:F, retreatCost:1) {
          weakness W, '+10'
          resistance F, MINUS20
          move "Light Poison", {
            text "10 damage. Flip a coin. If tails, this attack does nothing. If heads, the Defending Pokémon is now Poisoned."
            attackRequirement {}
            onAttack {
              flip {
                damage 10
                applyAfterDamage POISONED
              }
            }
          }
          move "Jump On", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 10 }
            }
          }
        };
      case GLIGAR_95:
        return basic (this, hp:HP050, type:F, retreatCost:1) {
          weakness W, '+10'
          resistance F, MINUS20
          move "Poison Sting", {
            text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost C
            attackRequirement {}
            onAttack {
              flip { apply POISONED }
            }
          }
          move "Slash", {
            text "20 damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case GLOOM_96:
        return evolution (this, from:"Oddish", hp:HP070, type:G, retreatCost:1) {
          weakness R, '+20'
          move "Sleep Powder", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage ASLEEP
            }
          }
          move "Frustration", {
            text "Choose 1 of your opponent's Pokémon that doesn't have any damage counters on it. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost G, C
            attackRequirement {
              assert opp.all.findAll{!it.numberOfDamageCounters} : "Opponent has no undamaged Pokémon"
            }
            onAttack {
              damage 30, opp.all.findAll {
                !it.numberOfDamageCounters
              }.select("Deal 30 damage to which Pokémon?")
            }
          }
        };
      case GLOOM_97:
        return evolution (this, from:"Oddish", hp:HP080, type:P, retreatCost:2) {
          weakness P, '+20'
          move "Space Out", {
            text "Remove 2 damage counters from Gloom. Gloom is now Asleep."
            attackRequirement {}
            onAttack {
              heal 20, self
              apply ASLEEP, self
            }
          }
          move "Stinky Nectar", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and Poisoned."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                applyAfterDamage CONFUSED
                applyAfterDamage POISONED
              }
            }
          }
        };
      case GULPIN_98:
        return basic (this, hp:HP060, type:P, retreatCost:2) {
          weakness P, '+10'
          move "Amnesia", {
            text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              amnesia delegate
            }
          }
          move "Gastro Acid", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost P
            attackRequirement {}
            onAttack {
              flip { apply PARALYZED }
            }
          }
        };
      case HITMONCHAN_99:
        return basic (this, hp:HP070, type:F, retreatCost:1) {
          weakness P, '+20'
          move "Counter Punch", {
            text "During your opponent's next turn, if Hitmonchan is damaged by an opponent's attack (even if Hitmonchan is Knocked Out), put 4 damage counters on the Attacking Pokémon."
            energyCost F
            attackRequirement {}
            onAttack {
              ifDamagedByAttackNextTurn(delegate) {
                bc "Counter Punch activates"
                directDamage(40, ef.attacker as PokemonCardSet)
              }
            }
          }
          move "Gut Strike", {
            text "30 damage. If Tyrogue is anywhere under Hitmonchan, this attack's base damage is 60 instead of 30."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
              if (self.getPokemonCards().findAll { it.name == "Tyrogue" }){
                damage 30
              }
            }
          }
        };
      case HITMONLEE_100:
        return basic (this, hp:HP080, type:F, retreatCost:1) {
          weakness P, '+20'
          move "Gut Kick", {
            text "30 damage. If Tyrogue is anywhere under Hitmonlee, you may do 30 damage to any 1 Benched Pokémon instead. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, C
            attackRequirement {}
            onAttack {
              if (self.getPokemonCards().findAll { it.name == "Tyrogue" } && opp.bench && confirm("Deal damage to Benched Pokémon instead?")) {
                damage 30, opp.bench.select("Deal damage to?")
              } else {
                damage 30
              }
            }
          }
          move "Mega Kick", {
            text "60 damage."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
        };
      case HITMONTOP_101:
        return basic (this, hp:HP080, type:F, retreatCost:1) {
          weakness P, '+20'
          move "Triple Kick", {
            text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads."
            energyCost F, C
            attackRequirement {}
            onAttack {
              flip 3, { damage 20 }
            }
          }
          move "Gut Spin", {
            text "50 damage. If Tyrogue is anywhere under Hitmontop, you may switch Hitmontop with 1 of your Benched Pokémon."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 50
              if (self.getPokemonCards().findAll { it.name == "Tyrogue" }){
                switchYourActive(may: true)
              }
            }
          }
        };
      case HORSEA_102:
        return basic (this, hp:HP050, type:W, retreatCost:1) {
          weakness L, '+10'
          move "Smokescreen", {
            text "If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              sandAttack(thisMove)
            }
          }
          move "Reverse Thrust", {
            text "10 damage. Switch Horsea with 1 of your Benched Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              switchYourActive()
            }
          }
        };
      case HOUNDOUR_103:
        return basic (this, hp:HP050, type:D, retreatCost:1) {
          weakness W, '+10'
          resistance P, MINUS20
          move "Roar", {
            text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              whirlwind()
            }
          }
          move "Bite", {
            text "10 damage."
            energyCost D
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case LEDYBA_104:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R, '+10'
          resistance F, MINUS20
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {
              flip { apply CONFUSED }
            }
          }
          move "Double-edge", {
            text "30 damage. Ledyba does 10 damage to itself."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 30
              damage 10, self
            }
          }
        };
      case LILEEP_105:
        return evolution (this, from:"Root Fossil", hp:HP080, type:G, retreatCost:2) {
          weakness R, '+20'
          move "Astonish", {
            text "20 damage. Choose 1 card from your opponent's hand without looking. Look at that card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
              afterDamage {
                astonish()
              }
            }
          }
          move "Absorb", {
            text "30 damage. Remove 2 damage counters from Lileep."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 30
              heal 20, self
            }
          }
        };
      case MEOWTH_106:
        return basic (this, hp:HP050, type:C, retreatCost:1) {
          weakness F, '+10'
          move "Pay Day", {
            text "10 damage. Flip a coin. If heads, draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip { draw 1 }
            }
          }
          move "Fury Swipes", {
            text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 3, { damage 10 }
            }
          }
        };
      case MISDREAVUS_107:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness D, '+10'
          resistance C, MINUS20
          move "Show Off", {
            text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            attackRequirement {
              assert my.deck.notEmpty : "Deck is empty"
            }
            onAttack {
              my.deck.search(max: 1, cardTypeFilter(BASIC_ENERGY)).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Payback", {
            text "10+ damage. If your opponent has only 1 Prize card left, this attack does 10 damage plus 20 more damage."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              if (opp.prizeCardSet.size() == 1) {
                damage 20
              }
            }
          }
        };
      case NINCADA_108:
        return basic (this, hp:HP040, type:G, retreatCost:1) {
          weakness R, '+10'
          move "Scratch", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Big Bite", {
            text "The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost G
            attackRequirement {}
            onAttack {
              cantRetreat(defending)
            }
          }
        };
      case NOSEPASS_109:
        return basic (this, hp:HP070, type:F, retreatCost:1) {
          weakness W, '+20'
          move "Sharpen", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Nose Poke", {
            text "20+ damage. If Probopass is on your Bench, this attack does 20 damage plus 20 more damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
              if (my.bench.find { it.name == "Probopass" }) damage 20
            }
          }
        };
      case NUMEL_110:
        return basic (this, hp:HP060, type:R, retreatCost:2) {
          weakness W, '+10'
          move "Rollout", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Singe", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                applyAfterDamage BURNED
              }
            }
          }
        };
      case ODDISH_111:
        return basic (this, hp:HP040, type:G, retreatCost:1) {
          weakness R, '+10'
          move "Stun Spore", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              flip { apply PARALYZED }
            }
          }
          move "Blot", {
            text "10 damage. Remove 1 damage counter from Oddish."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              heal 10, self
            }
          }
        };
      case ODDISH_112:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P, '+10'
          move "Poisonpowder", {
            text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost C
            attackRequirement {}
            onAttack {
              flip { apply POISONED }
            }
          }
          move "Ram", {
            text "20 damage."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case PINECO_113:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R, '+10'
          move "Tackle", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Selfdestruct", {
            text "40 damage. This attack does 10 damage to each Benched Pokémon (both yours and your opponent's). (Don't apply Weakness and Resistance for Benched Pokémon.) Pineco does 50 damage to itself."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 40
              my.bench.each {
                damage 10, it
              }
              opp.bench.each {
                damage 10, it
              }
              damage 50, self
            }
          }
        };
      case POLIWAG_114:
        return basic (this, hp:HP040, type:W, retreatCost:1) {
          weakness L, '+10'
          move "Tackle", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Twiddle", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, the Defending Pokémon is now Asleep."
            energyCost W
            attackRequirement {}
            onAttack {
              flip 1, {
                apply CONFUSED
              }, {
                apply ASLEEP
              }
            }
          }
        };
      case POLIWHIRL_115:
        return evolution (this, from:"Poliwag", hp:HP080, type:W, retreatCost:1) {
          weakness L, '+20'
          move "Light Punch", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Bubblebeam", {
            text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
        };
      case POOCHYENA_116:
        return basic (this, hp:HP050, type:D, retreatCost:1) {
          weakness F, '+10'
          resistance P, MINUS20
          move "Corner", {
            text "The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost D
            attackRequirement {}
            onAttack {
              cantRetreat(defending)
            }
          }
          move "Ambush", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 20 }
            }
          }
        };
      case RIOLU_117:
        return basic (this, hp:HP060, type:F, retreatCost:1) {
          weakness P, '+10'
          move "Punch", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Low Kick", {
            text "30 damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case SHINX_118:
        return basic (this, hp:HP050, type:L, retreatCost:1) {
          weakness F, '+10'
          resistance M, MINUS20
          move "Recharge", {
            text "Search your deck for a [L] Energy card and attach it to Shinx. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Deck is empty"
            }
            onAttack {
              attachEnergyFrom(type: L, my.deck, self)
            }
          }
          move "Double Kick", {
            text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost L, C
            attackRequirement {}
            onAttack {
              flip 2, {
                damage 20
              }
            }
          }
        };
      case SKITTY_119:
        return basic (this, hp:HP050, type:C, retreatCost:1) {
          weakness F, '+10'
          move "Growl", {
            text "During your opponent's next turn, any damage done by attacks from the Defending Pokémon is reduced by 20 (before applying Weakness and Resistance)."
            energyCost C
            attackRequirement {}
            onAttack {
              reduceDamageFromDefendingNextTurn hp(20), thisMove, defending
            }
          }
          move "Scratch", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case SNEASEL_120:
        return basic (this, hp:HP060, type:D, retreatCost:1) {
          weakness F, '+10'
          resistance P, MINUS20
          move "Rob", {
            text "Look at your opponent's hand. If your opponent has any Pokémon Tool or Technical Machine cards in his or her hand, put those cards on top of his or her deck. Your opponent shuffles his or her deck afterward."
            energyCost D
            attackRequirement {}
            onAttack {
              opp.hand.showToMe("Opponent's hand")
              if (opp.hand.filterByType(POKEMON_TOOL, TECHNICAL_MACHINE)) {
                opp.hand.filterByType(POKEMON_TOOL, TECHNICAL_MACHINE).moveTo(opp.deck)
                shuffleDeck(null, TargetPlayer.OPPONENT)
              }
            }
          }
          move "Slash", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case SPOINK_121:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P, '+10'
          move "Psybeam", {
            text "The Defending Pokémon is now Confused."
            energyCost P
            attackRequirement {}
            onAttack {
              apply CONFUSED
            }
          }
          move "Bounce", {
            text "20 damage. You may switch Spoink with 1 of your Benched Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              switchYourActive(may: true)
            }
          }
        };
      case STARYU_122:
        return basic (this, hp:HP050, type:W, retreatCost:1) {
          weakness L, '+10'
          move "Recover", {
            text "Discard an Energy attached to Staryu and remove 3 damage counters from Staryu."
            energyCost C
            attackRequirement {
              assert self.numberOfDamageCounters || self.energyCards : "$self is healthy or has no Energy attached"
            }
            onAttack {
              discardSelfEnergy C
              heal 30, self
            }
          }
          move "Spinning Attack", {
            text "20 damage."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case SWINUB_123:
        return basic (this, hp:HP060, type:W, retreatCost:2) {
          weakness M, '+10'
          resistance L, MINUS20
          move "Sniff Out", {
            text "Flip a coin. If heads, put any 1 card from your discard pile into your hand."
            energyCost C
            attackRequirement {
              assert my.discard : "Discard pile is empty"
            }
            onAttack {
              flip {
                my.discard.select("Select 1 card to put into your hand.").moveTo(my.hand)
              }
            }
          }
          move "Lunge Out", {
            text "30 damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case TAILLOW_124:
        return basic (this, hp:HP050, type:C, retreatCost:1) {
          weakness L, '+10'
          resistance F, MINUS20
          move "Focus Energy", {
            text "During your next turn, Taillow's Peck attack's base damage is 30."
            energyCost C
            attackRequirement {}
            onAttack {
              increasedBaseDamageNextTurn("Peck", hp(20))
            }
          }
          move "Peck", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case TENTACOOL_125:
        return basic (this, hp:HP050, type:W, retreatCost:1) {
          weakness L, '+10'
          move "Crystal Barrier", {
            text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Tentacool during your opponent's next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              flip { preventAllEffectsNextTurn() }
            }
          }
          move "Mysterious Beam", {
            text "Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              flip { discardDefendingEnergy() }
            }
          }
        };
      case TYROGUE_126:
        return basic (this, hp:HP060, type:F, retreatCost:1) {
          weakness P, '+10'
          pokePower "Baby Evolution", {
            text "Once during your turn (before your attack), you may put Hitmonlee, Hitmonchan, or Hitmontop from your hand onto Tyrogue (this counts as evolving Tyrogue) and remove all damage counters from Tyrogue."
            actionA {
              def eligible = my.hand.findAll {
                it.name.contains("Hitmonlee") || it.name.contains("Hitmonchan") || it.name.contains("Hitmontop")
              }
              assert eligible: "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = eligible.select()
              if (tar) {
                evolve(self, tar.first(), OTHER)
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Gut Blow", {
            text "10+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 10 damage plus 20 more damage and Tyrogue does 10 damage to itself."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 10
              if (defending.evolution) {
                damage 20
                damage 10, self
              }
            }
          }
        };
      case WEEPINBELL_127:
        return evolution (this, from:"Bellsprout", hp:HP080, type:G, retreatCost:2) {
          weakness R, '+20'
          move "Poisonpowder", {
            text "10 damage. The Defending Pokémon is now Poisoned."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage POISONED
            }
          }
          move "Razor Leaf", {
            text "40 damage."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case YANMA_128:
        return basic (this, hp:HP070, type:G, retreatCost:1) {
          weakness L, '+20'
          resistance F, MINUS20
          move "U-turn", {
            text "10 damage. Switch Yanma with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              switchYourActive()
            }
          }
          move "Agility", {
            text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Yanma during your opponent's next turn."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              flip { preventAllEffectsNextTurn() }
            }
          }
        };
      case BUBBLE_COAT_129:
        return pokemonTool (this) {
          text "Attach Bubble Coat to 1 of your Pokémon that doesn't already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card."+
            "As long as Bubble Coat is attached to a Pokémon, that Pokémon has no Weakness. If that Pokémon is damaged by an opponent's attack, discard this card at the end of the turn."
          def effect, effect1, effect2
          onPlay { reason ->
            effect = getter(GET_WEAKNESSES) { h ->
              if (h.effect.target == self) h.object=[]
            }
            effect1 = delayed {
              before BETWEEN_TURNS, {
                if (keyStore("Bubble_Coat", thisCard, null) == bg.turnCount) {
                  discard thisCard
                }
              }
            }
            effect2 = delayed (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if (bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})) {
                  bc "Bubble Coat will be discarded at the end of the turn"
                  keyStore("Bubble_Coat", thisCard, bg.turnCount)
                }
              }
            }
          }
          onRemoveFromPlay {
            effect.unregister()
            effect1.unregister()
            effect2.unregister()
          }
        };
      case BUCK_S_TRAINING_130:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card."+
            "Draw 2 cards. As long as Buck's Training is next to your Active Pokémon, each of your Active Pokémon's attacks does 10 more damage to the Active Pokémon (before applying Weakness and Resistance)."
          onPlay {
            draw 2
            delayed {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if (it.to.active && it.from.owner == thisCard.player && it.to.owner != it.from.owner && it.dmg.value) {
                  bc "Buck's Training +10"
                  it.dmg += hp(10)
                  }
                }
              }
              unregisterAfter 1
            }
          }
          playRequirement{
          }
        };
      case CYNTHIA_S_FEELINGS_131:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card."+
            "Shuffle your hand into your deck. Then, draw 4 cards. If any of your Pokémon were Knocked Out during your opponent's last turn, draw 4 more cards."
          globalAbility { Card thisCard->
            delayed {
              before KNOCKOUT, {
                if (ef.pokemonToBeKnockedOut.owner == thisCard.player && bg.currentTurn == thisCard.player.opposite) {
                  keyStore("Cynthias_Feelings_KO", thisCard, bg.turnCount)
                }
              }
            }
          }
          onPlay {
            shuffleDeck(hand.getExcludedList(thisCard))
            hand.removeAll(hand.getExcludedList(thisCard))
            draw 4
            if (keyStore("Cynthias_Feelings_KO", thisCard, null) == bg.turnCount - 1) {
              draw 4
            }
          }
          playRequirement{
          }
        };
      case ENERGY_PICKUP_132:
        return itemCard (this) {
          text "Flip a coin. If heads, search your discard pile for a basic Energy card and attach it to 1 of your Pokémon."
          onPlay {
            flip {
              attachEnergyFrom(basic:true, my.discard, my.all)
            }
          }
          playRequirement{
            assert my.discard.filterByType(BASIC_ENERGY) : "There are no basic Energy cards in your discard pile"
          }
        };
      case POKE_RADAR_133:
        return itemCard (this) {
          text "Look at the top 5 cards of your deck, choose as many Pokémon as you like, show them to your opponent, and put them into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward."
          onPlay {
            powerUsed()
            my.deck.subList(0,5).select(min:0, "Choose the cards to put in your hand", cardTypeFilter(POKEMON)).moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "Deck is empty"
          }
        };
      case SNOWPOINT_TEMPLE_134:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card."+
            "Each Pokémon that isn't an Evolved Pokémon in play (both yours and your opponent's) gets +20 HP."
          def eff
          onPlay { reason ->
            eff = getter GET_FULL_HP, { h ->
              if (!h.effect.target.evolution) {
                h.object += hp(20)
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case STARK_MOUNTAIN_135:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card."+
            "Once during each player's turn, that player may choose a [R] or [F] Energy attached to 1 of his or her Pokémon and move that Energy to 1 of his or her [R] or [F] Pokémon."
          def lastTurn = 0
          def actions = []
          onPlay {
            actions = action("Stadium: Stark Mountain") {
              assert my.all.find { it.cards.energyCount(R) || it.cards.energyCount(F) } : "There are no [R] or [F] Energy cards attached to your Pokémon"
              assert my.all.findAll { it.types.contains(R) || it.types.contains(F) } : "No [R] or [F] Pokémon to attach to"
              assert lastTurn != bg().turnCount : "Already used"
              bc "Used Stark Mountain effect"
              lastTurn = bg().turnCount

              def src = my.all.findAll { it.cards.energyCount(R) || it.cards.energyCount(F) }.select("Source for the Energy")
              def energy = src.cards.select("Energy to move", {
                it.cardTypes.is(ENERGY) && (it.asEnergyCard().containsType(R) || it.asEnergyCard().containsType(F))
              })
              def tar = my.all.findAll { it.types.contains(R) || it.types.contains(F) }.select("Target for the Energy")
              energySwitch(src, tar, energy)
            }
          }
          onRemoveFromPlay{
            actions.each { bg().gm().unregisterAction(it) }
          }
        };
      case TECHNICAL_MACHINE_TS_1_136:
        return basicTrainer (this) {
          text "Evoluter - Attach this card to 1 of your Pokémon in play. That Pokémon may use this card's attack instead of its own. " + "Search your deck for a card that evolves from 1 of your Pokémon and put it onto that Pokémon. (This counts as evolving that Pokémon.) Shuffle your deck afterward."
          onPlay {
            // TODO
          }
          playRequirement{
          }
        };
      case TECHNICAL_MACHINE_TS_2_137:
        return basicTrainer (this) {
          text "Devoluter - Attach this card to 1 of your Pokémon in play. That Pokémon may use this card's attack instead of its own. " + "Choose 1 of your opponent's Evolved Pokémon (excluding Pokémon LV.X). Remove the highest Stage Evolution card from that Pokémon and put that card back into your opponent's hand.\n"
          onPlay {
            // TODO
          }
          playRequirement{
          }
        };
      case CLAW_FOSSIL_138:
        return copy(LegendMaker.CLAW_FOSSIL_78, this);
      case ROOT_FOSSIL_139:
        return copy(LegendMaker.ROOT_FOSSIL_80, this);
      case AZELF_LV_X_140:
        return levelUp (this, from:"Azelf", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokeBody "Psychic Aura", {
            text "Each of your [P] Pokémon has no Weakness."
            getterA (GET_WEAKNESSES) { h->
              if (h.effect.target.owner == self.owner && h.effect.target.types.contains(P)) {
                def list = h.object as List<Weakness>
                list.clear()
              }
            }
          }
          move "Deep Balance", {
            text "Choose 1 of your opponent's Pokémon. Put 1 damage counter on that Pokémon for each Energy attached to all of your opponent's Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              def tar = opp.all.select("Choose a Pokémon to put damage counters on")
              int count = 0
              opp.all.each {
                count += it.cards.energyCount(C)
              }
              directDamage 10*count, tar
            }
          }
        };
      case GLISCOR_LV_X_141:
        return levelUp (this, from:"Gliscor", hp:HP110, type:F, retreatCost:0) {
          weakness W
          resistance F, MINUS20
          pokePower "Shoot Poison", {
            text "Once during your turn (before your attack), when you put Gliscor LV.X from your hand onto your Active Gliscor, you may choose 1 of the Defending Pokémon. That Pokémon is now Paralyzed and Poisoned."
            onActivate { reason ->
              if (reason == PLAY_FROM_HAND && confirm("Use Shoot Poison?")) {
                powerUsed()
                apply PARALYZED, self.owner.opposite.pbg.active
                apply POISONED, self.owner.opposite.pbg.active
              }
            }
          }
          move "Night Slash", {
            text "60 damage. You may switch Gliscor with 1 of your Benched Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 60
              switchYourActive(may: true)
            }
          }
        };
      case MAGNEZONE_LV_X_142:
        return levelUp (this, from:"Magnezone", hp:HP140, type:M, retreatCost:4) {
          weakness R
          resistance P, MINUS20
          pokePower "Electric Trans", {
            text "As often as you like during your turn (before your attack), you may move a [L] or [M] Energy attached to 1 of your Pokémon to another of your Pokémon. This power can't be used if Magnezone is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert my.all.findAll { it.cards.energyCount(M) > 0 || it.cards.energyCount(L) > 0 } : "No valid Energy cards to move"
              assert my.all.size() >= 2 : "Need at least 2 Pokémon to use"
              powerUsed()
              def src = my.all.findAll { it.cards.energyCount(M) > 0 || it.cards.energyCount(L) > 0 }.select("Source for [M] or [L]")
              def card = src.cards.select("Energy to move", {
                it.cardTypes.is(ENERGY) && (it.asEnergyCard().containsType(M) || it.asEnergyCard().containsType(L))
              }).first()
              def tar = my.all
              tar.remove(src)
              tar = tar.select("Target for [M] or [L]")
              energySwitch(src, tar, card)
            }
          }
          move "Cyber Shock", {
            text "80 damage. Discard a [L] Energy and a [M] Energy attached to Magnezone. The Defending Pokémon is now Paralyzed."
            energyCost L, M
            attackRequirement {}
            onAttack {
              damage 80
              discardSelfEnergyAfterDamage L, M
              applyAfterDamage PARALYZED
            }
          }
        };
      case MESPRIT_LV_X_143:
        return levelUp (this, from:"Mesprit", hp:HP090, type:P, retreatCost:1) {
          weakness P
          move "Healing Look", {
            text "Remove 3 damage counters from each of your Benched Pokémon."
            attackRequirement {
              assert my.bench.findAll { it.numberOfDamageCounters } : "Bench has no damaged Pokémon"
            }
            onAttack {
              my.bench.each {
                heal 30, it
              }
            }
          }
          move "Supreme Blast", {
            text "200 damage. If you don't have Uxie LV.X and Azelf LV.X in play, this attack does nothing. Discard all Energy attached to Mesprit."
            energyCost P, P
            attackRequirement {
              my.all.findAll { it.name == ("Uxie Lv.X") } && my.all.findAll{ it.name == ("Azelf Lv.X") }
            }
            onAttack {
              damage 200
              afterDamage {
                discardAllSelfEnergy()
              }
            }
          }
        };
      case MEWTWO_LV_X_144:
        return levelUp (this, from:"Mewtwo", hp:HP120, type:P, retreatCost:2) {
          weakness P
          pokeBody "Psybarrier", {
            text "Prevent all effects of attacks, including damage, done to Mewtwo by your opponent's Pokémon that isn't an Evolved Pokémon."
            delayedA {
              before null, self, Source.ATTACK, {
                if (self.owner.opposite.pbg.active.evolution && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                  bc "Psybarrier prevents effect"
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (it.to == self && it.notNoEffect && it.from.evolution) {
                    it.dmg = hp(0)
                    bc "Psybarrier prevents damage"
                  }
                }
              }
            }
          }
          move "Giga Burn", {
            text "120 damage. Discard all Energy attached to Mewtwo."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 120
              discardAllSelfEnergy()
            }
          }
        };
      case RHYPERIOR_LV_X_145:
        return levelUp (this, from:"Rhyperior", hp:HP170, type:F, retreatCost:4) {
          weakness W
          resistance L, MINUS20
          move "Hard Crush", {
            text "50x damage. Discard the top 5 cards from your deck. This attack does 50 damage for each Energy card you discarded."
            attackRequirement {}
            onAttack {
              def list = my.deck.subList(0,5).discard()
              def numEnergy = list.filterByType(ENERGY).size()
              damage 50*numEnergy
              bc "Discarded $numEnergy Energy cards"
            }
          }
          move "Upthrow", {
            text "60 damage. Search your discard pile for all [F] Energy cards, show them to your opponent, and shuffle them into your deck."
            energyCost F, F, C
            attackRequirement{}
            onAttack {
              damage 60
              def energies = my.discard.filterByEnergyType(F)
              afterDamage {
                energies.moveTo(my.deck)
                shuffleDeck()
              }
            }
          }
        };
      case UXIE_LV_X_146:
        return levelUp (this, from:"Uxie", hp:HP090, type:P, retreatCost:1) {
          weakness P
          pokePower "Trade Off", {
            text "Once during your turn (before your attack), you may look at the top 2 cards of your deck, choose 1 of them, and put it into your hand. Put the other card on the bottom of your deck. This power can't be used if Uxie is affected by a Special Condition. You can't use more than 1 Trade Off Poké-Power each turn."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert bg.em().retrieveObject("Trade_Off") != bg.turnCount : "You cannot use more than one Trade Off per turn"
              assert my.deck : "Your deck is empty!"
              bg.em().storeObject("Trade_Off",bg.turnCount)
              powerUsed()
              def sel = my.deck.subList(0,2).select("Choose 1 card to put into your hand")
              my.deck.subList(0,2).getExcludedList(sel).moveTo(hidden: true, my.deck)
              sel.moveTo(hidden: true, my.hand)
            }
          }
          move "Zen Blade", {
            text "60 damage. Uxie can't use Zen Blade during your next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 60
              cantUseAttack thisMove, self
            }
          }
        };
      default:
        return null;
    }
  }
}
