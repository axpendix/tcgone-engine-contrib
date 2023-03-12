package tcgwars.logic.groovy

import tcgwars.logic.*
import tcgwars.logic.card.*
import tcgwars.logic.card.Resistance.ResistanceType
import tcgwars.logic.card.pokemon.*
import tcgwars.logic.card.trainer.*
import tcgwars.logic.effect.*
import tcgwars.logic.effect.ability.*
import tcgwars.logic.effect.advanced.*
import tcgwars.logic.effect.basic.*
import tcgwars.logic.effect.event.*
import tcgwars.logic.effect.special.*

import tcgwars.logic.card.energy.*
import tcgwars.logic.effect.ability.Ability.ActivationReason
import tcgwars.logic.effect.blocking.*
import tcgwars.logic.effect.getter.*
import tcgwars.logic.effect.gm.*
import tcgwars.logic.client.requestbuilder.*
import tcgwars.logic.exception.EffectRequirementException
import tcgwars.logic.util.*

import java.util.function.Predicate

import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.card.Type.*
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.EffectType.*
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.groovy.TcgBuilders.*
import static tcgwars.logic.groovy.TcgStatics.*

/**
 * @author axpendix@hotmail.com
 */
class TcgStatics {

  static {
//		CardList.metaClass.moveTo(CardList cl){
//			this.container.removeAll(this)
//			cl.addAll(this)
//			this
//		}
  }

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS, Y = FAIRY;

  static Weakness weak (Type t, String f=Weakness.X2){
    new Weakness(t,f)
  }
  static Resistance resist (Type t, ResistanceType f=ResistanceType.MINUS30){
    new Resistance(t,f)
  }
  static HP hp(int value){
    HP.valueOf(value)
  }
  static Battleground bg(){
    return Battleground.getInstance()
  }
  static Battleground getBg(){
    return Battleground.getInstance()
  }
  static damage (int dmg, Target target=Target.OPP_ACTIVE){
    new Damage(hp(dmg), target).run(bg())
  }
  static damage (int dmg, PokemonCardSet to){
    new ResolvedDamage(hp(dmg), to).run(bg())
  }
  static damage (HP dmg, PokemonCardSet to=opp().active){
    new ResolvedDamage(dmg, to).run(bg())
  }
  static damage (HP dmg, PokemonCardSet from, PokemonCardSet to){
    new ResolvedDamage(dmg, from, to).run(bg())
  }
  static damage (HP dmg, PokemonCardSet from, PokemonCardSet to, Source source){
    new ResolvedDamage(dmg, from, to, source).run(bg())
  }
  static damage (int dmg, List<PokemonCardSet> list){
    for (pcs in list){
      damage dmg,pcs
    }
  }
  static flip (Closure eachHead, Closure eachTail={}, multi=[:]){
    flip("", 1, eachHead, eachTail, multi)
  }
  static flip (String info, Closure eachHead, Closure eachTail={}, multi=[:]){
    flip(info, 1, null, eachHead, eachTail, multi)
  }
  static flip (int count, Closure eachHead, Closure eachTail={}, multi=[:]){
    flip("", count, eachHead, eachTail, multi)
  }
  static flip (PlayerType playerType, Closure eachHead, Closure eachTail={}, multi=[:]){
    flip("", playerType, eachHead, eachTail, multi)
  }
  static flip (String info, int count, Closure eachHead, Closure eachTail={}, multi=[:]){
    flip(info, count, null, eachHead, eachTail, multi)
  }
  static flip (String info, PlayerType playerType, Closure eachHead, Closure eachTail={}, multi=[:]){
    flip(info, 1, playerType, eachHead, eachTail, multi)
  }
  static flip (String info, int count, PlayerType playerType, Closure eachHead, Closure eachTail={}, multi=[:]){
    CoinFlip cf=new CoinFlip(count, toEffect (eachHead), toEffect (eachTail))
    cf.setInfo(info)
    if(playerType) {
      cf.setPlayer(playerType)
    }
    for(entry in multi){
      cf.setEffectForANumberOfHeads(toEffect(entry.value as Closure), entry.key as Integer)
    }
    cf.run(bg())
  }
  static flipTails (Closure eachTail) {
    flip(1, {}, eachTail)
  }
  static flipUntilTails (Closure eachHead, playerType=null){
    NeverEndingCoinFlip cf=new NeverEndingCoinFlip()
    cf.effectForEachHead = toEffect (eachHead)
    cf.setPlayer(playerType)
    cf.run(bg)
  }

  //For newer formats "may" should not be used, but for older (Wizards era) ones doing a coin flip was the offered alternative if a player didn't know how to play RPS.
  static rockPaperScissors(Closure winEff, Closure lossEff = {}, boolean may = false) {
    def winnerDetermined = false
    def myWin = false
    def confirmMsg = "Do you want to play \"Rock-Paper-Scissors\"? (Either player saying no will result in a coinflip.)"
    if (!may || confirm(confirmMsg) && oppConfirm(confirmMsg)) {
      while (!winnerDetermined) {
        def myChoice = choose([4,5,6], ['Rock', 'Paper', 'Scissors'], "Rock-Paper-Scissors")
        def opponentChoice = oppChoose([1,2,3], ['Rock', 'Paper', 'Scissors'], "Rock-Paper-Scissors")
        if ((myChoice - opponentChoice) % 3 == 1) {
          winnerDetermined = true
          myWin = true
        } else if((myChoice - opponentChoice) % 3 == 2) {
          winnerDetermined = true
        }
      }
    } else {
      flip {myWin = true}
    }
    if (myWin)
      winEff.call()
    else
      lossEff.call()
  }

