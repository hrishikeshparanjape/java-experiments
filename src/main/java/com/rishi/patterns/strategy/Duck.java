package com.rishi.patterns.strategy;

import com.rishi.patterns.strategy.behaviors.FlyBehavior;
import com.rishi.patterns.strategy.behaviors.QuackBehavior;

public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	
	protected QuackBehavior quackBehavior;
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}

}
