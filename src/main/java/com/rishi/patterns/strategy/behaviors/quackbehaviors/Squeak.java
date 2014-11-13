package com.rishi.patterns.strategy.behaviors.quackbehaviors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rishi.patterns.strategy.behaviors.QuackBehavior;
import com.rishi.patterns.strategy.behaviors.flybehaviors.FlyNoWay;

public class Squeak implements QuackBehavior {
	private static final Logger logger = LoggerFactory.getLogger(Squeak.class);

	@Override
	public void quack() {
		logger.debug("squeak squeak!");		
	}
}