  static Effect toEffect(Closure c){
    return new DirectEffect(){
      public EffectType getEffectType() {
        EffectType.CUSTOM_EFFECT
      }
      public void process(Battleground arg0, Event arg1) {
        c.call()
      }
    }
  }
  static discardSelfEnergy(Type...types){
    //TODO check if energy is sufficient. if not, dont run DSE
    new DiscardSelfEnergy(types).run(bg())
  }
  static discardSelfEnergyInOrderTo(Type...types){
    new DiscardSelfEnergy(types).run(bg())
  }
  static discardOpponentEnergy(Target target){
    new DiscardOpponentEnergyCard(target).run(bg())
  }
  static discardDefendingEnergy(){
    new DiscardOpponentEnergyCard(Target.OPP_ACTIVE).run(bg())
  }
  static discardDefendingSpecialEnergy(Object delegate){
    afterDamage { targeted (delegate.defending) {
      if(delegate.defending.cards.filterByType(CardType.SPECIAL_ENERGY)){
        delegate.defending.cards.filterByType(CardType.SPECIAL_ENERGY).select("Discard").discard()
      }
    } }
  }
  static discardAllSelfEnergy(Type type=null){
    def ef=new DiscardAllSelfEnergy(type)
    ef.run(bg())
    ef.getList()
  }
  static discardAllSelfEnergyInOrderTo(Type type=null){
    def ef=new DiscardAllSelfEnergy(type)
    ef.run(bg())
    ef.getList()
  }
  /**
   * Select energy cards attached to a {@link PokemonCardSet} using the
   * {@link EnergySelectUIRequestBuilder Energy Select UI}
   * @param pcs {@link PokemonCardSet} with the Energy cards to choose
   * @param types {@link Type}s of energy to be selected. Default: C
   * @return {@link CardList} of the selected cards, can be empty CardList
   */
  static CardList selectEnergy(PokemonCardSet pcs, Type...types=C) {
    def ef = new SelectEnergy(pcs.cards, types)
    ef.playerType = bg.currentThreadPlayerType
    bg.em().activateEffect(ef)
    return ef.selectedCards ?: []
  }
  /**
   * Selects Energy of specified Type from the attacking {@link PokemonCardSet} before damage, then discards it after
   * damage. Should only be used for {@link Move}s
   * @param types {@link Type}s of energy to be discarded. Default: C
   */
  static discardSelfEnergyAfterDamage(Type...types=C) {
    def pcs = Target.YOUR_ACTIVE.getSingleTarget(bg)
    def cards = selectEnergy(pcs, types)
    afterDamage {
      def de = new DiscardEnergy(cards)
      de.source = ATTACK
      bg.em().activateEffect(de)
    }
  }
  /**
   * Selects Energy of specified Type from the attacking {@link PokemonCardSet} before damage, then moves it to a new
   * location after damage. Should only be used for {@link Move}s and should not be moved to another PokemonCardSet
   * @param types {@link Type}s of energy to be moved. Default: C
   */
  static moveSelfEnergyAfterDamage(CardList newLocation, Type...types=C) {
    def pcs = Target.YOUR_ACTIVE.getSingleTarget(bg)
    def cards = selectEnergy(pcs, types)
    afterDamage {

    }
  }
  static moveSelfEnergyAfterDamage(PokemonCardSet newPcs, Type...types=C) {
    def pcs = Target.YOUR_ACTIVE.getSingleTarget(bg)
    def cards = selectEnergy(pcs, types)
    afterDamage {
      cards.each {
        energySwitch pcs, newPcs, it, true
      }
      bc "$cards moved from $pcs to $newPcs"
    }
  }
  static moveDefendingEnergyAfterDamage(def newLocation, Type...types=C) {
    def pcs = Target.OPP_ACTIVE.getSingleTarget(bg)
    def cards = selectEnergy(pcs, types)
    def newPcs = null
    if (newLocation instanceof PokemonCardSet) {
      newPcs = newLocation
    }
    else if (newLocation instanceof PcsList) {
      newPcs = newLocation.select "Move $cards to?"
    }
    else if (!(newLocation instanceof CardList)) {
      throw new IllegalArgumentException("moveDefendingEnergyAfterDamage() newLocation=${newLocation} type not supported")
    }
    afterDamage {
      if (newLocation instanceof CardList) {
        cards.moveTo newLocation
      }
      else {
        cards.each {
          energySwitch pcs, newPcs as PokemonCardSet, it, true
        }
        bc "$cards moved from $pcs to $newPcs"
      }
    }
  }
  /**
   * Selects Energy of specified Type from the opponent's active {@link PokemonCardSet} before damage, then discards it
   * after damage. Should only be used for {@link Move}s
   * @param types (optional) {@link Type}s of energy to be discarded. Default: C
   */
  static discardDefendingEnergyAfterDamage(Type...types=C) {
    def pcs = Target.OPP_ACTIVE.getSingleTarget(bg)
    def cards = selectEnergy(pcs, types)
    afterDamage {
      def de = new DiscardEnergy(cards)
      de.source = ATTACK
      bg.em().activateEffect(de)
    }
  }
  static CardList hand(){
    bg().ownHand()
  }
  static CardList getHand(){
    bg().ownHand()
  }
  static CardList discardPile(){
    bg().ownDiscard()
  }
  static CardList getDiscardPile(){
    bg().ownDiscard()
  }
  static DeckCardList deck(){
    bg().ownDeck()
  }
  static DeckCardList getDeck(){
    bg().ownDeck()
  }
  static BenchSet bench(){
    bg().ownBench()
  }
  static BenchSet getBench(){
    bg().ownBench()
  }
  static PokemonCardSet active(){
    bg().ownActive()
  }
  static PokemonCardSet getActive(){
    bg().ownActive()
  }
  static PlayerBattleground my(){
    bg().getOwnPBG()
  }
  static PlayerBattleground getMy(){
    bg().getOwnPBG()
  }
  static PlayerBattleground opp(){
    bg().getOpponentPBG()
  }
  static PlayerBattleground getOpp(){
    bg().getOpponentPBG()
  }
  static PcsList all(){
    Target.ALL.getTarget(bg())
  }
  static PcsList getAll(){
    Target.ALL.getTarget(bg())
  }
  static bc(String msg){
    bg().gm().broadcastMessage(msg)
  }
  static wcu(String msg){
    bg().gm().warnCurrentUser(msg)
  }
  static checkFaint(){
    bg().em().run(new CheckFaint());
  }
  static discard(Card card){
    bg().em().run(new Discard(card));
  }
  /**
   * Written for Burning Energy. TODO remove after 'source' refactoring is done
   * @param card
   */
  static discardSelfEnergyCard(Card card){
    if(card.name == "Burning Energy") return
    bg().em().run(new Discard(card));
  }
  static boolean confirm(String info){
    bg().ownClient().confirm(new ConfirmUIRequestBuilder().setInfo(info))
  }
  static boolean confirm(String info, PlayerType playerType){
    bg().getClient(playerType).confirm(new ConfirmUIRequestBuilder().setInfo(info))
  }
  static boolean oppConfirm (String info){
    bg().oppClient().confirm(new ConfirmUIRequestBuilder().setInfo(info))
  }
  static choose (List choices, List<String> labels, String info="", defaultChoice=null){
    assert choices.size() == labels.size()
    def cs = []
    def dc
    for(c in choices){
      def choice=new Choice(labels.get(choices.indexOf(c)), c)
      cs.add(choice)
      if(c==defaultChoice) dc=choice
    }
    bg().ownClient().makeChoice(new MakeChoiceUIRequestBuilder().setInfo(info).setChoices(cs).setDefaultChoice(dc))
  }
  static choose (List choices, String info="", defaultChoice=null){
    def cs = []
    def dc
    for(c in choices){
      def choice=new Choice(c.toString(), c)
      cs.add(choice)
      if(c==defaultChoice) dc=choice
    }
    bg().ownClient().makeChoice(new MakeChoiceUIRequestBuilder().setInfo(info).setChoices(cs).setDefaultChoice(dc))
  }
  static oppChoose (List choices, List<String> labels, String info="", defaultChoice=null){
    if(labels != null){
      assert choices.size() == labels.size()
    }
    def cs = []
    def dc
    for(c in choices){
      def choice=new Choice(labels!=null ? labels.get(choices.indexOf(c)) : c.toString(), c)
      cs.add(choice)
      if(c==defaultChoice) dc=choice
    }
    bg().oppClient().makeChoice(new MakeChoiceUIRequestBuilder().setInfo(info).setChoices(cs).setDefaultChoice(dc))
  }
  static oppChoose (List choices, String info="", defaultChoice=null){
    oppChoose(choices, null, info, defaultChoice)
  }
  static multiSelect (List pcsList, Integer count, String info="Select Pokémon") {
    // Optional parameters in the middle of a param list confuse the parser. In order to have min before max in the
    // following definition we'll add this overload to handle "count" variations that also provide custom text
    multiSelect(pcsList, count, count, info)
  }
  static multiSelect (List pcsList, Integer min, Integer max, String info="Select Pokémon"){
    LUtils.selectMultiPokemon(bg().ownClient(), pcsList, info, min, max)
  }
  static multiDamage (List pcsList, int count, int dmg, String info="Select to deal damage"){
    def a=LUtils.selectMultiPokemon(bg().ownClient(), pcsList, info, count)
    for(p in a){
      damage(hp(dmg), p)
    }
  }
  static noWrDamage (int dmg, PokemonCardSet to){
//		new DontApplyWRDamage(new ResolvedDamage(hp(dmg), to)).run(bg())
//		bg.dm().addDamage(my.active, to, hp(dmg), [DamageManager.DamageFlag.NO_RESISTANCE, DamageManager.DamageFlag.NO_WEAKNESS])
    new ResolvedDamage(hp(dmg), my.active, to, Source.ATTACK, DamageManager.DamageFlag.NO_RESISTANCE, DamageManager.DamageFlag.NO_WEAKNESS).run(bg)
  }
  static noWeaknessDamage (int dmg, PokemonCardSet to){
    new ResolvedDamage(hp(dmg), my.active, to, Source.ATTACK, DamageManager.DamageFlag.NO_WEAKNESS).run(bg)
  }
  static noResistanceDamage (int dmg, PokemonCardSet to) {
    new ResolvedDamage(hp(dmg), my.active, to, Source.ATTACK, DamageManager.DamageFlag.NO_RESISTANCE).run(bg)
  }
  static noResistanceOrAnyEffectDamage(int dmg, PokemonCardSet to){
    new ResolvedDamage(hp(dmg), my.active, to, Source.ATTACK, DamageManager.DamageFlag.NO_RESISTANCE, DamageManager.DamageFlag.NO_DEFENDING_EFFECT).run(bg)
  }
  static swiftDamage (int dmg, PokemonCardSet to){
//		new SwiftDamage(new ResolvedDamage(hp(dmg), to)).run(bg())
//		new SwiftDamage(toEffect { targeted (to) {
//			bg.dm().addDamage(my.active, to, hp(dmg), [DamageManager.DamageFlag.NO_DEFENDING_EFFECT, DamageManager.DamageFlag.NO_RESISTANCE, DamageManager.DamageFlag.NO_WEAKNESS])
//		} }).run(bg())
    new ResolvedDamage(hp(dmg), my.active, to, Source.ATTACK, DamageManager.DamageFlag.NO_DEFENDING_EFFECT, DamageManager.DamageFlag.NO_RESISTANCE, DamageManager.DamageFlag.NO_WEAKNESS).run(bg)
  }
  static shredDamage (int dmg) {
//		new SwiftDamage(toEffect {
//			bg.dm().addDamage(my.active, opp.active, hp(dmg), [DamageManager.DamageFlag.NO_DEFENDING_EFFECT])
//			bg.dm().applyWeakness()
//			bg.dm().applyResistance()
//		}).run(bg())
    new ResolvedDamage(hp(dmg), my.active, opp.active, Source.ATTACK, DamageManager.DamageFlag.NO_DEFENDING_EFFECT).run(bg)
  }

