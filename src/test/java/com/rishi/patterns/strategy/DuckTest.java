package com.rishi.patterns.strategy;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rishi.patterns.strategy.ducks.MallardDuck;

public class DuckTest {
	private static final Logger logger = LoggerFactory.getLogger(DuckTest.class);
	
	@Test
	public void testMallardDuck(){
		MallardDuck mallardDuck = new MallardDuck();
		logger.debug("testing Mallard duck");
		mallardDuck.performFly();
		mallardDuck.performQuack();
	}

}
