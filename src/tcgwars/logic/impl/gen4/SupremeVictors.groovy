package tcgwars.logic.impl.gen4

import tcgwars.logic.DamageManager
import tcgwars.logic.effect.Source
import tcgwars.logic.effect.basic.DirectDamage
import tcgwars.logic.effect.basic.ResolvedDamage;

import static tcgwars.logic.card.HP.*;
import static tcgwars.logic.card.Type.*;
import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.effect.Source.POKEPOWER;
import static tcgwars.logic.groovy.TcgBuilders.*;
import static tcgwars.logic.groovy.TcgStatics.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.effect.EffectType.*;
import static tcgwars.logic.effect.Source.*;
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.special.SpecialConditionType.*
import static tcgwars.logic.card.Resistance.ResistanceType.*
import static tcgwars.logic.card.Weakness.*
import tcgwars.logic.effect.basic.Knockout;

import tcgwars.logic.card.*
import tcgwars.logic.util.*;

/**
 * @author axpendix@hotmail.com
 */
public enum SupremeVictors implements LogicCardInfo {

  ABSOL_G_1 ("Absol G", "1", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _DARKNESS_]),
  BLAZIKEN_FB_2 ("Blaziken FB", "2", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _FIRE_]),
  DRIFBLIM_FB_3 ("Drifblim FB", "3", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  ELECTIVIRE_FB_4 ("Electivire FB", "4", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _LIGHTNING_]),
  GARCHOMP_5 ("Garchomp", "5", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  MAGMORTAR_6 ("Magmortar", "6", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  METAGROSS_7 ("Metagross", "7", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _METAL_]),
  RAYQUAZA_C_8 ("Rayquaza C", "8", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _COLORLESS_]),
  REGIGIGAS_FB_9 ("Regigigas FB", "9", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _COLORLESS_]),
  RHYPERIOR_10 ("Rhyperior", "10", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _FIGHTING_]),
  STARAPTOR_FB_11 ("Staraptor FB", "11", Rarity.HOLORARE, [BASIC, POKEMON, POKEMON_SP, _COLORLESS_]),
  SWAMPERT_12 ("Swampert", "12", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _WATER_]),
  VENUSAUR_13 ("Venusaur", "13", Rarity.HOLORARE, [STAGE2, EVOLUTION, POKEMON, _GRASS_]),
  YANMEGA_14 ("Yanmega", "14", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  ARCANINE_G_15 ("Arcanine G", "15", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _FIRE_]),
  ARTICUNO_16 ("Articuno", "16", Rarity.RARE, [BASIC, POKEMON, _WATER_]),
  BUTTERFREE_FB_17 ("Butterfree FB", "17", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _GRASS_]),
  CAMERUPT_18 ("Camerupt", "18", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  CAMERUPT_G_19 ("Camerupt G", "19", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _FIRE_]),
  CHARIZARD_G_20 ("Charizard G", "20", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _FIRE_]),
  CHIMECHO_21 ("Chimecho", "21", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  CLAYDOL_22 ("Claydol", "22", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  CRAWDAUNT_G_23 ("Crawdaunt G", "23", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _DARKNESS_]),
  DEWGONG_24 ("Dewgong", "24", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  DODRIO_25 ("Dodrio", "25", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  DUSKNOIR_FB_26 ("Dusknoir FB", "26", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  EMPOLEON_FB_27 ("Empoleon FB", "27", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _WATER_]),
  EXPLOUD_28 ("Exploud", "28", Rarity.RARE, [STAGE2, EVOLUTION, POKEMON, _COLORLESS_]),
  HONCHKROW_29 ("Honchkrow", "29", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _DARKNESS_]),
  LICKILICKY_C_30 ("Lickilicky C", "30", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _COLORLESS_]),
  LUCARIO_C_31 ("Lucario C", "31", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _FIGHTING_]),
  LUNATONE_32 ("Lunatone", "32", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  MAWILE_33 ("Mawile", "33", Rarity.RARE, [BASIC, POKEMON, _METAL_]),
  MEDICHAM_34 ("Medicham", "34", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  MILOTIC_C_35 ("Milotic C", "35", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _WATER_]),
  MOLTRES_36 ("Moltres", "36", Rarity.RARE, [BASIC, POKEMON, _FIRE_]),
  MR__MIME_37 ("Mr. Mime", "37", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  PARASECT_38 ("Parasect", "38", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  PRIMEAPE_39 ("Primeape", "39", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  ROSERADE_C_40 ("Roserade C", "40", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  SABLEYE_G_41 ("Sableye G", "41", Rarity.RARE, [BASIC, POKEMON, POKEMON_SP, _DARKNESS_]),
  SANDSLASH_42 ("Sandslash", "42", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  SEAKING_43 ("Seaking", "43", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  SHEDINJA_44 ("Shedinja", "44", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  SOLROCK_45 ("Solrock", "45", Rarity.RARE, [BASIC, POKEMON, _PSYCHIC_]),
  SPINDA_46 ("Spinda", "46", Rarity.RARE, [BASIC, POKEMON, _COLORLESS_]),
  WAILORD_47 ("Wailord", "47", Rarity.RARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  ZAPDOS_48 ("Zapdos", "48", Rarity.RARE, [BASIC, POKEMON, _LIGHTNING_]),
  ALTARIA_C_49 ("Altaria C", "49", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _COLORLESS_]),
  ARCANINE_50 ("Arcanine", "50", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIRE_]),
  BIBAREL_51 ("Bibarel", "51", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  BRELOOM_52 ("Breloom", "52", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  CARNIVINE_53 ("Carnivine", "53", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  CHATOT_G_54 ("Chatot G", "54", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _COLORLESS_]),
  CHERRIM_55 ("Cherrim", "55", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  DRAGONITE_FB_56 ("Dragonite FB", "56", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _COLORLESS_]),
  DRIFBLIM_57 ("Drifblim", "57", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _PSYCHIC_]),
  FLOATZEL_58 ("Floatzel", "58", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  GABITE_59 ("Gabite", "59", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  GARCHOMP_C_60 ("Garchomp C", "60", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _COLORLESS_]),
  HIPPOPOTAS_61 ("Hippopotas", "61", Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  IVYSAUR_62 ("Ivysaur", "62", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  LOPUNNY_63 ("Lopunny", "63", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  LOUDRED_64 ("Loudred", "64", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  MAGMAR_65 ("Magmar", "65", Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  MANECTRIC_G_66 ("Manectric G", "66", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _LIGHTNING_]),
  MARSHTOMP_67 ("Marshtomp", "67", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MASQUERAIN_68 ("Masquerain", "68", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  METANG_69 ("Metang", "69", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _METAL_]),
  MILOTIC_70 ("Milotic", "70", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  MINUN_71 ("Minun", "71", Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MURKROW_72 ("Murkrow", "72", Rarity.UNCOMMON, [BASIC, POKEMON, _DARKNESS_]),
  NINJASK_73 ("Ninjask", "73", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  NUMEL_74 ("Numel", "74", Rarity.UNCOMMON, [BASIC, POKEMON, _FIRE_]),
  PINSIR_75 ("Pinsir", "75", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  PLUSLE_76 ("Plusle", "76", Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  RAICHU_77 ("Raichu", "77", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _LIGHTNING_]),
  RATICATE_G_78 ("Raticate G", "78", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _COLORLESS_]),
  RELICANTH_79 ("Relicanth", "79", Rarity.UNCOMMON, [BASIC, POKEMON, _FIGHTING_]),
  RHYDON_80 ("Rhydon", "80", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _FIGHTING_]),
  ROSERADE_81 ("Roserade", "81", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _GRASS_]),
  ROTOM_82 ("Rotom", "82", Rarity.UNCOMMON, [BASIC, POKEMON, _LIGHTNING_]),
  SKARMORY_FB_83 ("Skarmory FB", "83", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _METAL_]),
  SPIRITOMB_C_84 ("Spiritomb C", "84", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _PSYCHIC_]),
  STARAVIA_85 ("Staravia", "85", Rarity.UNCOMMON, [STAGE1, EVOLUTION, POKEMON, _COLORLESS_]),
  TOGEKISS_C_86 ("Togekiss C", "86", Rarity.UNCOMMON, [BASIC, POKEMON, POKEMON_SP, _COLORLESS_]),
  WAILMER_87 ("Wailmer", "87", Rarity.UNCOMMON, [BASIC, POKEMON, _WATER_]),
  YANMA_88 ("Yanma", "88", Rarity.UNCOMMON, [BASIC, POKEMON, _GRASS_]),
  BALTOY_89 ("Baltoy", "89", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  BELDUM_90 ("Beldum", "90", Rarity.COMMON, [BASIC, POKEMON, _METAL_]),
  BIDOOF_91 ("Bidoof", "91", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  BUIZEL_92 ("Buizel", "92", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  BULBASAUR_93 ("Bulbasaur", "93", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  BUNEARY_94 ("Buneary", "94", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHATOT_95 ("Chatot", "95", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  CHERUBI_96 ("Cherubi", "96", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CHIMCHAR_97 ("Chimchar", "97", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  CHINGLING_98 ("Chingling", "98", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  COMBEE_99 ("Combee", "99", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  CORPHISH_100 ("Corphish", "100", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  CROAGUNK_101 ("Croagunk", "101", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  DODUO_102 ("Doduo", "102", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  DRIFLOON_103 ("Drifloon", "103", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  FEEBAS_104 ("Feebas", "104", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  GEODUDE_105 ("Geodude", "105", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  GIBLE_106 ("Gible", "106", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  GOLDEEN_107 ("Goldeen", "107", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  GROWLITHE_108 ("Growlithe", "108", Rarity.COMMON, [BASIC, POKEMON, _FIRE_]),
  KRICKETOT_109 ("Kricketot", "109", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  MAGIKARP_110 ("Magikarp", "110", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  MAGNEMITE_111 ("Magnemite", "111", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  MANKEY_112 ("Mankey", "112", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  MEDITITE_113 ("Meditite", "113", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MEOWTH_114 ("Meowth", "114", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  MIME_JR__115 ("Mime Jr.", "115", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  MUDKIP_116 ("Mudkip", "116", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  NINCADA_117 ("Nincada", "117", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PACHIRISU_118 ("Pachirisu", "118", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PARAS_119 ("Paras", "119", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  PIKACHU_120 ("Pikachu", "120", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  PIPLUP_121 ("Piplup", "121", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  RHYHORN_122 ("Rhyhorn", "122", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  ROSELIA_123 ("Roselia", "123", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SANDSHREW_124 ("Sandshrew", "124", Rarity.COMMON, [BASIC, POKEMON, _FIGHTING_]),
  SEEL_125 ("Seel", "125", Rarity.COMMON, [BASIC, POKEMON, _WATER_]),
  SHINX_126 ("Shinx", "126", Rarity.COMMON, [BASIC, POKEMON, _LIGHTNING_]),
  SHROOMISH_127 ("Shroomish", "127", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  SKORUPI_128 ("Skorupi", "128", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  STARLY_129 ("Starly", "129", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  SURSKIT_130 ("Surskit", "130", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  TURTWIG_131 ("Turtwig", "131", Rarity.COMMON, [BASIC, POKEMON, _GRASS_]),
  WHISMUR_132 ("Whismur", "132", Rarity.COMMON, [BASIC, POKEMON, _COLORLESS_]),
  ZUBAT_133 ("Zubat", "133", Rarity.COMMON, [BASIC, POKEMON, _PSYCHIC_]),
  BATTLE_TOWER_134 ("Battle Tower", "134", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  CHAMPION_S_ROOM_135 ("Champion's Room", "135", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  CYNTHIA_S_GUIDANCE_136 ("Cynthia's Guidance", "136", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  CYRUS_S_INITIATIVE_137 ("Cyrus's Initiative", "137", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  NIGHT_TELEPORTER_138 ("Night Teleporter", "138", Rarity.UNCOMMON, [TRAINER, ITEM]),
  PALMER_S_CONTRIBUTION_139 ("Palmer's Contribution", "139", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  VS_SEEKER_140 ("VS Seeker", "140", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ABSOL_G_LV_X_141 ("Absol G Lv.X", "141", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _DARKNESS_]),
  BLAZIKEN_FB_LV_X_142 ("Blaziken FB Lv.X", "142", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _FIRE_]),
  CHARIZARD_G_LV_X_143 ("Charizard G Lv.X", "143", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _FIRE_]),
  ELECTIVIRE_FB_LV_X_144 ("Electivire FB Lv.X", "144", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _LIGHTNING_]),
  GARCHOMP_C_LV_X_145 ("Garchomp C Lv.X", "145", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _COLORLESS_]),
  RAYQUAZA_C_LV_X_146 ("Rayquaza C Lv.X", "146", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _COLORLESS_]),
  STARAPTOR_FB_LV_X_147 ("Staraptor FB Lv.X", "147", Rarity.HOLORARE, [LVL_X, POKEMON, POKEMON_SP, _COLORLESS_]),
  ARTICUNO_148 ("Articuno", "148", Rarity.ULTRARARE, [BASIC, POKEMON, _WATER_]),
  MOLTRES_149 ("Moltres", "149", Rarity.HOLORARE, [BASIC, POKEMON, _FIRE_]),
  ZAPDOS_150 ("Zapdos", "150", Rarity.HOLORARE, [BASIC, POKEMON, _LIGHTNING_]),
  MILOTIC_SH7 ("Milotic", "SH7", Rarity.HOLORARE, [STAGE1, EVOLUTION, POKEMON, _WATER_]),
  RELICANTH_SH8 ("Relicanth", "SH8", Rarity.HOLORARE, [BASIC, POKEMON, _FIGHTING_]),
  YANMA_SH9 ("Yanma", "SH9", Rarity.HOLORARE, [BASIC, POKEMON, _GRASS_]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  SupremeVictors(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.SUPREME_VICTORS;
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
      case ABSOL_G_1:
        return basic (this, hp:HP070, type:D, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          move "Feint Attack", {
            text "Choose 1 of your opponent's Pokémon. This attack does 20 damage to that Pokémon. This attack's damage isn't affected by Weakness, Resistance, Poké-Powers, Poké-Bodies, or any other effects on that Pokémon."
            energyCost D
            attackRequirement {}
            onAttack {
              swiftDamage 20, opp.all.select()
            }
          }
          move "Doom News", {
            text "Return all Energy cards attached to Absol G to your hand. The Defending Pokémon is Knocked Out at the end of your opponent's next turn."
            energyCost D, C, C
            attackRequirement {
              self.cards.filterByType(ENERGY).moveTo(my.hand)
              def pcs = defending
              targeted (pcs) {
                bc "At the end of ${pcs.owner}'s next turn, $pcs will be Knocked Out. (This effect can be removed by benching/evolving $pcs)"
                delayed {
                  before BETWEEN_TURNS, {
                    if(turnCount + 1 <= bg.turnCount){
                      if(all.contains(pcs)){
                        bc "Doom News kicks in"
                        new Knockout(pcs).run(bg)
                      }
                    }
                  }
                  unregisterAfter 2
                  after FALL_BACK, pcs, {unregister()}
                  after EVOLVE, pcs, {unregister()}
                  after DEVOLVE, pcs, {unregister()}
                }
              }
            }
            onAttack {}
          }
        };
      case BLAZIKEN_FB_2:
        return basic (this, hp:HP080, type:R, retreatCost:1) {
          weakness W
          move "Luring Flame", {
            text "Switch the Defending Pokémon with 1 of your opponent's Benched Pokémon. The new Defending Pokémon is now Burned."
            energyCost R
            attackRequirement {
              assert opp.bench : "Your opponent has no Benched Pokémon"
            }
            onAttack {
              def target = opp.bench.select("Switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon.")
              if ( sw2(target) ) { apply BURNED, target }
            }
          }
          move "Vapor Kick", {
            text "30+ damage. If your opponent has any [W] Pokémon in play, this attack does 30 damage plus 30 more damage."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 30
              if(opp.all.find{it.types.contains(W)}) {
                damage 30
              }
            }
          }
        };
      case DRIFBLIM_FB_3:
        return basic (this, hp:HP080, type:P, retreatCost:2) {
          weakness D
          resistance C, MINUS20
          pokeBody "Pump Up", {
            text "If your opponent has 3 or less Prize cards left, Drifblim FB gets +40 HP."
            delayedA {
              getterA GET_FULL_HP, self, {h->
                if(self.owner.opposite.pbg.prizeCardSet.size() <= 3) {
                  h.object += hp(40)
                }
              }
            }
          }
          move "Shadow Ball", {
            text "Choose 1 of your opponent's Benched Pokémon. This attack does 40 damage to that Pokémon. Apply Weakness and Resistance."
            energyCost P, C, C
            attackRequirement {
              assert opp.bench : "Your opponent has no Benched Pokémon"
            }
            onAttack {
              def pcs = opp.all.select()
              new ResolvedDamage(hp(40), self, pcs, ATTACK, DamageManager.DamageFlag.FORCE_WEAKNESS_RESISTANCE).run(bg)
              bg.dm().applyWeakness()
              bg.dm().applyResistance()
              def damage = bg.dm().getTotalDamage(self, pcs)
              bg.dm().clearDamages()
              bg.em().run(new DirectDamage(damage, pcs))
            }
          }
        };
      case ELECTIVIRE_FB_4:
        return basic (this, hp:HP090, type:L, retreatCost:3) {
          weakness F
          resistance M, MINUS20
          move "Dump and Draw", {
            text "Discard up to 2 Energy cards from your hand. For each card you discarded, draw 2 cards."
            energyCost C
            attackRequirement {
              assert my.hand.filterByType(ENERGY) : "You have no Energy cards in your hand"
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              def energyCards = my.hand.select(min:0,max:2,text,cardTypeFilter(ENERGY))
              draw 2 * energyCards.size()
              energyCards.discard()
            }
          }
          move "Electric Current", {
            text "40 damage. Move a [L] Energy card attached to Electivire FB to 1 of your Benched Pokémon."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 40
              afterDamage {
                if(my.bench && self.cards.energyCount(L)) {
                  def energyCard = self.cards.select("Choose a [L] Energy to move",energyFilter(L)).fist()
                  def tar = my.bench.select("Move $energyCard to which Pokémon?")
                  energySwitch(self,tar,energyCard)
                }
              }
            }
          }
        };
      case GARCHOMP_5:
        return evolution (this, from:"Gabite", hp:HP130, type:C, retreatCost:null) {
          weakness C, '+30'
          pokeBody "Dragon Intimidation", {
            text "If Garchomp is your Active Pokémon and is damaged by an opponent's attack (even if Garchomp is Knocked Out), choose an Energy card attached to the Attacking Pokémon and put it into your opponent's hand."
            ifActiveAndDamagedByAttackBody(delegate), {
              if (ef.attacker.cards.filterByType(ENERGY)) {
                bc "Dragon Intimidation Activates"
                ef.attacker.cards.select("Select an Energy to move to the Opponent's hand", cardTypeFilter(ENERGY), self.owner).moveTo(ef.attacker.owner.pbg.hand)
              }
            }
          }
          move "Guard Claw", {
            text "40 damage. During your opponent's next turn, any damage done to Garchomp by attacks is reduced by 20 (after applying Weakness and Resistance)."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 40
              reduceDamageNextTurn(hp(20),thisMove)
            }
          }
          move "Speed Impact", {
            text "120- damage. Does 120 damage minus 20 damage for each Energy attached to the Defending Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 120 - 20 * defending.cards.energyCount(C)
            }
          }
        };
      case MAGMORTAR_6:
        return evolution (this, from:"Magmar", hp:HP110, type:R, retreatCost:2) {
          weakness W, '+30'
          pokePower "Evolutionary Flame", {
            text "Once during your turn, when you play Magmortar from your hand to evolve 1 of your Pokémon, you may use this power. Your opponent's Active Pokémon is now Burned and Confused."
            onActivate {r->
              if (r==PLAY_FROM_HAND && confirm('Use Evolutionary Flame?')) {
                powerUsed()
                apply BURNED, opp.active, POKEPOWER
                apply CONFUSED, opp.active, POKEPOWER
              }
            }
          }
          move "Fire Arrow", {
            text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 30, opp.all.select()
            }
          }
          move "Flame Ball", {
            text "60 damage. You may move a [R] Energy card attached to Magmortar to 1 of your Benched Pokémon."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 60
              if(self.cards.energyCount(R) && my.bench && confirm("MOve a [R] Energy card attached to $self to 1 of yoru Benched Pokémon")) {
                def energyCard = self.cards.select("Choose a [L] Energy to move",energyFilter(L)).fist()
                def tar = my.bench.select("Move $energyCard to which Pokémon?")
                energySwitch(self,tar,energyCard)
              }
            }
          }
        };
      case METAGROSS_7:
        return evolution (this, from:"Metang", hp:HP130, type:M, retreatCost:3) {
          weakness R, '+30'
          resistance P, MINUS20
          pokeBody "Gravitation", {
            text "Each Pokémon in play (both yours and your opponent's) gets -20 HP. No more than 20 HP can be reduced by all Gravitation Poké-Bodies."
            delayedA {
            }
          }
          move "Geo Impact", {
            text "60 damage. If you have a Stadium card in play, this attack does 20 damage to each of your opponent's Benched Pokémon that is the same type as the Defending Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
        };
      case RAYQUAZA_C_8:
        return basic (this, hp:HP100, type:C, retreatCost:3) {
          weakness C
          resistance F, MINUS20
          move "Trash Burst", {
            text "10+ damage. You may discard up to 5 Energy cards from your hand. If you do, this attack does 10 damage plus 10 more damage for each Energy card you discarded."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Twister", {
            text "50 damage. Flip 2 coins. If both are tails, this attack does nothing. For each heads, discard an Energy attached to the Defending Pokémon."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case REGIGIGAS_FB_9:
        return basic (this, hp:HP100, type:C, retreatCost:4) {
          weakness F
          move "Drain Punch", {
            text "30 damage. Remove from Regigigas FB a number of damage counters equal to the amount of Energy attached to the Defending Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Rainbow Lariat", {
            text "20x damage. Does 20 damage times the number of different types of Pokémon SP you have in play."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case RHYPERIOR_10:
        return evolution (this, from:"Rhydon", hp:HP140, type:F, retreatCost:4) {
          weakness W, '+30'
          resistance L, MINUS20
          move "Raging Drill", {
            text "30+ damage. Does 30 damage plus 10 more damage for each damage counter on Rhyperior."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Deep Scrap", {
            text "60 damage. If the Defending Pokémon would be Knocked Out by this attack, discard the top 3 cards from your opponent's deck."
            energyCost F, F, C, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
        };
      case STARAPTOR_FB_11:
        return basic (this, hp:HP080, type:C, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Whirlwind", {
            text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case SWAMPERT_12:
        return evolution (this, from:"Marshtomp", hp:HP130, type:W, retreatCost:2) {
          weakness G, '+30'
          pokeBody "Root Protector", {
            text "Any damage done to Swampert by attacks from your opponent's Pokémon that isn't an Evolved Pokémon is reduced by 20 (after applying Weakness and Resistance)."
            delayedA {
            }
          }
          move "Drag Off", {
            text "30 damage. Before doing damage, you may switch your opponent's Active Pokémon with 1 of his or her Benched Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Push Over", {
            text "60+ damage. Does 60 damage plus 10 more damage for each [F] Energy attached to Swampert."
            energyCost W, C, C, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
        };
      case VENUSAUR_13:
        return evolution (this, from:"Ivysaur", hp:HP140, type:G, retreatCost:4) {
          weakness R, '+40'
          pokeBody "Green Aroma", {
            text "Remove all Special Conditions from each of your [G] Pokémon. Each of your [G] Pokémon can't be affected by any Special Conditions."
            delayedA {
            }
          }
          move "Desperate Pollen", {
            text "30 damage. If Venusaur already has 8 or more damage counters on it, the Defending Pokémon is now Burned, Confused, and Poisoned."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Special Reaction", {
            text "40+ damage. If the Defending Pokémon is affected by any Special Conditions, this attack does 40 damage plus 40 more damage for each of those Special Conditions."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case YANMEGA_14:
        return evolution (this, from:"Yanma", hp:HP100, type:G, retreatCost:null) {
          weakness L, '+20'
          resistance F, MINUS20
          pokePower "Speed Boost", {
            text "Once during your turn (before your attack), if Yanmega is your Active Pokémon, you may search your discard pile for a [G] Energy card and attach it to Yanmega. This power can't be used if Yanmega is affected by a Special Condition."
            actionA {
            }
          }
          move "Wind Return", {
            text "20+ damage. You may return all [G] Energy attached to Yanmega to your hand. If you do, this attack does 20 damage plus 20 more damage for each Energy card you returned."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Speed Dive", {
            text "70 damage. "
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 70
            }
          }
        };
      case ARCANINE_G_15:
        return basic (this, hp:HP090, type:R, retreatCost:2) {
          weakness W
          pokeBody "Extreme Speed", {
            text "Arcanine G‘s Retreat Cost is [C] less for each [R] Energy attached to Arcanine G."
            delayedA {
            }
          }
          move "Overrun", {
            text "40 damage. Does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case ARTICUNO_16:
        return basic (this, hp:HP100, type:W, retreatCost:2) {
          weakness M, '+30'
          resistance F, MINUS20
          move "Sharp Beak", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Ice Beam", {
            text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case BUTTERFREE_FB_17:
        return basic (this, hp:HP090, type:G, retreatCost:1) {
          weakness R
          resistance F, MINUS20
          pokeBody "Compound Eyes", {
            text "If your opponent's Active Pokémon has any Poké-Bodies, each of Butterfree FB‘s attacks does 30 more damage to the Active Pokémon (before applying Weakness and Resistance)."
            delayedA {
            }
          }
          move "Select Powder", {
            text "30 damage. Choose either Burned or Poisoned. The Defending Pokémon is now affected by that Special Condition."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case CAMERUPT_18:
        return evolution (this, from:"Numel", hp:HP120, type:R, retreatCost:4) {
          weakness W, '+30'
          move "Moving Fire", {
            text "30 damage. You may move a [R] Energy card attached to 1 of your Benched Pokémon to Camerupt."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Volcanic Crash", {
            text "100 damage. Flip 3 coins. For each tails, discard the top card of your deck. Ignore this effect if your opponent has any [W] Pokémon in play."
            energyCost R, R, C, C
            attackRequirement {}
            onAttack {
              damage 100
            }
          }
        };
      case CAMERUPT_G_19:
        return basic (this, hp:HP100, type:R, retreatCost:3) {
          weakness W
          move "Searing Flame", {
            text "20 damage. The Defending Pokémon is now Burned."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Earth Power", {
            text "60 damage. Flip 2 coins. This attack does 10 damage times the number of heads to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
        };
      case CHARIZARD_G_20:
        return basic (this, hp:HP100, type:R, retreatCost:3) {
          weakness W
          resistance F, MINUS20
          move "Flame Jet", {
            text "Flip a coin. If heads, this attack does 40 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost R, C
            attackRequirement {}
            onAttack {}
          }
          move "Heat Blast", {
            text "50 damage. "
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case CHIMECHO_21:
        return basic (this, hp:HP070, type:P, retreatCost:1) {
          weakness P, '+20'
          move "Heal Bell", {
            text "Remove 3 damage counters from each of your Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Super Psywave", {
            text "Choose 1 of your opponent's Pokémon. Count the amount of Energy attached to that Pokémon. Put that many damage counters on the Pokémon."
            energyCost P
            attackRequirement {}
            onAttack {}
          }
        };
      case CLAYDOL_22:
        return evolution (this, from:"Baltoy", hp:HP090, type:P, retreatCost:1) {
          weakness P, '+20'
          move "Antique Magic", {
            text "Put 3 damage counters on any Pokémon (both yours and your opponent's) in any way you like."
            energyCost C, C
            attackRequirement {}
            onAttack {}
          }
          move "Synchro Attack", {
            text "30 damage. If the Defending Pokémon has the same remaining HP as Claydol, this attack's base damage is 90 instead of 30."
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case CRAWDAUNT_G_23:
        return basic (this, hp:HP080, type:D, retreatCost:1) {
          weakness L
          move "Smash Turn", {
            text "10 damage. You may switch Crawdaunt G with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Hyper Beam", {
            text "40 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost D, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case DEWGONG_24:
        return evolution (this, from:"Seel", hp:HP100, type:W, retreatCost:3) {
          weakness M, '+20'
          pokeBody "Thick Fat", {
            text "Any damage done to Dewgong by attacks from [R] Pokémon and [W] Pokémon is reduced by 30 (after applying Weakness and Resistance)."
            delayedA {
            }
          }
          move "Ice Shard", {
            text "30 damage. If the Defending Pokémon is a [F] Pokémon, this attack's base damage is 80 instead of 30."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Aurora Beam", {
            text "70 damage. "
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 70
            }
          }
        };
      case DODRIO_25:
        return evolution (this, from:"Doduo", hp:HP080, type:C, retreatCost:null) {
          weakness L, '+20'
          resistance F, MINUS20
          pokePower "Echo Draw", {
            text "Once during your turn (before your attack), you may draw a card. This power can't be used if Dodrio is affected by a Special Condition."
            actionA {
            }
          }
          move "Drill Peck", {
            text "50 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case DUSKNOIR_FB_26:
        return basic (this, hp:HP090, type:P, retreatCost:2) {
          weakness D
          resistance C, MINUS20
          move "Ghost Hand", {
            text "30 damage. Put 1 damage counter on 1 of your Benched Pokémon."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Cursed Wrath", {
            text "10x damage. Does 10 damage times the number of Pokémon SP in your discard pile."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case EMPOLEON_FB_27:
        return basic (this, hp:HP090, type:W, retreatCost:2) {
          weakness L
          move "Rushing Water", {
            text "20 damage. Move an Energy card attached to the Defending Pokémon to another of your opponent's Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Escort", {
            text "40+ damage. If you played any Supporter card from your hand during this turn, this attack does 40 damage plus 20 more damage."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case EXPLOUD_28:
        return evolution (this, from:"Loudred", hp:HP130, type:C, retreatCost:2) {
          weakness F, '+30'
          pokeBody "Erasing Sound", {
            text "Each of your Pokémon has no Weakness."
            delayedA {
            }
          }
          move "Knock Back", {
            text "40 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
          move "Hyper Beam", {
            text "60 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
        };
      case HONCHKROW_29:
        return evolution (this, from:"Murkrow", hp:HP090, type:D, retreatCost:1) {
          weakness L, '+20'
          resistance F, MINUS20
          pokePower "Darkness Restore", {
            text "Once during your turn (before your attack), if Honchkrow is your Active Pokémon and your opponent's Bench isn't full, you may use this power. Search your opponent's discard pile for a Basic Pokémon and put it onto his or her bench. This power can't be used if Honchkrow is affected by a Special Condition."
            actionA {
            }
          }
          move "Riot", {
            text "30+ damage. Does 30 damage plus 10 more damage for each Pokémon that isn't an evolved Pokémon in play (both yours and your opponent's)."
            energyCost D, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case LICKILICKY_C_30:
        return basic (this, hp:HP090, type:C, retreatCost:2) {
          weakness F
          move "Licking-Licking Heal", {
            text "Attach a Basic Energy card from your hand to 1 of your Pokémon. Then, remove 2 damage counters from that Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Return", {
            text "40 damage. Draw cards until you have 6 cards in your hand."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case LUCARIO_C_31:
        return basic (this, hp:HP090, type:F, retreatCost:2) {
          weakness P
          move "Metal Claw", {
            text "20 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Mid-air Strike", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 30 more damage."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case LUNATONE_32:
        return basic (this, hp:HP070, type:P, retreatCost:null) {
          weakness P, '+20'
          pokeBody "Marvel Eyes", {
            text "If you have Solrock in play, prevent all effects of attacks, including damage, done to any of your Lunatone or Solrock by your opponent's Pokémon LV.X."
            delayedA {
            }
          }
          move "Gravity Wave", {
            text "30 damage. Does 30 damage to each of your opponent's Benched Pokémon that doesn't have a Retreat Cost. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case MAWILE_33:
        return basic (this, hp:HP070, type:M, retreatCost:1) {
          weakness R, '+20'
          resistance P, MINUS20
          move "Turnaround Standby", {
            text "During your next turn, any damage done by Mawile's Swallow or Bite to your opponent's Active Pokémon is increased by 40 (before applying Weakness and Resistance)."
            energyCost M
            attackRequirement {}
            onAttack {}
          }
          move "Swallow", {
            text "20 damage. Remove from Mawile the number of damage counters equal to the damage you did to the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Bite", {
            text "30 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case MEDICHAM_34:
        return evolution (this, from:"Meditite", hp:HP090, type:P, retreatCost:1) {
          weakness P, '+20'
          move "Channeling", {
            text "60 damage. Your opponent draws 2 cards."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
          move "Chakra Points", {
            text "10+ damage. Does 10 damage plus 10 more damage for each card in your opponent's hand."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case MILOTIC_C_35:
        return basic (this, hp:HP090, type:W, retreatCost:1) {
          weakness L
          move "Aqua Tail", {
            text "10+ damage. Flip a coin for each [W] Energy attached to Milotic C. This attack does 10 damage plus 20 more damage for each heads."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Wrap", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case MOLTRES_36:
        return basic (this, hp:HP100, type:R, retreatCost:2) {
          weakness W, '+30'
          resistance F, MINUS20
          move "Wing Attack", {
            text "20 damage. "
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Sky Attack", {
            text "80 damage. Flip a coin. If tails, this attack does nothing."
            energyCost R, R, C, C
            attackRequirement {}
            onAttack {
              damage 80
            }
          }
        };
      case MR_MIME_37:
        return basic (this, hp:HP070, type:P, retreatCost:1) {
          pokeBody "Focus Wall", {
            text "If Mr. Mime would be Knocked Out by damage from an attack that does 70 or more damage (after applying Weakness and Resistance), Mr. Mime is not Knocked Out and its remaining HP becomes 10 instead."
            delayedA {
            }
          }
          move "Desperate Slap", {
            text "20+ damage. If Mr. Mime already has 5 or more damage counters on it, this attack does 20 damage plus 40 more damage."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case PARASECT_38:
        return evolution (this, from:"Paras", hp:HP080, type:G, retreatCost:1) {
          weakness R, '+20'
          move "Nutritional Support", {
            text "Search your deck for up to 2 [G] Energy cards and attach them to any of your Pokémon in any way you like. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Hibernation Spore", {
            text "40 damage. The Defending Pokémon is now Asleep. Flip 2 coins instead of 1 between turns. If either of them is tails, the Defending Pokémon is still Asleep."
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case PRIMEAPE_39:
        return evolution (this, from:"Mankey", hp:HP090, type:F, retreatCost:1) {
          weakness P, '+20'
          move "Top Drop", {
            text "Discard the top card from your opponent's deck. If you discarded a Pokémon, this attack does damage equal to the HP of that Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {}
          }
          move "Brick Break", {
            text "40 damage. This attack's damage isn't affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case ROSERADE_C_40:
        return basic (this, hp:HP090, type:P, retreatCost:2) {
          weakness P
          pokeBody "Natural Cure", {
            text "When you attach an Energy card from your hand to Roserade C, remove all Special Conditions from Roserade C."
            delayedA {}
          }
          move "Magical Leaf", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage and remove 2 damage counters from Roserade C."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case SABLEYE_G_41:
        return basic (this, hp:HP070, type:D, retreatCost:1) {
          resistance C, MINUS20
          move "Scratch", {
            text "10 damage. "
            energyCost
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Astonish", {
            text "20 damage. Choose 1 card from your opponent's hand without looking. Look at that card you chose, then have your opponent shuffle that card into his or her deck."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case SANDSLASH_42:
        return evolution (this, from:"Sandshrew", hp:HP090, type:F, retreatCost:1) {
          weakness W, '+20'
          resistance L, MINUS20
          pokePower "Dig Down", {
            text "Once during your turn (before your attack), you may look at the top 5 cards in your deck. Choose as many [F] Energy cards as you like, show them to your opponent, and put them into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward. This power can't be used if Sandslash is affected by a Special Condition."
            actionA {
            }
          }
          move "Needle", {
            text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and Poisoned."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case SEAKING_43:
        return evolution (this, from:"Goldeen", hp:HP090, type:W, retreatCost:1) {
          weakness L, '+20'
          move "Horn Pierce", {
            text "90 damage. Flip 2 coins. If either of them is tails, this attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 90
            }
          }
          move "Endure", {
            text "30 damage. Flip a coin. If heads, during your opponent's next turn, if Seaking would be Knocked Out by damage from an attack, Seaking is not Knocked Out and its remaining HP becomes 10 instead."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case SHEDINJA_44:
        return evolution (this, from:"Nincada", hp:HP060, type:G, retreatCost:1) {
          weakness R, '+20'
          pokeBody "Marvel Shell", {
            text "Prevent all effects of attacks, including damage, done to Shedinja by your opponent's Pokémon that has any Poké-Powers or Poké-Bodies."
            delayedA {
            }
          }
          move "Spike Wound", {
            text "Choose 1 of your opponent's Pokémon that has any damage counters on it. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            attackRequirement {}
            onAttack {}
          }
        };
      case SOLROCK_45:
        return basic (this, hp:HP080, type:P, retreatCost:1) {
          weakness G, '+20'
          pokePower "Sunshine Fate", {
            text "Once during your turn (before your attack), if you have Lunatone in play, you may look at the top 3 cards of your deck and put them back on top of your deck in any order. This power can't be used if Solrock is affected by a Special Condition."
            actionA {
            }
          }
          move "Luna Turn", {
            text "30+ damage. If Lunatone is in your discard pile, this attack does 30 damage plus 30 more damage. Then, search your discard pile for Lunatone, show it to your opponent, and shuffle it into your deck."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case SPINDA_46:
        return basic (this, hp:HP070, type:C, retreatCost:1) {
          weakness F, '+20'
          move "Synchro Removal", {
            text "If any Energy card attached to Spinda is the same type as any Energy card attached to the Defending Pokémon, discard 1 of those Energy cards from the Defending Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Pulled Punch", {
            text "30 damage. If the Defending Pokémon already has any damage counters on it, this attack's base damage is 10 instead of 30."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case WAILORD_47:
        return evolution (this, from:"Wailmer", hp:HP180, type:W, retreatCost:4) {
          weakness L
          move "Rest", {
            text "Remove all Special Conditions and 4 damage counters from Wailord. Wailord is now Asleep."
            energyCost C, C
            attackRequirement {}
            onAttack {}
          }
          move "Giant Wave", {
            text "100 damage. Wailord can't use Giant Wave during your next turn."
            energyCost W, W, W, C, C
            attackRequirement {}
            onAttack {
              damage 100
            }
          }
        };
      case ZAPDOS_48:
        return basic (this, hp:HP100, type:L, retreatCost:2) {
          weakness L, '+30'
          resistance F, MINUS20
          move "Drill Peck", {
            text "30 damage. "
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Lightning Wing", {
            text "50+ damage. Flip a coin. If heads, this attack does 50 damage plus 20 more damage."
            energyCost L, L, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case ALTARIA_C_49:
        return basic (this, hp:HP080, type:C, retreatCost:1) {
          weakness C
          resistance F, MINUS20
          move "Sing", {
            text "20 damage. The Defending Pokémon is now Asleep."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Sonic Wing", {
            text "30 damage. This attack's damage isn't affected by Resistance."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case ARCANINE_50:
        return evolution (this, from:"Growlithe", hp:HP080, type:R, retreatCost:3) {
          weakness W, '+20'
          move "Overrun", {
            text "20 damage. Does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Combustion", {
            text "40 damage. "
            energyCost R, C, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case BIBAREL_51:
        return evolution (this, from:"Bidoof", hp:HP090, type:C, retreatCost:3) {
          weakness F, '+20'
          move "Rolling Tackle", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Tail Rap", {
            text "30x damage. Flip 2 coins. This attack does 30 damage times the number of heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case BRELOOM_52:
        return evolution (this, from:"Shroomish", hp:HP090, type:F, retreatCost:1) {
          weakness R, '+20'
          move "Hover Hit", {
            text "40 damage. The Retreat Cost for the Defending Pokémon is 0 until the end of your next turn."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
          move "Crash Bomber", {
            text "20+ damage. If the Defending Pokémon has any Special Energy cards attached to it, this attack does 20 damage plus 40 more damage. Then, discard a Special Energy card attached to the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case CARNIVINE_53:
        return basic (this, hp:HP080, type:G, retreatCost:2) {
          weakness R, '+20'
          resistance W, MINUS20
          move "Vine Whip", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Swallow", {
            text "30 damage. Flip a coin. If heads, remove from Carnivine the number of damage counters equal to the damage you did to the Defending Pokémon."
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case CHATOT_G_54:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          pokePower "Disrupting Spy", {
            text "Once during your turn, when you put Chatot G from your hand onto your Bench, you may look at the top 4 cards of your opponent's deck. Put them back on top of your opponent's deck in any order."
            actionA {
            }
          }
          move "Search and Escape", {
            text "Search your deck for a Trainer card, show it to your opponent, and put it into your hand. Put Chatot G and all cards attached to it on top of your deck. Shuffle your deck afterward."
            energyCost
            attackRequirement {}
            onAttack {}
          }
        };
      case CHERRIM_55:
        return evolution (this, from:"Cherubi", hp:HP080, type:G, retreatCost:1) {
          weakness R, '+20'
          resistance W, MINUS20
          move "Ram", {
            text "20 damage. "
            energyCost
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Petal Dance", {
            text "30x damage. Flip 3 coins. This attack does 30 damage times the numbers of heads. Cherrim is now Confused."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case DRAGONITE_FB_56:
        return basic (this, hp:HP100, type:C, retreatCost:3) {
          weakness C
          resistance F, MINUS20
          move "Mach Blow", {
            text "20 damage. If the Defending Pokémon is a Pokémon SP, this attack's base damage is 80 instead of 20."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Giant Tail", {
            text "100 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 100
            }
          }
        };
      case DRIFBLIM_57:
        return evolution (this, from:"Drifloon", hp:HP080, type:P, retreatCost:1) {
          weakness D, '+20'
          resistance C, MINUS20
          move "Ram", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Gust", {
            text "40 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case FLOATZEL_58:
        return evolution (this, from:"Buizel", hp:HP070, type:W, retreatCost:1) {
          weakness L, '+20'
          move "Razor Fin", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Jet Screw", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case GABITE_59:
        return evolution (this, from:"Gible", hp:HP080, type:C, retreatCost:1) {
          weakness C, '+20'
          move "Healing Scale", {
            text "Remove 1 damage counter from each of your Pokémon."
            energyCost
            attackRequirement {}
            onAttack {}
          }
          move "Sand Tomb", {
            text "30 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case GARCHOMP_C_60:
        return basic (this, hp:HP080, type:C, retreatCost:1) {
          weakness C
          move "Claw Swipe", {
            text "30 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Earthquake", {
            text "50 damage. This attack does 10 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case HIPPOPOTAS_61:
        return basic (this, hp:HP070, type:F, retreatCost:2) {
          weakness W, '+10'
          move "Double Headbutt", {
            text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Mud Shot", {
            text "40 damage. "
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case IVYSAUR_62:
        return evolution (this, from:"Bulbasuar", hp:HP080, type:G, retreatCost:2) {
          weakness R, '+20'
          pokePower "Evolutionary Pollen", {
            text "Once during your turn, when you play Ivysaur from your hand to evolve 1 of your Pokémon, you may use this power. Your opponent's Active Pokémon is now Asleep."
            actionA {
            }
          }
          move "Cut", {
            text "50 damage. "
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case LOPUNNY_63:
        return evolution (this, from:"Buneary", hp:HP080, type:C, retreatCost:1) {
          weakness F, '+20'
          move "Ice Beam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Rear Kick", {
            text "40 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case LOUDRED_64:
        return evolution (this, from:"Whismur", hp:HP080, type:C, retreatCost:2) {
          weakness F, '+20'
          move "Smash Kick", {
            text "30 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
          move "Stomp Off", {
            text "50 damage. Discard the top card from your opponent's deck."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case MAGMAR_65:
        return basic (this, hp:HP070, type:R, retreatCost:1) {
          weakness W, '+20'
          move "Smokescreen", {
            text "If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Fireworks", {
            text "30 damage. Flip a coin. If tails, discard a [R] Energy attached to Magmar."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case MANECTRIC_G_66:
        return basic (this, hp:HP080, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Energy Absorption", {
            text "Search your discard pile for up to 2 Energy cards and attach them to Manectric G."
            energyCost
            attackRequirement {}
            onAttack {}
          }
          move "Thunder Fang", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case MARSHTOMP_67:
        return evolution (this, from:"Mudkip", hp:HP080, type:W, retreatCost:1) {
          weakness G, '+20'
          pokePower "Plunge", {
            text "Once during your turn (before your attack), if Marshtomp is on your Bench, you may flip a coin. If heads, move all Energy cards attached to your Active Pokémon to Marshtomp. If you do, switch Marshtomp with that Active Pokémon."
            actionA {
            }
          }
          move "Mud Shot", {
            text "50 damage. "
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case MASQUERAIN_68:
        return evolution (this, from:"Surskit", hp:HP080, type:G, retreatCost:null) {
          weakness L, '+20'
          resistance F, MINUS20
          pokeBody "Intimidating Pattern", {
            text "As long as Masquerain is your Active Pokémon, any damage done by an opponent's attack is reduced by 20 (before applying Weakness and Resistance)."
            delayedA {
            }
          }
          move "Skim Attack", {
            text "30 damage. Draw 2 cards."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case METANG_69:
        return evolution (this, from:"Beldum", hp:HP080, type:M, retreatCost:2) {
          weakness R, '+20'
          resistance P, MINUS20
          pokeBody "Metallic Lift", {
            text "If Metang has any [M] Energy attached to it, the Retreat Cost for Metang is 0."
            delayedA {
            }
          }
          move "Psychic", {
            text "40+ damage. Does 40 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case MILOTIC_70:
        return evolution (this, from:"Feebas", hp:HP090, type:W, retreatCost:1) {
          weakness L, '+20'
          move "Cleansing Ring", {
            text "20 damage. You may discard 2 cards from your hand. If you do, remove 4 damage counters from 1 of your Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Scale Blow", {
            text "90- damage. Does 90 damage minus 10 damage for each card in your hand."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 90
            }
          }
        };
      case MINUN_71:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness F, '+10'
          resistance M, MINUS20
          move "Call for Family", {
            text "Search your deck for up to 2 Lightning Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
            energyCost
            attackRequirement {}
            onAttack {}
          }
          move "Trash Charge", {
            text "10 damage. Search your discard pile for a [L] Energy card and attach it to 1 of your Pokémon."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case MURKROW_72:
        return basic (this, hp:HP070, type:D, retreatCost:1) {
          weakness L, '+10'
          resistance F, MINUS20
          move "Switcheroo", {
            text "Move a Pokémon Tool card attached to 1 of your opponent's Pokémon to another of your opponent's Pokémon (excluding Pokémon that already has a Pokémon Tool attached to it). (If an effect of this attack is prevented, this attack does nothing.)"
            energyCost
            attackRequirement {}
            onAttack {}
          }
          move "Flap", {
            text "20 damage. "
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case NINJASK_73:
        return evolution (this, from:"Nincada", hp:HP080, type:G, retreatCost:null) {
          weakness R, '+20'
          resistance F, MINUS20
          move "Circling Dive", {
            text "This attack does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) Switch Ninjask with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Parallel Drain", {
            text "30 damage. Remove from 1 of your Pokémon the number of damage counters equal to the damage you did to the Defending Pokémon."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case NUMEL_74:
        return basic (this, hp:HP070, type:R, retreatCost:2) {
          weakness W, '+20'
          move "Draw In", {
            text "Search your discard pile for up to 2 [R] Energy cards and attach them to Numel."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Combustion", {
            text "40 damage. "
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case PINSIR_75:
        return basic (this, hp:HP090, type:G, retreatCost:2) {
          weakness R, '+20'
          move "Gripthrow", {
            text "Flip a coin. If heads, your opponent returns the Defending Pokémon and all cards attached to it to his or her hand."
            energyCost C, C
            attackRequirement {}
            onAttack {}
          }
          move "Sever", {
            text "50+ damage. If the Defending Pokémon is a Stage 2 Pokémon, this attack does 50 damage plus 30 more damage."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case PLUSLE_76:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness F, '+10'
          resistance M, MINUS20
          move "Greedy Draw", {
            text "If you have the same number of cards or less in your hand as your opponent, draw cards until you have 1 more card than your opponent. (If you have more cards in your hand than your opponent, this attack does nothing.)"
            energyCost
            attackRequirement {}
            onAttack {}
          }
          move "Hand Charge", {
            text "10 damage. Attach a [L] Energy card from your hand to 1 of your Pokémon."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case RAICHU_77:
        return evolution (this, from:"Pikachu", hp:HP090, type:L, retreatCost:null) {
          weakness F, '+20'
          resistance M, MINUS20
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 30 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Gigashock", {
            text "60 damage. Does 10 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
        };
      case RATICATE_G_78:
        return basic (this, hp:HP070, type:C, retreatCost:null) {
          weakness F
          move "Find", {
            text "Search your discard pile for a Trainer card or a Supporter card, show it to your opponent, and put it into your hand."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Biting Fang", {
            text "10+ damage. Flip a coin, if heads this attack does 10 damage plus 20 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case RELICANTH_79:
        return basic (this, hp:HP080, type:F, retreatCost:1) {
          weakness G, '+20'
          move "Grand Swell", {
            text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon for each Pokémon Tool and Stadium card your opponent has in play. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F
            attackRequirement {}
            onAttack {}
          }
          move "Amnesia", {
            text "30 damage. Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case RHYDON_80:
        return evolution (this, from:"Rhyhorn", hp:HP090, type:F, retreatCost:3) {
          weakness W, '+20'
          resistance L, MINUS20
          move "Fury Attack", {
            text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Rock Tumble", {
            text "60 damage. This attack's damage isn't affected by Resistance."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 60
            }
          }
        };
      case ROSERADE_81:
        return evolution (this, from:"Roselia", hp:HP080, type:G, retreatCost:2) {
          weakness R, '+20'
          move "Cut", {
            text "20 damage. "
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Poison Seed", {
            text "30 damage. The Defending Pokémon is now Poisoned."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case ROTOM_82:
        return basic (this, hp:HP070, type:L, retreatCost:1) {
          weakness D, '+20'
          resistance C, MINUS20
          move "Discharge", {
            text "40x damage. Discard all [L] Energy attached to Rotom. Flip a coin for each Energy card you discarded. This attack does 40 damage times the number of heads."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
          move "Uproar", {
            text "This attack does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            attackRequirement {}
            onAttack {}
          }
        };
      case SKARMORY_FB_83:
        return basic (this, hp:HP080, type:M, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Silver Feather", {
            text "20 damage. During your opponent's next turn, when your opponent puts a Basic Pokémon from his or her hand onto his or her Bench, put 2 damage counters on that Pokémon."
            energyCost M
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Metal Max", {
            text "20+ damage. Discard all [M] Energy attached to Skarmory FB. Flip a coin for each Energy card you discarded. This attack does 20 damage plus 40 damage for each heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case SPIRITOMB_C_84:
        return basic (this, hp:HP070, type:P, retreatCost:1) {
          resistance C, MINUS20
          move "Sharpshooting", {
            text "Choose 1 of your opponent's Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Lock Up", {
            text "20 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case STARAVIA_85:
        return evolution (this, from:"Starly", hp:HP070, type:C, retreatCost:1) {
          weakness L, '+20'
          resistance F, MINUS20
          move "Double Peck", {
            text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Air Crash", {
            text "30 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case TOGEKISS_C_86:
        return basic (this, hp:HP070, type:C, retreatCost:null) {
          weakness L
          resistance F, MINUS20
          move "Collect", {
            text "Draw a card."
            energyCost
            attackRequirement {}
            onAttack {}
          }
          move "Reckless Charge", {
            text "30 damage. Togekiss C does 10 damage to itself."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case WAILMER_87:
        return basic (this, hp:HP080, type:W, retreatCost:3) {
          weakness L, '+20'
          move "Hydro Pump", {
            text "20+ damage. Does 20 damage plus 10 more damage for each [W] Energy attached to Wailmer but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Take Down", {
            text "50 damage. Wailmer does 20 damage to itself."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case YANMA_88:
        return basic (this, hp:HP070, type:G, retreatCost:1) {
          weakness L, '+20'
          resistance F, MINUS20
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Air Slash", {
            text "20 damage. Flip a coin. If tails, discard an Energy attached to Yanma."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case BALTOY_89:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P, '+10'
          move "Spinning Attack", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Quick Turn", {
            text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case BELDUM_90:
        return basic (this, hp:HP050, type:M, retreatCost:2) {
          weakness R, '+10'
          resistance P, MINUS20
          move "Pit Search", {
            text "Search your deck for a Stadium card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Ram", {
            text "10 damage. "
            energyCost M
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case BIDOOF_91:
        return basic (this, hp:HP060, type:C, retreatCost:2) {
          weakness F, '+10'
          move "Whimsy Tackle", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case BUIZEL_92:
        return basic (this, hp:HP050, type:W, retreatCost:1) {
          weakness L, '+10'
          move "Tackle", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Wave Splash", {
            text "20 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case BULBASAUR_93:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness R, '+10'
          move "Tackle", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Vine Whip", {
            text "20 damage. "
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case BUNEARY_94:
        return basic (this, hp:HP050, type:C, retreatCost:1) {
          weakness F, '+10'
          move "Bounce", {
            text "Switch Buneary with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Mini Drain", {
            text "20 damage. Remove 1 damage counter from Buneary."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case CHATOT_95:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness L, '+10'
          resistance F, MINUS20
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Nosedive", {
            text "30 damage. Flip a coin. If tails, Chatot does 10 damage to itself."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case CHERUBI_96:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R, '+10'
          resistance W, MINUS20
          move "Growth", {
            text "Attach a [G] Energy from your hand to Cherubi."
            energyCost
            attackRequirement {}
            onAttack {}
          }
          move "Razor Leaf", {
            text "10 damage. "
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case CHIMCHAR_97:
        return basic (this, hp:HP050, type:R, retreatCost:1) {
          weakness W, '+10'
          move "Chop", {
            text "10 damage. "
            energyCost R
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Jump On", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case CHINGLING_98:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P, '+10'
          pokePower "Baby Evolution", {
            text "Once during your turn (before your attack), you may put Chimecho from your hand onto Chingling (this counts as evolving Chingling) and remove all damage counters from Chingling."
            actionA {
            }
          }
          move "Chime", {
            text "Search your opponent's discard pile for a Supporter card and use the effect of that card as the effect of this attack. (The Supporter card remains in your opponent's discard pile.)"
            energyCost
            attackRequirement {}
            onAttack {}
          }
        };
      case COMBEE_99:
        return basic (this, hp:HP040, type:G, retreatCost:1) {
          weakness R, '+10'
          resistance F, MINUS20
          move "Nap", {
            text "Remove 2 damage counters from Combee."
            energyCost G
            attackRequirement {}
            onAttack {}
          }
          move "Zzzt", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case CORPHISH_100:
        return basic (this, hp:HP050, type:W, retreatCost:1) {
          weakness L, '+10'
          move "Crabhammer", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Sharp Pincers", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case CROAGUNK_101:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness P, '+10'
          move "Hook", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Corkscrew Punch", {
            text "20 damage. "
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case DODUO_102:
        return basic (this, hp:HP050, type:C, retreatCost:null) {
          weakness L, '+10'
          resistance F, MINUS20
          move "Take Down", {
            text "20 damage. Doduo does 10 damage to itself."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case DRIFLOON_103:
        return basic (this, hp:HP040, type:P, retreatCost:1) {
          weakness D, '+10'
          resistance C, MINUS20
          move "Reckless Charge", {
            text "20 damage. Drifloon does 10 damage to itself."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Collect", {
            text "Draw a card."
            energyCost P
            attackRequirement {}
            onAttack {}
          }
        };
      case FEEBAS_104:
        return basic (this, hp:HP030, type:W, retreatCost:1) {
          weakness L, '+10'
          move "Surprise Attack", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
          move "Count and Draw", {
            text "Draw a card for each of your opponent's Pokémon that isn't an Evolved Pokémon."
            energyCost W
            attackRequirement {}
            onAttack {}
          }
        };
      case GEODUDE_105:
        return basic (this, hp:HP060, type:F, retreatCost:2) {
          weakness W, '+10'
          move "Knuckle Punch", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Focus Fist", {
            text "30 damage. Flip a coin. If tails, this attack does nothing."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case GIBLE_106:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness C, '+10'
          move "Sand Attack", {
            text "If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Bite", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case GOLDEEN_107:
        return basic (this, hp:HP050, type:W, retreatCost:1) {
          weakness L, '+10'
          move "Flail", {
            text "10x damage. Does 10 damage times the number of damage counters on Goldeen."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Fury Attack", {
            text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case GROWLITHE_108:
        return basic (this, hp:HP060, type:R, retreatCost:1) {
          weakness W, '+10'
          move "Smash Kick", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Fireworks", {
            text "30 damage. Flip a coin. If tails, discard a [R] Energy attached to Growlithe."
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case KRICKETOT_109:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R, '+10'
          move "Headbutt", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Beat", {
            text "20 damage. "
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case MAGIKARP_110:
        return basic (this, hp:HP030, type:W, retreatCost:1) {
          weakness L, '+10'
          move "Flail Around", {
            text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case MAGNEMITE_111:
        return basic (this, hp:HP040, type:L, retreatCost:1) {
          weakness F, '+10'
          resistance M, MINUS20
          move "Speed Ball", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case MANKEY_112:
        return basic (this, hp:HP050, type:F, retreatCost:1) {
          weakness P, '+10'
          move "Extra Punch", {
            text "10+ damage. If the Defending Pokémon is a Pokémon LV.X, this attack does 10 damage plus 50 more damage."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case MEDITITE_113:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness P, '+10'
          move "Psyshot", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Karate Chop", {
            text "30- damage. Does 30 damage minus 10 damage for each damage counter on Meditite."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 30
            }
          }
        };
      case MEOWTH_114:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F, '+10'
          move "Scratch", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Double Kick", {
            text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case MIME_JR__115:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P, '+10'
          pokePower "Baby Evolution", {
            text "Once during your turn (before your attack), you may put Mr. Mime from your hand onto Mime Jr. (this counts as evolving Mime Jr.) and remove all damage counters from Mime Jr."
            actionA {
            }
          }
          move "Encore", {
            text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can use only that attack during your opponent's next turn."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
        };
      case MUDKIP_116:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness G, '+10'
          move "Mud Sport", {
            text "10+ damage. If Mudkip has less Energy attached to it than the Defending Pokémon, this attack does 10 damage plus 10 more damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Surf", {
            text "20 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case NINCADA_117:
        return basic (this, hp:HP040, type:G, retreatCost:1) {
          weakness R, '+10'
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Dash Attack", {
            text "Choose 1 of your opponent's Benched Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            attackRequirement {}
            onAttack {}
          }
        };
      case PACHIRISU_118:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness F, '+10'
          resistance M, MINUS20
          move "Tail Slap", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Pachi", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case PARAS_119:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R, '+10'
          move "Spore", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Stomp", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case PIKACHU_120:
        return basic (this, hp:HP050, type:L, retreatCost:1) {
          weakness F, '+10'
          resistance M, MINUS20
          move "Gnaw", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Thundershock", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case PIPLUP_121:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness L, '+10'
          move "Pound", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Surf", {
            text "20 damage. "
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case RHYHORN_122:
        return basic (this, hp:HP070, type:F, retreatCost:2) {
          weakness W, '+10'
          resistance L, MINUS20
          move "Stomp", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Horn Drill", {
            text "50 damage. "
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 50
            }
          }
        };
      case ROSELIA_123:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness R, '+10'
          move "Vine Slap", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Spit Poison", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost G, C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case SANDSHREW_124:
        return basic (this, hp:HP050, type:F, retreatCost:1) {
          weakness W, '+10'
          resistance L, MINUS20
          move "Scratch", {
            text "20 damage. "
            energyCost F
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case SEEL_125:
        return basic (this, hp:HP060, type:W, retreatCost:2) {
          weakness M, '+10'
          move "Tail Slap", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Icy Wind", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Asleep."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case SHINX_126:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness F, '+10'
          resistance M, MINUS20
          move "Bite", {
            text "20 damage. "
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case SHROOMISH_127:
        return basic (this, hp:HP060, type:G, retreatCost:1) {
          weakness R, '+10'
          resistance W, MINUS20
          move "Stun Spore", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Tackle", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case SKORUPI_128:
        return basic (this, hp:HP050, type:P, retreatCost:2) {
          weakness P, '+10'
          move "Poison Sting", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Tail Smash", {
            text "40 damage. Flip a coin. If tails, this attack does nothing."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 40
            }
          }
        };
      case STARLY_129:
        return basic (this, hp:HP050, type:C, retreatCost:1) {
          weakness L, '+10'
          resistance F, MINUS20
          move "Peck", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case SURSKIT_130:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R, '+10'
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case TURTWIG_131:
        return basic (this, hp:HP060, type:G, retreatCost:2) {
          weakness R, '+10'
          resistance W, MINUS20
          move "Shell Attack", {
            text "10 damage. "
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
          move "Stomp", {
            text "20+ damage. Flip a coin. If heads, this attack does 20 damage plus 10 more damage."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case WHISMUR_132:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F, '+10'
          move "Tone-Deaf", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {}
          }
          move "Rollout", {
            text "20 damage. "
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
            }
          }
        };
      case ZUBAT_133:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P, '+10'
          resistance F, MINUS20
          move "Quick Turn", {
            text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
            }
          }
        };
      case BATTLE_TOWER_134:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
            "Whenever any player plays any Pokémon from his or her hand to Level-Up 1 of his or her Pokémon, remove 4 damage counters from that Pokémon."
          onPlay {
          }
          onRemoveFromPlay{
          }
        };
      case CHAMPION_S_ROOM_135:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
            "The Retreat cost for each Pokémon SP (both yours and your opponent's) is [C] less."
          onPlay {
          }
          onRemoveFromPlay{
          }
        };
      case CYNTHIA_S_GUIDANCE_136:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
            "Look at the top 7 cards of your deck, choose 1 of them, and put it into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case CYRUS_S_INITIATIVE_137:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
            "Flip 2 coins. If either of them is heads, look at your opponent's hand. For each heads, choose 1 card from your opponent's hand and put it on the bottom of your opponent's deck in any order."
          onPlay {
          }
          playRequirement{
          }
        };
      case NIGHT_TELEPORTER_138:
        return itemCard (this) {
          text "Flip a coin. If heads, put all cards in your hand on top of your deck. Then, search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
          onPlay {
          }
          playRequirement{
          }
        };
      case PALMER_S_CONTRIBUTION_139:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
            "Search your discard pile for up to 5 in any combination of Pokémon and basic Energy cards. Show them to your opponent and shuffle them into your deck."
          onPlay {
          }
          playRequirement{
          }
        };
      case VS_SEEKER_140:
        return itemCard (this) {
          text "Search your discard pile for a Supporter card, show it to your opponent, and put it into your hand."
          onPlay {
          }
          playRequirement{
          }
        };
      case ABSOL_G_LV_X_141:
        return levelUp (this, from:"Absol G", hp:HP100, type:D, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          pokePower "Darkness Send", {
            text "Once during your turn , when you put Absol LV. from your hand onto your Active Absol , you may flip 3 coins. For each heads, put the top card from your opponent’s deck in the Lost Zone."
            actionA {
            }
          }
          move "Darkness Slugger", {
            text "30+ damage. You may discard a card from your hand. If you do, this attack does 30 damage plus 30 more damage."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case BLAZIKEN_FB_LV_X_142:
        return levelUp (this, from:"Blaziken FB", hp:HP110, type:R, retreatCost:1) {
          weakness W
          pokeBody "Burning Spirit", {
            text "Any damage done by attacks to a Burned Pokémon is increased by 40 . No more than 40 damage can be added by all Burning Spirit Poké-Bodies."
            delayedA {
            }
          }
          move "Jet Shoot", {
            text "80 damage. ."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case CHARIZARD_G_LV_X_143:
        return levelUp (this, from:"Charizard G", hp:HP120, type:R, retreatCost:3) {
          weakness W
          resistance F, MINUS20
          pokePower "Call for Power", {
            text "As often as you like during your turn , you may move an Energy attached to 1 of your Pokémon to Charizard . This power can’t be used if Charizard is affected by a Special Condition."
            actionA {
            }
          }
          move "Malevolent Fire", {
            text "150 damage. ."
            energyCost R, R, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case ELECTIVIRE_FB_LV_X_144:
        return levelUp (this, from:"Electivire FB", hp:HP120, type:L, retreatCost:3) {
          weakness F
          resistance M, MINUS20
          pokePower "Energy Recycle", {
            text "Once during your turn , you may use this power. If you do, your turn ends. Search your discard pile for up to 3 Energy cards and attach them to your Pokémon in any way you like. This power can’t be used if Electivire is affected by a Special Condition."
            actionA {
            }
          }
          move "Powerful Spark", {
            text "30+ damage. This attack does 30 damage plus 10 damage for each Energy attached to all of your Pokémon."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case GARCHOMP_C_LV_X_145:
        return levelUp (this, from:"Garchomp C", hp:HP110, type:C, retreatCost:0) {
          weakness C
          pokePower "Healing Breath", {
            text "Once during your turn , when you put Garchomp LV. from your hand onto your Active Garchomp , you may remove all damage counters from each of your Pokémon ."
            actionA {
            }
          }
          move "Dragon Rush", {
            text "can’t use Dragon Rush during your next turn."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case RAYQUAZA_C_LV_X_146:
        return levelUp (this, from:"Rayquaza C", hp:HP120, type:C, retreatCost:3) {
          weakness C
          resistance F, MINUS20
          pokeBody "Dragon Spirit", {
            text "If Rayquaza is your Active Pokémon and is damaged but not Knocked Out by an opponent’s attack, you may search your discard pile for an Energy card and attach it to Rayquaza ."
            delayedA {
            }
          }
          move "Final Blowup", {
            text "200 damage. . Ignore this effect if you have no cards in your hand."
            energyCost W, P, F, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case STARAPTOR_FB_LV_X_147:
        return levelUp (this, from:"Staraptor FB", hp:HP100, type:C, retreatCost:0) {
          weakness L
          resistance F, MINUS20
          pokePower "Fast Call", {
            text "Once during your turn , you may search your deck for a Supporter card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. This power can’t be used if Staraptor is affected by a Special Condition."
            actionA {
            }
          }
          move "Defog", {
            text "40 damage. Before doing damage, you may discard any Stadium card in play. If you do, this attack’s base damage is 70 instead of 40."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
        };
      case ARTICUNO_148:
        return basic (this, hp:HP070, type:W, retreatCost:1) {
          resistance F, MINUS30
          move "Diamond Dust", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed, and this attack does 10 damage to each of your opponent’s Benched Pokémon."
            energyCost W, W, W
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MOLTRES_149:
        return basic (this, hp:HP070, type:R, retreatCost:1) {
          resistance F, MINUS30
          move "Hyper Flame", {
            text "60 damage. Energy card attached to Moltres. If tails, discard all Energy cards attached to Moltres. If you can’t discard Energy cards, this attack does nothing."
            energyCost R, R, R, R
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case ZAPDOS_150:
        return basic (this, hp:HP070, type:L, retreatCost:1) {
          weakness F
          move "Lightning Burn", {
            text "30 damage. If tails, Zapdos does 30 damage to itself."
            energyCost L, L, L
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case MILOTIC_SH7:
        return evolution (this, from:"Feebas", hp:HP080, type:W, retreatCost:1) {
          weakness L
          pokeBody "Aqua Mirage", {
            text "If you have no cards in your hand, prevent all damage done to Milotic by attacks from your opponent’s Pokémon."
            delayedA {
            }
          }
          move "Dwindling Wave", {
            text "80- damage. Does 80 damage minus 10 damage for each damage counter on Milotic."
            energyCost W, W, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case RELICANTH_SH8:
        return basic (this, hp:HP080, type:F, retreatCost:1) {
          weakness G
          move "Deep Sea Pressure", {
            text "20 damage. more."
            energyCost F, C, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Aqua Wave", {
            text "40+ damage. Flip 2 coins. This attack does 40 damage plus 10 more damage for each heads."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }

        };
      case YANMA_SH9:
        return basic (this, hp:HP070, type:G, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          move "Sonicboom", {
            text "10 damage. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 0
            }
          }
          move "Baton Pass", {
            text "30 damage. You may switch Yanma with 1 of your Benched Pokémon. If you do, move as many Energy cards attached to Yanma as you like to the new Active Pokémon."
            energyCost G, C, C
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