  static directDamage (int dmg, PokemonCardSet to, Source src=Source.ATTACK){
    new DirectDamage(hp(dmg), to).run(bg())
  }
  static attachEnergy (PokemonCardSet to, Card card, ActivationReason reason=ActivationReason.OTHER){
    new AttachEnergy(to, card, reason).run(bg())
  }
  static apply (SpecialConditionType type, PokemonCardSet to=opp().active, Source source=Source.ATTACK){
    if(to.active){
      new ApplySpecialCondition(type, to, source).run(bg())
    }
  }
  static afterDamage (Closure c){
    new AfterApplyDamageEffect(new AbstractDirectMoveEffect() {
      @Override
      void process(Battleground bg, Event event) {
        c.call()
      }
    }).run(bg())
  }
  static shuffleOppDeck(){
    bg().em().run(new ShuffleDeck(TargetPlayer.OPPONENT))
  }
  static shuffleDeck(CardList shuffled=null, TargetPlayer targetPlayer=TargetPlayer.SELF){
    if(shuffled==null){
      bg().em().run(new ShuffleDeck(targetPlayer))
    }
    else {
      bg().em().run(new ShuffleToDeck(shuffled, targetPlayer))
    }
  }
  static energySwitch (PokemonCardSet from, PokemonCardSet to, Card card){
    energySwitch(from, to, card, false)
  }
  static energySwitch (PokemonCardSet from, PokemonCardSet to, Card card, Boolean suppressLog){
    bg().em().run(new EnergySwitch(from,to,card, suppressLog))
  }
  static int MAX=Short.MAX_VALUE
  static cantUseAttack(Move move, PokemonCardSet t, int turns=3){
    new CantUseAttack(move, t, turns).run(bg())
  }
  static Closure basicEnergyFilter(Type type){
    return { it.cardTypes.is(BASIC_ENERGY) && it.asEnergyCard().containsType(type) }
  }
  static Closure energyFilter(Type type){
    return { it.cardTypes.is(ENERGY) && it.asEnergyCard().containsType(type) }
  }
  static Closure cardTypeFilter(CardType... types){
    return { it.cardTypes.isAll(types) }
  }
  static Closure pokemonTypeFilter(Type type){
    return { Card it -> it.cardTypes.isPokemon() && it.asPokemonCard().types.contains(type) }
  }
  //use for metronome-like effects
  static attack(Move move){
    bg().em().run(new Attack(move, my().active, true))
  }
  static preventAllEffectsNextTurn(){
    new PreventAllEffectsNextTurn(my().active).run(bg())
  }
  static preventAllDamageNextTurn(){
    new PreventAllDamageNextTurn().run(bg())
  }
  static preventAllEffectsExcludingDamageNextTurn(){
    new PreventAllEffectsExcludingDamageNextTurn(my().active).run(bg())
  }
  static heal(int amount, PokemonCardSet target, Source source=Source.ATTACK){
    bg().em().run(new RemoveDamageCounter(target,source,hp(amount)))
  }
  static healAll(PokemonCardSet target, Source source=Source.ATTACK){
    bg().em().run(new RemoveDamageCounter(target,source,target.damage))
  }
  static reduceDamageNextTurn (HP reduce, Move thisMove, boolean either=false, boolean beforeWR=false){
    new ReduceDamageNextTurn(reduce, thisMove.name).setEither(either).setBeforeWR(beforeWR).run(bg())
  }
  static reduceDamageFromDefendingNextTurn (HP reduce, Move thisMove, PokemonCardSet defending){
    afterDamage {
      delayed target:defending, {
        after PROCESS_ATTACK_EFFECTS, {
          bg.dm().each {
            if(it.from==defending && ef.attacker==defending && it.dmg.value){
              bc "${thisMove.name} reduces damage"
              it.dmg-=reduce
            }
          }
        }
        unregisterAfter 2
        after FALL_BACK, defending, {unregister()}
        after CHANGE_STAGE, defending, {unregister()}
      }
    }
  }
  static cantRetreat(PokemonCardSet target, Source source=Source.ATTACK, boolean benchingEitherEndsEffect=false){
    new CantRetreat(target, source, benchingEitherEndsEffect).run(bg())
  }
  static sw (PokemonCardSet old, PokemonCardSet newp, Source source=Source.ATTACK) {
    bg().em().run(new Switch(old,newp,source))
  }
  static sw2 (PokemonCardSet pcs1, PokemonCardSet pcs2 = null, Source src = Source.ATTACK) {
    if(pcs2 == null) {
      return !(bg().em().run(new Switch(pcs1.owner.pbg.active, pcs1, src, pcs1)))
    } else {
      return !(bg().em().run(new Switch(pcs1, pcs2, src, pcs1)))
    }
  }
  static discardStadium(){
    if (bg().stadiumInfoStruct?.stadiumCard){
      discard(bg().stadiumInfoStruct?.stadiumCard)
    }
  }
  static removePCS(PokemonCardSet pcs){
    if(my.active==pcs){
      def r=new RemoveFromPlay(pcs,null)
      r.run(bg)
      if (my.bench.isEmpty()){
        my.active=null
        bg.gameManager.endGame(opp.owner, WinCondition.NOPOKEMON)
        return
      }
      sw ( null, my.bench.select("New active Pokémon."))
      //my.bench.remove(pcs)
    }
    else if (my.bench.contains(pcs)){
      def r=new RemoveFromPlay(pcs,null)
      my.bench.remove(pcs)
      r.run(bg)
    }
    else if(opp.active==pcs){
      def r=new RemoveFromPlay(pcs,null)
      r.run(bg)
      if (opp.bench.isEmpty()){
        opp.active=null
        bg.gameManager.endGame(my.owner, WinCondition.NOPOKEMON)
        return
      }
      sw ( null, opp.bench.oppSelect("New active Pokémon."))
      //opp.bench.remove(pcs)
    }
    else if (opp.bench.contains(pcs)){
      def r=new RemoveFromPlay(pcs,null)
      opp.bench.remove(pcs)
      r.run(bg)
    }
  }
  static PokemonCardSet benchPCS (Card card, ActivationReason reason=OTHER){
    def effect = new PutOnBench(card, reason);
    if (!bg().em().run(effect)) {
      return effect.getPlace();
    }
    return null;
  }
  static evolve (PokemonCardSet pcs, Card card) {
    bg().em().run(new Evolve(pcs, card))
  }
  static evolveDirect (PokemonCardSet pcs, Card card) {
    bg().em().run(new Evolve(pcs, card).setDirect(true))
  }
  static devolve (PokemonCardSet pcs, Card card, CardList newLocation){
    bg().em().run(new Devolve(pcs, card, newLocation))
  }
  static devolve (PokemonCardSet pcs, CardList newLocation){
    bg().em().run(new Devolve(pcs, newLocation))
  }
  static devolveUntilBasic(PokemonCardSet pcs, CardList newLocation) {
    while (pcs.evolution) {
      if (devolve(pcs, newLocation)) {
        break
      }
    }
  }
  static babyEvolution(String evolName, PokemonCardSet baby){
    babyEvolution([evolName], baby)
  }
  static babyEvolution(List<String> evolNames, PokemonCardSet baby){
    def pcs = my.hand.findAll{
      aCard -> evolNames.any{ aCard.name.contains(it) }
    }.select("Choose which Pokémon will $baby evolve to:")
    healAll baby
    evolveDirect(baby, pcs.first())
  }
  static checkCanBabyEvolve(String evolName, PokemonCardSet baby){
    checkCanBabyEvolve([evolName], baby)
  }
  static checkCanBabyEvolve(List<String> evolNames, PokemonCardSet baby){
    assert my.hand.any{
      aCard -> evolNames.any{ aCard.name.contains(it) }
    } : "There are no $evolNames in your hand $baby can evolve into."
  }
  static extraPoison (int v){
    new ExtraPoisonDamage(v).run(bg())
  }
  static increasePoison (int v) {
    int poisonValue = bg.em().retrieveObject("extra_poison_counter_"+opp.active.hashCode()) ?: 0
    extraPoison(poisonValue + v)
  }
  static sandAttack (Move thisMove) {
    new SandAttack(thisMove.name).run(bg())
  }
  static draw (int count, TargetPlayer targetPlayer=TargetPlayer.SELF){
    bg().em().run(new DrawCard(count, targetPlayer))
  }
  static increasedBaseDamageNextTurn (String atkname, HP extra){
    new IncreasedBaseDamageNextTurn(atkname, extra).run(bg())
  }
  static decreasedBaseDamageNextTurn (PokemonCardSet pcs, String atkname, HP minus){
    delayed target:pcs, {
      after PROCESS_ATTACK_EFFECTS, {
        if(ef.attacker == pcs && ef.move.name == atkname) {
          bg.dm().findAll{it.from == pcs && it.to.owner != pcs.owner && it.dmg.value}.each{
            bc "-"+minus.value+" damage from last turn"
            it.dmg -= minus
          }
        }
      }
      after FALL_BACK, pcs, {unregister()}
      unregisterAfter 3
    }
  }
  static BlockingEffect blockingEffect (EffectType...effectTypes){
    def ef=new BlockingEffect(effectTypes)
    ef.run(bg())
    ef
  }
  static Effect wrapForEffect(EffectType _effectType = CUSTOM_EFFECT, Runnable runnable) {
    new DirectEffect() {
      @Override
      void process(Battleground bg, Event event) {
        runnable.run()
      }
      @Override
      EffectType getEffectType() {
        return _effectType
      }
    }
  }
  static inOrderTo(Runnable runnable) {
    bg.em().run(new InOrderTo(wrapForEffect(runnable)))
  }
  static cantPlayEnergy (){
    new PreventPlayEnergy().run(bg())
  }
  static attachEnergyFromDiscardPile (Type type, boolean flipcoin=false){
    new AttachEnergyFromDiscardPile(type, flipcoin).run(bg())
  }
  static moveCard (params=[:], Card card, CardList newLocation){
    MoveCard effect = new MoveCard(card, newLocation)
    if(params.hidden)
      effect.hidden = params.hidden
    if(params.suppressLog)
      effect.suppressLog = params.suppressLog
    effect.run(bg)
  }
  static moveCard (params=[:], Card card, PokemonCardSet pcs){
    MoveCard effect = new MoveCard(card, pcs)
    if(params.suppressLog)
      effect.suppressLog = params.suppressLog
    effect.run(bg)
  }
  static removeFromPlay (PokemonCardSet pcs, CardList cards){
    new RemoveFromPlay(pcs, cards).run(bg())
  }
  static removeDamageCounterEqualToDamageDone() {
    new RemoveDamageCounterEqualToDamageDone().run(bg())
  }
  static removeDamageCounterEqualToHalfDamageDone() {
    new RemoveDamageCounterEqualToHalfDamageDone().run(bg())
  }
  static cantAttackNextTurn(PokemonCardSet target){
    new CantAttackNextTurn(target).run(bg())
  }
  static whirlwind(){
    new Whirlwind(bg.oppActive()).run(bg())
  }
  static extraEnergyDamage (int max=2, HP perExtra, Type type, Move thisMove){
    new ExtraEnergyDamage(max, perExtra, thisMove.energyCost.toArray() as Type[], type).run(bg())
  }
  static clearSpecialCondition (PokemonCardSet target, Source source=Source.ATTACK, List<SpecialConditionType> types=SpecialConditionType.values().toList() ){
    new ClearSpecialCondition(target, source, types.toArray() as SpecialConditionType[]).run(bg())
  }
  static dontApplyResistance (){
    new DontApplyResistance().run(bg())
  }
  static only( Closure c ) {
    c.resolveStrategy = Closure.DELEGATE_FIRST
    c
  }
  static CardList rearrange (CardList cards, String info="", TargetPlayer targetPlayer=TargetPlayer.SELF){
    return bg().getClient(targetPlayer.getPlayerType(bg())).rearrangeCards(new RearrangeCardsUIRequestBuilder().setCards(cards).setInfo(info))
  }
  static doMoreDamageNextTurn(Move thisMove, int inc, PokemonCardSet self){
    delayed target:self, {
      def registeredOn=0
      after PROCESS_ATTACK_EFFECTS, {
        if(bg.turnCount!=registeredOn){
          bg.dm().each {if(it.from==self && it.dmg.value){
            bc "$thisMove does +$inc to ${it.to}"
            it.dmg+=hp(inc)
          }}
        }
      }
      unregisterAfter 3
      after FALL_BACK, self, {unregister()}
      after EVOLVE, self, {unregister()}
      after DEVOLVE, self, {unregister()}
      register{registeredOn=bg.turnCount}
    }
  }
  static safeguard(PokemonCardSet self, Object delegate){
    delegate.delayedA target:self, {
      before null, self, Source.ATTACK, {
        if (self.owner.opposite.pbg.active.pokemonEX && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
          bc "Safeguard prevents effect"
          prevent()
        }
      }
      before APPLY_ATTACK_DAMAGES, {
        bg.dm().each {
          if(it.to == self && it.notNoEffect && it.from.pokemonEX ){
            it.dmg = hp(0)
            bc "Safeguard prevents damage"
          }
        }
      }
      after ENERGY_SWITCH, {
        def efs = (ef as EnergySwitch)
        if(efs.from.pokemonEX && efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
          discard efs.card
        }
      }
    }
  }
  static safeguardForExAndGx(String name, PokemonCardSet self, Object delegate){
    delegate.delayedA target:self, {
      before null, self, Source.ATTACK, {
        if ((self.owner.opposite.pbg.active.pokemonEX || self.owner.opposite.pbg.active.pokemonGX) && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
          bc "$name prevents effect"
          prevent()
        }
      }
      before APPLY_ATTACK_DAMAGES, {
        bg.dm().each {
          if(it.to == self && it.notNoEffect && (it.from.pokemonEX || it.from.pokemonGX)){
            it.dmg = hp(0)
            bc "$name prevents damage"
          }
        }
      }
      after ENERGY_SWITCH, {
        def efs = (ef as EnergySwitch)
        if((efs.from.pokemonEX || efs.from.pokemonGX) && efs.to == self && bg.currentState == Battleground.BGState.ATTACK){
          discard efs.card
        }
      }
    }
  }
  static reducedDamageFromAttacksAbility(PokemonCardSet self, int amount, Object abilityDelegate) {
    abilityDelegate.delayedA target:self, {
      before APPLY_ATTACK_DAMAGES, {
        bg.dm().each {
          if (it.to == self && it.dmg.value && it.notNoEffect) {
            bc "$abilityDelegate.name -$amount"
            it.dmg -= hp(amount)
          }
        }
      }
    }
  }
  static preventAllEffectsFromPokemonExNextTurn(Move thisMove, PokemonCardSet self){
    delayed target:self, {
      before null, self, Source.ATTACK, {
        if (self.owner.opposite.pbg.active.pokemonEX && bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE){
          bc "$thisMove prevents effect"
          prevent()
        }
      }
      before APPLY_ATTACK_DAMAGES, {
        bg.dm().each {
          if(it.to == self && it.notNoEffect && self.owner.opposite.pbg.active.pokemonEX && bg.currentTurn==self.owner.opposite ){
            it.dmg = hp(0)
            bc "$thisMove prevents damage"
          }
        }
      }
      unregisterAfter(2)
      after CHANGE_STAGE, self, {unregister()}
      after FALL_BACK, self, {unregister()}
    }
  }
  static usingThisAbilityEndsTurn(Object delegate) {
    bc "${delegate.self.owner.getPlayerUsername(bg)}'s turn ends due to using ${delegate.thisAbility}."
    bg.gm().betweenTurns()
  }

  static preventAllEffectsFromCustomPokemonNextTurn(Move thisMove, PokemonCardSet self, Predicate<PokemonCardSet> predicate){
    delayed target:self, {
      before null, self, Source.ATTACK, {
        if (bg.currentTurn==self.owner.opposite && ef.effectType != DAMAGE && predicate.test(self.owner.opposite.pbg.active)){
          bc "$thisMove prevents effect"
          prevent()
        }
      }
      before APPLY_ATTACK_DAMAGES, {
        bg.dm().each {
          if(it.to == self && it.notNoEffect && predicate.test(self.owner.opposite.pbg.active) && bg.currentTurn==self.owner.opposite ){
            it.dmg = hp(0)
            bc "$thisMove prevents damage"
          }
        }
      }
      unregisterAfter(2)
      after CHANGE_STAGE, self, {unregister()}
      after FALL_BACK, self, {unregister()}
    }
  }

