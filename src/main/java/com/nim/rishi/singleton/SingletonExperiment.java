package com.nim.rishi.singleton;

public class SingletonExperiment {
	private static SingletonExperiment singletonExperiment;
	
	//private constructor
	private SingletonExperiment () {
		
	}
	
	//Get the singleton object
	public static synchronized SingletonExperiment getSingletonExperiment(){
		if(singletonExperiment == null) {
			singletonExperiment = new SingletonExperiment();
		}
		return singletonExperiment;
	}
	
	public Object clone () throws CloneNotSupportedException {
		throw new CloneNotSupportedException("cloning not allowed on singleton object");
	}
}
