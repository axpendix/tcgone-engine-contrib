package tcgwars.logic.impl.gen4;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Weakness.*

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum LegendsAwakened implements LogicCardInfo {

  DEOXYS_NORMAL_FORME_1 ("Deoxys Normal Forme", 1, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  DRAGONITE_2 ("Dragonite", 2, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  FROSLASS_3 ("Froslass", 3, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GIRATINA_4 ("Giratina", 4, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  GLISCOR_5 ("Gliscor", 5, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  HEATRAN_6 ("Heatran", 6, Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  KINGDRA_7 ("Kingdra", 7, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  LUXRAY_8 ("Luxray", 8, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  MAMOSWINE_9 ("Mamoswine", 9, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  METAGROSS_10 ("Metagross", 10, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  MEWTWO_11 ("Mewtwo", 11, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  POLITOED_12 ("Politoed", 12, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  PROBOPASS_13 ("Probopass", 13, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  RAYQUAZA_14 ("Rayquaza", 14, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  REGIGIGAS_15 ("Regigigas", 15, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  SPIRITOMB_16 ("Spiritomb", 16, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  YANMEGA_17 ("Yanmega", 17, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  ARMALDO_18 ("Armaldo", 18, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  AZELF_19 ("Azelf", 19, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  BELLOSSOM_20 ("Bellossom", 20, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  CRADILY_21 ("Cradily", 21, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  CRAWDAUNT_22 ("Crawdaunt", 22, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DELCATTY_23 ("Delcatty", 23, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DEOXYS_ATTACK_FORME_24 ("Deoxys Attack Forme", 24, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  DEOXYS_DEFENSE_FORME_25 ("Deoxys Defense Forme", 25, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  DEOXYS_SPEED_FORME_26 ("Deoxys Speed Forme", 26, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  DITTO_27 ("Ditto", 27, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  FORRETRESS_28 ("Forretress", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  GROUDON_29 ("Groudon", 29, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
  HEATRAN_30 ("Heatran", 30, Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  JIRACHI_31 ("Jirachi", 31, Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  KYOGRE_32 ("Kyogre", 32, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  LOPUNNY_33 ("Lopunny", 33, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  MESPRIT_34 ("Mesprit", 34, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  POLIWRATH_35 ("Poliwrath", 35, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  REGICE_36 ("Regice", 36, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  REGIGIGAS_37 ("Regigigas", 37, Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  REGIROCK_38 ("Regirock", 38, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
  REGISTEEL_39 ("Registeel", 39, Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  SHEDINJA_40 ("Shedinja", 40, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  TORKOAL_41 ("Torkoal", 41, Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  UNOWN___42 ("Unown !", 42, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  UXIE_43 ("Uxie", 43, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  VICTREEBEL_44 ("Victreebel", 44, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  VILEPLUME_45 ("Vileplume", 45, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  ANORITH_46 ("Anorith", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  CAMERUPT_47 ("Camerupt", 47, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CASTFORM_48 ("Castform", 48, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  CASTFORM_RAIN_FORM_49 ("Castform Rain Form", 49, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  CASTFORM_SNOW_CLOUD_FORM_50 ("Castform Snow-Cloud Form", 50, Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  CASTFORM_SUNNY_FORM_51 ("Castform Sunny Form", 51, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  DRAGONAIR_52 ("Dragonair", 52, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DRIFBLIM_53 ("Drifblim", 53, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  EXEGGUTOR_54 ("Exeggutor", 54, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  GLISCOR_55 ("Gliscor", 55, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  GRUMPIG_56 ("Grumpig", 56, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  HOUNDOOM_57 ("Houndoom", 57, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  LANTURN_58 ("Lanturn", 58, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  LANTURN_59 ("Lanturn", 59, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  LEDIAN_60 ("Ledian", 60, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  LUCARIO_61 ("Lucario", 61, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  LUXIO_62 ("Luxio", 62, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MAROWAK_63 ("Marowak", 63, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  METANG_64 ("Metang", 64, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  METANG_65 ("Metang", 65, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  MIGHTYENA_66 ("Mightyena", 66, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  NINJASK_67 ("Ninjask", 67, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PERSIAN_68 ("Persian", 68, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  PILOSWINE_69 ("Piloswine", 69, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SEADRA_70 ("Seadra", 70, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  STARMIE_71 ("Starmie", 71, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SWALOT_72 ("Swalot", 72, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  SWELLOW_73 ("Swellow", 73, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  TAUROS_74 ("Tauros", 74, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  TENTACRUEL_75 ("Tentacruel", 75, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  UNOWN_J_76 ("Unown J", 76, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_R_77 ("Unown R", 77, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_U_78 ("Unown U", 78, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_V_79 ("Unown V", 79, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_W_80 ("Unown W", 80, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_Y_81 ("Unown Y", 81, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_QUESTION_MARK_82 ("Unown ?", 82, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  BELDUM_83 ("Beldum", 83, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  BELDUM_84 ("Beldum", 84, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  BELLSPROUT_85 ("Bellsprout", 85, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BUNEARY_86 ("Buneary", 86, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHINCHOU_87 ("Chinchou", 87, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  CHINCHOU_88 ("Chinchou", 88, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  CORPHISH_89 ("Corphish", 89, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  CUBONE_90 ("Cubone", 90, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  DRATINI_91 ("Dratini", 91, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  DRIFLOON_92 ("Drifloon", 92, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  EXEGGCUTE_93 ("Exeggcute", 93, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GLIGAR_94 ("Gligar", 94, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  GLIGAR_95 ("Gligar", 95, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  GLOOM_96 ("Gloom", 96, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  GLOOM_97 ("Gloom", 97, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  GULPIN_98 ("Gulpin", 98, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  HITMONCHAN_99 ("Hitmonchan", 99, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  HITMONLEE_100 ("Hitmonlee", 100, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  HITMONTOP_101 ("Hitmontop", 101, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  HORSEA_102 ("Horsea", 102, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  HOUNDOUR_103 ("Houndour", 103, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  LEDYBA_104 ("Ledyba", 104, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  LILEEP_105 ("Lileep", 105, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  MEOWTH_106 ("Meowth", 106, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  MISDREAVUS_107 ("Misdreavus", 107, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  NINCADA_108 ("Nincada", 108, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  NOSEPASS_109 ("Nosepass", 109, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  NUMEL_110 ("Numel", 110, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  ODDISH_111 ("Oddish", 111, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  ODDISH_112 ("Oddish", 112, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  PINECO_113 ("Pineco", 113, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  POLIWAG_114 ("Poliwag", 114, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  POLIWHIRL_115 ("Poliwhirl", 115, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  POOCHYENA_116 ("Poochyena", 116, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  RIOLU_117 ("Riolu", 117, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SHINX_118 ("Shinx", 118, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  SKITTY_119 ("Skitty", 119, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SNEASEL_120 ("Sneasel", 120, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  SPOINK_121 ("Spoink", 121, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  STARYU_122 ("Staryu", 122, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SWINUB_123 ("Swinub", 123, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  TAILLOW_124 ("Taillow", 124, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TENTACOOL_125 ("Tentacool", 125, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  TYROGUE_126 ("Tyrogue", 126, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  WEEPINBELL_127 ("Weepinbell", 127, Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  YANMA_128 ("Yanma", 128, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BUBBLE_COAT_129 ("Bubble Coat", 129, Rarity.UNCOMMON, [TRAINER]),
  BUCK_S_TRAINING_130 ("Buck's Training", 130, Rarity.UNCOMMON, [TRAINER]),
  CYNTHIA_S_FEELINGS_131 ("Cynthia's Feelings", 131, Rarity.UNCOMMON, [TRAINER]),
  ENERGY_PICKUP_132 ("Energy Pickup", 132, Rarity.UNCOMMON, [TRAINER]),
  POKE_RADAR_133 ("Poké Radar", 133, Rarity.UNCOMMON, [TRAINER]),
  SNOWPOINT_TEMPLE_134 ("Snowpoint Temple", 134, Rarity.UNCOMMON, [TRAINER]),
  STARK_MOUNTAIN_135 ("Stark Mountain", 135, Rarity.UNCOMMON, [TRAINER]),
  TECHNICAL_MACHINE_TS_1_136 ("Technical Machine TS-1", 136, Rarity.UNCOMMON, [TRAINER]),
  TECHNICAL_MACHINE_TS_2_137 ("Technical Machine TS-2", 137, Rarity.UNCOMMON, [TRAINER]),
  CLAW_FOSSIL_138 ("Claw Fossil", 138, Rarity.COMMON, [TRAINER]),
  ROOT_FOSSIL_139 ("Root Fossil", 139, Rarity.COMMON, [TRAINER]),
  AZELF_LV_X_140 ("Azelf LV.X", 140, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _PSYCHIC_]),
  GLISCOR_LV_X_141 ("Gliscor LV.X", 141, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _FIGHTING_]),
  MAGNEZONE_LV_X_142 ("Magnezone LV.X", 142, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _METAL_]),
  MESPRIT_LV_X_143 ("Mesprit LV.X", 143, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _PSYCHIC_]),
  MEWTWO_LV_X_144 ("Mewtwo LV.X", 144, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _PSYCHIC_]),
  RHYPERIOR_LV_X_145 ("Rhyperior LV.X", 145, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _FIGHTING_]),
  UXIE_LV_X_146 ("Uxie LV.X", 146, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _PSYCHIC_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  LegendsAwakened(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokePower "Form Change", {
            text "Once during your turn , you may search your deck for any Deoxys and switch it with Deoxys Normal Forme. (Any cards attached to Deoxys Normal Forme, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys Normal Forme on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
            actionA {
              checkLastTurn()
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You cannot use Form Change more than once per turn!"
              assert my.deck : "There is no card in your deck"
              powerUsed()
              bg.em().storeObject("Form_Change",bg.turnCount)
              def deoxys = self.topPokemonCard
              if (my.deck.findAll{it.name == "Deoxys"}) {
                my.deck.search{it.name == "Deoxys"}.moveTo(self.cards)
                my.deck.add(deoxys)
                self.cards.remove(deoxys)
                shuffleDeck()
                checkFaint()
              }
            }
          }
          move "Energy Crush", {
            text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to all of your opponent’s Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DRAGONITE_2:
        return evolution (this, from:"Dragonair", hp:HP140, type:COLORLESS, retreatCost:3) {
          weakness C, PLUS30
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
            text "Flip a coin for each of your opponent’s Pokémon. If that coin flip is heads, this attack does 50 damage to that Pokémon."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case FROSLASS_3:
        return evolution (this, from:"Snorunt", hp:HP090, type:WATER, retreatCost:1) {
          weakness M, PLUS20
          move "Destiny Bond", {
            text "Energy attached to Froslass. During your opponent’s next turn, if Froslass would be Knocked Out by damage from an attack, the Attacking Pokémon is Knocked Out."
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Icy Breath", {
            text "40 damage. The Defending Pokémon is now Asleep. Put 1 damage counter on each of your opponent’s Benched Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GIRATINA_4:
        return basic (this, hp:HP100, type:PSYCHIC, retreatCost:3) {
          weakness D
          resistance C, MINUS20
          move "Shadow Force", {
            text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Giratina during your opponent’s next turn."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Brutal Edge", {
            text "50+ damage. Does 50 damage plus 10 more damage for each damage counter on the Defending Pokémon."
            energyCost P, P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GLISCOR_5:
        return evolution (this, from:"Gligar", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS20
          resistance F, MINUS20
          move "Burning Poison", {
            text "Choose either Burned or Poisoned. The Defending Pokémon is now affected by that Special Condition. You may return Gliscor and all cards attached to it to your hand."
            energyCost ()
            attackRequirement {}
            onAttack {
              def choice = choose([1,2],['Apply Burn', 'Apply Poison'], "Choose 1")

              if (choice == 1) {
                apply BURNED
              } else {
                apply POISONED
              }
              if (confirm("Return Gliscor and all cards attached to it to your hand?")) {
                self.cards.moveTo(hand)
                removePCS(self)
              }
            }
          }
          move "Pester", {
            text "40+ damage. If the Defending Pokémon is affected by a Special Condition, this attack does 40 damage plus 40 more damage."
            energyCost F, C
            onAttack {
              damage 40
              if (defending.specialConditions) {
                damage 40
              }
            }
          }
        };
      case HEATRAN_6:
        return basic (this, hp:HP100, type:FIRE, retreatCost:4) {
          weakness W
          pokePower "Flash Fire", {
            text "Once during your turn , you may move an Energy attached to 1 of your Pokémon to Heatran. This power can’t be used if Heatran is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              
              
            }
          }
          move "Magma Storm", {
            text "40+ damage. You may discard as many basic Energy cards as you like attached to Heatran. If you do, this attack does 40 damage plus 20 more damage for each Energy card you discarded."
            energyCost R, R, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KINGDRA_7:
        return evolution (this, from:"Seadra", hp:HP130, type:WATER, retreatCost:1) {
          weakness L, PLUS30
          move "Aqua Steam", {
            text "10× damage. Energy card you chose. Put those cards on top of your deck. Shuffle your deck afterward."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dragon Pump", {
            text "40+ damage. You may discard 2 cards from you hand. If you do, this attack does 40 damage plus 20 more damage and does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LUXRAY_8:
        return evolution (this, from:"Luxio", hp:HP120, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS30
          resistance M, MINUS20
          pokeBody "Rivalry", {
            text "If your opponent has any Pokémon LV. in play, each of Luxray’s attacks does 50 more damage to the Active Pokémon ."
            delayedA {
            }
          }
          move "Plasma", {
            text "40 damage. Energy card and attach it to Luxray."
            energyCost C, C, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Shock Bolt", {
            text "100 damage. Energy attached to Luxray."
            energyCost L, L, C, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAMOSWINE_9:
        return evolution (this, from:"Piloswine", hp:HP140, type:WATER, retreatCost:4) {
          weakness M
          resistance L, MINUS20
          move "Ice Fang", {
            text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and discard an Energy card attached to the Defending Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Charge Through", {
            text "60+ damage. If you do, Mamoswine does 40 damage to itself."
            energyCost F, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case METAGROSS_10:
        return evolution (this, from:"Metang", hp:HP120, type:METAL, retreatCost:3) {
          weakness R, PLUS30
          resistance P, MINUS20
          pokePower "Magnetic Reversal", {
            text "Once during your turn , you may flip a coin. If heads, switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon. This power can’t be used if Metagross is affected by a Special Condition."
            actionA {
            }
          }
          move "Extra Comet Punch", {
            text "50 damage. During your next turn, Metagross’s Extra Comet Punch attack’s base is 100."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 50
              increasedBaseDamageNextTurn("Extra Comet Punch",hp(50))
            }
          }
        };
      case MEWTWO_11:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS20
          move "Hypnoblast", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Psychic", {
            text "40+ damage. Does 40 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case POLITOED_12:
        return evolution (this, from:"Poliwhirl", hp:HP120, type:WATER, retreatCost:1) {
          weakness G, PLUS30
          pokeBody "Enthusiasm", {
            text "If you have Poliwag, Poliwhirl, and Poliwrath in play, each of these Pokémon’s attacks does 60 more damage to the Defending Pokémon ."
            delayedA {
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
        return evolution (this, from:"Nosepass", hp:HP090, type:FIGHTING, retreatCost:3) {
          weakness W
          pokeBody "Steel Coating", {
            text "Any damage done to Probopass by your opponent’s attacks is reduced by 10 for each Energy attached to Probopass . You can’t reduce more than 20 damage in this way."
            delayedA {
            }
          }
          move "Metal Bomber", {
            text "60 damage. Energy attached to Probopass. This attack does 20 damage to each of them."
            energyCost F, C, C, M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RAYQUAZA_14:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:3) {
          weakness C
          resistance F, MINUS20
          pokePower "Speed Gain", {
            text "Once during your turn , you may flip a coin until you get tails. For each heads, search your discard pile for a basic Energy card or a basic Energy card and attach it to Rayquaza. This power can’t be used if Rayquaza is affected by a Special Condition or if you have another Rayquaza in play."
            actionA {
            }
          }
          move "Sky Judgement", {
            text "150 damage. Discard all Energy attached to Rayquaza."
            energyCost R, R, L, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case REGIGIGAS_15:
        return basic (this, hp:HP120, type:COLORLESS, retreatCost:4) {
          weakness F
          pokeBody "Slow Start", {
            text "Regigigas can’t attack until your opponent has 3 or less Prize cards left."
            delayedA {
            }
          }
          move "Crush Grip", {
            text "120 damage. If the Defending Pokémon already has any damage counters on it, this attack’s base damage is 40 instead of 120."
            energyCost W, F, M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SPIRITOMB_16:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:2) {
          resistance C, MINUS20
          pokePower "Curse Breath", {
            text "Once during your turn, when you put Spiritomb from your hand onto your Bench, you may put 1 damage counter on all Pokémon that already have any damage counters on them . You can’t use more than 1 Curse Breath Poké-Power each turn."
            actionA {
            }
          }
          move "Transfer Pain", {
            text "Move 1 damage counter from 1 of your Pokémon to 1 of your opponent’s Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case YANMEGA_17:
        return evolution (this, from:"Yanma", hp:HP090, type:GRASS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Sonic Wave", {
            text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Pursue and Turn", {
            text "60+ damage. If the Defending Pokémon already has 2 or more damage counters on it, this attack does 60 damage plus 20 more damage and switch Yanmega with 1 of your Benched Pokémon."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ARMALDO_18:
        return evolution (this, from:"Anorith", hp:HP140, type:FIGHTING, retreatCost:2) {
          weakness G, PLUS30
          pokeBody "Fossil Armor", {
            text "If Armaldo would be damaged by an attack, prevent that attack’s damage done to Armaldo if that damage is 60 or less."
            delayedA {
            }
          }
          move "Crush Claw", {
            text "60 damage. , that attack does 40 more damage."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case AZELF_19:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokePower "Time Walk", {
            text "Once during your turn, when you put Azelf from your hand onto you Bench, you may look at all of your face-down Prize cards. If you do, you may choose 1 Pokémon you find there, show it to your opponent, and put it into you hand. Then, choose 1 card in your hand and put it as a Prize card face down."
            actionA {
            }
          }
          move "Lock Up", {
            text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BELLOSSOM_20:
        return evolution (this, from:"Gloom", hp:HP100, type:GRASS, retreatCost:1) {
          weakness R, PLUS30
          resistance W, MINUS20
          move "Parallel Gain", {
            text "30 damage. Remove 1 damage counter from each of your Pokémon."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Blend Pollen", {
            text "40+ damage. Does 40 damage plus 20 more damage for each Vileplume and each Bellossom you have in play. Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CRADILY_21:
        return evolution (this, from:"Lileep", hp:HP120, type:GRASS, retreatCost:3) {
          weakness R, PLUS30
          move "Drain Down", {
            text "30 damage. Before doing damage, you may switch 1 of the Defending Pokémon with 1 of your opponent’s Benched Pokémon. If you do, this attack does 30 damage to the new Defending Pokémon. If the Defending Pokémon would be Knocked Out by this attack, you may remove all damage counters from Cradily."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Acid", {
            text "50 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CRAWDAUNT_22:
        return evolution (this, from:"Corphish", hp:HP090, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          resistance P, MINUS20
          move "Gripthrow", {
            text "Flip a coin. If heads, your opponent returns the Defending Pokémon and all cards attached to it to his or her hand."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Prop-up Pinchers", {
            text "50+ damage. If Crawdaunt has a Technical Machine card attached to it, this attack does 50 damage plus 30 more damage."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DELCATTY_23:
        return evolution (this, from:"Skitty", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          pokeBody "Attracting Body", {
            text "If Delcatty is your Active Pokémon and is damaged by an opponent’s attack (even if Delcatty is Knocked Out), flip a coin. If heads, the Attacking Pokémon is now Confused."
            delayedA {
            }
          }
          move "Energy Assist", {
            text "30 damage. Search your discard pile for a basic Energy card and attach it to 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DEOXYS_ATTACK_FORME_24:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness P
          pokePower "Form Change", {
            text "Once during your turn , you may search your deck for any Deoxys and switch it with Deoxys Attack Forme. (Any cards attached to Deoxys Attack Forme, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys Attack Forme on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
            actionA {
              checkLastTurn()
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You cannot use Form Change more than once per turn!"
              assert my.deck : "There is no card in your deck"
              powerUsed()
              bg.em().storeObject("Form_Change",bg.turnCount)
              def deoxys = self.topPokemonCard
              if (my.deck.findAll{it.name == "Deoxys"}) {
                my.deck.search{it.name == "Deoxys"}.moveTo(self.cards)
                my.deck.add(deoxys)
                self.cards.remove(deoxys)
                shuffleDeck()
                checkFaint()
              }
            }
          }
          move "Psychic Boost", {
            text "80 damage. During your next turn, Deoxys’s Psychic Boost attack’s base damage is 20."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DEOXYS_DEFENSE_FORME_25:
        return basic (this, hp:HP100, type:PSYCHIC, retreatCost:2) {
          weakness P
          pokePower "Form Change", {
            text "Once during your turn , you may search your deck for any Deoxys and switch it with Deoxys Defense Forme. (Any cards attached to Deoxys Defense Forme, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys Defense Forme on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
            actionA {
              checkLastTurn()
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You cannot use Form Change more than once per turn!"
              assert my.deck : "There is no card in your deck"
              powerUsed()
              bg.em().storeObject("Form_Change",bg.turnCount)
              def deoxys = self.topPokemonCard
              if (my.deck.findAll{it.name == "Deoxys"}) {
                my.deck.search{it.name == "Deoxys"}.moveTo(self.cards)
                my.deck.add(deoxys)
                self.cards.remove(deoxys)
                shuffleDeck()
                checkFaint()
              }
            }
          }
          move "Psychic Defense", {
            text "40 damage. ."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DEOXYS_SPEED_FORME_26:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:0) {
          weakness P
          pokePower "Form Change", {
            text "Once during your turn , you may search your deck for any Deoxys and switch it with Deoxys Speed Forme. (Any cards attached to Deoxys Speed Forme, damage counters, Special Conditions, and effects on it are now on the new Pokémon.) If you do, put Deoxys Speed Forme on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Form Change Poké-Power each turn."
            actionA {
              checkLastTurn()
              assert bg.em().retrieveObject("Form_Change") != bg.turnCount : "You cannot use Form Change more than once per turn!"
              assert my.deck : "There is no card in your deck"
              powerUsed()
              bg.em().storeObject("Form_Change",bg.turnCount)
              def deoxys = self.topPokemonCard
              if (my.deck.findAll{it.name == "Deoxys"}) {
                my.deck.search{it.name == "Deoxys"}.moveTo(self.cards)
                my.deck.add(deoxys)
                self.cards.remove(deoxys)
                shuffleDeck()
                checkFaint()
              }
            }
          }
          move "Speed Shot", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DITTO_27:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          pokeBody "Ditto DNA", {
            text "As long as Ditto is your Active Pokémon, its maximum HP is the same as your opponent’s Active Pokémon. Ditto can use the attacks of that Pokémon as its own. If that Pokémon is no longer your opponent’s Active Pokémon, choose 1 of your opponent’s Active Pokémon for Ditto to copy."
            delayedA {
            }
          }

        };
      case FORRETRESS_28:
        return evolution (this, from:"Pineco", hp:HP090, type:METAL, retreatCost:2) {
          weakness R, PLUS20
          resistance P, MINUS20
          pokeBody "Iron Shell", {
            text "Whenever you attach a basic Energy card from your hand to Forretress (excluding effects of attacks), you may flip a coin. If tails, put 2 damage counters on each Pokémon (excluding any Forretress)."
            delayedA {
            }
          }
          move "Explosion", {
            text "100 damage. Forretress does 40 damage to itself."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GROUDON_29:
        return basic (this, hp:HP100, type:FIGHTING, retreatCost:3) {
          weakness G
          resistance L, MINUS20
          move "Drought", {
            text "Energy cards from your hand and attach them to 1 of your Pokémon."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Major Earthquake", {
            text "100 damage. Energy attached to Groudon and this attack does 10 damage to each of your Benched Pokémon."
            energyCost F, F, C, F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HEATRAN_30:
        return basic (this, hp:HP100, type:METAL, retreatCost:3) {
          weakness W
          pokePower "Smelt", {
            text "Once during your turn , you may move a Energy attached to 1 of your Pokémon to Heatran. This power can’t be used if Heatran is affected by a Special Condition."
            actionA {
            }
          }
          move "Heavy Metal", {
            text "40+ damage. Energy attached to Heatran. This attack does 40 damage plus 20 more damage for each heads."
            energyCost C, C, C, M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case JIRACHI_31:
        return basic (this, hp:HP070, type:METAL, retreatCost:1) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "One Desire", {
            text "Search your deck for any 1 card. Shuffle your deck, then put that card on top of your deck."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Doom Desire", {
            text "Discard all Energy attached to Jirachi. The Defending Pokémon is Knocked Out at the end of your opponent’s next turn."
            energyCost M, M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case KYOGRE_32:
        return basic (this, hp:HP100, type:WATER, retreatCost:3) {
          weakness L
          move "Drizzle", {
            text "Energy cards from your hand and attach them to 1 of your Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "High Tide", {
            text "60 damage. Energy attached to Kyogre. This attack does 20 damage to each of your opponent’s Benched Pokémon."
            energyCost W, W, C, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LOPUNNY_33:
        return evolution (this, from:"Buneary", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          pokeBody "Healing Tail", {
            text "As long as Lopunny is your Active Pokémon, remove 1 damage counter from each of your Benched Pokémon between turns."
            delayedA {
            }
          }
          move "Collect", {
            text "Draw 3 cards."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Cross-Cut", {
            text "30+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 30 damage plus 30 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MESPRIT_34:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokePower "Psychic Bind", {
            text "Once during your turn, when you put Mesprit from your hand onto your Bench, you may use this power. Your opponent can’t use any Poké-Powers on his or her Pokémon during your opponent’s next turn."
            actionA {
            }
          }
          move "Extrasensory", {
            text "20+ damage. If you have the same number of cards in your hand as your opponent, this attack does 20 damage plus 50 more damage."
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case POLIWRATH_35:
        return evolution (this, from:"Poliwhirl", hp:HP130, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          move "Focus Punch", {
            text "60 damage. If Poliwrath was damaged by an attack during your opponent’s last turn, this attack does nothing."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Submission", {
            text "90 damage. Poliwrath does 20 damage to itself."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case REGICE_36:
        return basic (this, hp:HP090, type:WATER, retreatCost:3) {
          weakness M
          pokePower "Regi Move", {
            text "Once during your turn , you may use this power. Discard 2 cards from your hand and choose 1 of your opponent’s Active Pokémon that isn’t an Evolved Pokémon. Then, your opponent switches that Pokémon with 1 of his or her Benched Pokémon. This power can’t be used if Regice is affected by a Special Condition."
            actionA {
            }
          }
          move "Ice Reflect", {
            text "50 damage. If Regice was damaged by an attack during your opponent’s last turn, the Defending Pokémon is now Paralyzed."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case REGIGIGAS_37:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
          weakness F
          pokeBody "Recover Mechanism", {
            text "When you attach an Energy card from you hand to Regigigas, remove all Special Conditions from Regigigas."
            delayedA {
              after ATTACH_ENERGY, self, {
                if(ef.reason==PLAY_FROM_HAND && ef.card.cardTypes.is(ENERGY)){
                  clearSpecialCondition(self, SRC_ABILITY)
                }
              }
            }
          }
          move "Gigaton Punch", {
            text "60+ damage. Flip a coin. If heads, this attack does 60 damage plus 20 more damage and does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost C, C, C
            onAttack {
              damage 60
              flip {
                20 damage
                if(opp.bench) {
                  damage 20, opp.bench.select()
                }
              }
            }
          }
        };
      case REGIROCK_38:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:3) {
          weakness W
          pokePower "Regi Cycle", {
            text "Once during your turn , if you have a card in your discard pile, you may discard 2 cards from your hand. Then, attach a Energy from your discard pile to Regirock. This power can’t be used if Regirock is affected by a Special Condition."
            actionA {
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
        return basic (this, hp:HP090, type:METAL, retreatCost:4) {
          weakness R
          resistance P, MINUS20
          pokePower "Regi Heal", {
            text "Once during your turn , you may discard 2 cards from you hand. Then, remove 3 damage counters from Registeel. This power can’t be used if Registeel is affected by a Special Conition."
            actionA {
            }
          }
          move "Rotating Claws", {
            text "50 damage. You may discard an Energy card attached to Registeel. If you do, search your discard pile for an Energy card (exluding the one you discarded and attach it to Registeel."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SHEDINJA_40:
        return evolution (this, from:"Nincada", hp:HP060, type:GRASS, retreatCost:0) {
          pokePower "Resent", {
            text "Once during your opponent’s turn, if Shedinja would be Knocked Out by damage from an attack, you may put 4 damage counters on the Attacking Pokémon and each of the opponent’s Pokémon that has the same name as the Attacking Pokémon."
            actionA {
            }
          }
          move "Curse and Deceive", {
            text "Put 3 damage counters on the Defending Pokémon. If Shedinja has any damage counters on it, the Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TORKOAL_41:
        return basic (this, hp:HP080, type:FIRE, retreatCost:2) {
          weakness W, PLUS20
          pokeBody "White Smoke", {
            text "As long as Torkoal is your Active Pokémon, prevent all effects, including damage, done to your Benched Pokémon by your opponent’s attacks."
            delayedA {
            }
          }
          move "Black Soot", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Burned and Paralyzed."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN___42:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "!", {
            text "Once during your turn, when you put Unown ! from your hand onto your Bench, you may flip a coin. If heads, put 2 damage counters on 1 of your opponent’s Pokémon. If tails, put 2 damage counters on 1 of your Pokémon."
            actionA {
            }
          }
          move "Hidden Power", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage. If tails. Unown ! does damage to itself, and this attack’s damage isn’t affected by Weakness or Resistance."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UXIE_43:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokePower "Set Up", {
            text "Once during your turn, when you put Uxie from your hand onto your Bench, you may draw cards until you have 7 cards in your hand."
            actionA {
              if(reason == PLAY_FROM_HAND && self.benched && my.deck.notEmpty && my.hand.size() < 7 && confirm("Use Set Up?")){
                powerUsed()
                draw 7 - my.hand.size()
              }
            }
          }
          move "Psychic Restore", {
            text "20 damage. You may put Uxie and all cards attached to it on the bottom of your deck in any order."
            energyCost C
            onAttack {
              damage 20
              if (confirm("Put Uxie on the bottom of your deck?") {
                def rearrangedCards = rearrange(self.cards)
                rearrangedCards.moveTo(my.deck)
                removePCS(self)
              }
            }
          }

        };
      case VICTREEBEL_44:
        return evolution (this, from:"Weepinbell", hp:HP120, type:GRASS, retreatCost:3) {
          weakness R, PLUS30
          move "Burning Scent", {
            text "The Defending Pokémon is now Burned and Poisoned. Before applying these effects, you may switch 1 of the Defending Pokémon with 1 of your opponent’s Benched Pokémon. The new Defending Pokémon is now Burned and Poisoned."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Energy Dissolve", {
            text "60 damage. Discard an Energy attached to the Defending Pokémon at the end of your opponent’s next turn."
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case VILEPLUME_45:
        return evolution (this, from:"Gloom", hp:HP120, type:GRASS, retreatCost:2) {
          weakness P, PLUS30
          pokePower "Energy Reaction", {
            text "Once during your turn , when you attach a or Energy card from you hand to Vileplue (excluding effects of attacks or Poké-Powers), you may use this power. If you attach a Energy card, the Defending Pokémon is now Asleep. If you attach a Energy card, the Defending Pokémon is now Poisoned. This power can’t be used if Vileplume is affected by a Special Condition."
            actionA {
            }
          }
          move "Disturbing Pollen", {
            text "60 damage. Flip a coin. If heads, your opponent can’t play an Trainer, Supporter, or Stadium cards from his or her hand during your opponent’s next turn."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ANORITH_46:
        return evolution (this, from:"Claw Fossil", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS20
          move "Guard Claw", {
            text "20 damage. ."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
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
        return evolution (this, from:"Numel", hp:HP100, type:FIRE, retreatCost:3) {
          weakness W, PLUS20
          move "Eruption", {
            text "30+ damage. Each player discards the top of his or her deck. This attack does 30 damage plus 30 more damage for each Energy card discarded in this way."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Take Down", {
            text "80 damage. Camerupt does 20 damage to itself."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CASTFORM_48:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          pokePower "Temperament", {
            text "Once during your turn , you may search your deck for any Castform and switch it with Castform. (Any cards attached to Castform, damage counters, Special Conditions, and effect on it are now on the new Pokémon.) If you do, put Castform on top of your deck. Shuffle your deck afterward. You can’t use more than 1 Temperament Poké-Power each turn."
            actionA {
            }
          }
          move "Weather Ball", {
            text "30+ damage. If you have a Stadium card in play, remove 3 damage counters from Castform. If your opponent has a Stadium card in play, this attack does 30 damage plus 30 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CASTFORM_RAIN_FORM_49:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          pokePower "Temperament", {
            text "Once during your turn , you may search your deck for any Castform and switch it with Castform Rain Form. (Any cards attached to Castform Rain Form, damage counters, Special Conditions, and effect on it are now on the new Pokémon.) Shuffle Castorm Rain Form back into your deck. You can’t use more than 1 Temperament Poké-Power each turn."
            actionA {
            }
          }
          move "Water Pulse", {
            text "30 damage. The defending Pokémon is now Asleep."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CASTFORM_SNOW_CLOUD_FORM_50:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness M, PLUS10
          pokePower "Temperament", {
            text "Once during your turn , you may search your deck for any Castform and switch it with Castform Snow-cloud Form. (Any cards attached to Castform Snow-cloud Form, damage counters, Special Conditions, and effect on it are now on the new Pokémon.) Shuffle Castorm Snow-cloud Form back into your deck. You can’t use more than 1 Temperament Poké-Power each turn."
            actionA {
            }
          }
          move "Hail", {
            text "This attack does 10 damage to each of your opponent’s Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CASTFORM_SUNNY_FORM_51:
        return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          pokePower "Temperament", {
            text "Once during your turn , you may search your deck for any Castform and switch it with Castform Sunny Form. (Any cards attached to Castform Sunny Form, damage counters, Special Conditions, and effect on it are now on the new Pokémon.) Shuffle Castorm Sunny Form back into your deck. You can’t use more than 1 Temperament Poké-Power each turn."
            actionA {
            }
          }
          move "Ember", {
            text "40 damage. Energy attached to Castform Sunny Form."
            energyCost R, C, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DRAGONAIR_52:
        return evolution (this, from:"Dratini", hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS20
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
              flip { damage 20 }
            }
          }

        };
      case DRIFBLIM_53:
        return evolution (this, from:"Drifloon", hp:HP090, type:PSYCHIC, retreatCost:0) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Expand", {
            text "30 damage. ."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Whirlwind", {
            text "60 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              whirlwind()
            }
          }

        };
      case EXEGGUTOR_54:
        return evolution (this, from:"Exeggcute", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Psychic Strategy", {
            text "Each player counts the number of cards in his or her opponent’s hand. Each player shuffles his or her hand into his or her deck. Then, each player draws a number of cards up to the number of cards his or her opponent had. (You draw your cards first.)"
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Super Eggsplosion", {
            text "50× damage. Discard as many Energy cards as you like attached to your Pokémon. For each Energy card you discarded, flip a coin. This attack does 50 damage times the number of heads."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GLISCOR_55:
        return evolution (this, from:"Gligar", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS20
          resistance F, MINUS20
          move "Poison Jab", {
            text "20 damage. The Defending Pokémon is now Poisoned."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
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
        return evolution (this, from:"Spoink", hp:HP090, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS20
          move "Magical Step", {
            text "The Defending Pokémon is now Confused. Put 6 damage counters instead of 3 on the Confused Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Grind", {
            text "20× damage. Does 20 damage times the amount of Energy attached to Grumpig."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20*self.cards.energyCount(C)
            }
          }

        };
      case HOUNDOOM_57:
        return evolution (this, from:"Houndour", hp:HP080, type:FIRE, retreatCost:1) {
          weakness W, PLUS20
          pokeBody "Revenge Fang", {
            text "If you have less Benched Pokémon than your opponent, each of Houndoom’s attacks does 40 more damage to the Active Pokémon ."
            delayedA {
            }
          }
          move "Burning Sensation", {
            text "20 damage. If the Defending Pokémon already has any damage counters on it, the Defending Pokémon is now Burned."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bright Flame", {
            text "60 damage. Energy attached to Houndoom."
            energyCost R, R, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LANTURN_58:
        return evolution (this, from:"Chinchou", hp:HP090, type:WATER, retreatCost:1) {
          weakness G, PLUS20
          move "Rushing Water", {
            text "20 damage. Move an Energy card attached to the Defending Pokémon to another of your opponent’s Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Confuse Ray", {
            text "40 damage. The Defending Pokémon is now Confused."
            energyCost W, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LANTURN_59:
        return evolution (this, from:"Chinchou", hp:HP090, type:LIGHTNING, retreatCost:2) {
          weakness F, PLUS20
          move "Energy Split", {
            text "This attack does 30 damage to each of your opponent’s Pokémon that has any Energy cards attached to it."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Aqua Bolt", {
            text "60+ damage. Energy attached to Lanturn."
            energyCost L, C, C, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LEDIAN_60:
        return evolution (this, from:"Ledyba", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Comet Punch", {
            text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Baton Pass", {
            text "50 damage. You may switch Ledian with 1 of your Benched Pokémon. If you do, move as many Energy cards attached to Ledian as you like to the new Active Pokémon."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LUCARIO_61:
        return evolution (this, from:"Riolu", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS20
          move "Focus Blast", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Spike Lariat", {
            text "60+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 60 damage plus 20 more damage."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LUXIO_62:
        return evolution (this, from:"Shinx", hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Spark", {
            text "30 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Thunderous Claw", {
            text "70 damage. Energy attached to Luxio."
            energyCost L, C, C, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAROWAK_63:
        return evolution (this, from:"Cubone", hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness W, PLUS20
          resistance L, MINUS20
          move "Heavy Bone", {
            text "40 damage. Flip a coin. If tails, Marowak can’t use Heavy Bone during your next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bone Rush", {
            text "50× damage. Flip a coin until you get tails. This attack does 50 damage times the number of heads."
            energyCost F, F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case METANG_64:
        return evolution (this, from:"Beldum", hp:HP080, type:METAL, retreatCost:2) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Agility", {
            text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Metang during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { preventAllEffectsNextTurn() }
            }
          }
          move "Metal Claw", {
            text "50 damage. "
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case METANG_65:
        return evolution (this, from:"Beldum", hp:HP080, type:METAL, retreatCost:2) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Psyshock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bullet Punch", {
            text "40+ damage. Flip 2 coins. This attack does 40 damage plus 20 more damage for each heads."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MIGHTYENA_66:
        return evolution (this, from:"Poochyena", hp:HP090, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS20
          resistance P, MINUS20
          move "Bite One", {
            text "30 damage. If the Defending Pokémon isn’t an Evolved Pokémon, that Pokémon can’t attack, retreat, or use any Poké-Powers during your opponent’s next turn."
            energyCost D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Harass", {
            text "10× damage. Does 10 damage times the number of Pokémon you have in play."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case NINJASK_67:
        return evolution (this, from:"Nincada", hp:HP080, type:GRASS, retreatCost:0) {
          weakness R, PLUS20
          resistance F, MINUS20
          pokePower "Cast-off Shell", {
            text "Once during your turn, when you play Ninjask from your hand to evolve 1 of your Pokémon and if your Bench isn’t full, you may put Shedinja onto your Bench as a Basic Pokémon from your hand or your discard pile."
            actionA {
            }
          }
          move "Chip Off", {
            text "30 damage. If your opponent has 6 or more cards in his or her hand, discard a number of cards without looking until your opponent has 5 cards left in his or her hand."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PERSIAN_68:
        return evolution (this, from:"Meowth", hp:HP080, type:COLORLESS, retreatCost:0) {
          weakness F, PLUS20
          move "Feint Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              swiftDamage(30, opp.all.select())
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
        return evolution (this, from:"Swinub", hp:HP100, type:WATER, retreatCost:3) {
          weakness M, PLUS20
          resistance L, MINUS20
          move "Charge Dash", {
            text "30+ damage. You may do 30 damage plus 30 more damage. If you do, Piloswine does 30 damage to itself."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Icy Wind", {
            text "60 damage. The Defending Pokémon is now Asleep."
            energyCost W, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SEADRA_70:
        return evolution (this, from:"Horsea", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Aqua Pump", {
            text "30+ damage. Energy cards from your hand. If you do, this attack does 30 damage plus 10 more damage for each Energy card you discarded."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Waterfall", {
            text "50 damage. "
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case STARMIE_71:
        return evolution (this, from:"Staryu", hp:HP080, type:WATER, retreatCost:0) {
          weakness L, PLUS20
          move "Star Boomerang", {
            text "30 damage. You may return Starmie and all cards attached to it to your hand."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Core Flash", {
            text "Choose 1 of your opponent’s Pokémon that has any Poké-Powers or Poké-Bodies. This attack does 50 damage to that Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SWALOT_72:
        return evolution (this, from:"Gulpin", hp:HP090, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS20
          move "Swallow Up", {
            text "30 damage. Before doing damage, count the remaining HP of the Defending Pokémon and Swalot. If the Defending Pokémon has fewer remaining HP than Swalot’s, this attack does 80 damage instead."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Gunk Shot", {
            text "60 damage. The Defending Pokémon is now Poisoned."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SWELLOW_73:
        return evolution (this, from:"Tailow", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          pokeBody "Big Wing", {
            text "If Swellow has no Energy attached to it, Swellow’s Retreat Cost is 0."
            delayedA {
            }
          }
          move "Mach Descent", {
            text "30 damage. If Swellow was on your Bench this turn, this attack’s base damage is 60 instead of 30."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TAUROS_74:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Herd Charge", {
            text "20× damage. Flip a coin for each Tauros you have in play. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Thrash", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage. If tails, Tauros does 10 damage to itself."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TENTACRUEL_75:
        return evolution (this, from:"Tentacool", hp:HP090, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Tentacle Strike", {
            text "Search your opponent’s discard pile for up to 2 Energy cards and attach them to any of your opponent’s Pokémon in any way you like. For each Energy card attached in this way, this attack does 20 damage to that Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Dangerous Poison", {
            text "60 damage. If Tentacruel has less Energy attached to it than the Defending Pokémon. The Defending Pokémon is now Paralyzed and Poisoned."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_J_76:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "JUNK", {
            text "Once during your turn, when you put Unown J from your hand onto your Bench, you may flip a coin. If heads, search your discard pile for a Trainer card, show it to your opponent, and put it into your hand."
            actionA {
            }
          }
          move "Hidden Power", {
            text "10 damage. Remove the Special Condition Asleep from the Defending Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_R_77:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "RETIRE", {
            text "Once during your turn, if Unown R is on your Bench, you may discard Unown R and all cards attached to it. (This doesn’t count as a Knocked Out Pokémon.) Then, draw a card."
            actionA {
            }
          }
          move "Hidden Power", {
            text "Move any number of basic Energy cards attached to your Pokémon to your other Pokémon in any way you like."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_U_78:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokeBody "UNSEEN", {
            text "As long as Unown U is on your Bench, prevent, all effects of attacks, including damage, done by your opponent’s Pokémon to any Unown on your Bench."
            delayedA {
            }
          }
          move "Hidden Power", {
            text "Search your deck for any 1 card and discard it. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_V_79:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "VACATION", {
            text "Once during your turn , you may remove 2 damage counters from each of your Pokémon. If you do, your turn ends. This power can’t be used if Unown V is affected by a Special Condition."
            actionA {
            }
          }
          move "Hidden Power", {
            text "30 damage. Does 10 damage to each of your Bench Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_W_80:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:3) {
          weakness P, PLUS30
          pokeBody "WALL", {
            text "As long as Unown W is your Active Pokémon, any damage done to your Pokémon by an opponent’s attack is reduced by 10 ."
            delayedA {
            }
          }
          move "Hidden Power", {
            text "50 damage. Draw a card."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_Y_81:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "YAWN", {
            text "Once during your turn , If Unown Y is on your Bench, you may remove 1 damage counter from 1 of your Active Unown and that Unown is now Asleep."
            actionA {
            }
          }
          move "Hidden Power", {
            text "Search your deck for up to 2 Trainer cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UNOWN_QUESTION_MARK_82:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "?", {
            text "Once during your turn , if Unown ? is on your Bench, you may choose a Pokémon in your hand and put it face down. Your opponent guesses a type of that Pokémon. Reveal that card. If your opponent guessed wrong, draw a card. Then, put that card back into your hand."
            actionA {
            }
          }
          move "Hidden Power", {
            text "Discard up to 2 cards from your hand. For each card you discarded, draw a card."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BELDUM_83:
        return basic (this, hp:HP050, type:METAL, retreatCost:2) {
          weakness R, PLUS10
          resistance P, MINUS20
          pokePower "Metal Chain", {
            text "Once during your turn , when you attach a Energy card from your hand Beldum (excluding effects of attacks or Poké-Powers), you may search your deck for Beldum and put it onto your Bench. Shuffle your deck afterward. This power can’t be used if Beldum is affected by a Special Condition."
            actionA {
            }
          }
          move "Take Down", {
            text "30 damage. Beldum does 10 damage to itself."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BELDUM_84:
        return basic (this, hp:HP050, type:METAL, retreatCost:1) {
          weakness R, PLUS10
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
            text "20 damage. "
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BELLSPROUT_85:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Vine Bind", {
            text "Flip a coin. If heads, the Defending Pokémon can’t use any Poké-Powers during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Careless Tackle", {
            text "20 damage. Bellsprout does 10 damage to itself."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case BUNEARY_86:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Rest", {
            text "Remove all Special Conditions and 4 damage counters from Buneary. Buneary is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Double Kick", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHINCHOU_87:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness G, PLUS10
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {
              flip { apply CONFUSED }
            }
          }
          move "Wave Splash", {
            text "10 damage. "
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CHINCHOU_88:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          move "Razor Fin", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Aqua Spark", {
            text "20+ damage. Energy attached to it, this attack does 20 damage plus 10 more damage."
            energyCost L, C, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CORPHISH_89:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Knock Off", {
            text "Flip a coin. If heads, choose 1 card from your opponent’s hand without looking and discard it."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Irongrip", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case CUBONE_90:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS10
          resistance L, MINUS20
          move "Headbutt", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bonemerang", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DRATINI_91:
        return basic (this, hp:HP040, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS10
          move "Tail Slap", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Slam", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case DRIFLOON_92:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Mind Bend", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              flip { apply CONFUSED }
            }
          }
          move "Gust", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case EXEGGCUTE_93:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Call for Family", {
            text "Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
            energyCost C, G, P
            callForFamily(basic:true, 1, delegate)
          }
          move "Hypnosis", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GLIGAR_94:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS10
          resistance F, MINUS20
          move "Light Poison", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
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
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS10
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
            text "20 damage. "
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GLOOM_96:
        return evolution (this, from:"Oddish", hp:HP070, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          move "Sleep Powder", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Frustration", {
            text "Choose 1 of your opponent’s Pokémon that doesn’t have any damage counters on it. This attack does 30 damage to that Pokémon."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GLOOM_97:
        return evolution (this, from:"Oddish", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS20
          move "Space Out", {
            text "Remove 2 damage counters from Gloom. Gloom is now Asleep."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Stinky Nectar", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused and Poisoned."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GULPIN_98:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS10
          move "Amnesia", {
            text "Choose 1 of the Defending Pokémon’s attacks. That Pokémon can’t use that attack during your opponent’s next turn."
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
              damage 0
            }
          }

        };
      case HITMONCHAN_99:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS20
          move "Counter Punch", {
            text "During your opponent’s next turn, if Hitmonchan is damaged by an opponent’s attack (even if Hitmonchan is Knocked Out), put 4 damage counters on the Attacking Pokémon."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Gut Strike", {
            text "30 damage. If Tyrogue is anywhere under Hitmonchan, this attack’s base damage is 60 instead of 30."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HITMONLEE_100:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS20
          move "Gut Kick", {
            text "30 damage. If Tyrogue is anywhere under Hitmonlee, you may do 30 damage to 1 Benched Pokémon instead."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Mega Kick", {
            text "60 damage. "
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HITMONTOP_101:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS20
          move "Triple Kick", {
            text "20× damage. Flip 3 coins. This attack does 20 damage times the number of heads."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Gut Spin", {
            text "50 damage. If Tyrogue is anywhere under Hitmontop, you may switch Hitmontop with 1 of your Benched Pokémon."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case HORSEA_102:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Smokescreen", {
            text "If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flip a coin. If tails, that attack does nothing."
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
              damage 0
            }
          }

        };
      case HOUNDOUR_103:
        return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
          weakness W, PLUS10
          resistance P, MINUS20
          move "Roar", {
            text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bite", {
            text "10 damage. "
            energyCost D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case LEDYBA_104:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
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
        return evolution (this, from:"Root Fossil", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "Astonish", {
            text "20 damage. Choose 1 card from your opponent’s hand without looking. Look at that card you chose, then have your opponent shuffle that card into his or her deck."
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
              damage 0
            }
          }

        };
      case MEOWTH_106:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Pay Day", {
            text "10 damage. Flip a coin. If heads, draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Fury Swipes", {
            text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MISDREAVUS_107:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Show Off", {
            text "Search your deck for a basic Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
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
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Scratch", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Big Bite", {
            text "The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case NOSEPASS_109:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS20
          move "Sharpen", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Nose Poke", {
            text "20+ damage. If Probopass is on your Bench, this attack does 20 damage plus 20 more damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case NUMEL_110:
        return basic (this, hp:HP060, type:FIRE, retreatCost:2) {
          weakness W, PLUS10
          move "Rollout", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Singe", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ODDISH_111:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Stun Spore", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Blot", {
            text "10 damage. Remove 1 damage counter from Oddish."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ODDISH_112:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Poisonpowder", {
            text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost C
            attackRequirement {}
            onAttack {
              flip { apply POISONED }
            }
          }
          move "Ram", {
            text "20 damage. "
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case PINECO_113:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Tackle", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Selfdestruct", {
            text "40 damage. Pineco does 50 damage to itself."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case POLIWAG_114:
        return basic (this, hp:HP040, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Tackle", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Twiddle", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused. If tails, the Defending Pokémon is now Asleep."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case POLIWHIRL_115:
        return evolution (this, from:"Poliwag", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Light Punch", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bubblebeam", {
            text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case POOCHYENA_116:
        return basic (this, hp:HP050, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS10
          resistance P, MINUS20
          move "Corner", {
            text "The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost D
            attackRequirement {}
            onAttack {
              damage 0
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
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS10
          move "Punch", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Low Kick", {
            text "30 damage. "
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SHINX_118:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Recharge", {
            text "Energy card attach it to Shinx. Shuffle your deck afterward."
            energyCost C, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Double Kick", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SKITTY_119:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Growl", {
            text "."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Scratch", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SNEASEL_120:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS10
          resistance P, MINUS20
          move "Rob", {
            text "Look at your opponent’s hand. If your opponent has any Pokémon Tool or Technical Machine cards in his or her hand, put those cards on top of his or her deck. You opponent shuffles his or her deck afterward."
            energyCost D
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Slash", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SPOINK_121:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Psybeam", {
            text "The Defending Pokémon is now Confused."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Bounce", {
            text "20 damage. You may switch Spoink with 1 of your Bench Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case STARYU_122:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Recover", {
            text "Discard an Energy attached to Staryu and remove 3 damage counters from Staryu."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Spinning Attack", {
            text "20 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case SWINUB_123:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness M, PLUS10
          resistance L, MINUS20
          move "Sniff Out", {
            text "Flip a coin. If heads, put any 1 card from your discard pile into your hand."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Lunge Out", {
            text "30 damage. "
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TAILLOW_124:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Focus Energy", {
            text "During your next turn, Tailow’s Peck attack’s base damage is 30."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Peck", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case TENTACOOL_125:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Crystal Barrier", {
            text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Tentacool during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
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
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Hitmonlee, Hitmonchan, or Hitmontop from your hand onto Tyrogue (this counts as evolving Tyrogue) and remove all damage counters from Tyrogue."
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
              damage 0
            }
          }

        };
      case WEEPINBELL_127:
        return evolution (this, from:"Bellsprout", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "Poisonpowder", {
            text "10 damage. The Defending Pokémon is now Poisoned."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Razor Leaf", {
            text "40 damage. "
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case YANMA_128:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "U-turn", {
            text "10 damage. Switch Yanma with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Agility", {
            text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Yanma during your opponent’s next turn."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              flip { preventAllEffectsNextTurn() }
            }
          }

        };
      case BUBBLE_COAT_129:
        return basicTrainer (this) {
          text "Attach Bubble Coat to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nAs long as Bubble Coat is attached to a Pokémon, that Pokémon has no Weakness. If that Pokémon is damaged by an opponent’s attack, discard this card at the end of the turn."
          onPlay {
          }
          playRequirement{
          }
        };
      case BUCK_S_TRAINING_130:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDraw 2 cards. As long as Buck’s Training is next to your Active Pokémon, each of your Active Pokémon’s attacks does 10 more damage to the Active Pokémon (before applying Weakness and Resistance)."
          onPlay {
          }
          playRequirement{
          }
        };
      case CYNTHIA_S_FEELINGS_131:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nShuffle your hand into your deck. Then, draw 4 cards. If any of your Pokémon were Knocked Out during your opponent’s last turn, draw 4 more cards."
          onPlay {
          }
          playRequirement{
          }
        };
      case ENERGY_PICKUP_132:
        return basicTrainer (this) {
          text "Flip a coin. If heads, search your discard pile for a basic Energy card and attach it to 1 of your Pokémon."
          onPlay {
          }
          playRequirement{
          }
        };
      case POKE_RADAR_133:
        return basicTrainer (this) {
          text "Look at the top 5 cards of your deck, choose as many Pokémon as you like, show them to your opponent, and put them into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case SNOWPOINT_TEMPLE_134:
        return basicTrainer (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nEach Pokémon that isn’t an Evolved Pokémon in play (both your and your opponent’s gets +20 HP."
          onPlay {
            eff = getter GET_FULL_HP, {h->
              if(!h.effect.target.realEvolution) {
                h.object += hp(20)
              }
            }
          onRemoveFromPlay{
            eff.unregister()
          }
        }
      };
      case STARK_MOUNTAIN_135:
        return basicTrainer (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nOnce during each player’s turn, that player may choose a [R] or [F] Energy attached to 1 of his or her Pokémon and move that Energy to 1 of his or her Pokémon."
          onPlay {
          }
          playRequirement{
          }
        };
      case TECHNICAL_MACHINE_TS_1_136:
        return basicTrainer (this) {
          text "Attach this card to 1 of your Pokémon in play. That Pokémon may use this card’s attack instead of its own.\n[-] Evoluter Search your deck for a card that evolves from 1 of your Pokémon and put it onto that Pokémon. (This counts as evolving that Pokémon.) Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case TECHNICAL_MACHINE_TS_2_137:
        return basicTrainer (this) {
          text "Attach this card to 1 of your Pokémon in play. That Pokémon may use this card’s attack instead of its own.\n[-] Devoluter Choose 1 of your opponent’s Evolved Pokémon (excluding Pokémon LV.X). Remove the highest Stage Evolution card from that Pokémon and put that card back into your opponent’s hand."
          onPlay {
          }
          playRequirement{
          }
        };
      case CLAW_FOSSIL_138:
        return basicTrainer (this) {
          text "Play Claw Fossil as if it were a [C] Basic Pokémon. (Claw Fossil counts as a Trainer card as well, but if Claw Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Claw Fossil can’t be affected by any Special Conditions and can’t Retreat. At any time during your turn before your attack, you may discard Claw Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\nPoké-BODY: Jagged Stone If Claw Fossil is your Active Pokémon and is damaged by an opponent’s attack (even if Claw Fossil is Knocked Out), put 1 damage counter on the Attacking Pokémon."
          onPlay {
          }
          playRequirement{
          }
        };
      case ROOT_FOSSIL_139:
        return basicTrainer (this) {
          text "Play Root Fossil as if it were a [C] Basic Pokémon. (Root Fossil counts as a Trainer card as well, but if Root Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Root Fossil can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Root Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\nPoké-BODY: Spongy Stone At any time between turns, remove 1 damage counter from Root Fossil."
          onPlay {
          }
          playRequirement{
          }
        };
      case AZELF_LV_X_140:
        return evolution (this, from:"Azelf", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokeBody "Psychic Aura", {
            text "Each of your Pokémon has no Weakness."
            getterA (GET_WEAKNESSES) { h->
              if(h.effect.target.owner == self.owner) {
                def list = h.object as List<Weakness>
                list.clear()
              }
            }
          }
          move "Deep Balance", {
            text "Choose 1 of your opponent’s Pokémon. Put 1 damage counter on that Pokémon for each Energy attached to all of your opponent’s Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              def tar = opp.all.select("Choose a Pokemon to put damage counters on")
              int count = 0
              opp.all.each{count += it.cards.energyCount(C)}
              directDamage 10*count, tar
            }
          }
          move "", {
            text "Put this card onto your Active Azelf. Azelf LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case GLISCOR_LV_X_141:
        return evolution (this, from:"Gliscor", hp:HP110, type:FIGHTING, retreatCost:0) {
          weakness W
          resistance F, MINUS20
          pokePower "Shoot Poison", {
            text "Once during your turn , when you put Gliscor LV. from your hand onto your Active Gliscor, you may choose 1 of the Defending Pokémon. That Pokémon is now Paralyzed and Poisoned."
            actionA {
            }
          }
          move "Night Slash", {
            text "60 damage. You may switch Gliscor with 1 of your Benched Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Gliscor. Gliscor LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MAGNEZONE_LV_X_142:
        return evolution (this, from:"Magnezone", hp:HP140, type:METAL, retreatCost:4) {
          weakness R
          resistance P, MINUS20
          pokePower "Electric Trans", {
            text "As often as you like during your turn , you may move a or Energy attached to 1 of your Pokémon to another of your Pokémon. This power can’t be used if Magnezone is affected by a Special Condition."
            actionA {
            }
          }
          move "Cyber Shock", {
            text "80 damage. Energy attached to Magnezone. The Defending Pokémon is now Paralyzed."
            energyCost L, M, L, M
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Magnezone. Magnezone LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MESPRIT_LV_X_143:
        return evolution (this, from:"Mesprit", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness P
          move "Healing Look", {
            text "Remove 3 damage counters from each of your Benched Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              assert my.bench : "Your bench is empty"
              my.bench.each{
                heal 30, it
              }
            }
          }
          move "Supreme Blast", {
            text "200 damage. If you don't have Uxie LV.X and Azelf LV.X in play, this attack does nothing. Discard all Energy attached to Mesprit."
            energyCost P, P
            attackRequirement {my.all.findAll{it.name == ("Uxie Lv.X")} && my.all.findAll{it.name == ("Uxie Lv.X")}}
            onAttack {
              damage 200
              discardAllEnergySelf()
            }
          }
          move "", {
            text "Put this card onto your Active Mesprit. Mesprit LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MEWTWO_LV_X_144:
        return evolution (this, from:"Mewtwo", hp:HP120, type:PSYCHIC, retreatCost:2) {
          weakness P
          pokeBody "Psybarrier", {
            text "Prevent all effects of attacks, including damage, done to Mewtwo by your opponent’s Pokémon that isn’t an Evolved Pokémon."
            delayedA {
            }
          }
          move "Giga Burn", {
            text "120 damage. Discard all Energy attached to Mewtwo."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Mewtwo. Mewtwo LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RHYPERIOR_LV_X_145:
        return evolution (this, from:"Rhyperior", hp:HP170, type:FIGHTING, retreatCost:4) {
          weakness W
          resistance L, MINUS20
          move "Hard Crush", {
            text "50× damage. Discard the top 5 cards from your deck. This attack does 50 damage for each Energy card you discarded."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Upthrow", {
            text "60 damage. Energy cards, show them to your opponent, and shuffle them into your deck."
            energyCost F, F, C, F
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "", {
            text "Put this card onto your Active Rhyperior. Rhyperior LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case UXIE_LV_X_146:
        return evolution (this, from:"Uxie", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokePower "Trade Off", {
            text "Once during your turn , you may look at the top 2 cards of your deck, choose 1 of them, and put it into your hand. Put the other card on the bottom of your deck. This power can’t be used if Uxie is affected by a Special Condition. You can’t use more than 1 Trade Off Poké-Power each turn."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert bg.em().retrieveObject("Trade_Off") != bg.turnCount : "You cannot use more than one Trade Off per turn"
              assert my.deck : "Your deck is empty"
              bg.em().storeObject("Trade_Off",bg.turnCount)
              powerUsed()
              def sel = my.deck.subList(0,2).select("Choose 1 card to put into your hand")
              my.deck.subList(0,2).getExcludedList(sel).moveTo(hidden: true, my.deck)
              sel.moveTo(hidden: true, my.hand)          
            }
          }
          move "Zen Blade", {
            text "60 damage. Uxie can’t use Zen Blade during your next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 60
              cantUseAttack thisMove, self
            }
          }
          move "", {
            text "Put this card onto your Active Uxie. Uxie LV. can use any attack, Poké-Power, or Poké-Body from its previous level."
            energyCost ()
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
