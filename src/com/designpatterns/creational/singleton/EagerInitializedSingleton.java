package com.designpatterns.creational.singleton;

public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	// private constructor to avoid client applications to use constructor

	private EagerInitializedSingleton(){}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
	
	public static void main(String[] s) {
		System.out.println("Eager Singleton Instantiation");
		EagerInitializedSingleton ee=EagerInitializedSingleton.getInstance();
		
	}
}
