package com.rishi.patterns.strategy.behaviors.flybehaviors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rishi.patterns.strategy.behaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
	private static final Logger logger = LoggerFactory.getLogger(FlyWithWings.class);

	@Override
	public void fly() {
		logger.debug("I am flying with wings! Yey!!");
	}
	

}
