package com.nim.rishi.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonExperimentTest {
	
	@Test
	public void testGetSingleTonExperiment(){
		SingletonExperiment se = SingletonExperiment.getSingletonExperiment();
		Assert.assertNotNull(se);
	}
	
	@Test
	public void testClone(){
		SingletonExperiment se = SingletonExperiment.getSingletonExperiment();
		try {
			se.clone();
		} catch (CloneNotSupportedException cnse) {
			return;
		}
		Assert.fail();
	}

}
