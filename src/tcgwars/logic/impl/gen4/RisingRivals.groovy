package tcgwars.logic.impl.gen4

import tcgwars.logic.DamageManager
import tcgwars.logic.effect.Source
import tcgwars.logic.impl.gen3.RubySapphire
import tcgwars.logic.impl.gen4.MysteriousTreasures
import tcgwars.logic.impl.gen7.CelestialStorm

import tcgwars.logic.TargetPlayer
import tcgwars.logic.card.*
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.effect.gm.PlayTrainer
import tcgwars.logic.util.CardList
import tcgwars.logic.util.CardTypeSet
import tcgwars.logic.util.Holder
import tcgwars.logic.util.PokemonCardSet

import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.card.HP.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Type.*
import static tcgwars.logic.card.Weakness.*
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.EffectType.*
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.groovy.TcgBuilders.*
import static tcgwars.logic.groovy.TcgStatics.*

/**
 * @author axpendix@hotmail.com
 * @author ufodynasty12@gmail.com
 */
public enum RisingRivals implements LogicCardInfo {

  ARCANINE_1 ("Arcanine", "1", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  BASTIODON_GL_2 ("Bastiodon GL", "2", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _METAL_]),
  DARKRAI_G_3 ("Darkrai G", "3", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _DARKNESS_]),
  FLOATZEL_GL_4 ("Floatzel GL", "4", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _WATER_]),
  FLYGON_5 ("Flygon", "5", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  FROSLASS_GL_6 ("Froslass GL", "6", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _WATER_]),
  JIRACHI_7 ("Jirachi", "7", Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
  LUCARIO_GL_8 ("Lucario GL", "8", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _FIGHTING_]),
  LUXRAY_GL_9 ("Luxray GL", "9", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _LIGHTNING_]),
  MISMAGIUS_GL_10 ("Mismagius GL", "10", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  RAMPARDOS_GL_11 ("Rampardos GL", "11", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _FIGHTING_]),
  ROSERADE_GL_12 ("Roserade GL", "12", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _GRASS_]),
  SHIFTRY_13 ("Shiftry", "13", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  AGGRON_14 ("Aggron", "14", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  BEEDRILL_15 ("Beedrill", "15", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  BRONZONG_E4_16 ("Bronzong E4", "16", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  DRAPION_E4_17 ("Drapion E4", "17", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _DARKNESS_]),
  ESPEON_E4_18 ("Espeon E4", "18", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  FLAREON_19 ("Flareon", "19", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  GALLADE_E4_20 ("Gallade E4", "20", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  GASTRODON_EAST_SEA_21 ("Gastrodon East Sea", "21", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GASTRODON_WEST_SEA_22 ("Gastrodon West Sea", "22", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  GOLEM_E4_23 ("Golem E4", "23", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _FIGHTING_]),
  HERACROSS_E4_24 ("Heracross E4", "24", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _GRASS_]),
  HIPPOWDON_25 ("Hippowdon", "25", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  JOLTEON_26 ("Jolteon", "26", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MAMOSWINE_GL_27 ("Mamoswine GL", "27", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _WATER_]),
  MR__MIME_E4_28 ("Mr. Mime E4", "28", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  NIDOKING_29 ("Nidoking", "29", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  NIDOQUEEN_30 ("Nidoqueen", "30", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  RAICHU_GL_31 ("Raichu GL", "31", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _LIGHTNING_]),
  RHYPERIOR_E4_32 ("Rhyperior E4", "32", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _FIGHTING_]),
  SNORLAX_33 ("Snorlax", "33", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  VAPOREON_34 ("Vaporeon", "34", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  VESPIQUEN_E4_35 ("Vespiquen E4", "35", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _GRASS_]),
  WALREIN_36 ("Walrein", "36", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  YANMEGA_E4_37 ("Yanmega E4", "37", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _GRASS_]),
  ALAKAZAM_E4_38 ("Alakazam E4", "38", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  ELECTRODE_G_39 ("Electrode G", "39", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _LIGHTNING_]),
  GENGAR_GL_40 ("Gengar GL", "40", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  GLACEON_41 ("Glaceon", "41", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  HIPPOWDON_E4_42 ("Hippowdon E4", "42", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _FIGHTING_]),
  INFERNAPE_E4_43 ("Infernape E4", "43", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _FIRE_]),
  LAIRON_44 ("Lairon", "44", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  LEAFEON_45 ("Leafeon", "45", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  MACHAMP_GL_46 ("Machamp GL", "46", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _FIGHTING_]),
  RAPIDASH_E4_47 ("Rapidash E4", "47", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _FIRE_]),
  SCIZOR_E4_48 ("Scizor E4", "48", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _GRASS_]),
  SHARPEDO_49 ("Sharpedo", "49", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  STARMIE_50 ("Starmie", "50", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  STEELIX_GL_51 ("Steelix GL", "51", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _METAL_]),
  TROPIUS_52 ("Tropius", "52", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  VIBRAVA_53 ("Vibrava", "53", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  WHISCASH_E4_54 ("Whiscash E4", "54", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _FIGHTING_]),
  AERODACTYL_GL_55 ("Aerodactyl GL", "55", Rarity.COMMON, [BASIC, POKEMON, POKEMON_SP, _FIGHTING_]),
  AMBIPOM_G_56 ("Ambipom G", "56", Rarity.COMMON, [BASIC, POKEMON, POKEMON_SP, _COLORLESS_]),
  ARON_57 ("Aron", "57", Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  CARVANHA_58 ("Carvanha", "58", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  EEVEE_59 ("Eevee", "59", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  FLAREON_E4_60 ("Flareon E4", "60", Rarity.COMMON, [BASIC, POKEMON, POKEMON_SP, _FIRE_]),
  FORRETRESS_G_61 ("Forretress G", "61", Rarity.COMMON, [BASIC, POKEMON, POKEMON_SP, _METAL_]),
  GLISCOR_E4_62 ("Gliscor E4", "62", Rarity.COMMON, [BASIC, POKEMON, POKEMON_SP, _FIGHTING_]),
  GROWLITHE_63 ("Growlithe", "63", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  HIPPOPOTAS_64 ("Hippopotas", "64", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  HOUNDOOM_E4_65 ("Houndoom E4", "65", Rarity.COMMON, [BASIC, POKEMON, POKEMON_SP, _DARKNESS_]),
  KAKUNA_66 ("Kakuna", "66", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  KECLEON_67 ("Kecleon", "67", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  KOFFING_68 ("Koffing", "68", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MUNCHLAX_69 ("Munchlax", "69", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  MUNCHLAX_70 ("Munchlax", "70", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  NIDORAN_FEMALE_71 ("Nidoran♀", "71", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  NIDORAN_MALE_72 ("Nidoran♂", "72", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  NIDORINA_73 ("Nidorina", "73", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  NIDORINO_74 ("Nidorino", "74", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  NUZLEAF_75 ("Nuzleaf", "75", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  QUAGSIRE_GL_76 ("Quagsire GL", "76", Rarity.COMMON, [BASIC, POKEMON, POKEMON_SP, _WATER_]),
  SEALEO_77 ("Sealeo", "77", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SEEDOT_78 ("Seedot", "78", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SHELLOS_EAST_SEA_79 ("Shellos East Sea", "79", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SHELLOS_WEST_SEA_80 ("Shellos West Sea", "80", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SNORLAX_81 ("Snorlax", "81", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SPHEAL_82 ("Spheal", "82", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  STARYU_83 ("Staryu", "83", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  TRAPINCH_84 ("Trapinch", "84", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  TURTWIG_GL_85 ("Turtwig GL", "85", Rarity.COMMON, [BASIC, POKEMON, POKEMON_SP, _GRASS_]),
  WEEDLE_86 ("Weedle", "86", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  WEEZING_87 ("Weezing", "87", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  AARON_S_COLLECTION_88 ("Aaron's Collection", "88", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BEBE_S_SEARCH_89 ("Bebe's Search", "89", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  BERTHA_S_WARMTH_90 ("Bertha's Warmth", "90", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  FLINT_S_WILLPOWER_91 ("Flint's Willpower", "91", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LUCIAN_S_ASSIGNMENT_92 ("Lucian's Assignment", "92", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  POKEMON_CONTEST_HALL_93 ("Pokémon Contest Hall", "93", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  SUNYSHORE_CITY_GYM_94 ("Sunyshore City Gym", "94", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  TECHNICAL_MACHINE_G_95 ("Team Galactic's Invention G-107 Technical Machine G", "95", Rarity.UNCOMMON, [TRAINER, ITEM, TECHNICAL_MACHINE]),
  SP_RADAR_96 ("Team Galactic's Invention G-109 SP Radar", "96", Rarity.UNCOMMON, [TRAINER, ITEM]),
  UNDERGROUND_EXPEDITION_97 ("Underground Expedition", "97", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  VOLKNER_S_PHILOSOPHY_98 ("Volkner's Philosophy", "98", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  DARKNESS_ENERGY_99 ("Darkness Energy", "99", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  METAL_ENERGY_100 ("Metal Energy", "100", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  SP_ENERGY_101 ("SP Energy", "101", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  UPPER_ENERGY_102 ("Upper Energy", "102", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  ALAKAZAM_E4_LV_X_103 ("Alakazam E4 Lv.X", "103", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _PSYCHIC_]),
  FLOATZEL_GL_LV_X_104 ("Floatzel GL Lv.X", "104", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _WATER_]),
  FLYGON_LV_X_105 ("Flygon Lv.X", "105", Rarity.HOLORARE, [LVL_X, POKEMON, _COLORLESS_]),
  GALLADE_E4_LV_X_106 ("Gallade E4 Lv.X", "106", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _PSYCHIC_]),
  HIPPOWDON_LV_X_107 ("Hippowdon Lv.X", "107", Rarity.HOLORARE, [LVL_X, POKEMON, _FIGHTING_]),
  INFERNAPE_E4_LV_X_108 ("Infernape E4 Lv.X", "108", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _FIRE_]),
  LUXRAY_GL_LV_X_109 ("Luxray GL Lv.X", "109", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _LIGHTNING_]),
  MISMAGIUS_GL_LV_X_110 ("Mismagius GL Lv.X", "110", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _PSYCHIC_]),
  SNORLAX_LV_X_111 ("Snorlax Lv.X", "111", Rarity.HOLORARE, [LVL_X, POKEMON, _COLORLESS_]),
  PIKACHU_112 ("Pikachu", "112", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  FLYING_PIKACHU_113 ("Flying Pikachu", "113", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  SURFING_PIKACHU_114 ("Surfing Pikachu", "114", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  FAN_ROTOM_RT1 ("Fan Rotom", "RT1", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  FROST_ROTOM_RT2 ("Frost Rotom", "RT2", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  HEAT_ROTOM_RT3 ("Heat Rotom", "RT3", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  MOW_ROTOM_RT4 ("Mow Rotom", "RT4", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  WASH_ROTOM_RT5 ("Wash Rotom", "RT5", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  CHARON_S_CHOICE_RT6 ("Charon's Choice", "RT6", Rarity.HOLORARE, [TRAINER, SUPPORTER]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  RisingRivals(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.RISING_RIVALS;
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
      case ARCANINE_1:
        return evolution (this, from:"Growlithe", hp:HP100, type:FIRE, retreatCost:2) {
          weakness W, PLUS20
          pokeBody "Flare Condition", {
            text "As long as Arcanine has any Energy attached to it, Arcanine has no Weakness."
            getterA (GET_WEAKNESSES, self) {h->
              if(self.cards.filterByEnergyType(R)) {
                h.object.clear()
              }
            }
          }
          move "Burn Out", {
            text "30+ damage. You may do 30 damage plus 30 more damage. If you do, Arcanine is now Burned."
            energyCost R, C
            onAttack {
              damage 30
              if(confirm("Deal 30 additional damage?")) {
                damage 30
                afterDamage {
                  apply BURNED, self
                }
              }
            }
          }
          move "Flames of Rage", {
            text "60+ damage. Discard a [R] Energy attached to Arcanine. This attack does 60 damage plus 10 more damage for each damage counter on Arcanine."
            energyCost R, C, C
            onAttack {
              damage 60 + 10 * self.numberOfDamageCounters
              discardSelfEnergyAfterDamage R
            }
          }

        };
      case BASTIODON_GL_2:
        return basic (this, hp:HP090, type:METAL, retreatCost:3) {
          weakness R
          resistance P, MINUS20
          move "Bounce Back", {
            text "30 damage. Your opponent switches the Defending Pokémon with one of his or her Benched Pokémon."
            energyCost M, C, C
            onAttack {
              damage 30
              whirlwind()
            }
          }
          move "Smack Attack", {
            text "60 damage. Remove 1 damage counter from Bastiodon."
            energyCost M, C, C, C
            onAttack {
              damage 60
              heal 10, self
            }
          }

        };
      case DARKRAI_G_3:
        return basic (this, hp:HP090, type:DARKNESS, retreatCost:2) {
          weakness F
          resistance P, MINUS20
          pokeBody "Eerie Aura", {
            text "Put 1 damage counter on each of your opponent’s Pokémon that remains Asleep between turns."
            delayedA {
              before BEGIN_TURN, {
                if (self.owner.opposite.pbg.active.isSPC(ASLEEP)) {
                  directDamage 10, opp.active, Source.POKEBODY
                }
              }
            }
          }
          move "Darkness Sleep", {
            text "50 damage. If the Defending Pokémon already has any damage counters on it, that Pokémon is now Asleep."
            energyCost D, C, C
            onAttack {
              damage 50
              if(defending.numberOfDamageCounters) {
                applyAfterDamage ASLEEP
              }
            }
          }

        };
      case FLOATZEL_GL_4:
        return basic (this, hp:HP080, type:WATER, retreatCost:1) {
          weakness L
          move "Incite", {
            text "Search your discard pile for up to 2 Supporter cards, show them to your opponent, and put them into your hand."
            energyCost ()
            attackRequirement {
              assert my.discard.filterByType(SUPPORTER) : "You have no supporter cards in your discard pile"
            }
            onAttack {
              my.discard.select(max:2, "Search you discard pile for up to 2 Supporter cards",cardTypeFilter(SUPPORTER)).showToOpponent("Incite: These cards will be returned to your opponent's hand").moveTo(my.hand)
            }
          }
          move "Giant Wave", {
            text "50 damage. Floatzel GL can’t use Giant Wave during your next turn."
            energyCost W, W
            onAttack {
              damage 50
              cantUseAttack(thisMove, self)
            }
          }

        };
      case FLYGON_5:
        return evolution (this, from:"Vibrava", hp:HP120, type:COLORLESS, retreatCost:0) {
          weakness C, PLUS30
          resistance L, MINUS20
          pokeBody "Rainbow Float", {
            text "If any basic Energy card attached to Flygon is the same type as any of your Pokémon, the Retreat Cost for those Pokémon is 0."
            getterA (GET_RETREAT_COST) { h ->
              if (!self.active && h.effect.target.owner == self.owner && h.effect.target.active && self.cards.filterByType(BASIC_ENERGY).any {
                h.effect.target.types.contains(it.asEnergyCard().energyTypes.first().first())
              }) {
                h.object = 0
              }
            }
          }
          move "Sand Wall", {
            text "40 damage. Discard a Stadium card your opponent has in play. If you do, prevent all effects of an attack, including damage, done to Flygon during your opponent’s next turn."
            energyCost C, C
            onAttack {
              damage 40

              if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player == self.owner.opposite) {
                preventAllEffectsNextTurn()
                afterDamage {
                  discard bg.stadiumInfoStruct.stadiumCard
                }
              }
            }
          }
          move "Power Swing", {
            text "60+ damage. Does 60 damage plus 10 more damage for each Evolved Pokémon on your Bench."
            energyCost C, C, C
            onAttack {
              damage 60 + 10 * my.bench.findAll{it.evolution}.size()
            }
          }

        };
      case FROSLASS_GL_6:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness M
          move "Sleep Inducer", {
            text "Switch the Defending Pokémon with one of your opponent’s Benched Pokémon. The new Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {
              assert opp.bench : "Your opponent has no Benched Pokémon"
            }
            onAttack {
              def target = opp.bench.select("Switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon.")
              if ( sw2(target) ) { apply ASLEEP, target }
            }
          }
          move "Wake-Up Slap", {
            text "30+ damage. If the Defending Pokémon is affected by any Special Conditions, this attack does 30 damage plus 20 more damage. Then, remove all Special Conditions from the Defending Pokémon."
            energyCost P, C
            onAttack {
              damage 30
              if(defending.specialConditions) {
                damage 20
                clearSpecialCondition defending
              }
            }
          }

        };
      case JIRACHI_7:
        return basic (this, hp:HP060, type:METAL, retreatCost:0) {
          weakness R, PLUS20
          resistance P, MINUS20
          pokePower "Final Wish", {
            text "Once during your opponent’s turn, if Jirachi would be Knocked Out by damage from an attack, you may search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
            delayedA {
              before (KNOCKOUT,self) {
                if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite && self.owner.pbg.deck && confirm("Use Final Wish?", self.owner)) {
                  powerUsed()
                  self.owner.pbg.deck.select("Search your deck for a card",{true},self.owner)
                  shuffleDeck()
                }
              }
            }
          }
          move "Detour", {
            text "If you have a Supporter card in play, use the effect of that card as the effect of this attack."
            energyCost ()
            attackRequirement {
              assert my.playedSupporter : "You don't have a Supporter in play"
            }
            onAttack {
              delayed {
                def eff
                register {
                  eff = getter (GET_MAX_SUPPORTER_PER_TURN) {h->
                    h.object = h.object + 1
                  }
                }
                unregister {
                  eff.unregister()
                }
                unregisterAfter 1
              }
              def card = my.playedSupporter.select("Select a Supporter to copy its effect as this attack.").first()
              bg.deterministicCurrentThreadPlayerType=self.owner
              bg.em().run(new PlayTrainer(card))
              bg.clearDeterministicCurrentThreadPlayerType()
            }
          }
          move "Swift", {
            text "20 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost M
            onAttack {
              swiftDamage(20, defending)
            }
          }

        };
      case LUCARIO_GL_8:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness P
          pokeBody "Boundary Aura", {
            text "Apply Weakness for each Pokémon as ×2 instead."
            getterA GET_WEAKNESSES, { h ->
              def pcs = h.effect.target
              def list = [] as List<Weakness>
              h.object.each {
                list.add(new Weakness(it.type, "X2"))
              }
              h.object = list
            }
          }
          move "Combo Throw", {
            text "30+ damage. Does 30 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
            energyCost M, C, C
            onAttack {
              damage 30 + 10 * defending.cards.energyCount(C)
            }
          }

        };
      case LUXRAY_GL_9:
        return basic (this, hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Bite", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }
          move "Trash Bolt", {
            text "70 damage. Discard an Energy card from your hand. (If you can’t discard a card from your hand, this attack does nothing.)"
            energyCost L, C, C
            attackRequirement {
              assert my.hand.filterByType(ENERGY) : "You have no Energy cards in your hand to discard"
            }
            onAttack {
              damage 70
              afterDamage {
                my.hand.select("Choose an Energy card to discard",cardTypeFilter(ENERGY)).discard()
              }
            }
          }

        };
      case MISMAGIUS_GL_10:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness D
          resistance C, MINUS20
          move "Psychic Removal", {
            text "10 damage. Flip 2 coins. If both of them are heads, discard all Energy attached to the Defending Pokémon."
            energyCost P
            onAttack {
              damage 10
              flip 2, {}, {}, [2:{
                afterDamage {
                  targeted (defending) {
                    opp.active.cards.filterByType(ENERGY).discard()
                  }
                }
              }]
            }
          }
          move "Grudge", {
            text "20+ damage. Does 20 damage plus 10 more damage for each Prize card your opponent has taken."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20+10*opp.prizeCardSet.takenCount
            }
          }

        };
      case RAMPARDOS_GL_11:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness G
          move "Trample", {
            text "Flip a coin for each Benched Pokémon. If that coin flip is heads, this attack does 30 damage to that Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              my.bench.each {pcs ->
                flip "$pcs", {
                  damage 30, pcs
                }
              }
              opp.bench.each {pcs ->
                flip "$pcs", {
                  damage 30, pcs
                }
              }
            }
          }
          move "Rend", {
            text "40+ damage. If the Defending Pokémon has any damage counters on it, this attack does 40 damage plus 20 more damage."
            energyCost F, C, C
            onAttack {
              damage 40
              if(defending.numberOfDamageCounters) {
                damage 20
              }
            }
          }

        };
      case ROSERADE_GL_12:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R
          move "Poison Bind", {
            text "10 damage. The Defending Pokémon is now Poisoned and can’t retreat during your opponent’s next turn."
            energyCost C
            onAttack {
              damage 10
              cantRetreat defending
              applyAfterDamage POISONED
            }
          }
          move "Long Whip", {
            text "30 damage. If the Defending Pokémon is affected by any Special Conditions, you may do 30 damage to any 1 Benched Pokémon instead."
            energyCost G, C
            onAttack {
              def tar = defending
              if(defending.specialConditions) {
                tar = opp.all.select("Choose 1 of your opponent's Pokémon")
              }
              damage 30, tar
            }
          }

        };
      case SHIFTRY_13:
        return evolution (this, from:"Nuzleaf", hp:HP130, type:DARKNESS, retreatCost:1) {
          weakness R, PLUS30
          resistance P, MINUS20
          pokeBody "Unlucky Wind", {
            text "As long as Shiftry is your Active Pokémon, whenever your opponent flips a coin during his or her turn, treat it as tails."
            delayedA {
              before COIN_FLIP, {
                if (bg.currentThreadPlayerType == self.owner.opposite && bg.currentTurn == self.owner.opposite && self.active) {
                  bc "$thisAbility forced the coin flip to be TAILS."
                  bg.deterministicCoinFlipQueue.offer(false)
                }
              }
            }
            getterA COIN_FLIP_GETTER, { h->
              if (bg.currentThreadPlayerType == self.owner.opposite && bg.currentTurn == self.owner.opposite && self.active) {
                h.object = false
              }
            }
          }
          move "Conform", {
            text "40 damage. If you have the same number of cards in your hand as your opponent, the Defending Pokémon is now Confused."
            energyCost D, C
            onAttack {
              damage 40
              if(my.hand.size() == opp.hand.size()) {
                applyAfterDamage CONFUSED
              }
            }
          }
          move "Seal Off", {
            text "60 damage. The Defending Pokémon can’t use any Poké-Powers or Poké-Bodies during your opponent’s next turn."
            energyCost D, C, C
            onAttack {
              damage 60
              afterDamage {
                delayed {
                  def eff
                  register{
                    eff = getter (IS_ABILITY_BLOCKED) { Holder h ->
                      if (h.effect.target.owner == self.owner.opposite && (h.effect.ability instanceof PokePower || h.effect.ability instanceof PokeBody)) {
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
                }
              }
            }
          }

        };
      case AGGRON_14:
        return evolution (this, from:"Lairon", hp:HP130, type:METAL, retreatCost:3) {
          weakness R, PLUS30
          resistance P, MINUS20
          def lastDamage = null
          def turnCount = null
          customAbility {
            delayed (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if (bg().currentTurn==self.owner.opposite) {
                  turnCount = bg.turnCount
                  lastDamage = bg().dm().find({it.to==self && it.dmg.value>=0})?.dmg
                }
              }
            }
          }
          move "Return Blow", {
            text "If Aggron was damaged by an attack during your opponent’s last turn, this attack does the same amount of damage done to Aggron to the Defending Pokémon."
            energyCost C, C
            attackRequirement {
              assert bg.turnCount == turnCount + 1 : "$self was not damaged by an attack last turn"
            }
            onAttack {
              damage lastDamage.value
            }
          }
          move "Metal Fang", {
            text "40 damage. You may discard the top card of your deck. If you do, remove 2 damage counters and all Special Conditions from Aggron."
            energyCost M, C, C
            onAttack {
              damage 40
              if (my.deck && confirm("Discard the top card of your deck?")) {
                afterDamage {
                  discard my.deck.first()
                  heal 20, self
                  clearSpecialCondition(self)
                }
              }
            }
          }
          move "Heavy Impact", {
            text "70 damage. "
            energyCost M, M, C, C
            onAttack {
              damage 70
            }
          }

        };
      case BEEDRILL_15:
        return evolution (this, from:"Kakuna", hp:HP110, type:GRASS, retreatCost:1) {
          weakness R, PLUS30
          pokePower "Flutter Wings", {
            text "Once during your turn , you may search your deck for a [G] Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward. This power can’t be used if Beedrill is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.deck : "Your deck is empty"
              powerUsed()
              my.deck.search("Search your deck for a [G] Pokémon",pokemonTypeFilter(G)).showToOpponent("Flutter Wings: Selected card").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Needle Shock", {
            text "30 damage. The Defending Pokémon is now Paralyzed and Poisoned. Ignore this effect if any of your Pokémon used Needle Shock during your last turn."
            energyCost G, C, C
            onAttack {
              damage 30
              afterDamage {
                if(bg.em().retrieveObject("Needle_Shock_"+thisCard.player)!=(bg.turnCount - 2)) {
                  apply PARALYZED
                  apply POISONED
                }
                bg.em().storeObject("Needle_Shock_"+thisCard.player,bg.turnCount)
              }
            }
          }

        };
      case BRONZONG_E4_16:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:3) {
          weakness P
          resistance R, MINUS20
          move "Hand Refresh", {
            text "Each player shuffles his or her hand into his or her deck and draws up to 4 cards. (You draw your cards first.)"
            energyCost ()
            attackRequirement {
              assert my.hand||my.deck||opp.hand||opp.deck : "Neither you nor your opponent have any cards in your hands or decks"
            }
            onAttack {
              my.hand.moveTo(hidden:true,my.deck)
              shuffleDeck()
              opp.hand.moveTo(hidden:true,opp.deck)
              shuffleDeck(null, TargetPlayer.OPPONENT)
              draw choose((1..4),"Draw how many cards?")
              draw oppChoose((1..4),"Draw how many cards?"), TargetPlayer.OPPONENT
            }
          }
          move "Payback", {
            text "10+ damage. If your opponent has only 1 Prize card left, this attack does 10 damage plus 50 more damage and the Defending Pokémon is now Confused."
            energyCost P, C
            onAttack {
              damage 10
              if (opp.prizeCardSet.size() == 1) {
                damage 50
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case DRAPION_E4_17:
        return basic (this, hp:HP100, type:DARKNESS, retreatCost:3) {
          weakness F
          resistance P, MINUS20
          move "Body Slam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Mega Impact", {
            text "70 damage. "
            energyCost P, C, C, C
            onAttack {
              damage 70
            }
          }

        };
      case ESPEON_E4_18:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P
          move "Hypnosis", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Psywave", {
            text "20+ damage. Does 20 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20+10*defending.cards.energyCount(C)
            }
          }

        };
      case FLAREON_19:
        return evolution (this, from:"Eevee", hp:HP080, type:FIRE, retreatCost:1) {
          weakness W, PLUS20
          pokePower "Undevelop", {
            text "Once during your turn , you may devolve Flareon and put Flareon into your hand. This power can’t be used if Flareon is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              powerUsed()
              devolve(self,self.topPokemonCard,my.hand)
            }
          }
          move "Tail Slap", {
            text "30 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Evolving Flare", {
            text "40+ damage. If Flareon evolved from Eevee during this turn, this attack does 40 damage plus 20 more damage and the Defending Pokémon is now Burned."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 40
              if (self.lastEvolved == bg.turnCount && self.cards.any{it.name.contains("Eevee")}) {
                damage 20
                applyAfterDamage BURNED
              }
            }
          }

        };
      case GALLADE_E4_20:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P
          move "Chop Up", {
            text "20 damage. Does 10 damage to each of your opponent’s Benched Pokémon that has any damage counters on it."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
              opp.bench.each {
                if(it.numberOfDamageCounters) {
                  damage 10, it
                }
              }
            }
          }
          move "Feint", {
            text "50 damage. This attack’s damage isn’t affected by Resistance."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 50
              dontApplyResistance()
            }
          }

        };
      case GASTRODON_EAST_SEA_21:
        return evolution (this, from:"Shellos East Sea", hp:HP090, type:WATER, retreatCost:1) {
          weakness G, PLUS30
          resistance L, MINUS20
          pokeBody "Sticky Hold", {
            text "If Gastrodon East Sea is switched or retreats to your Bench, move as many Energy cards attached to Gastrodon East Sea as you like to the new Active Pokémon."
            delayedA {
              after FALL_BACK, self, {
                if(self.cards.energyCount(C) && confirm("Use Sticky Hold?")) {
                  def energyList = self.cards.select(max:self.cards.filterByType(ENERGY).size(),"Move any number of Energy cards attached from $self to ${self.owner.pbg.active}",cardTypeFilter(ENERGY))
                  energyList.each {
                    energySwitch(self,self.owner.pbg.active,it,true)
                  }
                  bc "$thisAbility activates"
                }
              }
            }
          }
          move "Calling Wave", {
            text "Search your deck for up to 2 Gastrodon and put them onto your Bench as Basic Pokémon. Put 2 damage counters on each of them. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
              assert my.bench.notFull : "Your bench is full"
            }
            onAttack {
              def max = Math.min(2,my.bench.freeBenchCount)
              my.deck.search(max:max,"Search your deck for up to 2 Gastrodon to put onto your bench",{it.cardTypes.is(POKEMON) && it.name.contains("Gastrodon")}).each {
                def pcs = benchPCS(it)
                directDamage 20, pcs
              }
              shuffleDeck()
            }
          }
          move "Wave Splash", {
            text "40 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }

        };
      case GASTRODON_WEST_SEA_22:
        return evolution (this, from:"Shellos West Sea", hp:HP110, type:FIGHTING, retreatCost:3) {
          weakness G
          resistance L, MINUS20
          move "Tackle", {
            text "50 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
          move "Muddy Bomb", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon and 10 damage to each of your opponent’s other Pokémon."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              def tar = opp.all.select("Deal 30 damage to which Pokémon?")
              damage 30, tar
              opp.all.each {
                if(it!=tar) {
                  damage 10, it
                }
              }
            }
          }
          move "Raging Sea", {
            text "60+ damage. Does 60 damage plus 10 more damage for each of your Benched Pokémon that has any damage counters on it."
            energyCost F, C, C, C
            attackRequirement {}
            onAttack {
              damage 60 + 10 * my.bench.findAll{it.numberOfDamageCounters}.size()
            }
          }

        };
      case GOLEM_E4_23:
        return basic (this, hp:HP110, type:FIGHTING, retreatCost:4) {
          weakness G
          resistance L, MINUS20
          move "Rage", {
            text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on Golem E4."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 20 + 10 * self.numberOfDamageCounters
            }
          }
          move "Double-edge", {
            text "100 damage. Golem E4 does 60 damage to itself."
            energyCost F, C, C, C
            attackRequirement {}
            onAttack {
              damage 100
              damage 60, self
            }
          }

        };
      case HERACROSS_E4_24:
        return basic (this, hp:HP090, type:GRASS, retreatCost:2) {
          weakness R
          move "Focus Energy", {
            text "During your next turn, Heracross E4's Megahorn attack's base damage is 100. "
            energyCost ()
            attackRequirement {}
            onAttack {
              increasedBaseDamageNextTurn("Megahorn",hp(50))
            }
          }
          move "Megahorn", {
            text "50 damage. Flip a coin. If tails, this attack does nothing."
            energyCost G, C
            attackRequirement {}
            onAttack {
              flip {
                damage 50
              }
            }
          }

        };
      case HIPPOWDON_25:
        return evolution (this, from:"Hippopotas", hp:HP110, type:FIGHTING, retreatCost:4) {
          weakness W, PLUS20
          resistance L, MINUS20
          pokeBody "Sand Cover", {
            text "As long as Hippowdon is your Active Pokémon, put 1 damage counter on each of your opponent’s Pokémon LV.X between turns."
            delayedA {
              before BEGIN_TURN, {
                if(self.active &&self.owner.opposite.pbg.all.find{it.pokemonLevelUp}) {
                  bc "$thisAbility activates"
                  self.owner.opposite.pbg.all.findAll{it.pokemonLevelUp}.each {
                    directDamage 10, it, Source.POKEBODY
                  }
                }
              }
            }
          }
          move "Save Sand", {
            text "20+ damage. Does 20 damage plus 10 damage for each Energy attached to Hippowdon. Before doing damage, you may search your discard pile for a [F] Energy card and attach it to Hippowdon."
            energyCost C
            attackRequirement {}
            onAttack {
              if(my.discard.filterByEnergyType(F) && confirm("You may search your discard pile for a [F] Energy card and attach it to $self")) {
                attachEnergyFrom(type:F,my.discard,self)
              }
              damage 20 + 10 * self.cards.energyCount(C)
            }
          }
          move "Groundquake", {
            text "80 damage. Does 10 damage to each benched Pokémon that isn't an Evolved Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon)."
            energyCost F, F, C, C
            attackRequirement {}
            onAttack {
              damage 80
              my.bench.each {
                if(!it.evolution) {
                  directDamage 10, it
                }
              }
              opp.bench.each {
                if(!it.evolution) {
                  directDamage 10, it
                }
              }
            }
          }

        };
      case JOLTEON_26:
        return evolution (this, from:"Eevee", hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          pokePower "Undevelop", {
            text "Once during your turn , you may devolve Jolteon and put Jolteon into your hand. This power can’t be used if Jolteon is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              powerUsed()
              devolve(self,self.topPokemonCard,my.hand)
            }
          }
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                damage 30
              }
            }
          }
          move "Evolving Thunder", {
            text "50 damage. If Jolteon evolved from Eevee during this turn, this attack does 10 damage to each of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon)."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 50
              if (self.lastEvolved == bg.turnCount && self.cards.any{it.name.contains("Eevee")}) {
                opp.bench.each {
                  damage 10, it
                }
              }
            }
          }

        };
      case MAMOSWINE_GL_27:
        return basic (this, hp:HP100, type:WATER, retreatCost:4) {
          weakness M
          resistance L, MINUS20
          pokeBody "Icy Aura", {
            text "As long as Mamoswine GL is your Active Pokémon, put 1 damage counter on each Active Pokémon (excluding W Pokémon) between turns."
            delayedA {
              before BEGIN_TURN, {
                if (self.active) {
                  def selfWaterType = self.types.contains(W)
                  def oppWaterType = self.owner.opposite.pbg.active.types.contains(W)
                  if (!selfWaterType||!oppWaterType) {
                    bc "$thisAbility Activates"
                  }
                  if (!oppWaterType) {
                    directDamage(10, self.owner.opposite.pbg.active, Source.POKEBODY)
                  }
                  if (!selfWaterType) {
                    directDamage(10, self, Source.POKEBODY)
                  }
                }
              }
            }
          }
          move "Avalanche", {
            text "60 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Benched Pokémon."
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 60
              flip {
                opp.bench.each {
                  damage 10, it
                }
              }
            }
          }

        };
      case MR__MIME_E4_28:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness P
          move "Magic Heal", {
            text "Flip 3 coins. Remove a number of damage counters equal to the number of heads from your Pokémon in any way you like."
            energyCost ()
            attackRequirement {
              assert my.all.find{it.numberOfDamageCounters} : "Your Pokémon are healthy"
            }
            onAttack {
              flip 3, {
                def damaged = my.all.findAll{it.numberOfDamageCounters}
                if(damaged) {
                  heal 10, damaged
                }
              }
            }
          }
          move "Barrier Attack", {
            text "30 damage. During your opponent's next turn, any damage done to Mr.Mime E4 by attacks is reduced by 10."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 30
              reduceDamageNextTurn(hp(10),thisMove)
            }
          }

        };
      case NIDOKING_29:
        return evolution (this, from:"Nidorino", hp:HP130, type:FIGHTING, retreatCost:2) {
          weakness W, PLUS30
          resistance L, MINUS20
          pokeBody "Territoriality", {
            text "If your Active Pokémon is damaged by an opponent’s attack , put 2 damage counters on the Attacking Pokémon. You can’t put more than 2 damage counters in this way."
            delayedA {
              def flag = false
              before APPLY_ATTACK_DAMAGES, {
                flag = bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self.owner.pbg.active && it.dmg.value})
              }
              after APPLY_ATTACK_DAMAGES, {
                if (flag && ef.attacker.inPlay && bg.em().retrieveObject("Territoriality") != bg.turnCount) {
                  directDamage 20, ef.attacker, Source.POKEBODY
                  flag = false
                  bg.em().storeObject("Territoriality",bg.turnCount)
                }
              }
            }
          }
          move "Fling Away", {
            text "60 damage. If your opponent has any Benched Pokémon, this attack’s base damage is 30 instead of 60 and this attack does 30 damage to 1 of your opponent’s Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              if(opp.bench) {
                damage 30, opp.bench.select("Does 30 damage to 1 of your opponent's Benched Pokémon")
              } else {
                damage 30
              }
            }
          }
          move "Giga Horn", {
            text "100 damage. Flip 2 coins. If both of them are tails, this attack does nothing."
            energyCost F, C, C, C
            onAttack {
              flip 2, {}{},[2:{damage 100},1:{damage 100}]
            }
          }

        };
      case NIDOQUEEN_30:
        return evolution (this, from:"Nidorina", hp:HP120, type:PSYCHIC, retreatCost:3) {
          weakness P, PLUS30
          resistance L, MINUS20
          pokeBody "Maternal Comfort", {
            text "At any times between turns, remove 1 damage counter from each of your Pokémon. You can’t use more than 1 Maternal Comfort Poké-Body between turns."
            delayedA {
              before BEGIN_TURN, {
                if(bg.em().retrieveObject("Maternal Comfort")!=bg.turnCount && my.all.find{it.numberOfDamageCounters}) {
                  bc "$thisAbility Activates"
                  my.all.each {
                    heal 10, it, Source.POKEBODY
                  }
                }
              }
            }
          }
          move "Mega Punch", {
            text "40 damage. "
            energyCost P
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
          move "Ruthless Tail", {
            text "50+ damage. Does 50 damage plus 10 more damage for each of your opponent’s Benched Pokémon."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 50 + 10 * opp.bench.size()
            }
          }

        };
      case RAICHU_GL_31:
        return basic (this, hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F
          resistance M, MINUS20
          move "Thunder Throw", {
            text "Choose 2 of your opponent’s Benched Pokémon. This attack does 10 damage to each of them."
            energyCost C
            attackRequirement {
              assert opp.bench : "Your opponent has no Benched Pokémon"
            }
            onAttack {
              multiSelect(opp.bench,2,text).each {
                damage 10, it
              }
            }
          }
          move "Repeat Lightning", {
            text "30+ damage. Does 30 damage plus 10 more damage for each of your opponent’s Benched Pokémon that has any damage counters on it."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 30 + 10 * opp.bench.findAll{it.numberOfDamageCounters}.size()
            }
          }

        };
      case RHYPERIOR_E4_32:
        return basic (this, hp:HP100, type:FIGHTING, retreatCost:3) {
          weakness W
          resistance L, MINUS20
          move "Double Lariat", {
            text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost F, C
            attackRequirement {}
            onAttack {
              flip 2, {
                damage 30
              }
            }
          }
          move "Rock Tumble", {
            text "60 damage. This attack’s damage isn’t affected by Resistance."
            energyCost F, F, C, C
            attackRequirement {}
            onAttack {
              damage 60
              dontApplyResistance()
            }
          }

        };
      case SNORLAX_33:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
          weakness F, PLUS20
          move "Pick and Collect", {
            text "Search your discard pile for up to 4 basic Energy cards, show them to your opponent, and put them into your hand."
            energyCost ()
            attackRequirement {
              assert my.discard.filterByType(BASIC_ENERGY) : "You have no basic Energy cards in your discard pile"
            }
            onAttack {
              my.discard.select(max:4,"Search your discard pile for up to 4 basic Energy cards",cardTypeFilter(BASIC_ENERGY)).showToOpponent("Pick and Collect: Selected cards").moveTo(my.hand)
            }
          }
          move "Roll Over", {
            text "60 damage. Flip a coin. If heads, both Snorlax and the Defending Pokémon are now Asleep. If tails, Snorlax is now Asleep."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              afterDamage {
                apply ASLEEP, self
                flip {
                  apply ASLEEP
                }
              }
            }
          }

        };
      case VAPOREON_34:
        return evolution (this, from:"Eevee", hp:HP090, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          pokePower "Undevelop", {
            text "Once during your turn , you may devolve Vaporeon and put Vaporeon into your hand. This power can’t be used if Vaporeon is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              powerUsed()
              devolve(self,self.topPokemonCard,my.hand)
            }
          }
          move "Muddy Water", {
            text "20 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
              if(opp.bench) {
                damage 10, opp.bench.select("Does 10 damage to one of your opponent's Benched Pokémon")
              }
            }
          }
          move "Evolving Aqua", {
            text "Choose 1 of your opponent's Pokémon that has any damage counters on it. This attack does 40 damage to that Pokémon. If Vaporeon evolved from Eevee during this turn, this attack does 60 damage instead."
            energyCost W, C
            attackRequirement {
              assert opp.all.find{it.numberOfDamageCounters} : "All of your opponent's Pokémon are healthy"
            }
            onAttack {
              def tar = opp.all.findAll{it.numberOfDamageCounters}.select("Choose 1 of your opponent's  Pokémonthat has any damage counters on it")
              damage 40, tar
              if (self.lastEvolved == bg.turnCount && self.cards.any{it.name.contains("Eevee")}) {
                opp.bench.each {
                  damage 20, tar
                }
              }
            }
          }

        };
      case VESPIQUEN_E4_35:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          pokeBody "Royal Gain", {
            text "When you attach a [G] Energy card from your hand to Vespiquen E4, remove 1 damage counter from Vespiquen 4."
            delayedA {
              after ATTACH_ENERGY, self, {
                if (ef.reason==PLAY_FROM_HAND && ef.card.asEnergyCard().containsType(G)) {
                  bc "$thisAbility heals 10 damage from $self"
                  heal 10, self, Source.POKEBODY
                }
              }
            }
          }
          move "Leaf Needle", {
            text "30+ damage. Flip a coin for each [G] Energy attached to Vespiquen 4. This attack does 30 damage plus 20 more damage for each heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip self.cards.energyCount(G), {
                damage 20
              }
            }
          }

        };
      case WALREIN_36:
        return evolution (this, from:"Sealeo", hp:HP140, type:WATER, retreatCost:4) {
          weakness M, PLUS30
          pokePower "Gather Ice", {
            text "Once during your turn , when you play Walrein from your hand to evolve 1 of your Pokémon, you may attach as many [W] Energy cards from your hand to Walrein as you like."
            onActivate{reason ->
              if(reason == PLAY_FROM_HAND && my.hand.filterByEnergyType(W) && confirm("Use Gather Ice?")){
                powerUsed()
                my.hand.select(min:0,max:my.hand.filterByEnergyType(W).size(),"Attach as many [W] Energy cards from your hand to $self as you like",energyFilter(W)).each {
                  attachEnergy(self,it,PLAY_FROM_HAND)
                }
              }
            }
          }
          move "Cold Crush", {
            text "70 damage. Discard an Energy card attached to Walrein and then discard an Energy attached to the Defending Pokémon."
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 70
              discardSelfEnergyAfterDamage C
              discardDefendingEnergyAfterDamage C
            }
          }

        };
      case YANMEGA_E4_37:
        return basic (this, hp:HP090, type:GRASS, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Skill Dive", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10, opp.all.select(text)
            }
          }
          move "Whirlwind", {
            text "50 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 50
              whirlwind()
            }
          }

        };
      case ALAKAZAM_E4_38:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P
          move "Recover", {
            text "Energy attached to Alakazam and remove 4 damage counters from Alakazam ."
            energyCost P
            attackRequirement {}
            onAttack {
              discardSelfEnergy P
              heal 40, self
            }
          }
          move "Mysterious Beam", {
            text "30 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                discardDefendingEnergyAfterDamage C
              }
            }
          }

        };
      case ELECTRODE_G_39:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Reckless Bomb", {
            text "This attack does 20 damage to each of your opponent's Pokémon. Electrode G does 100 damage to itself."
            energyCost L
            attackRequirement {}
            onAttack {
              opp.all.each{
                damage 20, it
              }
              damage 100, self
            }
          }
          move "Reflect Energy", {
            text "30 damage. Move an energy attached Electrode G to 1 of your Benched Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              if(my.bench && self.cards.filterByType(ENERGY)) {
                moveEnergy(self,my.bench)
              }
            }
          }

        };
      case GENGAR_GL_40:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness D
          resistance C, MINUS20
          move "Confuse Ray", {
            text "10 damage. The Defending Pokémon is now Confused."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage CONFUSED
            }
          }
          move "Attack and Hide", {
            text "Put 3 damage counters on 1 of your opponent's Pokémon. You may shuffle Gengar GL and all cards attached to it back into your deck."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              directDamage 30, opp.all.select("Put 3 damage counters on 1 of your opponent's Pokémon")
              afterDamage {
                if(confirm("Shuffle $self and all cards attached to it into your deck?")) {
                  self.cards.moveTo(my.deck)
                  shuffleDeck()
                  removePCS(self)
                }
              }
            }
          }

        };
      case GLACEON_41:
        return evolution (this, from:"Eevee", hp:HP080, type:WATER, retreatCost:1) {
          weakness M, PLUS20
          pokeBody "Frost Wind", {
            text "As long as Glaceon is your Active Pokémon, any damage done to your Pokémon by your opponent’s attacks is reduced by 10 ."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(self.active && it.to.owner == self.owner && it.from.owner == self.owner.opposite && it.dmg.value && it.notNoEffect){
                    bc "$thisAbility Wind -10"
                    it.dmg -= hp(10)
                  }
                }
              }
            }
          }
          move "Ice Blade", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30, opp.all.select(text)
            }
          }
          move "Ice Bind", {
            text "50 damage. If your opponent doesn’t discard a card from his or her hand, the Defending Pokémon is now Paralyzed."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 50
              afterDamage {
                if(!opp.hand.oppSelect(min:0,"You may discard a card. If you don't, $defending will be Paralyzed").discard()) {
                  apply PARALYZED
                }
              }
            }
          }

        };
      case HIPPOWDON_E4_42:
        return basic (this, hp:HP090, type:FIGHTING, retreatCost:2) {
          weakness W
          resistance L, MINUS20
          pokeBody "Sand Armor", {
            text "If Hippowdon E4 has any Energy attached to it, any damage done to Hippowdon 4 by attacks is reduced by 10 ."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && it.notNoEffect && it.dmg.value){
                    bc "$thisAbility -10"
                    it.dmg -= hp(10)
                  }
                }
              }
            }
          }
          move "Bite and Crush", {
            text "30+ damage. Flip 2 coins. This attack does 30 damage plus 10 more damage for each heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip 2, {
                damage 10
              }
            }
          }

        };
      case INFERNAPE_E4_43:
        return basic (this, hp:HP090, type:FIRE, retreatCost:1) {
          weakness W
          move "Split Bomb", {
            text "Choose 2 of your opponent’s Pokémon. This attack does 20 damage to each of them."
            energyCost R, C
            attackRequirement {}
            onAttack {
              multiSelect(opp.all,2,text).each {
                damage 20, it
              }
            }
          }
          move "High Jump Kick", {
            text "50 damage. "
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case LAIRON_44:
        return evolution (this, from:"Aron", hp:HP080, type:METAL, retreatCost:2) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Heavy Metal", {
            text "10+ damage. Flip a coin for each [M] Energy attached to Lairon. This attack does 10 damage plus 20 more damage for each heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip self.cards.energyCount(M), {
                damage 20
              }
            }
          }
          move "Granite Head", {
            text "40 damage. During your opponent's next turn, any damage done to Lairon by attacks is reduced by 10."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 40
              reduceDamageNextTurn(hp(10),thisMove)
            }
          }

        };
      case LEAFEON_45:
        return evolution (this, from:"Eevee", hp:HP090, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          resistance W, MINUS20
          pokeBody "Energy Refresh", {
            text "As long as Leafeon is your Active Pokémon, whenever you attach an Energy card from your hand to 1 of your Pokémon, remove 2 damage counters from that Pokémon."
            delayedA {
              after ATTACH_ENERGY, {
                if (ef.reason == PLAY_FROM_HAND && bg.currentTurn == self.owner.opposite && self.active) {
                  bc "$thisAbility activates."
                  heal 20, ef.resolvedTarget, Source.POKEBODY
                }
              }
            }
          }
          move "Plus Energy", {
            text "40 damage. Attach a basic Energy card from your hand to 1 of your Pokémon."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 40
              afterDamage {
                if(my.hand.filterByType(BASIC_ENERGY)) {
                  def card = my.hand.select(min:0,"You may attack a basic Energy card from your hand to 1 of your Pokémon",cardTypeFilter(BASIC_ENERGY)).first()
                  if(card) {
                    def tar = my.all.select("Attach $card to which Pokémon?")
                    attachEnergy(tar,card,PLAY_FROM_HAND)
                  }
                }
              }
            }
          }
          move "Soothing Scent", {
            text "60 damage. The Defending Pokémon is now Asleep."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 60
              applyAfterDamage ASLEEP
            }
          }

        };
      case MACHAMP_GL_46:
        return basic (this, hp:HP100, type:FIGHTING, retreatCost:3) {
          weakness P
          move "Cross-Cut", {
            text "30+ damage. If the Defending Pokémon is an Evolved Pokémon, this attack does 30 damage plus 20 more damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              if(defending.evolution) {
                damage 20
              }
            }
          }
          move "Brush Off", {
            text "Put the Defending Pokémon and all cards attached to it on top of your opponent’s deck. Your opponent shuffles his or her deck afterward. (If your opponent doesn’t have any Benched Pokémon, this attack does nothing.)"
            energyCost F, F, C, C
            attackRequirement {
              assert opp.bench : "Your opponent has no Benched Pokémon"
            }
            onAttack {
              targeted(defending) {
                defending.cards.moveTo(opp.deck)
                shuffleDeck null, TargetPlayer.OPPONENT
                removePCS(defending)
              }
            }
          }

        };
      case RAPIDASH_E4_47:
        return basic (this, hp:HP070, type:FIRE, retreatCost:0) {
          weakness W
          move "Pickup Power", {
            text "Flip 3 coins. For each heads, search your discard pile for a basic Energy card, show it to your opponent, and put it into your hand."
            energyCost ()
            attackRequirement {
              assert my.discard.filterByType(BASIC_ENERGY) : "You have no basic Energy cards in your discard"
            }
            onAttack {
              def count = 0
              flip 3, {
                count ++
              }
              count = Math.min(count,my.discard.filterByType(BASIC_ENERGY).size())
              if(count) {
                my.discard.select(count:count,"Search your discar pile for $count basic Energy cards to put into your hand").showToOpponent("Pickup Power: Selected Cards").moveTo(my.hand)
              }
            }
          }
          move "Fire Mane", {
            text "20 damage. "
            energyCost R
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case SCIZOR_E4_48:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R
          move "Cut", {
            text "20 damage. "
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Crushing Blow", {
            text "40 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip {
                discardDefendingEnergyAfterDamage C
              }
            }
          }

        };
      case SHARPEDO_49:
        return evolution (this, from:"Carvanha", hp:HP090, type:DARKNESS, retreatCost:0) {
          weakness L, PLUS20
          resistance P, MINUS20
          pokeBody "Energy Shark", {
            text "If Sharpedo is your Active Pokémon and is damaged by an opponent’s attack , flip a coin. If heads, discard an Energy card attached to the Attacking Pokémon."
            ifActiveAndDamagedByAttackBody(delegate){
              if (ef.attacker.cards.filterByType(ENERGY)) {
                bc "$thisAbility Activates"
                flip {
                  ef.attacker.cards.select("Select an Energy to discard", cardTypeFilter(ENERGY), self.owner).discard()
                }
              }
            }
          }
          move "Crunch", {
            text "20 damage. If an attack does damage to the defending Pokémon, that attack does 40 more damage to that Pokémon until the end of your next turn."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 20
              increasedDamageDoneToDefending(self,defending,40,thisMove.name)
            }
          }
          move "Sharp Fang", {
            text "60 damage. "
            energyCost D, C, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }

        };
      case STARMIE_50:
        return evolution (this, from:"Staryu", hp:HP080, type:WATER, retreatCost:0) {
          weakness L, PLUS20
          pokePower "Aqua Recycle", {
            text "Once during your turn , you may search your discard pile for a [W] Energy card, show it to your opponent, and put it into your hand. This power can’t be used if Starmie is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.discard.filterByEnergyType(W) : "You have no [W] Energy cards in your discard pile"
              powerUsed()
              my.discard.select("Search your discard pile for a [W] Energy card",energyFilter(W)).moveTo(my.hand)
            }
          }
          move "Synchro Gain", {
            text "20 damage. If Starmie and the Defending Pokémon have the same amount of Energy attached to them, remove 4 damage counters from Starmie."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
              if(self.cards.energyCount(C) == defending.cards.energyCount(C)) {
                heal 40, self
              }
            }
          }
          move "Powerful Spin", {
            text "40 damage. Starmie can’t attack during your next turn."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 40
              cantAttackNextTurn(self)
            }
          }

        };
      case STEELIX_GL_51:
        return basic (this, hp:HP110, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          move "Mend", {
            text "Search your discard pile for a [M] Energy card and attach it to Steelix GL. If you do, remove 1 damage counter from Steelix ."
            energyCost C, C
            attackRequirement {
              assert my.discard.filterByEnergyType(M) : "You have no [M] Energy cards in your discard pile"
            }
            onAttack {
              def energy = my.discard.select("Search your discard pile for a [M] Energy card",energyFilter(M)).first()
              attachEnergy(self,energy)
              heal 10, self
            }
          }
          move "Squeeze", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 50 more damage and the Defending Pokémon is now Paralyzed."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                damage 50
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case TROPIUS_52:
        return basic (this, hp:HP080, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Fly", {
            text "30 damage. Flip a coin. If tails, this attack does nothing. If heads, prevent all effects of an attack, including damage, done to Tropius during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                damage 30
                preventAllEffectsNextTurn()
              }
            }
          }
          move "Blessed Fruit", {
            text "Remove all damage counters from one of your benched [G] Pokémon."
            energyCost G, G
            attackRequirement {
              assert my.all.find{it.types.contains(G) && it.numberOfDamageCounters} : "All of your benched [G] Pokémon are healthy"
            }
            onAttack {
              def pcs = my.all.findAll{it.types.contains(G) && it.numberOfDamageCounters}.select(text)
              healAll(pcs)
            }
          }
          move "Solarbeam", {
            text "60 damage. "
            energyCost G, C, C, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }

        };
      case VIBRAVA_53:
        return evolution (this, from:"Trapinch", hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS20
          resistance L, MINUS20
          move "Energy Typhoon", {
            text "20× damage. Does 20 damage times the number of Energy cards in your opponent’s discard pile. Then, put those Energy cards on top of your opponent’s deck. Your opponent shuffles his or her deck afterward."
            energyCost C
            attackRequirement {
              assert opp.discard.filterByType(ENERGY) : "There are no Energy cards in your opponent's discard pile"
            }
            onAttack {
              damage 20 * opp.discard.filterByType(ENERGY).size()
              afterDamage {
                opp.discard.filterByType(ENERGY).moveTo(opp.deck)
                shuffleDeck()
              }
            }
          }
          move "Quick Attack", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip {
                damage 20
              }
            }
          }

        };
      case WHISCASH_E4_54:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness G
          resistance L, MINUS20
          move "Sleep Pulse", {
            text "10 damage. The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              applyAfterDamage ASLEEP
            }
          }
          move "Earthquake", {
            text "60 damage. Does 10 damage to each of your Benched Pokémon."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 60
              my.bench.each {
                damage 10, it
              }
            }
          }

        };
      case AERODACTYL_GL_55:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:0) {
          weakness L
          resistance F, MINUS20
          move "Collect", {
            text "Draw 2 cards."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              draw 2
            }
          }
          move "Primal Breath", {
            text "30 damage. Your opponent can’t play any Pokémon from his or her hand to Evolve or to Level Up the Defending Pokémon during his or her next turn."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {
                targeted (defending) {
                  bc "During ${opp.owner.getPlayerUsername(bg)}'s next turn, ${opp.owner.getPlayerUsername(bg)} can't play any Pokémon from their hand to Evolve or Level Up the defending $defending. (This effect can be removed by evolving or benching ${defending}.)"
                  def pcs = defending
                  delayed {
                    def warnAndPrevent = {
                      if (self.active && bg.currentTurn == self.owner.opposite) {
                        wcu "$self's $thisMove prevents playing Pokémon from your hand to evolve your Pokémon"
                        prevent()
                      }
                    }
                    before LEVEL_UP, pcs, {
                      if((ef as LevelUp).levelUpCard.player.pbg.hand.contains(ef.levelUpCard)) {
                        warnAndPrevent()
                      }
                    }
                    before LEVEL_UP_STANDARD, pcs, {
                      if((ef as LevelUpStandard).levelUpCard.player.pbg.hand.contains(ef.levelUpCard)) {
                        warnAndPrevent()
                      }
                    }
                    before EVOLVE, pcs, {
                      if ((ef as Evolve).evolutionCard.player.pbg.hand.contains(ef.evolutionCard)) {
                        warnAndPrevent()
                      }
                    }
                    before EVOLVE_STANDARD, pcs, {
                      if ((ef as EvolveStandard).evolutionCard.player.pbg.hand.contains(ef.evolutionCard)) {
                        warnAndPrevent()
                      }
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

        };
      case AMBIPOM_G_56:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Tail Code", {
            text "Move an Energy card attached to the Defending Pokémon to another of your opponent’s Pokémon."
            energyCost C
            attackRequirement {
              assert opp.bench : "Your opponent has no other Pokémon"
            }
            onAttack {
              if (opp.active.cards.filterByType(ENERGY) && opp.bench) {
                def energy = opp.active.findAll{it.cards.filterByType(ENERGY)}.select("Select energy to move to benched Pokémon").first()
                def tar = opp.bench.select("Select the Pokémon to move energy to")
                energySwitch(opp.active, tar, energy)
              }
            }
          }
          move "Snap Attack", {
            text "60 damage. If the Defending Pokémon has any Energy cards attached to it, this attack’s base damage is 20 instead of 60."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              if (!opp.active.cards.filterByType(ENERGY)) {
                damage 40
              }
            }
          }
        };
      case ARON_57:
        return basic (this, hp:HP050, type:METAL, retreatCost:1) {
          weakness R, PLUS10
          resistance P, MINUS20
          move "Iron Head", {
            text "10× damage. Flip a coin until you get tails. This attack does 10 damage times the number of heads."
            energyCost M
            attackRequirement {}
            onAttack {
             flipUntilTails {
               damage 10
             }
            }
          }
          move "Ram", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case CARVANHA_58:
        return basic (this, hp:HP040, type:DARKNESS, retreatCost:1) {
          weakness L, PLUS10
          resistance P, MINUS20
          move "Scary Face", {
            text "Flip a coin. If heads, the Defending Pokémon can’t attack or retreat during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                cantRetreat defending
                cantAttackNextTurn defending
              }
            }
          }
          move "Whirlpool", {
            text "10 damage. Flip a coin. If heads, discard an Energy attached to the Defending Pokémon."
            energyCost D
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                discardDefendingEnergyAfterDamage C
              }
            }
          }

        };
      case EEVEE_59:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Signs of Evolution", {
            text "Search your deck for up to 2 cards that evolve from Eevee, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search(max:2,"Search your deck for up to 2 cards that evolve from Eevee",{it.cardTypes.is(EVOLUTION) && it.predecessor.contains("Eevee")}).showToOpponent("Signs of Evolution: Selected cards").moveTo(my.hand)
            }
          }
          move "Bounce", {
            text "10 damage. Switch Eevee with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage {
                switchYourActive()
              }
            }
          }

        };
      case FLAREON_E4_60:
        return basic (this, hp:HP070, type:FIRE, retreatCost:1) {
          weakness W
          move "Tackle", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Fire Tail Slap", {
            text "40 damage. Flip a coin. If tails, discard a [R] Energy attached to Flareon E4."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 40
              flip 1, {}, {
                discardSelfEnergyAfterDamage(R)
              }
            }
          }

        };
      case FORRETRESS_G_61:
        return basic (this, hp:HP080, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          move "Shell Scatter", {
            text "This attack does 10 damage to each of your opponent's Pokémon. Foretress G can’t use Shell Scatter during your next turn."
            energyCost C
            onAttack {
              opp.all.each {
                damage 10, it
              }
              cantUseAttack(thisMove,self)
            }
          }
          move "Bomb Risk", {
            text "80 damage. Does 10 damage to each Benched Pokémon. Flip a coin. If tails, Foretress G does 80 damage to itself."
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 80
              opp.bench.each {
                damage 10, it
              }
              my.bench.each {
                damage 10, it
              }
              flip 1, {}, {
                damage 80, self
              }
            }
          }

        };
      case GLISCOR_E4_62:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness W
          resistance F, MINUS20
          move "Irongrip", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Loaded Needle", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage. If tails, the Defending Pokémon is now Poisoned."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 10
              flip 1, {
                damage 30
              }, {
                applyAfterDamage POISONED
              }
            }
          }

        };
      case GROWLITHE_63:
        return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
          weakness W, PLUS20
          move "Stoke", {
            text "Search your deck for a [R] Energy card and attach it to Growlithe. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              attachEnergyFrom(type:R,my.deck,self)
            }
          }
          move "Take Down", {
            text "50 damage. Growlithe does 10 damage to itself."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 50
              damage 10, self
            }
          }

        };
      case HIPPOPOTAS_64:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
          weakness W, PLUS10
          resistance L, MINUS20
          move "Push Down", {
            text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage {
                whirlwind()
              }
            }
          }
          move "Endeavor", {
            text "30+ damage. Flip 2 coins. This attack does 30 damage plus 20 more damage for each heads."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip 2, {
                damage 20
              }
            }
          }

        };
      case HOUNDOOM_E4_65:
        return basic (this, hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Corner", {
            text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              cantRetreat(defending)
            }
          }
          move "Fire Fang", {
            text "40 damage. The Defending Pokémon is now Burned."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 40
              applyAfterDamage BURNED
            }
          }

        };
      case KAKUNA_66:
        return evolution (this, from:"Weedle", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          pokeBody "Exoskeleton", {
            text "Any damage done to Kakuna by attacks is reduced by 20 ."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (self.active && it.to == self && it.dmg.value && it.notNoEffect) {
                    bc "$thisAbility -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
          move "Dangerous Evolution", {
            text "The Defending Pokémon is now Poisoned. Flip a coin. If heads, search your deck for an Evolution card that evolves from Kakuna and put it onto Kakuna. (This counts as evolving Kakuna.) Shuffle your deck afterward."
            energyCost G
            attackRequirement {}
            onAttack {
              apply POISONED
              def nam=self.name
              def tar = my.deck.search("Evolves from $nam", {it.cardTypes.is(EVOLUTION) && nam == it.predecessor})
              if(tar) evolve(self, tar.first(), OTHER)
              shuffleDeck()
            }
          }

        };
      case KECLEON_67:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          pokeBody "Colorful Body", {
            text "Kecleon’s type is [G][R][W][L][P][F][D][M][C]."
            delayedA {
              getterA GET_POKEMON_TYPE, self, {h->
                h.object.clear()
                h.object.add(G)
                h.object.add(R)
                h.object.add(W)
                h.object.add(L)
                h.object.add(P)
                h.object.add(F)
                h.object.add(D)
                h.object.add(M)
                h.object.add(C)
              }
            }
          }
          move "Triple Smash", {
            text "10+ damage. Flip 3 coins. This attack does 10 damage plus 20 more damage for each heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip 3, {
                damage 20
              }
            }
          }

        };
      case KOFFING_68:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS10
          move "Offensive Gas", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused and Poisoned."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                afterDamage {
                  apply CONFUSED
                  apply POISONED
                }
              }
            }
          }
          move "Gas Bomb", {
            text "30 damage. Koffing does 30 damage to itself, and don’t apply Weakness and Resistance to this damage."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 30
              noWrDamage 30, self
            }
          }

        };
      case MUNCHLAX_69:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:2) {
          weakness F
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Snorlax from your hand onto Munchlax (this counts as evolving Munchlax) and remove all damage counters from Munchlax."
            actionA {
              assert my.hand.findAll{it.name.contains("Snorlax")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Snorlax") }.select()
              if (tar) {
                evolve(self, tar.first(), OTHER)
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Rest", {
            text "Remove all Special Conditions and 6 damage counters from Munchlax. Munchlax is now Asleep."
            energyCost C, C
            attackRequirement {
              assert self.specialConditions || self.numberOfDamageCounters : "$self is healthy"
            }
            onAttack {
              clearSpecialCondition(self)
              heal 60, self
              apply ASLEEP, self
            }
          }

        };
      case MUNCHLAX_70:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:2) {
          weakness F
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Snorlax from your hand onto Munchlax (this counts as evolving Munchlax) and remove all damage counters from Munchlax."
            actionA {
              assert my.hand.findAll{it.name.contains("Snorlax")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Snorlax") }.select()
              if (tar) {
                evolve(self, tar.first(), OTHER)
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Errand-Running", {
            text "Search your deck for a Trainer card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C, C
            attackRequirement {
              assert my.deck : "Your deck is emtpy"
            }
            onAttack {
              my.deck.search("Search your deck for a trainer card",cardTypeFilter(ITEM)).showToOpponent("Errand-Running: Selected card").moveTo(my.hand)
              shuffleDeck()
            }
          }

        };
      case NIDORAN_FEMALE_71:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P
          move "Scratch", {
            text "10 damage. "
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Offer Help", {
            text "Search your deck for a Supporter card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C, C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search("Search your deck for a trainer card",cardTypeFilter(SUPPORTER)).showToOpponent("Errand-Running: Selected card").moveTo(my.hand)
              shuffleDeck()
            }
          }

        };
      case NIDORAN_MALE_72:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P
          move "Leer", {
            text "Flip a coin. If heads, the Defending Pokémon can’t attack during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                cantAttackNextTurn(defending)
              }
            }
          }
          move "Horn Hazard", {
            text "40 damage. Flip a coin. If tails, this attack does nothing."
            energyCost P, C
            attackRequirement {}
            onAttack {
              flip {
                damage 40
              }
            }
          }

        };
      case NIDORINA_73:
        return evolution (this, from:"Nidoran♀", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS20
          move "Jump Tackle", {
            text "30 damage. Nidorina does 10 damage to itself, and don’t apply Weakness and Resistance to this damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 30
              noWrDamage 10, self
            }
          }
          move "Stress Poison", {
            text "40+ damage. If Nidorina has any damage counters on it, this attack does 40 damage plus 20 more damage and the Defending Pokémon is now Poisoned."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 40
              if(self.numberOfDamageCounters) {
                damage 20
                applyAfterDamage POISONED
              }
            }
          }

        };
      case NIDORINO_74:
        return evolution (this, from:"Nidoran♂", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Toxic", {
            text "The Defending Pokémon is now Poisoned. Put 2 damage counters instead of 1 on the Defending Pokémon between turns."
            energyCost P, C
            attackRequirement {}
            onAttack {
              apply POISONED
              extraPoison 1
            }
          }
          move "Frustration", {
            text "Choose 1 of your opponent’s Pokémon that doesn’t have any damage counters on it. This attack does 40 damage to that Pokémon."
            energyCost C, C, C
            attackRequirement {
              assert opp.all.find{!it.numberOfDamageCounters} : "All of your opponent's Pokémon have damage counters"
            }
            onAttack {
              damage 40, opp.all.findAll{!it.numberOfDamageCounters}.select("Choose 1 of your opponent's Pokémon that doesn't have any damage counters on it")
            }
          }

        };
      case NUZLEAF_75:
        return evolution (this, from:"Seedot", hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS20
          resistance P, MINUS20
          move "Blind", {
            text "10 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost D
            attackRequirement {}
            onAttack {
              damage 10
              sandAttack(thisMove)
            }
          }
          move "Feint Attack", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              swiftDamage(30, opp.all.select())
            }
          }

        };
      case QUAGSIRE_GL_76:
        return basic (this, hp:HP090, type:WATER, retreatCost:2) {
          weakness G
          resistance L, MINUS20
          pokeBody "Submerge", {
            text "As long as Quagsire is on your Bench, prevent all damage done to Quagsire by attacks ."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (!self.active && it.to == self && it.dmg.value && it.notNoEffect) {
                    bc "$thisAbility prevents all damage"
                    it.dmg=hp(0)
                  }
                }
              }
            }
          }
          move "Punch and Run", {
            text "40 damage. You may switch Quagsire GL with 1 of your Benched Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 40
              switchYourActive(may:true)
            }
          }

        };
      case SEALEO_77:
        return evolution (this, from:"Spheal", hp:HP080, type:WATER, retreatCost:2) {
          weakness M, PLUS20
          move "Find Ice", {
            text "Search your deck for up to 2 [W] Energy cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search(max:2,"Search your deck for up to 2 [W] Energy cards",energyFilter(W)).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Sheer Cold", {
            text "20 damage. Flip a coin. If heads, each Defending Pokémon can’t attack during your opponent’s next turn."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
              flip {
                cantAttackNextTurn(defending)
              }
            }
          }

        };
      case SEEDOT_78:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Harden", {
            text "During your opponent’s next turn, if Seedot would be damaged by an attack, prevent that attack’s damage done to Seedot if that damage is 40 or less."
            energyCost C
            attackRequirement {}
            onAttack {
              delayed PRIORITY:BEFORE_LAST, {
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.dmg.value <= 40 && it.notNoEffect) {
                      bc "$thisMove prevents that damage"
                      it.dmg = hp(0)
                    }
                  }
                }
                unregisterAfter 2
                after EVOLVE,self, {unregister()}
                after DEVOLVE,self, {unregister()}
                after FALL_BACK,self, {unregister()}
              }
            }
          }
          move "Astonish", {
            text "10 damage. Choose 1 card from your opponent’s hand without looking. Look at that card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              astonish()
            }
          }

        };
      case SHELLOS_EAST_SEA_79:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness G, PLUS10
          move "Ripple", {
            text "Flip a coin. If heads, put 1 damage counter on each of your opponent’s Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                opp.all.each {
                  damage 10, it
                }
              }
            }
          }
          move "Brine", {
            text "Choose 1 of your opponent’s Pokémon that has any damage counters on it. This attack does 20 damage to that Pokémon."
            energyCost W
            attackRequirement {
              assert opp.all.find{it.numberOfDamageCounters} : "Your opponent's Pokémon are healthy"
            }
            onAttack {
              damage 20, opp.all.findAll{it.numberOfDamageCounters}.select(text)
            }
          }

        };
      case SHELLOS_WEST_SEA_80:
        return basic (this, hp:HP070, type:WATER, retreatCost:2) {
          weakness G, PLUS20
          move "Healing Sea", {
            text "Flip 2 coins. Choose 1 of your Pokémon. For each heads, remove 1 damage counter from that Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              def pcs = my.all.findAll{it.numberOfDamageCounters}.select(text)
              flip 2, {
                heal 10, pcs
              }
            }
          }
          move "Mud Shot", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case SNORLAX_81:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:4) {
          weakness F
          customAbility {
            delayedA {
              before ASLEEP_SPC, self, null, CHECK_ATTACK_REQUIREMENTS, {
                if(e.parentEvent.effect.move.name=="Toss and Turn")
                  prevent()
              }
            }
          }
          pokeBody "Bad Sleeping Habits", {
            text "As long as Snorlax is Asleep, your opponent’s Active Pokémon can’t retreat."
            delayedA {
              before RETREAT, opp.active, {
                if(self.isSPC(ASLEEP)) {
                  wcu "$thisAbility prevents retreating"
                  prevent()
                }
              }
            }
          }
          move "Toss and Turn", {
            text "20+ damage. If Snorlax is Asleep, this attack does 20 damage plus 30 more damage. (This attack can be used even if Snorlax is Asleep)."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              if(self.isSPC(ASLEEP)) {
                damage 30
              }
            }
          }
          move "Heavy Press", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 40 more damage. If tails, Snorlax is now Asleep."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip 1, {
                damage 40
              }, {
                afterDamage {
                  apply ASLEEP, self
                }
              }
            }
          }

        };
      case SPHEAL_82:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness M, PLUS10
          move "Powder Snow", {
            text "The Defending Pokémon is now Asleep."
            energyCost W
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Ice Ball", {
            text "20 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case STARYU_83:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Cosmic Draw", {
            text "If your opponent has any Evolved Pokémon in play, draw 3 cards."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
              assert opp.all.find{it.evolution} : "Your opponent doesn't have any Evolved Pokémon in play"
            }
            onAttack {
              draw 3
            }
          }
          move "Swift", {
            text "10 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {
              swiftDamage(10, defending)
            }
          }

        };
      case TRAPINCH_84:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS10
          resistance L, MINUS20
          pokePower "Gather Sand", {
            text "Once during your turn , if Trapinch is your Active Pokémon, you may search your discard pile for a basic [F] Energy card and attach it to Trapinch."
            actionA {
              checkLastTurn()
              assert my.discard.filterByEnergyType(F) : "You have no basic [F] Energy cards in your discard pile"
              powerUsed()
              attachEnergyFrom(basic:true,type:F,my.discard,self)
            }
          }
          move "Grind", {
            text "10× damage. Does 10 damage times the amount of Energy attached to Trapinch."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10*self.cards.energyCount(C)
            }
          }

        };
      case TURTWIG_GL_85:
        return basic (this, hp:HP090, type:GRASS, retreatCost:3) {
          weakness R
          resistance W, MINUS20
          pokeBody "Overgrow", {
            text "As long as Turtwig ‘s remaining HP is 60 or less, each of Turtwig ‘s attacks does 30 more damage to the Defending Pokémon ."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if(self.remainingHP.value <= 60 && it.from == self && it.to.owner == self.owner.opposite && it.to.active) {
                    bc "$thisAbility +30"
                    it.dmg += hp(30)
                  }
                }
              }
            }
          }
          move "Giga Drain", {
            text "30 damage. After you attack, remove from Turtwig GL the number of damage counters equal to the damage you did to the Defending Pokémon."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 30
              removeDamageCounterEqualToDamageDone()
            }
          }

        };
      case WEEDLE_86:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Rescue String", {
            text "Search your discard pile for up to 5 Pokémon, show them to your opponent, and shuffle them into your deck."
            energyCost ()
            attackRequirement {
              assert my.discard.filterByType(POKEMON) : "You have no Pokémon in your discard pile"
            }
            onAttack {
              my.discard.select(max:5,"Search your discard pile for up to 5 Pokémon",cardTypeFilter(POKEMON)).showToOpponent("Rescue String: Selected cards").moveTo(my.deck)
              shuffleDeck()
            }
          }
          move "Needling Sting", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                damage 10
              }
            }
          }

        };
      case WEEZING_87:
        return evolution (this, from:"Koffing", hp:HP080, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS20
          pokeBody "Camoflage Gas", {
            getterA GET_GIVEN_PRIZES, self, {holder ->
              if(self.isSPC(CONFUSED)) {
                bc "$thisAbility prevents taking any prize card from ${self}"
                holder.object = 0
              }
            }
          }
          move "Damage Breakdown", {
            text "Count the number of damage counters on Weezing. Put that many damage counters on the Defending Pokémon and Weezing is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {
              directDamage 10 * self.numberOfDamageCounters, defending
              afterDamage {
                apply CONFUSED, self
              }
            }
          }
          move "Smog", {
            text "20 damage. The Defending Pokémon is now Poisoned."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage POISNED
            }
          }

        };
      case AARON_S_COLLECTION_88:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your discard pile for up to 2 in any combination of Pokémon SP and basic Energy cards, show them to your opponent, and put them into your hand."
          onPlay {
            my.discard.search(max:2,"Search your deck for up to 2 in any combination of Pokémon SP and basic Energy cards",{it.cardTypes.is(POKEMON_SP) || it.cardTypes.is(BASIC_ENERGY)}).showToOpponent("Aaron's Collection: Selected cards").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.discard.find{it.cardTypes.is(POKEMON_SP)||it.cardTypes.is(BASIC_ENERGY)} : "You have no Pokémon SP or basic Energy cards in your discard pile"
          }
        };
      case BEBE_S_SEARCH_89:
        return copy (MysteriousTreasures.BEBE_S_SEARCH_109, this);
      case BERTHA_S_WARMTH_90:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nRemove 5 damage counters from 1 of your Pokémon SP."
          onPlay {
            heal 50, my.all.findAll{it.pokemonSP && it.numberOfDamageCounters}.select("Remove 5 damage counters from 1 of your Pokémon SP"), TRAINER_CARD
          }
          playRequirement{
            assert my.all.find{it.pokemonSP && it.numberOfDamageCounters} : "You have no damged Pokémon SP"
          }
        };
      case FLINT_S_WILLPOWER_91:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nAttach a basic Energy card from your hand to 1 of your Pokémon SP."
          onPlay {
            attachEnergyFrom(basic:true,my.hand,my.all.findAll{it.pokemonSP})
          }
          playRequirement{
            assert my.all.find{it.pokemonSP} : "You have no Pokémon SP in play"
            assert my.hand.filterByType(BASIC_ENERGY) : "You have no basic Energy cards in your hand"
          }
        };
      case LUCIAN_S_ASSIGNMENT_92:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nMove as many Energy cards attached to 1 of your Pokémon as you like to another of your Pokémon."
          onPlay {
            def src = my.all.findAll{it.cards.filterByType(ENERGY)}.select("Select Pokémon to move energy from")
            def energyList = src.cards.filterByType(ENERGY).select(min:1, "Choose energy cards to move")
            def tar = my.all.findAll{it != src}.select("Choose Pokémon to move energy cards to")
            energyList.each {
              energySwitch(src, tar, it)
            }
          }
          playRequirement{
            assert my.all.find{it.cards.energyCount(C)} : "You don't have any energy in play"
            assert my.bench : "You have no Benched Pokémon"
          }
        };
      case POKEMON_CONTEST_HALL_93:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nOnce during each player’s turn, if that player’s Bench isn’t full, the player may flip a coin. If heads, that player searches his or her deck for a Basic Pokémon and puts it onto his or her Bench. If the player does, he or she may search his or her deck for a Pokémon Tool card and attach it to that Pokémon. If that player searched his or her deck, the player shuffles his or her deck afterward."
          def lastTurn=0
          def actions=[]
          onPlay {
            actions=action("Stadium: Pokemon Contest Hall") {
              assert my.deck
              assert my.bench.notFull
              assert lastTurn != bg().turnCount : "Already used"
              bc "Used Pokemon Contest Hall effect"
              lastTurn = bg().turnCount
              flip {
                my.deck.search {it.cardTypes.is(BASIC)}.each {
                  def pcs = benchPCS(it)
                  my.deck.search {it.cardTypes.is(POKEMON_TOOL)}.each {
                    attachPokemonTool(it,pcs)
                  }
                }
                shuffleDeck()
              }
            }
          }
          onRemoveFromPlay{
            actions.each { bg().gm().unregisterAction(it) }
          }
        };
      case SUNYSHORE_CITY_GYM_94:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nAny damage done by attacks from [L] Pokémon (both yours and your opponent’s) to the Defending Pokémon isn’t affected by Resistance. Each [L] Pokémon in play (both yours and your opponent’s) has no Weakness."
          def eff1, eff2
          onPlay {
            eff1 = getter (GET_WEAKNESSES) {h->
              if(h.effect.target.types.contains(L)){
                h.object = []
              }
            }
            eff2 = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if (it.from.types.contains(L) && it.to.active) {
                    it.flags.add(DamageManager.DamageFlag.NO_RESISTANCE)
                  }
                }
              }
            }
          }
          onRemoveFromPlay{
            eff1.unregister()
            eff2.unregister()
          }
        };
      case TECHNICAL_MACHINE_G_95:
        return basicTrainer (this) {
          text "Attach this card to 1 of your Pokémon SP in play. That Pokémon may use this card’s attack instead of its own. When the Pokémon this card is attached to is no longer Pokémon SP, discard this card.\n[C][C][C] Damage Porter Choose 1 of your opponent’s Pokémon. This attack does 10 damage times the number of damage counters on the Pokémon this card is attached to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
          onPlay {//TODO Implement technical machine groovy card type
          }
          playRequirement{
          }
        };
      case SP_RADAR_96:
        return itemCard (this) {
          text "Choose a card from your hand and put it on top of your deck. Search your deck for a Pokémon SP, show it to your opponent, and put it into your hand. Shuffle your deck afterward. (If this is the only card in your hand, you can’t play this card.)"
          onPlay {
            my.hand.getExcludedList(thisCard).select("Choose a card to put back into your deck").moveTo(hidden:true,my.deck)
            def card = my.deck.search("Search your deck for a Pokémon SP",cardTypeFilter(POKEMON_SP))
            if(card) {
              card.showToOpponent("SP Radar: Selected Card").moveTo(my.hand)
            }
            shuffleDeck()
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard) : "You have no other cards in your hand"
          }
        };
      case UNDERGROUND_EXPEDITION_97:
        return copy(CelestialStorm.UNDERGROUND_EXPEDITION_150, this);
      case VOLKNER_S_PHILOSOPHY_98:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nYou may discard a card from your hand. Then, draw cards until you have 6 cards in your hand. (If you can’t draw any cards, you can’t play this card.)"
          onPlay {
            my.hand.getExcludedList(thisCard).select(min:0,"You may discard a card from your hand").discard()
            draw 6 - my.hand.getExcludedList(thisCard).size()
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard).size() <= 6
            assert my.deck : "Your deck is empty"
          }
        };
      case DARKNESS_ENERGY_99:
        return copy (MysteriousTreasures.DARKNESS_ENERGY_119, this);
      case METAL_ENERGY_100:
        return copy (RubySapphire.METAL_ENERGY_94, this)
      case SP_ENERGY_101:
        return specialEnergy (this, [[C]]) {
          text "SP Energy provides [C] Energy. While attached to a Pokémon SP, SP Energy provides every type of Energy but provides only 1 Energy at a time. (Has no effect other than providing Energy.)"
          onPlay {reason->
          }
          getEnergyTypesOverride {
            if (self && self.pokemonSP) {
              return [valuesBasicEnergy() as Set]
            }
            else {
              return [[C] as Set]
            }
          }
        };
      case UPPER_ENERGY_102:
        return specialEnergy (this, [[C]]) {
          text "Upper Energy provides [C] Energy. If you have more Prize cards left than your opponent and this card is attached to a Pokémon (excluding Pokémon LV.X), Upper Energy provides [C][C]."
          getEnergyTypesOverride{
            if(self && !self.pokemonLevelUp && self.owner.pbg.prizeCardSet.size() > self.owner.opposite.pbg.prizeCardSet.size()) {
              return [[C] as Set,[C] as Set]
            }
            else {
              return [[C] as Set]
            }
          }
        };
      case ALAKAZAM_E4_LV_X_103:
        return levelUp (this, from:"Alakazam 4", hp:HP100, type:PSYCHIC, retreatCost:2) {
          weakness P
          pokePower "Damage Switch", {
            text "As often as you like during your turn , you may move 1 damage counter from 1 of your Pokémon to another of your Pokémon . This power can’t be used if Alakazam 4 is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert my.all.find({it.numberOfDamageCounters>0}) : "None of your Pokémon have any damage counters"
              assert my.all.size()>=2 : "You only have 1 Pokémon in play"
              powerUsed()
              def src=my.all.findAll {it.numberOfDamageCounters>0}.select("Source for damage counter")
              def tar=my.all
              tar.remove(src)
              tar=tar.select("Target for damage counter")
              src.damage-=hp(10)
              directDamage 10, tar, Source.POKEPOWER
              bc "Swapped a damage counter from $src to $tar"
              checkFaint()
            }
          }
          move "Mind Shock", {
            text "50 damage. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              noWrDamage 50
            }
          }
        };
      case FLOATZEL_GL_LV_X_104:
        return levelUp (this, from:"Floatzel GL", hp:HP100, type:WATER, retreatCost:0) {
          weakness L
          pokeBody "Water Rescue", {
            text "Whenever any of your [W] Pokémon (excluding any Floatzel) is Knocked Out by damage from your opponent’s attack, you may put that Pokémon and all cards that were attached to it from your discard pile into your hand."
            delayedA (priority: BEFORE_LAST) {
              before KNOCKOUT, {
                def pcs=ef.pokemonToBeKnockedOut
                if((ef as Knockout).byDamageFromAttack && pcs != self && pcs.owner == self.owner && pcs.types.contains(W)) {
                  def tpc = pcs.topPokemonCard
                  CardList dscrd = []
                  dscrd.addAll(self.owner.pbg.discard)
                  delayed(inline: true,priority: BEFORE_LAST){
                    after KNOCKOUT, pcs, {
                      if(self.owner.pbg.discard.contains(tpc) && confirm("Use Water Rescue?",self.owner)) {
                        bc "$thisAbility activates"
                        self.owner.pbg.discard.getExcludedList(dscrd).moveTo(self.owner.pbg.hand)//This feels naive, but I haven't been able to break it yet
                      }
                      owner.delegate.unregister()
                    }
                  }
                }
              }
            }
          }
          move "Energy Cyclone", {
            text "20× damage. Choose as many Energy cards from your hand as you like and show them to your opponent. This attack does 20 damage times the number of Energy cards you chose. Put those Energy cards on top of your deck. Shuffle your deck afterward."
            energyCost W, W
            attackRequirement {
              assert my.hand.filterByType(ENERGY) : "You have no Energy cards in your hand"
            }
            onAttack {
              def energyList = my.hand.select(min:0,max:my.hand.filterByType(ENERGY).size(),"Choose any number of Energy cards to show to your opponent",cardTypeFilter(ENERGY)).showToOpponent("Energy Cyclone: These cards will be shuffled into your opponent's deck")
              damage 20 * energyList.size()
              afterDamage {
                energyList.moveTo(my.deck)
                shuffleDeck()
              }
            }
          }
        };
      case FLYGON_LV_X_105:
        return levelUp (this, from:"Flygon", hp:HP140, type:COLORLESS, retreatCost:0) {
          weakness C
          resistance L, MINUS20
          pokeBody "Wind Erosion", {
            text "As long as Flygon is your Active Pokémon, discard the top card from your opponent’s deck between turns."
            delayedA {
              before BEGIN_TURN, {
                if (self.active && self.owner.opposite.pbg.deck) {
                  bc"Wind Erosion activates"
                  self.owner.opposite.pbg.deck.subList(0, 1).discard()
                }
              }
            }
          }
          move "Extreme Attack", {
            text "Choose 1 of your opponent's Pokémon LV.X. This attack does 150 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon)."
            energyCost C, C, C
            attackRequirement {
              assert opp.all.find{it.pokemonLevelUp}
            }
            onAttack {
              damage 150, opp.all.findAll{it.pokemonLevelUp}.select(text)
            }
          }
        };
      case GALLADE_E4_LV_X_106:
        return levelUp (this, from:"Gallade 4", hp:HP100, type:PSYCHIC, retreatCost:1) {
          weakness P
          pokePower "Blade Storm", {
            text "Once during your turn , when you put Gallade LV.X from your hand onto your Active Gallade , you may put 1 damage counter on each of your opponent’s Pokémon."
            onActivate {r->
              if (r==PLAY_FROM_HAND && confirm('Use Blade Storm?')) {
                powerUsed()
                opp.all.each {
                  directDamage 10, it, Source.POKEPOWER
                }
              }
            }
          }
          move "Aimed Cut", {
            text "40+ damage. Does 40 damage plus 10 more damage for each damage counter on the Defending Pokémon."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 40 + 10 * defending.numberOfDamageCounters
            }
          }
        };
      case HIPPOWDON_LV_X_107:
        return levelUp (this, from:"Hippowdon", hp:HP130, type:FIGHTING, retreatCost:4) {
          weakness W
          resistance L, MINUS20
          pokePower "Sand Reset", {
            text "Once during a game on your turn , each player shuffles all cards in play (excluding Pokémon and Supporter cards) into his or her deck. You can’t use more than 1 Sand Reset Poké-Power each game."
            actionA {
              assert !bg.em().retrieveObject("Sand_Reset_"+thisCard.player) : "You can only use Sand Reset once each game"
              checkLastTurn()//This should never fail
              bg.em().storeObject("Sand_Reset_"+thisCard.player,1)
              powerUsed()
              all.each{
                it.cards.getExcludedList(it.cards.filterByType(POKEMON)).moveTo(it.owner.pbg.deck)
              }
              if(bg.stadiumInfoStruct) {
                new CardList(bg.stadiumInfoStruct.stadiumCard).moveTo(bg.stadiumInfoStruct.stadiumCard.player.pbg.deck)
              }
              shuffleDeck()
              shuffleDeck null, TargetPlayer.OPPONENT
            }
          }
          move "Double Shoot", {
            text "Discard 2 [F] Energy attached to Hippowdon and choose 2 of your opponent’s Benched Pokémon. This attack does 40 damage to each of them."
            energyCost F, F, C, C
            attackRequirement {}
            onAttack {
              discardSelfEnergyAfterDamage F, F
              multiSelect(opp.all,2,"Choose 2 of your opponent's Pokémon").each {
                damage 40, it
              }
            }
          }
        };
      case INFERNAPE_E4_LV_X_108:
        return levelUp (this, from:"Infernape 4", hp:HP110, type:FIRE, retreatCost:0) {
          weakness W
          pokePower "Intimidating Roar", {
            text "Once during your turn , you may have your opponent switch his or her Active Pokémon with one of his or her Benched Pokémon. This power can’t be used if Infernape E4 is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert opp.bench : "Your opponent only has 1  Pokémonin play"
              powerUsed()
              whirlwind()
            }
          }
          move "Fire Spin", {
            text "100 damage. Discard 2 Energy attached to Infernape 4."
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 100
              discardSelfEnergyAfterDamage C, C
            }
          }
        };
      case LUXRAY_GL_LV_X_109:
        return levelUp (this, from:"Luxray GL", hp:HP110, type:LIGHTNING, retreatCost:0) {
          weakness F
          resistance M, MINUS20
          pokePower "Bright Look", {
            text "Once during your turn (before your attack), when you put Luxray GL LV.X from your hand onto your Active Luxray GL, you may switch the Defending Pokémon with 1 of your opponent's Benched Pokémon"
            onActivate {r->
              if(r==PLAY_FROM_HAND && opp.bench && confirm("Use Bright Look?")) {
                powerUsed()
                sw opp.active, opp.bench.select("Choose your opponent's new active Pokémon"), Source.POKEPOWER
              }
            }
          }
          move "Flash Impact", {
            text "60 damage. Does 30 damage to 1 of your Pokémon, and don’t apply Weakness and Resistance to this damage."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 60
              noWrDamage 30, my.all.select("Choose Pokémon to do 30 damage to")
            }
          }
        };
      case MISMAGIUS_GL_LV_X_110:
        return levelUp (this, from:"Mismagius GL", hp:HP100, type:PSYCHIC, retreatCost:1) {
          weakness D
          resistance C, MINUS20
          pokePower "Magical Return", {
            text "As often as you like during your turn , you may return a Pokémon Tool or Technical Machine card attached to your Pokémon to your hand. This power can’t be used if Mismagius is affected by a Special Condition."
            actionA {
              checkNoSPC()
              assert my.all.find{it.cards.find{it.cardTypes.contains(POKEMON_TOOL)||it.cardTypes.contains(TECHNICAL_MACHINE)}} : "You have no Pokémon Tool or Technical Machine cards in play"
              powerUsed()
              def tar = my.all.findAll{it.cards.find{it.cardTypes.contains(POKEMON_TOOL)||it.cardTypes.contains(TECHNICAL_MACHINE)}}.select("Choose 1 of your Pokémon with a Pokémon Tool or Technical Machine card attached")
              def card = tar.cards.select("Choose a Pokémon Tool or Technical Machine card to return to your hand",{it.types.contains(POKEMON_TOOL) || it.types.contains(TECHNICAL_MACHINE)}).moveTo(my.hand)
            }
          }
          move "Darkness Magic", {
            text "Count the number of cards in your hand. Put that many damage counters on the Defending Pokémon. You can’t put more than 8 damage counters in this way."
            energyCost P, P, C
            attackRequirement {
              assert my.hand : "Your hand is empty"
            }
            onAttack {
              def count = Math.min(my.hand.size(),8)
              directDamage count, defending
            }
          }
        };
      case SNORLAX_LV_X_111:
        return levelUp (this, from:"Snorlax", hp:HP130, type:COLORLESS, retreatCost:4) {
          weakness F
          pokePower "Big Appetite", {
            text "Once during your turn , if Snorlax is your Active Pokémon, you may draw cards until you have 6 cards in your hand. If you do, Snorlax is now Asleep. This power can’t be used if Snorlax is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.deck : "Your deck is empty"
              assert my.hand.size() < 6 : "You already have 6 cards in your hand"
              powerUsed()
              draw 6 - my.hand.size()
              apply ASLEEP, self, Source.POKEPOWER
            }
          }
          move "Exercise", {
            text "80 damage. You may discard as many Energy cards as you like from your hand. If you do, remove that many damage counters from Snorlax."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 80
              def energyList = my.hand.select(min:0,max:my.hand.fitlerByType(ENERGY).size(),"You many discard as many Energy cards as you like from you hand to remove that many damage counters from $self")
              afterDamage {
                heal 10 * energyList.size(), self
                energyList.discard()
              }
            }
          }
        };
      case PIKACHU_112:
        return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
          weakness F
          move "Gnaw", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Thunder Jolt", {
            text "30 damage. Flip a coin. If tails, Pikachu does 10 damage to itself."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 30
              flip 1, {}, {
                damage 10, self
              }
            }
          }

        };
      case FLYING_PIKACHU_113:
        return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
          resistance F, MINUS30
          move "Thundershock", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Fly", {
            text "30 damage. Flip a coin. If tails, this attack does nothing. If heads, prevent all effects of an attack, including damage, done to Flying Pikachu during your opponent's next turn."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              flip {
                damage 30
                preventAllEffectsNextTurn()
              }
            }
          }

        };
      case SURFING_PIKACHU_114:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F
          move "Surf", {
            text "30 damage. "
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case FAN_ROTOM_RT1:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:0) {
          weakness D, PLUS20
          resistance C, MINUS20
          pokePower "Fan Shift", {
            text "Once during your turn , you may use this power. Fan Rotom’s type is until the end of your turn."
            actionA {
              checkLastTurn()
              powerUsed()
              bc "$self's type is now COLORLESS until the end of this turn."
              delayed {
                def eff
                register {
                  eff = getter GET_POKEMON_TYPE, self, { h->
                    h.object.clear()
                    h.object.add(C)
                  }
                }
                unregister {
                  eff.unregister()
                }
                unregisterAfter 1
              }
            }
          }
          move "Spin Storm", {
            text "Flip a coin. If heads, your opponent returns the Defending Pokémon and all cards attached to it to his or her hand."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip {
                scoopUpPokemon(defending, delegate)
              }
            }
          }
          move "Air Slash", {
            text "60 damage. Flip a coin. If tails, discard an Energy attached to Fan Rotom."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              flip {
                discardSelfEnergyAfterDamage C
              }
            }
          }

        };
      case FROST_ROTOM_RT2:
        return basic (this, hp:HP090, type:LIGHTNING, retreatCost:3) {
          weakness D, PLUS20
          resistance C, MINUS20
          pokePower "Frost Shift", {
            text "Once during your turn , you may use this power. Frost Rotom’s type is [W] until the end of your turn."
            actionA {
              checkLastTurn()
              powerUsed()
              bc "$self's type is now WATER until the end of this turn."
              delayed {
                def eff
                register {
                  eff = getter GET_POKEMON_TYPE, self, { h->
                    h.object.clear()
                    h.object.add(W)
                  }
                }
                unregister {
                  eff.unregister()
                }
                unregisterAfter 1
              }
            }
          }
          move "Hail", {
            text "This attack does 10 damage to each of your opponent’s Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              opp.all.each {
                damage 10, it
              }
            }
          }
          move "Crushing Ice", {
            text "40+ damage. Does 40 damage plus 10 more damage for each C Energy in the Defending Pokémon’s Retreat Cost (after applying effects to the Retreat Cost)."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 40 + 10 * defending.retreatCost
            }
          }

        };
      case HEAT_ROTOM_RT3:
        return basic (this, hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          pokePower "Heat Shift", {
            text "Once during your turn , you may use this power. Heat Rotom’s type is [R] until the end of your turn."
            actionA {
              actionA {
                checkLastTurn()
                powerUsed()
                bc "$self's type is now FIRE until the end of this turn."
                delayed {
                  def eff
                  register {
                    eff = getter GET_POKEMON_TYPE, self, { h->
                      h.object.clear()
                      h.object.add(R)
                    }
                  }
                  unregister {
                    eff.unregister()
                  }
                  unregisterAfter 1
                }
              }
            }
          }
          move "Warm Up", {
            text "Search your deck for a [R] Energy card and attach it to 1 of your Benched Pokémon. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
              assert my.bench : "You have no benched Pokémon"
            }
            onAttack {
              attachEnergyFrom(type:r,my.deck,my.bench)
            }
          }
          move "Heat Burn", {
            text "40 damage. The Defending Pokémon is now Burned."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 40
              applyAfterDamage BURNED
            }
          }

        };
      case MOW_ROTOM_RT4:
        return basic (this, hp:HP090, type:LIGHTNING, retreatCost:2) {
          weakness D, PLUS20
          resistance C, MINUS20
          pokePower "Mow Shift", {
            text "Once during your turn , you may use this power. Mow Rotom’s type is [G] until the end of your turn."
            actionA {
              checkLastTurn()
              powerUsed()
              bc "$self's type is now GRASS until the end of this turn."
              delayed {
                def eff
                register {
                  eff = getter GET_POKEMON_TYPE, self, { h->
                    h.object.clear()
                    h.object.add(G)
                  }
                }
                unregister {
                  eff.unregister()
                }
                unregisterAfter 1
              }
            }
          }
          move "Slash", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Mow Down", {
            text "50 damage. Flip a coin. If heads, discard an Energy card attached to each of your opponent’s Pokémon."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flip {
                afterDamage {
                  opp.all.each {
                    if(it.cards.filterByType(ENERGY)) {
                      it.cards.select("Choose an Energy card to discard",cardTypeFilter(ENERGY)).discard()
                    }
                  }
                }
              }
            }
          }

        };
      case WASH_ROTOM_RT5:
        return basic (this, hp:HP090, type:LIGHTNING, retreatCost:2) {
          weakness D, PLUS20
          resistance C, MINUS20
          pokePower "Wash Shift", {
            text "Once during your turn , you may use this power. Wash Rotom’s type is until the end of your turn."
            actionA {
              checkLastTurn()
              powerUsed()
              bc "$self's type is now WATER until the end of this turn."
              delayed {
                def eff
                register {
                  eff = getter GET_POKEMON_TYPE, self, { h->
                    h.object.clear()
                    h.object.add(W)
                  }
                }
                unregister {
                  eff.unregister()
                }
                unregisterAfter 1
              }
            }
          }
          move "Cleanse Away", {
            text "Remove 3 damage counters from each of your Benched Pokémon."
            energyCost C
            attackRequirement {
              assert my.bench.find{it.numberOfDamageCounters} : "Your Pokémon are healthy"
            }
            onAttack {
              my.bench.each {
                heal 30, it
              }
            }
          }
          move "Drain Wash", {
            text "30 damage. Flip a coin until you get tails. For each heads, choose 1 card from your opponent’s hand without looking and discard it."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
              def count = 0
              flipUntilTails{
                count ++
              }
              count = Math.min(opp.hand.size(),count)
              opp.hand.select(count:count,hidden:true,"Choose $count cards to discard from your opponent's hand").discard()
            }
          }

        };
      case CHARON_S_CHOICE_RT6:
        return basicTrainer (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck for any Rotom and switch it with any Rotom you have in play. Any cards attached to Rotom and damage counters on it are now on the new Pokémon. (Remove all Special Conditions and effects from Rotom.) Put Rotom on top of your deck. Shuffle your deck afterward."
          onPlay {
            def selected = my.deck.search("Select a Rotom",{it.name.contains("Rotom")})
            if (selected) {
              def pcs = my.all.findAll{it.topPokemonCard.name.contains("Rotom")}.select()
              def tpc = pcs.topPokemonCard
              selected.moveTo(suppressLog: true, pcs.cards)
              new CardList(tpc).moveTo(my.deck)
              new CheckAbilities().run(bg)
              clearSpecialCondition(pcs)
              //Todo Find a way to remove "effects". This effect seems similar to Channeler/Pokémon Ranger
              checkFaint()
            }
            shuffleDeck()
            delayed {
              before BETWEEN_TURNS, {
                new CardList(thisCard).moveTo(thisCard.player.pbg.hand)
              }
              unregisterAfter 1
            }
          }
          playRequirement{
            assert my.deck : "Your deck is empty"
            assert my.all.find{it.name.contains("Rotom")} : "You have no Rotoms in play"
          }
        };
      default:
        return null;
    }
  }

}
