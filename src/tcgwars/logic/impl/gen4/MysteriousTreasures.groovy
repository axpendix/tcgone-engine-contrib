package tcgwars.logic.impl.gen4;

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
 */
public enum MysteriousTreasures implements LogicCardInfo {

  AGGRON_1 ("Aggron", 1, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  ALAKAZAM_2 ("Alakazam", 2, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  AMBIPOM_3 ("Ambipom", 3, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  AZELF_4 ("Azelf", 4, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  BLISSEY_5 ("Blissey", 5, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BRONZONG_6 ("Bronzong", 6, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  CELEBI_7 ("Celebi", 7, Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  FERALIGATR_8 ("Feraligatr", 8, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  GARCHOMP_9 ("Garchomp", 9, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  HONCHKROW_10 ("Honchkrow", 10, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  LUMINEON_11 ("Lumineon", 11, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MAGMORTAR_12 ("Magmortar", 12, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  MEGANIUM_13 ("Meganium", 13, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  MESPRIT_14 ("Mesprit", 14, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  RAICHU_15 ("Raichu", 15, Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  TYPHLOSION_16 ("Typhlosion", 16, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  TYRANITAR_17 ("Tyranitar", 17, Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _DARKNESS_]),
  UXIE_18 ("Uxie", 18, Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  ABOMASNOW_19 ("Abomasnow", 19, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  ARIADOS_20 ("Ariados", 20, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  BASTIODON_21 ("Bastiodon", 21, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  CHIMECHO_22 ("Chimecho", 22, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  CROBAT_23 ("Crobat", 23, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  EXEGGUTOR_24 ("Exeggutor", 24, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  GLALIE_25 ("Glalie", 25, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GYARADOS_26 ("Gyarados", 26, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  KRICKETUNE_27 ("Kricketune", 27, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  MANECTRIC_28 ("Manectric", 28, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MANTINE_29 ("Mantine", 29, Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  MR__MIME_30 ("Mr. Mime", 30, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  NIDOQUEEN_31 ("Nidoqueen", 31, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  NINETALES_32 ("Ninetales", 32, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  RAMPARDOS_33 ("Rampardos", 33, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  SLAKING_34 ("Slaking", 34, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  SUDOWOODO_35 ("Sudowoodo", 35, Rarity.RARE, [BASIC, POKEMON, _FIGHTING_]),
  TOXICROAK_36 ("Toxicroak", 36, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  UNOWN_I_37 ("Unown I", 37, Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  URSARING_38 ("Ursaring", 38, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  WALREIN_39 ("Walrein", 39, Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  WHISCASH_40 ("Whiscash", 40, Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  BAYLEEF_41 ("Bayleef", 41, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  CHINGLING_42 ("Chingling", 42, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  CRANIDOS_43 ("Cranidos", 43, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  CROCONAW_44 ("Croconaw", 44, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DEWGONG_45 ("Dewgong", 45, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DODRIO_46 ("Dodrio", 46, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DUNSPARCE_47 ("Dunsparce", 47, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  GABITE_48 ("Gabite", 48, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  GIRAFARIG_49 ("Girafarig", 49, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  GOLBAT_50 ("Golbat", 50, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  GRAVELER_51 ("Graveler", 51, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  HAPPINY_52 ("Happiny", 52, Rarity.UNCOMMON, [BASIC, POKEMON, _COLORLESS_]),
  LAIRON_53 ("Lairon", 53, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  MAGMAR_54 ("Magmar", 54, Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  MASQUERAIN_55 ("Masquerain", 55, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  NIDORINA_56 ("Nidorina", 56, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  OCTILLERY_57 ("Octillery", 57, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PARASECT_58 ("Parasect", 58, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PUPITAR_59 ("Pupitar", 59, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  QUILAVA_60 ("Quilava", 60, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  SANDSLASH_61 ("Sandslash", 61, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SEALEO_62 ("Sealeo", 62, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SHIELDON_63 ("Shieldon", 63, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  TROPIUS_64 ("Tropius", 64, Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  UNOWN_E_65 ("Unown E", 65, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_M_66 ("Unown M", 66, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  UNOWN_T_67 ("Unown T", 67, Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  VIGOROTH_68 ("Vigoroth", 68, Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  ABRA_69 ("Abra", 69, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  AIPOM_70 ("Aipom", 70, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ARON_71 ("Aron", 71, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  BARBOACH_72 ("Barboach", 72, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  BIDOOF_73 ("Bidoof", 73, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BRONZOR_74 ("Bronzor", 74, Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  BUIZEL_75 ("Buizel", 75, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  CHANSEY_76 ("Chansey", 76, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHIKORITA_77 ("Chikorita", 77, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CROAGUNK_78 ("Croagunk", 78, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  CYNDAQUIL_79 ("Cyndaquil", 79, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  DODUO_80 ("Doduo", 80, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ELECTRIKE_81 ("Electrike", 81, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  EXEGGCUTE_82 ("Exeggcute", 82, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  FINNEON_83 ("Finneon", 83, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  GEODUDE_84 ("Geodude", 84, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  GIBLE_85 ("Gible", 85, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  KRICKETOT_86 ("Kricketot", 86, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  LARVITAR_87 ("Larvitar", 87, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MAGBY_88 ("Magby", 88, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  MAGIKARP_89 ("Magikarp", 89, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MURKROW_90 ("Murkrow", 90, Rarity.COMMON, [BASIC, POKEMON, _DARKNESS_]),
  NIDORAN_FEMALE_91 ("Nidoran♀", 91, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  PARAS_92 ("Paras", 92, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PICHU_93 ("Pichu", 93, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PIKACHU_94 ("Pikachu", 94, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  REMORAID_95 ("Remoraid", 95, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SANDSHREW_96 ("Sandshrew", 96, Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SEEL_97 ("Seel", 97, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SHINX_98 ("Shinx", 98, Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  SLAKOTH_99 ("Slakoth", 99, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SNORUNT_100 ("Snorunt", 100, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SNOVER_101 ("Snover", 101, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SPHEAL_102 ("Spheal", 102, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SPINARAK_103 ("Spinarak", 103, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SURSKIT_104 ("Surskit", 104, Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TEDDIURSA_105 ("Teddiursa", 105, Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  TOTODILE_106 ("Totodile", 106, Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  VULPIX_107 ("Vulpix", 107, Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  ZUBAT_108 ("Zubat", 108, Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  BEBE_S_SEARCH_109 ("Bebe's Search", 109, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  DUSK_BALL_110 ("Dusk Ball", 110, Rarity.UNCOMMON, [TRAINER, ITEM]),
  FOSSIL_EXCAVATOR_111 ("Fossil Excavator", 111, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LAKE_BOUNDARY_112 ("Lake Boundary", 112, Rarity.UNCOMMON, [TRAINER, STADIUM]),
  NIGHT_MAINTENANCE_113 ("Night Maintenance", 113, Rarity.UNCOMMON, [TRAINER, ITEM]),
  QUICK_BALL_114 ("Quick Ball", 114, Rarity.UNCOMMON, [TRAINER, ITEM]),
  TEAM_GALACTIC_S_WAGER_115 ("Team Galactic's Wager", 115, Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ARMOR_FOSSIL_116 ("Armor Fossil", 116, Rarity.COMMON, [TRAINER, ITEM]),
  SKULL_FOSSIL_117 ("Skull Fossil", 117, Rarity.COMMON, [TRAINER, ITEM]),
  MULTI_ENERGY_118 ("Multi Energy", 118, Rarity.RARE, [SPECIAL_ENERGY, ENERGY]),
  DARKNESS_ENERGY_119 ("Darkness Energy", 119, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  METAL_ENERGY_120 ("Metal Energy", 120, Rarity.UNCOMMON, [SPECIAL_ENERGY, ENERGY]),
  ELECTIVIRE_LV_X_121 ("Electivire LV.X", 121, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _LIGHTNING_]),
  LUCARIO_LV_X_122 ("Lucario LV.X", 122, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _FIGHTING_]),
  MAGMORTAR_LV_X_123 ("Magmortar LV.X", 123, Rarity.HOLORARE, [LEVEL_UP, EVOLUTION, POKEMON, _FIRE_]),
  TIME_SPACE_DISTORTION_124 ("Time-Space Distortion", 124, Rarity.HOLORARE, [TRAINER, ITEM]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected int collectionLineNo;

  MysteriousTreasures(String name, int collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.MYSTERIOUS_TREASURES;
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
      case AGGRON_1:
        return evolution (this, from:"Lairon", hp:HP130, type:METAL, retreatCost:4) {
          weakness R, PLUS40
          resistance P, MINUS20
          move "Heap Up", {
            text "40+ damage. Search your discard pile for all Energy cards and show them to your opponent. If you find any [M] Special Energy cards there this attack does 40 damage plus 30 more damage. Put all of those Energy cards on top of your deck. Shuffle your deck afterward."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 40
              def tar = my.discard.filterByType(ENERGY)
              tar.showToOpponent("Energy cards in your opponent's discard pile.")
              def toReturn = tar.findAll{it.cardTypes.is(SPECIAL_ENERGY) && it.name == "Metal Energy"}
              if (toReturn) {
                damage 30
                toReturn.moveTo(my.deck)
                shuffleDeck()
              }
            }
          }
          move "Hard Metal", {
            text "60+ damage. You may do 60 damage plus 40 more damage. If you do, Aggron does 40 damage to itself."
            energyCost M, M, M, M
            attackRequirement {}
            onAttack {
              damage 60

              if (confirm("Do 40 damage to $self to do 40 more damage?")) {
                damage 40
                damage 40, self
              }
            }
          }

        };
      case ALAKAZAM_2:
        return evolution (this, from:"Kadabra", hp:HP100, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS30
          pokePower "Power Cancel", {
            text "Once during your opponent’s turn, when your opponent’s Pokémon uses any Poké-Power, you may discard 2 cards from your hand and prevent all effects of that Poké-Power. (This counts as that Pokémon using its Poké-Power.) This power can’t be used if Alakazam is affected by a Special Condition."
            actionA {
              //TODO: Yeah this is gonna be a fun one to do.
              //Requires a way to capture "powerUsed", stop the Poké-Power at that point but make it count as used.
            }
          }
          move "Psychic Guard", {
            text "50 damage. During your opponent’s next turn, any damage done to Alakazam by attacks from your opponent’s Stage 2 Pokémon is reduced by 30 (after applying Weakness and Resistance)."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 50
              afterDamage {
                delayed {
                  before APPLY_ATTACK_DAMAGES, {
                    bg.dm().each {
                      if (it.to==self && it.dmg.value && it.notNoEffect && it.from.topPokemonCard.cardTypes.is(STAGE2)) {
                        bc "-30 to $self ($thisMove)"
                        it.dmg-=hp(30)
                      }
                    }
                  }
                  unregisterAfter 2
                  after SWITCH, self, { unregister() }
                  after EVOLVE, self, { unregister() }
                }
              }
            }
          }

        };
      case AMBIPOM_3:
        return evolution (this, from:"Aipom", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          move "Tail Influence", {
            text "30 damage. Your opponent flips a coin until he or she gets heads. For each tails, remove an Energy card attached to the Defending Pokémon and put it on the bottom of your opponent’s deck."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage{
                //TODO: Make an oppFlipUntilHeads method
                flipUntilTails { opp.active.cards.filterByType(ENERGY).select(count:1).moveTo(opp.deck) }
              }
            }
          }
          move "Charity Tail", {
            text "80 damage. Before Ambipom does damage, your opponent may discard 2 cards from his or her hand. If he or she does, this attack’s base damage is 10 instead of 80."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              if (opp.hand.size() >= 2 && oppConfirm("Do you want to discard 2 card from your hand?\nIf you do, $thisMove will have a base damage of 10 instead of 80.")){
                opp.hand.oppSelect(count:2, "Which card to discard?").discard()
              } else {
                if (!opp.hand.size() >= 2) bc "The opponent has less than 2 cards in hand! $thisMove hits at full power!"
                damage 70
              }
            }
          }

        };
      case AZELF_4:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokeBody "Downer Material", {
            text "If you have Uxie and Mesprit in play, the attack cost of each of your opponent’s Basic Pokémon’s attacks is [C] more. You can’t use more than 1 Downer Material Poké-Body each turn."
            def condition = my.all.find{it.name == "Uxie"} && my.all.find{it.name == "Mesprit"}
            //Adapted from Sceptile-ex Delta (CG 96)
            getterA GET_MOVE_LIST, { h ->
              if (condition && h.effect.target.topPokemonCard.cardTypes.is(BASIC)) {
                def list = []
                for (move in h.object) {
                  def copy = move.shallowCopy()
                  target = bg.em().retrieveObject("Downer Material_target")
                  source = bg.em().retrieveObject("Downer Material_source")
                  if(!target.contains(h.effect.target)){
                    copy.energyCost.add(C)
                    target.add(h.effect.target)
                    bg.em().storeObject("Downer Material_target", target)
                    source.add(self)
                    bg.em().storeObject("Downer Material_source", source)
                  } else if(source.get(target.indexOf(h.effect.target)) == self){
                    copy.energyCost.add(C)
                  }
                  list.add(copy)
                }
                h.object=list
              }
            }
          }
          move "Bind Pulse", {
            text "10 damage. During your opponent’s next turn, your opponent can’t attach any Special Energy cards from his or her hand to any of his or her Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {
              //TODO: Think/check how this would work re: Pokémon used as Special Energy.
              damage 10
              delayed {
                before PLAY_ENERGY, {
                  if (ef.cardToPlay.cardTypes.is(SPECIAL_ENERGY) && bg.currentTurn == self.owner.opposite) {
                    wcu "Sonic Volume prevents playing this card"
                    prevent()
                  }
                }
                unregisterAfter 2
              }
            }
          }

        };
      case BLISSEY_5:
        return evolution (this, from:"Chansey", hp:HP130, type:COLORLESS, retreatCost:3) {
          weakness F, PLUS30
          pokePower "Kind Egg", {
            text "Once during your turn (before your attack), if Happiny is anywhere under Blissey, you may choose a number of cards in your hand up to the amount of Energy attached to Blissey and put those cards on top of your deck. Shuffle your deck afterward. Then, draw that many cards. This power can’t be used if Blissey is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert self.getPokemonCards().findAll {it.name.contains("Happiny")} : "Happiny is not found under $self, you can't use this Poké-Power"
              assert my.hand : "You don't have any cards in your hand"
              def energyCount = self.cards.energyCount(C)
              assert energyCount : "You have no Energy attached to $self"
              powerUsed()

              def list = my.hand.select(max: energyCount, "Select up to $energyCount ${(energyCount>1) ? "cards" : "card"} to shuffle into your deck.")
              def drawCount = list.size()

              list.moveTo(my.deck)
              shuffleDeck()

              draw drawCount
            }
          }
          move "Happy Chance", {
            text "20+ damage. Does 20 damage plus 10 for each Energy attached to Blissey. Before doing damage, you may search your discard pile for a basic Energy card and attach it to Blissey."
            energyCost C
            attackRequirement {}
            onAttack {
              attachEnergyFrom(may: true, basic: true, my.discard, self)
              damage 20 + 10 * self.cards.energyCount(C)
            }
          }

        };
      case BRONZONG_6:
        return evolution (this, from:"Bronzor", hp:HP090, type:METAL, retreatCost:3) {
          weakness R, PLUS30
          resistance P, MINUS20
          pokePower "Miracle Oracle", {
            text "Once during your turn (before your attack), you may draw a card. Then, discard a card from your hand. If you discard an Energy card, draw 1 more card. This power can’t be used if Bronzong is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert my.deck : "You have no cards in your deck"
              powerUsed()
              draw 1
              def selected = my.hand.select("Choose a card to discard")
              if (selected.first().cardTypes.is(ENERGY)) {
                draw 1
              }
              selected.discard()
            }
          }
          move "Shady Stamp", {
            text "50 damage. The Defending Pokémon is now Confused."
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 50
              applyAfterDamage CONFUSED
            }
          }

        };
      case CELEBI_7:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          move "Sprouting", {
            text "Search your deck for a [G] Energy card and attach it to Celebi. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck
            }
            onAttack {
              attachEnergyFrom(type: G, my.deck, self)
            }
          }
          move "Leaf Tornado", {
            text "30 damage. You may move any number of basic [G] Energy cards attached to your Pokémon to your other Pokémon in any way you like."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage{
                //Adapted from Mewtwo Delta (DS 12)
                if (confirm("Move basic [G] Energy cards around?")) {
                  while (1) {
                    def pl=(my.all.findAll {it.cards.filterByBasicEnergyType(G)})
                    if(!pl) break;
                    def src =pl.select("Source for energy (cancel to stop)", false)
                    if(!src) break;
                    def card=src.cards.select("Card to move",filterByBasicEnergyType(G)).first()
                    def target = my.all.findAll{ it != src }.select("Move Energy to?")
                    energySwitch(src, target, card)
                  }
                }
              }
            }
          }

        };
      case FERALIGATR_8:
        return evolution (this, from:"Croconaw", hp:HP130, type:WATER, retreatCost:2) {
          weakness L, PLUS30
          move "Energy Cyclone", {
            text "20× damage. Choose as many Energy cards from your hand as you like and show them to your opponent. This attack does 20 damage times the number of Energy cards you chose. Put those Energy cards on top of your deck. Shuffle your deck afterward."
            energyCost W, W
            def energyInHand = my.hand.filterByType(ENERGY)
            attackRequirement {
              assert energyInHand : "No Energy cards in hand"
            }
            onAttack {
              def tar = energyInHand.select(max: energyInHand.size())
              def num = tar.size()
              tar.showToOpponent("Your opponent will shuffle these Energy cards back into their deck, doing 20 damage for each of them.")
              bc "$num Energy cards will be shuffled."
              damage 20 * num
              afterDamage{
                tar.moveTo(my.deck)
                shuffleDeck()
              }
            }
          }
          move "Breaking Tail", {
            text "60 damage. Choose 1 card from your opponent’s hand without looking and discard it."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 60
              discardRandomCardFromOpponentsHand()
            }
          }

        };
      case GARCHOMP_9:
        return evolution (this, from:"Gabite", hp:HP130, type:COLORLESS, retreatCost:0) {
          weakness C, PLUS30
          pokeBody "Rainbow Scale", {
            text "If an Active Pokémon has Weakness to any of the types of Energy attached to Garchomp, Garchomp’s attacks do 40 more damage to that Pokémon (before applying Weakness and Resistance). Rainbow Scale Poké-Body can’t be used if Garchomp has any Special Energy cards attached to it."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                def typesOfBasicEn = Type.values().toList().findAll{self.cards.filterByEnergyType(it)}
                if(ef.attacker == self && !self.cards.filterByType(SPECIAL_ENERGY)){
                  bg.dm().each {
                    def conditions = [
                      ( it.from == self ),
                      ( it.to.active ),
                      ( it.to.getWeaknesses().any{typesOfBasicEn.contains(it)} )
                    ]
                    if (conditions.each{it}) {
                      bc "Rainbow Scale +40"
                      it.dmg += hp(40)
                    }
                  }
                }
              }
            }
          }
          move "Dragon Fang", {
            text "70 damage."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 70
            }
          }

        };
      case HONCHKROW_10:
        return evolution (this, from:"Murkrow", hp:HP090, type:DARKNESS, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          pokeBody "Dark Genes", {
            text "As long as Honchkrow has the Energy necessary to use its attack, each of your Murkrow can use Honchkrow’s attack as its own without the Energy necessary to use that attack."
            delayedA {
              //TODO
              //Future TODO: This should work even when Honchkrow levels up, as it has the attack and Poké-Power of the base one (and Lv.X's attacks should also be available to be copied)
            }
          }
          move "Dark Wing Flaps", {
            text "50 damage. Choose 1 card from your opponent’s hand without looking. Look at the card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost D, D, C
            attackRequirement {}
            onAttack {
              damage 50
              afterDamage { astonish() }
            }
          }

        };
      case LUMINEON_11:
        return evolution (this, from:"Finneon", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          pokePower "Lure Ring", {
            text "Once during your turn (before your attack), if Lumineon is your Active Pokémon, you may choose 1 of your opponent’s Benched Pokémon that has a maximum HP of 100 or more and switch it with 1 of the Defending Pokémon. This power can’t be used if Lumineon is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert self.active : "$self is not your Active Pokémon"
              assert opp.bench.any{it.fullHP.value >= 100} : "Your opponent has no benched Pokémon with a maximum HP of 100 or more."
              powerUsed()
              def pcs = opp.bench.findAll{it.fullHP.value >= 100}.select('Choose 1 of your opponent’s Benched Pokémon that has a maximum HP of 100 or more and switch it with 1 of the Defending Pokémon.')
              //TODO: This should switch the benched with the defending, not the other way around. Check against inmune to pokébody cards to see if this properly blocks only when the blocker is benched. (Same as Torterra LV.X)
              sw opp.active, pcs, SRC_ABILITY
            }
          }
          move "Reverse Stream", {
            text "30+ damage. Does 30 damage plus 10 more damage for each [W] Energy attached to Lumineon. Then, return all [W] Energy attached to Lumineon to your hand."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30 + 10 * self.cards.filterByEnergyType(W).moveTo(my.hand).size()
            }
          }

        };
      case MAGMORTAR_12:
        return evolution (this, from:"Magmar", hp:HP100, type:FIRE, retreatCost:3) {
          weakness W, PLUS30
          move "Smoke Bomb", {
            text "30 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 30
              sandAttack(thisMove)
            }
          }
          move "Flame Drum", {
            text "80 damage. If Magby isn’t anywhere under Magmortar, discard 2 Energy cards from your hand. (If you can’t discard 2 Energy cards from your hand, this attack does nothing.)"
            energyCost R, R, C
            attackRequirement {
              def condition1 = (self.getPokemonCards().any{it.name.contains("Magby")})
              def condition2 = (my.hand.filterByType(ENERGY).size() >= 2)
              assert (condition1 || condition2) : "Magby isn't anywhere under Magmortar, and you can't discard 2 Energy cards from your hand"
            }
            onAttack {
              if (!self.getPokemonCards().any{it.name.contains("Magby")}) {
                def tar = my.hand.filterByType(ENERGY).select(count:2, "Discard 2 Energies.")
                afterDamage{
                  tar.discard()
                }
              }
              damage 80
            }
          }

        };
      case MEGANIUM_13:
        return evolution (this, from:"Bayleef", hp:HP130, type:GRASS, retreatCost:2) {
          weakness R, PLUS30
          resistance W, MINUS20
          move "Ultra Powder", {
            text "20 damage. Flip 3 coins. If the first coin is heads, the Defending Pokémon is now Poisoned. If the second coin is heads, the Defending Pokémon is now Burned. If the third coin is heads, the Defending Pokémon is now Paralyzed."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
              afterDamage{
                [ POISONED, BURNED, PARALYZED ].each{ flip { apply it } }
              }
            }
          }
          move "Fire Counterattack", {
            text "60+ damage. If your opponent has any [R] Pokémon in play, this attack does 60 damage plus 30 more damage."
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 60
              if(opp.all.findAll{it.types.contains(R)}) { damage 30 }
            }
          }

        };
      case MESPRIT_14:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokeBody "Upper Material", {
            text "If you have Uxie and Azelf in play, the Retreat Cost for each Uxie, Mesprit, and Azelf (both yours and your opponent’s) is 0."
            getterA (GET_RETREAT_COST, BEFORE_LAST) {holder->
              def pcs = holder.effect.target
              def validNames = ["Uxie", "Mesprit", "Azelf"]
              if (
                my.all.find{it.name == "Uxie"} && my.all.find{it.name == "Azelf"} && validNames.contains(pcs.name)
              ) {
                holder.object = 0
              }
            }
          }
          move "Teleportation Burst", {
            text "30 damage. You may switch Mesprit with 1 of your Benched Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 30
              switchYourActive(may: true)
            }
          }

        };
      case RAICHU_15:
        return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Electromagnetic Induction", {
            text "Search your deck for up to 2 [L] Energy cards and attach them to 1 of your Pokémon. Shuffle your deck afterward."
            energyCost ()
            attackRequirement{
              assert my.deck : "There are no cards in your deck"
            }
            onAttack{
              def tar = my.deck.search(max : 2,"Search your deck for up to 2 [L] Energy cards",basicEnergyFilter(L))
              if (tar){
                def pcs = my.all.select("Which Pokémon do you want to attach to?")
                tar.each{ attachEnergy(pcs,it) }
              }
              shuffleDeck()
            }
          }
          move "Explosive Thunder", {
            text "30× damage. Discard all basic [L] Energy cards attached to Raichu. This attack does 30 damage times the number of [L] Energy cards you discarded."
            energyCost L, C
            attackRequirement {
              assert self.cards.filterByBasicEnergyType(L) : "No Basic [L] Energy on $self."
            }
            onAttack {
              damage 30 * self.cards.filterByBasicEnergyType(L).discard().size()
            }
          }

        };
      case TYPHLOSION_16:
        return evolution (this, from:"Quilava", hp:HP110, type:FIRE, retreatCost:2) {
          weakness W, PLUS30
          pokePower "Firestarter", {
            text "Once during your turn (before your attack), you may attach a [R] Energy card from your discard pile to 1 of your Benched Pokémon. This power can’t be used if Typhlosion is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert my.bench : "No benched Pokemon"

              attachEnergyFrom(type: R, my.discard, my.bench)
              powerUsed()
            }
          }
          move "Evaporating Heat", {
            text "60 damage. Discard a [W] Energy attached to the Defending Pokémon."
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 60
              afterDamage {
                targeted (defending) {
                  if (defending.cards.energyCount(W)) {
                    defending.cards.filterByEnergyType(W).select("Discard").discard()
                  }
                }
              }
            }
          }

        };
      case TYRANITAR_17:
        return evolution (this, from:"Pupitar", hp:HP140, type:DARKNESS, retreatCost:4) {
          weakness F, PLUS30
          resistance P, MINUS20
          move "Payback", {
            text "40+ damage. If your opponent has only 1 Prize card left, this attack does 40 damage plus 40 more damage and discard the top 3 cards from your opponent’s deck."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 40
              if(opp.prizeCardSet.size() == 1){
                damage 40
                afterDamage{
                  if (opp.deck) { opp.deck.subList(0, 3).discard() }
                }
              }
            }
          }
          move "Ground Burn", {
            text "80+ damage. Each player discards the top card of his or her deck. This attack does 80 damage plus 20 more damage for each Energy card discarded that way."
            energyCost F, F, D, D
            attackRequirement {}
            onAttack {
              damage 80
              if(opp.deck) {
                if(opp.deck.subList(0,1).filterByType(ENERGY)) damage 20
                opp.deck.subList(0,1).discard()
              }
              if(my.deck) {
                if(my.deck.subList(0,1).filterByType(ENERGY)) damage 20
                my.deck.subList(0,1).discard()
              }
            }
          }

        };
      case UXIE_18:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokePower "Memory Out", {
            text "Once during your opponent’s turn, if Uxie is damaged by an opponent’s attack (even if Uxie is Knocked Out), you may use this power. The Attacking Pokémon can’t use that attack during your opponent’s next turn."
            delayedA (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if(bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value}) && confirm("Use Memory Out?")) {
                  powerUsed()
                  bc "$self used Memory Out, $ef.attacker won't be able to use this attack on your next turn!"
                  cantUseAttack(ef.move, ef.attacker)
                }
              }
            }
          }
          move "Mind Off", {
            text "10+ damage. If you have Mesprit and Azelf in play, this attack does 10 damage plus 20 more damage and the Defending Pokémon is now Asleep."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 10
              if (my.all.find{it.name == "Mesprit"} && my.all.find{it.name == "Azelf"}) {
                damage 20
                applyAfterDamage ASLEEP
              }
            }
          }

        };
      case ABOMASNOW_19:
        return evolution (this, from:"Snover", hp:HP100, type:GRASS, retreatCost:3) {
          weakness R, PLUS30
          pokeBody "Glacier Snow", {
            text "If Abomasnow is your Active Pokémon and is damaged by an opponent’s attack (even if Abomasnow is Knocked Out), the Attacking Pokémon is now Asleep."
            delayedA (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if (bg.currentTurn == self.owner.opposite && self.active && bg.dm().find({it.to==self && it.dmg.value})) {
                  bc "Glacier Snow triggers"
                  apply ASLEEP, (ef.attacker as PokemonCardSet), SRC_ABILITY
                }
              }
              after SWITCH, self, {unregister()}
              after EVOLVE, self, {unregister()}
            }
          }
          move "Heavy Blizzard", {
            text "60 damage. Flip a coin. If heads, put 1 damage counter on each of your opponent’s Benched Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 60
              flip { opp.bench.each{directDamage 10, it} }
            }
          }

        };
      case ARIADOS_20:
        return evolution (this, from:"Spinarak", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          pokeBody "Sticky", {
            text "The Retreat Cost for each player’s Pokémon (excluding any Ariados) is [C] more."
            getterA (GET_RETREAT_COST) { h->
              if (h.effect.target.name != "Ariados") {
                h.object += 1
              }
            }
          }
          move "Offensive Needle", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned. If tails, the Defending Pokémon is now Paralyzed."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
              afterDamage{
                flip 1, { apply POISONED }, { apply PARALYZED }
              }
            }
          }

        };
      case BASTIODON_21:
        return evolution (this, from:"Shieldon", hp:HP130, type:METAL, retreatCost:3) {
          weakness R, PLUS40
          resistance P, MINUS20
          pokeBody "Protective Wall", {
            text "Prevent all damage done to your Benched Pokémon by your opponent’s attacks."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.to.owner==self.owner && it.from.owner!=self.owner && it.to.benched && it.dmg.value && it.notNoEffect) {
                    bc "Sand Veil reduces damage"
                    it.dmg=hp(0)
                  }
                }
              }
            }
          }
          //Taken from Sudowoodo
          def turnCount=-1
          HP lastDamage=null
          customAbility {
            delayed (priority: LAST) {
              before APPLY_ATTACK_DAMAGES, {
                if(bg().currentTurn==self.owner.opposite) {
                  turnCount=bg.turnCount
                  lastDamage=bg().dm().find({it.to==self && it.dmg.value>=0})?.dmg
                }
              }
            }
          }
          move "Anger Revenge", {
            text "60 damage. If Bastiodon was damaged by an attack during your opponent’s last turn, this attack does 40 damage to 1 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 60
              if (opp.bench && turnCount+1==bg.turnCount && lastDamage > hp(0)) {
                damage 40, opp.bench.select()
              }
            }
          }

        };
      case CHIMECHO_22:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Call in", {
            text "Draw a card. If Chingling is anywhere under Chimecho, draw 2 more cards."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
              if (self.getPokemonCards().any{it.name.contains("Chingling")}) { draw 2 }
            }
          }
          move "Strange Bell", {
            text "20 damage. If the Defending Pokémon is a Basic Pokémon, that Pokémon is now Confused."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 20
              if (defending.basic) {
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case CROBAT_23:
        return evolution (this, from:"Golbat", hp:HP100, type:PSYCHIC, retreatCost:0) {
          weakness P, PLUS30
          resistance F, MINUS20
          pokePower "Evolutionary Toxic", {
            text "Once during your turn, when you play Crobat from your hand to evolve 1 of your Pokémon, you may choose 1 of the Defending Pokémon. That Pokémon is now Poisoned. Put 2 damage counters instead of 1 on that Pokémon between turns."
            onActivate {r->
              if (r==PLAY_FROM_HAND && my.deck && confirm("Use Evolutionary Toxic?")) {
                powerUsed()
                apply POISONED, opp.active, SRC_ABILITY
                extraPoison 1
              }
            }
          }
          move "Strike and Fade", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 50 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) Flip a coin. If tails, shuffle Crobat and all cards attached to it back into your deck."
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 50, opp.all.select()
              afterDamage {
                flip 1, {}, {
                  shuffleDeck(self.cards)
                  removePCS(self)
                }
              }
            }
          }

        };
      case EXEGGUTOR_24:
        return evolution (this, from:"Exeggcute", hp:HP090, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "String Bomb", {
            text "30× damage. Flip a coin for each basic Energy card attached to Exeggutor and to the Defending Pokémon. This attack does 30 damage times the number of heads."
            energyCost C
            attackRequirement {
              assert ( [self, defending].any{it.cards.filterByType(BASIC_ENERGY)} ) : "Neither $self nor the Defending Pokémon have any basic Energy cards attached"
            }
            onAttack {
              def basicEnergies = self.cards.filterByType(BASIC_ENERGY).size() + defending.cards.filterByType(BASIC_ENERGY).size()
              flip basicEnergies, { damage 30 }
            }
          }
          move "Nutritional Support", {
            text "Search your deck for up to 2 [G] Energy cards and attach them to any of your Pokémon in any way you like. Shuffle your deck afterward."
            energyCost G
            attackRequirement {
              assert my.deck : "You have no cards in deck"
            }
            onAttack {
              my.deck.search(max : 2,"Search your deck for up to 2 [G] Energy cards",basicEnergyFilter(G)).each{
                attachEnergy(my.all.select("Attach this energy to?"), it)
              }
            }
          }

        };
      case GLALIE_25:
        return evolution (this, from:"Snorunt", hp:HP090, type:WATER, retreatCost:2) {
          weakness M, PLUS20
          pokeBody "Craggy Face", {
            text "As long as Glalie is your Active Pokémon, any damage done by attacks from your opponent’s Stage 2 Evolved Pokémon is reduced by 20 (before applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each{
                  if(self.active && it.from.owner != self.owner && it.from.evolution && it.from.topPokemonCard.cardTypes.is(STAGE2)) {
                    bc "Craggy Face -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
          move "Intimidation Pebble", {
            text "50 damage. Flip a coin. If heads, your opponent can’t play any Trainer cards or Supporter cards from his or her hand during your opponent’s next turn."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 50
              afterDamage {
                flip {
                  delayed {
                    before PLAY_TRAINER, {
                      if (bg.currentTurn == self.owner.opposite && (
                        ef.cardToPlay.cardTypes.is(ITEM) || ef.cardToPlay.cardTypes.is(SUPPORTER)
                      )) {
                        wcu "$thisMove prevents you from playing any Trainer-Item or Supporter cards"
                        prevent()
                      }
                    }
                    unregisterAfter 2
                  }
                }
              }
            }
          }

        };
      case GYARADOS_26:
        return evolution (this, from:"Magikarp", hp:HP120, type:WATER, retreatCost:3) {
          weakness L, PLUS30
          resistance F, MINUS20
          pokeBody "Dragon DNA", {
            text "Gyarados can use any attack from its Basic Pokémon. (You still have to pay for that attack’s Energy cost.) If Gyarados uses any attack from its Basic Pokémon, that attack does 30 more damage to the Defending Pokémon (before applying Weakness and Resistance)."
            actionA {
              assert self.active: "This Gyarados is not the Active Pokemon."
              def moves = []
              self.cards.filterByType(BASIC).each {
                moves.addAll(it.moves)
              }
              assert !moves.isEmpty(): "There are no moves to copy from ${self}'s Basic Pokémon"

              def chosenMove = choose(moves+["Cancel"], moves.collect({it.name})+["Cancel"], "Choose a move to perform")

              if (chosenMove && chosenMove != "Cancel") {
                delayed{
                  before APPLY_ATTACK_DAMAGES, {
                    bg.dm().each {
                      if(it.from == self && it.dmg.value && it.notNoEffect) {
                        bc "TODO: Make attacks from this $self's Basic Pokémon do 30 more damage to the Defending Pokémon."
                        //it.dmg += hp(30)
                      }
                    }
                  }
                  unregisterAfter 1
                }
                attack (chosenMove as Move)
              }
            }
          }
          move "Enrage", {
            text "80 damage. Flip a coin until you get tails. For each heads, choose 1 card from your opponent’s hand without looking and discard it. If the first coin is tails, Gyarados is now Confused."
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 80
              afterDamage {
                def headsFlipped = 0
                flipUntilTails {
                  discardRandomCardFromOpponentsHand()
                  headsFlipped += 1
                }

                if (!headsFlipped) apply CONFUSED, self
              }
            }
          }

        };
      case KRICKETUNE_27:
        return evolution (this, from:"Kricketot", hp:HP080, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "Sore Performance", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              applyAfterDamage ASLEEP
            }
          }
          move "Concerto", {
            text "40+ damage. Does 40 damage plus 10 more damage for each Kricketot and each Kricketune you have in play."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 40 + 10 * my.all.findAll{["Kricketot", "Kricketune"].contains(it.name)}.size()
            }
          }

        };
      case MANECTRIC_28:
        return evolution (this, from:"Electrike", hp:HP080, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Lightning Twister", {
            text "20× damage. Does 20 damage times the number of basic Energy cards attached to Manectric."
            energyCost C
            attackRequirement {
              assert self.cards.filterByType(BASIC_ENERGY) : "$self has no basic Energy cards attached."
            }
            onAttack {
              damage 20 * self.cards.filterByType(BASIC_ENERGY).size()
            }
          }
          move "Chain Lightning", {
            text "70 damage. Does 20 damage to each of your opponent’s Benched Pokémon that is the same type as the Defending Pokémon."
            energyCost L, L, L
            attackRequirement {}
            onAttack {
              damage 70
              def defendingTypes = (defending.types as List<Type>)
              opp.bench.findAll{it.types.any{defendingTypes.contains(it)}}.each{damage 20, it}
            }
          }

        };
      case MANTINE_29:
        return basic (this, hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          pokeBody "Jumbo Fin", {
            text "If Mantyke is anywhere under Mantine, the Retreat Cost for each of your [W] Pokémon is [C][C] less."
            getterA (GET_RETREAT_COST) { h->
              if (self.getPokemonCards().any{it.name.contains("Mantyke")} && h.effect.target.owner == self.owner && h.effect.target.types.contains(W)) {
                h.object -= 2
              }
            }
          }
          move "Giant Wave", {
            text "Mantine can’t use Giant Wave during your next turn."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 50
              cantUseAttack(thisMove, self)
            }
          }

        };
      case MR__MIME_30:
        return basic (this, hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokeBody "Airy Wall", {
            text "If your opponent’s Pokémon that has 2 or less Energy cards attached to it attacks Mr. Mime, prevent all damage done to Mr. Mime from that attack. If Mime Jr. is anywhere under Mr. Mime, prevent all effects of that attack, including damage, done to Mr. Mime."
            delayedA {
              before null, self, Source.ATTACK, {
                if (self.getPokemonCards().any{it.name.contains("Mime Jr.")} && ((self.owner.opposite.pbg.active as PokemonCardSet).cards.energyCount(C) <= 2) && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                  bc "$pokeBody prevents effect"
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                if(ef.attacker.owner != self.owner && (ef.attacker as PokemonCardSet).cards.energyCount(C) <= 2) {
                  bg.dm().each {
                    if (it.to == self && it.notNoEffect) {
                      it.dmg = hp(0)
                      bc "$pokeBody prevents damage"
                    }
                  }
                }
              }
            }
          }
          move "Trick Play", {
            text "Put a coin next to your Active Pokémon without showing your opponent and cover it with your hand. Your opponent guesses if the coin is heads or tails. If he or she is wrong, this attack does 50 damage to the Defending Pokémon. If he or she is right, Mr. Mime does 20 damage to itself, and this attack’s damage isn’t affected by Weakness or Resistance."
            energyCost P, C
            attackRequirement {}
            onAttack {
              //TODO: Check for proper way to do this effect. Sounds straight-forward but just to confirm.
              damage 0
            }
          }

        };
      case NIDOQUEEN_31:
        return evolution (this, from:"Nidorina", hp:HP120, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS30
          resistance L, MINUS20
          pokeBody "Mother Phernomone", {
            text "The attack cost of your Nidoran♀, Nidorina, Nidoran♂, Nidorino, and Nidoking’s attacks is [C] less."

            def possibleNames = [ "Nidoran♀", "Nidorina", "Nidoran♂", "Nidorino", "Nidoking" ]

            getterA (GET_MOVE_LIST) {h->
              if (h.effect.target.owner==self.owner && possibleNames.contains(h.effect.target.name)) {
                def list=[]
                for (move in h.object) {
                  def copy=move.shallowCopy()
                  copy.energyCost.remove(C)
                  list.add(copy)
                }
                h.object=list
              }
            }
          }
          move "Give Aid", {
            text "90 damage. If you have the same number of or less Benched Pokémon than your opponent, this attack’s base damage is 50 instead of 90."
            energyCost P, P, C
            attackRequirement {}
            onAttack {
              damage 50
              if (my.bench.size() > opp.bench.size()) { damage 40 }
            }
          }

        };
      case NINETALES_32:
        return evolution (this, from:"Vulpix", hp:HP080, type:FIRE, retreatCost:1) {
          weakness W, PLUS20
          pokePower "Color Shift", {
            text "Once during your turn (before your attack), you may choose 1 of your opponent’s Pokémon. Ninetales is the same type as that Pokémon (all if that Pokémon is more than 1 type) until the end of your turn. This power can’t be used if Ninetales is affected by a Special Condition."
            actionA {
              //Taken from Mew (LM 10), could be modularized.
              checkLastTurn()
              checkNoSPC()
              powerUsed()
              def chosenPCS = opp.all.select("Choose which Pokémon should have its types copied by Ninetales' $pokePower?")
              def chosenTypes = chosenPCS.types
              chosenTypes.each{
                bc "$pokePower - $chosenPCS was chosen"
                bc "$self is now the following type: $it"
              }
              delayed {
                def eff
                register {
                  eff = getter GET_POKEMON_TYPE, self, { h->
                    h.object.clear()
                    chosenTypes.each{
                      h.object.add(it)
                    }
                  }
                }
                unregister {
                  eff.unregister()
                }
                unregisterAfter 1
              }
            }
          }
          move "Fire Blast", {
            text "60 damage. Discard a [R] Energy attached to Ninetales."
            energyCost R, R
            attackRequirement {}
            onAttack {
              damage 60
              discardSelfEnergy R
            }
          }

        };
      case RAMPARDOS_33:
        return evolution (this, from:"Cranidos", hp:HP120, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS30
          move "Assurance", {
            text "30 damage. As long as the Defending Pokémon’s remaining HP is 60 or less, this attack’s base damage is 60 instead of 30."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
              if (defending.getRemainingHP().value <= 60) { damage 30 }
            }
          }
          move "Hasty Headbutt", {
            text "100 damage. Rampardos does 20 damage to itself. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost F, F, F
            attackRequirement {}
            onAttack {
              swiftDamage(100, defending)
              damage 20, self
            }
          }

        };
      case SLAKING_34:
        return evolution (this, from:"Vigoroth", hp:HP140, type:COLORLESS, retreatCost:4) {
          weakness F, PLUS30
          pokePower "Energetic Impulse", {
            text "Once during your turn (before your attack), if Slaking is your Active Pokémon, you may flip a coin. If heads, Slaking’s Lazy Blow attack’s base damage is 130 during this turn. If tails, Slaking can’t attack or retreat during this turn. (If Slaking is no longer your Active Pokémon, this effect ends.)"
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert self.active : "$self is not your Active Pokémon"
              powerUsed()
              flip 1, {
                keyStore("EI_Buff_Lazy_Blow", self, true)
                delayed{
                  //TODO: Check this working properly.
                  unregister{
                    keyStore("EI_Buff_Lazy_Blow", self, 0)
                    bc "Energetic Impulse's effect wore off."
                  }
                  after SWITCH, self, {unregister()}
                  after EVOLVE, self, {unregister()}
                  unregisterAfter 1
                }
                bc "During this turn, Slaking's Lazy Blow attack's base damage is 130."
              }, {
                delayed{
                  before CHECK_ATTACK_REQUIREMENTS {
                    if (ef.attacker == self) {
                      wcu "$pokePower prevents $self from attacking."
                      prevent()
                    }
                  }
                  before RETREAT, self, {
                    wcu "$pokePower prevents $self from attacking."
                    prevent()
                  }
                  after SWITCH, self, {unregister()}
                  after EVOLVE, self, {unregister()}
                  unregisterAfter 1
                }
              }
            }
          }
          move "Lazy Blow", {
            text "50 damage. "
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 50
              if (keyStore("EI_Buff_Lazy_Blow", self, null)) { damage 80 }
            }
          }

        };
      case SUDOWOODO_35:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness W
          move "Sidestep", {
            text "20 damage. If Bonsly is anywhere under Sudowoodo, flip a coin. If heads, prevent all effects of an attack, including damage, done to Sudowoodo during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
              if (self.getPokemonCards().findAll {it.name.contains("Bonsly")}){
                flip { preventAllEffectsNextTurn() }
              }
            }
          }
          move "Persuade", {
            text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon. The new Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost F, F
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage{
                if (opp.bench) {
                  def pcs = opp.bench.oppSelect("Choose 1 of your Benched Pokémon to switch with your Defending Pokémon. The switched Pokémon won't be able to manually retreat during your next turn.")
                  sw defending, pcs
                  cantRetreat pcs
                }
              }
            }
          }

        };
      case TOXICROAK_36:
        return evolution (this, from:"Croagunk", hp:HP090, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          pokeBody "Poison Sacs", {
            text "Your opponent can’t remove the Special Condition Poisoned by evolving or devolving his or her Poisoned Pokémon. (This also includes putting a Pokémon Level-Up card onto the Poisoned Pokémon.)"
            delayedA {
              before POISONED_SPC, null, null, EVOLVE, {
                if(ef.target == self.owner.opposite){
                  prevent()
                }
              }
              // Potential addition once level-up is implemented
              // before POISONED_SPC, null, null, LEVEL_UP, {
              //   if(ef.target == self.owner.opposite){
              //     prevent()
              //   }
              // }
            }
          }
          move "Knuckle Claws", {
            text "30 damage. The Defending Pokémon is now Poisoned."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 30
              applyAfterDamage POISONED
            }
          }

        };
      case UNOWN_I_37:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "ITEM", {
            text "Once during your turn (before your attack), if you have Unown I, Unown T, Unown E, and Unown M on your Bench, you may search your deck for a Trainer card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. You can’t use more than 1 ITEM Poké-Power each turn."
            actionA {
              checkLastTurn()
              assert bg.em().retrieveObject("DP_Unown_ITEM") != bg.turnCount : "You can’t use more than 1 ITEM Poké-Power each turn."
              //assert self.benched : "$self is not on the Bench"
              //Checking for any Unown I on the bench, text apparently wouldn't specify this one being the one benched. There's a no-more-than-1-use limit anyways.
              ["Unown I", "Unown T", "Unown E", "Unown M"].each{
                def cardName = it
                assert my.benched.any{it.name == cardName} : "$cardName is not on your bench"
              }
              powerUsed()
              bg.em().storeObject("DP_Unown_ITEM", bg.turnCount)
              my.deck.search(max:1, "Choose a Trainer-Item card.", cardTypeFilter(ITEM)).showToOpponent("Opponent's chosen Trainer-Item card.").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Hidden Power", {
            text "Choose an Energy card attached to the Defending Pokémon and put it face down. Treat that card as a Special Energy card that provides [C] Energy and doesn’t have any effect other than providing Energy. Put that card face up at the end of your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              //  TODO: Implement this oddly unique energy modification.
              //  Notes (taken from JP FAQs, none in english rulings):
              //    * The flipped energy cannot use any abilities included in it (see: Call Energy MD 92)
              //    * Neither does it keep its name while flipped. (See: Gorebyss LM 17)
              //    * The flipped energy can be moved around (see: Arcanine SW 22). But once moved it's still flipped and only provides [C] with no extra effect.
              //    * If a Pokémon depends on the chosen energy for an ability/pokémon-body/power and it's flipped, the effect should turn off (see: Wormadam Plant Cloak SW 41, with only Double Rainbow Energy attached and 8 damage counters.)
              //    * Attacks preventing effects on the defending Pokémon this turn protect their energy from this. See: Venomoth SW 73
              //    * The energy is flipped back to normal when discarded. Ex: A flipped basic fire can be discarded for retreat and immediately re-attached through Firestarter (Typhlosion MT 16).
              //    * If Multi Energy (MT 118) is attached to Venusaur (CG 28), and Hidden Power flips it it should convert by Chlorophyll into a grass energy. Only while flipped, if not it depends on multi energy alone.
              //    * Cards only attachable to a specific Pokémon (See: Scramble Energy DF 89) can be moved to non-valid Pokémon while flipped. But the instant they flip back to normal, they should be discarded.
              //
              def chosenEnergy = defending.cards.filterByType(ENERGY).select(count:1)
              def eff
              /* delayed {
                eff = getter GET_ENERGY_TYPES, { holder->
                  if (holder.effect.card == chosenCard) {
                    holder.object = [[C] as Set]
                    ////holder.name := "Flipped Back Energy"
                    ////holder.setCardTypes := specialEnergy
                    ////holder.customAbility := disabled
                  }
                }
                unregister {
                  eff.unregister()
                }
                unregisterAfter 2
              } */
            }
          }

        };
      case URSARING_38:
        return evolution (this, from:"Teddiursa", hp:HP100, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Bad Temper", {
            text "30 damage. The Defending Pokémon is now Confused. During your opponent’s next turn, that Pokémon’s attacks do 60 more damage to the Active Pokémon (before applying Weakness and Resistance)."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              applyAfterDamage CONFUSED
              afterDamage{ doMoreDamageNextTurn(thisMove, 60, defending) } //TODO: Maybe hardcode this instead of delegating? There might be some edge case annoyingly affecting on self.owner's next turn somehow...
            }
          }
          move "Defensive Claw", {
            text "60+ damage. If Teddiursa is on your Bench, this attack does 60 damage plus 20 more damage. If Teddiursa is on your Bench and has any damage counters on it, this attack does 60 damage plus 40 more damage and remove all damage counters from that Pokémon."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              def oneInBench = false
              def oneDamaged = false
              damage 60
              my.bench.each {
                if(it.name.contains("Teddiursa")){
                  oneInBench = true
                  if(it.numberOfDamageCounters) {
                    oneDamaged = true
                    afterDamage{healAll it}
                  }
                }
              }
              if(oneInBench){ damage 20 }
              if(oneDamaged){ damage 20 }
            }
          }

        };
      case WALREIN_39:
        return evolution (this, from:"Sealeo", hp:HP130, type:WATER, retreatCost:3) {
          weakness M, PLUS30
          pokePower "Freeze-up", {
            text "Once during your turn, when you play Walrein from your hand to evolve 1 of your Pokémon, you may flip 2 coins. If both are heads, discard 1 of the Defending Pokémon and all cards attached to it. (This doesn’t count as a Knocked Out Pokémon.)"
            onActivate {reason ->
              if(reason==PLAY_FROM_HAND && confirm('Use Freeze-Up?')){
                powerUsed()
                def doEff = true
                flip 2, {}, {doEff = false}
                if (doEff){
                  targeted (defending, SRC_ABILITY/*, Source.POKEMONPOWER*/) {
                    defending.cards.reverse().discard()
                    removePCS(defending)
                  }
                }
              }
            }
          }
          move "Ice Bind", {
            text "70 damage. If your opponent doesn’t discard a card from his or her hand, the Defending Pokémon is now Paralyzed."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 70
              afterDamage{
                if (opp.hand && oppConfirm("Do you want to discard a card from your hand?\nIf you don't, Ice Bind will paralyze your ${defending}")){
                  opp.hand.oppSelect(count:1, "Which card to discard?").discard()
                } else {
                  if (!opp.hand) bc "The opponent has no cards to discard! Ice Bind will paralyze their ${defending}"
                  applyAfterDamage PARALYZED
                }
              }
            }
          }

        };
      case WHISCASH_40:
        return evolution (this, from:"Barboach", hp:HP090, type:WATER, retreatCost:3) {
          weakness G, PLUS30
          resistance L, MINUS20
          move "Fury", {
            text "20× damage. Does 20 damage times the number of damage counters on Whiscash."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 20 * self.numberOfDamageCounters
            }
          }
          move "Magnitude", {
            text "60 damage. Does 20 damage to each Benched Pokémon (both yours and your opponent’s). (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              all.each {
                if (it.benched) {
                  damage 20, it
                }
              }
            }
          }

        };
      case BAYLEEF_41:
        return evolution (this, from:"Chikorita", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Evolution Impulse", {
            text "Search your deck for an Evolution card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement{
              assert my.deck : "Deck is empty"
            }
            onAttack{
              my.deck.search(min: 0, max:1,"Choose an Evolution card",cardTypeFilter(EVOLUTION)).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Leaf Boomerang", {
            text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost G, C
            attackRequirement {}
            onAttack {
              flip 2, {damage 30}
            }
          }

        };
      case CHINGLING_42:
        return basic (this, hp:HP040, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn (before your attack), you may put Chimecho from your hand onto Chingling (this counts as evolving Chingling) and remove all damage counters from Chingling."
            actionA {
              checkCanBabyEvolve("Chimecho", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Chimecho", self)
            }
          }
          move "Inviting Bell", {
            text "Search your deck for a Supporter card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.search("Search your deck for a Supporter card", {it.cardTypes.is(SUPPORTER)}).moveTo(my.hand)
              shuffleDeck()
            }
          }

        };
      case CRANIDOS_43:
        return evolution (this, from:"Skull Fossil", hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS20
          move "Headbutt", {
            text "20 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Steamroll", {
            text "30 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
              if (opp.bench) damage 20, opp.bench.select()
            }
          }

        };
      case CROCONAW_44:
        return evolution (this, from:"Totodile", hp:HP080, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          pokePower "Evolutionary Vitality", {
            text "Once during your turn, when you play Croconaw from your hand to evolve 1 of your Pokémon, you may look at the top 5 cards of your deck. Choose all Energy cards you find there, show them to your opponent, and put them into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward."
            // Weird wording, but confirmed by a Rules Team member on 2007 that the intent is for it to be a search, you can choose as many as you want or even fail, no need to "choose all".
            // https://pokegym.net/community/index.php?threads/croconaw-mts-power.62819/#post-982469
            onActivate{reason ->
              if(reason == PLAY_FROM_HAND && confirm("Use Evolutionary Vitality?")){
                my.deck.subList(0, 5).select(min:0, max: 5, "Top cards of your deck. Which Energy cards do you want to put into your hand?", cardTypeFilter(ENERGY)).moveTo(my.hand)
                shuffleDeck()
              }
            }
          }
          move "Hover Over", {
            text "30 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
              cantRetreat defending
            }
          }

        };
      case DEWGONG_45:
        return evolution (this, from:"Seel", hp:HP090, type:WATER, retreatCost:2) {
          weakness M, PLUS20
          pokeBody "Cold Fat", {
            text "As long as Dewgong is Asleep, any damage done to Dewgong by attacks is reduced by 40 (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (it.to == self && self.isSPC(ASLEEP)) {
                    bc "Cold Fat -40"
                    it.dmg -= hp(40)
                  }
                }
              }
            }
          }
          move "Collapse", {
            text "60 damage. Dewgong is now Asleep."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 60
              afterDamage { apply ASLEEP, self }
            }
          }
        };
      case DODRIO_46:
        return evolution (this, from:"Doduo", hp:HP080, type:COLORLESS, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Fury Attack", {
            text "10× damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 3, {damage 10}
            }
          }
          move "Triple Pick", {
            text "Choose 3 of your opponent’s Evolved Pokémon. This attack does 30 damage to each of them. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              multiSelect(opp.all.findAll{it.evolution}, 3).each{
                targeted(it){
                  damage 30, it
                }
              }
            }
          }
        };
      case DUNSPARCE_47:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Snake Hook", {
            text "Draw a card."
            energyCost ()
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Bite and Run", {
            text "10 damage. Switch Dunsparce with 1 of your Benched Pokémon."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 10
              switchYourActive()
            }
          }

        };
      case GABITE_48:
        return evolution (this, from:"Gible", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS20
          move "Gather Up", {
            text "Search your discard pile for up to 2 Energy cards, show them to your opponent, and put them into your hand."
            energyCost C
            attackRequirement {
              assert my.discard.find(cardTypeFilter(ENERGY)) : "No Energy cards in Discard pile"
            }
            onAttack {
              my.discard.findAll(cardTypeFilter(ENERGY)).select(max: 2).moveTo(my.hand)
            }
          }
          move "Marvelous Shine", {
            text "Flip a coin. If heads put 4 damage counters on 1 of your opponent’s Pokémon. If tails, remove 4 damage counters from 1 of your Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 1, {
                directDamage 40, opp.all.select()
              }, {
                def tar = my.all.findAll{it.numberOfDamageCounters}
                if (tar) heal 40, tar.select()
              }
            }
          }

        };
      case GIRAFARIG_49:
        return basic (this, hp:HP070, type:COLORLESS, retreatCost:1) {
          weakness P, PLUS20
          move "Crane Kick", {
            text "Search your deck for a Trainer card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Deck is empty"
            }
            onAttack {
              def trainer = my.deck.search(count:1, "Select a Trainer-Item card",cardTypeFilter(ITEM))
              if (trainer)
                trainer.moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Psybeam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flipThenApplySC CONFUSED
            }
          }

        };
      case GOLBAT_50:
        return evolution (this, from:"Zubat", hp:HP070, type:PSYCHIC, retreatCost:0) {
          weakness P, PLUS20
          resistance F, MINUS20
          move "Pulse Search", {
            text "30 damage. Look at your opponent’s hand."
            energyCost P
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage{
                opp.hand.showToMe("Opponent’s hand")
              }
            }
          }

        };
      case GRAVELER_51:
        return evolution (this, from:"Geodude", hp:HP090, type:FIGHTING, retreatCost:3) {
          weakness G, PLUS20
          resistance L, MINUS20
          move "Rock Cannon", {
            text "30× damage. Flip a coin until you get tails. This attack does 30 damage times the number of heads."
            energyCost F, C
            attackRequirement {}
            onAttack {
              flipUntilTails { damage 30 }
            }
          }
          move "Rock Slide", {
            text "40 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 40
              if (opp.bench) {
                multiSelect(opp.bench, 2).each {
                  targeted(it) {
                    damage 10, it
                  }
                }
              }
            }
          }

        };
      case HAPPINY_52:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Chansey from your hand onto Happiny (this counts as evolving Happiny) and remove all damage counters from Happiny."
            actionA {
              checkCanBabyEvolve("Chansey", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Chansey", self)
            }
          }
          move "Lively", {
            text "Remove 2 damage counters from 1 of your Pokémon."
            energyCost ()
            attackRequirement {
              assert my.all.findAll{it.numberOfDamageCounters} : "There are no damaged pokemon to heal"
            }
            onAttack {
              heal 20, my.all.findAll{it.numberOfDamageCounters}.select("Heal")
            }
          }

        };
      case LAIRON_53:
        return evolution (this, from:"Aron", hp:HP080, type:METAL, retreatCost:3) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Mend", {
            text "Search your discard pile for a [M] Energy card and attach it to Lairon. If you do, remove 2 damage counters from Lairon."
            energyCost M
            attackRequirement {
              assert my.discard.filterByType(ENERGY).filterByEnergyType(M) : "There is no [M] Energy card in your discard"
            }
            onAttack {
              attachEnergyFrom(type : M, my.discard, self)
              //TODO: Make this conditional on the attach
              heal 10, self
            }
          }
          move "Confront", {
            text "50 damage."
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }

        };
      case MAGMAR_54:
        return basic (this, hp:HP070, type:FIRE, retreatCost:2) {
          weakness W, PLUS20
          move "Flare", {
            text "20 damage."
            energyCost R
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Flamethrower", {
            text "50 damage. Discard an Energy attached to Magmar."
            energyCost R, R, C
            attackRequirement {}
            onAttack {
              damage 50
              afterDamage{
                discardSelfEnergy(C)
              }
            }
          }

        };
      case MASQUERAIN_55:
        return evolution (this, from:"Surskit", hp:HP070, type:GRASS, retreatCost:0) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Centrifugal Force", {
            text "20× damage. Does 20 damage times the number of [C] Energy in the Defending Pokémon’s Retreat Cost (after applying effects to the Retreat Cost)."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20 * defending.retreatCost
            }
          }
          move "Swirling Ripple", {
            text "30+ damage. If your opponent has any [W] Pokémon in play, this attack does 30 damage plus 30 more damage and the Defending Pokémon is now Confused."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 30
              if(opp.all.findAll{it.types.contains(W)}) {
                damage 30
                applyAfterDamage(CONFUSED)
              }
            }
          }

        };
      case NIDORINA_56:
        return evolution (this, from:"Nidoran♀", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS20
          move "Rescue", {
            text "Search your discard pile for up to 2 Pokémon, show them to your opponent, and put them into your hand."
            energyCost C
            attackRequirement {
              assert my.discard.filterByType(POKEMON)
            }
            onAttack {
              my.discard.filterByType(POKEMON).select(max : 2,).showToOpponent("Selected cards").moveTo(my.hand)
            }
          }
          move "Scratch", {
            text "30 damage."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case OCTILLERY_57:
        return evolution (this, from:"Remoraid", hp:HP080, type:WATER, retreatCost:1) {
          weakness L, PLUS20
          move "Crash Bomber", {
            text "30+ damage. If the Defending Pokémon has any Special Energy cards attached to it, this attack does 30 damage plus 30 more damage. Then, discard a Special Energy card attached to the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              if (defending.cards.filterByType(SPECIAL_ENERGY)) {
                damage 30
                discardDefendingSpecialEnergy(delegate)
              }
            }
          }
          move "Aqua Liner", {
            text "Choose 1 of your opponent’s Benched Pokémon. This attack does 40 damage to that Pokémon."
            energyCost W, W
            attackRequirement {
              assert opp.bench : "Your opponent has no Pokémon in their bench."
            }
            onAttack {
              damage 40, opp.bench.select()
            }
          }

        };
      case PARASECT_58:
        return evolution (this, from:"Paras", hp:HP090, type:GRASS, retreatCost:2) {
          weakness R, PLUS20
          move "Wild Spores", {
            text "20 damage. If Parasect evolved from Paras during this turn, this attack does 40 damage and the Defending Pokémon is now Asleep and Poisoned."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
              if(self.lastEvolved == bg.turnCount){
                damage 20
                applyAfterDamage(ASLEEP)
                applyAfterDamage(POISONED)
              }
            }
          }
          move "Extend Fungus", {
            text "60 damage. Remove 2 damage counters from Parasect."
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 60
              heal 20, self
            }
          }

        };
      case PUPITAR_59:
        return evolution (this, from:"Larvitar", hp:HP070, type:FIGHTING, retreatCost:0) {
          weakness G, PLUS20
          resistance L, MINUS20
          move "Pressurized Gas", {
            text "Does 10 damage to each of your opponent’s Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              opp.all.each {damage 10,it}
            }
          }
          move "Rocket Tackle", {
            text "50 damage. Pupitar does 10 damage to itself. Flip a coin. If heads, prevent all damage done to Pupitar by attacks during your opponent’s next turn."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 50
              damage 10, self
              flip{preventAllDamageNextTurn()}
            }
          }

        };
      case QUILAVA_60:
        return evolution (this, from:"Cydnaquil", hp:HP080, type:FIRE, retreatCost:1) {
          weakness W, PLUS20
          move "Fireworks", {
            text "40 damage. Flip a coin. If tails, discard a [R] Energy attached to Quilava."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 40
              flip 1, {}, { discardSelfEnergy R }
            }
          }

        };
      case SANDSLASH_61:
        return evolution (this, from:"Sandshrew", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS20
          resistance L, MINUS20
          move "Spike Armor", {
            text "During your opponent’s next turn, if Sandslash is damaged by an opponent’s attack (even if Sandslash is Knocked Out), put 4 damage counters on the Attacking Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              delayed (priority: LAST) {
                before APPLY_ATTACK_DAMAGES, {
                  if(bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})){
                    bc "Spike Armor activates"
                    directDamage(40, ef.attacker as PokemonCardSet)
                  }
                }
                unregisterAfter 2
                after EVOLVE, self, {unregister()}
                after SWITCH, self, {unregister()}
              }
            }
          }
          move "Poison Spike", {
            text "60 damage. If the Defending Pokémon already has any damage counters on it, that Pokémon is now Poisoned."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 60
              if(defending.numberOfDamageCounters) applyAfterDamage(POISONED)
            }
          }

        };
      case SEALEO_62:
        return evolution (this, from:"Spheal", hp:HP080, type:WATER, retreatCost:2) {
          weakness M, PLUS20
          move "Ice Rider", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 30 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 30, opp.all.select()
            }
          }

        };
      case SHIELDON_63:
        return evolution (this, from:"Armor Fossil", hp:HP080, type:METAL, retreatCost:2) {
          weakness R, PLUS20
          resistance M, MINUS20
          move "Hard Face", {
            text "20 Damage. During your opponent’s next turn, any damage done to Shieldon by attacks is reduced by 20 (after applying Weakness and Resistance)"
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 20
              reduceDamageNextTurn(hp(20), thisMove)
            }
          }
          move "Shield Attack", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip { damage 20 }
            }
          }

        };
      case TROPIUS_64:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Bonus Leaf", {
            text "Remove 3 damage counters from each of your Benched Pokémon that has any [G] Energy attached to it."
            energyCost G
            attackRequirement {
              assert my.bench.any{it.numberOfDamageCounters && it.cards().energyCount(G)} : "None of your Benched Pokémon with damage counters has any [G] Energy attached to them."
            }
            onAttack {
              my.bench.findAll{it.numberOfDamageCounters && it.cards().energyCount(G)}.each{heal 20, it}
            }
          }
          move "Whirlwind", {
            text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 30
              whirlwind()
            }
          }

        };
      case UNOWN_E_65:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "EQUIP", {
            text "Once during your turn (before your attack), if Unown E is on your Bench, you may discard all cards attached to Unown E and attach Unown E to 1 of your Pokémon as a Pokémon Tool card. As long as Unown E is attached to a Pokémon, that Pokémon gets +10 HP."
            actionA {
              checkLastTurn()
              assert self.benched : "$self is not on the Bench" //No need to check for other Poké, if it's benched there's at least the active.
              assert my.all.findAll {it != self && it.cards.filterByType(POKEMON_TOOL).empty} : "No place to attach $self as a tool"
              powerUsed()
              def top = self.topPokemonCard
              self.cards.getExcludedList(top).discard()
              removePCS(self)
              def trcard
              trcard = pokemonTool(new CustomCardInfo(top.realInfo).setCardTypes(TRAINER, ITEM, POKEMON_TOOL)) {
                def eff
                onPlay {
                  eff = getter (GET_FULL_HP, self) {h->
                    h.object += hp(10)
                  }
                }
                onRemoveFromPlay {
                  eff.unregister()
                  bg.em().run(new ChangeImplementation(top, trcard))
                }
              }
              trcard.player = top.player
              def pcs = my.all.findAll {it!=self && it.cards.filterByType(POKEMON_TOOL).empty}.select("Attach to?")
              attachPokemonTool(trcard,pcs)
            }
          }
          move "Hidden Power", {
            text "During your opponent’s next turn, whenever your opponent flips a coin, treat it as tails."
            energyCost C, C
            attackRequirement {}
            onAttack {
              delayed {
                def doit = {
                  if (bg.currentThreadPlayerType != self.owner) {
                    bc "Hidden Power forced the coinflip to be TAILS."
                    bg.deterministicCoinFlipQueue.offer(false)
                  }
                }
                before COIN_FLIP, {doit()}
                before COIN_FLIP_GETTER, {doit()}
                unregisterAfter 2
              }
            }
          }

        };
      case UNOWN_M_66:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "MAGNET", {
            text "Once during your turn (before your attack), if Unown M is your Active Pokémon, you may flip a coin. If heads, switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon. This power can’t be used if Unown M is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert self.active : "$self is not your Active Pokémon"
              assert opp.bench : "Your opponent has no Pokémon in their bench."
              powerUsed()
              flip { sw (defending, opp.bench.select("Select the new active"), SRC_ABILITY/*, Source.POKEMONPOWER*/) }
            }
          }
          move "Hidden Power", {
            text "Flip a coin. If heads, this attack does 30 damage. If tails, this attack does 30 damage to 1 of your Pokémon, and this attack’s damage isn’t affected by Weakness or Resistance."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 1, {noWrDamage(110,defending)}, {noWrDamage(110,my.all.select())}
            }
          }

        };
      case UNOWN_T_67:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          pokePower "THROW", {
            text "Once during your turn (before your attack), if Unown T is your Active Pokémon, you may discard a card from your hand. Then, flip a coin. If heads, put 2 damage counters on 1 of your opponent’s Benched Pokémon. This power can’t be used if Unown T is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert self.active : "$self is not your Active Pokémon"
              assert my.hand : "You don't have any cards in your hand"
              powerUsed()
              my.hand.select("Discard a card in order to use THROW").discard()
              flip { directDamage 20, opp.all.select() }
            }
          }
          move "Hidden Power", {
            text "Look at your opponent’s hand and choose 1 card, then have your opponent shuffle that card into his or her deck. Then, show your opponent your hand and he or she chooses 1 card. Shuffle that card into your deck."
            energyCost C
            attackRequirement {
              assert (my.hand || opp.hand)
            }
            onAttack {
              if (opp.hand && !checkBodyguard()) {
                def oppCard = opp.hand.select(hidden: true, count: count, "Choose a random card from your opponent's hand to be shuffled into his or her deck").showToMe("Selected card(s)").showToOpponent("Hidden Power: this card will be shuffled from your hand to your deck")
                oppCard.moveTo(opp.deck)
                shuffleDeck(null, TargetPlayer.OPPONENT)
              }
              if (my.hand) {
                def myCard = my.hand.oppSelect(hidden: true, count: 1, "Choose 1 random card from your opponent's hand to be shuffled into his or her deck").showToOpponent("Selected card(s)").showToMe("Hidden Power: this card will be shuffled from your hand to your deck")
                myCard.moveTo(my.deck)
                shuffleDeck()
              }
            }
          }

        };
      case VIGOROTH_68:
        return evolution (this, from:"Slakoth", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          /*def asleepBeforeEvolve = false*/
          move "Wake-up Punch", {
            text "10 damage. If Vigoroth evolved from Slakoth during this turn and Slakoth was Asleep, this attack’s base damage is 60 instead of 10."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              //TODO: Add "Slakoth was asleep" check for the extra damage.
              if(self.lastEvolved == bg.turnCount/* && asleepBeforeEvolve*/){
                damage 50
              }
            }
          }
          move "Fury Swipes", {
            text "30× damage. Flip 3 coins. This attack does 30 damage times the number of heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              flip 3, {damage 30}
            }
          }

        };
      case ABRA_69:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Play Search", {
            text "Look at the top 5 cards of your deck, choose 1 of them, and put it into your hand. Put the other 4 cards back on top of your deck. Shuffle your deck afterward."
            energyCost P
            attackRequirement {
              assert my.deck
            }
            onAttack {
              my.deck.subList(0,5).select(min:0,"Choose a card to put in your hand").moveTo(hidden: true, my.hand)
              shuffleDeck()
            }
          }
          move "Ultra Evolution", {
            text "Search your deck for Alakazam and put it on Abra (this counts as evolving Abra). Shuffle your deck afterward."
            energyCost P, C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              def tar = my.deck.search("Searching for an Alakazam", {it.cardTypes.is(EVOLUTION) && it.name == "Alakazam"})
              if(tar) evolve(self, tar.first(), OTHER)
              shuffleDeck()
            }
          }

        };
      case AIPOM_70:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Tail Whap", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Throw Off", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) Before doing damage, discard all Pokémon Tool cards attached to that Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              def pcs = opp.all.select("Select the Pokémon to attack.")
              pcs.cards.filterByType(POKEMON_TOOL).discard()
              damage 20, pcs
            }
          }

        };
      case ARON_71:
        return basic (this, hp:HP050, type:METAL, retreatCost:2) {
          weakness R, PLUS10
          resistance P, MINUS20
          move "Steel Tackle", {
            text "30 damage. Aron does 10 damage to itself."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 30
              damage 10, self
            }
          }

        };
      case BARBOACH_72:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness G, PLUS10
          resistance L, MINUS20
          move "Mud Spit", {
            text "Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F
            attackRequirement {}
            onAttack {
              flip{ opp.all.each{ damage 10, it } }
            }
          }

        };
      case BIDOOF_73:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS10
          //Wacan Berry: Any damage done to Bidoof by attacks from [L] Pokémon is reduced by 20 (after applying Weakness and Resistance).
          customAbility {
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                if(ef.attacker.owner != self.owner && (ef.attacker.types.contains(L))) {
                  bg.dm().each{
                    if(it.to == self && it.notNoEffect && it.dmg.value) {
                      bc "Wacan Berry -20"
                      it.dmg -= hp(20)
                    }
                  }
                }
              }
            }
          }
          move "Tackle", {
            text "30 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case BRONZOR_74:
        return basic (this, hp:HP050, type:METAL, retreatCost:1) {
          weakness R, PLUS10
          resistance P, MINUS20
          move "Dull Light", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost M, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply CONFUSED }
            }
          }

        };
      case BUIZEL_75:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          //Chesto Berry: If Buizel is Asleep, remove the Special Condition Asleep from Buizel at the end of each player’s turn.
          customAbility {
            delayedA {
              before ASLEEP_SPC, null, null, BEGIN_TURN, {
                if(ef.target == self){ //MARK parentEvent
                  bc "Chesto Berry activates"
                  clearSpecialCondition(self, ATTACK, [ASLEEP]) //TODO Source.HELD_ITEM
                  prevent()
                }
              }
            }
          }
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 30 }
            }
          }

        };
      case CHANSEY_76:
        return basic (this, hp:HP100, type:COLORLESS, retreatCost:2) {
          weakness F, PLUS20
          move "Scrunch", {
            text "Flip a coin. If heads, prevent all damage done to Chansey by attacks during your opponent’s next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
            flip { preventAllEffectsNextTurn() }
            }
          }
          move "Double-edge", {
            text "80 damage. Chansey does 60 damage to itself."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 80
              damage 60, self
            }
          }

        };
      case CHIKORITA_77:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Sleep Scent", {
            text "Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost ()
            attackRequirement {}
            onAttack {
              flip { apply ASLEEP }
            }
          }
          move "Jump On", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
              flip { damage 10 }
            }
          }

        };
      case CROAGUNK_78:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Ghastly Sound", {
            text "Flip a coin. If heads, your opponent can’t play any Supporter cards from his or her hand during his or her next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                opponentCantPlaySupporterNextTurn(delegate) //TODO: Que el static use ${thisMove.name}
                bc "${thisMove.name} - Supporters can't be played from the turn player's hand during the next turn" //TODO: Find way to use "Player A/B" as a $variable
              }
            }
          }
          move "Finger Poké", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply POISONED }
            }
          }

        };
      case CYNDAQUIL_79:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Tackle", {
            text "10 damage."
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Live Coal", {
            text "20 damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case DODUO_80:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Double Stab", {
            text "10× damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 2, {damage 10}
            }
          }
          move "Accelerating Stab", {
            text "30 damage. Doduo can’t use Accelerating Stab during your next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              cantUseAttack thisMove, self
            }
          }

        };
      case ELECTRIKE_81:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Electromagnetic Jam", {
            text "10 damage. Flip a coin. If heads, your opponent can’t attach any Energy cards from his or her hand to the Active Pokémon during his or her next turn."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage {
                flip{
                  delayed{
                    before ATTACH_ENERGY, self.owner.opposite.pbg.active, {
                      if(ef.reason == PLAY_FROM_HAND && ef.resolvedTarget.owner == self.owner.opposite && ef.resolvedTarget.active) {
                        wcu "Electromagnetic Jam prevents you from attaching Energy to ${ef.resolvedTarget}."
                        prevent()
                      }
                    }
                    unregisterAfter 2
                    after SWITCH, defending, {unregister()}
                    after EVOLVE, defending, {unregister()}
                  }
                }
              }
            }
          }

        };
      case EXEGGCUTE_82:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Direct-hit Bomb", {
            text "Flip a coin for each Energy attached to Exeggcute. Choose 1 of your opponent’s Pokémon. For each heads, this attack does 10 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost G
            attackRequirement {}
            onAttack {
              def totalDmg = 0
              flip self.cards.energyCount(C), {
                totalDmg += 10
              }
              if (totalDmg) damage totalDmg, opp.all.select()
            }
          }

        };
      case FINNEON_83:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Elegant Swim", {
            text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Finneon during your opponent’s next turn."
            energyCost W
            attackRequirement {}
            onAttack {
              flip { preventAllEffectsNextTurn() }
            }
          }
          move "Tackle", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case GEODUDE_84:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness G, PLUS10
          resistance L, MINUS20
          move "Stone Throw", {
            text "Choose 2 of your opponent’s Benched Pokémon. This attack does 10 damage to each of them. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              multiSelect(opp.bench, 2).each{
                targeted(it){
                  damage 10, it
                }
              }
            }
          }

        };
      case GIBLE_85:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS10
          move "Push Down", {
            text "10 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              whirlwind()
            }
          }

        };
      case KRICKETOT_86:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(basic:true, 1, delegate)
          }
          move "Sling", {
            text "10 damage."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
            }
          }

        };
      case LARVITAR_87:
        return basic (this, hp:HP050, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS10
          resistance L, MINUS20
          move "Mountain Bite", {
            text "10+ damage. You may discard the top card of your deck. If you do, this attack does 10 damage plus 10 more damage and Larvitar is now Asleep."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 10
              if (my.deck && confirm("Discard the top card of your deck? If you do, this attack does 10 damage plus 10 more damage and Larvitar is now Asleep.")){
                my.deck.subList(0,1).discard()
                damage 10
                apply ASLEEP, self
              }
            }
          }
          move "Hammer In", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case MAGBY_88:
        return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn (before your attack), you may put Magmar from your hand onto Magby (this counts as evolving Magby) and remove all damage counters from Magby."
            actionA {
              checkCanBabyEvolve("Magmar", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Magmar", self)
            }
          }
          move "Scorch", {
            text "Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost ()
            attackRequirement {}
            onAttack {
              flip { apply BURNED }
            }
          }

        };
      case MAGIKARP_89:
        return basic (this, hp:HP030, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Flail", {
            text "10× damage. Does 10 damage times the number of damage counters on Magikarp."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10 * self.numberOfDamageCounters
            }
          }
          move "Dragon Rage", {
            text "60 damage. Flip 2 coins. If either of them is tails, this attack does nothing."
            energyCost W, W
            attackRequirement {}
            onAttack {
              //TODO: Modularize
              def doDamage = true
              flip 2, {}, {doDamage = false}
              if(doDamage) damage 60 else bc "$thisMove failed"
            }
          }

        };
      case MURKROW_90:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          weakness L, PLUS10
          resistance L, MINUS20
          move "Swarm", {
            text "Search your deck for Murkrow and put it onto your Bench. Shuffle your deck afterward."
            energyCost ()
            callForFamily(name:"Murkrow",1,delegate)
          }
          move "Hide Crowd", {
            text "20 damage. Switch Murkrow with 1 of your Benched Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              switchYourActive()
            }
          }

        };
      case NIDORAN_FEMALE_91:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Call for Family", {
            text "Search your deck for Nidoran ♂ or Nidoran ♀ and put it onto your Bench. Shuffle your deck afterward."
            energyCost C

            //TODO: Check this finding all Nidorans, male and female.
            callForFamily(name:"Nidoran",1,delegate)
          }
          move "Poison Sting", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply POISONED }
            }
          }

        };
      case PARAS_92:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Scratch", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Mushroom Tackle", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, G
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }

        };
      case PICHU_93:
        return basic (this, hp:HP040, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          pokePower "Baby Evolution", {
            text "Once during your turn (before your attack), you may put Pikachu from your hand onto Pichu (this counts as evolving Pichu) and remove all damage counters from Pichu."
            actionA {
              checkCanBabyEvolve("Pikachu", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Pikachu", self)
            }
          }
          move "Chupi", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost ()
            attackRequirement {}
            onAttack {
              flip {damage 20}
            }
          }

        };
      case PIKACHU_94:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          pokePower "Electro Recycle", {
            text "Once during your turn (before your attack), if Pichu is anywhere under Pikachu, you may search your discard pile for a [L] Energy card, show it to your opponent, and put it into your hand. This power can’t be used if Pikachu is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert self.getPokemonCards().findAll {it.name.contains("Pichu")} : "Pichu is not found under $self, you can't use this Poké-Power"
              assert my.discard.filterByEnergyType(L) : "There are no [L] Energy cards in your discard pile."
              powerUsed()
              my.discard.filterByEnergyType(L).select().moveTo(my.hand)
            }
          }
          move "BikaBika", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
              flip { damage 10 }
            }
          }

        };
      case REMORAID_95:
        return basic (this, hp:HP060, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Sharpshooting", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 10 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.)"
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10, opp.all.select()
            }
          }
          move "Numbing Water", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, W
            attackRequirement {}
            onAttack {
              damage 20
              flip { apply PARALYZED }
            }
          }

        };
      case SANDSHREW_96:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS10
          resistance L, MINUS20
          move "Sand Attack", {
            text "If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost F
            attackRequirement {}
            onAttack {
              sandAttack(thisMove)
            }
          }
          move "Ram", {
            text "30 damage."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }

        };
      case SEEL_97:
        return basic (this, hp:HP060, type:WATER, retreatCost:2) {
          weakness M, PLUS10
          move "Freezing Headbutt", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 10
              flip { apply PARALYZED }
            }
          }

        };
      case SHINX_98:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          //Rawst Berry: If Shinx is Burned, remove the Special Condition Burned from Shinx at the end of each player’s turn.
          customAbility {
            delayedA {
              before BEGIN_TURN,{
                if(self.isSPC(BURNED)) {
                  bc "Rawst Berry activates"
                  clearSpecialCondition(self, ATTACK, [BURNED])
                }
              }
            }
          }
          move "Plasma", {
            text "10 damage. Flip a coin. If heads, search your discard pile for a [L] Energy card and attach it to Shinx."
            energyCost L, L
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage {
                flip { attachEnergyFrom(type: L, my.discard, self) }
              }
            }
          }

        };
      case SLAKOTH_99:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Drowsy", {
            text "Both Slakoth and the Defending Pokémon are now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              apply ASLEEP, self
              apply ASLEEP
            }
          }

        };
      case SNORUNT_100:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness M, PLUS10
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {}
            onAttack {
              draw 1
            }
          }
          move "Snowball", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost W
            attackRequirement {}
            onAttack {
              flip {damage 20}
            }
          }

        };
      case SNOVER_101:
        return basic (this, hp:HP060, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          move "Curiosity", {
            text "Look at your opponent’s hand."
            energyCost ()
            attackRequirement {
              assert opp.hand : "Opponent has no cards in hand."}
            onAttack {
              opp.hand.showToMe("Opponent's hand")
            }
          }
          move "Snowball Fight", {
            text "30 damage. Flip a coin. If tails, Snover does 10 damage to itself."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
              flip 1, {}, {damage 10, self}
            }
          }

        };
      case SPHEAL_102:
        return basic (this, hp:HP050, type:WATER, retreatCost:2) {
          weakness M, PLUS10
          move "Rollout", {
            text "10 damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Willpower", {
            text "Flip a coin. If heads, during your next turn, Spheal’s Rollout attack’s base damage is 40."
            energyCost W
            attackRequirement {}
            onAttack {
              flip { increasedBaseDamageNextTurn("Rollout",hp(30)) }
            }
          }

        };
      case SPINARAK_103:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Impound", {
            text "The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C
            attackRequirement {}
            onAttack {
              cantRetreat defending
            }
          }
          move "Double Scratch", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads"
            energyCost G, C
            attackRequirement {}
            onAttack {
              flip 2, { damage 20 }
            }
          }

        };
      case SURSKIT_104:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          move "Sleep Inducer", {
            text "Switch 1 of your opponent’s Benched Pokémon with 1 of the Defending Pokémon. The new Defending Pokémon is now Asleep."
            energyCost G
            attackRequirement {
              assert opp.bench
            }
            onAttack {
              sw opp.active, opp.bench.select()
              apply ASLEEP, opp.active
            }
          }

        };
      case TEDDIURSA_105:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Rest", {
            text "Remove all Special Conditions and 2 damage counters from Teddiursa. Teddiursa is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              clearSpecialCondition(self)
              heal 20, self
              apply ASLEEP, self
            }
          }
          move "Sweet Palm", {
            text "30 damage. Before doing damage, remove 1 damage counter from the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              heal 10, opp.active
              damage 30
            }
          }

        };
      case TOTODILE_106:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          move "Bite", {
            text "10 damage. "
            energyCost ()
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Shining Fang", {
            text "10+ damage. If the Defending Pokémon already has any damage counters on it, this attack does 10 damage plus 10 more damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              if (defending.numberOfDamageCounters) damage 10
            }
          }

        };
      case VULPIX_107:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Fire Soul", {
            text "20 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost R, R
            attackRequirement {}
            onAttack {
              damage 20
              if (opp.bench)
                damage 10, opp.bench.select()
            }
          }

        };
      case ZUBAT_108:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          resistance F, MINUS20
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost P
            attackRequirement {}
            onAttack {
              flipThenApplySC CONFUSED
            }
          }
          move "Bite", {
            text "20 damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }

        };
      case BEBE_S_SEARCH_109:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nChoose a card from your hand and put it on top of your deck. Search your deck for a Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward. (If this is the only card in your hand, you can’t play this card.)"
          onPlay {
            my.hand.getExcludedList(thisCard).select(hidden: false, "Choose a card to put back into your deck").moveTo(hidden:true, my.deck)
            my.deck.search(count: 1, cardTypeFilter(POKEMON)).showToOpponent("Opponent's selected Pokémon.").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard) : "You don't have other cards in your hand"
          }
        };
      case DUSK_BALL_110:
        return itemCard (this) {
          text "Look at the 7 cards from the bottom of your deck. Choose 1 Pokémon you find there, show it to your opponent, and put it into your hand. Put the remaining cards back on top of your deck. Shuffle your deck afterward."
          onPlay {
            def deckSize = my.deck.size()
            deck.subList(Math.max(0, deckSize-7),deckSize).select(min:0,"Select a Pokémon card to put to hand",cardTypeFilter(POKEMON)).moveTo(hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "There is no card remaining in your deck."
          }
        };
      case FOSSIL_EXCAVATOR_111:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck or discard pile for a Trainer card that has Fossil in its name or a Stage 1 or Stage 2 Evolution card that evolves from a Fossil. Show it to your opponent and put it into your hand. If you searched your deck, shuffle your deck afterward."
          onPlay {
            def choice = 1
            def chosenCard

            if(my.discard.any{isValidFossilCard(it)}){
              choice = choose([1,2],['Search your deck', 'Search your discard pile'], "Search your deck for a Trainer-Item card that has \"Fossil\" in its name or a Stage 1 or Stage 2 Evolution card that evolves from a Fossil, reveal it, and put it into your hand. Then, shuffle your deck.")
            }

            if (choice == 1){
              chosenCard = my.deck.search(count:1, "Search your deck for a Trainer-Item card that has \"Fossil\" in its name or a Stage 1 or Stage 2 Evolution card that evolves from a Fossil.", {
                if (it.cardTypes.is(STAGE2)){
                  def debug_test = bg.gm().getBasicsFromStage2(it.name)
                  bc "${debug_test}"
                }
                isValidFossilCard(it)
                } )
            } else /*if (choice == 2)*/ {
              chosenCard = my.discard.findAll{isValidFossilCard(it)}.select()
            }

            if (chosenCard)
              chosenCard.showToOpponent("Chosen card").moveTo(my.hand)

            shuffleDeck()
          }
          playRequirement {
            assert ( my.deck.notEmpty || my.discard.any{isValidFossilCard(it)}) : "You have no cards in deck, and there are no cards in your discard pile that satisfy this supporter's requirements."
          }
        };
      case LAKE_BOUNDARY_112:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nApply Weakness for each Pokémon (both yours and your opponent’s) as ×2 instead."
          def eff
          onPlay {
            eff = getter (GET_WEAKNESSES) {h->
              h.object = h.object?.collect {
                def weakness = it.copy()
                weakness.feature = "X2"
                weakness
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case NIGHT_MAINTENANCE_113:
        return itemCard (this) {
          text "Search your discard pile for up to 3 in any combination of Pokémon and basic Energy cards. Show them to your opponent and shuffle them into your deck."
          onPlay {
            //TODO: "Shuffle [up to] x basic pokemon/energy from discard" could be modularized.
            //TODO: Test if min:1 is needed on the select
            def tar = my.discard.findAll{it.cardTypes.is(BASIC_ENERGY) || it.cardTypes.is(POKEMON)}
            def maxSel = Math.min(6,tar.size())
            tar.select(max: maxSel,"Choose up to $maxSel cards to shuffle into your deck").moveTo(my.deck)
            shuffleDeck()
          }
          playRequirement{
            assert my.discard.findAll{it.cardTypes.is(BASIC_ENERGY) || it.cardTypes.is(POKEMON)} : "There are no basic Pokémon or basic Energy cards in your discard pile"
          }
        };
      case QUICK_BALL_114:
        return itemCard (this) {
          text "Reveal cards from your deck until you reveal a Pokémon. Show that Pokémon to your opponent and put it into your hand. Shuffle the other revealed cards back into your deck. (If you don’t reveal a Pokémon, shuffle all the revealed cards back into your deck.)"
          onPlay {
              //TODO: Modularize
              def revealCard = new CardList();
              def ind = 0
              def curCard
              while(ind < my.deck.size()){
                curCard = my.deck.get(ind)
                ind+=1
                revealCard.add(curCard)
                if(curCard.cardTypes.is(POKEMON))
                  break
              }
              revealCard.showToMe("Drawn cards")
              revealCard.showToOpponent("Revealed cards")
              revealCard.clear()
              revealCard.add(curCard)
              revealCard.moveTo(my.hand)
              shuffleDeck()
          }
          playRequirement{
            assert my.deck
          }
        };
      case TEAM_GALACTIC_S_WAGER_115:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nEach player shuffles his or her hand into his or her deck, and you and your opponent play a game of \"Rock-Paper-Scissors.\" The player who wins draws up to 6 cards. The player who loses draws up to 3 cards. (You draw your cards first.)"
          onPlay {
              my.hand.getExcludedList(thisCard).moveTo(hidden:true,my.deck)
              opp.hand.moveTo(hidden:true,opp.deck)
              shuffleDeck()
              shuffleDeck(null, TargetPlayer.OPPONENT)

              def myMaxDraw = 3
              def oppMaxDraw = 3
              rockPaperScissors ({myMaxDraw = 6}, {oppMaxDraw = 6})
              //flip 1, {myMaxDraw = 6}, {oppMaxDraw = 6}

              draw choose(1..myMaxDraw,"How many cards would you like to draw?")
              draw (oppChoose(1..oppMaxDraw,"How many cards would you like to draw?"),TargetPlayer.OPPONENT)
          }
          playRequirement{
          }
        };
      case ARMOR_FOSSIL_116:
        return itemCard (this) {
          text "Play Armor Fossil as if it were a [C] Basic Pokémon. (Armor Fossil counts as a Trainer card as well, but if Armor Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Armor Fossil can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Armor Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\n" +
            "Whenever Armor Fossil would be damaged by your opponent’s attack, flip a coin until you get tails. For each heads, reduce that damage by 10."
          onPlay {
            Card pokemonCard, trainerCard = thisCard
            pokemonCard = basic (new CustomCardInfo(ARMOR_FOSSIL_116).setCardTypes(BASIC, POKEMON), hp:HP050, type:COLORLESS, retreatCost:0) {
              pokeBody "Armor Stone", {
                delayedA {
                  before APPLY_ATTACK_DAMAGES, {
                    if(ef.attacker.owner != self.owner) {
                      bg.dm().each{
                        if(it.to == self && it.notNoEffect && it.dmg.value) {
                          bc "$self - Armor Stone activated"
                          def reducedDmg = 0
                          flipUntilTails { reducedDmg += 10 }
                          if (reducedDmg) bc "Damage reduced by $reducedDmg"
                          it.dmg -= hp(reducedDmg)
                        }
                      }
                    }
                  }
                }
              }
              customAbility {
                def eff, acl
                onActivate{
                  delayed {
                    before RETREAT, self, {
                      if(self.topPokemonCard == thisCard){
                        wcu "Cannot retreat"
                        prevent()
                      }
                    }
                    before APPLY_SPECIAL_CONDITION, {
                      def pcs=e.getTarget(bg)
                      if(pcs==self){
                        bc "Armor Fossil is unaffected by Special Conditions"
                        prevent()
                      }
                    }
                  }
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
                  acl = action("Discard Armor Fossil", [TargetPlayer.SELF]) {
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
            pokemonCard.player = trainerCard.player
            bg.em().run(new ChangeImplementation(pokemonCard, trainerCard))
            hand.remove(pokemonCard)
            benchPCS(pokemonCard)
          }
          playRequirement{
            assert bench.notFull
          }
        };
      case SKULL_FOSSIL_117:
        return itemCard (this) {
          text "Play Skull Fossil as if it were a [C] Basic Pokémon. (Skull Fossil counts as a Trainer card as well, but if Skull Fossil is Knocked Out, this counts as a Knocked Out Pokémon.) Skull Fossil can’t be affected by any Special Conditions and can’t retreat. At any time during your turn before your attack, you may discard Skull Fossil from play. (This doesn’t count as a Knocked Out Pokémon.)\n" +
            "During your opponent’s turn, if Skull Fossil would be Knocked Out by damage from an opponent’s attack, flip a coin until you get tails. For each heads, put 1 damage counter on the Attacking Pokémon."
          onPlay {
            Card pokemonCard, trainerCard = thisCard
            pokemonCard = basic (new CustomCardInfo(SKULL_FOSSIL_117).setCardTypes(BASIC, POKEMON), hp:HP050, type:COLORLESS, retreatCost:0) {
              pokeBody "Skull Stone", {
                delayedA{
                  before KNOCKOUT, self, {
                    if ((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite) {
                      bc "$self - Skull Stone activated"
                      if (self.owner.opposite.pbg.all) {
                        flipUntilTails { directDamage(10, self.owner.opposite.pbg.active, Source.SRC_ABILITY) }
                      }
                    }
                  }
                }
              }
              customAbility {
                def eff, acl
                onActivate{
                  delayed {
                    before RETREAT, self, {
                      if(self.topPokemonCard == thisCard){
                        wcu "Cannot retreat"
                        prevent()
                      }
                    }
                    before APPLY_SPECIAL_CONDITION, {
                      def pcs=e.getTarget(bg)
                      if(pcs==self){
                        bc "Skull Fossil is unaffected by Special Conditions"
                        prevent()
                      }
                    }
                  }
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
                  acl = action("Discard Skull Fossil", [TargetPlayer.SELF]) {
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
            pokemonCard.player = trainerCard.player
            bg.em().run(new ChangeImplementation(pokemonCard, trainerCard))
            hand.remove(pokemonCard)
            benchPCS(pokemonCard)
          }
          playRequirement{
            assert bench.notFull
          }
        };
      case MULTI_ENERGY_118:
        return copy (Sandstorm.MULTI_ENERGY_93, this);
      case DARKNESS_ENERGY_119:
        //TODO: This version of "Darkness Energy (Special Energy)" shouldn't work on "Dark ____" cards, only on [D] Type Pokémon.
        return copy (RubySapphire.DARKNESS_ENERGY_93, this);
      case METAL_ENERGY_120:
        return copy (RubySapphire.METAL_ENERGY_94, this);
      case ELECTIVIRE_LV_X_121:
        return evolution (this, from:"Electivire", hp:HP120, type:LIGHTNING, retreatCost:3) {
          weakness F
          resistance M, MINUS20
          pokeBody "Shocking Tail", {
            text "As long as Electivire is your Active Pokémon, whenever your opponent attaches an Energy card from his or her hand to 1 of his or her Pokémon, put 2 damage counters on that Pokémon."
            delayedA {
              after ATTACH_ENERGY, {
                if(self.active && ef.reason == PLAY_FROM_HAND && ef.resolvedTarget.owner == self.owner.opposite)
                  directDamage 20, ef.resolvedTarget
              }
            }
          }
          move "Pulse Barrier", {
            text "50 damage. Discard all of your opponent’s Pokémon Tool cards and Stadium cards in play. If you do, prevent all effects, including damage, done to Electivire during your opponent’s next turn."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 50
              def cardsDiscarded = 0
              if (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player != self.owner){
                discard bg.stadiumInfoStruct.stadiumCard
                cardsDiscarded += 1
              }
              opp.all.findAll {it.cards.hasType(POKEMON_TOOL)}.each{
                it.cards.filterByType(POKEMON_TOOL).discard()
                cardsDiscarded += 1
              }
              if (cardsDiscarded) preventAllEffectsNextTurn()
            }
          }

        };
      case LUCARIO_LV_X_122:
        return evolution (this, from:"Lucario", hp:HP110, type:FIGHTING, retreatCost:1) {
          weakness P
          pokePower "Stance", {
            text "Once during your turn (before your attack), when you put Lucario LV.X from your hand onto your Active Lucario, you may use this power. Prevent all effects of an attack, including damage, done to Lucario during your opponent’s next turn. (If Lucario is no longer your Active Pokémon, this effect ends.)"
            //Taken from BUS LUCARIO_71, but with switch & devolve removing the effect.
            onActivate {r->
              if(r==PLAY_FROM_HAND && confirm("Use Stance?")){
                powerUsed()
                delayed{
                  before APPLY_ATTACK_DAMAGES, {
                    bg.dm().each{
                      if(it.to == self && it.notNoEffect){
                        bc "Stance prevents all damage"
                        it.dmg=hp(0)
                      }
                    }
                  }
                  before null, self, Source.ATTACK, {
                    if (bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                      bc "Stance prevents effects"
                      prevent()
                    }
                  }
                  after ENERGY_SWITCH, {
                    def efs = (ef as EnergySwitch)
                    if(efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
                      discard efs.card
                    }
                  }
                  unregisterAfter 2
                  after SWITCH, self, {unregister()}
                  after EVOLVE, self, {unregister()}
                }
              }
            }
          }
          move "Close Combat", {
            text "80 damage. During your opponent’s next turn, any damage done to Lucario by attacks is increased by 30 (after applying Weakness and Resistance)."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 80
              //TODO: Modularize?
              delayed {
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.from.owner==self.owner.opposite && it.to==self && it.dmg.value && it.notNoEffect){
                      bc "Close Combat increases damage"
                      it.dmg+=hp(30)
                    }
                  }
                }
                unregisterAfter 2
                after EVOLVE, self, {unregister()}
                after SWITCH, self, {unregister()}
              }
            }
          }

        };
      case MAGMORTAR_LV_X_123:
        return evolution (this, from:"Magmortar", hp:HP130, type:FIRE, retreatCost:3) {
          weakness W
          pokePower "Torrid Wave", {
            text "Once during your turn (before your attack), if Magmortar is your Active Pokémon, you may choose 1 of the Defending Pokémon. That Pokémon is now Burned. Put 3 damage counters instead of 2 on that Pokémon between turns. This power can’t be used if Magmortar is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert self.active : "$self is not your active Pokémon."
              powerUsed()
              def torridWaveRecipient = opp.active
              apply BURNED, torridWaveRecipient, SRC_ABILITY
              delayed {
                def eff
                register {
                  eff = getter (GET_BURN_DAMAGE) {h->
                      if (h.effect.target == torridWaveRecipient && h.effect.target.active && h.object < hp(30)) {
                        bc "Torrid Wave increases burn damage on $torridWaveRecipient to 30."
                        h.object = hp(30)
                      }
                    }
                  }
                unregister {
                  eff.unregister()
                }
                //TODO: Remove if these are not needed.
                // after EVOLVE, torridWaveRecipient, {unregister()}
                // after SWITCH, torridWaveRecipient, {unregister()}
                after CLEAR_SPECIAL_CONDITION, torridWaveRecipient, {
                  if(ef.types.contains(BURNED)){
                    unregister()
                  }
                }
              }
            }
          }
          move "Flame Buster", {
            text "Discard 2 [R] Energy attached to Magmortar. Choose 1 of your opponent’s Pokémon. This attack does 100 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon.) During your next turn, Magmortar can’t use Flame Bluster."
            energyCost R, R, R, R
            attackRequirement {}
            onAttack {
              damage 100, opp.all.select()
              cantUseAttack(thisMove, self)
              afterDamage {
                discardSelfEnergy R,R
              }
            }
          }
        };
      case TIME_SPACE_DISTORTION_124:
        return itemCard (this) {
          text "Flip 3 coins. For each heads, search your discard pile for a Pokémon, show it to your opponent, and put it into your hand."
          onPlay {
            flip 3, {
              def tar = my.discard.filterByType(POKEMON)
              if (tar)
                tar.select("Put a Pokémon from your discard pile into your hand.").moveTo(my.hand)
            }
          }
          playRequirement{
            assert my.discard.filterByType(POKEMON)
          }
        };
      default:
        return null;
    }
  }

}
