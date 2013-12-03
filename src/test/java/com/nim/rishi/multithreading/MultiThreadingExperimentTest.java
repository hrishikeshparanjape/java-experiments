package com.nim.rishi.multithreading;

import org.junit.Test;

public class MultiThreadingExperimentTest {

	@Test
	public void testPingPong(){
		new Thread(new MultiThreadingExperiment.Player1()).start();
		new Thread(new MultiThreadingExperiment.Player2()).start();
	}
}