  static void preventAllDamageFromCustomPokemonNextTurn(Move thisMove, PokemonCardSet self, Predicate<PokemonCardSet> predicate){
    delayed priority:LAST, target:self, {
      before APPLY_ATTACK_DAMAGES, {
        bg.dm().each {
          if(it.to == self && it.notNoEffect && it.from != it.to && predicate.test(it.from) && bg.currentTurn==self.owner.opposite ){
            it.dmg = hp(0)
            bc "$thisMove prevents damage"
          }
        }
      }
      unregisterAfter(2)
      after CHANGE_STAGE, self, {unregister()}
      after FALL_BACK, self, {unregister()}
    }
  }
  static callForFamily(Map params=[:],int count,Object delegate){
    delegate.attackRequirement {
      assert my.deck.notEmpty
      assert my.bench.notFull
    }
    delegate.onAttack {
      def maxSpace = Math.min(my.bench.freeBenchCount,count)
      def basicFilter = params.basic ? BASIC : POKEMON
      def pkmnName = ""
      if(params.name){
        pkmnName = params.name
      }
      if(params.types){
        deck.search (max: maxSpace,{it.name.contains(pkmnName) && it.cardTypes.is(basicFilter) && params.types.any{ty -> it.asPokemonCard().types.contains(ty)}}).each {
          benchPCS(it)
        }
      }
      else{
        deck.search (max: maxSpace,{it.name.contains(pkmnName) && it.cardTypes.is(basicFilter)}).each{
          benchPCS(it)
        }
      }
      shuffleDeck()
    }
  }
  static require(boolean failed) {
    if (failed) {
      throw new EffectRequirementException()
    }
  }

  static targeted (PokemonCardSet pcs, Source source, Closure c){
    new AbstractDirectTargetedEffect(pcs) {
      @Override
      void process(Battleground bg, Event event) {
        c.call(pcs)
      }
    }.run(bg)
  }
  static targeted (EffectType _effectType = CUSTOM_EFFECT, PokemonCardSet pcs, Closure c){
    new AbstractDirectTargetedEffect(_effectType, pcs) {
      @Override
      void process(Battleground bg, Event event) {
        c.call(pcs)
      }
    }.run(bg)
  }
  static sourced (params, Closure c) {
    bg.em().run(new AbstractDirectSourceEffect() {
      @Override
      Source getSource() {
        return params.source
      }

      @Override
      Attack getSourceAttack() {
        return params.sourceAttack
      }

      @Override
      Ability getSourceAbility() {
        return params.sourceAbility
      }

      @Override
      Card getSourceCard() {
        return params.sourceCard
      }

      @Override
      TrainerCard getSourceTrainer() {
        return params.sourceTrainer
      }

      @Override
      SpecialEnergyCard getSourceEnergy() {
        return params.sourceEnergy
      }

      @Override
      void process(Battleground bg, Event event) {
        c.call()
      }
    })
  }
  static jawClamp (Move thisMove, PokemonCardSet self, PokemonCardSet defending, boolean asLongAsSelfIsActive=false) {
    afterDamage { if (defending.active) {
      delayed target:defending, {
        before RETREAT, defending, { wcu "${thisMove.name} prevents retreat."; prevent()}
        before SWITCH, defending, { bc "${thisMove.name} prevents switch."; prevent()}
        if(asLongAsSelfIsActive){
          after FALL_BACK, self, {unregister()}
          after CHANGE_STAGE, self, {unregister()}
        }
        after FALL_BACK, defending, {unregister()}
        after CHANGE_STAGE, defending, {unregister()}
        unregisterAfter 2
      }
    } }
  }
  static attachPokemonTool (Card pokemonToolCard, PokemonCardSet pcs) {
    new AttachPokemonTool(pcs, pokemonToolCard as PokemonToolCard, OTHER).run(bg)
    bc("$pokemonToolCard is attached to $pcs")
  }
  static boolean canAttachPokemonTool (PokemonCardSet pcs) {
    int tool_limit = 1;
    if (bg.em().retrieveObject("SIGILYPH_41_Toolbox" + pcs.hashCode()) != null) {
        tool_limit = 4;
    } else if (bg.em().retrieveObject("OMEGA_DOUBLE_" + pcs.hashCode()) != null) {
        tool_limit = 2;
    }
    return pcs.cards.filterByType(POKEMON_TOOL).size() < tool_limit
  }
  static boolean canAttachPokemonTool (PokemonCardSet pcs, Card pokemonToolCard) {
    return canAttachPokemonTool(pcs) && (pokemonToolCard as PokemonToolCard).allowAttach(bg(), pcs)
  }
  static boolean checkGlobalAbility (Card thisCard) {
    return !bg.em().get(new IsGlobalAbilityBlocked(thisCard));
  }
  /**
   * Use for metronome-safe between-move checks. Specialized for easy usage.
   * @param self pcs
   * @param value null: read, nonzero: store, zero: delete
   * @return if value was null, read value
   */
  static keyStore(String key, self, value){
    if(value!=null) bg.em().storeObject(key+"_"+self.hashCode(), value==0?null:value)
    else return bg.em().retrieveObject(key+"_"+self.hashCode())
  }

  static barrier(PokemonCardSet self, Object delegate){
    delegate.delayedA target:self, {
      def power= false
      before PLAY_TRAINER, {
        if (!(ef.stadium || ef.pokemonTool) && bg.currentThreadPlayerType != self.owner && bg.currentTurn.pbg.hand.contains(ef.cardToPlay)) {
          power=true
        }
      }
      after PLAY_TRAINER, {
        power=false
      }
      before (null, self, Source.TRAINER_CARD) {
        if (power && bg.currentThreadPlayerType != self.owner){ //only opponent's trainer cards
          bc "Barrier prevents effect"
          prevent()
        }
      }
    }
  }
  static barrage(PokemonCardSet self, Object delegate){
    delegate.onActivate {bg.em().storeObject("BARRAGE_"+self.hashCode(), 1)}
    delegate.onDeactivate {bg.em().storeObject("BARRAGE_"+self.hashCode(), null)}
  }
  static growth(PokemonCardSet self, Object delegate){
    delegate.delayedA target:self, {
      after ATTACH_ENERGY, self, {
        if((ef as AttachEnergy).reason==PLAY_FROM_HAND && self.owner.pbg.hand.filterByType(ENERGY)){
          self.owner.pbg.hand.filterByType(ENERGY).select(min: 0, "Growth: You may attach 1 more energy card to $self", {
            (it.cardTypes.is(CardType.SPECIAL_ENERGY)) ? ((it as SpecialEnergyCard).allowAttach(bg, self)) : true
          }, self.owner).each {attachEnergy(self, it)}
        }
      }
    }

  }
  static recovery(PokemonCardSet self, Object delegate){
    delegate.delayedA target:self, {
      before REMOVE_DAMAGE_COUNTER, self, {
        bc "Recovery: doubled healing"
        (ef as RemoveDamageCounter).hp *= 2
      }
    }
  }

  static delta_plus(PokemonCardSet self, Object delegate){
    def power = false
    delegate.delayedA target:self, priority:LAST, {
      after APPLY_ATTACK_DAMAGES, {
        power = (ef.attacker==self)
      }
    }
    delegate.getterA GET_GIVEN_PRIZES, BEFORE_LAST, {Holder holder ->
      def pcs = holder.effect.target
      if (power && pcs.owner != self.owner && pcs.KOBYDMG == bg.turnCount && holder.object > 0) {
        bc "Δ Plus gives the player an additional prize."
        holder.object += 1
      }
    }
  }

  // Δ Evolution: You may play this card from your hand to evolve a Pokémon during your first turn or the turn you play that Pokémon.
  static delta_evolution(PokemonCard thisCard){
    thisCard.asEvolution().ancientTraitDeltaEvolution = true
  }

  static omega_stop(Object delegate){
    delegate.ancientTrait "θ Stop", {
      text "Prevent all effects of your opponent's Pokémon's Abilities done to this Pokémon."
      delayedA {
        before null, self, Source.SRC_ABILITY, {
          if (e.sourceAbility.ownerCard.player == self.owner.opposite) {
            if (!ef instanceof GetterEffect) { // no log should be printed during getter effect execution to prevent log spam
              bc "θ Stop prevents effect ${e.type}"
            }
            prevent()
          }
        }
      }
    }
  }

  static boolean hasThetaStop(PokemonCardSet pcs) {
    return pcs.lastAbilities.find {it.key instanceof AncientTrait && it.key.name.contains("Stop")}
  }

  static omega_double(Object delegate){
    delegate.ancientTrait "θ Double", {
      text "This Pokémon may have up to 2 Pokémon Tool cards attached to it."
      onActivate {bg.em().storeObject("OMEGA_DOUBLE_"+self.hashCode(), 1)}
      onDeactivate {bg.em().storeObject("OMEGA_DOUBLE_"+self.hashCode(), null)}
    }
  }

  static omega_max(Object delegate){
    delegate.ancientTrait "θ Max", {
      text "When 1 of your Pokémon becomes this Pokémon, heal all damage from it."
      onActivate {
        bc "$self: θ Max"
        healAll(self)
      }
    }
  }

  static holon_pokemon_energy(Object delegate, Integer energyCount, Boolean colorless=false) {
    delegate.globalAbility { Card thisCard->
      delayed {
          before PLAY_CARD, {
            //If the user chooses Pokémon, play the card normally
            if (ef.cardToPlay == thisCard && choose([1,2], ["Pokémon", "Energy"], "Play this card as a Pokémon or as an energy?") == 2) {
              def energyEquivalent = []
              def typeImages = []
              def energyImage = (colorless) ? COLORLESS : RAINBOW
              def energyTypes = (colorless) ? [C] : valuesBasicEnergy()

              energyCount.times {
                energyEquivalent.add(energyTypes)
                typeImages.add(energyImage)
              }

              def energyCard
              energyCard = specialEnergy(new CustomCardInfo(thisCard.staticInfo).setCardTypes(ENERGY, SPECIAL_ENERGY), energyEquivalent) {
                typeImagesOverride = typeImages
                onPlay {}
                onRemoveFromPlay {
                  bg.em().run(new ChangeImplementation(thisCard, energyCard))
                }
                allowAttach { to ->
                  if (energyCount > 1 && !colorless) {
                    to.cards.energyCount()
                  } else {
                    to
                  }
                }
              }
              energyCard.initializeFrom(thisCard)

              bg.em().run(new ChangeImplementation(energyCard, thisCard))
              def playEnergy = new PlayEnergy(energyCard)
              bg.em().run(playEnergy)
              def cannotPlayEnergy = !playEnergy.attached
              if (cannotPlayEnergy) {
                bg.em().run(new ChangeImplementation(thisCard, energyCard))
              } else {
                if (energyCount > 1 && !colorless) {
                  // Select an energy before attachment so that thisCard doesn't show up as an option
                  def returningEnergy = playEnergy.attached.cards.getExcludedList(energyCard).select cardTypeFilter(ENERGY)
                  returningEnergy.moveTo(thisCard.player.pbg.hand)
                }

                bc "$energyCard is now a Special Energy Card"
              }
              prevent()
            }
          }
        }
    }
  }

