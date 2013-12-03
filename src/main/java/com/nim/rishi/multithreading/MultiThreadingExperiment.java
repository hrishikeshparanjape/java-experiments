package com.nim.rishi.multithreading;
import com.nim.rishi.logging.LoggingExperiment;

public class MultiThreadingExperiment {
	private static int i = 0;
	private static final Object signal = new Object();

	private static void hit(String hitBy) {
		i++;
		LoggingExperiment.logInfoMessage(String.valueOf(i) + " hit by " + hitBy);
	}
	
	
	public static final class Player1 implements Runnable{

		@Override
		public void run() {
			for (int j = 0; j < 5; j++) {
				hit(this.getClass().getName());
				synchronized (signal) {
					try {
						signal.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static final class Player2 implements Runnable{

		@Override
		public void run() {
			for (int j = 0; j < 5; j++) {
				hit(this.getClass().getName());
				synchronized (signal) {
					try {
						signal.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
