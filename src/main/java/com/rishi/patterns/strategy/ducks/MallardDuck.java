package com.rishi.patterns.strategy.ducks;

import com.rishi.patterns.strategy.Duck;
import com.rishi.patterns.strategy.behaviors.flybehaviors.FlyWithWings;
import com.rishi.patterns.strategy.behaviors.quackbehaviors.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
}