  static duringYourOpponentsNextTurnThisPokemonHasNoWeakness(PokemonCardSet self) {
    delayed target:self, {
      def eff=null
      register {
        eff=getter(GET_WEAKNESSES, BEFORE_LAST, self) {holder->
          holder.object.clear()
        }
      }
      unregister {
        eff.unregister()
      }
      unregisterAfter 2
      after FALL_BACK, self, {unregister()}
      after CHANGE_STAGE, self, {unregister()}
    }
  }

  static void flipThenApplySC (SpecialConditionType sct) {
    flip {afterDamage {apply sct}}
  }

  static void applyAfterDamage (SpecialConditionType sct) {
    afterDamage {apply sct}
  }

  static boolean checkBodyguard(boolean printLog=true){
    if(bg.em().retrieveObject("Bodyguard_Count"+bg.currentTurn.opposite)){
      if(printLog) bc "Bodyguard prevents effect"
      return true
    }
    return false
  }

  static void astonish(int count=1){
    if(checkBodyguard() || !opp.hand) return
    def sel = opp.hand.shuffledCopy().select(hidden: true, count: count, "Choose ${count==1?'a':count} random ${count==1?'card':'cards'} from your opponent's hand to be shuffled into his or her deck").showToMe("Selected card(s)").showToOpponent("These cards will be shuffled from your hand to your deck")
    sel.moveTo(opp.deck)
    shuffleOppDeck()
//		opp.hand.removeAll(sel)
//		shuffleDeck(sel, TargetPlayer.OPPONENT)
//		bc "Shuffled $sel to deck"
  }

  static void healAfterDamage (int hpValue, PokemonCardSet pcs){
    afterDamage { heal hpValue, pcs }
  }

  static void discardRandomCardFromOpponentsHand(){
    if (opp.hand) opp.hand.shuffledCopy().select(hidden: true, "Discard a random card from your opponent's hand.").discard()
  }

  static void switchYourActive(Map params=[:]){
    boolean may = params.may
    boolean now = params.now
    Source src = params.source ? params.source : ATTACK
    def doit = {
      if(bench.notEmpty && my.active){
        def pcs = bench.select("Switch your active Pokémon.", !may)
        if(pcs){
          sw my.active, pcs, src
        }
      }
    }
    if(now){
      doit()
    } else {
      afterDamage {doit()}
    }
  }

  static void switchYourOpponentsBenchedWithActive(Source src = ATTACK){
    if (opp.bench){
      sw2(opp.bench.select("Select your opponent's new Active Pokémon."), null, src)
    }
  }

  static void spiritLink(delegate1, name){
    def eff
    delegate1.onPlay {
      eff = delayed target:delegate1.self, {
        before MEGA_EVOLUTION_RULE, delegate1.self, {
          if(delegate1.self.name==name) prevent()
        }
      }
    }
    delegate1.onRemoveFromPlay {
      eff.unregister()
    }
  }

  static void defendingAttacksCostsMore (PokemonCardSet pcs, List<Type> energies) {
    delayed target:pcs, {
      def eff
      register {
        eff = getter (GET_MOVE_LIST, NORMAL, pcs) {h->
          def list=[]
          for(move in h.object){
            def copy=move.shallowCopy()
            copy.energyCost.addAll(energies)
            list.add(copy)
          }
          h.object=list
        }
        bc "Attacks of $pcs will cost $energies more during next turn"
      }
      unregister {
        eff.unregister()
      }
      unregisterAfter 2
      after FALL_BACK, pcs, {unregister()}
      after CHANGE_STAGE, pcs, {unregister()}
    }
  }

  static void defendingRetreatsCostsMore (PokemonCardSet pcs, int increaseAmount) {
    delayed target:pcs, {
      def eff
      register {
        eff = getter (GET_RETREAT_COST, NORMAL, pcs) {h->
          h.object += increaseAmount
        }
        bc "Retreat cost of $pcs will cost $increaseAmount more energy during the next turn."
      }
      unregister {
        eff.unregister()
      }
      unregisterAfter 2
      after FALL_BACK, pcs, {unregister()}
      after CHANGE_STAGE, pcs, {unregister()}
    }
  }

  static void increasedDamageDoneToDefending (PokemonCardSet self, PokemonCardSet pcs, int value, String atkName=""){
    delayed target:pcs, {
      before APPLY_ATTACK_DAMAGES, {
        bg.dm().each {if(it.to==pcs && it.from.owner==self.owner && it.dmg.value>0 && it.notNoEffect){
          bc "$atkName increases damage"
          it.dmg+=hp(value)
        }}
      }
      unregisterAfter 3
      after FALL_BACK, pcs, {unregister()}
      after CHANGE_STAGE, pcs, {unregister()}
    }
  }

  static void amnesia (def delegate) {
    PokemonCardSet defending = delegate.defending
    String name = delegate.thisMove.name
    afterDamage {if(defending.active && !defending.topPokemonCard.moves.isEmpty()){
      def move=choose(defending.topPokemonCard.moves, defending.topPokemonCard.moves.collect({it.name}), name) as Move
      cantUseAttack(move, defending)
      bc "$defending cant use ${move.name} next turn."
    }}
  }

  /**
   * Moves an energy card attached to one pokemon to another
   */
  static void moveEnergy(params=[:], def from, def to, Source src=Source.ATTACK) {
    if(to instanceof PcsList && to.empty) return
    def filterType = params.basic ? BASIC_ENERGY : ENERGY
    if(from instanceof PcsList){
      from = from.findAll {it.cards.filterByType(filterType)}
      if(from.empty) return
      from = from.select("Move $filterType from?")
    }
    def list = from.cards.filterByType(filterType)
    if(params.type) {
      list = list.filterByEnergyType(params.type)
    }
    if(!list){
      return
    }
    def playerType = params.playerType ?: bg.currentThreadPlayerType
    list = list.select(
            min: (params.may ? 0 : 1),
            max: (params.count ?: 1),
            (params.info ? params.info+". " : "") + "Which $filterType to move?",
            {true},
            playerType)
    if(!list) return
    if(to instanceof PcsList){
      if(to.empty) return;
      to = to.select("Move $list to?", true, playerType)
    }
    if(to.owner != playerType){
      targeted (from, src) {
        list.each {
          energySwitch(from, to, it)
        }
      }
    } else {
      list.each {
        energySwitch(from, to, it)
      }
    }
  }

  /**
   * Attach an energy card from a CardList to a PokemonCardList
   *
   * @param params  Optional settings Map
   * @param params.count  Number of energy to attach. All must be attached. Overrides max and may.
   * @param params.max  Maximum number of energy that can be chosen to attach
   * @param params.tostr Override  Override for the
   * @param params.type The type of energy to attach
   * @param params.basic  Whether the energy should be a Basic energy card
   * @param params.may  Whether the player can fail the attachment (e.g. from Hand or Deck)
   *
   * @param from  CardList to choose the energy from
   * @param to  PokemonCardSet or PcsList to choose PCS to attach the energy to
   *
   * @return  Tuple of the CardList of selected energy and the PokemonCardSet attached to
   */
  static Tuple attachEnergyFrom (params=[:], CardList from, def to){
    if(to instanceof PcsList && to.empty) return
    Integer count = params.count ?: null
    Integer max = params.max ?: 1
    CardList list
    String tostr = "";
    if (params.tostrOverride){
      tostr += params.tostrOverride
    } else if (to instanceof PcsList) {
      tostr += "one of "+to.collect{it.name}.join(", ")
    } else {
      tostr += to
    }
    def info = "Attach ${params.type ?: ''} ${params.basic ? 'Basic' : ''} Energy to ${tostr}."
    def filter = { Card card ->
      (card.cardTypes.is(ENERGY)
        && (!params.basic || card.cardTypes.is(BASIC_ENERGY))
        && (!params.type || card.asEnergyCard().containsType(params.type)))
    }
    if(from instanceof DeckCardList){
      list = from.search (max: count?:max, info, filter)
      shuffleDeck()
    } else if (from instanceof CardList && from.find(filter)) {
      list = from.findAll(filter).select(min: params.may?0:null, count:count, max:max, info)
    }
    if(list) {
      if(to instanceof PcsList){
        to = to.select("To?")
      }
      def reason = OTHER
      if(from.zoneType == CardList.ZoneType.HAND){
        reason = PLAY_FROM_HAND
      }
      list.each{
        attachEnergy(to, it, reason)
      }
    }
    new Tuple(list,to)
  }

  static void gxPerform(){
    bg.em().storeObject("gx_"+my.owner, 1)
  }
  static void gxCheck(){
    assert !bg.em().retrieveObject("gx_"+my.owner) : "Already used a GX attack this game"
  }
  static boolean isGxPerformed(){
    bg.em().retrieveObject("gx_"+my.owner)
  }

  static void vStarPerform(){
    bg.em().storeObject("vstar_"+my.owner, 1)
  }
  static void vStarCheck(){
    assert !bg.em().retrieveObject("vstar_"+my.owner) : "Already used a VSTAR Power"
  }

  /* General checks for attacks and abilities */
  //TODO: assertFullBench, assertDeck, assertMorePrizes

