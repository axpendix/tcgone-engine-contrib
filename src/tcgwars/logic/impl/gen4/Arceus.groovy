package tcgwars.logic.impl.gen4;

import tcgwars.logic.impl.gen2.Expedition
import tcgwars.logic.impl.gen3.DragonFrontiers;
import tcgwars.logic.impl.gen8.SwordShield;

import tcgwars.logic.effect.gm.PlayTrainer;

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
 * @author ufodynasty12@gmail.com
 */
public enum Arceus implements LogicCardInfo {

  CHARIZARD_1 ("Charizard", "1", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIRE_]),
  FROSLASS_2 ("Froslass", "2", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  HEATRAN_3 ("Heatran", "3", Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  KABUTOPS_4 ("Kabutops", "4", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  LUXRAY_5 ("Luxray", "5", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _LIGHTNING_]),
  MOTHIM_6 ("Mothim", "6", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PROBOPASS_7 ("Probopass", "7", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  SALAMENCE_8 ("Salamence", "8", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  SWALOT_9 ("Swalot", "9", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  TANGROWTH_10 ("Tangrowth", "10", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  TOXICROAK_11 ("Toxicroak", "11", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  ZAPDOS_G_12 ("Zapdos G", "12", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _LIGHTNING_]),
  AERODACTYL_13 ("Aerodactyl", "13", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  BRONZONG_14 ("Bronzong", "14", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  CHERRIM_15 ("Cherrim", "15", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  GENGAR_16 ("Gengar", "16", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  GENGAR_17 ("Gengar", "17", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _PSYCHIC_]),
  GLALIE_18 ("Glalie", "18", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GOLEM_19 ("Golem", "19", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  HARIYAMA_20 ("Hariyama", "20", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  LOPUNNY_21 ("Lopunny", "21", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  MANECTRIC_22 ("Manectric", "22", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  OMASTAR_23 ("Omastar", "23", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  PELIPPER_24 ("Pelipper", "24", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PICHU_25 ("Pichu", "25", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  PORYGON_Z_G_26 ("Porygon-Z G", "26", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _COLORLESS_]),
  RAICHU_27 ("Raichu", "27", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  RAPIDASH_28 ("Rapidash", "28", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  RATICATE_29 ("Raticate", "29", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  SCEPTILE_30 ("Sceptile", "30", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  SCEPTILE_31 ("Sceptile", "31", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  SPIRITOMB_32 ("Spiritomb", "32", Rarity.RARE, [BASIC, POKEMON, _DARKNESS_]),
  BRONZONG_33 ("Bronzong", "33", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  BRONZOR_34 ("Bronzor", "34", Rarity.UNCOMMON, [BASIC, POKEMON, _METAL_]),
  CHARMELEON_35 ("Charmeleon", "35", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  GASTLY_36 ("Gastly", "36", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GRAVELER_37 ("Graveler", "37", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  GROVYLE_38 ("Grovyle", "38", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  GROVYLE_39 ("Grovyle", "39", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  GULPIN_40 ("Gulpin", "40", Rarity.UNCOMMON, [BASIC, POKEMON, _PSYCHIC_]),
  HAUNTER_41 ("Haunter", "41", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  HAUNTER_42 ("Haunter", "42", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  LUXIO_43 ("Luxio", "43", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  MANECTRIC_44 ("Manectric", "44", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  PELIPPER_45 ("Pelipper", "45", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PONYTA_46 ("Ponyta", "46", Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  RAPIDASH_47 ("Rapidash", "47", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  SHELGON_48 ("Shelgon", "48", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  WORMADAM_PLANT_CLOAK_49 ("Wormadam Plant Cloak", "49", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  WORMADAM_SANDY_CLOAK_50 ("Wormadam Sandy Cloak", "50", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  WORMADAM_TRASH_CLOAK_51 ("Wormadam Trash Cloak", "51", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  BAGON_52 ("Bagon", "52", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BEEDRILL_G_53 ("Beedrill G", "53", Rarity.COMMON, [BASIC, POKEMON, POKEMON_SP, _GRASS_]),
  BRONZOR_54 ("Bronzor", "54", Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  BUNEARY_55 ("Buneary", "55", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BURMY_PLANT_CLOAK_56 ("Burmy Plant Cloak", "56", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BURMY_SANDY_CLOAK_57 ("Burmy Sandy Cloak", "57", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BURMY_TRASH_CLOAK_58 ("Burmy Trash Cloak", "58", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHARMANDER_59 ("Charmander", "59", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CHERUBI_60 ("Cherubi", "60", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CROAGUNK_61 ("Croagunk", "61", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  ELECTRIKE_62 ("Electrike", "62", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  ELECTRIKE_63 ("Electrike", "63", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  GASTLY_64 ("Gastly", "64", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  GEODUDE_65 ("Geodude", "65", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  GULPIN_66 ("Gulpin", "66", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  KABUTO_67 ("Kabuto", "67", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  MAKUHITA_68 ("Makuhita", "68", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  NOSEPASS_69 ("Nosepass", "69", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  OMANYTE_70 ("Omanyte", "70", Rarity.COMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  PIKACHU_71 ("Pikachu", "71", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PONYTA_72 ("Ponyta", "72", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  RATTATA_73 ("Rattata", "73", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SHINX_74 ("Shinx", "74", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  SNORUNT_75 ("Snorunt", "75", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  TANGELA_76 ("Tangela", "76", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TANGELA_77 ("Tangela", "77", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TREECKO_78 ("Treecko", "78", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TREECKO_79 ("Treecko", "79", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  WINGULL_80 ("Wingull", "80", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  WINGULL_81 ("Wingull", "81", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  BEGINNING_DOOR_82 ("Beginning Door", "82", Rarity.UNCOMMON, [TRAINER, ITEM]),
  BENCH_SHIELD_83 ("Bench Shield", "83", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  BUFFER_PIECE_84 ("Buffer Piece", "84", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  DEPARTMENT_STORE_GIRL_85 ("Department Store Girl", "85", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ENERGY_RESTORE_86 ("Energy Restore", "86", Rarity.UNCOMMON, [TRAINER, ITEM]),
  EXPERT_BELT_87 ("Expert Belt", "87", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  LUCKY_EGG_88 ("Lucky Egg", "88", Rarity.UNCOMMON, [TRAINER, ITEM, POKEMON_TOOL]),
  OLD_AMBER_89 ("Old Amber", "89", Rarity.COMMON, [TRAINER, ITEM]),
  PROFESSOR_OAK_S_VISIT_90 ("Professor Oak's Visit", "90", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  ULTIMATE_ZONE_91 ("Ultimate Zone", "91", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  DOME_FOSSIL_92 ("Dome Fossil", "92", Rarity.COMMON, [TRAINER, ITEM]),
  HELIX_FOSSIL_93 ("Helix Fossil", "93", Rarity.COMMON, [TRAINER, ITEM]),
  ARCEUS_LV_X_94 ("Arceus Lv.X", "94", Rarity.HOLORARE, [LVL_X, POKEMON, _COLORLESS_]),
  ARCEUS_LV_X_95 ("Arceus Lv.X", "95", Rarity.HOLORARE, [LVL_X, POKEMON, _COLORLESS_]),
  ARCEUS_LV_X_96 ("Arceus Lv.X", "96", Rarity.HOLORARE, [LVL_X, POKEMON, _COLORLESS_]),
  GENGAR_LV_X_97 ("Gengar Lv.X", "97", Rarity.HOLORARE, [LVL_X, POKEMON, _PSYCHIC_]),
  SALAMENCE_LV_X_98 ("Salamence Lv.X", "98", Rarity.HOLORARE, [LVL_X, POKEMON, _COLORLESS_]),
  TANGROWTH_LV_X_99 ("Tangrowth Lv.X", "99", Rarity.HOLORARE, [LVL_X, POKEMON, _GRASS_]),
  BAGON_SH10 ("Bagon", "SH10", Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  PONYTA_SH11 ("Ponyta", "SH11", Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  SHINX_SH12 ("Shinx", "SH12", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  ARCEUS_AR1 ("Arceus", "AR1", Rarity.HOLORARE, [BASIC, POKEMON, _DARKNESS_]),
  ARCEUS_AR2 ("Arceus", "AR2", Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]),
  ARCEUS_AR3 ("Arceus", "AR3", Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  ARCEUS_AR4 ("Arceus", "AR4", Rarity.HOLORARE, [BASIC, POKEMON, _WATER_]),
  ARCEUS_AR5 ("Arceus", "AR5", Rarity.HOLORARE, [BASIC, POKEMON, _COLORLESS_]),
  ARCEUS_AR6 ("Arceus", "AR6", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  ARCEUS_AR7 ("Arceus", "AR7", Rarity.HOLORARE, [BASIC, POKEMON, _PSYCHIC_]),
  ARCEUS_AR8 ("Arceus", "AR8", Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
  ARCEUS_AR9 ("Arceus", "AR9", Rarity.HOLORARE, [BASIC, POKEMON, _METAL_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  Arceus(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.ARCEUS;
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
      case CHARIZARD_1:
        return evolution (this, from:"Charmeleon", hp:HP140, type:FIRE, retreatCost:3) {
          weakness W, PLUS30
          resistance F, MINUS20
          pokeBody "Fire Formation", {
            text "Each of Charizard’s attacks does 10 more damage for each Fire Pokémon on your Bench to your opponent’s Active Pokémon (before applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if (ef.attacker == self) {
                  bg.dm().each {
                    if(it.to.active && it.to.owner!=self.owner && it.notZero){
                      int dmg = 10*my.bench.findAll{it.types.contains(R)}.size()
                      it.dmg+=hp(dmg)
                      if(dmg) bc "Fire Formation +$dmg"
                    }
                  }
                }
              }
            }
          }
          move "Fire Wing", {
            text "30 damage. "
            energyCost R
            onAttack {
              damage 30
            }
          }
          move "Burning Tail", {
            text "80 damage. Discard a Fire Energy attached to Charizard."
            energyCost R, R, C, R
            onAttack {
              damage 80
              discardSelfEnergyAfterDamage R
            }
          }

        };
      case FROSLASS_2:
        return evolution (this, from:"Snorunt", hp:HP080, type:WATER, retreatCost:1) {
          weakness M, PLUS20
          pokePower "Snow Gift", {
            text "Once during your turn, when you play Froslass from your hand to evolve 1 of your Pokémon, you may search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
            onActivate {r->
              if (r==PLAY_FROM_HAND && my.deck && confirm("Use Snow Gift")) {
                powerUsed()
                my.deck.search(min:1,"Search your deck for a card",{true}).moveTo(hidden:true,my.hand)
              }
            }
          }
          move "Ground Frost", {
            text "50 damage. If there is any Stadium Card in play, this attack does nothing."
            energyCost W, C
            attackRequirement {
              assert (bg.stadiumInfoStruct) == null
            }
            onAttack {
              damage 50
            }
          }

        };
      case HEATRAN_3:
        return basic (this, hp:HP100, type:FIRE, retreatCost:3) {
          weakness W
          move "Fire Fang", {
            text "20 damage. The Defending Pokémon is now Burned."
            energyCost R, C
            onAttack {
              damage 20
              applyAfterDamage BURNED
            }
          }
          move "Magma Mantle", {
            text "Discard the top 3 cards of your deck. This attack does 60 damage plus 20 more damage for each [R] or [M] Energy card you discarded."
            energyCost R, R, C, C
            onAttack {
              damage 60
              def top = my.deck.subList(0,3)
              top.filterByType(ENERGY).each {
                if(it.asEnergyCard().containsType(R)||it.asEnergyCard().containsType(M)) {
                  damage 20
                }
              }
              top.discard()
            }
          }

        };
      case KABUTOPS_4:
        return evolution (this, from:"Kabuto", hp:HP130, type:FIGHTING, retreatCost:2) {
          weakness G, PLUS30
          move "Primal Scythe", {
            text "20+ damage. You may discard Helix Fossil, Dome Fossil, or Old Amber from your hand. If you do, this attack does 20 damage plus 50 more damage."
            energyCost F
            onAttack {
              damage 20
              if(my.hand.find{ ["Helix Fossil", "Dome Fossil", "Old Amber"].contains(it.name) } && confirm("Discard a fossil to deal 50 more damage?")) {
                def card = my.hand.select("Discard Helix Fossil, Dome Fossil, or Old Amber",{ ["Helix Fossil", "Dome Fossil", "Old Amber"].contains(it.name) })
                damage 50
                card.discard()
              }
            }
          }
          move "Rock Slide", {
            text "60 damage. Does 10 damage to 2 of your opponent’s Benched Pokémon."
            energyCost F, C, C
            onAttack {
              damage 60
              if (opp.bench) {
                multiSelect(opp.bench, 2, text).each {
                  targeted(it) {
                    damage 10, it
                  }
                }
              }
            }
          }

        };
      case LUXRAY_5:
        return evolution (this, from:"Luxio", hp:HP120, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS30
          resistance M, MINUS20
          move "Flash", {
            text "30 damage. If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, this attack does nothing."
            energyCost L
            onAttack {
              damage 30
              sandAttack(thisMove)
            }
          }
          move "Gadget Bolt", {
            text "60 damage. If Luxray has a Pokémon Tool card attached to it, you may do 100 damage instead of 60 to the Defending Pokémon. If you do, discard that Pokémon Tool card."
            energyCost L, C, C
            onAttack {
              damage 60
              if(self.cards.filterByType(POKEMON_TOOL) && confirm("Discard a Pokémon Tool attached to $self in order to deal 40 more damage?")) {
                damage 40
                afterDamage {
                  self.cards.filterByType(POKEMON_TOOL).select("Choose a Pokémon Tool attached to $self to discard").discard()
                }
              }
            }
          }

        };
      case MOTHIM_6:
        return evolution (this, from:["Burmy","Burmy Plant Cloak","Burmy Sandy Cloak","Burmy Trash Cloak"], hp:HP090, type:GRASS, retreatCost:0) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Cloak Party", {
            text "Search your deck for up to 3 in any combination of Burmy and Wormadam, show them to your opponent, and put them into your hand. Shuffle your deck afterwards."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search(max:3, {it.name.contains("Burmy") || it.name.contains("Wormadam")}).showToOpponent("Cloak Party : Selected cards").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Energy Assist", {
            text "30 damage. Seach your discard pile for a basic Energy card and attach it to 1 of your Benched Pokémon."
            energyCost C
            onAttack {
              damage 30
              afterDamage{
                attachEnergyFrom(basic:true,my.discard,my.bench)
              }
            }
          }

        };
      case PROBOPASS_7:
        return evolution (this, from:"Nosepass", hp:HP100, type:METAL, retreatCost:3) {
          weakness R, PLUS20
          resistance P, MINUS20
          pokeBody "Competitiveness", {
            text "If you don’t have a Supporter card in play, each of Probopass’s attacks does 30 more damage to the Active Pokémon ."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker==self) bg.dm().each {
                  if(it.from==self && it.to.active && it.to.owner!=self.owner && it.dmg.value && bg.em().retrieveObject("last_supporter_play_turn") != bg.turnCount) {
                    it.dmg += hp(30)
                    bc "$thisAbility +30"
                  }
                }
              }
            }
          }
          move "Top Chop", {
            text "30 damage. Draw a card."
            energyCost M, C
            onAttack {
              damage 30
              afterDamage {
                draw 1
              }
            }
          }
          move "Tumbling Attack", {
            text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 30 more damage."
            energyCost M, C, C
            onAttack {
              damage 50
              flip {
                damage 30
              }
            }
          }

        };
      case SALAMENCE_8:
        return evolution (this, from:"Shelgon", hp:HP140, type:COLORLESS, retreatCost:2) {
          weakness C, PLUS30
          resistance F, MINUS20
          pokePower "Top Accelerator", {
            text "Once during your turn , you may reveal the top card of your deck. If that card is a basic Energy card, attach it to 1 of your Pokémon. If that card isn’t a basic Energy card, discard it. This power can’t be used if Salamence is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert my.deck : "Your deck is empty"
              powerUsed()
              def top = my.deck.subList(0,1).first()
              if(top.cardTypes.is(BASIC_ENERGY)) {
                attachEnergy my.all.select("Attach $top to?"), top
              } else {
                discard top
              }
            }
          }
          move "Shoot Through", {
            text "50 damage. Does 20 damage to 1 of your opponent’s Benched Pokémon."
            energyCost R, W, C
            onAttack {
              damage 50
              if(opp.bench) {
                damage 20, opp.bench.select("Does 20 damage to 1 of your opponent's Benched Pokémon")
              }
            }
          }
          move "Dragon Claw", {
            text "70 damage. "
            energyCost C, C, C, C
            onAttack {
              damage 70
            }
          }

        };
      case SWALOT_9:
        return evolution (this, from:"Gulpin", hp:HP100, type:PSYCHIC, retreatCost:3) {
          weakness P, PLUS20
          move "Damage Roller", {
            text "Put damage counters on the Defending Pokémon until the Defending Pokémon has the same remaining HP as Swalot. (If the Defending Pokémon has the same or less remaining HP as Swalot, this attack does nothing.)"
            energyCost P
            attackRequirement {
              assert defending.remainingHP.value - self.remainingHP.value > 0 : "$self doesn't have more remaining hp than the defending $defending"
            }
            onAttack {
              directDamage defending.remainingHP.value - self.remainingHP.value, defending
            }
          }
          move "Entangle Tackle", {
            text "50+ damage. You may do 50 damage plus 30 more damage. If you do, this attack does 30 damage to 1 of your Pokémon, and don’t apply Weakness and Resistance to this damage."
            energyCost P, P, C
            onAttack {
              damage 50
              if(confirm("Do 30 damage to one of your Pokémon in order to do 30 more damage?")) {
                damage 30
                noWrDamage 30, my.all.select("Choose one of your Pokémon")
              }
            }
          }

        };
      case TANGROWTH_10:
        return evolution (this, from:"Tangela", hp:HP110, type:GRASS, retreatCost:3) {
          weakness R, PLUS30
          resistance W, MINUS20
          move "Leaf Guard", {
            text "30 damage. During your opponent's next turn, any damage done to Tangrowth by attacks is reduced by 20."
            energyCost G, C
            onAttack {
              damage 30
              reduceDamageNextTurn(hp(20),thisMove)
            }
          }
          move "Swallow Up", {
            text "50 damage. Before doing damage, count the remaining HP of the Defending Pokémon and Tangrowth. If the Defending Pokémon has fewer remaining HP than Tangrowth’s, this attack does 120 damage instead."
            energyCost G, G, C, C
            onAttack {
              damage 50
              if(defending.remainingHP.value < self.remainingHP.value) {
                damage 70
              }
            }
          }

        };
      case TOXICROAK_11:
        return evolution (this, from:"Croagunk", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS20
          move "Corner", {
            text "20 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost F
            onAttack {
              damage 20
              cantRetreat defending
            }
          }
          move "Convert Blow", {
            text "30+ damage. If Toxicroak has any [P] Energy attached to it, the Defending Pokémon is now Poisoned. If Toxicroak has any [F] Energy attached to it, this attack does 30 damage plus 30 more damage."
            energyCost C, C
            onAttack {
              damage 30
              if(self.cards.energyCount(P)) {
                applyAfterDamage POISONED
              }
              if(self.cards.energyCount(F)){
                damage 30
              }
            }
          }

        };
      case ZAPDOS_G_12:
        return basic (this, hp:HP090, type:LIGHTNING, retreatCost:2) {
          weakness L
          resistance F, MINUS20
          move "Charge Beam", {
            text "10 damage. Flip a coin. If heads, search your discard pile for an Energy card and attach it to Zapdos G."
            energyCost C
            onAttack {
              damage 10
              flip {
                attachEnergyFrom(my.discard,self)
              }
            }
          }
          move "Lightning Strike", {
            text "40 damage. You may discard all [L] Energy attached to Zapdos G. If you do, this attack’s base damage is 80 instead of 40."
            energyCost L, L, C
            onAttack {
              damage 40
              if(confirm("Discard all [L] Energy attached to $self in order to deal 40 more damage?")) {
                damage 40
                afterDamage {
                  discardAllSelfEnergy L
                }
              }
            }
          }

        };
      case AERODACTYL_13:
        return evolution (this, from:"Old Amber", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          pokePower "Unearth", {
            text "Once during your turn , you may search your deck for Helix Fossil, Dome Fossil, or Old Amber, show it your opponent, and put it into your hand. Shuffle your deck afterward. This power can’t be used if Aerodactyl is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.deck : "Your deck is empty"
              powerUsed()
              my.deck.search("Unearth",{ ["Helix Fossil", "Dome Fossil", "Old Amber"].contains(it.name) }).moveTo(my.hand)
            }
          }
          move "Hyper Beam", {
            text "30 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost C, C
            onAttack {
              damage 30
              flip {
                discardDefendingEnergyAfterDamage()
              }
            }
          }

        };
      case BRONZONG_14:
        return evolution (this, from:"Bronzor", hp:HP090, type:METAL, retreatCost:3) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Oracle Arrow", {
            text "Choose 1 of your opponent’s Pokémon that has any damage counters on it. This attack does 40 damage to that Pokémon."
            energyCost M, C
            attackRequirement {
              assert opp.all.find{it.numberOfDamageCounters} : "Your opponent's Pokémon are healthy"
            }
            onAttack {
              damage 40, opp.all.findAll{it.numberOfDamageCounters}.select("Choose 1 of your opponent's Pokémon that has any damage counters on it")
            }
          }
          move "Antigravity", {
            text "60 damage. The Retreat Cost for Bronzong is 0 until the end of your next turn."
            energyCost M, C, C
            onAttack {
              damage 60
              afterDamage {
                delayed {
                  def eff
                  register {
                    eff = getter GET_RETREAT_COST, LAST, self, {h ->
                      h.object = 0
                    }
                  }
                  unregister {
                    eff.unregister()
                  }
                  unregisterAfter 3
                }
              }
            }
          }

        };
      case CHERRIM_15:
        return evolution (this, from:"Cherubi", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          pokeBody "Cloudy Sky", {
            text "If any of your [G] Pokémon or [R] Pokémon would be damaged by an attack, reduce this damage by 10 ."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                if(ef.attacker.owner == self.owner.opposite) {
                  bg.dm().each{
                    if(it.to.owner == self.owner && (it.to.types.contains(G) || it.to.types.contains(R)) && it.notNoEffect && it.dmg.value) {
                      bc "$thisAbility -10"
                      it.dmg -= hp(10)
                    }
                  }
                }
              }
            }
          }
          move "Worry Seed", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost G, C
            onAttack {
              damage 30
              flip {
                applyAfterDamage CONFUSED
              }
            }
          }

        };
      case GENGAR_16:
        return evolution (this, from:"Haunter", hp:HP110, type:PSYCHIC, retreatCost:0) {
          weakness D, PLUS30
          resistance C, MINUS20
          pokePower "Curse", {
            text "Once during your turn , you may move 1 damage counter from 1 of your opponent’s Pokémon to another of your opponent’s Pokémon. This power can’t be used if Gengar is affected by a Special Condition."
            actionA {
              checkLastTurn()
              assert opp.all.findAll{it.numberOfDamageCounters} : "There is are no pokémon with damage counters to move"
              powerUsed()
              def pcs = opp.all.findAll{it.numberOfDamageCounters}.select("Choose the pokémon to move the damage counter from")
              def tar = opp.all.findAll{it != pcs}.select("Select the pokémon to recieve the damage counter")
              pcs.damage-=hp(10)
              directDamage 10, tar, Source.POKEPOWER
              bc "Moved 1 damage counter from $pcs to $tar"
            }
          }
          move "Shadow Skip", {
            text "60 damage. Does 10 damage to 1 of your opponent's Benched Pokémon. You may switch Gengar with 1 of your Benched Pokémon."
            energyCost P, P, C
            onAttack {
              damage 60
              if(opp.bench) {
                damage 10, opp.bench.select()
              }
              afterDamage {
                switchYourActive(may: true)
              }
            }
          }

        };
      case GENGAR_17:
        return evolution (this, from:"Haunter", hp:HP120, type:PSYCHIC, retreatCost:0) {
          weakness D, PLUS30
          resistance C, MINUS20
          move "Sharpshooting", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon."
            energyCost P, C
            onAttack {
              damage 40, opp.all.select("Choose 1 of your opponent's Pokémon")
            }
          }
          move "Poison Jab", {
            text "60 damage. The Defending Pokémon is now Poisoned."
            energyCost P, C, C
            onAttack {
              damage 60
              applyAfterDamage POISONED
            }
          }

        };
      case GLALIE_18:
        return evolution (this, from:"Snorunt", hp:HP090, type:WATER, retreatCost:1) {
          weakness M, PLUS20
          move "Wreck", {
            text "20+ damage. If there is any Stadium card in play, this attack does 20 damage plus 50 more damage. Discard that Stadium card."
            energyCost C, C
            onAttack {
              damage 20
              if (bg.stadiumInfoStruct) {
                damage 50

                afterDamage {
                  discard bg.stadiumInfoStruct.stadiumCard
                }
              }
            }
          }
          move "Avalanche", {
            text "50 damage. Flip a coin. If heads, this attack does 10 damage to each of your opponent’s Benched Pokémon."
            energyCost W, W, C
            onAttack {
              damage 50
              flip {
                opp.bench.each{
                  damage 10, it
                }
              }
            }
          }

        };
      case GOLEM_19:
        return evolution (this, from:"Graveler", hp:HP140, type:FIGHTING, retreatCost:4) {
          weakness G, PLUS30
          resistance L, MINUS20
          move "Lunge Out", {
            text "50 damage. "
            energyCost F, C
            onAttack {
              damage 50
            }
          }
          move "Tumble Down", {
            text "30× damage. Discard as many [F] Energy cards as you like from your hand. This attack does 30 damage times the number of [F] Energy cards you discarded."
            energyCost F, C, C
            attackRequirement {
              assert my.hand.filterByEnergyType(F)
            }
            onAttack {
              def max = my.hand.filterByEnergyType(F).size()
              def cardsToDiscard = my.hand.select(min:0,max:max,"Discard as many [F] Energy cards as you like from your hand",energyFilter(F))
              damage 30 * cardsToDiscard.size()
              afterDamage {
                cardsToDiscard.discard()
              }
            }
          }
          move "Rock Tumble", {
            text "80 damage. This attack’s damage isn’t affected by Resistance."
            energyCost F, F, C, C
            onAttack {
              damage 80
              dontApplyResistance()
            }
          }

        };
      case HARIYAMA_20:
        return evolution (this, from:"Makuhita", hp:HP110, type:FIGHTING, retreatCost:4) {
          weakness P, PLUS30
          move "Push Out", {
            text "50 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost F, C, C
            onAttack {
              damage 50
              whirlwind()
            }
          }
          move "Vortex Chop", {
            text "60 damage. If the Defending Pokémon has any Resistance, this attack’s base damage is 120 instead of 60."
            energyCost F, F, C, C
            onAttack {
              damage 60
              if(defending.resistances) {
                damage 60
              }
            }
          }

        };
      case LOPUNNY_21:
        return evolution (this, from:"Buneary", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS20
          pokePower "Relaxing Shower", {
            text "Once during your turn , you may discard an Energy card from your hand. If you do, remove 1 damage counter from each of your Pokémon. This power can’t be used if Lopunny is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert my.hand.filterByType(ENERGY) : "You have no energy to discard"
              powerUsed()
              my.hand.select("Discard an Energy card", cardTypeFilter(ENERGY)).discard()
              my.all.each {
                heal 10, it
              }
            }
          }
          move "Hover Heal", {
            text "40 damage. Remove all Special Conditions from Lopunny."
            energyCost C, C
            onAttack {
              damage 40
              afterDamage {
                clearSpecialCondition self
              }
            }
          }

        };
      case MANECTRIC_22:
        return evolution (this, from:"Electrike", hp:HP090, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Second Bite", {
            text "20+ damage. Does 20 damage plus 10 more damage for each damage counter on the Defending Pokémon."
            energyCost L, C
            onAttack {
              damage 20 + 10 * defending.numberOfDamageCounters
            }
          }
          move "Swift", {
            text "50 damage. This attack’s damage isn’t affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost L, C, C
            onAttack {
              swiftDamage(50, defending)
            }
          }

        };
      case OMASTAR_23:
        return evolution (this, from:"Omanyte", hp:HP120, type:WATER, retreatCost:1) {
          weakness G, PLUS30
          move "Time Spiral", {
            text "Choose 1 of your opponent’s Evolved Pokémon. Remove the highest Stage Evolution card from that Pokémon and have your opponent shuffle that card into his or her deck."
            energyCost C, C
            attackRequirement {
              assert opp.all.find{it.evolution} : "Your opponent has no evolved Pokémon in play"
            }
            onAttack {
              def pcs = opp.all.findAll{it.evolution}.select("Choose 1 of your opponent's Evolved Pokémon")
              devolve(pcs, pcs.topPokemonCard, opp.deck)
              shuffleDeck(null, TargetPlayer.OPPONENT)
            }
          }
          move "Primal Tentacles", {
            text "30+ damage. Does 30 damage plus 10 more damage for each Helix Fossil, Dome Fossil, and Old Amber in your discard pile."
            energyCost W, C
            onAttack {
              damage 30 + 10 * my.discard.findAll{ ["Helix Fossil", "Dome Fossil", "Old Amber"].contains(it.name) }.size()
            }
          }

        };
      case PELIPPER_24:
        return evolution (this, from:"Wingull", hp:HP090, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Water Pulse", {
            text "30 damage. The Defending Pokémon is now Asleep."
            energyCost W, C
            onAttack {
              damage 30
              applyAfterDamage ASLEEP
            }
          }
          move "Continuous Crush", {
            text "70 damage. Flip a coin until you get tails. For each heads, discard an Energy card attached to the Defending Pokémon."
            energyCost W, W, C, C
            onAttack {
              damage 70
              flipUntilTails {
                discardDefendingEnergyAfterDamage()
              }
            }
          }

        };
      case PICHU_25:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          pokePower "Baby Evolution", {
            text "Once during your turn , you may put Pikachu from your hand onto Pichu (this counts as evolving Pichu) and remove all damage counters from Pichu."
            actionA {
              assert my.hand.findAll{it.name.contains("Pikachu")} : "There is no pokémon in your hand to evolve ${self}."
              checkLastTurn()
              powerUsed()
              def tar = my.hand.findAll { it.name.contains("Pikachu") }.select()
              if (tar) {
                evolve(self, tar.first(), OTHER)
                heal self.numberOfDamageCounters*10, self
              }
            }
          }
          move "Baby Steps", {
            text "Look at the top 5 cards of your deck, choose 1 of them, and put it into your hand. Shuffle the other cards back into your deck."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.subList(0,5).select("Choose a card to put into your hand").moveTo(my.hand)
              shuffleDeck()
            }
          }

        };
      case PORYGON_Z_G_26:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F
          pokePower "Dowsing Code", {
            text "Once during your turn, when you put Porygon-Z from your hand onto your Bench, you may search your discard pile for up to 2 Pokémon Tool cards, show them to your opponent, and shuffle them into your deck."
            onActivate {r->
              if(r==PLAY_FROM_HAND && bg.currentTurn == self.owner && my.discard.filterByType(POKEMON_TOOL) && confirm("Use $thisAbility?")) {
                powerUsed()
                my.discard.select(max:2,"Select up to 2 Pokémon Tool cards").showToOpponent("Selected cards").moveTo(my.deck)
                shuffleDeck()
              }
            }
          }
          move "Ambush", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 40 more damage."
            energyCost C, C, C
            onAttack {
              damage 20
              flip {
                damage 40
              }
            }
          }

        };
      case RAICHU_27:
        return evolution (this, from:"Pikachu", hp:HP090, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Boosted Voltage", {
            text "20 damage. If Raichu has a Pokémon Tool card attached to it, this attack does 20 damage to each of your opponent’s Benched Pokémon that isn’t an Evolved Pokémon."
            energyCost L
            onAttack {
              damage 20
              if(self.cards.filterByType(POKEMON_TOOL) && opp.bench.find{!it.evolution}) {
                opp.bench.findAll{!it.evolution}.each{
                  damage 20, it
                }
              }
            }
          }
          move "Thunder Blast", {
            text "70 damage. Discard a Lightning Energy card attached to Raichu."
            energyCost L, C, C
            onAttack {
              damage 70
              discardSelfEnergyAfterDamage L
            }
          }

        };
      case RAPIDASH_28:
        return evolution (this, from:"Ponyta", hp:HP080, type:FIRE, retreatCost:0) {
          weakness W, PLUS20
          pokeBody "Wild Guard", {
            text "Prevent all effects of attacks, including damage, done to Rapidash by your opponent’s Pokémon SP."
            delayedA {
              before null, self, Source.ATTACK, {
                if (self.owner.opposite.pbg.active.topPokemonCard.cardTypes.is(POKEMON_SP) && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                  bc "$thisAbility prevents effect"
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && it.notNoEffect && it.from.topPokemonCard.cardTypes.is(POKEMON_SP)){
                    it.dmg = hp(0)
                    bc "$thisAbility prevents damage"
                  }
                }
              }
              after ENERGY_SWITCH, {
                def efs = (ef as EnergySwitch)
                if(efs.from.topPokemonCard.cardTypes.is(POKEMON_SP) && efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
                  discard efs.card
                }
              }
            }
          }
          move "Fire Mane", {
            text "20 damage. "
            energyCost R
            onAttack {
              damage 20
            }
          }
          move "Rising Lunge", {
            text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 20 more damage."
            energyCost R, C, C
            onAttack {
              damage 50
              flip {
                damage 20
              }
            }
          }

        };
      case RATICATE_29:
        return evolution (this, from:"Rattata", hp:HP070, type:COLORLESS, retreatCost:0) {
          weakness F, PLUS20
          move "Recruit", {
            text "Look at your opponent’s hand, choose a Supporter card you find there, and discard it. Then, use the effect of that card as the effect of this attack."
            energyCost C
            attackRequirement {
              assert opp.hand : "Your opponent's hand is"
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
              def oppHand = opp.hand.shuffledCopy()
              def card = oppHand.select(min:0, "Select a Supporter to copy its effect as this attack.",cardTypeFilter(SUPPORTER)).discard().first()
              if(card) {
                bg.deterministicCurrentThreadPlayerType=self.owner
                bg.em().run(new PlayTrainer(card))
                bg.clearDeterministicCurrentThreadPlayerType()
              }
            }
          }
          move "Extend Fang", {
            text "20+ damage. If Raticate has a Pokémon Tool card attached to it, this attack does 20 damage plus 40 more damage."
            energyCost C
            onAttack {
              damage 20
              if(self.cards.filterByType(POKEMON_TOOL)) {
                damage 40
              }
            }
          }

        };
      case SCEPTILE_30:
        return evolution (this, from:"Grovyle", hp:HP120, type:GRASS, retreatCost:2) {
          weakness R, PLUS30
          resistance W, MINUS20
          pokeBody "Green Breath", {
            text "When you attach a [G] Energy card from your hand to Sceptile, remove 2 damage counters from Sceptile."
            delayedA {
              after ATTACH_ENERGY, self, {
                if (ef.reason==PLAY_FROM_HAND && ef.card.asEnergyCard().containsType(G)){
                  heal 20, self
                }
              }
            }
          }
          move "Leaf Blast", {
            text "20× damage. Energy attached to Sceptile."
            energyCost G
            attackRequirement {
              assert self.cards.energyCount(G) : "You have no [G] energy attache to $self"
            }
            onAttack {
              damage 20 * self.cards.energyCount(G)
            }
          }
          move "Poison Claws", {
            text "60 damage. The Defending Pokémon is now Poisoned."
            energyCost G, C, C, C
            onAttack {
              damage 60
              applyAfterDamage POISONED
            }
          }

        };
      case SCEPTILE_31:
        return evolution (this, from:"Grovyle", hp:HP130, type:GRASS, retreatCost:1) {
          weakness R, PLUS30
          resistance W, MINUS20
          move "Leaf Supply", {
            text "30 damage. You may attach a basic Energy card from your hand to 1 of your Pokémon."
            energyCost G
            onAttack {
              damage 30
              if(my.hand.filterByType(BASIC_ENERGY)) {
                afterDamage {
                  attachEnergyFrom(basic:true, may:true, my.hand, my.all)
                }
              }
            }
          }
          move "Dual Cut", {
            text "70× damage. Flip 2 coins. This attack does 70 damage times the number of heads."
            energyCost G, C, C
            onAttack {
              flip 2, {
                damage 70
              }
            }
          }

        };
      case SPIRITOMB_32:
        return basic (this, hp:HP060, type:DARKNESS, retreatCost:1) {
          resistance C, MINUS20
          pokeBody "Keystone Seal", {
            text "As long as Spiritomb is your Active Pokémon, each player can’t play any Trainer cards from his or her hand."
            delayedA {
              before PLAY_TRAINER, {
                if(ef.item && self.active) {
                  wcu "$thisAbility prevents playing Trainer cards"
                  prevent()
                }
              }
            }
          }
          move "Darkness Grace", {
            text "Search your deck for a card that evolves from 1 of your Pokémon and put it onto that Pokémon. (This counts as evolving that Pokémon.) If you do, put 1 damage counter on Spiritomb. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              def names = my.all.collect{it.name}
              def sel = deck.search ("Select a Pokémon that evolves from 1 of your Pokémon.", {it.cardTypes.is(EVOLUTION) && names.contains(it.predecessor)}).first()
              if(sel) {
                def pcs = my.all.findAll{it.name == sel.predecessor}.select("Put $sel onto...")
                evolve(pcs, sel, OTHER)
                directDamage 10, self
              }
              shuffleDeck()
            }
          }
          move "Will-o’-the-wisp", {
            text "10 damage. "
            energyCost D
            onAttack {
              damage 10
            }
          }

        };
      case BRONZONG_33:
        return evolution (this, from:"Bronzor", hp:HP090, type:METAL, retreatCost:3) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Wide Laser", {
            text "This attack does 10 damage to each of your opponent’s Pokémon."
            energyCost M
            onAttack {
              opp.all.each{
                damage 10, it
              }
            }
          }
          move "Hyper Beam", {
            text "50 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost C, C, C
            onAttack {
              damage 50
              flip {
                discardDefendingEnergyAfterDamage()
              }
            }
          }

        };
      case BRONZOR_34:
        return basic (this, hp:HP050, type:METAL, retreatCost:2) {
          weakness R, PLUS10
          resistance P, MINUS20
          move "Speed Dive", {
            text "10 damage. "
            energyCost M
            onAttack {
              damage 10
            }
          }
          move "Extrasensory", {
            text "30+ damage. If you have the same number of cards in your hand as your opponent, this attack does 30 damage plus 30 more damage."
            energyCost C, C, C
            onAttack {
              damage 30
              if(my.hand.size() == opp.hand.size()) {
                damage 30
              }
            }
          }

        };
      case CHARMELEON_35:
        return evolution (this, from:"Charmander", hp:HP080, type:FIRE, retreatCost:1) {
          weakness W, PLUS20
          move "Slam", {
            text "30× damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost C, C
            onAttack {
              flip 2, {
                damage 30
              }
            }
          }
          move "Fire Punch", {
            text "50 damage. "
            energyCost R, C, C
            onAttack {
              damage 50
            }
          }

        };
      case GASTLY_36:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D
          resistance C, MINUS20
          move "Lick", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost P
            onAttack {
              damage 10
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
          move "Night Shade", {
            text "10 damage. Does 10 damage to 1 of your opponent’s Benched Pokémon."
            energyCost C, C
            onAttack {
              damage 10
              if(opp.bench) {
                damage 10, opp.bench.select("Does 10 damage to 1 of your opponent's Benched Pokémon")
              }
            }
          }

        };
      case GRAVELER_37:
        return evolution (this, from:"Geodude", hp:HP090, type:FIGHTING, retreatCost:3) {
          weakness G, PLUS20
          resistance L, MINUS20
          move "Tackle", {
            text "30 damage. "
            energyCost C, C
            onAttack {
              damage 30
            }
          }
          move "Double-edge", {
            text "70 damage. Graveler does 10 damage to itself."
            energyCost F, F, C
            onAttack {
              damage 70
              damage 10, self
            }
          }

        };
      case GROVYLE_38:
        return evolution (this, from:"Treecko", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Detect", {
            text "Flip a coin. If heads, prevent all effects of an attack, including damage, done to Grovyle during your opponent’s next turn."
            energyCost C
            onAttack {
              flip {
                preventAllEffectsNextTurn()
              }
            }
          }
          move "Blade Arms", {
            text "30 damage. "
            energyCost G, C
            onAttack {
              damage 30
            }
          }

        };
      case GROVYLE_39:
        return evolution (this, from:"Treecko", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Quick Attack", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost C, C
            onAttack {
              damage 20
              flip {
                damage 10
              }
            }
          }
          move "Cut", {
            text "50 damage. "
            energyCost G, C, C
            onAttack {
              damage 50
            }
          }

        };
      case GULPIN_40:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:2) {
          weakness P, PLUS10
          move "Endure", {
            text "Flip a coin. If heads, during your opponent’s next turn, if Gulpin would be Knocked Out by damage from an attack, Gulpin is not Knocked Out and its remaining HP becomes 10 instead."
            energyCost C
            onAttack {
              flip{
                delayed {
                  before KNOCKOUT, self, {
                    if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite){
                      self.damage = self.fullHP - hp(10)
                      bc "$self endured the hit!"
                      prevent()
                    }
                  }
                  unregisterAfter 2
                  after EVOLVE, self, {unregister()}
                  after DEVOLVE, self, {unregister()}
                  after FALL_BACK, self, {unregister()}
                }
              }
            }
          }
          move "Pound", {
            text "10 damage. "
            energyCost P
            onAttack {
              damage 10
            }
          }

        };
      case HAUNTER_41:
        return evolution (this, from:"Gastly", hp:HP070, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          pokeBody "Hidden Poison", {
            text "If Haunter is your Active Pokémon and is damaged by an opponent’s attack (even if Haunter is Knocked Out), the Attacking Pokémon is now Poisoned."
            ifActiveAndDamagedByAttackBody(delegate) {
              bc "$thisAbility"
              apply POISONED, (ef.attacker as PokemonCardSet), Source.POKEBODY
            }
          }
          move "Tongue Spring", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 20 damage to that Pokémon."
            energyCost P, C
            onAttack {
              damage 20, opp.all.select("Choose 1 of your opponent's Pokémon")
            }
          }

        };
      case HAUNTER_42:
        return evolution (this, from:"Gastly", hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Psyshot", {
            text "20 damage. "
            energyCost P
            onAttack {
              damage 20
            }
          }
          move "Shadow Bind", {
            text "30 damage. The Defending Pokémon can’t retreat during your opponent’s next turn."
            energyCost C, C
            onAttack {
              damage 30
              cantRetreat defending
            }
          }

        };
      case LUXIO_43:
        return evolution (this, from:"Shinx", hp:HP080, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Kick", {
            text "20 damage. "
            energyCost C
            onAttack {
              damage 20
            }
          }
          move "Discharge", {
            text "40× damage. Discard all [L] Energy attached to Luxio. Flip a coin for each Energy [L] card you discarded. This attack does 40 damage times the number of heads."
            energyCost L, C, C
            attackRequirement {
              assert self.cards.energyCount(L) : "You have no [L] Energy attached to $self"
            }
            onAttack {
              flip self.cards.filterByEnergyType(L).size(), {
                damage 40
              }
              afterDamage {
                discardAllSelfEnergy(L)
              }
            }
          }

        };
      case MANECTRIC_44:
        return evolution (this, from:"Electrike", hp:HP090, type:LIGHTNING, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
          move "Tackle", {
            text "20 damage. "
            energyCost C
            onAttack {
              damage 20
            }
          }
          move "Head Bolt", {
            text "60 damage. "
            energyCost L, C, C
            onAttack {
              damage 60
            }
          }

        };
      case PELIPPER_45:
        return evolution (this, from:"Wingull", hp:HP090, type:WATER, retreatCost:2) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Water Ball", {
            text "20+ damage. Does 20 damage plus 10 more damage for each [W] Energy attached to Pelipper."
            energyCost C
            onAttack {
              damage 20 + 10 * self.cards.energyCount(W)
            }
          }
          move "Wing Attack", {
            text "60 damage. "
            energyCost W, C, C
            onAttack {
              damage 60
            }
          }

        };
      case PONYTA_46:
        return basic (this, hp:HP040, type:FIRE, retreatCost:1) {
          weakness W
          move "Ascension", {
            text "Search your deck for a card that evolves from Ponyta and put it onto Ponyta. (This counts as evolving Ponyta.) Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              def nam=self.name
              def tar = my.deck.search("Evolves from $nam", {it.cardTypes.is(EVOLUTION) && nam == it.predecessor})
              if(tar) evolve(self, tar.first(), OTHER)
              shuffleDeck()
            }
          }
          move "Combustion", {
            text "20 damage. "
            energyCost R, C
            onAttack {
              damage 20
            }
          }

        };
      case RAPIDASH_47:
        return evolution (this, from:"Ponyta", hp:HP090, type:FIRE, retreatCost:0) {
          weakness W, PLUS20
          move "Searing Flame", {
            text "10 damage. The Defending Pokémon is now Burned."
            energyCost R
            onAttack {
              damage 10
              applyAfterDamage BURNED
            }
          }
          move "Flare", {
            text "40 damage. "
            energyCost R, C
            onAttack {
              damage 40
            }
          }

        };
      case SHELGON_48:
        return evolution (this, from:"Bagon", hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS20
          move "Scrunch", {
            text "Flip a coin. If heads, prevent all damage done to Shelgon during your opponent’s next turn."
            energyCost C
            onAttack {
              flip {
                preventAllDamageNextTurn()
              }
            }
          }
          move "Dragon Bump", {
            text "40+ damage. If Shelgon has any basic [R] Energy and any basic [W] Energy attached to it, this attack does 40 damage plus 20 more damage."
            energyCost C, C, C
            onAttack {
              damage 40
              if(self.cards.filterByBasicEnergyType(R) && self.cards.filterByBasicEnergyType(W)) {
                damage 20
              }
            }
          }

        };
      case WORMADAM_PLANT_CLOAK_49:
        return evolution (this, from:"Burmy Plant Cloak", hp:HP080, type:GRASS, retreatCost:1) {
          weakness R, PLUS20
          move "Magical Needle", {
            text "20 damage. Remove 2 damage counters from 1 of your Benched Pokémon."
            energyCost G
            onAttack {
              damage 20
              if(my.bench.find{it.numberOfDamageCounters}) {
                heal 20, my.bench.findAll{it.numberOfDamageCounters}.select("Remove 2 damage counters from 1 of your Benched Pokémon")
              }
            }
          }
          move "Cloak Scale", {
            text "50 damage. If you have Wormadam Sandy Cloak in play, the Defending Pokémon is now Burned, Confused, and Poisoned."
            energyCost G, C, C
            onAttack {
              damage 50
              if(my.all.find{it.name == "Wormadam Sandy Cloak"}) {
                applyAfterDamage BURNED
                applyAfterDamage CONFUSED
                applyAfterDamage POISONED
              }
            }
          }

        };
      case WORMADAM_SANDY_CLOAK_50:
        return evolution (this, from:"Burmy Sandy Cloak", hp:HP090, type:FIGHTING, retreatCost:1) {
          weakness R, PLUS20
          resistance L, MINUS20
          move "Hang Down", {
            text "30 damage. "
            energyCost F
            onAttack {
              damage 30
            }
          }
          move "Cloak Headbutt", {
            text "60+ damage. If you have Wormadam Trash Cloak in play, this attack does 60 damage plus 30 more damage."
            energyCost F, C, C
            onAttack {
              damage 60
              if(my.all.find{it.name == "Wormadam Trash Cloak"}) {
                damage 30
              }
            }
          }

        };
      case WORMADAM_TRASH_CLOAK_51:
        return evolution (this, from:"Burmy Trash Cloak", hp:HP090, type:METAL, retreatCost:1) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Cloak Shard", {
            text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. If you have Wormadam Plant Cloak in play, this attack does 40 damage to that Pokémon instead."
            energyCost M
            onAttack {
              def WPC = my.all.find{it.name == 'Wormadam Plant Cloak'}
              damage WPC?40:10, opp.all.select("Choose 1 of your opponent's Pokémon")
            }
          }
          move "Serve Trash", {
            text "30 damage. You may search your opponent’s discard pile for any 1 card, show it to your opponent, and put it on top of his or her deck."
            energyCost C, C
            onAttack {
              damage 30
              afterDamage {
                if(opp.discard) {
                  opp.discard.select("Select a card to put on top of your opponent's deck").showToOpponent("Selected cards").moveTo(addToTop:true, opp.deck)
                }
              }
            }
          }

        };
      case BAGON_52:
        return basic (this, hp:HP060, type:COLORLESS, retreatCost:1) {
          weakness C, PLUS10
          move "Smash Kick", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Super Singe", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Burned."
            energyCost R, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage BURNED
              }
            }
          }

        };
      case BEEDRILL_G_53:
        return basic (this, hp:HP080, type:GRASS, retreatCost:1) {
          weakness R
          move "Raid", {
            text "10 damage. If you playd Beedrill G from your hand during this turn, this attack’s base damage is 40 instead of 10."
            energyCost G
            onAttack {
              damage 10
              if(self.lastEvolved == bg.turnCount){
                damage 30
              }
            }
          }
          move "Fury Attack", {
            text "30× damage. Flip 3 coins. This attack does 30 damage times the number of heads."
            energyCost G, C, C
            onAttack {
              flip 3, {
                damage 30
              }
            }
          }

        };
      case BRONZOR_54:
        return basic (this, hp:HP060, type:METAL, retreatCost:2) {
          weakness R, PLUS10
          resistance P, MINUS20
          move "Hypnosis", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost M
            onAttack {
              damage 10
              flip {
                applyAfterDamage ASLEEP
              }
            }
          }
          move "Spinning Attack", {
            text "20 damage. "
            energyCost C, C
            onAttack {
              damage 20
            }
          }

        };
      case BUNEARY_55:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness F, PLUS10
          move "Bunny Hop", {
            text "Choose 1 of your opponent’s Pokémon that doesn’t have any damage counters on it. This attack does 20 damage to that Pokémon."
            energyCost C
            attackRequirement {
              assert opp.all.find{!it.numberOfDamageCounters} : "All of you opponent's Pokémon have damage counters on them"
            }
            onAttack {
              damage 20, opp.all.findAll{!it.numberOfDamageCounters}.select("Choose 1 of your opponent's Pokémon that doesn't have any damage counters on it")
            }
          }

        };
      case BURMY_PLANT_CLOAK_56:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          pokeBody "Cloak Evolution", {
            text "Burmy Trash Cloak can evolve during the turn you play it."
            delayedA {
              before PREVENT_EVOLVE, self, null, EVOLVE_STANDARD, {
                if (bg.currentTurn == self.owner){
                  powerUsed()
                  prevent()
                }
              }
            }
          }
          move "Tackle", {
            text "20 damage. "
            energyCost G, C
            onAttack {
              damage 20
            }
          }

        };
      case BURMY_SANDY_CLOAK_57:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          pokeBody "Cloak Evolution", {
            text "Burmy Sandy Cloak can evolve during the turn you play it."
            delayedA {
              before PREVENT_EVOLVE, self, null, EVOLVE_STANDARD, {
                if (bg.currentTurn == self.owner){
                  powerUsed()
                  prevent()
                }
              }
            }
          }
          move "Tackle", {
            text "20 damage. "
            energyCost F, C
            onAttack {
              damage 20
            }
          }

        };
      case BURMY_TRASH_CLOAK_58:
        return basic (this, hp:HP040, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          pokeBody "Cloak Evolution", {
            text "Burmy Trash Cloak can evolve during the turn you play it."
            delayedA {
              before PREVENT_EVOLVE, self, null, EVOLVE_STANDARD, {
                if (bg.currentTurn == self.owner){
                  powerUsed()
                  prevent()
                }
              }
            }
          }
          move "Tackle", {
            text "20 damage. "
            energyCost M, C
            onAttack {
              damage 20
            }
          }

        };
      case CHARMANDER_59:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Call for Friends", {
            text "Search your deck for a [R] Basic Pokémon, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is emtpy"
            }
            onAttack {
              my.deck.search("Search your deck for a Basic [R] Pokémon",{it.cardTypes.is(BASIC) && it.asPokemonCard().types.contains(R)}).showToOpponent("Selected cards").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Steady Firebreathing", {
            text "20 damage. "
            energyCost R, C
            onAttack {
              damage 20
            }
          }

        };
      case CHERUBI_60:
        return basic (this, hp:HP050, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Ram", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Solarbeam", {
            text "20 damage. "
            energyCost G, C
            onAttack {
              damage 20
            }
          }

        };
      case CROAGUNK_61:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:1) {
          weakness P, PLUS10
          move "Astonish", {
            text "Choose 1 card from your opponent’s hand without looking. Look at that card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost C
            onAttack {
              astonish()
            }
          }
          move "Punch", {
            text "30 damage. "
            energyCost F, C
            onAttack {
              damage 30
            }
          }

        };
      case ELECTRIKE_62:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Zap Kick", {
            text "10 damage. "
            energyCost L
            onAttack {
              damage 10
            }
          }
          move "Thunder Jolt", {
            text "30 damage. Flip a coin. If tails, Electrike does 10 damage to itself."
            energyCost L, C
            onAttack {
              damage 30
              flip 1, {}, {
                damage 10, self
              }
            }
          }

        };
      case ELECTRIKE_63:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Bite", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }

        };
      case GASTLY_64:
        return basic (this, hp:HP050, type:PSYCHIC, retreatCost:1) {
          weakness D
          resistance C, MINUS20
          move "Gnaw", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Suffocating Gas", {
            text "20 damage. "
            energyCost P, C
            onAttack {
              damage 20
            }
          }

        };
      case GEODUDE_65:
        return basic (this, hp:HP060, type:FIGHTING, retreatCost:2) {
          weakness G, PLUS10
          resistance L, MINUS20
          move "Stone Barrage", {
            text "10× damage. Flip a coin until you get tails. This attack does 10 damage times the number of heads."
            energyCost F
            onAttack {
              flipUntilTails {
                damage 10
              }
            }
          }

        };
      case GULPIN_66:
        return basic (this, hp:HP060, type:PSYCHIC, retreatCost:1) {
          weakness P, PLUS10
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is emtpy"
            }
            onAttack {
              draw 1
            }
          }
          move "Drool", {
            text "20 damage. "
            energyCost P, C
            onAttack {
              damage 20
            }
          }

        };
      case KABUTO_67:
        return evolution (this, from:"Dome Fossil", hp:HP080, type:FIGHTING, retreatCost:1) {
          weakness G, PLUS20
          move "Fast Evolution", {
            text "Search your deck for up to 2 Evolution cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is emtpty"
            }
            onAttack {
              my.deck.search(max:2,"Search your deck for up to 2 Evolution cards",cardTypeFilter(EVOLUTION)).showToOpponent("Selected cards").moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Speed Attack", {
            text "30 damage. "
            energyCost F, C
            onAttack {
              damage 30
            }
          }

        };
      case MAKUHITA_68:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:2) {
          weakness P, PLUS10
          move "Sand Attack", {
            text "If the Defending Pokémon tries to attack during your opponent’s next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost C
            onAttack {
              sandAttack(thisMove)
            }
          }
          move "Magnum Punch", {
            text "30 damage. "
            energyCost F, C
            onAttack {
              damage 30
            }
          }

        };
      case NOSEPASS_69:
        return basic (this, hp:HP070, type:FIGHTING, retreatCost:1) {
          weakness W, PLUS10
          move "Harden", {
            text "During your opponent’s next turn, if Nosepass would be damaged by an attack, prevent that attack’s damage done to Nosepass if that damage is 30 or less."
            energyCost C
            onAttack {
              delayed{
                before APPLY_ATTACK_DAMAGES, {
                  bg.dm().each {
                    if(it.to == self && it.dmg.value <= 30 && it.notNoEffect) {
                      bc "Harden prevent those damage"
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
          move "Knock Away", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost F, C
            onAttack {
              damage 20
              flip {
                damage 10
              }
            }
          }

        };
      case OMANYTE_70:
        return evolution (this, from:"Helix Fossil", hp:HP080, type:WATER, retreatCost:1) {
          weakness G, PLUS20
          move "Collect", {
            text "Draw 3 cards."
            energyCost W
            attackRequirement {
              assert my.deck
            }
            onAttack {
              draw 3
            }
          }
          move "Tickle", {
            text "20 damage. Flip a coin. If heads, the Defendign Pokémon is now Paralyzed."
            energyCost C, C
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case PIKACHU_71:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Pika Ball", {
            text "10 damage. "
            energyCost L
            onAttack {
              damage 10
            }
          }
          move "Mega Shot", {
            text "Energy attached to Pikachu and then choose 1 of your opponent’s Pokémon. This attack does 40 damage to that Pokémon."
            energyCost L, C, C
            onAttack {
              discardAllSelfEnergy L
              damage 40, opp.all.select()
            }
          }

        };
      case PONYTA_72:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          move "Tackle", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Stomp", {
            text "10 damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost R, C
            onAttack {
              damage 10
              flip {
                damage 20
              }
            }
          }

        };
      case RATTATA_73:
        return basic (this, hp:HP030, type:COLORLESS, retreatCost:0) {
          weakness F, PLUS10
          move "Lunge", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            onAttack {
              flip {
                damage 30
              }
            }
          }

        };
      case SHINX_74:
        return basic (this, hp:HP060, type:LIGHTNING, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Gnaw", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Swagger", {
            text "20 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost C, C
            onAttack {
              damage 20
              flip {
                discardDefendingEnergyAfterDamage()
              }
            }
          }

        };
      case SNORUNT_75:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness M, PLUS10
          move "Ice Breath", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            onAttack {
              flip {
                apply PARALYZED
              }
            }
          }
          move "Double Headbutt", {
            text "20× damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost W, C
            onAttack {
              flip 2, {
                damage 20
              }
            }
          }

        };
      case TANGELA_76:
        return basic (this, hp:HP070, type:GRASS, retreatCost:2) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Absorb", {
            text "10 damage. Remove 1 damage counter from Tangela."
            energyCost C
            onAttack {
              damage 10
              heal 10, self
            }
          }
          move "Sleep Powder", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost G, C
            onAttack {
              damage 20
              applyAfterDamage ASLEEP
            }
          }

        };
      case TANGELA_77:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Collect", {
            text "Draw a card."
            energyCost C
            attackRequirement {
              assert my.deck
            }
            onAttack {
              draw 1
            }
          }
          move "Stun Spore", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost G, C, C
            onAttack {
              damage 30
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }

        };
      case TREECKO_78:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Tail Crush", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost C, C
            onAttack {
              damage 20
              flip {
                damage 10
              }
            }
          }

        };
      case TREECKO_79:
        return basic (this, hp:HP060, type:GRASS, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Pound", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Slash", {
            text "20 damage. "
            energyCost G, C
            onAttack {
              damage 20
            }
          }

        };
      case WINGULL_80:
        return basic (this, hp:HP040, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Glide", {
            text "10 damage. "
            energyCost C
            onAttack {
              damage 10
            }
          }
          move "Slashing Strike", {
            text "30 damage. During your next turn, Wingull can’t use Slashing Strike."
            energyCost W, C
            onAttack {
              damage 30
              cantUseAttack(thisMove,self)
            }
          }

        };
      case WINGULL_81:
        return basic (this, hp:HP050, type:WATER, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Rain Splash", {
            text "20 damage. "
            energyCost W
            onAttack {
              damage 20
            }
          }

        };
      case BEGINNING_DOOR_82:
        return basicTrainer (this) {
          text "Search your deck for Arceus, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
          onPlay {
            my.deck.search("Search your deck for Arceus",{it.name == "Arceus"}).showToOpponent("Arceus").moveTo(my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "Your deck is emtpy"
          }
        };
      case BENCH_SHIELD_83:
        return pokemonTool (this) {
          text "Attach Bench Shield to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nAs long as the Pokémon this card is attached to is on your Bench, prevent all damage done to that Pokémon by attacks (both yours and your opponent’s)."
          def eff
          onPlay {
            eff = delayed {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(!self.active && it.to == self && it.dmg.value && it.notNoEffect){
                    bc "Bench Shield prevents all damage"
                    it.dmg=hp(0)
                  }
                }
              }
            }
          }
          onRemoveFromPlay {
            eff.unregister()
          }
        };
      case BUFFER_PIECE_84:
        return copy (DragonFrontiers.BUFFER_PIECE_72, this);
      case DEPARTMENT_STORE_GIRL_85:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card.\nSearch your deck for up to 3 Pokémon Tool cards, show them to your opponent, and put them into your hand. Shuffle your deck afterward."
          onPlay {
            my.deck.search(max:3,"Search your deck for up to 3 Pokémon Tool cards",cardTypeFilter(POKEMON_TOOL)).showToOpponent("Selected cards").moveTo(my.hand)
          }
          playRequirement{
            assert my.deck : "Your deck is empty"
          }
        };
      case ENERGY_RESTORE_86:
        return copy (Expedition.ENERGY_RESTORE_141, this);
      case EXPERT_BELT_87:
        return pokemonTool (this) {
          text "Attach Expert Belt to 1 of your Pokémon that doesn’t already have a Pokémon Tool attached to it. If that Pokémon is Knocked Out, discard this card.\nThe Pokémon this card is attached to gets +20 HP and that Pokémon’s attacks do 20 more damage to your opponent’s Active Pokémon (before applying Weakness and Resistance). When the Pokémon this card is attached to is Knocked Out, your opponent takes 1 more Prize card."
          def eff1, eff2, effPrize
          onPlay {
            eff1 = getter (GET_FULL_HP, self) {h->
              h.object += hp(20)
            }
            eff2 = delayed {
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker==self) bg.dm().each {
                  if(it.from==self && it.to.active && it.to.owner!=self.owner && it.dmg.value){
                    it.dmg += hp(20)
                    bc "Expect Belt +20"
                  }
                }
              }
            }
            effPrize = getter GET_GIVEN_PRIZES, self, {holder->
              bc "Expert Belt increases prizes taken by one."
              holder.object += 1
            }
          }
          onRemoveFromPlay {
            eff1.unregister()
            eff2.unregister()
            effPrize.unregister()
          }
        };
      case LUCKY_EGG_88:
        return copy(SwordShield.LUCKY_EGG_167, this);
      case OLD_AMBER_89:
        return copy(MajesticDawn.OLD_AMBER_84, this);
      case PROFESSOR_OAK_S_VISIT_90:
        return copy(SecretWonders.PROFESSOR_OAK_S_VISIT_122, this);
      case ULTIMATE_ZONE_91:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can’t play this card.\nDuring each player’s turn, the player may move an Energy card attached to 1 of his or her Benched Pokémon to his or her Active Arceus as often as he or she likes."
          def lastTurn=0
          def actions=[]
          onPlay {
            actions=action("Stadium: Ultimate Zone") {
              assert my.active.name == "Arceus" : "Arceus is not active"
              assert my.bench.find{it.cards.filterByType(ENERGY)}: "No energy to move"
              bc "Used Ultimate Zone"
              def src = my.bench.findAll{it.cards.filterByType(ENERGY)}.select("Move energy from which Pokémon")
              def card = src.cards.select("Move which energy",cardTypeFilter(ENERGY)).first()
              energySwitch(src, my.active, card)
            }
          }
          onRemoveFromPlay{
            actions.each { bg().gm().unregisterAction(it) }
          }
        };
      case DOME_FOSSIL_92:
        return copy(MajesticDawn.DOME_FOSSIL_89, this);
      case HELIX_FOSSIL_93:
        return copy(MajesticDawn.HELIX_FOSSIL_91, this);
      case ARCEUS_LV_X_94:
        return levelUp (this, from:"Arceus", hp:HP120, type:COLORLESS, retreatCost:1) {
          pokeBody "Multitype", {
            text "Arceus LV.X‘s type is the same type as its previous Level."
            getterA GET_POKEMON_TYPE, self, { h->
              h.object.clear()
              h.object.addAll(self.getTopNonLevelUpPokemonCard().types)
            }
          }
          pokeBody "Omniscient", {
            text "Arceus can use the attacks of all Arceus you have in play as its own."
            metronomeA delegate, { self.owner.pbg.bench.findAll { it.name == "Arceus" } }
          }
          // text "You may have as many of this card in your deck as you like."
        };
      case ARCEUS_LV_X_95:
        return levelUp (this, from:"Arceus", hp:HP120, type:COLORLESS, retreatCost:1) {
          pokeBody "Multitype", {
            text "Arceus LV.X‘s type is the same type as its previous Level."
            getterA GET_POKEMON_TYPE, self, { h->
              h.object.clear()
              h.object.addAll(self.getTopNonLevelUpPokemonCard().types)
            }
          }
          move "Meteor Blast", {
            text "100 damage. Flip a coin. If tails, this attack’s base damage is 50 instead of 100."
            energyCost G, R, C
            onAttack {
              damage 50
              flip {
                damage 50
              }
            }
          }
          // text "You may have as many of this card in your deck as you like."
        };
      case ARCEUS_LV_X_96:
        return levelUp (this, from:"Arceus", hp:HP120, type:COLORLESS, retreatCost:1) {
          pokeBody "Multitype", {
            text "Arceus LV.X‘s type is the same type as its previous Level."
            getterA GET_POKEMON_TYPE, self, { h->
              h.object.clear()
              h.object.addAll(self.getTopNonLevelUpPokemonCard().types)
            }
          }
          move "Psychic Bolt", {
            text "100 damage. Discard a [L] Energy and a [P] Energy attached to Arceus."
            energyCost L, P, C
            onAttack {
              damage 100
              discardSelfEnergyAfterDamage L, P
            }
          }
        };
      case GENGAR_LV_X_97:
        return levelUp (this, from:"Gengar", hp:HP140, type:PSYCHIC, retreatCost:0) {
          weakness D
          resistance C, MINUS20
          pokePower "Level-Down", {
            text "Once during your turn, you may choose 1 of your opponent’s Pokémon LV.X. Remove the Level-Up card from that Pokémon and have your opponent shuffle the card into his or her deck. The power can’t be used if Gengar is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert opp.all.find{it.topPokemonCard.cardTypes.is(LVL_X)} : "Your opponent has no Pokémon LV.X in play"
              powerUsed()
              def pcs = opp.all.findAll{it.topPokemonCard.cardTypes.is(LVL_X)}.select("Choose a Pokémon LV.X")
              def card = pcs.topPokemonCard
              def blocked = bg.em().run(new MoveCard(card, opp.deck));
              if (!blocked) {
                if (all.contains(pcs)) {
                  bc "$card Leveled Down"
                  bg.em().run(new RemoveFromPlay(pcs, new CardList(card)));
                  bg.em().run(new CantEvolve(pcs, bg().getTurnCount()));
                  bg.em().run(new Devolve(pcs));
                }
                shuffleDeck()
              }
            }
          }
          move "Compound Pain", {
            text "This attack does 30 damage to each of your opponent’s Pokémon that already has damage counters on it."
            energyCost P, P, C
            attackRequirement {
              assert opp.all.find{it.numberOfDamageCounters} : "Your opponent's Pokémon are healthy"
            }
            onAttack {
              opp.all.findAll{it.numberOfDamageCounters}.each{
                damage 30, it
              }
            }
          }
        };
      case SALAMENCE_LV_X_98:
        return levelUp (this, from:"Salamence", hp:HP160, type:COLORLESS, retreatCost:2) {
          weakness C
          resistance F, MINUS20
          pokePower "Double Fall", {
            text "Once during your turn , when you put Salamence LV. X from your hand onto your Active Salamence, you may use this power. For each of your opponent’s Pokémon that is Knocked Out by damage from Salamence’s attacks this turn, take 1 more Prize card."
            onActivate{r->
              if(r==PLAY_FROM_HAND && confirm("Use Double Fall?")){
                powerUsed()
                delayed {
                  def flag = false
                  before ATTACK_MAIN, {
                    flag = ef.attacker==self
                  }
                  def eff
                  register {
                    eff = getter GET_GIVEN_PRIZES, BEFORE_LAST, {Holder holder ->
                      def pcs = holder.effect.target
                      if ( flag && holder.object > 0 && pcs.owner != self.owner && pcs.KOBYDMG == bg.turnCount ) {
                        bc "$thisAbility gives the player an additional prize."
                        holder.object += 1
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
          }
          move "Steam Blast", {
            text "100 damage. Discard an Energy card attached to Salamence."
            energyCost R, W, C, C
            onAttack {
              damage 100
              discardSelfEnergyAfterDamage()
            }
          }
        };
      case TANGROWTH_LV_X_99:
        return levelUp (this, from:"Tangrowth", hp:HP130, type:GRASS, retreatCost:3) {
          weakness R
          resistance W, MINUS20
          pokePower "Healing Growth", {
            text "Once during your turn , you may flip a coin. If heads, remove 4 damage counters from 1 of your Pokémon. This power can’t be used if Tangrowth is affected by a Special Condition."
            actionA {
              checkNoSPC()
              checkLastTurn()
              assert my.all.find{it.numberOfDamageCounters} : "Your Pokémon are healthy"
              powerUsed()
              flip {
                heal 40, my.all.findAll{it.numberOfDamageCounters}.select("Remove 4 damage counters from 1 of your Pokémon")
              }
            }
          }
          move "Big Growth", {
            text "Search your discard for as many [G] Energy cards as you like and attach them to your Pokémon in any way you like."
            energyCost G
            attackRequirement {
              assert my.discard.filterByBasicEnergyType(G) : "You have no [G] Energy in your discard"
            }
            onAttack {
              def max = my.discard.filterByBasicEnergyType(G).size()
              def cards = my.discard.select(min:0,max:max,"Search your discard for as many [G] Energy cards as you like",basicEnergyFilter(G))
              cards.each {
                attachEnergy(my.all.select("Attach $it to?"), it)
              }
            }
          }
        };
      case BAGON_SH10:
        return basic (this, hp:HP050, type:COLORLESS, retreatCost:1) {
          weakness C
          pokeBody "Star Barrier", {
            text "As long as Bagon has any Energy attached to it, Bagon has no Weakness."
            getterA GET_WEAKNESSES, self, { h ->
              if (self.cards.filterByType(ENERGY)) {
                h.object.clear()
              }
            }
          }
          move "Dragon Rage", {
            text "40 damage. Flip 2 coins. If either of them is tails, this attack does nothing."
            energyCost C
            onAttack {
              flip 2, {}, {}, [2:{ damage 40 }]
            }
          }

        };
      case PONYTA_SH11:
        return basic (this, hp:HP060, type:FIRE, retreatCost:1) {
          weakness W, PLUS10
          pokeBody "Star Barrier", {
            text "As long as Ponyta has any Energy attached to it, Ponyta has no Weakness."
            getterA GET_WEAKNESSES, self, { h ->
              if (self.cards.filterByType(ENERGY)) {
                h.object.clear()
              }
            }
          }
          move "Blue Fire", {
            text "50 damage. Discard all [R] Energy attached to Ponyta."
            energyCost R, R
            onAttack {
              damage 50
              afterDamage {
                discardAllSelfEnergy(R)
              }
            }
          }

        };
      case SHINX_SH12:
        return basic (this, hp:HP050, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          pokeBody "Star Barrier", {
            text "As long as Shinx has any Energy attached to it, Shinx has no Weakness."
            getterA GET_WEAKNESSES, self, { h ->
              if (self.cards.filterByType(ENERGY)) {
                h.object.clear()
              }
            }
          }
          move "Payback", {
            text "10+ damage. If your opponent has only 1 Prize card left, this attack does 10 damage plus 30 more damage."
            energyCost L
            onAttack {
              damage 10
              if (opp.prizeCardSet.size() == 1) {
                damage 30
              }
            }
          }

        };
      case ARCEUS_AR1:
        return basic (this, hp:HP070, type:DARKNESS, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Prize Count", {
            text "20+ damage. If you have more Prize cards left than your opponent, this attack does 20 damage plus 60 more damage"
            energyCost D, C
            onAttack {
              damage 20
              if(my.prizeCardSet.size() > opp.prizeCardSet.size()) {
                damage 60
              }
            }
          }

        };
      case ARCEUS_AR2:
        return basic (this, hp:HP090, type:GRASS, retreatCost:2) {
          weakness R
          resistance W, MINUS20
          move "Leaf Refresh", {
            text "30 damage. Remove 3 damage counters from each of your Benched Pokémon."
            energyCost G, C
            onAttack {
              damage 30
              if(my.bench) {
                my.bench.each {
                  heal 30, it
                }
              }
            }
          }

        };
      case ARCEUS_AR3:
        return basic (this, hp:HP080, type:FIRE, retreatCost:1) {
          weakness W
          move "Bright Flame", {
            text "80 damage. Flip a coin. If tails, discard 2 Energy attached to Arceus."
            energyCost R, C, C
            onAttack {
              damage 80
              flip 1, {}, {
                discardSelfEnergyAfterDamage C, C
              }
            }
          }

        };
      case ARCEUS_AR4:
        return basic (this, hp:HP090, type:WATER, retreatCost:2) {
          weakness L
          move "Fastwave", {
            text "50 damage. This attack’s damage isn’t affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost W, C, C
            onAttack {
              swiftDamage 50, defending
            }
          }

        };
      case ARCEUS_AR5:
        return basic (this, hp:HP080, type:COLORLESS, retreatCost:1) {
          weakness F
          move "Ripple Swell", {
            text "If you have 6 Arceus in play and each of them is a different type, search your deck for up to 6 basic Energy cards. Attach each of those Energy cards to a different Pokémon you have in play. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.all.findAll{it.name == "Arceus"}.size() == 6 : "You don't have 6 Arceus in play"
              def allDifferentTypes = true
              TypeSet typeSet = new TypeSet()
              my.all.findAll {it.name == "Arceus"}.each {
                if (typeSet.containsAny(it.topPokemonCard.types)) {
                  allDifferentTypes = false
                }
                typeSet.addAll(it.topPokemonCard.types)
              }
              assert allDifferentTypes : "Not all of your Arceuses are different types"
              assert my.deck : "Your deck is emtpy"
            }
            onAttack {
              def validTargets = my.all
              my.deck.search(max:6,"Search your deck for up to 6 basic Energy cards",cardTypeFilter(BASIC_ENERGY)).each{
                def pcs = validTargets.select("Attaach $it to")
                attachEnergy(pcs, it)
                validTargets.remove(pcs)
              }
              shuffleDeck()
            }
          }
          move "Sky Spear", {
            text "Choose 1 of your opponent’s Pokémon. This attack does 80 damage to that Pokémon. (Don’t apply Weakness and Resistance for Benched Pokémon). Remove all Energy cards attached to Arceus and put them in the Lost Zone."
            energyCost C, C, C
            onAttack {
              damage 80, opp.all.select("Choose 1 of your opponent's Pokémon")
              afterDamage {
                self.cards.filterByType(ENERGY).moveTo(my.lostZone)
              }
            }
          }

        };
      case ARCEUS_AR6:
        return basic (this, hp:HP070, type:LIGHTNING, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Lightning Turn", {
            text "30 damage. Switch Arceus with 1 of your Benched Pokémon."
            energyCost L, C
            onAttack {
              damage 30
              afterDamage {
                switchYourActive()
              }
            }
          }

        };
      case ARCEUS_AR7:
        return basic (this, hp:HP080, type:PSYCHIC, retreatCost:1) {
          weakness P
          move "Mind Bend", {
            text "40 damage. The Defending Pokémon is now Confused."
            energyCost P, C, C
            onAttack {
              damage 40
              applyAfterDamage CONFUSED
            }
          }

        };
      case ARCEUS_AR8:
        return basic (this, hp:HP080, type:FIGHTING, retreatCost:2) {
          weakness W
          resistance L, MINUS20
          move "Break Ground", {
            text "60 damage. Does 10 damage to each of your Benched Pokémon."
            energyCost F, C, C
            onAttack {
              damage 60
              if(my.bench) {
                my.bench.each{
                  damage 10, it
                }
              }
            }
          }

        };
      case ARCEUS_AR9:
        return basic (this, hp:HP090, type:METAL, retreatCost:2) {
          weakness R
          resistance P, MINUS20
          move "Metal Barrier", {
            text "40 damage. Prevent all effects of attacks, including damage done to Arceus by Pokémon LV.X during your opponent’s next turn."
            energyCost M, C, C
            onAttack {
              damage 40
              preventAllEffectsFromCustomPokemonNextTurn(thisMove, self, {it.topPokemonCard.cardTypes.is(LVL_X)})
            }
          }

        };
      default:
        return null;
    }
  }

}
