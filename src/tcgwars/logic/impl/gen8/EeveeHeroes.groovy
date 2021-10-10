package tcgwars.logic.impl.gen8;

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
public enum EeveeHeroes implements LogicCardInfo {

  PINSIR_1 ("Pinsir", "1", Rarity.UNCOMMON, [POKEMON, BASIC, _GRASS_]),
  LEAFEON_V_2 ("Leafeon V", "2", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  LEAFEON_VMAX_3 ("Leafeon VMAX", "3", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  SEWADDLE_4 ("Sewaddle", "4", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  SWADLOON_5 ("Swadloon", "5", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  LEAVANNY_6 ("Leavanny", "6", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _GRASS_]),
  DEWPIDER_7 ("Dewpider", "7", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ARAQUANID_8 ("Araquanid", "8", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  GOSSIFLEUR_9 ("Gossifleur", "9", Rarity.COMMON, [POKEMON, BASIC, _GRASS_]),
  ELDEGOSS_10 ("Eldegoss", "10", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _GRASS_]),
  FLAREON_V_11 ("Flareon V", "11", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  SLUGMA_12 ("Slugma", "12", Rarity.COMMON, [POKEMON, BASIC, _FIRE_]),
  MAGCARGO_13 ("Magcargo", "13", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _FIRE_]),
  ENTEI_14 ("Entei", "14", Rarity.HOLORARE, [POKEMON, BASIC, _FIRE_]),
  VAPOREON_V_15 ("Vaporeon V", "15", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  MARILL_16 ("Marill", "16", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  AZUMARILL_17 ("Azumarill", "17", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  MANTINE_18 ("Mantine", "18", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MUDKIP_19 ("Mudkip", "19", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MARSHTOMP_20 ("Marshtomp", "20", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  SWAMPERT_21 ("Swampert", "21", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _WATER_]),
  FEEBAS_22 ("Feebas", "22", Rarity.COMMON, [POKEMON, BASIC, _WATER_]),
  MILOTIC_23 ("Milotic", "23", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _WATER_]),
  GLACEON_V_24 ("Glaceon V", "24", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  GLACEON_VMAX_25 ("Glaceon VMAX", "25", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  PIKACHU_26 ("Pikachu", "26", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  RAICHU_27 ("Raichu", "27", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  VOLTORB_28 ("Voltorb", "28", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  ELECTRODE_29 ("Electrode", "29", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  JOLTEON_V_30 ("Jolteon V", "30", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  ROTOM_31 ("Rotom", "31", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  TYNAMO_32 ("Tynamo", "32", Rarity.COMMON, [POKEMON, BASIC, _LIGHTNING_]),
  EELEKTRIK_33 ("Eelektrik", "33", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _LIGHTNING_]),
  EELEKTROSS_34 ("Eelektross", "34", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE2, _LIGHTNING_]),
  ESPEON_V_35 ("Espeon V", "35", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  MAWILE_36 ("Mawile", "36", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  FLABEBE_37 ("Flabebe", "37", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  FLOETTE_38 ("Floette", "38", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  FLORGES_39 ("Florges", "39", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _PSYCHIC_]),
  SYLVEON_V_40 ("Sylveon V", "40", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  SYLVEON_VMAX_41 ("Sylveon VMAX", "41", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
  SANDYGAST_42 ("Sandygast", "42", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  PALOSSAND_43 ("Palossand", "43", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _PSYCHIC_]),
  MARSHADOW_44 ("Marshadow", "44", Rarity.HOLORARE, [POKEMON, BASIC, _PSYCHIC_]),
  INDEEDEE_45 ("Indeedee", "45", Rarity.COMMON, [POKEMON, BASIC, _PSYCHIC_]),
  PANCHAM_46 ("Pancham", "46", Rarity.COMMON, [POKEMON, BASIC, _FIGHTING_]),
  UMBREON_V_47 ("Umbreon V", "47", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  UMBREON_VMAX_48 ("Umbreon VMAX", "48", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
  ZORUA_49 ("Zorua", "49", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  ZOROARK_50 ("Zoroark", "50", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  PANGORO_51 ("Pangoro", "51", Rarity.COMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  IMPIDIMP_52 ("Impidimp", "52", Rarity.COMMON, [POKEMON, BASIC, _DARKNESS_]),
  MORGREM_53 ("Morgrem", "53", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _DARKNESS_]),
  GRIMMSNARL_54 ("Grimmsnarl", "54", Rarity.HOLORARE, [POKEMON, EVOLUTION, STAGE2, _DARKNESS_]),
  MEOWTH_55 ("Meowth", "55", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  PERSIAN_56 ("Persian", "56", Rarity.UNCOMMON, [POKEMON, EVOLUTION, STAGE1, _COLORLESS_]),
  KANGASKHAN_57 ("Kangaskhan", "57", Rarity.UNCOMMON, [POKEMON, BASIC, _COLORLESS_]),
  EEVEE_58 ("Eevee", "58", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  SMEARGLE_59 ("Smeargle", "59", Rarity.COMMON, [POKEMON, BASIC, _COLORLESS_]),
  RAPID_SHAKE_60 ("Rapid Shake", "60", Rarity.UNCOMMON, [TRAINER, ITEM]),
  DREAM_BALL_61 ("Dream Ball", "61", Rarity.UNCOMMON, [TRAINER, ITEM]),
  ELEMENTAL_BADGE_62 ("Elemental Badge", "62", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  SNOW_LEAF_BADGE_63 ("Snow Leaf Badge", "63", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  MOON_AND_SUN_BADGE_64 ("Moon and Sun Badge", "64", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  RIBBON_BADGE_65 ("Ribbon Badge", "65", Rarity.UNCOMMON, [TRAINER, POKEMON_TOOL, ITEM]),
  AROMA_LADY_66 ("Aroma Lady", "66", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  GORDIE_67 ("Gordie", "67", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  FASHION_MALL_68 ("Fashion Mall", "68", Rarity.UNCOMMON, [TRAINER, STADIUM]),
  TREASURE_ENERGY_69 ("Treasure Energy", "69", Rarity.UNCOMMON, [ENERGY, SPECIAL_ENERGY]),
  LEAFEON_V_70 ("Leafeon V", "70", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  LEAFEON_V_71 ("Leafeon V", "71", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _GRASS_]),
  FLAREON_V_72 ("Flareon V", "72", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  FLAREON_V_73 ("Flareon V", "73", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _FIRE_]),
  VAPOREON_V_74 ("Vaporeon V", "74", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  VAPOREON_V_75 ("Vaporeon V", "75", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  GLACEON_V_76 ("Glaceon V", "76", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  GLACEON_V_77 ("Glaceon V", "77", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _WATER_]),
  JOLTEON_V_78 ("Jolteon V", "78", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  JOLTEON_V_79 ("Jolteon V", "79", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _LIGHTNING_]),
  ESPEON_V_80 ("Espeon V", "80", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  ESPEON_V_81 ("Espeon V", "81", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  SYLVEON_V_82 ("Sylveon V", "82", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  SYLVEON_V_83 ("Sylveon V", "83", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _PSYCHIC_]),
  UMBREON_V_84 ("Umbreon V", "84", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  UMBREON_V_85 ("Umbreon V", "85", Rarity.ULTRARARE, [POKEMON, BASIC, POKEMON_V, _DARKNESS_]),
  AROMA_LADY_86 ("Aroma Lady", "86", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  GORDIE_87 ("Gordie", "87", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  LEAFEON_VMAX_88 ("Leafeon VMAX", "88", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  LEAFEON_VMAX_89 ("Leafeon VMAX", "89", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _GRASS_]),
  GLACEON_VMAX_90 ("Glaceon VMAX", "90", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  GLACEON_VMAX_91 ("Glaceon VMAX", "91", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _WATER_]),
  SYLVEON_VMAX_92 ("Sylveon VMAX", "92", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
  SYLVEON_VMAX_93 ("Sylveon VMAX", "93", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _PSYCHIC_]),
  UMBREON_VMAX_94 ("Umbreon VMAX", "94", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
  UMBREON_VMAX_95 ("Umbreon VMAX", "95", Rarity.ULTRARARE, [POKEMON, EVOLUTION, VMAX, _DARKNESS_]),
  AROMA_LADY_96 ("Aroma Lady", "96", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  GORDIE_97 ("Gordie", "97", Rarity.UNCOMMON, [TRAINER, SUPPORTER]),
  RAPID_SHAKE_98 ("Rapid Shake", "98", Rarity.UNCOMMON, [TRAINER, ITEM]);

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY, N = DRAGON;

  protected CardTypeSet cardTypes;
  protected String name;
  protected Rarity rarity;
  protected String collectionLineNo;

  EeveeHeroes(String name, String collectionLineNo, Rarity rarity, List<CardType> cardTypes) {
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
    return tcgwars.logic.card.Collection.EEVEE_HEROES;
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
      case PINSIR_1:
      return basic (this, hp:HP120, type:G, retreatCost:2) {
        weakness R
        bwAbility "Vise Coach", {
          text "Damage from the attacks of your Single Strike Pokémon isn't affected by Resistance on your opponent's Active Pokémon."
          actionA {
          }
        }
        move "Seismic Toss", {
          text "110 damage."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case LEAFEON_V_2:
      return basic (this, hp:HP200, type:G, retreatCost:1) {
        weakness R
        bwAbility "Greening Cells", {
          text "Once during your turn, you may search your deck for a [G] Energy card and attach it to 1 of your Pokémon. Then, shuffle your deck. If you use this Ability, your turn ends."
          actionA {
          }
        }
        move "Leaf Blade", {
          text "90+ damage. Flip a coin. If heads, this attack does 60 more damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case LEAFEON_VMAX_3:
      return evolution (this, from:"Leafeon V", hp:HP310, type:G, retreatCost:2) {
        weakness R
        move "Grass Knot", {
          text "60× damage. This attack does 60 damage for each in your opponent's Active Pokémon's Retreat Cost."
          energyCost G, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
        move "Max Leaf", {
          text "170 damage. Heal 30 damage from this Pokémon."
          energyCost G, G, C
          attackRequirement {}
          onAttack {
            damage 170
          }
        }
      };
      case SEWADDLE_4:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Grass Nibble", {
          text "10 damage. Discard a [G] Energy from your opponent's Active Pokémon."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case SWADLOON_5:
      return evolution (this, from:"Sewaddle", hp:HP080, type:G, retreatCost:2) {
        weakness R
        move "Trip Over", {
          text "10+ damage. Flip a coin. If heads, this attack does 20 more damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Seed Bomb", {
          text "60 damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case LEAVANNY_6:
      return evolution (this, from:"Swadloon", hp:HP130, type:G, retreatCost:1) {
        weakness R
        move "Healing Circle", {
          text " Heal all damage from each of your Benched Pokémon. Then, shuffle this Pokémon and all cards attached to it into your deck."
          energyCost C, C
          attackRequirement {}
          onAttack {

          }
        }
        move "Razor Leaf", {
          text "120 damage."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case DEWPIDER_7:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Bug Bite", {
          text "20 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case ARAQUANID_8:
      return evolution (this, from:"Dewpider", hp:HP120, type:G, retreatCost:2) {
        weakness R
        move "Bug Bite", {
          text "30 damage."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Bubble Ball Hurl", {
          text "110 damage. Move an Energy from this Pokémon to 1 of your Benched Pokémon."
          energyCost G, C, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case GOSSIFLEUR_9:
      return basic (this, hp:HP050, type:G, retreatCost:1) {
        weakness R
        move "Blot", {
          text "10 damage. Heal 10 damage from this Pokémon."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case ELDEGOSS_10:
      return evolution (this, from:"Gossifleur", hp:HP080, type:G, retreatCost:1) {
        weakness R
        bwAbility "Cotton Transport", {
          text "Once during your turn, you may search your deck for up to 2 basic Energy cards, reveal them, and put them into your hand. Then, shuffle your deck."
          actionA {
          }
        }
        move "Cotton Guard", {
          text "30 damage. During your opponent's next turn, this Pokémon takes 30 less damage from attacks (after applying Weakness and Resistance)."
          energyCost G
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case FLAREON_V_11:
      return basic (this, hp:HP210, type:R, retreatCost:2) {
        weakness W
        move "Burning Breath", {
          text "20 damage. Search your deck for a [R] Energy card and attach it to this Pokémon. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Scorching Column", {
          text "120 damage. Your opponent's Active Pokémon is now Burned."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case SLUGMA_12:
      return basic (this, hp:HP080, type:R, retreatCost:3) {
        weakness W
        move "Live Coal", {
          text "10 damage."
          energyCost R
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Flare", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case MAGCARGO_13:
      return evolution (this, from:"Slugma", hp:HP130, type:R, retreatCost:3) {
        weakness W
        move "Rock Throw", {
          text "40 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Body Splash", {
          text "150 damage. Flip 3 coins. For each tails, discard an Energy from this Pokémon."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 150
          }
        }
      };
      case ENTEI_14:
      return basic (this, hp:HP120, type:R, retreatCost:2) {
        weakness W
        move "Raging Fang", {
          text "10× damage. This attack does 10 damage for each damage counter on your Benched Single Strike Pokémon."
          energyCost R, C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Heat Tackle", {
          text "120 damage. This Pokémon also does 30 damage to itself."
          energyCost R, R, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case VAPOREON_V_15:
      return basic (this, hp:HP210, type:W, retreatCost:2) {
        weakness L
        move "Triple Draw", {
          text " Draw 3 cards."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Splash Jump", {
          text "90 damage. Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost W, W, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case MARILL_16:
      return basic (this, hp:HP050, type:W, retreatCost:1) {
        weakness L
        move "Aqua Liner", {
          text " This attack does 20 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Everyone Rollout", {
          text "20× damage. This attack does 20 damage for each of your Benched Pokémon that has the Everyone Rollout attack."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case AZUMARILL_17:
      return evolution (this, from:"Marill", hp:HP120, type:W, retreatCost:2) {
        weakness L
        move "Diving Rescue", {
          text " Put 3 in any combination of Pokémon and Supporter cards from your discard pile into your hand."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Surf", {
          text "90 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
      };
      case MANTINE_18:
      return basic (this, hp:HP110, type:W, retreatCost:1) {
        weakness L
        move "Bounce", {
          text "20 damage. Switch this Pokémon with 1 of your Benched Pokémon."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Wave Splash", {
          text "80 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case MUDKIP_19:
      return basic (this, hp:HP070, type:W, retreatCost:1) {
        weakness L
        move "Mud-Slap", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Playful Kick", {
          text "30 damage."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case MARSHTOMP_20:
      return evolution (this, from:"Mudkip", hp:HP090, type:W, retreatCost:2) {
        weakness L
        move "Mud-Slap", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Energy Loop", {
          text "80 damage. Put an Energy attached to this Pokémon into your hand."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case SWAMPERT_21:
      return evolution (this, from:"Marshtomp", hp:HP170, type:W, retreatCost:3) {
        weakness L
        bwAbility "Muddy Maker", {
          text "Once during your turn, you may attach a [W] or a [F] Energy card from your hand to 1 of your Pokémon."
          actionA {
          }
        }
        move "Earthquake", {
          text "180 damage. This attack also does 20 damage to each of your Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 180
          }
        }
      };
      case FEEBAS_22:
      return basic (this, hp:HP030, type:W, retreatCost:1) {
        weakness L
        move "Flail Around", {
          text "10× damage. Flip 3 coins. This attack does 10 damage for each heads."
          energyCost W
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MILOTIC_23:
      return evolution (this, from:"Feebas", hp:HP120, type:W, retreatCost:2) {
        weakness L
        bwAbility "Droplet Protection", {
          text "Whenever your opponent plays a Supporter card from their hand, prevent all effects of that card done to you or your hand."
          actionA {
          }
        }
        move "Double Smash", {
          text "70× damage. Flip 2 coins. This attack does 70 damage for each heads."
          energyCost W, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case GLACEON_V_24:
      return basic (this, hp:HP210, type:W, retreatCost:2) {
        weakness M
        move "Freezing Ascension", {
          text " Search your deck for a card that evolves from this Pokémon and put it onto this Pokémon to evolve it. Then, shuffle your deck."
          energyCost W
          attackRequirement {}
          onAttack {

          }
        }
        move "Whiteout", {
          text "120 damage. Discard any Stadium in play."
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case GLACEON_VMAX_25:
      return evolution (this, from:"Glaceon V", hp:HP310, type:W, retreatCost:2) {
        weakness M
        bwAbility "Crystal Veil", {
          text "Prevent all damage done to this Pokémon by attacks from your opponent's Pokémon VMAX , except Glaceon VMAX."
          actionA {
          }
        }
        move "Max Icicle", {
          text "150 damage. This attack also does 30 damage to 1 of your opponent's Benched Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost W, C, C
          attackRequirement {}
          onAttack {
            damage 150
          }
        }
      };
      case PIKACHU_26:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "Energize", {
          text " Attach a [L] Energy card from your discard pile to this Pokémon."
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
        move "Electro Ball", {
          text "30 damage."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case RAICHU_27:
      return evolution (this, from:"Pikachu", hp:HP130, type:L, retreatCost:2) {
        weakness F
        move "Big Sparking", {
          text " This attack does 50 damage to each Pokémon V and Pokémon-GX (both yours and your opponent's) . (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost L
          attackRequirement {}
          onAttack {

          }
        }
        move "Thunderbolt", {
          text "10180 damage. Discard all Energy from this Pokémon."
          energyCost L, L, C
          attackRequirement {}
          onAttack {
            damage 10180
          }
        }
      };
      case VOLTORB_28:
      return basic (this, hp:HP060, type:L, retreatCost:1) {
        weakness F
        move "One-Shot Bomb", {
          text "30 damage. Flip a coin. If tails, this attack does nothing."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ELECTRODE_29:
      return evolution (this, from:"Voltorb", hp:HP090, type:L, retreatCost:1) {
        weakness F
        move "Sonic Boom", {
          text "40 damage. This attack's damage isn't affected by Weakness or Resistance."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Explosion", {
          text "120 damage. This Pokémon also does 90 damage to itself."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case JOLTEON_V_30:
      return basic (this, hp:HP190, type:L, retreatCost:0) {
        weakness F
        move "Thunder Spear", {
          text " This attack does 20 damage to 1 of your opponent's Pokémon. (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Pin Missile", {
          text "60× damage. Flip 4 coins. This attack does 60 damage for each heads."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case ROTOM_31:
      return basic (this, hp:HP080, type:L, retreatCost:1) {
        weakness F
        move "Surprise Short", {
          text " Discard all Pokémon Tools from all of your opponent's Pokémon."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Static Shock", {
          text "30 damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case TYNAMO_32:
      return basic (this, hp:HP040, type:L, retreatCost:1) {
        weakness F
        move "Thunder Wave", {
          text " Flip a coin. If heads, your opponent's Active Pokémon is now Paralyzed."
          energyCost L
          attackRequirement {}
          onAttack {

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
      case EELEKTRIK_33:
      return evolution (this, from:"Tynamo", hp:HP090, type:L, retreatCost:2) {
        weakness F
        move "Lightning Ball", {
          text "20 damage."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Thunder", {
          text "80 damage. This Pokémon also does 20 damage to itself."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case EELEKTROSS_34:
      return evolution (this, from:"Eelektrik", hp:HP160, type:L, retreatCost:3) {
        weakness F
        move "Upper Shock", {
          text "40 damage. If this Pokémon evolved from Eelektrik during this turn, your opponent's Active Pokémon is now Paralyzed."
          energyCost L
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
        move "Wild Charge", {
          text "160 damage. This Pokémon also does 30 damage to itself."
          energyCost L, C, C
          attackRequirement {}
          onAttack {
            damage 160
          }
        }
      };
      case ESPEON_V_35:
      return basic (this, hp:HP200, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Zen Bullet", {
          text " This attack does 60 damage to 1 of your opponent's Pokémon V . (Don't apply Weakness and Resistance for Benched Pokémon.)"
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Super Psy Bolt", {
          text "120 damage."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
      };
      case MAWILE_36:
      return basic (this, hp:HP090, type:P, retreatCost:1) {
        weakness M
        move "Chomp Chomp Hold", {
          text "30 damage. During your opponent's next turn, the Defending Pokémon's attacks cost [C] more and it's Retreat Cost is more."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case FLABEBE_37:
      return basic (this, hp:HP040, type:P, retreatCost:1) {
        weakness M
        move "Hypnotic Gaze", {
          text " Your opponent's Active Pokémon is now Asleep."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
      };
      case FLOETTE_38:
      return evolution (this, from:"Flabébé", hp:HP070, type:P, retreatCost:1) {
        weakness M
        move "Fairy Wind", {
          text "20 damage."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Double Spin", {
          text "50× damage. Flip 2 coins. This attack does 50 damage for each heads."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 50
          }
        }
      };
      case FLORGES_39:
      return evolution (this, from:"Floette", hp:HP130, type:P, retreatCost:2) {
        weakness M
        bwAbility "Rapid Strike Connection", {
          text "As often as you like during your turn, you may move an Energy from 1 of your Pokémon to 1 of your Rapid Strike Pokémon."
          actionA {
          }
        }
        move "Wonder Shine", {
          text "110 damage. Your opponent's Active Pokémon is now Confused."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 110
          }
        }
      };
      case SYLVEON_V_40:
      return basic (this, hp:HP200, type:P, retreatCost:1) {
        weakness M
        bwAbility "Dream Gift", {
          text "Once during your turn, you may search your deck for an Item card , reveal it, and put it into your hand. Then, shuffle your deck. If you use this Ability, your turn ends."
          actionA {
          }
        }
        move "Magical Shot", {
          text "60 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case SYLVEON_VMAX_41:
      return evolution (this, from:"Sylveon V", hp:HP310, type:P, retreatCost:2) {
        weakness M
        move "Precious Touch", {
          text " Attach an Energy from your hand to 1 of your Benched Pokémon. Then, heal 120 damage from that Pokémon."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Max Harmony", {
          text "70+ damage. This attack does 30 more damage for each different type of Pokémon on your Bench."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case SANDYGAST_42:
      return basic (this, hp:HP080, type:P, retreatCost:3) {
        weakness D
        resistance F, MINUS30
        move "Vibration", {
          text "10 damage."
          energyCost P
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
        move "Spooky Shot", {
          text "30 damage."
          energyCost P, P
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case PALOSSAND_43:
      return evolution (this, from:"Sandygast", hp:HP140, type:P, retreatCost:4) {
        weakness D
        resistance F, MINUS30
        move "Sand Hollow", {
          text "120 damage."
          energyCost P, P, C
          attackRequirement {}
          onAttack {
            damage 120
          }
        }
        move "Sandstorm Pressure", {
          text " If your opponent's Active Pokémon is a Basic Pokémon, that Pokémon is Knocked Out."
          energyCost P, P, P, C
          attackRequirement {}
          onAttack {

          }
        }
      };
      case MARSHADOW_44:
      return basic (this, hp:HP080, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Rapid Hunt", {
          text " Search your deck for up to 2 Rapid Strike cards, reveal them, and put them into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Shadow Flicker", {
          text "10 damage. During your next turn, if the Defending Pokémon is Knocked Out, take 1 more Prize card."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case INDEEDEE_45:
      return basic (this, hp:HP100, type:P, retreatCost:1) {
        weakness D
        resistance F, MINUS30
        move "Call for Family", {
          text " Search your deck for up to 2 Basic Pokémon and put them onto your Bench. Then, shuffle your deck."
          energyCost P
          attackRequirement {}
          onAttack {

          }
        }
        move "Heart Sign", {
          text "80 damage."
          energyCost P, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case PANCHAM_46:
      return basic (this, hp:HP060, type:F, retreatCost:2) {
        weakness P
        move "Evil Growth", {
          text " Search your deck for up to 2 [D] Energy cards and attach them to this Pokémon. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Smash Kick", {
          text "30 damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case UMBREON_V_47:
      return basic (this, hp:HP200, type:D, retreatCost:2) {
        weakness G
        move "Mean Look", {
          text "30 damage. During your opponent's next turn, the Defending Pokémon can't retreat."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Lunar Blade", {
          text "80+ damage. If this Pokémon has any damage counters on it, this attack does 100 more damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 80
          }
        }
      };
      case UMBREON_VMAX_48:
      return evolution (this, from:"Umbreon V", hp:HP310, type:D, retreatCost:2) {
        weakness G
        bwAbility "Dark Signal", {
          text "When you play this Pokémon from your hand to evolve 1 of your Pokémon during your turn, you may switch 1 of your opponent's Benched Pokémon with their Active Pokémon."
          actionA {
          }
        }
        move "Max Darkness", {
          text "160 damage."
          energyCost D, C, C
          attackRequirement {}
          onAttack {
            damage 160
          }
        }
      };
      case ZORUA_49:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Rear Kick", {
          text "30 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case ZOROARK_50:
      return evolution (this, from:"Zorua", hp:HP120, type:D, retreatCost:2) {
        weakness G
        bwAbility "Illusory Transformation", {
          text "Once during your turn, you may discard this Pokémon and all attached cards, then put a Stage 1 Pokémon , except Zoroark , from your discard pile in its place."
          actionA {
          }
        }
        move "Night Daze", {
          text "70 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case PANGORO_51:
      return evolution (this, from:"Pancham", hp:HP140, type:D, retreatCost:4) {
        weakness G
        move "Knock Hammer", {
          text "90 damage. Discard the top card of your opponent's deck."
          energyCost D, D, C
          attackRequirement {}
          onAttack {
            damage 90
          }
        }
        move "Shakedown", {
          text "150 damage. Discard a random card from your opponent's hand."
          energyCost D, D, D, C
          attackRequirement {}
          onAttack {
            damage 150
          }
        }
      };
      case IMPIDIMP_52:
      return basic (this, hp:HP070, type:D, retreatCost:1) {
        weakness G
        move "Play Rough", {
          text "10+ damage. Flip a coin. If heads, this attack does 30 more damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case MORGREM_53:
      return evolution (this, from:"Impidimp", hp:HP090, type:D, retreatCost:2) {
        weakness G
        move "Bite", {
          text "20 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
        move "Crushing Blow", {
          text "40 damage. Flip a coin. If heads, discard an Energy from your opponent's Active Pokémon."
          energyCost D, D
          attackRequirement {}
          onAttack {
            damage 40
          }
        }
      };
      case GRIMMSNARL_54:
      return evolution (this, from:"Morgrem", hp:HP170, type:D, retreatCost:3) {
        weakness G
        move "Bite", {
          text "60 damage."
          energyCost D
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
        move "Rearguard Attack", {
          text "100+ damage. If you have 2 or less Benched Pokémon, this attack does 140 more damage."
          energyCost D, D
          attackRequirement {}
          onAttack {
            damage 100
          }
        }
      };
      case MEOWTH_55:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Pay Day", {
          text "10 damage. Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 10
          }
        }
      };
      case PERSIAN_56:
      return evolution (this, from:"Meowth", hp:HP110, type:C, retreatCost:1) {
        weakness F
        move "Pay Day", {
          text "30 damage. Draw a card."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Bite", {
          text "70 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 70
          }
        }
      };
      case KANGASKHAN_57:
      return basic (this, hp:HP120, type:C, retreatCost:2) {
        weakness F
        move "Pound", {
          text "30 damage."
          energyCost C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
        move "Parent and Child Coordinated Punch", {
          text "60+ damage. Flip a coin. If heads, this attack does 100 more damage."
          energyCost C, C, C
          attackRequirement {}
          onAttack {
            damage 60
          }
        }
      };
      case EEVEE_58:
      return basic (this, hp:HP070, type:C, retreatCost:1) {
        weakness F
        move "Vee Search", {
          text " Search your deck for up to 3 Pokémon V , reveal them, and put them into your hand. Then, shuffle your deck."
          energyCost C
          attackRequirement {}
          onAttack {

          }
        }
        move "Stampede", {
          text "20 damage."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 20
          }
        }
      };
      case SMEARGLE_59:
      return basic (this, hp:HP080, type:C, retreatCost:1) {
        weakness F
        move "Live Paint", {
          text "30+ damage. Reveal any number of basic Energy cards in your hand. This attack does 30 more damage for each type of Energy card you revealed in this way."
          energyCost C, C
          attackRequirement {}
          onAttack {
            damage 30
          }
        }
      };
      case RAPID_SHAKE_60:
      return itemCard (this) {
        text "Search your deck for a card that evolves from 1 of your Pokémon and put it onto that Pokémon to evolve it. Then" +
          "shuffle your deck. You can use this card during your first turn or on a Pokémon that was put into play this turn. Your turn ends."
        onPlay {
        }
        playRequirement{
        }
      };
      case DREAM_BALL_61:
      return itemCard (this) {
        text "You can play this card only if you took it as a face-down Prize card" +
          "before you put it into your hand. Search your deck for a Pokémon and put it onto your Bench. Then" +
          "shuffle your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case ELEMENTAL_BADGE_62:
      return pokemonTool (this) {
        text "If the Pokémon this card is attached to has 'Flareon V'" +
          "Vaporeon V" +
          "or 'Jolteon V' in its name" +
          "its attacks cost less."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case SNOW_LEAF_BADGE_63:
      return pokemonTool (this) {
        text "If the Pokémon this card is attached to has 'Leafeon V' or 'Glaceon V' in its name" +
          "it has no Weakness or Retreat Cost."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case MOON_AND_SUN_BADGE_64:
      return pokemonTool (this) {
        text "If the Pokémon this card is attached to has 'Espeon V' or 'Umbreon V' in its name" +
          "whenever your opponent plays a Supporter card from their hand" +
          "prevent all effects of that card done to the Pokémon this card is attached to."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case RIBBON_BADGE_65:
      return pokemonTool (this) {
        text "If the Pokémon this card is attached to has 'Sylveon V' in its name and is Knocked Out by damage from an opponent's attack" +
          "that player takes 1 fewer Prize card."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        allowAttach {to->
        }
      };
      case AROMA_LADY_66:
      return supporter (this) {
        text "Draw 2 cards. Then" +
          "your Active Pokémon recovers from all Special Conditions."
        onPlay {
        }
        playRequirement{
        }
      };
      case GORDIE_67:
      return supporter (this) {
        text "Look at the top 7 cards of your deck" +
          "reveal as many Energy cards you find there as you like" +
          "and put them into your hand. Shuffle the other cards back into your deck."
        onPlay {
        }
        playRequirement{
        }
      };
      case FASHION_MALL_68:
      return stadium (this) {
        text "Once during each player's turn" +
          "that player may put a Pokémon Tool attached to 1 of their Pokémon into their hand."
        onPlay {
        }
        onRemoveFromPlay{
        }
      };
      case TREASURE_ENERGY_69:
      return specialEnergy (this, [[C]]) {
        text "As long as this card is attached to a Pokémon" +
          "it provides Energy. If you took this card as a face-down Prize card during your turn" +
          "before you put it into your hand" +
          "you may attach it to 1 of your Pokémon."
        onPlay {reason->
        }
        onRemoveFromPlay {
        }
        onMove {to->
        }
        allowAttach {to->
        }
      };
      case LEAFEON_V_70:
      return copy (LEAFEON_V_2, this);
      case LEAFEON_V_71:
      return copy (LEAFEON_V_2, this);
      case FLAREON_V_72:
      return copy (FLAREON_V_11, this);
      case FLAREON_V_73:
      return copy (FLAREON_V_11, this);
      case VAPOREON_V_74:
      return copy (VAPOREON_V_15, this);
      case VAPOREON_V_75:
      return copy (VAPOREON_V_15, this);
      case GLACEON_V_76:
      return copy (GLACEON_V_24, this);
      case GLACEON_V_77:
      return copy (GLACEON_V_24, this);
      case JOLTEON_V_78:
      return copy (JOLTEON_V_30, this);
      case JOLTEON_V_79:
      return copy (JOLTEON_V_30, this);
      case ESPEON_V_80:
      return copy (ESPEON_V_35, this);
      case ESPEON_V_81:
      return copy (ESPEON_V_35, this);
      case SYLVEON_V_82:
      return copy (SYLVEON_V_40, this);
      case SYLVEON_V_83:
      return copy (SYLVEON_V_40, this);
      case UMBREON_V_84:
      return copy (UMBREON_V_47, this);
      case UMBREON_V_85:
      return copy (UMBREON_V_47, this);
      case AROMA_LADY_86:
      return copy (AROMA_LADY_66, this);
      case GORDIE_87:
      return copy (GORDIE_67, this);
      case LEAFEON_VMAX_88:
      return copy (LEAFEON_VMAX_3, this);
      case LEAFEON_VMAX_89:
      return copy (LEAFEON_VMAX_3, this);
      case GLACEON_VMAX_90:
      return copy (GLACEON_VMAX_25, this);
      case GLACEON_VMAX_91:
      return copy (GLACEON_VMAX_25, this);
      case SYLVEON_VMAX_92:
      return copy (SYLVEON_VMAX_41, this);
      case SYLVEON_VMAX_93:
      return copy (SYLVEON_VMAX_41, this);
      case UMBREON_VMAX_94:
      return copy (UMBREON_VMAX_48, this);
      case UMBREON_VMAX_95:
      return copy (UMBREON_VMAX_48, this);
      case AROMA_LADY_96:
      return copy (AROMA_LADY_66, this);
      case GORDIE_97:
      return copy (GORDIE_67, this);
      case RAPID_SHAKE_98:
      return copy (RAPID_SHAKE_60, this);
      default:
      return null;
    }
  }
}
