package com.rishi.singleton;

import org.junit.Assert;
import org.junit.Test;

import com.rishi.singleton.SingletonExperiment;

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