  /**
   *
   * Does a customized assert with an automated fail warning, looking for any Pokémon following the given filters.
   *
   * @param params Optional settings that can be added
   * @param params.benched: If true, checks for only Benched Pokémon; otherwise also includes the Active.
   * @param params.opp: If true, checks for the opponent's bench instead of "my" bench.
   * @param params.hasType: If set, restricts to benched Pokémon of a single specific type.
   * @param params.hasVariants: A list of specific CardType values (currently: POKEMON_V | VMAX | TAG_TEAM | POKEMON_GX | POKEMON_EX | DELTA | EX). If set, the area filter will only accept PCS that have at least one of these CardTypes on its top card; otherwise, it'll take any Pokémon.
   * @param params.negateVariants: If set to true, hasVariants will be inverted: only PCS that are __not__ any of the variants provided will be accepted.
   * @param params.isStage: A list of specific CardType values (currently: EVOLVED | UNEVOLVED | BASIC | STAGE1 | STAGE2 | EVOLUTION). If set, the area filter will only accept PCS that return true for every single one of the included values; otherwise, it'll take any Pokémon regardless of stage.
   * @param params.info: If set, it'll replace the end of the failed assert warning with a custom text, instead of the default "follow the stated condition(s)".
   * @param params.overrideText: If true, params.info will override the entirety of the failed assert warning.
   *
   * @param filter Additional condition the filtered benched Pokémon must follow. Defaults to true (so any Pokémon).
   *
   */
  static void assertAnyPokemonInPlay(params=[:], Closure filter = null) {
    def failMessage
    def negateVariants = params.negateVariants ? true : false
    def checkedPlayer = params.opp ? opp : my
    def checkedArea = params.benched ? checkedPlayer.bench : checkedPlayer.all

    def variantsAllowed = params.hasVariants?:[]
    if (!(variantsAllowed instanceof List)) variantsAllowed = [variantsAllowed]
    def variantFilters = [
      (CardType.POKEMON_V):   { it.pokemonV },
      (CardType.VMAX):        { it.pokemonVMAX },
      (CardType.TAG_TEAM):    { it.tagTeam },
      (CardType.POKEMON_GX):  { it.pokemonGX },
      (CardType.POKEMON_EX):  { it.pokemonEX },
      (CardType.DELTA):       { it.topPokemonCard.cardTypes.is(DELTA) },
      (CardType.EX):          { it.EX }
    ]
    def variantLabels = [
      (CardType.POKEMON_V):   (CardType.POKEMON_V).toString(),
      (CardType.VMAX):        (CardType.VMAX).toString(),
      (CardType.TAG_TEAM):    (CardType.TAG_TEAM).toString() + " Pokémon",
      (CardType.POKEMON_GX):  (CardType.POKEMON_GX).toString(),
      (CardType.POKEMON_EX):  (CardType.POKEMON_EX).toString(),
      (CardType.DELTA):       (CardType.DELTA).toString() + " Pokémon",
      (CardType.EX):          (CardType.EX).toString()
    ]

    def stageRequired = params.isStage?:[]
    if (!(stageRequired instanceof List)) stageRequired = [stageRequired]
    def stageFilters = [
      (CardType.EVOLVED):     { it.evolution },
      (CardType.UNEVOLVED):   { it.notEvolution },
      (CardType.BASIC):       { it.basic },
      (CardType.STAGE1):      { it.stage1},
      (CardType.STAGE2):      { it.stage2 },
      (CardType.EVOLUTION):   { it.realEvolution }
    ]

    def areaFilter = {
      (
        !params.hasType || it.types.contains(params.hasType)
      ) && (
        !variantsAllowed || (
          negateVariants ^ variantsAllowed.any{ varFilter -> variantFilters.get(varFilter).call(it) }
        )
      ) && (
        stageRequired.every{ stgFilter -> stageFilters.get(stgFilter).call(it) }
      ) && (
        filter == null || filter.call(it)
      )
    }

    if (params.info && params.overrideText) {
      failMessage = params.info
    } else {
      def benchedString = (params.benched ? "Benched " : "")

      int i, count

      def stageString = ""
      if (stageRequired) {
        stageRequired.each{ stgFilter -> stageString += "${(stgFilter as CardType).toString()} " }
      }

      def typeString = (params.hasType ? "${params.hasType} " : "")

      def pokeString = ""
      if (variantsAllowed) {
        if (params.negateVariants) pokeString += "Pokémon that aren't "
        i = 1
        count = variantsAllowed.size()
        variantsAllowed.each{ varFilter ->
          pokeString += variantLabels.get(varFilter)
          pokeString += ((i == count) ? "" : (i == count-1 ? " or " : ", "))
          i ++
        }
      } else {
        pokeString += "Pokémon"
      }

      def extraConditionString = (filter == null) ? "" : " in play ${params.info ?: "that follow the stated condition(s)"}"

      failMessage = "${params.opp ? "Your opponent doesn't" : "You don't"} have any ${benchedString + stageString + typeString + pokeString + extraConditionString}"
    }

    assert checkedArea.any(areaFilter) : failMessage
  }

  static void assertMyAll(params=[:], Closure filter = null) {
    params.benched = false
    params.opp = false
    assertAnyPokemonInPlay(params, filter)
  }
  static void assertOppAll(params=[:], Closure filter = null) {
    params.benched = false
    params.opp = true
    assertAnyPokemonInPlay(params, filter)
  }

  static void assertMyBench(params=[:], Closure filter = null) {
    params.benched = true
    params.opp = false
    assertAnyPokemonInPlay(params, filter)
  }
  static void assertOppBench(params=[:], Closure filter = null) {
    params.benched = true
    params.opp = true
    assertAnyPokemonInPlay(params, filter)
  }

  static void cantBeHealed(PokemonCardSet defending){
    delayed target:defending, {
      after CHANGE_STAGE, defending, {unregister()}
      after FALL_BACK, defending, {unregister()}

      before REMOVE_DAMAGE_COUNTER, defending, {
        bc "Healing was prevented due to an effect"
        prevent()
      }
      unregisterAfter 2
    }
  }
  static void opponentCantPlaySupporterNextTurn(def _delegate){
    bc "${_delegate.thisMove} - Supporters can't be played from ${opp.owner.getPlayerUsername(bg)}'s hand during their next turn"
    _delegate.delayed {
      before PLAY_TRAINER, {
        if(ef.supporter && bg.currentTurn==_delegate.self.owner.opposite) {
          wcu "${_delegate.thisMove} prevents playing supporters"
          prevent()
        }
      }
      unregisterAfter 2
    }
  }
  static rearrangeEitherPlayersDeck(def delegate, int count){
    delegate.attackRequirement {
      assert my.deck || opp.deck : "Both players' decks are empty."
    }
    delegate.onAttack {
      def choices=[]; def labels=[]
      if(my().deck.notEmpty()){choices.add(my().deck); labels.add("My deck")}
      if(opp().deck.notEmpty()){choices.add(opp().deck); labels.add("Opp deck")}
      def deck=choose(choices, labels) as CardList
      def deck2=rearrange(deck.subList(0,count))
      deck.setSubList(0, deck2)
      if(deck==my().deck) bc "Rearranged top $count cards of own deck."
      else bc "Rearranged top $count cards of opponent's (${opp.owner.getPlayerUsername(bg)}) deck."
    }
  }
  static foresight(int count, Object delegate){
    delegate.attackRequirement {
      assert my.deck || opp.deck : "Both players' decks are empty"
    }
    delegate.onAttack {
      def choice = !opp.deck ? 1 : 2
      if (my.deck && opp.deck){
        choice = choose([1,2],["Your deck", "Your opponent's deck"], "Rearrange the top $count cards of which player's deck?")
      }

      def chosenDeck, playerString, bcString
      if (choice == 1) {
        chosenDeck = my.deck
        playerString = "your"
        bcString = "owner's"
      } else {
        chosenDeck = opp.deck
        playerString = "your opponent's"
        bcString = "opponent's"
      }

      def maxSize = Math.min(chosenDeck.size(),count)
      def list = rearrange(chosenDeck.subList(0,maxSize), "Rearrange top $count cards in $playerString deck")
      chosenDeck.setSubList(0, list)
      bc "${delegate.thisMove} rearranged ${delegate.self}'s $bcString deck"
    }
  }

  static whirlwind2(int dmg = 0, int selfDmg = 0){
    if (dmg) {
      if ((bg.stadiumInfoStruct && ["Sky Pillar", "Mountain Ring"].contains(bg.stadiumInfoStruct.stadiumCard.name)) || opp.all.any{PokemonCardSet pcs -> pcs.abilities.any{["Bench Barrier", "Sand Veil", "Daunting Pose", "Fabled Defense"].contains.(it.name)}}){
        shredDamage dmg
      } else {
        damage dmg
      }
    }
    //if (dmg) damage dmg //TODO: Remove^ once switch issue below is solved.
    if (selfDmg) {
      if ((bg.stadiumInfoStruct && bg.stadiumInfoStruct.stadiumCard.name == "Mountain Ring") || my.all.any{PokemonCardSet pcs -> pcs.name == "Mr. Mime" && pcs.abilities.any{it.name == "Bench Barrier"}}){
        new ResolvedDamage(hp(dmg), my.active, my.active, Source.ATTACK, DamageManager.DamageFlag.NO_DEFENDING_EFFECT).run(bg)
      } else {
        damage selfDmg, my.active
      }
    }
    //if (selfDmg) damage selfDmg, my.active //TODO: Remove^ once switch issue below is solved.
    if (opp.bench) {
      sw opp.active, opp.bench.oppSelect("Choose your new Active Pokémon.")
    }
    /* afterDamage{
      //The switch above should happen here. But that currently causes KOs to trigger mid switch (Known bug: Submerge-like abilities will block damage that should be done prior to the switch). TODO move it here once KOs are prevented during an attack.
    } */
  }

  /**
   * Allows you to place damage counters without triggering knockouts. No longer needed for attacks, but still needed for abilities.
   * @param counters The number of damage counters to place
   * @param selectArea A PcsList of targets to choose from - Can be for either side of the field regardless of method name
   * @param src The Source of the damage counters
   */
  static putDamageCountersOnOpponentsPokemon(int counters, def selectArea = opp.all, def src = Source.ATTACK){
    if (selectArea.notEmpty) {
      def eff = delayed {
        before KNOCKOUT, {
          prevent()
        }
      }

      counters.times{directDamage (10, selectArea.select("Put 1 damage counter on which pokémon? ${it}/${counters} counters placed"), src) }

      eff.unregister()
      checkFaint()
    }
  }

  static bringDown (Object delegate) {
    delegate.onAttack {
      def list = all.findAll{it!=delegate.self}.sort(false) {p1,p2 -> p1.remainingHP.value <=> p2.remainingHP.value}
      def min = list.get(0).remainingHP
      def tar = list.findAll{it.remainingHP==min} as PcsList
      //TODO: Heavily improve this selection, in case both players have tied Pokémon. Make it clearer to pick.
      def pcs = tar.select("Choose which of these Pokémon will be knocked out.")
      bc "${pcs.owner}'s $pcs was selected for Knock Out"
      targeted (pcs) {
        new Knockout(pcs).run(bg)
      }
    }
  }

  static boolean wasSwitchedOutThisTurn(PokemonCardSet self){
    self.lastSwitchedOut == bg.turnCount && self.lastSwitchedOutName == self.name
  }
  static boolean stadiumCanBeAffectedByItemAndSupporter(Card stadiumCard=bg?.stadiumInfoStruct?.stadiumCard){
    !['Heat Factory Prism Star','Life Forest Prism Star','Thunder Mountain Prism Star','Wondrous Labyrinth Prism Star','Black Market Prism Star'].contains(stadiumCard?.name);
  }

  static boolean isValidFossilCard(Card potentialFossil){
    if(
    (potentialFossil.cardTypes.is(ITEM) && potentialFossil.name.contains("Fossil")) ||
      (potentialFossil.cardTypes.is(STAGE1) && potentialFossil.predecessor.contains("Fossil")) ||
      (potentialFossil.cardTypes.is(STAGE2) && bg().gm().getBasicsFromStage2(potentialFossil.name).any{it.contains("Fossil")})
    )
      return true
    else
      return false
  }

  static confirmScoopLastPokemon() {
    if (my.bench.empty){
      assert confirm("You have no other Pokémon in play. Playing this card may cause you to lose the game. Are you sure you want to play it anyway?") : "Use of the card was canceled"
    }
  }

  static void loadMarkerCheckerAction(def delegate, actions) {
    def isCheckerLoaded = bg.em().retrieveObject("Checker_Loaded")
    if (isCheckerLoaded)
      return
    bg.em().storeObject("Checker_Loaded",true)

    actions = action(delegate.thisCard, "[ Imprison / Shock-wave Check ]") {
      def imprisonPokemon = []
      def shockwavePokemon = []
      if(bg.em().retrieveObject("Imprison") != null){
        imprisonPokemon = bg.em().retrieveObject("Imprison")
      }
      if(bg.em().retrieveObject("Shock_Wave") != null){
        shockwavePokemon = bg.em().retrieveObject("Shock_Wave")
      }

      def playerChecked = choose([my, opp], ["My Own", "My Opponent's"], "Which player's Pokémon will you check?")
      def playerText = (playerChecked == my ? "your" : "your opponent's")

      assert playerChecked.all.any{imprisonPokemon.contains(it) || shockwavePokemon.contains(it)} : "None of $playerText Pokémon in play have any Imprison / Shock-wave markers on them"

      def currentPokemon, resultInfo
      while (true){
        resultInfo = ""
        if (currentPokemon){
          def hasImprison = imprisonPokemon.contains(currentPokemon)
          def hasShockwave = shockwavePokemon.contains(currentPokemon)

          def markersInfo = (hasImprison || hasShockwave) ? "has ${(hasImprison ? "an Imprison" : "") + ((hasImprison && hasShockwave) ? " and " : "") + (hasShockwave ? "a Shock-wave" : "")} marker" : "doesn't have any markers"

          resultInfo = "The ${currentPokemon.active?"Active":"selected"} ${currentPokemon} ${markersInfo}. "
        }

        currentPokemon = playerChecked.all.select("${resultInfo}\n\n\nPlease select one of $playerText Pokémon (first one is the Active), or cancel to end this check.", false)
        if (!currentPokemon) break;
      }
    }
  }

