package tcgwars.logic.impl.gen4

import tcgwars.logic.Action
import tcgwars.logic.effect.Source
import tcgwars.logic.impl.gen2.Expedition;
import tcgwars.logic.impl.gen3.FireRedLeafGreen
import tcgwars.logic.impl.gen3.RubySapphire;
import tcgwars.logic.impl.gen5.PlasmaStorm;
import tcgwars.logic.impl.gen5.BlackWhite;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.effect.EffectPriority.BEFORE_LAST;
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import tcgwars.logic.effect.gm.PlayTrainer
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Weakness.*

import java.util.*;
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
 * @author axpendix@hotmail.com
 * @author ufodynasty12@gmail.com
 */
public enum MajesticDawn implements LogicCardInfo {

  ARTICUNO_1 ("Articuno", "1", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  CRESSELIA_2 ("Cresselia", "2", Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  DARKRAI_3 ("Darkrai", "3", Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_]),
  DIALGA_4 ("Dialga", "4", Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]),
  GLACEON_5 ("Glaceon", "5", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  KABUTOPS_6 ("Kabutops", "6", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  LEAFEON_7 ("Leafeon", "7", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  MANAPHY_8 ("Manaphy", "8", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  MEWTWO_9 ("Mewtwo", "9", Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  MOLTRES_10 ("Moltres", "10", Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  PALKIA_11 ("Palkia", "11", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  PHIONE_12 ("Phione", "12", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  ROTOM_13 ("Rotom", "13", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  ZAPDOS_14 ("Zapdos", "14", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  AERODACTYL_15 ("Aerodactyl", "15", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BRONZONG_16 ("Bronzong", "16", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  EMPOLEON_17 ("Empoleon", "17", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  ESPEON_18 ("Espeon", "18", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  FLAREON_19 ("Flareon", "19", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  GLACEON_20 ("Glaceon", "20", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  HIPPOWDON_21 ("Hippowdon", "21", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  INFERNAPE_22 ("Infernape", "22", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  JOLTEON_23 ("Jolteon", "23", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  LEAFEON_24 ("Leafeon", "24", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  MINUN_25 ("Minun", "25", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  OMASTAR_26 ("Omastar", "26", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  PHIONE_27 ("Phione", "27", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  PLUSLE_28 ("Plusle", "28", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  SCIZOR_29 ("Scizor", "29", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  TORTERRA_30 ("Torterra", "30", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  TOXICROAK_31 ("Toxicroak", "31", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  UMBREON_32 ("Umbreon", "32", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  UNOWN_P_33 ("Unown P", "33", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  VAPOREON_34 ("Vaporeon", "34", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  AMBIPOM_35 ("Ambipom", "35", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  FEAROW_36 ("Fearow", "36", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  GROTLE_37 ("Grotle", "37", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  KANGASKHAN_38 ("Kangaskhan", "38", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  LICKITUNG_39 ("Lickitung", "39", Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  MANECTRIC_40 ("Manectric", "40", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MONFERNO_41 ("Monferno", "41", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  MOTHIM_42 ("Mothim", "42", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PACHIRISU_43 ("Pachirisu", "43", Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PRINPLUP_44 ("Prinplup", "44", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  RAICHU_45 ("Raichu", "45", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  SCYTHER_46 ("Scyther", "46", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  STARAVIA_47 ("Staravia", "47", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  SUDOWOODO_48 ("Sudowoodo", "48", Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  UNOWN_Q_49 ("Unown Q", "49", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  AIPOM_50 ("Aipom", "50", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  AIPOM_51 ("Aipom", "51", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BRONZOR_52 ("Bronzor", "52", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  BUNEARY_53 ("Buneary", "53", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BURMY_SANDY_CLOAK_54 ("Burmy Sandy Cloak", "54", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHATOT_55 ("Chatot", "55", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHIMCHAR_56 ("Chimchar", "56", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CHIMCHAR_57 ("Chimchar", "57", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CHINGLING_58 ("Chingling", "58", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  COMBEE_59 ("Combee", "59", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CROAGUNK_60 ("Croagunk", "60", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DRIFLOON_61 ("Drifloon", "61", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  EEVEE_62 ("Eevee", "62", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  EEVEE_63 ("Eevee", "63", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ELECTRIKE_64 ("Electrike", "64", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  GLAMEOW_65 ("Glameow", "65", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  HIPPOPOTAS_66 ("Hippopotas", "66", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  KABUTO_67 ("Kabuto", "67", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MUNCHLAX_68 ("Munchlax", "68", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  OMANYTE_69 ("Omanyte", "69", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PIKACHU_70 ("Pikachu", "70", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PIPLUP_71 ("Piplup", "71", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  PIPLUP_72 ("Piplup", "72", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SHELLOS_EAST_SEA_73 ("Shellos East Sea", "73", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SPEAROW_74 ("Spearow", "74", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  STARLY_75 ("Starly", "75", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  STUNKY_76 ("Stunky", "76", Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  TURTWIG_77 ("Turtwig", "77", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TURTWIG_78 ("Turtwig", "78", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  DAWN_STADIUM_79 ("Dawn Stadium", "79", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  DUSK_BALL_80 ("Dusk Ball", "80", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ENERGY_RESTORE_81 ("Energy Restore", "81", Rarity.UNCOMMON, [TRAINER, ITEM]),
  FOSSIL_EXCAVATOR_82 ("Fossil Excavator", "82", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  MOM_S_KINDNESS_83 ("Mom's Kindness", "83", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  OLD_AMBER_84 ("Old Amber", "84", Rarity.UNCOMMON, [TRAINER, ITEM]),
  POKE_BALL_85 ("Poké Ball", "85", Rarity.UNCOMMON, [TRAINER, ITEM]),
  QUICK_BALL_86 ("Quick Ball", "86", Rarity.UNCOMMON, [TRAINER, ITEM]),
  SUPER_SCOOP_UP_87 ("Super Scoop Up", "87", Rarity.UNCOMMON, [TRAINER, ITEM]),
  WARP_POINT_88 ("Warp Point", "88", Rarity.UNCOMMON, [TRAINER, ITEM]),
  DOME_FOSSIL_89 ("Dome Fossil", "89", Rarity.COMMON, [TRAINER, ITEM]),
  ENERGY_SEARCH_90 ("Energy Search", "90", Rarity.COMMON, [TRAINER, ITEM]),
  HELIX_FOSSIL_91 ("Helix Fossil", "91", Rarity.COMMON, [TRAINER, ITEM]),
  CALL_ENERGY_92 ("Call Energy", "92", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  DARKNESS_ENERGY_93 ("Darkness Energy", "93", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  HEALTH_ENERGY_94 ("Health Energy", "94", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  METAL_ENERGY_95 ("Metal Energy", "95", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  RECOVER_ENERGY_96 ("Recover Energy", "96", Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  GARCHOMP_LV_X_97 ("Garchomp Lv.X", "97", Rarity.HOLORARE, [LVL_X, POKEMON, _COLORLESS_]),
  GLACEON_LV_X_98 ("Glaceon Lv.X", "98", Rarity.HOLORARE, [LVL_X, POKEMON, _WATER_]),
  LEAFEON_LV_X_99 ("Leafeon Lv.X", "99", Rarity.HOLORARE, [LVL_X, POKEMON, _GRASS_]),
  PORYGON_Z_LV_X_100 ("Porygon-Z Lv.X", "100", Rarity.HOLORARE, [LVL_X, POKEMON, _COLORLESS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  MajesticDawn(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.MAJESTIC_DAWN;
  }

  @Override
  public String toString() {
    return String.format("%s:%s", this.name(), this.getCollection().name());
  }

  @Override
  public String getEnumName() {
    return this.name();
  }

  @Override
  public Card getImplementation() {
    switch (this) {
      case ARTICUNO_1:
        return basic (this, hp:HP100, type:WATER, retreatCost:2) {
          weakness M
          resistance F, MINUS20
          pokePower "Freezing Screech", {
            text "Once during your turn, when you put Articuno from your hand onto your Bench, you may flip a coin. If heads, choose 1 of the Defending Pokémon. That Pokémon is now Paralyzed."
            onActivate {
              if(it==PLAY_FROM_HAND && confirm("Use Freezing Screech?")) {
                powerUsed()
                flip {apply PARALYZED, opp.active, Source.POKEPOWER}
              }
            }
          }
          move "Blizzard", {
            text "60 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Benched Pokémon. If tails, this attack does 10 damage to each of your Benched Pokémon."
            energyCost W, W, C
            onAttack {
              damage 60
              flip 1, {opp.bench.each {damage 10, it}}, {my.bench.each {damage 10, it}}
            }
          }

        };
      case CRESSELIA_2:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Future Sight", {
            text "Look at the top 5 cards of either player’s deck and put them back on top of that player’s deck in any order."
            energyCost C
            foresight(5, delegate)
          }
          move "Healing Light", {
            text "40 damage. Remove 1 damage counter from each of your Pokémon."
            energyCost P, P, C
            onAttack {
              damage 40
              my.all.each{heal 10, it}
            }
          }

        };
      case DARKRAI_3:
        return basic (this, hp:HP080, type:DARKNESS, retreatCost:2) {
          weakness F, PLUS20
          resistance P, MINUS20
          pokePower "Darkness Shade", {
            text "Once during your turn, when you put Darkrai from your hand onto your Bench, you may choose 1 of the Defending Pokémon. That Pokémon is now Asleep."
            onActivate {
              if(it==PLAY_FROM_HAND && my.deck && confirm("Use Darkness Shade?")) {
                powerUsed()
                apply ASLEEP
              }
            }
          }
          move "Dark Slumber", {
            text "10 damage. At the end of your opponent’s next turn, the Defending Pokémon is now Asleep."
            energyCost D
            attackRequirement {}
            onAttack {
              damage 10
              def pcs = defending
              targeted(pcs){
                delayed {
                  before BETWEEN_TURNS, {
                    if (bg.currentTurn == self.owner.opposite && all.contains(pcs)) {
                      bc "Dark Slumber activates."
                      apply ASLEEP, pcs
                    }
                  }
                  unregisterAfter 2
                  after FALL_BACK, pcs, {unregister()}
                  after CHANGE_STAGE, pcs, {unregister()}
                }
              }
            }
          }
          move "Dark Resolve", {
            text "40 damage. If the Defending Pokémon is Asleep, remove 4 damage counters from Darkrai."
            energyCost D, D, C
            onAttack {
              damage 40
              if (defending.isSPC(ASLEEP)) {
                heal 40, self
              }
            }
          }
        }
      case DIALGA_4:
        return basic (this, hp:HP100, type:METAL, retreatCost:3) {
          weakness R, PLUS20
          resistance P, MINUS20
          customAbility {
          //Adamant Orb: If an Active Pokémon has Weakness to [M] type, Dialga’s attacks do 20 more damage to that Pokémon (before applying Weakness and Resistance).
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if (it.from.owner==self.owner && it.from == self && self.active && it.to.active && it.to.owner!=self.owner && it.dmg.value) {
                    if (it.to.getWeaknesses().findAll{it.type == M}) {
                      bc "Adamant Orb +20"
                      it.dmg += hp(20)
                    }
                  }
                }
              }
            }
          }
          move "Time Shift", {
            text "Draw cards until you have 6 cards in your hand."
            energyCost M
            attackRequirement{
              assert my.hand.size() < 6 : "You have 6 or more cards in hand."
              assert my.deck : "Your deck is empty."
            }
            onAttack{
            draw 6-my.hand.size()
            }
          }
          move "Diamond Blast", {
            text "60+ damage. Flip a coin. If heads, this attack does 60 damage plus 20 more damage."
            energyCost M, M, C, C
            attackRequirement {}
            onAttack {
              damage 60
              flip { damage 20 }
            }
          }

        };
      case GLACEON_5:
        return evolution (this, from:"Eevee", hp:HP080, type:WATER, retreatCost:1) {
          weakness M, PLUS20
          move "Snow Cloak", {
            text "30 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Glaceon during your opponent’s next turn."
            energyCost W
            onAttack {
              damage 30
              flip {preventAllEffectsNextTurn()}
            }
          }
          move "Speed Slide", {
            text "60 damage. This attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost W, C, C
            onAttack {
              noResistanceOrAnyEffectDamage(60, defending)
            }
          }

        };
      case KABUTOPS_6:
        return evolution (this, from:"Kabuto", hp:HP120, type:FIGHTING, retreatCost:2) {
          weakness G, PLUS30
          pokeBody "Primal Shell", {
            text "As long as Kabutops is your Active Pokémon, your opponent can’t play any Trainer-Item cards from his or her hand."
            delayed {
              before PLAY_TRAINER, {
                if (self.active && ef.cardToPlay.cardTypes.is(ITEM) && bg.currentTurn == self.owner.opposite) {
                  wcu "Primal Shell prevents you from playing this card."
                  prevent()
                }
              }
            }
          }
          move "Chop Up", {
            text "70 damage. Does 10 damage to each of your opponent’s Benched Pokémon that has any damage counters on it."
            energyCost F, F, C
            onAttack {
              damage 70
              opp.bench.each{
                if(it.numberOfDamageCounters) {
                  damage 10, it
                }
              }
            }
          }

        };
      case LEAFEON_7:
        return evolution (this, from:"Eevee", hp:HP090, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Bind Down", {
            text "30 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost G
            onAttack {
              damage 30
              cantRetreat(defending)
            }
          }
          move "Leaf Guard", {
            text "During your opponent’s next turn, any damage done to Leafeon by attacks is reduced by 20 (after applying Weakness and Resistance)."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 60
              reduceDamageNextTurn(hp(20),thisMove)
            }
          }

        };
      case MANAPHY_8:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          pokeBody "Aqua Skin", {
            text "When you attach a [W] Energy card from your hand to Manaphy, remove 2 damage counters from Manaphy."
            delayedA {
            after ATTACH_ENERGY, self, {
              if (ef.reason==PLAY_FROM_HAND && ef.card.asEnergyCard().containsType(W)) {
                bc "$thisAbility removes 2 damage counters from $self"
                heal 20, self
              }
            }
          }
          }
          move "Chase Up", {
            text "Flip a coin. If heads, search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty."
            }
            onAttack {
              flip {
                my.deck.search(count:1,"Select 1 card",{true}).moveTo(my.hand)
                shuffleDeck()
              }
            }
          }
          move "Fountain", {
            text "30 damage. You may attach up to 2 basic [W] Energy cards from your hand to your Benched Pokémon in any way you like."
            energyCost W, W
            onAttack {
              damage 30
              if(my.hand.filterByBasicEnergyType(W) && my.bench) {
                my.hand.select(min:0, max:2, "Choose up to 2 basic [W] Energy cards to attach to your Benched Pokémon",basicEnergyFilter(W)).each {
                  attachEnergy(my.bench.select("Attach $it to"), it, PLAY_FROM_HAND)
                }
              }
            }
          }

        };
      case MEWTWO_9:
        return basic (this, hp:HP090, type:PSYCHIC, retreatCost:2) {
          weakness P
          move "Energy Absorption", {
            text "Search your discard pile for up to 2 Energy cards and attach them to Mewtwo."
            energyCost ()
            attackRequirement {
              assert my.discard.filterByType(ENERGY) : "You have no Energy cards in your discard"
            }
            onAttack {
              my.discard.select(max:2, "Search your discard pile for up to 2 Energy cards", cardTypeFilter(ENERGY)).each {
                attachEnergy(self, it)
              }
            }
          }
          move "Recover", {
            text "Discard a [P] Energy attached to Mewtwo and remove 6 damage counters from Mewtwo."
            energyCost P
            attackRequirement {
              assert self.numberOfDamageCounters || self.cards.energyCount(P) : "$self has no damage counters or [P] Energy"
            }
            onAttack {
              heal 60, self
              discardSelfEnergyAfterDamage P
            }
          }
          move "Psyburn", {
            text "60 damage. "
            energyCost P, P, C
            onAttack {
              damage 60
            }
          }

        };
      case MOLTRES_10:
        return basic (this, hp:HP100, type:FIRE, retreatCost:2) {
          weakness W
          resistance F, MINUS20
          pokePower "Flame Charge", {
            text "Once during your turn, when you put Moltres from your hand onto your Bench, you may flip a coin. If heads, search your discard pile for up to 3 [R] Energy cards and attach them to Moltres."
            onActivate {r->
              if (r==PLAY_FROM_HAND && my.discard.filterByEnergyType(R) && confirm("Use Flame Charge?")) {
                powerUsed()
                flip {
                  def maxCards = Math.min(3,my.discard.filterByEnergyType(R).size())
                  my.discard.select(max:maxCards,"Search your discard pile for up to 3 [R] Energy cards",energyFilter(R)).each {
                    attachEnergy(self, it)
                  }
                }
              }
            }
          }
          move "Scorching Wing", {
            text "100 damage. Discard all [R] Energy attached to Moltres."
            energyCost R, R, C
            onAttack {
              damage 100
              afterDamage {
                discardAllSelfEnergy(R)
              }
            }
          }

        };
      case PALKIA_11:
        return basic (this, hp:HP100, type:WATER, retreatCost:3) {
          weakness L, PLUS20
          customAbility {
          //Lustrous Orb: If an Active Pokémon has Weakness to [W] type, Dialga’s attacks do 20 more damage to that Pokémon (before applying Weakness and Resistance).
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if (it.from.owner==self.owner && it.from == self && self.active && it.to.active && it.to.owner!=self.owner && it.dmg.value) {
                    if (it.to.getWeaknesses().find{it.type == W}) {
                      bc "Adamant Orb +20"
                      it.dmg += hp(20)
                    }
                  }
                }
              }
            }
          }
          move "Zone Shift", {
            text "Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost W
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              whirlwind()
            }
          }
          move "Pearl Blast", {
            text "60 damage. You may return an Energy card attached to Palkia to your hand. If you do, choose an Energy card attached to the Defending Pokémon and return it to your opponent’s hand."
            energyCost W, W, C, C
            onAttack {
              damage 60
              if(self.cards.filterByType(ENERGY) && defending.cards.filterByType(ENERGY) && confirm("Return an Energy attached to $self to your hand?")) {
                self.cards.select("Return an energy card attached to $self to your hand", cardTypeFilter(ENERGY)).moveTo(my.hand)
                targeted (defending) {
                  defending.cards.select("Return an energy card attached to $self to your hand", cardTypeFilter(ENERGY)).moveTo(opp.hand)
                }
              }
            }
          }

        };
      case PHIONE_12:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Evolution Wish", {
            text "Search your deck for a card that evolves from 1 of your Pokémon and put it onto that Pokémon. (This counts as evolving that Pokémon.) Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is emtpy"
            }
            onAttack {
              def names = my.all.collect{it.name}
              def sel = deck.search ("Select a Pokémon that evolves from 1 of your Pokémon.", {it.cardTypes.is(EVOLUTION) && names.contains(it.predecessor)}).first()
              if(sel) {
                def pcs = my.all.findAll{it.name == sel.predecessor}.select("Put $sel onto...")
                evolve(pcs, sel)
              }
              shuffleDeck()
            }
          }
          move "Water Pulse", {
            text "30 damage. The Defending Pokémon is now Asleep."
            energyCost W, W
            onAttack {
              damage 30
              applyAfterDamage ASLEEP
            }
          }

        };
      case ROTOM_13:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Dual Trans", {
            text "Search your discard pile for up to 2 basic Energy cards and attach them to 1 of your Pokémon."
            energyCost ()
            attackRequirement {
              assert my.discard.filterByType(BASIC_ENERGY)
            }
            onAttack {
              def cards = my.discard.select(max:2,"Search your discard pile for up to 2 basic Energy",cardTypeFilter(BASIC_ENERGY))
              def tar = my.all.select("Attach to...")
              cards.each{
                attachEnergy(tar, it)
              }
            }
          }
          move "Reflect Energy", {
            text "30 damage. Move an Energy card attached to Rotom to 1 of your Benched Pokémon."
            energyCost L, C
            onAttack {
              damage 30
              if(my.bench && self.cards.energyCount(C)) {
                moveEnergy(self,my.bench)
              }
            }
          }

        };
      case ZAPDOS_14:
        return basic (this, hp:HP100, type:LIGHTNING, retreatCost:2) {
          weakness L
          resistance F, MINUS20
          pokePower "Sheet Lightning", {
            text "Once during your turn, when you put Zapdos from your hand onto your Bench, you may flip a coin. If heads, put 1 damage counter on each of your opponent’s Pokémon."
            onActivate {r->
              if (r==PLAY_FROM_HAND && confirm("Use Sheet Lightning?")) {
                powerUsed()
                flip {
                  opp.all.each {
                    directDamage 10, it, Source.POKEPOWER
                  }
                }
              }
            }
          }
          move "Raging Thunder", {
            text "80 damage. Does 40 damage to 1 of your Pokémon, and don’t apply Weakness and Resistance to this damage."
            energyCost L, L, C
            onAttack {
              damage 80
              noWrDamage 40, my.all.select()
            }
          }

        };
      case AERODACTYL_15:
        return evolution (this, from:"Old Amber", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          pokeBody "Primal Claw", {
            text "After your opponent’s Pokémon uses a Poké-Power, put 2 damage counters on that Pokémon."
            delayedA {
              after USE_ABILITY_OUTER, {
                if (ef.targetPokemon.owner != self.owner && ef.ability instanceof PokePower) {
                  bc "Primal Claw activates"
                  directDamage(20, ef.targetPokemon)
                }
              }
            }
          }
          move "Supersonic", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C, C
            onAttack {
              damage 30
              flip {
                apply CONFUSED
              }
            }
          }

        };
      case BRONZONG_16:
        return evolution (this, from:"Bronzor", hp:HP090, type:PSYCHIC, retreatCost:3) {
          weakness P, PLUS20
          resistance R, MINUS20
          pokeBody "Cursed Alloy", {
            text "As long as Bronzong is your Active Pokémon, put 1 damage counter on each of your opponent’s Pokémon that has any Poké-Powers between turns."
            delayedA {
              before BEGIN_TURN, {
                if (self.active) {
                  def once = true
                  def hasPokePower = false

                  self.owner.opposite.pbg.all.each {
                    for (Ability ability : it.getAbilities().keySet()) {
                      if (ability instanceof PokePower) hasPokePower = true;
                    }
                    if (hasPokePower) {
                      if (once) {
                        bc "Cursed Alloy"
                        once = false
                      }
                      directDamage(10, it, Source.POKEBODY)
                      hasPokePower = false
                    }
                  }
                }
              }
            }
          }
          move "Pain Amplifier", {
            text "Put 1 damage counter on each of your opponent’s Pokémon that already has damage counters on it"
            energyCost ()
            attackRequirement {
              assert opp.all.find{it.numberOfDamageCounters}
            }
            onAttack {
              opp.all.findAll{it.numberOfDamageCounters}.each {
                directDamage 10, it
              }
            }
          }
          move "Coating", {
            text "60 damage. During your opponent's next turn, any damage done to Bronzong by attacks is reduced by 20."
            energyCost P, C, C
            onAttack {
              damage 60
              reduceDamageNextTurn(hp(20), thisMove)
            }
          }

        };
      case EMPOLEON_17:
        return evolution (this, from:"Prinplup", hp:HP130, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          move "Dual Splash", {
            text "Choose 2 of your opponent’s Pokémon. This attack does 30 damage to each of them."
            energyCost W, C
            onAttack {
              multiSelect(opp.all, 2, "Choose 2 of your opponent's Pokémon").each {
                damage 30, it
              }
            }
          }
          move "Surf Together", {
            text "50+ damage. Does 50 damage plus 10 more damage for each of your Benched Pokémon. Flip a coin. If tails, this attack does 10 damage to each of your Benched Pokémon."
            energyCost W, W, C
            onAttack {
              damage 50 + 10 * my.bench.size()
              flip 1, {}, {
                my.bench.each {
                  damage 10, it
                }
              }
            }
          }

        };
      case ESPEON_18:
        return evolution (this, from:"Eevee", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokeBody "Sunlight Veil", {
            text "Each of your Pokémon that evolves from Eevee gets +20 HP. You can’t use more than 1 Sunlight Veil Poké-Body each turn."

            def eff, source, target
            onActivate {
              eff = getter (GET_FULL_HP,BEFORE_LAST) {h->
                def pcs = h.effect.target
                if (pcs.owner == self.owner && pcs.realEvolution && pcs.topNonLevelUpPokemonCard.predecessor == "Eevee"){
                  target = bg.em().retrieveObject("Sunlight_Veil_target")
                  target = target?target:[]
                  source = bg.em().retrieveObject("Sunlight_Veil_source")
                  source = source?source:[]
                  if(!target.contains(pcs)){
                    h.object += hp(20)
                    target.add(pcs)
                    bg.em().storeObject("Sunlight_Veil_target", target)
                    source.add(self)
                    bg.em().storeObject("Sunlight_Veil_source", source)
                  } else if(source.get(target.indexOf(pcs)) == self){
                    h.object += hp(20)
                  }
                }
              }
            }
            onDeactivate {
              eff.unregister()
              target = []
              source = []
              bg.em().storeObject("Sunlight_Veil_target", target)
              bg.em().storeObject("Sunlight_Veil_source", source)
            }
          }
          move "Morning Sun", {
            text "60 damage. You may move an Energy card attached to Espeon to 1 of your Benched Pokémon."
            energyCost P, C, C
            onAttack {
              damage 60
              if(my.bench && self.cards.energyCount(C) && confirm("Move an Energy card attached to $self to 1 of your Benched Pokémon?")) {
                afterDamage {
                  moveEnergy(self, my.bench)
                }
              }
            }
          }

        };
      case FLAREON_19:
        return evolution (this, from:"Eevee", hp:HP090, type:FIRE, retreatCost:2) {
          weakness W, PLUS20
          move "Fire Fang", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost R
            onAttack {
              damage 30
              flip {
                applyAfterDamage BURNED
              }
            }
          }
          move "Kindle", {
            text "70 damage. Discard an Energy card attached to Flareon and then discard an Energy card attached to the Defending Pokémon."
            energyCost R, C, C
            onAttack {
              damage 70
              discardSelfEnergyAfterDamage C
              discardDefendingEnergyAfterDamage C
            }
          }

        };
      case GLACEON_20:
        return evolution (this, from:"Eevee", hp:HP090, type:WATER, retreatCost:1) {
          weakness M, PLUS20
          move "Ice Shot", {
            text "30 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost W, C
            onAttack {
              damage 30
              if(opp.bench) {
                damage 10, opp.bench.select()
              }
            }
          }
          move "Icy Wind", {
            text "60 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost W, C, C
            onAttack {
              damage 60
              flip {
                applyAfterDamage ASLEEP
              }
            }
          }

        };
      case HIPPOWDON_21:
        return evolution (this, from:"Hippopotas", hp:HP100, type:FIGHTING, retreatCost:3) {
          weakness W, PLUS20
          move "Vacuum Sand", {
            text "20 damage. Search your discard for a [F] Energy card and attach it to Hippowdon."
            energyCost ()
            onAttack {
              damage 20
              attachEnergyFrom(type: F, my.discard, self)
            }
          }
          move "Sand Impact", {
            text "50+ damage. Flip a coin for each [F] Energy attached to Hippowdon. This attack does 50 damage plus 20 more damage for each heads."
            energyCost F, C, C
            onAttack {
              damage 50
              flip self.cards.energyCount(F), {
                damage 20
              }
            }
          }

        };
      case INFERNAPE_22:
        return evolution (this, from:"Monferno", hp:HP110, type:FIRE, retreatCost:0) {
          weakness W, PLUS30
          move "Mach Punch", {
            text "30 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost C
            onAttack {
              damage 30
              if(opp.bench) {
                damage 10, opp.bench.select()
              }
            }
          }
          move "Mega Bravo", {
            text "40× damage. Discard all [R] Energy attached to Infernape. This attack does 40 damage times the ammount of [R] Energy you discarded."
            energyCost R
            attackRequirement {
              assert self.cards.energyCount(R) : "$self has no [R] Energy attached"
            }
            onAttack {
              damage 40 * self.cards.energyCount(R)
              afterDamage {
                discardAllSelfEnergy R
              }
            }
          }

        };
      case JOLTEON_23:
        return evolution (this, from:"Eevee", hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Thunder Fang", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Lightning Strike", {
            text "50 damage. You may discard 2 Energy attached to Jolteon. If you do, this attack’s base damage is 90 instead of 50."
            energyCost L, L, C
            onAttack {
              damage 50
              if(confirm("Discard 2 Energy attached to $self")) {
                damage 40
                discardSelfEnergyAfterDamage C, C
              }
            }
          }

        };
      case LEAFEON_24:
        return evolution (this, from:"Eevee", hp:HP090, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Sprial Drain", {
            text "40 damage. Remove 1 damage counter from Leafeon."
            energyCost G, C
            onAttack {
              damage 40
              heal 10, self
            }
          }
          move "Leaf Blade", {
            text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 20 more damage."
            energyCost G, C, C
            onAttack {
              damage 50
              flip {
                damage 20
              }
            }
          }

        };
      case MINUN_25:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Pound", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "(+) Spark", {
            text "20 damage. If Plusle is on your Bench, this attack does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost L, C
            onAttack {
              damage 20
              if(my.bench.find{it.name == "Plusle"} && opp.bench) {
                damage 20, opp.bench.select()
              }
            }
          }

        };
      case OMASTAR_26:
        return evolution (this, from:"Omanyte", hp:HP110, type:WATER, retreatCost:1) {
          weakness G, PLUS30
          pokePower "Primal Swirl", {
            text "Once during your turn, when you play Omastar from your hand to evolve 1 of your Pokémon, you may remove the highest Stage Evolution card from each of your opponent’s Benched Evolved Pokémon and put those cards back into his or her hand. You can’t use more than 1 Primal Swirl Poké-Power each turn."
            onActivate {r ->
              if(r == PLAY_FROM_HAND && bg.em().retrieveObject("Primal_Swirl") != bg.turnCount && opp.bench.find{it.evolution} && confirm("Use $thisAbility?")){
                bg.em().storeObject("Primal_Swirl",bg.turnCount)
                powerUsed()
                opp.bench.findAll{it.evolution}.each {
                  devolve(it, opp.hand)
                }
              }
            }
          }
          move "Send Back", {
            text "40 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost W, C
            onAttack {
              damage 40
              afterDamage {
                whirlwind()
              }
            }
          }

        };
      case PHIONE_27:
        return basic (this, hp:HP070, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Charm", {
            text "During your opponent's next turn, any damage done by attacks from the Defending Pokémon is reduced by 20."
            energyCost C
            onAttack {
              reduceDamageFromDefendingNextTurn(hp(20), thisMove, defending)
            }
          }
          move "Whirlpool", {
            text "30 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost W, W
            onAttack {
              damage 30
              flip {
                discardDefendingEnergy()
              }
            }
          }

        };
      case PLUSLE_28:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(basic:true, 1, delegate)
          }
          move "(-) Boost", {
            text "20 damage. If Minun is on your Bench, this attack does 20 damage plus 20 more damage."
            energyCost L, C
            onAttack {
              damage 20
              if(my.bench.find{it.name == "Minun"}) {
                damage 20
              }
            }
          }

        };
      case SCIZOR_29:
        return evolution (this, from:"Scyther", hp:HP090, type:METAL, retreatCost:1) {
          weakness R, PLUS30
          resistance P, MINUS20
          move "Special Blow", {
            text "30+ damage. If the Defending Pokémon has any Special Energy cards attached to it, this attack does 30 damage plus 50 more damage."
            energyCost M
            onAttack {
              damage 30
              if(defending.cards.filterByType(SPECIAL_ENERGY)) {
                damage 50
              }
            }
          }
          move "X-Scissor", {
            text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 40 more damage."
            energyCost M, C, C
            onAttack {
              damage 50
              flip {
                damage 40
              }
            }
          }

        };
      case TORTERRA_30:
        return evolution (this, from:"Grotle", hp:HP140, type:GRASS, retreatCost:4) {
          weakness R, PLUS30
          move "Earthquake", {
            text "60 damage. Does 10 damage to each of your Benched Pokémon."
            energyCost C, C
            onAttack {
              damage 60
              my.bench.each {
                damage 10, it
              }
            }
          }
          move "Frenzy Plant", {
            text "100 damage. Torterra can’t use Frenzy Plant during your next turn."
            energyCost G, G, C, C
            onAttack {
              damage 100
              cantUseAttack(thisMove, self)
            }
          }

        };
      case TOXICROAK_31:
        return evolution (this, from:"Croagunk", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Paralyze Poison", {
            text "20 damage. The Defending Pokémon is now Poisoned. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and Poisoned."
            energyCost P
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
              applyAfterDamage POISONED
            }
          }
          move "Slash", {
            text "60 damage. "
            energyCost P, C, C
            onAttack {
              damage 60
            }
          }

        };
      case UMBREON_32:
        return evolution (this, from:"Eevee", hp:HP080, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS20
          resistance P, MINUS20
          pokeBody "Moonlight Veil", {
            text "Each of your Pokémon that evolves from Eevee has no Weakness, and that Pokémon’s Retreat Cost is 0."
            getterA (GET_WEAKNESSES) { h->
              def pcs = h.effect.target
              if(pcs.owner == self.owner && pcs.realEvolution && pcs.topPokemonCard.predecessor == "Eevee") {
                def list = h.object as List<Weakness>
                list.clear()
              }
            }
            getterA GET_RETREAT_COST ,{ h->
              def pcs = h.effect.target
              if (pcs.owner == self.owner && pcs.realEvolution && pcs.topPokemonCard.predecessor == "Eevee") {
                h.object = 0
              }
            }
          }
          move "Confuse Ray", {
            text "50 damage. The Defending Pokémon is now Confused."
            energyCost D, C, C
            onAttack {
              damage 50
              applyAfterDamage CONFUSED
            }
          }

        };
      case UNOWN_P_33:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "PUT", {
            text "Once during your turn , if Unown P is on your Bench, you may put 1 damage counter on 1 of your Pokémon (excluding any Unown)."
            actionA {
              checkLastTurn()
              assert self.benched : "$self is not you your Bench"
              assert my.all.find{!it.name.contains("Unown")} : "All of your Pokémon are Unown"
              powerUsed()
              directDamage 10, my.all.findAll{!it.name.contains("Unown")}.select("Put 1 damage counter on 1 of your Pokémon"), Source.POKEPOWER
            }
          }
          move "Hidden Power", {
            text "20+ damage. Each player discards the top card of his or her deck. This attack does 20 damage plus 20 more damage for each Unown discarded in this way."
            energyCost P
            onAttack {
              damage 20
              if(my.deck && my.deck.subList(0,1).discard().find{it.cardTypes.is(POKEMON) && it.name.contains("Unown")}) {
                damage 20
              }
              if(opp.deck && opp.deck.subList(0,1).discard().find{it.cardTypes.is(POKEMON) && it.name.contains("Unown")}) {
                damage 20
              }
            }
          }

        };
      case VAPOREON_34:
        return evolution (this, from:"Eevee", hp:HP090, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Cleanse Away", {
            text "30 damage. Remove 2 damage counters from each of your Benched Pokémon."
            energyCost W
            onAttack {
              damage 30
              my.bench.each{
                heal 20, it
              }
            }
          }
          move "Hyper Whirlpool", {
            text "60 damage. Flip a coin until you get tails. For each heads, discard an Energy card attached to the Defending Pokémon."
            energyCost W, C, C
            onAttack {
              damage 60
              afterDamage {
                def energyCards = defending.cards.filterByType(ENERGY)
                def heads = 0
                flipUntilTails {
                  heads ++
                }
                def discardSize = Math.min(heads, energyCards.size())
                if(discardSize > 0) {
                  if (discardSize == energyCards.size()) {
                    bc "All energies are being discarded."
                    energyCards.discard()
                  } else {
                    energyCards.select(count: discardSize, "Choose $discardSize Energy cards to discard from the Defending Pokémon").discard()
                  }
                }
              }
            }
          }

        };
      case AMBIPOM_35:
        return evolution (this, from:"Aipom", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Astonish", {
            text "20 damage. Choose 1 card from your opponent’s hand without looking. Look at that card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost C, C
            onAttack {
              damage 20
              afterDamage {
                astonish()
              }
            }
          }
          move "Hang High", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon."
            energyCost C, C, C
            onAttack {
              damage 40, opp.all.select()
            }
          }

        };
      case FEAROW_36:
        return evolution (this, from:"Spearow", hp:HP080, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Fury Attack", {
            text "20× damage. Flip 3 coins. This attack does 20 damage times the number of heads."
            energyCost C
            onAttack {
              flip 3, {
                damage 20
              }
            }
          }
          move "Drill Peck", {
            text "60 damage. "
            energyCost C, C, C
            onAttack {
              damage 60
            }
          }

        };
      case GROTLE_37:
        return evolution (this, from:"Turtwig", hp:HP090, type:GRASS, retreatCost:3) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Planting", {
            text "20 damage. Attach a [G] Energy card from your hand to 1 of your Pokémon."
            energyCost C
            onAttack {
              damage 20
              attachEnergyFrom(type:G, my.hand, my.all)
            }
          }
          move "Body Slam", {
            text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 40
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case KANGASKHAN_38:
        return basic (this, hp:HP090, type:COLORLESS, retreatCost:3) {
          weakness F, PLUS20
          move "Bite", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }
          move "Comet Punch", {
            text "20× damage. Flip 4 coins. This attack does 20 damage times the number of heads."
            energyCost C, C, C
            onAttack {
              flip 4, {
                damage 20
              }
            }
          }

        };
      case LICKITUNG_39:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Lap Up", {
            text "Draw a card."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              draw 1
            }
          }
          move "Slam", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            onAttack {
              flip 2, {
                damage 20
              }
            }
          }

        };
      case MANECTRIC_40:
        return evolution (this, from:"Electrike", hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Thunder Wave", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Volt Crush", {
            text "40+ damage. Flip a coin. If heads, discard an Energy attached to Manectric and this attack does 40 damage plus 30 more damage."
            energyCost L, C
            onAttack {
              damage 40
              flip {
                damage 30
                discardSelfEnergyAfterDamage C
              }
            }
          }

        };
      case MONFERNO_41:
        return evolution (this, from:"Chimchar", hp:HP070, type:FIRE, retreatCost:0) {
          weakness W, PLUS20
          move "Fire Fang", {
            text "30 damage. The Defending Pokémon is now Burned."
            energyCost R
            onAttack {
              damage 30
              applyAfterDamage BURNED
            }
          }
          move "Mid-air Strike", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage."
            energyCost C, C
            onAttack {
              damage 30
              flip {
                damage 30
              }
            }
          }

        };
      case MOTHIM_42:
        return evolution (this, from:["Burmy","Burmy Plant Cloak","Burmy Sandy Cloak","Burmy Trash Cloak"], hp:HP080, type:GRASS, retreatCost:0) {
          weakness R, PLUS20
          resistance F, MINUS20
          pokeBody "Disturbance Scales", {
            text "Any damage done by attacks from your Pokémon to the Defending Pokémon isn’t affected by Resistance."
            delayedA {
              before APPLY_RESISTANCE, {
                if (ef.attacker.owner == self.owner) {
                  bg.dm().each {
                    if (it.to.owner == self.owner.opposite && it.to.active) {
                      // TODO: For below line, add Additional if? " && it.from.types.any{ty -> it.to.resistances.contains(ty)}"
                      // bc "$thisAbility ignores resistance" // This shouldn't always print.
                      prevent()
                    }
                  }
                }
              }
            }
          }
          move "Get Help", {
            text "30× damage. Does 30 damage times the number of different types of Wormadam on your Bench."
            energyCost G
            attackRequirement {
              assertMyBench(info: "with Wormadam in their name", {it.name.contains("Wormadam")})
            }
            onAttack {
              def wormTypes = []
              my.bench.each {
                if(it.name.contains("Wormadam")) {
                  for (Type ty : it.getTypes()) {
                    if (!wormTypes.contains(ty)) {
                      wormTypes.add(ty)
                      break
                    }
                  }
                }
              }
              damage 30 * wormTypes.size()
            }
          }
          move "Quick Touch", {
            text "40 damage. You may switch Mothim with 1 of your Benched Pokémon. If you do, move as many Energy cards attached to Mothim as you like to the new Active Pokémon."
            energyCost G, C
            onAttack {
              damage 40
              afterDamage {
                if(my.bench && confirm("Switch $self with 1 of your Benched Pokémon?")) {
                  if(sw2(my.bench.select("New Active Pokémon"))) {
                    self.cards.select(min:0,max:self.cards.filterByType(ENERGY).size(),"Move any number of Energy cards to ${my.active}",cardTypeFilter(ENERGY)).each{
                      energySwitch(self,my.active,it)
                    }
                  }
                }
              }
            }
          }

        };
      case PACHIRISU_43:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Trans Tail", {
            text "Search your discard for a [L] Energy card, show it to your opponent, and put it into your hand."
            energyCost ()
            attackRequirement {
              assert my.discard.filterByEnergyType(L) : "You have no [L] Energy in your discard"
            }
            onAttack {
              my.discard.select("Choose a [L] Energy to put into your hand",basicEnergyFilter(L)).moveTo(my.hand)
            }
          }
          move "Thundershock", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            onAttack {
              damage 30
              flip {
                apply PARALYZED
              }
            }
          }

        };
      case PRINPLUP_44:
        return evolution (this, from:"Piplup", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Ice Blade", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon."
            energyCost W, C
            onAttack {
              damage 30, opp.all.select("Choose 1 of your opponent's Pokémon")
            }
          }
          move "Wash Over", {
            text "50 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
            energyCost W, C, C
            onAttack {
              damage 50
              if(opp.bench) {
                multiSelect(opp.bench, 2, "Does 10 damage to 2 of your opponent's Benched Pokémon").each {
                  damage 10, it
                }
              }
            }
          }

        };
      case RAICHU_45:
        return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Agilty", {
            text "20 damage. Flip a coin. If heads, prevent all effects of an attack, including damage, done to Raichu during your opponent’s next turn."
            energyCost C
            onAttack {
              damage 20
              afterDamage {
                flip {
                  preventAllEffectsNextTurn()
                }
              }
            }
          }
          move "Thunderbolt", {
            text "100 damage. Discard all Energy cards attached to Raichu."
            energyCost L, L, C
            onAttack {
              damage 100
              afterDamage {
                discardAllSelfEnergy()
              }
            }
          }

        };
      case SCYTHER_46:
        return basic (this, hp:HP070, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Slash", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Fury Cutter", {
            text "10+ damage. Flip 3 coins. If 1 of them is heads, this attack does 10 damage plus 10 more damage. If 2 of them are heads, this attack does 10 damage plus 20 more damage. If all of them are heads, this attack does 10 damage plus 40 more damage."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 10
              flip 3,{},{}, [ 1:{damage 10}, 2:{damage 20}, 3:{damage 40} ]
            }
          }

        };
      case STARAVIA_47:
        return evolution (this, from:"Starly", hp:HP080, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage."
            energyCost C
            onAttack {
              damage 10
              flip {
                damage 30
              }
            }
          }
          move "Drill Peck", {
            text "50 damage. "
            energyCost C, C, C
            onAttack {
              damage 50
            }
          }

        };
      case SUDOWOODO_48:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness W, PLUS20
          move "Flail", {
            text "10× damage. Does 10 damage times the number of damage counters on Sudowoodo."
            energyCost C
            onAttack {
              damage 10 * self.numberOfDamageCounters
            }
          }
          move "Wood Hammer", {
            text "50 damage. Sudowoodo does 30 damage to itself."
            energyCost F, F
            onAttack {
              damage 50
              damage 30, self
            }
          }

        };
      case UNOWN_Q_49:
        return basic (this, hp:HP030, type:PSYCHIC, retreatCost:0) {
          weakness P, PLUS10
          pokePower "QUICK", {
            text "Once during your turn , if Unown Q is on your Bench, you may discard all cards attached to Unown Q and attach Unown Q to 1 of your Pokémon as a Pokémon Tool card. As long as Unown Q is attached to a Pokémon, you pay C less to retreat that Pokémon."
            actionA {
              checkLastTurn()
              assert self.benched : "$self is not on your bench"
              assert my.all.find {it!=self && canAttachPokemonTool(it)} : "No place to attach"
              powerUsed()
              def top = self.topPokemonCard
              self.cards.getExcludedList(top).discard()
              def trcard
              trcard = pokemonTool(new CustomCardInfo(top.staticInfo).setCardTypes(TRAINER, ITEM, POKEMON_TOOL)) {
                def eff
                onPlay {
                  eff = getter GET_RETREAT_COST, self, {h ->
                    h.object -= 1
                  }
                }
                onRemoveFromPlay {
                  eff.unregister()
                  bg.em().run(new ChangeImplementation(top, trcard))
                }
                onDisable {
                  eff.unregister()
                }
              }
              trcard.initializeFrom(top)
              def pcs = my.all.findAll {it!=self && canAttachPokemonTool(it)}.select("Attach to?")
              removeFromPlay(self, [top] as CardList)
              bg.em().run(new ChangeImplementation(trcard, top))
              attachPokemonTool(trcard, pcs)
              removePCS(self)
            }
          }
          move "Hidden Power", {
            text "20 damage. "
            energyCost C
            onAttack {
              damage 20
            }
          }

        };
      case AIPOM_50:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              draw 1
            }
          }
          move "Hand Trick", {
            text "20 damage. Return Aipom and all cards attached to it to your hand. (If you don’t have any Benched Pokémon, this attack does nothing.)"
            energyCost C, C
            attackRequirement {
              assert my.bench : "Your bench is empty"
            }
            onAttack {
              if (my.bench.notEmpty) {
                damage 20
                scoopUpPokemon(self, delegate)
              }
            }
          }

        };
      case AIPOM_51:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Scratch", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Last Resort", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            onAttack {
              flip {
                damage 30
              }
            }
          }

        };
      case BRONZOR_52:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          resistance R, MINUS20
          move "Hypnosis", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            onAttack {
              apply ASLEEP
            }
          }
          move "Confuse Ray", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case BUNEARY_53:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Drawup Power", {
            text "Search your deck for an Energy card, show it to your opponent, and put it into your hand. Shuffle your deck afterwards."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search("Search your deck for an Energy card",cardTypeFilter(ENERGY)).moveTo(my.hand)
            }
          }
          move "Extend Ears", {
            text "10 damage. Remove 1 damage counter from each of your Benched Pokémon."
            energyCost C
            onAttack {
              damage 10
              my.bench.each {
                heal 10, it
              }
            }
          }

        };
      case BURMY_SANDY_CLOAK_54:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Iron Defense", {
            text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Burmy Sandy Cloak during your opponent’s next turn."
            energyCost C
            onAttack {
              flip {
                preventAllEffectsNextTurn()
              }
            }
          }
          move "Tackle", {
            text "30 damage. "
            energyCost F, C
            onAttack {
              damage 30
            }
          }

        };
      case CHATOT_55:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Mimic", {
            text "Shuffle your hand into your deck. Then, draw a number of cards equal to the number of cards in your opponent’s hand."
            energyCost ()
            attackRequirement {
              assert my.hand || opp.hand : "Both your hand and your opponent's hand are empty"
            }
            onAttack {
              my.hand.moveTo(hidden:true, my.deck)
              shuffleDeck()
              draw opp.hand.size()
            }
          }
          move "Chatter", {
            text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C, C
            onAttack {
              damage 20
              cantRetreat defending
            }
          }

        };
      case CHIMCHAR_56:
        return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Flare", {
            text "20 damage. "
            energyCost R
            onAttack {
              damage 20
            }
          }
          move "Lunge", {
            text "40 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            onAttack {
              flip {
                damage 40
              }
            }
          }

        };
      case CHIMCHAR_57:
        return basic (this, hp:HP050, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          //Cheri Berry : If Chimchar is Paralyzed, remove the Special Condition Paralyzed from Chimchar at the end of each player's turn.
          customAbility {
            delayedA {
              before BETWEEN_TURNS, {
                if(self.isSPC(PARALYZED)){
                  bc "Cheri Berry removes paralysis"
                  clearSpecialCondition(self, SRC_OTHER, [PARALYZED])
                }
              }
            }
          }
          move "Fury Swipes", {
            text "Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost C
            onAttack {
              flip 3, {
                damage 10
              }
            }
          }

        };
      case CHINGLING_58:
        return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Chimecho from your hand onto Chingling (this counts as evolving Chingling) and remove all damage counters from Chingling."
            actionA {
              assert my.hand.findAll{it.name.contains("Chimecho")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Chimecho") }.select()
              if (tar) {
                evolve(self, tar.first())
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Uproar", {
            text "Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Pokémon."
            energyCost ()
            onAttack {
              flip {
                opp.all.each {
                  damage 10, it
                }
              }
            }
          }

        };
      case COMBEE_59:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance F, MINUS20
          move "Honey Scent", {
            text "Remove 2 damage counters from 1 of your Pokémon."
            energyCost C
            attackRequirement {
              assert my.all.find{it.numberOfDamageCounters} : "Your pokemon are healthy"
            }
            onAttack {
              heal 20, my.all.findAll{it.numberOfDamageCounters}.select("Remove 2 damage counters from 1 of your Pokémon")
            }
          }
          move "Flitter", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost G, G
            onAttack {
              noWrDamage 20, opp.all.select()
            }
          }

        };
      case CROAGUNK_60:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Light Punch", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Poison Sting", {
            text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost P
            onAttack {
              flip {
                apply POISONED
              }
            }
          }

        };
      case DRIFLOON_61:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Delivery", {
            text "Flip a coin. If heads, put any 1 card from your discard pile into your hand."
            energyCost ()
            attackRequirement {
              assert my.discard : "Your discard pile is empty"
            }
            onAttack {
              flip {
                my.discard.select("Put a card from your discard pile into your hand").moveTo(my.hand)
              }
            }
          }
          move "Reaction", {
            text "20 damage. Switch Drifloon with 1 of your Benched Pokémon."
            energyCost P
            onAttack {
              damage 20
              switchYourActive()
            }
          }

        };
      case EEVEE_62:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Call for Family", {
            text "Search your deck for as many Eevee as you like and put them onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
              assert my.bench.notFull : "Your bench is full"
            }
            onAttack{
              my.deck.search(max:my.bench.freeBenchCount,"Search your deck for as many Eevee as you like and put them onto your Bench",{it.name.contains("Eevee")}).each {
                benchPCS(it)
              }
              shuffleDeck()
            }
          }
          move "Lunge", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            onAttack {
              flip {
                damage 20
              }
            }
          }

        };
      case EEVEE_63:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Gnaw", {
            text "10 damage. "
            energyCost ()
            onAttack {
              damage 10
            }
          }
          move "Sand Attack", {
            text "If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost C
            onAttack {
              sandAttack(thisMove)
            }
          }

        };
      case ELECTRIKE_64:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Random Spark", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon."
            energyCost L
            onAttack {
              damage 10, opp.all.select()
            }
          }
          move "Tackle", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case GLAMEOW_65:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterwards."
            energyCost C
            callForFamily(basic:true, 1, delegate)
          }
          move "Rip Claw", {
            text "10 damage. Flip a coin. If heads, discard an Energy attached to the Defending Pokémon."
            energyCost C, C
            onAttack {
              damage 10
              flip {
                discardDefendingEnergyAfterDamage C
              }
            }
          }

        };
      case HIPPOPOTAS_66:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness W, PLUS10
          move "Grainy Sand", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost F
            onAttack {
              damage 10
              flip {
                damage 10
              }
            }
          }
          move "Double-edge", {
            text "40 damage. Hippopotas does 10 damage to itself."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              damage 10, self
            }
          }

        };
      case KABUTO_67:
        return evolution (this, from:"Dome Fossil", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS20
          pokePower "Ancient Guidance", {
            text "Once during your turn , you may flip a coin. If heads, search your deck for Helix Fossil, Dome Fossil, or Old Amber and put it onto your Bench. Shuffle your deck afterward. This power can’t be used if Kabuto is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.deck : "Your deck is empty"
              assert my.bench.notFull : "Your bench is full"
              powerUsed()
              flip {
                my.deck.search("Search your deck for Helix Fossil, Dome Fossil, or Old Amber", {["Helix Fossil", "Dome Fossil", "Old Amber"].contains(it.name)}).each {fossil ->
                  my.deck.remove(fossil)
                  bg.em().run(new PlayTrainer(fossil))
                }
                shuffleDeck()
              }

            }
          }
          move "Shell Attack", {
            text "20 damage. "
            energyCost F
            onAttack {
              damage 20
            }
          }

        };
      case MUNCHLAX_68:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Snorlax from your hand onto Munchlax (this counts as evolving Munchlax) and remove all damage counters from Munchlax."
            actionA {
              assert my.hand.findAll{it.name.contains("Snorlax")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Snorlax") }.select()
              if (tar) {
                evolve(self, tar.first())
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Lick", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            onAttack {
              damage 20
              flip {
                apply PARALYZED
              }
            }
          }

        };
      case OMANYTE_69:
        return evolution (this, from:"Helix Fossil", hp:HP070, type:WATER, retreatCost:1) {
          weakness G, PLUS20
          pokePower "Call Up", {
            text "Once during your turn , you may flip a coin. If heads, search your discard pile for Helix Fossil, Dome Fossil, or Old Amber and put it onto your Bench. This power can’t be used if Omanyte is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.discard.find{["Helix Fossil", "Dome Fossil", "Old Amber"].contains(it.name)} : "There are no Helix Fossils, Dome Fossils, or Old Ambers in your discard"
              assert my.bench.notFull : "Your bench is full"
              powerUsed()
              flip {
                my.discard.select("Search your deck for Helix Fossil, Dome Fossil, or Old Amber", {["Helix Fossil", "Dome Fossil", "Old Amber"].contains(it.name)}).each {fossil ->
                  my.deck.remove(fossil)
                  bg.em().run(new PlayTrainer(fossil))
                }
              }
            }
          }
          move "Wash Over", {
            text "20 damage. Does 10 damage to 2 of your opponent's benched Pokémon"
            energyCost W, C
            onAttack {
              damage 20
              if(opp.bench) {
                multiSelect(opp.bench,2,"Does 10 damage to 2 of your opponent's benched Pokémon").each{damage 10, it}
              }
            }
          }

        };
      case PIKACHU_70:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost C
            onAttack {
              damage 10
              flip {
                damage 10
              }
            }
          }
          move "Volt Tackle", {
            text "50 damage. Pikachu does 10 damage to itself."
            energyCost L, C, C
            onAttack {
              damage 50
              damage 10, self
            }
          }

        };
      case PIPLUP_71:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Water Splash", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost W
            onAttack {
              damage 10
              flip {
                damage 10
              }
            }
          }
          move "Headbutt", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case PIPLUP_72:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          //Pecha Berry : If Piplup is Poisoned, remove the Special Condition Poisoned from Piplup at the end of each player's turn.
          customAbility {
            delayedA {
              before BETWEEN_TURNS, {
                if(self.isSPC(POISONED)){
                  bc "Pecha Berry removes poisoned"
                  clearSpecialCondition(self, SRC_OTHER, [POISONED])
                }
              }
            }
          }
          move "Splatter", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost W
            onAttack {
              noWrDamage 10, opp.all.select()
            }
          }

        };
      case SHELLOS_EAST_SEA_73:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness L, PLUS10
          move "Surf", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Muddy Water", {
            text "20 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost W, C
            onAttack {
              damage 20
              if(opp.bench) {
                damage 10, opp.bench.select()
              }
            }
          }

        };
      case SPEAROW_74:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Wing Attack", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Claw", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C
            onAttack {
              flip {
                damage 30
              }
            }
          }

        };
      case STARLY_75:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Whirlwind", {
            text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C
            onAttack {
              damage 10
              whirlwind()
            }
          }
          move "Flap", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case STUNKY_76:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness F, PLUS10
          resistance P, MINUS20
          move "Poison Gas", {
            text "Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost D
            onAttack {
              flip {
                apply POISONED
              }
            }
          }
          move "Slash", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case TURTWIG_77:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Rollout", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Razor Leaf", {
            text "30 damage. "
            energyCost G, C
            onAttack {
              damage 30
            }
          }

        };
      case TURTWIG_78:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          resistance W, MINUS20
          //Persim Berry : If Turtwig is Confused, remove the Special Condition Confused from Turtwig at the end of each player's turn.
          customAbility {
            delayedA {
              before BETWEEN_TURNS, {
                if(self.isSPC(CONFUSED)){
                  bc "Pecha Berry removes confused"
                  clearSpecialCondition(self, SRC_OTHER, [CONFUSED])
                }
              }
            }
          }
          move "Bite", {
            text "30 damage. "
            energyCost G, C
            onAttack {
              damage 30
            }
          }

        };
      case DAWN_STADIUM_79:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nWhenever any player attaches an Energy card from his or her hand to [G] Pokémon or [W] Pokémon, remove 1 damage counter and all Special Conditions from that Pokémon."
          def eff
          onPlay {
            eff = delayed {
              after ATTACH_ENERGY, {
                def pcs = ef.resolvedTarget
                if (ef.reason==PLAY_FROM_HAND && (pcs.types.contains(G) || pcs.types.contains(W))) {
                  bc "Dawn Stadium removes 1 damage counter and all Special Conditions from $pcs"
                  heal 10, pcs
                  if (pcs.specialConditions) {
                    clearSpecialCondition(pcs, TRAINER_CARD)
                  }
                }
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case DUSK_BALL_80:
        return copy (MysteriousTreasures.DUSK_BALL_110, this);
      case ENERGY_RESTORE_81:
        return copy (Expedition.ENERGY_RESTORE_141, this);
      case FOSSIL_EXCAVATOR_82:
        return copy (MysteriousTreasures.FOSSIL_EXCAVATOR_111, this);
      case MOM_S_KINDNESS_83:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nDraw 2 cards."
          onPlay {
            draw 2
          }
          playRequirement{
            assert my.deck : "Your deck is empty"
          }
        };
      case OLD_AMBER_84:
        return basicTrainer (this) {
          text "Play Old Amber as if it were a [C] Basic Pokémon. (Old Amber counts as a Trainer card as well, but if Old Amber is Knocked Out, this counts as a Knocked Out Pokémon.) Old Amber can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Old Amber from play. (This doesn’t count as a Knocked Out Pokémon.)\nPoké-BODY: Hard Amber As long as Old Amber is on your Bench, prevent all damage done to Old Amber by attacks (both yours and your opponent’s)."
          onPlay {
            Card pokemonCard, trainerCard = thisCard
            pokemonCard = basic (new CustomCardInfo(OLD_AMBER_84).setCardTypes(BASIC, POKEMON), hp:HP050, type:COLORLESS, retreatCost:0) {
              pokeBody "Hard Amber", {
                delayedA {
                  before APPLY_ATTACK_DAMAGES, {
                    bg.dm().each{
                      if(!self.active && it.to == self && it.dmg.value && it.notNoEffect){
                        bc "$thisAbility prevents all damage"
                        it.dmg=hp(0)
                      }
                    }
                  }
                }
              }
              customAbility {
                def eff, acl
                delayedA {
                  before RETREAT, self, {
                    if(self.topPokemonCard == thisCard){
                      wcu "Cannot retreat"
                      prevent()
                    }
                  }
                  before APPLY_SPECIAL_CONDITION, self, {
                    bc "$self is unaffected by Special Conditions"
                    prevent()
                  }
                }
                onActivate{
                  if (!eff) {
                    eff = delayed {
                      after REMOVE_FROM_PLAY, {
                        if(ef.removedCards.contains(pokemonCard)) {
                          bg.em().run(new ChangeImplementation(trainerCard, pokemonCard))
                          unregister()
                          eff = null
                        }
                      }
                    }
                  }
                  acl = action(pokemonCard, "Discard $self", [TargetPlayer.SELF]) {
                    delayed {
                      before TAKE_PRIZE, {
                        if (ef.pcs==self) {
                          prevent()
                        }
                      }
                    }
                    new Knockout(self).run(bg)
                  }
                }
                onDeactivate {
                  acl.each{bg.gm().unregisterAction(it)}
                }
              }
            }
            pokemonCard.initializeFrom(trainerCard)
            bg.em().run(new ChangeImplementation(pokemonCard, trainerCard))
            benchPCS(pokemonCard)
          }
          playRequirement{
            assert bench.notFull
          }
        };
      case POKE_BALL_85:
        return copy(FireRedLeafGreen.POKE_BALL_95, this);
      case QUICK_BALL_86:
        return copy (MysteriousTreasures.QUICK_BALL_114, this);
      case SUPER_SCOOP_UP_87:
        return copy(FireRedLeafGreen.SUPER_SCOOP_UP_99, this);
      case WARP_POINT_88:
        return copy(PlasmaStorm.ESCAPE_ROPE_120, this);
      case DOME_FOSSIL_89:
        return basicTrainer (this) {
          text "Play Dome Fossil as if it were a [C] Basic Pokémon. (Dome Fossil counts as a Trainer card as well, but if Dome Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Dome Fossil can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Dome Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\nPoké-BODY: Rock Reaction When you attach a [F] Energy card from your hand to Dome Fossil (excluding effects of attacks or Poké-Powers), search your deck for a card that evolves from Dome Fossil and put it onto Dome Fossil (this counts as evolving Dome Fossil). Shuffle your deck afterward."
          onPlay {
            Card pokemonCard, trainerCard = thisCard
            pokemonCard = basic (new CustomCardInfo(DOME_FOSSIL_89).setCardTypes(BASIC, POKEMON), hp:HP050, type:COLORLESS, retreatCost:0) {
              pokeBody "Rock Reaction", {
                delayedA{
                  after ATTACH_ENERGY, self, {
                    if (ef.reason==PLAY_FROM_HAND && ef.card.asEnergyCard().containsType(F) && self.owner.pbg.deck) {
                      def sel=my.deck.search("Search your deck for a card that evolved from $self",{it.cardTypes.is(EVOLUTION) && it.predecessor==self.name})
                      if(sel){
                        evolve(self, sel.first())
                      }
                      shuffleDeck()
                    }
                  }
                }
              }
              customAbility {
                def eff, acl
                delayedA {
                  before RETREAT, self, {
                    if(self.topPokemonCard == thisCard){
                      wcu "Cannot retreat"
                      prevent()
                    }
                  }
                  before APPLY_SPECIAL_CONDITION, self, {
                    bc "$self is unaffected by Special Conditions"
                    prevent()
                  }
                }
                onActivate{
                  if (!eff) {
                    eff = delayed {
                      after REMOVE_FROM_PLAY, {
                        if(ef.removedCards.contains(pokemonCard)) {
                          bg.em().run(new ChangeImplementation(trainerCard, pokemonCard))
                          unregister()
                          eff = null
                        }
                      }
                    }
                  }
                  acl = action(pokemonCard, "Discard $self", [TargetPlayer.SELF]) {
                    delayed {
                      before TAKE_PRIZE, {
                        if (ef.pcs==self) {
                          prevent()
                        }
                      }
                    }
                    new Knockout(self).run(bg)
                  }
                }
                onDeactivate {
                  acl.each{bg.gm().unregisterAction(it)}
                }
              }
            }
            pokemonCard.initializeFrom(trainerCard)
            bg.em().run(new ChangeImplementation(pokemonCard, trainerCard))
            benchPCS(pokemonCard)
          }
          playRequirement{
            assert bench.notFull
          }
        };
      case ENERGY_SEARCH_90:
        return copy(BlackWhite.ENERGY_SEARCH_93, this);
      case HELIX_FOSSIL_91:
        return basicTrainer (this) {
          text "Play Helix Fossil as if it were a [C] Basic Pokémon. (Helix Fossil counts as a Trainer card as well, but if Helix Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Helix Fossil can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Helix Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\nPoké-BODY: Aqua Reaction When you attach a [W] Energy card from your hand to Helix Fossil (excluding effects of attacks or Poké-Powers), search your deck for a card that evolves from Helix Fossil and put it onto Helix Fossil (this counts as evolving Helix Fossil). Shuffle your deck afterwards."
          onPlay {
            Card pokemonCard, trainerCard = thisCard
            pokemonCard = basic (new CustomCardInfo(HELIX_FOSSIL_91).setCardTypes(BASIC, POKEMON), hp:HP050, type:COLORLESS, retreatCost:0) {
              pokeBody "Aqua Reaction", {
                delayedA{
                  after ATTACH_ENERGY, self, {
                    if (ef.reason==PLAY_FROM_HAND && ef.card.asEnergyCard().containsType(W) && self.owner.pbg.deck) {
                      def sel=my.deck.search("Search your deck for a card that evolved from $self",{it.cardTypes.is(EVOLUTION) && it.predecessor==self.name})
                      if(sel){
                        evolve(self, sel.first())
                      }
                      shuffleDeck()
                    }
                  }
                }
              }
              customAbility {
                def eff, acl
                delayedA {
                  before RETREAT, self, {
                    if(self.topPokemonCard == thisCard){
                      wcu "Cannot retreat"
                      prevent()
                    }
                  }
                  before APPLY_SPECIAL_CONDITION, self, {
                    bc "$self is unaffected by Special Conditions"
                    prevent()
                  }
                }
                onActivate{
                  if (!eff) {
                    eff = delayed {
                      after REMOVE_FROM_PLAY, {
                        if(ef.removedCards.contains(pokemonCard)) {
                          bg.em().run(new ChangeImplementation(trainerCard, pokemonCard))
                          unregister()
                          eff = null
                        }
                      }
                    }
                  }
                  acl = action(pokemonCard, "Discard $self", [TargetPlayer.SELF]) {
                    delayed {
                      before TAKE_PRIZE, {
                        if (ef.pcs==self) {
                          prevent()
                        }
                      }
                    }
                    new Knockout(self).run(bg)
                  }
                }
                onDeactivate {
                  acl.each{bg.gm().unregisterAction(it)}
                }
              }
            }
            pokemonCard.initializeFrom(trainerCard.player)
            bg.em().run(new ChangeImplementation(pokemonCard, trainerCard))
            benchPCS(pokemonCard)
          }
          playRequirement{
            assert bench.notFull
          }
        };
      case CALL_ENERGY_92:
        return specialEnergy (this, [[C]]) {
          text "Call Energy provides [C] Energy. Once during your turn, if the Pokémon Call Energy is attached to is your Active Pokémon, you may search your deck for up to 2 Basic Pokémon and put them onto your Bench. If you do, shuffle your deck and your turn ends."
          def actions=[]
          onPlay {
            actions = action(thisCard, "Call Energy", [TargetPlayer.SELF]) {
              assert self.active : "Not active"
              assert my.bench.notFull : "Bench full"
              assert my.deck : "Your deck is empty!"
              sourced (source: SRC_SPECIAL_ENERGY, sourceEnergy: thisCard) {
                bc "Used Call Energy effect"
                int count = bench.freeBenchCount >= 2 ? 2 : 1
                my.deck.search(max: count, "Search your deck for up to 2 Basic Pokémon and put them onto your Bench", cardTypeFilter(BASIC)).each {
                  benchPCS(it)
                }
                shuffleDeck()
                bc "${self.owner.getPlayerUsername(bg)}'s turn ends due to using $thisCard's effect."
                bg.gm().betweenTurns()
              }
            }
          }
          onRemoveFromPlay {
            actions.each { bg().gm().unregisterAction(it as Action) }
          }
        };
      case DARKNESS_ENERGY_93:
        return copy (MysteriousTreasures.DARKNESS_ENERGY_119, this);
      case HEALTH_ENERGY_94:
        return specialEnergy (this, [[C]]) {
          text "Health Energy provides [C] Energy. When you attach this card from your hand to 1 of your Pokémon, remove 1 damage counter from that Pokémon."
          onPlay {reason->
            if (reason == PLAY_FROM_HAND) {
              heal 10, self
            }
          }
        };
      case METAL_ENERGY_95:
        return copy (RubySapphire.METAL_ENERGY_94, this)
      case RECOVER_ENERGY_96:
        return specialEnergy (this, [[C]]) {
          text "Recover Energy provides [C] Energy. When you attach this card from your hand to 1 of your Pokémon, remove all Special Conditions from that Pokémon."
          onPlay {reason->
            if (reason == PLAY_FROM_HAND) {
              clearSpecialCondition(self)
            }
          }
        };
      case GARCHOMP_LV_X_97:
        return levelUp (this, from:"Garchomp", hp:HP140, type:COLORLESS, retreatCost:0) {
          weakness C
          pokePower "Dragon Pulse", {
            text "Once during your turn , when you put Garchomp LV.X from your hand onto your Active Garchomp, you may flip 3 coins. For each heads, put 1 damage counter on each of your opponent’s Benched Pokémon."
            onActivate {r->
              if (r==PLAY_FROM_HAND && opp.bench && confirm('Use Dragon Pulse?')) {
                flip 3, {
                  opp.bench.each {
                    directDamage 10, it, Source.POKEPOWER
                  }
                }
              }
            }
          }
          move "Restore", {
            text "Search your discard pile for a Pokémon (excluding Pokémon LV.X) and put it onto your Bench as a Basic Pokémon. Then, you may search your discard pile for up to 3 basic Energy cards and attach them to that Pokémon."
            energyCost ()
            attackRequirement {
              assert my.discard.filterByType(POKEMON) : "You have no Pokémon in your discard pile"
              assert my.bench.notFull : "Your bench is full"
            }
            onAttack {
              def pcs = benchPCS(my.discard.select("Choose a Pokémon to put on your bench", cardTypeFilter(POKEMON)).first())
              if(pcs != null && my.discard.filterByType(BASIC_ENERGY)) {
                my.discard.select(min:0, max:3, "Attach up to 3 basic Energy cards to $pcs",cardTypeFilter(BASIC_ENERGY)).each {
                  attachEnergy(pcs, it)
                }
              }
            }
          }
        };
      case GLACEON_LV_X_98:
        return levelUp (this, from:"Glaceon", hp:HP100, type:WATER, retreatCost:1) {
          weakness M, PLUS30
          pokeBody "Chilly Breath", {
            text "As long as Glaceon is your Active Pokémon, your opponent’s Pokémon can’t use any Poké-Powers."
            def eff1, eff2
            onActivate {
              eff1 = getter IS_ABILITY_BLOCKED, { Holder h->
                if (self.active && h.effect.target.owner == self.owner.opposite && (h.effect.ability instanceof PokePower)) {
                  h.object=true
                }
              }
              eff2 = getter IS_GLOBAL_ABILITY_BLOCKED, {Holder h->
                if (self.active && h.effect.target.owner == self.owner.opposite) {
                  h.object=true
                }
              }
              new CheckAbilities().run(bg)
            }
            onDeactivate {
              eff1.unregister()
              eff2.unregister()
              new CheckAbilities().run(bg)
            }
          }
          move "Avalache", {
            text "70 damage. Flip a coin. If heads, this attack does 20 damage to each of your opponent’s Benched Pokémon."
            energyCost W, W, C
            onAttack {
              damage 70
              flip {
                opp.bench.each {
                  damage 20, it
                }
              }
            }
          }
        };
      case LEAFEON_LV_X_99:
        return levelUp (this, from:"Leafeon", hp:HP110, type:GRASS, retreatCost:2) {
          weakness R, PLUS30
          resistance W, MINUS20
          pokePower "Energy Forcing", {
            text "Once during your turn , you may attach an Energy card from your hand to 1 of your Pokémon. This power can’t be used if Leafeon is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.hand.filterByType(ENERGY) : "You have no Energy cards in your hand"
              powerUsed()
              def energy = my.hand.filterByType(ENERGY).select("Energy to attach").first()
              def pcs = my.all.select("Attach $energy to...")
              attachEnergy(pcs, energy, PLAY_FROM_HAND)
            }
          }
          move "Verdant Force", {
            text "30+ damage. Does 30 damage plus 10 more damage for each Energy attached to all of your Pokémon."
            energyCost G, C
            onAttack {
              damage 30
              my.all.each {
                damage 10 * it.cards.energyCount(C)
              }
            }
          }
        };
      case PORYGON_Z_LV_X_100:
        return levelUp (this, from:"Porygon-Z", hp:HP130, type:COLORLESS, retreatCost:2) {
          weakness F
          pokePower "Mode Crash", {
            text "Once during your turn , when you put Porygon-Z LV. from your hand onto your Active Porygon-Z, you may discard all of your opponent’s Special Energy cards in play."
            onActivate {r->
              if (r==PLAY_FROM_HAND && opp.all.find{it.cards.filterByType(SPECIAL_ENERGY)} && confirm("Use Mode Crash?")) {
                powerUsed()
                opp.all.each {
                  it.cards.filterByType(SPECIAL_ENERGY).discard()
                }
              }
            }
          }
          pokePower "Decode", {
            text "Once during your turn , you may search your deck for any 2 cards and shuffle your deck afterward. Then, put those cards on top of your deck in any order. This power can’t be used if Porygon-Z is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.deck : "Your deck is empty"
              powerUsed()
              def list = my.deck.select(count:2)
              list = rearrange(list)
              my.deck.removeAll(list)
              shuffleDeck()
              my.deck.addAll(0, list)
            }
          }
        };
      default:
        return null;
    }
  }

}
