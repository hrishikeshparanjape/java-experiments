package com.rishi.patterns.strategy.ducks;

import com.rishi.patterns.strategy.Duck;
import com.rishi.patterns.strategy.behaviors.flybehaviors.FlyNoWay;
import com.rishi.patterns.strategy.behaviors.quackbehaviors.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
}
