package com.rishi.patterns.strategy.behaviors.flybehaviors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rishi.patterns.strategy.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	private static final Logger logger = LoggerFactory.getLogger(FlyNoWay.class);

	@Override
	public void fly() {
		logger.debug("I cannot fly!");
	}
	

}