  /**
   * Scoop up PokemonCardSets if not blocked by Scoop-Up Block
   *
   * @param params Optional settings map
   * @param params.pokemonOnly: boolean - if true, scoops up all pokemon cards and discards the rest.
   * @param params.only: CardList - only scoops up them, discards the rest.
   *
   * @param target PokemonCardSet to work on
   * @param delegate Effect delegate used to determine most sources automatically, and to get the card name for the Scoop-Up Block message
   * @param source Allows you to specify the source of the scoop up. Use intended manually setting SRC_ABILITY.
   *
   * @return boolean successful scoop up
   *
   * @throws IllegalArgumentException If params.only was an unsupported type
   */
  static boolean scoopUpPokemon(params=[:], PokemonCardSet target, Object delegate, Source source=null) {
    if (source == null) {
      if (delegate.thisObject.cardTypes.is(TRAINER)) source = TRAINER_CARD
      if (delegate.thisObject.cardTypes.is(POKEMON)) source = ATTACK
    }
    if (bg.em().retrieveObject("ScoopUpBlock_Count$target.owner.opposite") && target.numberOfDamageCounters && !hasThetaStop(target)) {
      bc "Scoop-Up Block prevents $delegate.thisObject.name's effect."
      return false
    }
    return !targeted(target, source) {
      def eff = delayed {
        before KNOCKOUT, {
          prevent()
        }
      }
      CardList toHand
      if(params.only) {
        if (params.only instanceof Card) toHand = new CardList(params.only)
        else if (params.only instanceof CardList) toHand = params.only as CardList
        else throw new IllegalArgumentException("scoopUpPokemon() params.only=${params.only} type not supported")
      } else if(params.pokemonOnly) {
        toHand = target.cards.filterByType(POKEMON)
      } else {
        toHand = new CardList(target.cards)
      }
      CardList toDiscard = target.cards.getExcludedList(toHand)

      bc "Scooped up ${toHand}"

      // Only add true POKEMON cards to hand, let moveTo handle removing changed implementations from play
      CardList toHand2 = toHand.filterByType(POKEMON).findAll { it.staticInfo.cardTypes.contains(POKEMON) }

      // Special handling for knocked out Pokémon
      if (target.slatedToKO) {
        toHand2.moveTo(target.owner.pbg.hand)
        // Move any cards that changed implementation from POKEMON when removed from play to hand as well
        CardList toCleanup = []
        toHand.getExcludedList(toHand2).each { pcsCard -> toCleanup.add(target.owner.pbg.discard.find { it.staticInfo == pcsCard.staticInfo })}
        toCleanup.moveTo(target.owner.pbg.hand)
      }
      else {
        target.owner.pbg.hand.addAll(toHand2)
        toHand.getExcludedList(toHand2).moveTo(target.owner.pbg.hand)
      }

      CardList toDiscard2 = toDiscard.filterByType(POKEMON).findAll { it.staticInfo.cardTypes.contains(POKEMON) }
      target.owner.pbg.discard.addAll(toDiscard2)
      toDiscard.getExcludedList(toDiscard2).discard()
      removePCS(target)
      eff.unregister()
    }
  }

  /**
   * Do additional damage per Energy card discarded from owner's PokemonCardSets
   * @param damagePerCard Integer damage amount to add per card discarded
   * @return
   */
  static additionalDamageByDiscardingCardTypeFromPokemon(int baseDamage = 0, int damagePerCard, CardType cardType) {
    def additionalDamage = 0
    def pcsMsgOverride = baseDamage ? "Base Damage: $baseDamage + $additionalDamage." : "Base Damage: $additionalDamage."
    def params = [
      pcsMsg : pcsMsgOverride,
    ]
    def updateDamageAmount = { CardList list ->
      additionalDamage = damagePerCard * list.size()
      params.pcsMsg = "$cardType cards already marked for discard: ${list.size()}\n"
      params.pcsMsg += baseDamage ? "Base Damage: $baseDamage + $additionalDamage." : "Base Damage: $additionalDamage."
    }
    CardList toDiscard = selectCardTypeFromPokemon params, cardType, updateDamageAmount
    afterDamage { toDiscard.discard() }
    damage baseDamage + additionalDamage
  }

  /**
   * Select any number of a CardType from any of your Pokémon
   * @param params Optional settings map
   * @param params.cardType CardType to select
   * @param params.pcsMsg Override message for selecting the PokemonCardSet
   * @param params.cardMsg Override message for selecting the card
   * @param params.type Type of Energy to allow for selection
   * @param params.exclude PcsList of Pokémon to exclude from selection
   *
   * @param c Closure passed the list of energies after selecting them from a Pokémon. Use for additional processing.
   */
  static CardList selectCardTypeFromPokemon(params=[:], CardType cardType, Closure c = {}) {
    if (cardType == ENERGY && params.type && !(params.type instanceof Type)) throw new IllegalArgumentException("selectCardTypeFromPokemon() params.type=${params.type} type not supported")
    Type eType = params.type ? params.type as Type : null

    PcsList excludedPcs = []
    if (params.exclude && params.exclude instanceof PokemonCardSet) excludedPcs.add(params.exclude)
    else if (params.exclude && !(params.exclude instanceof PcsList)) throw new IllegalArgumentException("selectCardTypeFromPokemon() params.exclude=${params.exclude} type not supported")

    CardList energies = []
    def pcsSelectMessage = (params.pcsMsg ? params.pcsMsg as String : "Choose the Pokémon to select an $cardType from. Current count: ${energies.size()}") + " Cancel to choose none."
    def cardSelectMessage = (params.cardMsg ? params.cardMsg as String : "Choose the $cardType cards to discard.") + " Select 0 to return to the Pokémon list"
    Map<PokemonCardSet, CardList> workMap = [:]
    for (PokemonCardSet pcs : my.all) {
      if (excludedPcs.contains(pcs)) continue
      if (pcs.cards.filterByType(cardType)) {
        if (cardType == ENERGY && params.type) {
          workMap.put(pcs, pcs.cards.filterByType(ENERGY).filterByEnergyType(eType))
        }
        else {
          workMap.put(pcs, pcs.cards.filterByType(cardType));
        }
      }
    }
    PcsList mapTar = workMap.keySet().findAll { workMap.get(it).notEmpty() }
    while (mapTar) {
      PokemonCardSet tar = mapTar.select(pcsSelectMessage, false)
      if (!tar) break
      def tarCards = workMap.get(tar).select(min:0,max : tar.cards.filterByType(cardType).size(), cardSelectMessage)
      if (!tarCards) continue
      energies.addAll(tarCards)
      workMap.get(tar).removeAll(tarCards)

      // Update values
      c(energies)
      pcsSelectMessage = (params.pcsMsg ? params.pcsMsg as String : "Choose the Pokémon to select an $cardType from. Current count: ${energies.size()}") + " Cancel to choose none."
      cardSelectMessage = (params.cardMsg ? params.cardMsg as String : "Choose the $cardType cards to discard.") + " Select none to return to the Pokémon list"
      mapTar = workMap.keySet().findAll { workMap.get(it).notEmpty() }
    }
    return energies
  }

  /**
   * Copies an attack from another PokemonCardSet as a Subattack
   * @param params Optional settings map
   * @param params.keepEnergyRequirement Should the move retain the original energy cost
   * @param params.unblockEndTurn Should blocking between turns be disabled (set to true for Abilities. Do not set to true for Attacks)
   * @param target A PokemonCardSet or PcsList to choose a move from
   * @param delegate onAttack delegate
   */
  static metronome(params = [:], target, delegate) {
    if (target instanceof PokemonCardSet) {
      target = new PcsList(target)
    }
    def moveList = []
    def labelList = []
    target.each {pcs ->
      if (pcs == delegate.self) return
      def newMoves = []
      newMoves.addAll bg.em().activateGetter(new GetMoveList(pcs))
      newMoves.removeAll newMoves.findAll { it.name == delegate.thisMove.name }
      moveList.addAll newMoves
      labelList.addAll newMoves.collect {"$pcs.name - $it.name" }
    }
    moveList.add "Skip"
    labelList.add "End Turn (Skip)"
    def choice = choose moveList, labelList, "Choose an attack to use as this attack."
    if (choice instanceof String) return
    Move move = (choice as Move).shallowCopy()
    bc "$delegate.self copied $move.name"
    if (!params.keepEnergyRequirement) move.energyCost = delegate.thisMove.energyCost
    // TODO: Why can't we just skip BetweenTurns if it is a sub attack?
    def bef = null
    if (!params.unblockEndTurn)
      bef = blockingEffect(BETWEEN_TURNS)
    attack(move)
    bef?.unregisterItself bg.em()
  }

  /**
   * Copies an attack from another PokemonCardSet as an Ability Attack
   * @param params Optional map of parameters
   * @param params checkSpecialConditions Check for any Special Conditions before adding moves
   * @param params checkClassicSpecialConditions Check for any Pokemon Power Special Conditions before adding moves
   * @param delegate onAttack delegate
   * @param target A Closure with a call to return the current targets (ex: { all() } or { bench() }
   */
  static metronomeA(params=[:], Object delegate, Closure target) {
    delegate.getterA GET_MOVE_LIST, delegate.self, {holder->
      if (params.checkSpecialConditions && !(delegate.self as PokemonCardSet).noSPC()) return
      if (params.checkClassicSpecialConditions && !(delegate.self as PokemonCardSet).checkSpecialConditionsForClassic()) return
      if (!holder.effect.target.active) return
      def moves = [] as Set
      moves.addAll holder.object
      def resp = target.call()
      def fun = {
        if (!it) return
        if (it == holder.effect.target) return
        if (it instanceof PokemonCard) {
          moves.addAll it.moves
        }
        if (it instanceof PokemonCardSet) {
          moves.addAll bg.em().activateGetter(new GetMoveList(it))
        }
      }
      if (resp instanceof Iterable) {
        resp.each(fun)
      } else {
        fun(resp)
      }
      holder.object = moves as List
    }
  }

  /* Effects that trigger when a Pokémon is active and damaged by an opposing attack, can be called by either a Poké-Body / Ability, an attack, or a card attached to the Pokémon. */

  // poke bodies and abilities
  static ifActiveAndDamagedByAttackBody (Object delegate1, Closure eff) {
    def c1 = {
      delayedA(target:self, priority: BEFORE_LAST, inline: true) {
        def applyEffect = false
        before APPLY_ATTACK_DAMAGES, {
          applyEffect = bg.currentTurn == self.owner.opposite && self.active && bg.dm().find({ it.to == self && it.dmg.value })
        }
        after APPLY_ATTACK_DAMAGES, {
          if (applyEffect && ef.attacker.inPlay) {
            eff.delegate=delegate
            eff.call(ef)
          }
          applyEffect = false
        }
      }
    }
    c1.resolveStrategy=Closure.DELEGATE_FIRST
    c1.delegate=delegate1
    c1.call()
  }

