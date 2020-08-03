package tcgwars.logic.groovy

import tcgwars.logic.card.energy.*
import tcgwars.logic.effect.ability.Ability.ActivationReason
import tcgwars.logic.effect.blocking.*
import tcgwars.logic.effect.getter.*
import tcgwars.logic.effect.gm.*
import tcgwars.logic.client.*
import tcgwars.logic.util.*

import java.util.function.Predicate

import static tcgwars.logic.card.CardType.*
import static tcgwars.logic.card.Type.*
import static tcgwars.logic.effect.EffectPriority.*
import static tcgwars.logic.effect.EffectType.*
import static tcgwars.logic.effect.Source.*
import static tcgwars.logic.effect.ability.Ability.ActivationReason.*
import static tcgwars.logic.groovy.TcgBuilders.delayed
import static tcgwars.logic.groovy.TcgBuilders.getter
import static tcgwars.logic.groovy.TcgStatics.*
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

  static Type C = COLORLESS, R = FIRE, F = FIGHTING, G = GRASS, W = WATER, P = PSYCHIC, L = LIGHTNING, M = METAL, D = DARKNESS;

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
    bg()
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
    flip(1, eachHead, eachTail, multi)
  }
  static flip (int count, Closure eachHead, Closure eachTail={}, multi=[:]){
    flip("", count, eachHead, eachTail, multi)
  }
  static flip (String info, Closure eachHead, Closure eachTail={}, multi=[:]){
    flip(info, 1, eachHead, eachTail, multi)
  }
  static flip (String info, int count, Closure eachHead, Closure eachTail={}, multi=[:]){
    CoinFlip cf=new CoinFlip(count, toEffect (eachHead), toEffect (eachTail))
    cf.setInfo(info)
    for(entry in multi){
      cf.setEffectForANumberOfHeads(toEffect(entry.value as Closure), entry.key as Integer)
    }
    cf.run(bg())
  }
  static flipTails (Closure eachTail) {
    flip(1, {}, eachTail)
  }
  static flipUntilTails (Closure eachHead){
    NeverEndingCoinFlip cf=new NeverEndingCoinFlip()
    cf.effectForEachHead = toEffect (eachHead)
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
    if(bg().currentThreadPlayerType!=playerType){
      block(bg().currentThreadPlayerType)
    }
    def r=bg().getClient(playerType).confirm(new ConfirmUIRequestBuilder().setInfo(info))
    if(bg().currentThreadPlayerType!=playerType){
      unblock(bg().currentThreadPlayerType)
    }
    r
  }
  static boolean oppConfirm (String info){
    block()
    def r=bg().oppClient().confirm(new ConfirmUIRequestBuilder().setInfo(info))
    unblock()
    r
  }
  static block (){
    bg().ownClient().block()
  }
  static block (PlayerType playerType){
    bg().getClient(playerType).block()
  }
  static unblock (){
    bg().ownClient().unblock()
  }
  static unblock (PlayerType playerType){
    bg().getClient(playerType).unblock()
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
    block()
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
    def coo=bg().oppClient().makeChoice(new MakeChoiceUIRequestBuilder().setInfo(info).setChoices(cs).setDefaultChoice(dc))
    unblock()
    coo
  }
  static oppChoose (List choices, String info="", defaultChoice=null){
    oppChoose(choices, null, info, defaultChoice)
  }
  static multiSelect (List pcsList, int count, String info="Select Pokemon"){
    LUtils.selectMultiPokemon(bg().ownClient(), pcsList, info, count)
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
    new DirectDamage(hp(dmg), to).setSource(src).run(bg())
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
  static shuffleDeck(CardList shuffled=null, TargetPlayer targetPlayer=TargetPlayer.SELF){
    if(shuffled==null){
      bg().em().run(new ShuffleDeck(targetPlayer))
    }
    else {
      bg().em().run(new ShuffleToDeck(shuffled, targetPlayer))
    }
  }
  static energySwitch (PokemonCardSet from, PokemonCardSet to, Card card){
    bg().em().run(new EnergySwitch(from,to,card))
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
  static reduceDamageNextTurn (HP reduce, Move thisMove){
    new ReduceDamageNextTurn(reduce, thisMove.name).run(bg())
  }
  static reduceDamageFromDefendingNextTurn (HP reduce, Move thisMove, PokemonCardSet defending){
    afterDamage { targeted (defending) {
      delayed {
        after PROCESS_ATTACK_EFFECTS, {
          bg.dm().each {
            if(it.from==defending && ef.attacker==defending && it.dmg.value){
              bc "${thisMove.name} reduces damage"
              it.dmg-=reduce
            }
          }
        }
        unregisterAfter 2
        after SWITCH, defending, {unregister()}
        after EVOLVE, defending, {unregister()}
        after DEVOLVE, defending, {unregister()}
      }
    } }
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
        bg.game.endGame(opp.owner, WinCondition.NOPOKEMON)
        return
      }
      sw ( null, my.bench.select("New active pokemon"))
      //my.bench.remove(pcs)
    }
    else if (my.bench.contains(pcs)){
      def r=new RemoveFromPlay(pcs,null)
      r.run(bg)
      my.bench.remove(pcs)
    }
    else if(opp.active==pcs){
      def r=new RemoveFromPlay(pcs,null)
      r.run(bg)
      if (opp.bench.isEmpty()){
        opp.active=null
        bg.game.endGame(my.owner, WinCondition.NOPOKEMON)
        return
      }
      sw ( null, opp.bench.oppSelect("New active pokemon"))
      //opp.bench.remove(pcs)
    }
    else if (opp.bench.contains(pcs)){
      def r=new RemoveFromPlay(pcs,null)
      r.run(bg)
      opp.bench.remove(pcs)
    }
  }
  static PokemonCardSet benchPCS (Card card, ActivationReason reason=ActivationReason.OTHER, TargetPlayer targetPlayer=TargetPlayer.SELF){
    if(card.getCardTypes().is(BREAK)){
      bg.wcu("BREAK Pokémon cannot be brought to play")
    }
    PlayerType playerType=targetPlayer.getPlayerType(bg())
    PlayerBattleground pbg=targetPlayer.getPbg(bg())
    assert pbg.bench.isNotFull() : "Bench is full"
    PokemonCardSet bench = new PokemonCardSet(playerType);
    bench.cards().add(card);
    pbg.getBench().add(bench);
    bc "$bench was put on bench"
    bg().em().run(new CantEvolve(bench, bg().getTurnCount()));
    bg().em().run(new ActivateAbilities((PokemonCard) card, bench, reason));
    bench
  }
  static evolve (PokemonCardSet pcs, Card card, ActivationReason reason=ActivationReason.PLAY_FROM_HAND) {
    bg().em().run(new Evolve(pcs, card));
    bg().em().run(new CantEvolve(pcs, bg().getTurnCount()));
    bg().em().run(new ActivateAbilities((PokemonCard) card, pcs, reason));
  }
  static devolve (PokemonCardSet pcs, Card card){
    bg().em().run(new Devolve(pcs));
    if (all.contains(pcs)) { //not dead yet.
      bg().em().run(new RemoveFromPlay(pcs, new CardList(card)));
      bg().em().run(new CantEvolve(pcs, bg().getTurnCount()));
//			bg().em().run(new ActivateAbilities(pcs.getTopPokemonCard(), pcs, ActivationReason.OTHER));
    }
  }
  static babyEvolution(String evolName, PokemonCardSet baby){
    babyEvolution([evolName], baby)
  }
  static babyEvolution(List<String> evolNames, PokemonCardSet baby){
    def pcs = my.hand.findAll{
      aCard -> evolNames.any{ aCard.name.contains(it) }
    }.select("Choose which Pokémon will $baby evolve to:")
    healAll baby, Source.SRC_ABILITY
    evolve(baby, pcs.first(), PLAY_FROM_HAND)
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
    delayed {
      after PROCESS_ATTACK_EFFECTS, {
        if(ef.attacker == pcs && ef.move.name == atkname) {
          bg.dm().findAll{it.from == pcs && it.to.owner != pcs.owner && it.dmg.value}.each{
            bc "-"+minus.value+" damage from last turn"
            it.dmg -= minus
          }
        }
      }
      after SWITCH, pcs, {unregister()}
      unregisterAfter 3
    }
  }
  static BlockingEffect blockingEffect (EffectType...effectTypes){
    def ef=new BlockingEffect(effectTypes)
    ef.run(bg())
    ef
  }
  static cantPlayEnergy (){
    new CantPlayEnergy().run(bg())
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
    delayed {
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
      after SWITCH, self, {unregister()}
      after EVOLVE, self, {unregister()}
      after DEVOLVE, self, {unregister()}
      register{registeredOn=bg.turnCount}
    }
  }
  static safeguard(PokemonCardSet self, Object delegate){
    delegate.delayedA {
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
    delegate.delayedA {
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
  static preventAllEffectsFromPokemonExNextTurn(Move thisMove, PokemonCardSet self){
    delayed {
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
      after EVOLVE, self, {unregister()}
      after DEVOLVE, self, {unregister()}
      after SWITCH, self, {unregister()}
    }
  }

  static preventAllEffectsFromCustomPokemonNextTurn(Move thisMove, PokemonCardSet self, Predicate<PokemonCardSet> predicate){
    delayed {
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
      after EVOLVE, self, {unregister()}
      after DEVOLVE, self, {unregister()}
      after SWITCH, self, {unregister()}
    }
  }

  static void preventAllDamageFromCustomPokemonNextTurn(Move thisMove, PokemonCardSet self, Predicate<PokemonCardSet> predicate){
    delayed (priority: LAST) {
      before APPLY_ATTACK_DAMAGES, {
        bg.dm().each {
          if(it.to == self && it.notNoEffect && it.from != it.to && predicate.test(it.from) && bg.currentTurn==self.owner.opposite ){
            it.dmg = hp(0)
            bc "$thisMove prevents damage"
          }
        }
      }
      unregisterAfter(2)
      after EVOLVE, self, {unregister()}
      after DEVOLVE, self, {unregister()}
      after SWITCH, self, {unregister()}
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
      if(params.type){
        deck.search (max: maxSpace,{it.name.contains(pkmnName) && it.cardTypes.is(basicFilter) && it.asPokemonCard().types.contains(params.type)}).each {
          deck.remove(it)
          benchPCS(it)
        }
      }
      else{
        deck.search (max: maxSpace,{it.name.contains(pkmnName) && it.cardTypes.is(basicFilter)}).each{
          deck.remove(it)
          benchPCS(it)
        }
      }
      shuffleDeck()
    }
  }

  static targeted (PokemonCardSet pcs, Source source, Closure c){
    new AbstractDirectTargetedEffect(pcs, source) {
      @Override
      void process(Battleground bg, Event event) {
        c.call(pcs)
      }
    }.run(bg)
  }
  static targeted (PokemonCardSet pcs, Closure c){
    new AbstractDirectTargetedEffect(pcs, Source.ATTACK) {
      @Override
      void process(Battleground bg, Event event) {
        c.call(pcs)
      }
    }.run(bg)
  }
  static jawClamp (Move thisMove, PokemonCardSet self, PokemonCardSet defending, boolean asLongAsSelfIsActive=false) {
    afterDamage { if (defending.active) { targeted(defending) {
      delayed {
        before RETREAT, defending, { wcu "${thisMove.name} prevents retreat."; prevent()}
        before SWITCH, defending, { bc "${thisMove.name} prevents switch."; prevent()}
        if(asLongAsSelfIsActive){
          after SWITCH, self, {unregister()}
          after EVOLVE, self, {unregister()}
          after DEVOLVE, self, {unregister()}
        }
        after SWITCH, defending, {unregister()}
        after EVOLVE, defending, {unregister()}
        after DEVOLVE, defending, {unregister()}
        unregisterAfter 2
      }
    } } }
  }
  /**
   * Attaches a tool to a pcs. Callers MUST remove card manually from source, else it will be duplicated. Vastly taken from {@link tcgwars.logic.effect.gm.PlayPokemonTool}
   */
  static attachPokemonTool (PokemonToolCard card, PokemonCardSet pcs) {
    // attach to selected pokemon
    pcs.cards().add(card);
    //play
    card.play(bg, pcs);
    //register for remove from play
    delayed {
      after REMOVE_FROM_PLAY, pcs, null, {
        if(LUtils.isRemoveFromPlayAndContainsCard(e, card)){
          card.removeFromPlay(bg, pcs)
          unregister()
        }
      }
    }
    bc("$card is attached to $pcs")
    bg.gm().woosh();
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
    delegate.delayedA {
      //TODO make sure all trainers have correct source definitions and add extra source types
      before (null, self, Source.TRAINER_CARD) {
        if (bg.currentThreadPlayerType != self.owner){ //only opponent's trainer cards
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
    delegate.delayedA {
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
    delegate.delayedA {
      before REMOVE_DAMAGE_COUNTER, self, {
        bc "Recovery: doubled healing"
        (ef as RemoveDamageCounter).hp *= 2
      }
    }
  }

  static delta_plus(PokemonCardSet self, Object delegate){
    delegate.delayedA (priority: LAST) {
      def power=false
      after APPLY_ATTACK_DAMAGES, {
        power= (ef.attacker==self)
      }
      before KNOCKOUT, {
        if(ef.pokemonToBeKnockedOut.owner==self.owner.opposite
          && ef.byDamageFromAttack && power){
          bc "Δ Plus: take 1 more Prize card"
          bg.em().run(new TakePrize(self.owner, ef.pokemonToBeKnockedOut))
        }
      }
    }
  }

  static delta_evolution(PokemonCard thisCard){
    thisCard.asEvolution().ancientTraitDeltaEvolution = true
  }

  static omega_stop(Object delegate){
    delegate.ancientTrait "θ Stop", {
      text "Prevent all effects of your opponent's Pokémon's Abilities done to this Pokémon."
      delayedA {
        before null, self, Source.SRC_ABILITY, {
          //FIXME this will also block own pokemon abilities. to fix this, "Source refactoring" must be done.
          bc "θ Stop prevents opponent's Pokémon's Abilities"
          prevent()
        }
      }
    }
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
        healAll(self, SRC_ANCIENT_TRAIT)
      }
    }
  }

  static duringYourOpponentsNextTurnThisPokemonHasNoWeakness(PokemonCardSet self) {
    delayed {
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
      after SWITCH, self, {unregister()}
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
    def sel = opp.hand.shuffledCopy().select(hidden: true, count: count, "Choose ${count==1?'a':count} random ${count==1?'card':'cards'} from your opponent's hand to be shuffled into his or her deck").showToMe("Selected card(s)").showToOpponent("Astonish: these cards will be shuffled from your hand to your deck")
    sel.moveTo(opp.deck)
    shuffleDeck(null, TargetPlayer.OPPONENT)
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
        def pcs = bench.select("Switch your active pokemon", !may)
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
      eff = delayed {
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
    targeted(pcs) {
      delayed {
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
        after SWITCH, pcs, {unregister()}
        after EVOLVE, pcs, {unregister()}
        after DEVOLVE, pcs, {unregister()}
      }
    }
  }

  static void defendingRetreatsCostsMore (PokemonCardSet pcs, List<Type> energies) {
    targeted(pcs) {
      delayed {
        def eff
        register {
          eff = getter (GET_RETREAT_COST, NORMAL, pcs) {h->
            h.object += 1
          }
          bc "Retreat cost of $pcs will cost 1 more energy during the next turn."
        }
        unregister {
          eff.unregister()
        }
        unregisterAfter 2
        after SWITCH, pcs, {unregister()}
        after EVOLVE, pcs, {unregister()}
        after DEVOLVE, pcs, {unregister()}
      }
    }
  }

  static void increasedDamageDoneToDefending (PokemonCardSet self, PokemonCardSet pcs, int value, String atkName=""){
    targeted(pcs){
      delayed {
        before APPLY_ATTACK_DAMAGES, {
          bg.dm().each {if(it.to==pcs && it.from.owner==self.owner && it.dmg.value>0 && it.notNoEffect){
            bc "$atkName increases damage"
            it.dmg+=hp(value)
          }}
        }
        unregisterAfter 3
        after SWITCH, pcs, {unregister()}
        after EVOLVE, pcs, {unregister()}
        after DEVOLVE, pcs, {unregister()}
      }
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
      from = from.select("From?")
    }
    def list = from.cards.filterByType(filterType)
    if(params.type) {
      list = list.filterByEnergyType(params.type)
    }
    if(!list){
      return
    }
    def playerType = params.playerType ?: bg.currentThreadPlayerType
    list = list.select(min: (params.may ? 0 : 1), max: (params.count ?: 1), (params.info ? params.info+". " : "") + "Move energy", {true}, playerType)
    if(!list) return
    if(to instanceof PcsList){
      if(to.empty) return;
      to = to.select("To?", true, playerType)
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
      card.cardTypes.is(ENERGY) && (!params.basic || card.cardTypes.is(BASIC_ENERGY)) && (!params.type || card.asEnergyCard().containsTypePlain(params.type))
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
      if(from.persistentName == "Hand"){
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

  /* General checks for attacks and abilities */
  //TODO: assertFullBench, assertDeck, assertMorePrizes

  /**
   *
   * Does a customized assert with an automated fail warning, looking for any Pokémon following the given filters.
   *
   * @param params Optional settings that can be added:
   *   + benched: If true, checks for only Benched Pokémon; otherwise also includes the Active.
   *   + opp: If true, checks for the opponent's bench instead of "my" bench.
   *   + hasType: If set, restricts to benched Pokémon of a single specific type.
   *   + hasVariants: A list of specific CardType values (currently: POKEMON_V | VMAX | TAG_TEAM | POKEMON_GX | POKEMON_EX | DELTA | EX). If set, the area filter will only accept PCS that have at least one of these CardTypes on its top card; otherwise, it'll take any Pokémon.
   *   + negateVariants: If set to true, hasVariants will be inverted: only PCS that are __not__ any of the variants provided will be accepted.
   *   + isStage: A list of specific CardType values (currently: EVOLVED | UNEVOLVED | BASIC | STAGE1 | STAGE2 | EVOLUTION). If set, the area filter will only accept PCS that return true for every single one of the included values; otherwise, it'll take any Pokémon regardless of stage.
   *   + info: If set, it'll replace the end of the failed assert warning with a custom text, instead of the default "follow the stated condition(s)".
   *   + overrideText: If true, params.info will override the entirety of the failed assert warning.
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
      //TODO: Remove !it.pokemonVMAX from STAGE1 once solved.
      (CardType.STAGE1):      { it.topPokemonCard.cardTypes.is(STAGE1) && !it.pokemonVMAX },
      (CardType.STAGE2):      { it.topPokemonCard.cardTypes.is(STAGE2) },
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
    delayed {
      after EVOLVE, defending, {unregister()}
      after DEVOLVE, defending, {unregister()}
      after SWITCH, defending, {unregister()}

      before REMOVE_DAMAGE_COUNTER, defending, {
        bc "Healing was prevented due to an effect"
        prevent()
      }
      unregisterAfter 2
    }
  }
  static void opponentCantPlaySupporterNextTurn(def _delegate){
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
      def c = !opp.deck ? 1 : 2
      if (my.deck && opp.deck){
        c = choose([1,2],["Your deck", "Your opponent's deck"], "Rearrange the top $count cards of which player's deck?")
      }

      def chosenDeck, playerString, bcString
      if (c == 1) {
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

  static putDamageCountersOnOpponentsPokemon(int counters, def selectArea = opp.all){
    def eff = delayed {
      before KNOCKOUT, {
        prevent()
      }
    }

    counters.times{directDamage 10, selectArea.select("Put 1 damage counter on which pokémon? ${it}/${counters} counters placed") }

    eff.unregister()
    checkFaint()
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

  static void loadMarkerCheckerAction(def delegate, actions) {
    def isCheckerLoaded = bg.em().retrieveObject("Checker_Loaded")
    if (isCheckerLoaded)
      return
    bg.em().storeObject("Checker_Loaded",true)

    actions = delegate.action("[ Imprison / Shock-wave Check ]") {
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

}
