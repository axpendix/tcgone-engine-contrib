package tcgwars.logic.impl.gen4

import tcgwars.logic.Battleground
import tcgwars.logic.DamageManager
import tcgwars.logic.TargetPlayer
import tcgwars.logic.card.energy.BasicEnergyCard
import tcgwars.logic.card.trainer.PokemonToolCard
import tcgwars.logic.effect.Source
import tcgwars.logic.effect.advanced.EnergySwitch
import tcgwars.logic.effect.basic.DirectDamage
import tcgwars.logic.effect.basic.Move
import tcgwars.logic.effect.basic.ResolvedDamage
import tcgwars.logic.effect.gm.ActivateSimpleTrainer
import tcgwars.logic.effect.gm.PlayPokemonTool
import tcgwars.logic.effect.gm.PlayPokemonToolFlare
import tcgwars.logic.effect.gm.PlayTrainer
import tcgwars.logic.effect.special.SpecialConditionType
import tcgwars.logic.impl.gen3.FireRedLeafGreen
import tcgwars.logic.impl.gen7.CelestialStorm;

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
 * @author ufodynasty12@gmail.com
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
    return this.name();
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
            attackRequirement {}
            onAttack {
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
                  after CHANGE_STAGE, pcs, {unregister()}
                }
              }
            }
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
              def pcs = opp.bench.select(text)
              new ResolvedDamage(hp(40), my.active, pcs, Source.ATTACK, DamageManager.DamageFlag.FORCE_WEAKNESS_RESISTANCE).run(bg)
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
              if(my.bench && self.cards.energyCount(L)) {
                def energyCard = self.cards.select("Choose a [L] Energy to move", energyFilter(L)).first()
                def tar = my.bench.select("Move $energyCard to which Pokémon?")
                afterDamage {
                  energySwitch(self, tar, energyCard)
                }
              }
            }
          }
        };
      case GARCHOMP_5:
        return evolution (this, from:"Gabite", hp:HP130, type:C, retreatCost:0) {
          weakness C, PLUS30
          pokeBody "Dragon Intimidation", {
            text "If Garchomp is your Active Pokémon and is damaged by an opponent's attack (even if Garchomp is Knocked Out), choose an Energy card attached to the Attacking Pokémon and put it into your opponent's hand."
            ifActiveAndDamagedByAttackBody(delegate) {
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
          weakness W, PLUS30
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
              if(self.cards.energyCount(R) && my.bench && confirm("Move a [R] Energy card attached to $self to 1 of your Benched Pokémon")) {
                def energyCard = self.cards.select("Choose a [R] Energy to move",energyFilter(L)).first()
                def tar = my.bench.select("Move $energyCard to which Pokémon?")
                afterDamage {
                  energySwitch(self,tar,energyCard)
                }
              }
            }
          }
        };
      case METAGROSS_7:
        return evolution (this, from:"Metang", hp:HP130, type:M, retreatCost:3) {
          weakness R, PLUS30
          resistance P, MINUS20
          pokeBody "Gravitation", {
            text "Each Pokémon in play (both yours and your opponent's) gets -20 HP. No more than 20 HP can be reduced by all Gravitation Poké-Bodies."
            def eff
            onActivate {
              eff = getter (GET_FULL_HP,BEFORE_LAST) {h->
                if (!h.context['Gravitation']) {
                  h.object -= hp(20)
                  h.context['Gravitation'] = 1
                }
              }
            }
            onDeactivate {
              eff.unregister()
            }
          }
          move "Geo Impact", {
            text "60 damage. If you have a Stadium card in play, this attack does 20 damage to each of your opponent's Benched Pokémon that is the same type as the Defending Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost M, M, C
            attackRequirement {}
            onAttack {
              damage 60
              if(bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player == self.owner) {
                opp.bench.findAll{it.types.containsAny(defending.types)}.each {
                  damage 20, it
                }
              }
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
              def energyList = my.hand.select(min:0,max:5,"You may discard up to 5 Energy cards in order to deal 10 additional damage per Energy card",cardTypeFilter(ENERGY))
              damage 10 * energyList.size()
              afterDamage {
                energyList.discard()
              }
            }
          }
          move "Twister", {
            text "50 damage. Flip 2 coins. If both are tails, this attack does nothing. For each heads, discard an Energy attached to the Defending Pokémon."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              flip 2, {}, {}, [
                2: {
                  damage 50
                  discardDefendingEnergyAfterDamage C, C
                },
                1: {
                  damage 50
                  discardDefendingEnergyAfterDamage C
                }]
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
              afterDamage {
                heal 10 * defending.cards.energyCount(C), self
              }
            }
          }
          move "Rainbow Lariat", {
            text "20x damage. Does 20 damage times the number of different types of Pokémon SP you have in play."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              for(Type t1:Type.values()){
                if(my.all.find{it.pokemonSP && it.types.contains(t1)})
                  damage 20
              }
            }
          }
        };
      case RHYPERIOR_10:
        return evolution (this, from:"Rhydon", hp:HP140, type:F, retreatCost:4) {
          weakness W, PLUS30
          resistance L, MINUS20
          move "Raging Drill", {
            text "30+ damage. Does 30 damage plus 10 more damage for each damage counter on Rhyperior."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30 + 10 * self.numberOfDamageCounters
            }
          }
          move "Deep Scrap", {
            text "60 damage. If the Defending Pokémon would be Knocked Out by this attack, discard the top 3 cards from your opponent's deck."
            energyCost F, F, C, C
            attackRequirement {}
            onAttack {
              damage 60
              delayed {
                def pcs = defending
                before KNOCKOUT, pcs, {
                  if (opp.deck) {
                    opp.deck.subList(0,3).discard()
                  }
                  unregister()
                }
                unregisterAfter 1
              }
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
              flip {
                damage 10
              }
            }
          }
          move "Whirlwind", {
            text "30 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {
                whirlwind()
              }
            }
          }
        };
      case SWAMPERT_12:
        return evolution (this, from:"Marshtomp", hp:HP130, type:W, retreatCost:2) {
          weakness G, PLUS30
          pokeBody "Root Protector", {
            text "Any damage done to Swampert by attacks from your opponent's Pokémon that isn't an Evolved Pokémon is reduced by 20 (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (self.active && it.to == self && it.from.owner == self.owner.opposite && !it.from.evolution && it.dmg.value && it.notNoEffect) {
                    bc "$thisAbility -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
          move "Drag Off", {
            text "30 damage. Before doing damage, you may switch your opponent's Active Pokémon with 1 of his or her Benched Pokémon."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              if (opp.bench && confirm("Switch 1 of your opponent’s Benched Pokémon with the Defending Pokémon before doing damage?")) {
                switchYourOpponentsBenchedWithActive()
              }
              damage 30
            }
          }
          move "Push Over", {
            text "60+ damage. Does 60 damage plus 10 more damage for each [F] Energy attached to Swampert."
            energyCost W, C, C, C
            attackRequirement {}
            onAttack {
              damage 60 + 10 * self.cards.energyCount(F)
            }
          }
        };
      case VENUSAUR_13:
        return evolution (this, from:"Ivysaur", hp:HP140, type:G, retreatCost:4) {
          weakness R, PLUS40
          pokeBody "Green Aroma", {
            text "Remove all Special Conditions from each of your [G] Pokémon. Each of your [G] Pokémon can't be affected by any Special Conditions."
            delayedA {
              before APPLY_SPECIAL_CONDITION, {
                def pcs = ef.getTargetPokemon()
                if (pcs.owner == self.owner && pcs.types.contains(G)) {
                  bc "$thisAbility prevents special conditions on $self."
                  prevent()
                }
              }
            }
            onActivate {
              my.all.findAll{it.types.contains(G)}.each {
                if(it.specialConditions) {
                  bc "$thisAbility clears special conditions of $it"
                  clearSpecialCondition(it)
                }
              }
            }
          }
          move "Desperate Pollen", {
            text "30 damage. If Venusaur already has 8 or more damage counters on it, the Defending Pokémon is now Burned, Confused, and Poisoned."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {
                if(self.numberOfDamageCounters >= 8) {
                  apply BURNED
                  apply CONFUSED
                  apply POISONED
                }
              }
            }
          }
          move "Special Reaction", {
            text "40+ damage. If the Defending Pokémon is affected by any Special Conditions, this attack does 40 damage plus 40 more damage for each of those Special Conditions."
            energyCost G, G, C, C
            attackRequirement {}
            onAttack {
              damage 40 + 40 * defending.specialConditions.size()
            }
          }
        };
      case YANMEGA_14:
        return evolution (this, from:"Yanma", hp:HP100, type:G, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          pokePower "Speed Boost", {
            text "Once during your turn (before your attack), if Yanmega is your Active Pokémon, you may search your discard pile for a [G] Energy card and attach it to Yanmega. This power can't be used if Yanmega is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert self.active : "$self is not your active Pokémon"
              assert my.discard.filterByEnergyType(G) : "You have no [G] Energy cards in your discard pile"
              powerUsed()
              attachEnergyFrom(type:G,my.discard,self)
            }
          }
          move "Wind Return", {
            text "20+ damage. You may return all [G] Energy attached to Yanmega to your hand. If you do, this attack does 20 damage plus 20 more damage for each Energy card you returned."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              if(confirm("Return all [G] Energy attached to $self in order to do aditional damgae?")) {
                damage 20 * self.cards.filterByEnergyType(G).size()
                afterDamage {
                  self.cards.filterByEnergyType(G).moveTo(my.hand)
                }
              }
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
            getterA (GET_RETREAT_COST, self) {h->
              if(self.active) {
                h.object -= self.cards.energyCount(R)
              }
            }
          }
          move "Overrun", {
            text "40 damage. Does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost R, C, C
            attackRequirement {}
            onAttack {
              damage 40
              if(opp.bench) {
                damage 20, opp.bench.select("Does 20 damage to 1 of your opponent's Benched Pokémon")
              }
            }
          }
        };
      case ARTICUNO_16:
        return basic (this, hp:HP100, type:W, retreatCost:2) {
          weakness M, PLUS30
          resistance F, MINUS20
          move "Sharp Beak", {
            text "30+ damage. Flip a coin. If heads, this attack does 30 damage plus 10 more damage."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                damage 10
              }
            }
          }
          move "Ice Beam", {
            text "50 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, W, C, C
            attackRequirement {}
            onAttack {
              damage 50
              flip {
                applyAfterDamage PARALYZED
              }
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
              after PROCESS_ATTACK_EFFECTS, {
                if(ef.attacker==self) bg.dm().each {
                  if(it.from==self && it.to.active && it.to.owner!=self.owner && it.dmg.value && it.to.hasPokeBody()){
                    bc "$thisAbility +30"
                    it.dmg += hp(30)
                  }
                }
              }
            }
          }
          move "Select Powder", {
            text "30 damage. Choose either Burned or Poisoned. The Defending Pokémon is now affected by that Special Condition."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 30
              def list=[BURNED,POISONED]
              SpecialConditionType spc=choose(list, list.collect({it.toString()})) as SpecialConditionType
              afterDamage {apply spc, defending}
            }
          }
        };
      case CAMERUPT_18:
        return evolution (this, from:"Numel", hp:HP120, type:R, retreatCost:4) {
          weakness W, PLUS30
          move "Moving Fire", {
            text "30 damage. You may move a [R] Energy card attached to 1 of your Benched Pokémon to Camerupt."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {
                if(my.bench.find{it.cards.energyCount(R)} && confirm("Move a [R] Energy card attached to 1 of your Benched Pokémon to $self?")) {
                  def src = my.bench.findAll{it.cards.energyCount(R)}.select("Move [R] Energy from which Pokémon?")
                  def card = src.cards.select("Move which energy?",energyFilter(R)).first()
                  energySwitch(src,self,card)
                }
              }
            }
          }
          move "Volcanic Crash", {
            text "100 damage. Flip 3 coins. For each tails, discard the top card of your deck. Ignore this effect if your opponent has any [W] Pokémon in play."
            energyCost R, R, C, C
            attackRequirement {}
            onAttack {
              damage 100
              afterDamage {
                if(!opp.all.find{it.types.contains(W)}) {
                  def count = 0
                  flip 3, {}, {
                    count++
                  }
                  if(count) {
                    my.deck.subList(0,count).discard()
                  }
                }
              }
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
              applyAfterDamage BURNED
            }
          }
          move "Earth Power", {
            text "60 damage. Flip 2 coins. This attack does 10 damage times the number of heads to each of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              flip 2, {
                opp.bench.each {
                  damage 10, it
                }
              }
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
            onAttack {
              flip {
                damage 40, opp.all.select("Choose a Pokémon to deal 40 damage to")
              }
            }
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
          weakness P, PLUS20
          move "Heal Bell", {
            text "Remove 3 damage counters from each of your Pokémon."
            energyCost C
            attackRequirement {
              assert my.all.find{it.numberOfDamageCounters} : "Your Pokémon are healthy"
            }
            onAttack {
              my.all.each {
                heal 30, it
              }
            }
          }
          move "Super Psywave", {
            text "Choose 1 of your opponent's Pokémon. Count the amount of Energy attached to that Pokémon. Put that many damage counters on the Pokémon."
            energyCost P
            attackRequirement {
              assert opp.all.find{it.cards.energyCount(C)} : "None of your opponent's Pokémon have any Energy attached"
            }
            onAttack {
              def tar = opp.all.findAll{it.cards.energyCount(C)}.select("Choose 1 of your opponent's Pokémon")
              directDamage 10*tar.cards.energyCount(C), tar
            }
          }
        };
      case CLAYDOL_22:
        return evolution (this, from:"Baltoy", hp:HP090, type:P, retreatCost:1) {
          weakness P, PLUS20
          move "Antique Magic", {
            text "Put 3 damage counters on any Pokémon (both yours and your opponent's) in any way you like."
            energyCost C, C
            attackRequirement {}
            onAttack {
              putDamageCountersOnOpponentsPokemon(3,all)
            }
          }
          move "Synchro Attack", {
            text "30 damage. If the Defending Pokémon has the same remaining HP as Claydol, this attack's base damage is 90 instead of 30."
            energyCost P, P
            attackRequirement {}
            onAttack {
              damage 30
              if(defending.remainingHP.value == self.remainingHP.value) {
                damage 60
              }
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
              switchYourActive(may:true)
            }
          }
          move "Hyper Beam", {
            text "40 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost D, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip {
                discardDefendingEnergyAfterDamage(C)
              }
            }
          }
        };
      case DEWGONG_24:
        return evolution (this, from:"Seel", hp:HP100, type:W, retreatCost:3) {
          weakness M, PLUS20
          pokeBody "Thick Fat", {
            text "Any damage done to Dewgong by attacks from [R] Pokémon and [W] Pokémon is reduced by 30 (after applying Weakness and Resistance)."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if (it.to == self && (it.from.types.contains(R) || it.from.types.contains(W)) && it.dmg.value && it.notNoEffect) {
                    bc "$thisAbility -30"
                    it.dmg -= hp(30)
                  }
                }
              }
            }
          }
          move "Ice Shard", {
            text "30 damage. If the Defending Pokémon is a [F] Pokémon, this attack's base damage is 80 instead of 30."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 30
              if(defending.types.contains(F)) {
                damage 50
              }
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
        return evolution (this, from:"Doduo", hp:HP080, type:C, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          pokePower "Echo Draw", {
            text "Once during your turn (before your attack), you may draw a card. This power can't be used if Dodrio is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.deck : "Your deck is empty"
              powerUsed()
              draw 1
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
              if(my.bench) {
                directDamage 10, my.bench.select("Put 1 damage counter on 1 of your Benched Pokémon")
              }
            }
          }
          move "Cursed Wrath", {
            text "10x damage. Does 10 damage times the number of Pokémon SP in your discard pile."
            energyCost P, C, C
            attackRequirement {
              assert my.discard.filterByType(POKEMON_SP) : "You have no Pokémon SP in your discard pile"
            }
            onAttack {
              damage 10 * my.discard.filterByType(POKEMON_SP).size()
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
              afterDamage {
                if (defending.cards.energyCount(C)) {
                  moveEnergy(defending, opp.bench)
                }
              }
            }
          }
          move "Escort", {
            text "40+ damage. If you played any Supporter card from your hand during this turn, this attack does 40 damage plus 20 more damage."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 40
              if(bg.em().retrieveObject("last_supporter_play_turn") == bg.turnCount) {
                damage 20
              }
            }
          }
        };
      case EXPLOUD_28:
        return evolution (this, from:"Loudred", hp:HP130, type:C, retreatCost:2) {
          weakness F, PLUS30
          pokeBody "Erasing Sound", {
            text "Each of your Pokémon has no Weakness."
            getterA (GET_WEAKNESSES) {h->
              if(h.effect.target.owner == self.owner){
                h.object = []
              }
            }
          }
          move "Knock Back", {
            text "40 damage. Your opponent switches the Defending Pokémon with 1 of his or her Benched Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 40
              afterDamage {
                whirlwind()
              }
            }
          }
          move "Hyper Beam", {
            text "60 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 60
              flip {
                discardDefendingEnergyAfterDamage C
              }
            }
          }
        };
      case HONCHKROW_29:
        return evolution (this, from:"Murkrow", hp:HP090, type:D, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          pokePower "Darkness Restore", {
            text "Once during your turn (before your attack), if Honchkrow is your Active Pokémon and your opponent's Bench isn't full, you may use this power. Search your opponent's discard pile for a Basic Pokémon and put it onto his or her bench. This power can't be used if Honchkrow is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert self.active : "$self is not your Active Pokémon"
              assert opp.bench.notFull
              assert opp.discard.filterByType(BASIC)
              powerUsed()
              def card = opp.discard.select("Search your opponent's discard pile for a Basic Pokémon",cardTypeFilter(BASIC)).first()
              benchPCS(card, OTHER)
            }
          }
          move "Riot", {
            text "30+ damage. Does 30 damage plus 10 more damage for each Pokémon that isn't an evolved Pokémon in play (both yours and your opponent's)."
            energyCost D, C, C
            attackRequirement {}
            onAttack {
              damage 30 + 10 * all.findAll{!it.evolution}.size()
            }
          }
        };
      case LICKILICKY_C_30:
        return basic (this, hp:HP090, type:C, retreatCost:2) {
          weakness F
          move "Licking-Licking Heal", {
            text "Attach a Basic Energy card from your hand to 1 of your Pokémon. Then, remove 2 damage counters from that Pokémon."
            energyCost C
            attackRequirement {
              assert my.hand.filterByType(BASIC_ENERGY) : "You have no Basic Energy cards in your hand"
            }
            onAttack {
              def card = my.hand.select("Choose a Basic Energy card to attach to 1 of your Pokémon",cardTypeFilter(BASIC_ENERGY)).first()
              def tar = my.all.select("Choose a Pokémon to attach $card to")
              attachEnergy (tar,card)
              heal 20, tar
            }
          }
          move "Return", {
            text "40 damage. Draw cards until you have 6 cards in your hand."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              afterDamage {
                if(self.owner.pbg.hand.size() < 6) {
                  draw 6 - self.owner.pbg.hand.size()
                }
              }
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
              flip {
                damage 30
              }
            }
          }
        };
      case LUNATONE_32:
        return basic (this, hp:HP070, type:P, retreatCost:0) {
          weakness P, PLUS20
          pokeBody "Marvel Eyes", {
            text "If you have Solrock in play, prevent all effects of attacks, including damage, done to any of your Lunatone or Solrock by your opponent's Pokémon LV.X."
            delayedA {
              before null, null, Source.ATTACK, {
                PokemonCardSet pcs = e.getTargetPokemon()
                if (pcs && pcs.owner == self.owner && ["Solrock", "Lunatone"].contains(pcs.name) && self.owner.pbg.all.findAll{it.name == "Solrock"} && self.owner.opposite.pbg.active.pokemonLevelUp && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                  bc "$thisAbility prevents effect"
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to.owner == self.owner && ["Solrock", "Lunatone"].contains(it.to.name) && self.owner.pbg.all.findAll{it.name == "Solrock"} && it.from.pokemonLevelUp && it.notNoEffect && it.notZero){
                    it.dmg = hp(0)
                    bc "$thisAbility prevents damage"
                  }
                }
              }
              after ENERGY_SWITCH, {
                def efs = (ef as EnergySwitch)
                if(efs.to.owner == self.owner && ["Solrock", "Lunatone"].contains(efs.to.name) && self.owner.pbg.all.findAll{it.name == "Solrock"} && efs.from.pokemonLevelUp && bg.currentState == Battleground.BGState.ATTACK){
                  discard efs.card
                }
              }
            }
          }
          move "Gravity Wave", {
            text "30 damage. Does 30 damage to each of your opponent's Benched Pokémon that doesn't have a Retreat Cost. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 30
              opp.bench.each {
                if(it.retreatCost == 0) {
                  damage 30, it
                }
              }
            }
          }
        };
      case MAWILE_33:
        return basic (this, hp:HP070, type:M, retreatCost:1) {
          weakness R, PLUS20
          resistance P, MINUS20
          move "Turnaround Standby", {
            text "During your next turn, any damage done by Mawile's Swallow or Bite to your opponent's Active Pokémon is increased by 40 (before applying Weakness and Resistance)."
            energyCost M
            attackRequirement {}
            onAttack {
              increasedBaseDamageNextTurn("Swallow",hp(40))
              increasedBaseDamageNextTurn("Bite",hp(40))
            }
          }
          move "Swallow", {
            text "20 damage. Remove from Mawile the number of damage counters equal to the damage you did to the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              removeDamageCounterEqualToDamageDone()
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
          weakness P, PLUS20
          move "Channeling", {
            text "60 damage. Your opponent draws 2 cards."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 60
              if(opp.deck) {
                draw 2, TargetPlayer.OPPONENT
              }
            }
          }
          move "Chakra Points", {
            text "10+ damage. Does 10 damage plus 10 more damage for each card in your opponent's hand."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 10 + 10 * self.owner.opposite.pbg.hand.size()
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
              flip self.cards.energyCount(W), {
                damage 20
              }
            }
          }
          move "Wrap", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
        };
      case MOLTRES_36:
        return basic (this, hp:HP100, type:R, retreatCost:2) {
          weakness W, PLUS30
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
              flip {
                damage 80
              }
            }
          }
        };
      case MR__MIME_37:
        return basic (this, hp:HP070, type:P, retreatCost:1) {
          pokeBody "Focus Wall", {
            text "If Mr. Mime would be Knocked Out by damage from an attack that does 70 or more damage (after applying Weakness and Resistance), Mr. Mime is not Knocked Out and its remaining HP becomes 10 instead."
            delayedA {
              def flag
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && it.dmg.value >= 70) {
                    flag = true
                  }
                }
              }
              after APPLY_ATTACK_DAMAGES, {
                if(flag && self.slatedToKO) {
                  self.damage = self.fullHP - hp(10)
                  bc "$thisAbility saved $self!"
                }
                flag = false
              }
            }
          }
          move "Desperate Slap", {
            text "20+ damage. If Mr. Mime already has 5 or more damage counters on it, this attack does 20 damage plus 40 more damage."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
              if(self.numberOfDamageCounters >= 5) {
                damage 40
              }
            }
          }
        };
      case PARASECT_38:
        return evolution (this, from:"Paras", hp:HP080, type:G, retreatCost:1) {
          weakness R, PLUS20
          move "Nutritional Support", {
            text "Search your deck for up to 2 [G] Energy cards and attach them to any of your Pokémon in any way you like. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              attachEnergyFrom(type: G, max: 1, may:true, my.deck, my.all.select())
              attachEnergyFrom(type: G, max: 1, may:true, my.deck, my.all.select())
              shuffleDeck()
            }
          }
          move "Hibernation Spore", {
            text "40 damage. The Defending Pokémon is now Asleep. Flip 2 coins instead of 1 between turns. If either of them is tails, the Defending Pokémon is still Asleep."
            energyCost G, G, C
            attackRequirement {}
            onAttack {
              damage 40
              afterDamage {
                apply ASLEEP
                def pcs = defending
                targeted(pcs) {
                  if (pcs.isSPC(ASLEEP)) {
                    delayed {
                      before ASLEEP_SPC, null, null, BEGIN_TURN, {
                        flip "Asleep (Hibernation Spore)", 2, {}, {}, [2: {
                          ef.unregisterItself(bg.em());
                        }, 1:{
                          bc "$pcs is still asleep."
                        }, 0:{
                          bc "$pcs is still asleep."
                        }]
                        prevent()
                      }
                      after CLEAR_SPECIAL_CONDITION, pcs, {
                        if (ef.types.contains(ASLEEP)) {
                          unregister()
                        }
                      }
                      after FALL_BACK, pcs, { unregister() }
                      after KNOCKOUT, pcs, { unregister() }
                      after CHANGE_STAGE, pcs, { unregister() }
                    }
                  }
                }
              }
            }
          }
        };
      case PRIMEAPE_39:
        return evolution (this, from:"Mankey", hp:HP090, type:F, retreatCost:1) {
          weakness P, PLUS20
          move "Top Drop", {
            text "Discard the top card from your opponent's deck. If you discarded a Pokémon, this attack does damage equal to the HP of that Pokémon."
            energyCost C, C
            attackRequirement {
              assert opp.deck : "Your opponent's deck is empty"
            }
            onAttack {
              def card = opp.deck.first()
              if(card.cardTypes.is(POKEMON)) {
                damage card.asPokemonCard().hp.value
              }
              afterDamage {
                discard card
              }
            }
          }
          move "Brick Break", {
            text "40 damage. This attack's damage isn't affected by Resistance, Poké-Powers, Poké-Bodies, or any other effects on the Defending Pokémon."
            energyCost F, C
            attackRequirement {}
            onAttack {
              noResistanceOrAnyEffectDamage(40, defending)
            }
          }
        };
      case ROSERADE_C_40:
        return basic (this, hp:HP090, type:P, retreatCost:2) {
          weakness P
          pokeBody "Natural Cure", {
            text "When you attach an Energy card from your hand to Roserade C, remove all Special Conditions from Roserade C."
            delayedA {
              after ATTACH_ENERGY, self, {
                if (ef.reason == PLAY_FROM_HAND) {
                  clearSpecialCondition(self, Source.POKEBODY)
                }
              }
            }
          }
          move "Magical Leaf", {
            text "40+ damage. Flip a coin. If heads, this attack does 40 damage plus 20 more damage and remove 2 damage counters from Roserade C."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip {
                damage 20
                heal 20, self
              }
            }
          }
        };
      case SABLEYE_G_41:
        return basic (this, hp:HP070, type:D, retreatCost:1) {
          resistance C, MINUS20
          move "Scratch", {
            text "10 damage. "
            energyCost ()
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
              astonish()
            }
          }
        };
      case SANDSLASH_42:
        return evolution (this, from:"Sandshrew", hp:HP090, type:F, retreatCost:1) {
          weakness W, PLUS20
          resistance L, MINUS20
          pokePower "Dig Down", {
            text "Once during your turn (before your attack), you may look at the top 5 cards in your deck. Choose as many [F] Energy cards as you like, show them to your opponent, and put them into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward. This power can't be used if Sandslash is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.deck : "Your deck is empty"
              powerUsed()
              def top = my.deck.subList(0,5)
              top.select(min:0,max:top.filterByEnergyType(F).size(),"Choose as many [F] Energy cards as you like",energyFilter(F)).moveTo(my.hand)
              shuffleDeck()
            }
          }
          move "Needle", {
            text "40 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed and Poisoned."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip {
                afterDamage {
                  apply PARALYZED
                  apply POISONED
                }
              }
            }
          }
        };
      case SEAKING_43:
        return evolution (this, from:"Goldeen", hp:HP090, type:W, retreatCost:1) {
          weakness L, PLUS20
          move "Horn Pierce", {
            text "90 damage. Flip 2 coins. If either of them is tails, this attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 2, {}, {}, [2:{damage 90}]
            }
          }
          move "Endure", {
            text "30 damage. Flip a coin. If heads, during your opponent's next turn, if Seaking would be Knocked Out by damage from an attack, Seaking is not Knocked Out and its remaining HP becomes 10 instead."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                delayed {
                  before KNOCKOUT, self, {
                    if((ef as Knockout).byDamageFromAttack && bg.currentTurn==self.owner.opposite){
                      self.damage = self.fullHP - hp(10)
                      bc "$self endured the hit!"
                      prevent()
                    }
                  }
                  unregisterAfter 2
                  after CHANGE_STAGE, self, {unregister()}
                  after FALL_BACK, self, {unregister()}
                }
              }
            }
          }
        };
      case SHEDINJA_44:
        return evolution (this, from:"Nincada", hp:HP060, type:G, retreatCost:1) {
          weakness R, PLUS20
          pokeBody "Marvel Shell", {
            text "Prevent all effects of attacks, including damage, done to Shedinja by your opponent's Pokémon that has any Poké-Powers or Poké-Bodies."
            delayedA {
              before null, self, Source.ATTACK, {
                if ((self.owner.opposite.pbg.active.hasPokePower() || self.owner.opposite.pbg.active.hasPokeBody() || self.owner.opposite.pbg.active.hasPokemonPower()) && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
                  bc "$thisAbility prevents effect"
                  prevent()
                }
              }
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each {
                  if(it.to == self && it.notNoEffect && (it.from.hasPokePower() || it.from.hasPokeBody() || it.from.hasPokemonPower())){
                    it.dmg = hp(0)
                    bc "$thisAbility prevents damage"
                  }
                }
              }
              after ENERGY_SWITCH, {
                def efs = (ef as EnergySwitch)
                if((efs.from.hasPokePower() || efs.from.hasPokeBody() || efs.from.hasPokemonPower()) && efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
                  discard efs.card
                }
              }
            }
          }
          move "Spike Wound", {
            text "Choose 1 of your opponent's Pokémon that has any damage counters on it. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            attackRequirement {
              assert opp.all.find{it.numberOfDamageCounters} : "Your opponent's Pokémon are healthy"
            }
            onAttack {
              damage 30, opp.all.findAll{it.numberOfDamageCounters}.select(text)
            }
          }
        };
      case SOLROCK_45:
        return basic (this, hp:HP080, type:P, retreatCost:1) {
          weakness G, PLUS20
          pokePower "Sunshine Fate", {
            text "Once during your turn (before your attack), if you have Lunatone in play, you may look at the top 3 cards of your deck and put them back on top of your deck in any order. This power can't be used if Solrock is affected by a Special Condition."
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.all.find{it.name == "Lunatone"} : "You don't have Lunatone in play"
              assert my.deck : "Your deck is empty"
              powerUsed()
              def maxSize = Math.min(my.deck.size(),3)
              def list = rearrange(my.deck.subList(0,maxSize), "Rearrange top $maxSize cards of your deck")
              my.deck.setSubList(0, list)
              bc "$thisAbility rearranged the top cards of ${self.owner.getPlayerUsername(bg)}'s deck"
            }
          }
          move "Luna Turn", {
            text "30+ damage. If Lunatone is in your discard pile, this attack does 30 damage plus 30 more damage. Then, search your discard pile for Lunatone, show it to your opponent, and shuffle it into your deck."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              if(my.discard.find{it.name == "Lunatone"}) {
                damage 30
                afterDamage {
                  my.discard.select("Search your discard pile for Lunatone",{it.name == "Lunatone"}).showToOpponent("Luna Turn: Selected cards").moveTo(my.deck)
                  shuffleDeck()
                }
              }
            }
          }
        };
      case SPINDA_46:
        return basic (this, hp:HP070, type:C, retreatCost:1) {
          weakness F, PLUS20
          move "Synchro Removal", {
            text "If any Energy card attached to Spinda is the same type as any Energy card attached to the Defending Pokémon, discard 1 of those Energy cards from the Defending Pokémon."
            energyCost C
            def findShared = {
              TypeSet types = new TypeSet()
              self.cards.filterByType(ENERGY).each {
                it.asEnergyCard().getEffectiveEnergyTypes().each {
                  types.addAll(it)
                }
              }
              types.findAll {defending.cards.energySufficient(it)}
            }
            attackRequirement {
              assert findShared() : "$self and $defending don't have any Energy that share a type"
            }
            onAttack {
              CardList energyList = []
              findShared().each {
                energyList.addAll(defending.cards.filterByEnergyType(it))
              }
              energyList.unique()
              if(energyList) {
                energyList.select("Choose an Energy card to discard from $defending").discard()
              }
            }
          }
          move "Pulled Punch", {
            text "30 damage. If the Defending Pokémon already has any damage counters on it, this attack's base damage is 10 instead of 30."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              if(!defending.numberOfDamageCounters) {
                damage 20
              }
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
            onAttack {
              clearSpecialCondition(self)
              heal 40, self
              apply ASLEEP, self
            }
          }
          move "Giant Wave", {
            text "100 damage. Wailord can't use Giant Wave during your next turn."
            energyCost W, W, W, C, C
            attackRequirement {}
            onAttack {
              damage 100
              cantUseAttack(thisMove, self)
            }
          }
        };
      case ZAPDOS_48:
        return basic (this, hp:HP100, type:L, retreatCost:2) {
          weakness L, PLUS30
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
              flip {
                damage 20
              }
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
              applyAfterDamage ASLEEP
            }
          }
          move "Sonic Wing", {
            text "30 damage. This attack's damage isn't affected by Resistance."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              dontApplyResistance()
            }
          }
        };
      case ARCANINE_50:
        return evolution (this, from:"Growlithe", hp:HP080, type:R, retreatCost:3) {
          weakness W, PLUS20
          move "Overrun", {
            text "20 damage. Does 10 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              if(opp.bench) {
                damage 10, opp.bench.select("Does 10 damage to 1 of your opponent's Benched Pokémon")
              }
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
          weakness F, PLUS20
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
              flip 2, {
                damage 30
              }
            }
          }
        };
      case BRELOOM_52:
        return evolution (this, from:"Shroomish", hp:HP090, type:F, retreatCost:1) {
          weakness R, PLUS20
          move "Hover Hit", {
            text "40 damage. The Retreat Cost for the Defending Pokémon is 0 until the end of your next turn."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 40
              afterDamage {
                delayed {
                  def eff=null
                  register {
                    eff = getter GET_RETREAT_COST, defending, {holder->
                      holder.object = 0
                    }
                  }
                  unregister {
                    eff.unregister()
                  }
                  unregisterAfter 2
                  after FALL_BACK, defending, {unregister()}
                  after CHANGE_STAGE, defending, {unregister()}
                }
              }
            }
          }
          move "Crash Bomber", {
            text "20+ damage. If the Defending Pokémon has any Special Energy cards attached to it, this attack does 20 damage plus 40 more damage. Then, discard a Special Energy card attached to the Defending Pokémon."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              if(defending.cards.filterByType(SPECIAL_ENERGY)) {
                damage 40
                def card = defending.cards.select("Discard a Special Energy card attached to $defending",cardTypeFilter(SPECIAL_ENERGY))
                afterDamage {
                  card.discard()
                }
              }
            }
          }
        };
      case CARNIVINE_53:
        return basic (this, hp:HP080, type:G, retreatCost:2) {
          weakness R, PLUS20
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
              flip {
                removeDamageCounterEqualToDamageDone()
              }
            }
          }
        };
      case CHATOT_G_54:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness L
          resistance F, MINUS20
          pokePower "Disrupting Spy", {
            text "Once during your turn, when you put Chatot G from your hand onto your Bench, you may look at the top 4 cards of your opponent's deck. Put them back on top of your opponent's deck in any order."
            onActivate {r->
              if (r==PLAY_FROM_HAND && confirm('Use Disrupting Spy?')) {
                powerUsed()
                def maxSize = Math.min(opp.deck.size(),4)
                def list = rearrange(opp.deck.subList(0,maxSize), "Rearrange top $maxSize cards of your opponent's deck")
                opp.deck.setSubList(0, list)
                bc "$thisAbility rearranged the top cards of ${self.owner.opposite.getPlayerUsername(bg)}'s deck"
              }
            }
          }
          move "Search and Escape", {
            text "Search your deck for a Trainer card, show it to your opponent, and put it into your hand. Put Chatot G and all cards attached to it on top of your deck. Shuffle your deck afterward."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search("Search your deck for a Trainer card",cardTypeFilter(ITEM)).showToOpponent("Search and Escape: Selected card").moveTo(my.hand)
              self.cards.moveTo(my.deck)
              shuffleDeck()
              removePCS(self)
            }
          }
        };
      case CHERRIM_55:
        return evolution (this, from:"Cherubi", hp:HP080, type:G, retreatCost:1) {
          weakness R, PLUS20
          resistance W, MINUS20
          move "Ram", {
            text "20 damage. "
            energyCost ()
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
              flip 3, {
                damage 30
              }
              afterDamage {
                apply CONFUSED, self
              }
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
              if(defending.pokemonSP) {
                damage 60
              }
            }
          }
          move "Giant Tail", {
            text "100 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C, C, C, C
            attackRequirement {}
            onAttack {
              flip {
                damage 100
              }
            }
          }
        };
      case DRIFBLIM_57:
        return evolution (this, from:"Drifloon", hp:HP080, type:P, retreatCost:1) {
          weakness D, PLUS20
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
          weakness L, PLUS20
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
              flip {
                damage 10
              }
            }
          }
        };
      case GABITE_59:
        return evolution (this, from:"Gible", hp:HP080, type:C, retreatCost:1) {
          weakness C, PLUS20
          move "Healing Scale", {
            text "Remove 1 damage counter from each of your Pokémon."
            energyCost ()
            attackRequirement {
              assert my.all.find{it.numberOfDamageCounters} : "Your Pokémon are healthy"
            }
            onAttack {
              my.all.each {
                heal 10, it
              }
            }
          }
          move "Sand Tomb", {
            text "30 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              cantRetreat defending
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
              my.bench.each {
                damage 10, it
              }
            }
          }
        };
      case HIPPOPOTAS_61:
        return basic (this, hp:HP070, type:F, retreatCost:2) {
          weakness W, PLUS10
          move "Double Headbutt", {
            text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 2, {
                damage 10
              }
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
        return evolution (this, from:"Bulbasaur", hp:HP080, type:G, retreatCost:2) {
          weakness R, PLUS20
          pokePower "Evolutionary Pollen", {
            text "Once during your turn, when you play Ivysaur from your hand to evolve 1 of your Pokémon, you may use this power. Your opponent's Active Pokémon is now Asleep."
            onActivate {r->
              if (r==PLAY_FROM_HAND && confirm('Use Evolutionary Pollen?')) {
                powerUsed()
                apply ASLEEP, opp.active, POKEPOWER
              }
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
          weakness F, PLUS20
          move "Ice Beam", {
            text "20 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              flip {
                applyAfterDamage PARALYZED
              }
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
          weakness F, PLUS20
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
              afterDamage {
                if(opp.deck) {
                  discard opp.deck.first()
                }
              }
            }
          }
        };
      case MAGMAR_65:
        return basic (this, hp:HP070, type:R, retreatCost:1) {
          weakness W, PLUS20
          move "Smokescreen", {
            text "If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              sandAttack(thisMove)
            }
          }
          move "Fireworks", {
            text "30 damage. Flip a coin. If tails, discard a [R] Energy attached to Magmar."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 30
              flip 1, {}, {
                discardSelfEnergyAfterDamage R
              }
            }
          }
        };
      case MANECTRIC_G_66:
        return basic (this, hp:HP080, type:L, retreatCost:1) {
          weakness F
          resistance M, MINUS20
          move "Energy Absorption", {
            text "Search your discard pile for up to 2 Energy cards and attach them to Manectric G."
            energyCost ()
            attackRequirement {
              assert my.discard.filterByType(ENERGY)
            }
            onAttack {
              attachEnergyFrom(max:2,my.discard,self)
            }
          }
          move "Thunder Fang", {
            text "30 damage. Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost L, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
        };
      case MARSHTOMP_67:
        return evolution (this, from:"Mudkip", hp:HP080, type:W, retreatCost:1) {
          weakness G, PLUS20
          pokePower "Plunge", {
            text "Once during your turn (before your attack), if Marshtomp is on your Bench, you may flip a coin. If heads, move all Energy cards attached to your Active Pokémon to Marshtomp. If you do, switch Marshtomp with that Active Pokémon."
            actionA {
              checkLastTurn()
              assert self.benched : "$self is not on your Bench"
              assert my.active.energyCards : "Your Active Pokémon must have Energy cards attached"
              powerUsed()
              flip {
                bc "$thisAbility moves all Energy cards from $my.active to $self"
                my.active.cards.filterByType(ENERGY).each {
                  energySwitch(my.active,self,it)
                }
                sw(my.active,self)
              }
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
        return evolution (this, from:"Surskit", hp:HP080, type:G, retreatCost:0) {
          weakness L, PLUS20
          resistance F, MINUS20
          pokeBody "Intimidating Pattern", {
            text "As long as Masquerain is your Active Pokémon, any damage done by an opponent's attack is reduced by 20 (before applying Weakness and Resistance)."
            delayedA {
              after PROCESS_ATTACK_EFFECTS, {
                bg.dm().each {
                  if(self.active && it.from.owner == self.owner.opposite) {
                    bc "$thisAbility -20"
                    it.dmg -= hp(20)
                  }
                }
              }
            }
          }
          move "Skim Attack", {
            text "30 damage. Draw 2 cards."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 30
              afterDamage {
                draw 2
              }
            }
          }
        };
      case METANG_69:
        return evolution (this, from:"Beldum", hp:HP080, type:M, retreatCost:2) {
          weakness R, PLUS20
          resistance P, MINUS20
          pokeBody "Metallic Lift", {
            text "If Metang has any [M] Energy attached to it, the Retreat Cost for Metang is 0."
            getterA GET_RETREAT_COST, self, {h ->
              if (self.cards.energyCount(M)) {
                h.object = 0
              }
            }
          }
          move "Psychic", {
            text "40+ damage. Does 40 damage plus 10 more damage for each Energy attached to the Defending Pokémon."
            energyCost M, C, C
            attackRequirement {}
            onAttack {
              damage 40 + 10 * defending.cards.energyCount(C)
            }
          }
        };
      case MILOTIC_70:
        return evolution (this, from:"Feebas", hp:HP090, type:W, retreatCost:1) {
          weakness L, PLUS20
          move "Cleansing Ring", {
            text "20 damage. You may discard 2 cards from your hand. If you do, remove 4 damage counters from 1 of your Pokémon."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
              if(my.all.find{it.numberOfDamageCounters && my.hand.size() >= 2 && confirm("Discard 2 cards to remove 4 damage counters from 1 of your Pokémon?")}) {
                def cards = my.hand.select(count:2,"Discard which 2 cards?")
                afterDamage {
                  heal 40, my.all.findAll{it.numberOfDamageCounters}.select("remove 4 damage counters from which Pokémon?")
                  cards.discard()
                }
              }
            }
          }
          move "Scale Blow", {
            text "90- damage. Does 90 damage minus 10 damage for each card in your hand."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 90 - 10 * my.hand.size()
            }
          }
        };
      case MINUN_71:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Call for Family", {
            text "Search your deck for up to 2 Lightning Basic Pokémon and put them onto your Bench. Shuffle your deck afterward."
            energyCost ()
            callForFamily([basic:true, types:[L]], 2, delegate)
          }
          move "Trash Charge", {
            text "10 damage. Search your discard pile for a [L] Energy card and attach it to 1 of your Pokémon."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
              attachEnergyFrom(type:L,my.discard,my.all)
            }
          }
        };
      case MURKROW_72:
        return basic (this, hp:HP070, type:D, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Switcheroo", {
            text "Move a Pokémon Tool card attached to 1 of your opponent's Pokémon to another of your opponent's Pokémon (excluding Pokémon that already has a Pokémon Tool attached to it). (If an effect of this attack is prevented, this attack does nothing.)"
            energyCost ()
            attackRequirement {
              assert opp.all.find{it.cards.filterByType(POKEMON_TOOL)} : "Your opponent has no Pokémon Tools attached"
            }
            onAttack {
              def pcs = opp.all.findAll { it.cards.filterByType(POKEMON_TOOL) }.select("Source Pokémon that has a Tool to move")
              targeted (pcs) {
                def card = pcs.cards.filterByType(POKEMON_TOOL).select("Pokémon Tool to move").first() as PokemonToolCard
                def pl = opp.all.findAll { canAttachPokemonTool(it, card) && it!=pcs }
                if(!pl){wcu "No available Pokemon to move this card"; return}
                def tar = pl.select("Move $card to which Pokémon?")
                targeted (tar) {
                  attachPokemonTool(card, tar)
                }
              }
            }
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
        return evolution (this, from:"Nincada", hp:HP080, type:G, retreatCost:0) {
          weakness R, PLUS20
          resistance F, MINUS20
          move "Circling Dive", {
            text "This attack does 10 damage to each of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) Switch Ninjask with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              opp.all.each {
                damage 10, it
              }
              switchYourActive()
            }
          }
          move "Parallel Drain", {
            text "30 damage. Remove from 1 of your Pokémon the number of damage counters equal to the damage you did to the Defending Pokémon."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 30
              def dmg
              delayed {
                before APPLY_ATTACK_DAMAGES, {
                  if (ef.attacker == self && my.all.find{ it.numberOfDamageCounters }) {
                    dmg = bg.dm().getTotalDamage(self, defending).value
                  }
                }
                unregisterAfter 1
              }
              afterDamage {
                heal dmg, my.all.findAll{ it.numberOfDamageCounters }.select("Heal which Pokémon?")
              }
            }
          }
        };
      case NUMEL_74:
        return basic (this, hp:HP070, type:R, retreatCost:2) {
          weakness W, PLUS20
          move "Draw In", {
            text "Search your discard pile for up to 2 [R] Energy cards and attach them to Numel."
            energyCost C
            attackRequirement {
              assert my.discard.filterByEnergyType(R) : "You have no [R] Energy cards in your discard pile"
            }
            onAttack {
              attachEnergyFrom(min:1,max:2,type:R,my.discard,self)
            }
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
          weakness R, PLUS20
          move "Gripthrow", {
            text "Flip a coin. If heads, your opponent returns the Defending Pokémon and all cards attached to it to his or her hand."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip {
                scoopUpPokemon(defending, delegate)
              }
            }
          }
          move "Sever", {
            text "50+ damage. If the Defending Pokémon is a Stage 2 Pokémon, this attack does 50 damage plus 30 more damage."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 50
              if(defending.stage2) {
                damage 30
              }
            }
          }
        };
      case PLUSLE_76:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness F, PLUS10
          resistance M, MINUS20
          move "Greedy Draw", {
            text "If you have the same number of cards or less in your hand as your opponent, draw cards until you have 1 more card than your opponent. (If you have more cards in your hand than your opponent, this attack does nothing.)"
            energyCost ()
            attackRequirement {
              assert my.hand.size() <= opp.hand.size() : "You have more cards in your hand than your opponent"
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              draw opp.hand.size() - my.hand.size() + 1
            }
          }
          move "Hand Charge", {
            text "10 damage. Attach a [L] Energy card from your hand to 1 of your Pokémon."
            energyCost L
            attackRequirement {}
            onAttack {
              damage 10
              afterDamage {
                attachEnergyFrom(type:L,my.hand,my.all)
              }
            }
          }
        };
      case RAICHU_77:
        return evolution (this, from:"Pikachu", hp:HP090, type:L, retreatCost:0) {
          weakness F, PLUS20
          resistance M, MINUS20
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
          move "Gigashock", {
            text "60 damage. Does 10 damage to 2 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost L, L, C
            attackRequirement {}
            onAttack {
              damage 60
              if(opp.bench) {
                multiSelect(opp.bench,2,"Does 10 damage to 2 of your opponent's Benched Pokémon").each {
                  damage 10, it
                }
              }
            }
          }
        };
      case RATICATE_G_78:
        return basic (this, hp:HP070, type:C, retreatCost:0) {
          weakness F
          move "Find", {
            text "Search your discard pile for a Trainer card or a Supporter card, show it to your opponent, and put it into your hand."
            energyCost C
            attackRequirement {
              assert my.discard.filterByType(ITEM) || my.discard.filterByType(SUPPORTER) : "You have no Trainer or Supporter cards in your discard pile"
            }
            onAttack {
              my.discard.select(text,{it.cardTypes.isIn(ITEM,SUPPORTER)}).showToOpponent("Find: Selected card").moveTo(my.hand)
            }
          }
          move "Biting Fang", {
            text "10+ damage. Flip a coin, if heads this attack does 10 damage plus 20 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                damage 20
              }
            }
          }
        };
      case RELICANTH_79:
        return basic (this, hp:HP080, type:F, retreatCost:1) {
          weakness G, PLUS20
          move "Grand Swell", {
            text "Choose 1 of your opponent's Pokémon. This attack does 30 damage to that Pokémon for each Pokémon Tool and Stadium card your opponent has in play. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost F
            attackRequirement {
              assert opp.all.find{it.cards.filterByType(POKEMON_TOOL)} || (bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player == self.owner.opposite) : "Your opponent has no Pokémon Tools or Stadium card in play"
            }
            onAttack {
              def count = 0
              opp.all.each {
                count += it.cards.filterByType(POKEMON_TOOL).size()
              }
              if(bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.player == self.owner.opposite) {
                count ++
              }
              damage 30 * count, opp.all.select()
            }
          }
          move "Amnesia", {
            text "30 damage. Choose 1 of the Defending Pokémon's attacks. That Pokémon can't use that attack during your opponent's next turn."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 30
              amnesia delegate
            }
          }
        };
      case RHYDON_80:
        return evolution (this, from:"Rhyhorn", hp:HP090, type:F, retreatCost:3) {
          weakness W, PLUS20
          resistance L, MINUS20
          move "Fury Attack", {
            text "20x damage. Flip 3 coins. This attack does 20 damage times the number of heads."
            energyCost F
            attackRequirement {}
            onAttack {
              flip 3, {
                damage 20
              }
            }
          }
          move "Rock Tumble", {
            text "60 damage. This attack's damage isn't affected by Resistance."
            energyCost F, F, C
            attackRequirement {}
            onAttack {
              damage 60
              dontApplyResistance()
            }
          }
        };
      case ROSERADE_81:
        return evolution (this, from:"Roselia", hp:HP080, type:G, retreatCost:2) {
          weakness R, PLUS20
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
              applyAfterDamage POISONED
            }
          }
        };
      case ROTOM_82:
        return basic (this, hp:HP070, type:L, retreatCost:1) {
          weakness D, PLUS20
          resistance C, MINUS20
          move "Discharge", {
            text "40x damage. Discard all [L] Energy attached to Rotom. Flip a coin for each Energy card you discarded. This attack does 40 damage times the number of heads."
            energyCost L
            attackRequirement {}
            onAttack {
              def cards = self.cards.filterByEnergyType(L)
              flip cards.size(), {
                damage 40
              }
              afterDamage {
                cards.discard()
              }
            }
          }
          move "Uproar", {
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
              delayed {
                after PUT_ON_BENCH, {
                  if(ef.basicFromHand && bg.currentTurn == self.owner.opposite){
                    ef.place.damage += 20
                  }
                }
                unregisterAfter 2
              }
            }
          }
          move "Metal Max", {
            text "20+ damage. Discard all [M] Energy attached to Skarmory FB. Flip a coin for each Energy card you discarded. This attack does 20 damage plus 40 damage for each heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              def cards = self.cards.filterByEnergyType(M)
              flip cards.size(), {
                damage 40
              }
              afterDamage {
                cards.discard()
              }
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
            onAttack {
              damage 10, opp.all.select()
            }
          }
          move "Lock Up", {
            text "20 damage. The Defending Pokémon can't retreat during your opponent's next turn."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 20
              cantRetreat defending
            }
          }
        };
      case STARAVIA_85:
        return evolution (this, from:"Starly", hp:HP070, type:C, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Double Peck", {
            text "20x damage. Flip 2 coins. This attack does 20 damage times the number of heads."
            energyCost C, C
            attackRequirement {}
            onAttack {
              flip 2, {
                damage 20
              }
            }
          }
          move "Air Crash", {
            text "30 damage. Flip a coin. If heads, discard an Energy card attached to the Defending Pokémon."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip {
                discardDefendingEnergyAfterDamage C
              }
            }
          }
        };
      case TOGEKISS_C_86:
        return basic (this, hp:HP070, type:C, retreatCost:0) {
          weakness L
          resistance F, MINUS20
          move "Collect", {
            text "Draw a card."
            energyCost ()
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              draw 1
            }
          }
          move "Reckless Charge", {
            text "30 damage. Togekiss C does 10 damage to itself."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              damage 10, self
            }
          }
        };
      case WAILMER_87:
        return basic (this, hp:HP080, type:W, retreatCost:3) {
          weakness L, PLUS20
          move "Hydro Pump", {
            text "20+ damage. Does 20 damage plus 10 more damage for each [W] Energy attached to Wailmer but not used to pay for this attack's Energy cost. You can't add more than 20 damage in this way."
            energyCost W, C
            attackRequirement {}
            onAttack {
              damage 20
              extraEnergyDamage(2,hp(10),W,thisMove)
            }
          }
          move "Take Down", {
            text "50 damage. Wailmer does 20 damage to itself."
            energyCost W, C, C
            attackRequirement {}
            onAttack {
              damage 50
              damage 20, self
            }
          }
        };
      case YANMA_88:
        return basic (this, hp:HP070, type:G, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Supersonic", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                apply CONFUSED
              }
            }
          }
          move "Air Slash", {
            text "20 damage. Flip a coin. If tails, discard an Energy attached to Yanma."
            energyCost G
            attackRequirement {}
            onAttack {
              damage 20
              flip 1, {}, {
                discardSelfEnergyAfterDamage C
              }
            }
          }
        };
      case BALTOY_89:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P, PLUS10
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
              flip 2, {
                damage 20
              }
            }
          }
        };
      case BELDUM_90:
        return basic (this, hp:HP050, type:M, retreatCost:2) {
          weakness R, PLUS10
          resistance P, MINUS20
          move "Pit Search", {
            text "Search your deck for a Stadium card, show it to your opponent, and put it into your hand. Shuffle your deck afterward."
            energyCost C
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              my.deck.search(text,cardTypeFilter(STADIUM)).showToOpponent("Pit Search: Selected card").moveTo(my.hand)
              shuffleDeck()
            }
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
          weakness F, PLUS10
          move "Whimsy Tackle", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                damage 20
              }
            }
          }
        };
      case BUIZEL_92:
        return basic (this, hp:HP050, type:W, retreatCost:1) {
          weakness L, PLUS10
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
          weakness R, PLUS10
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
          weakness F, PLUS10
          move "Bounce", {
            text "Switch Buneary with 1 of your Benched Pokémon."
            energyCost C
            attackRequirement {}
            onAttack {
              switchYourActive()
            }
          }
          move "Mini Drain", {
            text "20 damage. Remove 1 damage counter from Buneary."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 20
              afterDamage {
                heal 10, self
              }
            }
          }
        };
      case CHATOT_95:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(basic: true, 1, delegate)
          }
          move "Nosedive", {
            text "30 damage. Flip a coin. If tails, Chatot does 10 damage to itself."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 30
              flip 1, {}, {
                damage 10, self
              }
            }
          }
        };
      case CHERUBI_96:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R, PLUS10
          resistance W, MINUS20
          move "Growth", {
            text "Attach a [G] Energy from your hand to Cherubi."
            energyCost ()
            attackRequirement {
              assert my.hand.filterByEnergyType(G) : "You have no [G] Energy cards in your hand"
            }
            onAttack {
              attachEnergyFrom(type:g,my.hand,self)
            }
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
          weakness W, PLUS10
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
              flip {
                damage 20
              }
            }
          }
        };
      case CHINGLING_98:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
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
          move "Chime", {
            text "Search your opponent's discard pile for a Supporter card and use the effect of that card as the effect of this attack. (The Supporter card remains in your opponent's discard pile.)"
            energyCost ()
            attackRequirement {
              assert opp.discard.filterByType(SUPPORTER) : "There are no Supporter cards in your opponent's discard pile"
            }
            onAttack {
              def card = opp.discard.select(min:0, "Opponent's hand. Select a Supporter.", cardTypeFilter(SUPPORTER)).first()
              bg.em().run(new ActivateSimpleTrainer(card))
            }
          }
        };
      case COMBEE_99:
        return basic (this, hp:HP040, type:G, retreatCost:1) {
          weakness R, PLUS10
          resistance F, MINUS20
          move "Nap", {
            text "Remove 2 damage counters from Combee."
            energyCost G
            attackRequirement {
              assert self.numberOfDamageCounters : "$self is healthy"
            }
            onAttack {
              heal 20, self
            }
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
          weakness L, PLUS10
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
              flip {
                damage 10
              }
            }
          }
        };
      case CROAGUNK_101:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness P, PLUS10
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
        return basic (this, hp:HP050, type:C, retreatCost:0) {
          weakness L, PLUS10
          resistance F, MINUS20
          move "Take Down", {
            text "20 damage. Doduo does 10 damage to itself."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
              damage 10, self
            }
          }
        };
      case DRIFLOON_103:
        return basic (this, hp:HP040, type:P, retreatCost:1) {
          weakness D, PLUS10
          resistance C, MINUS20
          move "Reckless Charge", {
            text "20 damage. Drifloon does 10 damage to itself."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 20
              damage 10, self
            }
          }
          move "Collect", {
            text "Draw a card."
            energyCost P
            attackRequirement {
              assert my.deck : "Your deck is empty"
            }
            onAttack {
              draw 1
            }
          }
        };
      case FEEBAS_104:
        return basic (this, hp:HP030, type:W, retreatCost:1) {
          weakness L, PLUS10
          move "Surprise Attack", {
            text "20 damage. Flip a coin. If tails, this attack does nothing."
            energyCost ()
            attackRequirement {}
            onAttack {
              flip {
                damage 20
              }
            }
          }
          move "Count and Draw", {
            text "Draw a card for each of your opponent's Pokémon that isn't an Evolved Pokémon."
            energyCost W
            attackRequirement {
              assert my.deck : "Your deck is empty"
              assert opp.all.find{!it.evolution} : "All of your opponent's Pokémon are Evolved Pokémon"
            }
            onAttack {
              draw opp.all.findAll{!it.evolution}.size()
            }
          }
        };
      case GEODUDE_105:
        return basic (this, hp:HP060, type:F, retreatCost:2) {
          weakness W, PLUS10
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
              flip {
                damage 30
              }
            }
          }
        };
      case GIBLE_106:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness C, PLUS10
          move "Sand Attack", {
            text "If the Defending Pokémon tries to attack during your opponent's next turn, your opponent flips a coin. If tails, that attack does nothing."
            energyCost C
            attackRequirement {}
            onAttack {
              sandAttack thisMove
            }
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
          weakness L, PLUS10
          move "Flail", {
            text "10x damage. Does 10 damage times the number of damage counters on Goldeen."
            energyCost C
            attackRequirement {
              assert self.numberOfDamageCounters : "$self is healthy"
            }
            onAttack {
              damage 10 * self.numberOfDamageCounters
            }
          }
          move "Fury Attack", {
            text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost W
            attackRequirement {}
            onAttack {
              flip 3, {
                damage 10
              }
            }
          }
        };
      case GROWLITHE_108:
        return basic (this, hp:HP060, type:R, retreatCost:1) {
          weakness W, PLUS10
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
              flip 1, {}, {
                discardSelfEnergyAfterDamage R
              }
            }
          }
        };
      case KRICKETOT_109:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R, PLUS10
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
          weakness L, PLUS10
          move "Flail Around", {
            text "10x damage. Flip 3 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 3, {
                damage 10
              }
            }
          }
        };
      case MAGNEMITE_111:
        return basic (this, hp:HP040, type:L, retreatCost:1) {
          weakness F, PLUS10
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
              flip {
                damage 20
              }
            }
          }
        };
      case MANKEY_112:
        return basic (this, hp:HP050, type:F, retreatCost:1) {
          weakness P, PLUS10
          move "Extra Punch", {
            text "10+ damage. If the Defending Pokémon is a Pokémon LV.X, this attack does 10 damage plus 50 more damage."
            energyCost F
            attackRequirement {}
            onAttack {
              damage 10
              if(defending.pokemonLevelUp) {
                damage 50
              }
            }
          }
        };
      case MEDITITE_113:
        return basic (this, hp:HP060, type:P, retreatCost:1) {
          weakness P, PLUS10
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
            attackRequirement {
              assert self.numberOfDamageCounters < 3 : "This attack will deal no damage"
            }
            onAttack {
              damage 30 - 10 * self.numberOfDamageCounters
            }
          }
        };
      case MEOWTH_114:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F, PLUS10
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
              flip 2, {
                damage 20
              }
            }
          }
        };
      case MIME_JR__115:
        return basic (this, hp:HP050, type:P, retreatCost:1) {
          weakness P, PLUS10
          pokePower "Baby Evolution", {
            text "Once during your turn (before your attack), you may put Mr. Mime from your hand onto Mime Jr. (this counts as evolving Mime Jr.) and remove all damage counters from Mime Jr."
            actionA {
              checkCanBabyEvolve("Mr. Mime", self)
              checkLastTurn()
              powerUsed()
              babyEvolution("Mr. Mime", self)
            }
          }
          move "Encore", {
            text "Choose 1 of the Defending Pokémon's attacks. That Pokémon can use only that attack during your opponent's next turn."
            energyCost C
            attackRequirement {
              assert !defending.topPokemonCard.moves.isEmpty() : "$defending has no attacks"
            }
            onAttack {
              def move=choose(defending.topPokemonCard.moves, defending.topPokemonCard.moves.collect({it.name}), "Encore") as Move
              def pcs = defending
              bc "$pcs can only use ${move.name} next turn."
              delayed{
                before CHECK_ATTACK_REQUIREMENTS, {
                  if (ef.move != move) {
                    wcu "$pcs can only use ${move.name}"
                    prevent()
                  }
                }
                unregisterAfter 2
                after FALL_BACK, pcs, {unregister()}
                after CHANGE_STAGE, pcs, {unregister()}
              }
            }
          }
        };
      case MUDKIP_116:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness G, PLUS10
          move "Mud Sport", {
            text "10+ damage. If Mudkip has less Energy attached to it than the Defending Pokémon, this attack does 10 damage plus 10 more damage."
            energyCost W
            attackRequirement {}
            onAttack {
              damage 10
              if(self.cards.energyCount(C) < defending.cards.energyCount(C)) {
                damage 10
              }
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
          weakness R, PLUS10
          move "Call for Family", {
            text "Search your deck for a Basic Pokémon and put it onto your Bench. Shuffle your deck afterward."
            energyCost C
            callForFamily(basic: true, 1, delegate)
          }
          move "Dash Attack", {
            text "Choose 1 of your opponent's Benched Pokémon. This attack does 10 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
            energyCost C
            attackRequirement {
              assert opp.bench : "Your opponent has no Benched Pokémon"
            }
            onAttack {
              damage 10, opp.bench.select(text)
            }
          }
        };
      case PACHIRISU_118:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness F, PLUS10
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
              flip {
                damage 10
              }
            }
          }
        };
      case PARAS_119:
        return basic (this, hp:HP050, type:G, retreatCost:1) {
          weakness R, PLUS10
          move "Spore", {
            text "The Defending Pokémon is now Asleep."
            energyCost C
            attackRequirement {}
            onAttack {
              apply ASLEEP
            }
          }
          move "Stomp", {
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
      case PIKACHU_120:
        return basic (this, hp:HP050, type:L, retreatCost:1) {
          weakness F, PLUS10
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
              flip {
                applyAfterDamage PARALYZED
              }
            }
          }
        };
      case PIPLUP_121:
        return basic (this, hp:HP060, type:W, retreatCost:1) {
          weakness L, PLUS10
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
          weakness W, PLUS10
          resistance L, MINUS20
          move "Stomp", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 20 more damage."
            energyCost C, C
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                damage 20
              }
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
          weakness R, PLUS10
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
              flip {
                applyAfterDamage POISONED
              }
            }
          }
        };
      case SANDSHREW_124:
        return basic (this, hp:HP050, type:F, retreatCost:1) {
          weakness W, PLUS10
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
          weakness M, PLUS10
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
              flip {
                applyAfterDamage ASLEEP
              }
            }
          }
        };
      case SHINX_126:
        return basic (this, hp:HP060, type:L, retreatCost:1) {
          weakness F, PLUS10
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
          weakness R, PLUS10
          resistance W, MINUS20
          move "Stun Spore", {
            text "Flip a coin. If heads, the Defending Pokémon is now Paralyzed."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                apply PARALYZED
              }
            }
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
          weakness P, PLUS10
          move "Poison Sting", {
            text "10 damage. Flip a coin. If heads, the Defending Pokémon is now Poisoned."
            energyCost P, C
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                applyAfterDamage POISONED
              }
            }
          }
          move "Tail Smash", {
            text "40 damage. Flip a coin. If tails, this attack does nothing."
            energyCost P, C, C
            attackRequirement {}
            onAttack {
              flip {
                damage 40
              }
            }
          }
        };
      case STARLY_129:
        return basic (this, hp:HP050, type:C, retreatCost:1) {
          weakness L, PLUS10
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
          weakness R, PLUS10
          move "Quick Attack", {
            text "10+ damage. Flip a coin. If heads, this attack does 10 damage plus 10 more damage."
            energyCost C
            attackRequirement {}
            onAttack {
              damage 10
              flip {
                damage 10
              }
            }
          }
        };
      case TURTWIG_131:
        return basic (this, hp:HP060, type:G, retreatCost:2) {
          weakness R, PLUS10
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
              flip {
                damage 10
              }
            }
          }
        };
      case WHISMUR_132:
        return basic (this, hp:HP060, type:C, retreatCost:1) {
          weakness F, PLUS10
          move "Tone-Deaf", {
            text "Flip a coin. If heads, the Defending Pokémon is now Confused."
            energyCost C
            attackRequirement {}
            onAttack {
              flip {
                apply CONFUSED
              }
            }
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
          weakness P, PLUS10
          resistance F, MINUS20
          move "Quick Turn", {
            text "10x damage. Flip 2 coins. This attack does 10 damage times the number of heads."
            energyCost C
            attackRequirement {}
            onAttack {
              flip 2, {
                damage 10
              }
            }
          }
        };
      case BATTLE_TOWER_134:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
            "Whenever any player plays any Pokémon from his or her hand to Level-Up 1 of his or her Pokémon, remove 4 damage counters from that Pokémon."
          def eff
          onPlay {
            eff = delayed {
              after LEVEL_UP, {
                if(ef.activationReason == PLAY_FROM_HAND) {
                  bc "Battle Tower activates"
                  heal(40, ef.pokemonToLevelUp, TRAINER_CARD)
                }
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case CHAMPION_S_ROOM_135:
        return stadium (this) {
          text "This card stays in play when you play it. Discard this card if another Stadium card comes into play. If another card with the same name is in play, you can't play this card." +
            "The Retreat cost for each Pokémon SP (both yours and your opponent's) is [C] less."
          def eff
          onPlay {
            eff = getter (GET_RETREAT_COST) { Holder h->
              if(h.effect.target.pokemonSP) {
                h.object -= 1
              }
            }
          }
          onRemoveFromPlay{
            eff.unregister()
          }
        };
      case CYNTHIA_S_GUIDANCE_136:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
            "Look at the top 7 cards of your deck, choose 1 of them, and put it into your hand. Put the other cards back on top of your deck. Shuffle your deck afterward."
          onPlay {
            my.deck.subList(0,7).select("Choose a card to put into your hand").moveTo(hidden: true, my.hand)
            shuffleDeck()
          }
          playRequirement{
            assert my.deck : "Your deck is empty"
          }
        };
      case CYRUS_S_INITIATIVE_137:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
            "Flip 2 coins. If either of them is heads, look at your opponent's hand. For each heads, choose 1 card from your opponent's hand and put it on the bottom of your opponent's deck in any order."
          onPlay {
            def count = 0
            flip 2, {
              count++
            }
            if(count) {
              rearrange(opp.hand.select(count:count,"Choose $count cards to put on the botto of your opponent's deck")).showToOpponent("Cyrus's Initiative: Your opponent selected the following cards. They'll be put in the bottom of your deck in the displayed order:").moveTo(opp.deck)
            }
          }
          playRequirement{
            assert opp.hand : "Your opponent's hand is empty"
          }
        };
      case NIGHT_TELEPORTER_138:
        return itemCard (this) {
          text "Flip a coin. If heads, put all cards in your hand on top of your deck. Then, search your deck for any 1 card and put it into your hand. Shuffle your deck afterward."
          onPlay {
            //https://compendium.pokegym.net/compendium-lvx.html#420
            flip {
              my.hand.getExcludedList(thisCard).moveTo(hidden:true,my.deck)
              my.deck.select("Search your deck for a card").moveTo(hidden:true,my.hand)
              shuffleDeck()
            }
          }
          playRequirement{
            assert my.hand.getExcludedList(thisCard) || my.deck : "You have no other cards in your hand or deck"
          }
        };
      case PALMER_S_CONTRIBUTION_139:
        return supporter (this) {
          text "You can play only one Supporter card each turn. When you play this card, put it next to your Active Pokémon. When your turn ends, discard this card." +
            "Search your discard pile for up to 5 in any combination of Pokémon and basic Energy cards. Show them to your opponent and shuffle them into your deck."
          onPlay {
            my.discard
              .findAll{it.cardTypes.contains(BASIC_ENERGY) || it.cardTypes.contains(POKEMON)}
              .select(min:1, max: 5, "Choose up to 5 in any combination of Pokémon and Supporter cards to put back into your deck")
              .moveTo(my.deck)
            shuffleDeck()
          }
          playRequirement{
            assert my.discard.filterByType(POKEMON, BASIC_ENERGY) : "You have no Pokémon or basic Energy cards in your discard pile"
          }
        };
      case VS_SEEKER_140:
        return copy(FireRedLeafGreen.VS_SEEKER_100, this);
      case ABSOL_G_LV_X_141:
        return levelUp (this, from:"Absol G", hp:HP100, type:D, retreatCost:1) {
          weakness F
          resistance P, MINUS20
          pokePower "Darkness Send", {
            text "Once during your turn (before your attack), when you put Absol G LV.X from your hand onto your Active Absol G, you may flip 3 coins. For each heads, put the top card from your opponent's deck in the Lost Zone."
            onActivate {r->
              if (r==PLAY_FROM_HAND && opp.deck && confirm('Use Darkness Send?')) {
                powerUsed()
                def count = 0
                flip 3, {
                  count++
                }
                opp.deck.subList(0,count).moveTo(opp.lostZone)
              }
            }
          }
          move "Darkness Slugger", {
            text "30+ damage. You may discard a card from your hand. If you do, this attack does 30 damage plus 30 more damage."
            energyCost D, C
            attackRequirement {}
            onAttack {
              damage 30
              if(my.hand && confirm("Discard a card to deal 30 additional damage?")) {
                def card = my.hand.select("Choose a card to discard")
                damage 30
                afterDamage {
                  card.discard()
                }
              }
            }
          }
        };
      case BLAZIKEN_FB_LV_X_142:
        return levelUp (this, from:"Blaziken FB", hp:HP110, type:R, retreatCost:1) {
          weakness W
          pokeBody "Burning Spirit", {
            text "Any damage done by attacks to a Burned Pokémon (both yours and your opponent's) is increased by 40 (after applying Weakness and Resistance). No more than 40 damage can be added by all Burning Spirit Poké-Bodies"
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                if(bg.em().retrieveObject("Burning Spirit") != bg.turnCount){
                  bg.dm().each {
                    if (it.from.active && it.to.isSPC(BURNED) && it.dmg.value && it.notNoEffect) {
                      bc "Burning Spirit +40"
                      it.dmg += hp(40)
                    }
                  }
                  bg.em().storeObject("Burning Spirit", bg.turnCount)
                }
              }
            }
          }
          move "Jet Shoot", {
            text "80 damage. During your opponent's next turn, any damage done to Blaziken FB by attacks is increased by 40 (after applying Weakness and Resistance). ."
            energyCost R, C
            attackRequirement {}
            onAttack {
              damage 80
              afterDamage {
                delayed {
                  before APPLY_ATTACK_DAMAGES, {
                    bg.dm().each {
                      if(it.to==self && it.dmg.value && it.notNoEffect){
                        bc "Jet Shoot increases damage"
                        it.dmg+=hp(40)
                      }
                    }
                  }
                  unregisterAfter 2
                  after CHANGE_STAGE, self, {unregister()}
                  after FALL_BACK, self, {unregister()}
                }
              }
            }
          }
        };
      case CHARIZARD_G_LV_X_143:
        return levelUp (this, from:"Charizard G", hp:HP120, type:R, retreatCost:3) {
          weakness W
          resistance F, MINUS20
          pokePower "Call for Power", {
            text "As often as you like during your turn (before your attack), you may move an Energy attached to 1 of your Pokémon to Charizard G. This power can't be used if Charizard G is affected by a Special Condition. "
            actionA {
              checkNoSPC()
              assert my.all.findAll{it!=self && it.cards.energyCount(C)} : "None of your other Pokémon have any energy attached"
              powerUsed()
              def src = my.all.findAll{it!=self && it.cards.energyCount(C)}.select("Source for energy")
              def card = src.cards.select("Energy to move",cardTypeFilter(ENERGY)).first()
              energySwitch(src,self,card)
            }
          }
          move "Malevolent Fire", {
            text "150 damage. Flip a coin. If tails, discard all Energy attached to Charizard G."
            energyCost R, R, C, C, C
            attackRequirement {}
            onAttack {
              damage 150
              flip 1, {}, {
                afterDamage {
                  discardAllSelfEnergy(null)
                }
              }
            }
          }
        };
      case ELECTIVIRE_FB_LV_X_144:
        return levelUp (this, from:"Electivire FB", hp:HP120, type:L, retreatCost:3) {
          weakness F
          resistance M, MINUS20
          pokePower "Energy Recycle", {
            text "Once during your turn (before your attack), you may use this power. If you do, your turn ends. Search your discard pile for up to 3 Energy cards and attach them to your Pokémon in any way you like. This power can't be used if Electivire FB is affected by a Special Condition. "
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.discard.filterByType(ENERGY) : "You have no Energy cards in your discard pile"
              powerUsed({ usingThisAbilityEndsTurn delegate })
              def maxCards = Math.min(3,my.discard.filterByEnergyType(L).size())
              my.discard.select(max:maxCards,"Search your discard pile for up to 3 [L] Energy cards",energyFilter(L)).each {
                attachEnergy(my.all.select("Attach $it to"), it)
              }
              usingThisAbilityEndsTurn delegate
            }
          }
          move "Powerful Spark", {
            text "30+ damage. This attack does 30 damage plus 10 damage for each Energy attached to all of your Pokémon."
            energyCost L, C, C
            attackRequirement {}
            onAttack {
              damage 30
              my.all.each {
                damage 10 * it.cards.energyCount(C)
              }
            }
          }
        };
      case GARCHOMP_C_LV_X_145:
        return levelUp (this, from:"Garchomp C", hp:HP110, type:C, retreatCost:0) {
          weakness C
          pokePower "Healing Breath", {
            text "Once during your turn (before your attack), when you put Garchomp C LV.X from your hand onto your Active Garchomp C, you may remove all damage counters from each of your Pokémon SP. "
            onActivate {r->
              if (r==PLAY_FROM_HAND && my.all.find{it.numberOfDamageCounters && it.pokemonSP} && confirm('Use Healing Breath?')) {
                powerUsed()
                my.all.each {
                  if(it.pokemonSP) {
                    healAll(it)
                  }
                }
              }
            }
          }
          move "Dragon Rush", {
            text "Discard 2 Energy attached to Garchomp C. Choose 1 of your opponent's Pokémon. This attack does 80 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) Garchomp C can't use Dragon Rush during your next turn."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 80, opp.all.select()
              discardSelfEnergyAfterDamage C, C
              cantUseAttack thisMove, self
            }
          }
        };
      case RAYQUAZA_C_LV_X_146:
        return levelUp (this, from:"Rayquaza C", hp:HP120, type:C, retreatCost:3) {
          weakness C
          resistance F, MINUS20
          pokeBody "Dragon Spirit", {
            text "If Rayquaza C is your Active Pokémon and is damaged but not Knocked Out by an opponent's attack, you may search your discard pile for an Energy card and attach it to Rayquaza Pokémon C. "
            delayedA {
              def applyEffect = false
              before APPLY_ATTACK_DAMAGES, {
                applyEffect = self.active && bg.currentTurn == self.owner.opposite && bg.dm().any({ it.to == self && it.dmg.value })
              }
              after APPLY_ATTACK_DAMAGES, {
                if (applyEffect && !self.slatedToKO && self.owner.pbg.discard.filterByType(ENERGY)) {
                  self.owner.pbg.discard.select(min:0, max: 1, "$thisAbility: Attach an Energy card to attach to ${self}?", cardTypeFilter(ENERGY), self.owner).each {
                    attachEnergy(self, it)
                  }
                }
              }
            }
          }
          move "Final Blowup", {
            text "200 damage. Discard all Energy attached to Rayquaza C. Ignore this effect if you have no cards in your hand. "
            energyCost W, P, F, C
            attackRequirement {}
            onAttack {
              damage 200
              if(my.hand) {
                afterDamage {
                  discardAllSelfEnergy()
                }
              }
            }
          }
        };
      case STARAPTOR_FB_LV_X_147:
        return levelUp (this, from:"Staraptor FB", hp:HP100, type:C, retreatCost:0) {
          weakness L
          resistance F, MINUS20
          pokePower "Fast Call", {
            text "Once during your turn (before your attack), you may search your deck for a Supporter card, show it to your opponent, and put it into your hand. Shuffle your deck afterward. This power can't be used if Staraptor FB is affected by a Special Condition. "
            actionA {
              checkLastTurn()
              checkNoSPC()
              assert my.deck : "Your deck is empty"
              powerUsed()
              my.deck.search("Search your deck for a Supporter card",cardTypeFilter(SUPPORTER)).showToOpponent("Fast Call: Selected card").moveTo(my.hand)
            }
          }
          move "Defog", {
            text "40 damage. Before doing damage, you may discard any Stadium card in play. If you do, this attack’s base damage is 70 instead of 40."
            energyCost C, C, C
            attackRequirement {}
            onAttack {
              damage 40
              if(bg.stadiumInfoStruct && confirm("Discard $bg.stadiumInfoStruct.stadiumCard to deal 30 additional damage")) {
                discard(bg.stadiumInfoStruct.stadiumCard)
                damage 30
              }
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
              damage 20
              flip {
                applyAfterDamage PARALYZED
                opp.bench.each {
                  damage 10, it
                }
              }
            }
          }

        };
      case MOLTRES_149:
        return basic (this, hp:HP070, type:R, retreatCost:1) {
          resistance F, MINUS30
          move "Hyper Flame", {
            text "60 damage. Flip a coin. If heads, discard a [R] Energy card attached to Moltres. If tails, discard all Energy cards attached to Moltres."
            energyCost R, R, R
            attackRequirement {
              assert self.cards.energyCount(R)
            }
            onAttack {
              damage 60
              flip 1, {
                discardSelfEnergyAfterDamage R
              }, {
                afterDamage {
                  discardAllSelfEnergy(null)
                }
              }
            }
          }

        };
      case ZAPDOS_150:
        return basic (this, hp:HP070, type:L, retreatCost:1) {
          resistance F, MINUS30
          move "Lightning Burn", {
            text "30 damage. Flip a coin. If heads, and if your opponent has any Benched Pokémon, choose 1 of them. This attack does 30 damage to that Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.) If tails, Zapdos does 30 damage to itself. "
            energyCost L, L, L
            attackRequirement {}
            onAttack {
              damage 30
              flip 1, {
                if (opp.bench) {
                  damage 30, opp.bench.select("Does 30 damage to 1 of your opponent's Benched Pokémon")
                }
              }, {
                damage 30, self
              }
            }
          }
        };
      case MILOTIC_SH7:
        return evolution (this, from:"Feebas", hp:HP080, type:W, retreatCost:1) {
          weakness L, PLUS20
          pokeBody "Aqua Mirage", {
            text "If you have no cards in your hand, prevent all damage done to Milotic by attacks from your opponent’s Pokémon."
            delayedA {
              before APPLY_ATTACK_DAMAGES, {
                bg.dm().each{
                  if(it.from.owner == self.owner.opposite && it.to == self && !self.owner.pbg.hand && it.dmg.value && it.notNoEffect) {
                    bc "Aqua Mirage prevent damage"
                    it.dmg = hp(0)
                  }
                }
              }
            }
          }
          move "Dwindling Wave", {
            text "80- damage. Does 80 damage minus 10 damage for each damage counter on Milotic."
            energyCost W, W, C
            attackRequirement {
              assert self.numberOfDamageCounters < 8 : "This attack will deal no damage"
            }
            onAttack {
              damage 80 - 10 * self.numberOfDamageCounters
            }
          }

        };
      case RELICANTH_SH8:
        return basic (this, hp:HP080, type:F, retreatCost:1) {
          weakness G, PLUS20
          move "Deep Sea Pressure", {
            text "20 damage. During your opponent's next turn, the Defending Pokémon's retreat cost is [C][C] more."
            energyCost F, C
            attackRequirement {}
            onAttack {
              damage 20
              defendingRetreatsCostsMore(defending,2)
            }
          }
          move "Aqua Wave", {
            text "40+ damage. Flip 2 coins. This attack does 40 damage plus 10 more damage for each heads."
            energyCost F, C, C
            attackRequirement {}
            onAttack {
              damage 40
              flip 2, {
                damage 10
              }
            }
          }

        };
      case YANMA_SH9:
        return basic (this, hp:HP070, type:G, retreatCost:1) {
          weakness L, PLUS20
          resistance F, MINUS20
          move "Sonicboom", {
            text "10 damage. This attack’s damage isn’t affected by Weakness or Resistance."
            energyCost C
            attackRequirement {}
            onAttack {
              noWrDamage 10, defending
            }
          }
          move "Baton Pass", {
            text "30 damage. You may switch Yanma with 1 of your Benched Pokémon. If you do, move as many Energy cards attached to Yanma as you like to the new Active Pokémon."
            energyCost G, C, C
            attackRequirement {}
            onAttack {
              damage 30
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
      default:
        return null;
    }
  }

}