  // tools and special energy
  static ifActiveAndDamagedByAttackAttached (Object delegate1, Closure c2) {
    def c1 = {
      def eff
      onPlay {reason->
        eff = delayed(target:self, priority: BEFORE_LAST, inline: true) {
          def applyEffect = false
          before APPLY_ATTACK_DAMAGES, {
            bg().dm().each {
              if (it.to == self && it.dmg.value && bg.currentTurn == self.owner.opposite && self.active) {
                applyEffect = true
              }
            }
          }
          after APPLY_ATTACK_DAMAGES, {
            if (applyEffect && self.cards.contains(thisCard) && ef.attacker.inPlay) {
              c2.delegate=delegate
              c2.call(ef) // card didn't get discarded by an attack effect
            }
            applyEffect = false
          }
        }
      }
      onRemoveFromPlay {
        eff.unregister()
      }
    }
    c1.resolveStrategy=Closure.DELEGATE_FIRST
    c1.delegate=delegate1
    c1.call()
  }

  // attacks that put the effect on itself for one turn
  static ifDamagedByAttackNextTurn (Object delegate1, Closure eff) {
    def c1 = {
      delayed(target:self, priority: BEFORE_LAST, inline: true) {
        def applyEffect = false
        before APPLY_ATTACK_DAMAGES, {
          applyEffect = bg.currentTurn == self.owner.opposite && bg.dm().find({it.to==self && it.dmg.value})
        }
        after APPLY_ATTACK_DAMAGES, {
          if (applyEffect && ef.attacker && ef.attacker.inPlay) {
            eff.delegate=delegate
            eff.call(ef)
          }
          applyEffect = false
        }
        unregisterAfter 2
        after FALL_BACK, self, {unregister()}
        after CHANGE_STAGE, self, {unregister()}
      }
    }
    c1.resolveStrategy=Closure.DELEGATE_FIRST
    c1.delegate=delegate1
    c1.call()
  }

  /**
   * If there are at least 3 Pokemon SP in play then a Power Spray might be used by opponent to block this ability.
   * This method is called in every UseAbilityInner, thus it should throw a EffectRequirementException if ability is blocked.
   *
   * @param self the pokemon with thisAbility
   * @param thisAbility the ability performed
   * @throws EffectRequirementException when Power Spray needs to block the ability
   * @author ufodynasty
   */
  static triggerPowerSpray(PokemonCardSet self, Ability thisAbility) {
    def bluffing = true
    def tempIgnoreList = []
    def permIgnoreList = []
    def ignoreList = []
    if(bg.em().retrieveObject("This_Turn_Ignore_List_$self.owner.opposite") && bg.em().retrieveObject("This_Turn_Ignore_List_$self.owner.opposite").get(0) == bg.turnCount) {
      ignoreList.addAll(bg.em().retrieveObject("This_Turn_Ignore_List_$self.owner.opposite").get(1))
      tempIgnoreList.addAll(bg.em().retrieveObject("This_Turn_Ignore_List_$self.owner.opposite").get(1))
    }
    if(bg.em().retrieveObject("Always_Ignore_List_$self.owner.opposite")) {
      ignoreList.addAll(bg.em().retrieveObject("Always_Ignore_List_$self.owner.opposite"))
      permIgnoreList.addAll(bg.em().retrieveObject("Always_Ignore_List_$self.owner.opposite"))
    }
    if(bg.em().retrieveObject("Dont_Bluff_This_Turn_$self.owner.opposite") == bg.turnCount) {
      bluffing = false
    }
    if(bg.em().retrieveObject("Dont_Bluff_Ever_$self.owner.opposite")) {
      bluffing = false
    }

    def hasPowerSprayInHand = self.owner.opposite.pbg.hand.find { it.name == "Team Galactic's Invention G-103 Power Spray" }
    if(
    (!ignoreList.contains(thisAbility.name) &&
      (hasPowerSprayInHand || bluffing)) &&
      (self.owner.opposite.pbg.all.findAll{it.topPokemonCard.cardTypes.is(POKEMON_SP)}.size() >= 3) &&
      (thisAbility instanceof PokePower) &&
      (bg.currentThreadPlayerType == self.owner)
    ) {
      def options = []
      def text = []
      if (hasPowerSprayInHand) {
        options += [1]
        text += ["Play Power Spray"]
      }
      options += [2]
      text += ["Skip"]
      if (!ignoreList.contains(thisAbility.name)) {
        // commented out option 4 because if user misclicks then they won't be able to use Power Spray on that ability.
        options += [3/*, 4*/]
        text += ["Skip & ignore \"$thisAbility\" this turn"/*, "Skip & ignore \"$thisAbility\" this game"*/]
      }
      if (bluffing && !hasPowerSprayInHand) {
        options += [5, 6]
        text += ["Skip & don't bluff this turn", "Skip & don't bluff this game"]
      }
      def message = (hasPowerSprayInHand ?
        "Power Spray option: Opponent's ${self.name} is about to use $thisAbility. You HAVE a Power Spray in hand. What would you like to do?" :
        "Power Spray bluffing: Opponent's ${self.name} is about to use $thisAbility. You DON'T have a Power Spray in hand but the game allows bluffing. You may either skip this instance (and continue bluffing) or disable bluffing for this turn or this game.")
      def choice = oppChoose(options, text, message, options.get(0))
      //oppChoose works since this only triggers if the active player thread is the opponent's
      if (choice == 1) {
        bg.em().storeObject("Power_Spray_Can_Play_$self.owner.opposite", true)
        bg.deterministicCurrentThreadPlayerType = self.owner.opposite
        bg.em().run(new PlayTrainer(self.owner.opposite.pbg.hand.findAll { it.name == "Team Galactic's Invention G-103 Power Spray" }.first()))
        bg.clearDeterministicCurrentThreadPlayerType()
        if (bg.em().retrieveObject("Power_Spray_Played_$self.owner.opposite")) {
          bc "Power Spray blocks $thisAbility!"
          throw new EffectRequirementException("Power Spray blocked $thisAbility")
        }
        bg.em().storeObject("Power_Spray_Can_Play_$self.owner.opposite", false)
        bg.em().storeObject("Power_Spray_Played_$self.owner.opposite", false)
      } else if (choice == 3) {
        tempIgnoreList.add(thisAbility.name)
        ignoreList.add(thisAbility.name)
        bg.em().storeObject("This_Turn_Ignore_List_$self.owner.opposite", [bg.turnCount, tempIgnoreList])
      } else if (choice == 4) {
        permIgnoreList.add(thisAbility.name)
        ignoreList.add(thisAbility.name)
        bg.em().storeObject("Always_Ignore_List_$self.owner.opposite", permIgnoreList)
      } else if (choice == 5) {
        bluffing = false
        bg.em().storeObject("Dont_Bluff_This_Turn_$self.owner.opposite", bg.turnCount)
      } else if (choice == 6) {
        bluffing = false
        bg.em().storeObject("Dont_Bluff_Ever_$self.owner.opposite", true)
      }
    }
  }

  static damageForEachCardWithMove(String moveName, Integer dmg, CardList cardList, Object attackDelegate) {
    attackDelegate.attackRequirement {
      assert cardList.any { it.cardTypes.is(POKEMON) && it.asPokemonCard().moves.any { it.name == moveName } } :
        "No Pokémon with $moveName in the necessary location"
    }
    attackDelegate.onAttack {
      damage dmg * cardList.findAll { it.cardTypes.is(POKEMON) && it.asPokemonCard().moves.any { it.name == moveName } }.size()
    }
  }

  static damageForEachCardWithMove(String moveName, Integer dmg, PcsList pcsList, Object attackDelegate) {
    attackDelegate.attackRequirement {
      assert pcsList.any { it.getTopPokemonCard().moves.any { it.name == moveName } } :
        "No Pokémon with $moveName in the necessary location"
    }
    attackDelegate.onAttack {
      damage dmg * pcsList.findAll { it.getTopPokemonCard().moves.any { it.name == moveName } }.size()
    }
  }

  static additionalPrizesIfDefendingKnockedOutNextTurn(Integer count, Object attackDelegate) {
    PokemonCardSet pcs = attackDelegate.defending
    def effTurn = bg.turnCount + 2
    bc "If the Defending ${pcs} is Knocked Out during ${attackDelegate.self.owner}'s next turn, they'll take $count more Prize cards. (This effect can be removed by benching/evolving ${pcs})"
    delayed {
      getter GET_GIVEN_PRIZES, BEFORE_LAST, pcs, {Holder holder ->
        if (holder.object > 0 && effTurn == bg().turnCount) {
          bc "$attackDelegate.thisMove gives the player $count more Prize cards."
          holder.object += count
        }
      }
      after FALL_BACK, pcs, {unregister()}
      after CHANGE_STAGE, pcs, {unregister()}
      unregisterAfter 3
    }
  }
  static ascension(Object delegate) {
    delegate.attackRequirement {
      assert deck : "Your deck is empty"
      assert bg.gm().hasEvolution(delegate.self.name) : "This Pokémon does not evolve"
    }
    delegate.onAttack {
      def evolution = deck.search { it.cardTypes.is(EVOLUTION) && (it as EvolutionPokemonCard).predecessor == delegate.self.name }
      if (evolution) {
        evolve delegate.self, evolution.first()
      }
    }
  }
  static legendaryBody(Object delegate){
    callWithDelegate(delegate) {
      def check={
        if (self.active) {
          self.cards.filterByType(TRAINER).each {
            bc "Legendary Body discards $it"
            discard(it)
          }
        }
      }
      delayedA target:self, {
        after PLAY_TRAINER, {
          check()
        }
        after SWITCH_OUT, self, {
          check()
        }
        before null, self, Source.TRAINER_CARD, {
          if (self.active && !e.sourceTrainer.cardTypes.is(STADIUM)) {
            bc "Legendary Body prevents effect"
            prevent()
          }
        }
      }
      onActivate {
        check()
      }
    }
  }
  static callWithDelegate(Object delegate, Closure closure) {
    closure.delegate = delegate
    closure.call()
  }
  static tryWithDeterministicCurrentThreadPlayerType(PlayerType playerType, Runnable lambda) {
    try {
      bg.setDeterministicCurrentThreadPlayerType(playerType)
      lambda.run()
    } finally {
      bg.clearDeterministicCurrentThreadPlayerType()
    }
  }
  static formChange(Object delegate, String powerName, Closure searchPredicate) {
    callWithDelegate(delegate) {
      actionA {
        def key = "formChange($powerName)"
        assert bg.em().retrieveObject(key) != bg.turnCount : "You can’t use more than 1 $powerName each turn"
        checkLastTurn()
        assert my.deck : "Deck is empty"
        bg.em().storeObject(key, bg.turnCount)
        powerUsed()

        def selected = my.deck.search("Select a Pokemon to swap in", searchPredicate)
        if (selected) {
          def tpc = self.topPokemonCard
          selected.moveTo(suppressLog: true, self.cards)

//          moveCard(suppressLog: true, tpc, my.deck)
          my.deck.add(tpc)
          self.cards.remove(tpc)

          bc "${tpc.name} was swapped with ${selected.name}."
          new CheckAbilities().run(bg)
        }
        shuffleDeck()
      }
    }
  }

}