package com.ss.concurrency;

public class SingletonDoubleCheck {
	
	private static volatile SingletonDoubleCheck instance;
	public static SingletonDoubleCheck getInstance() {
		if(instance == null) {
			synchronized(SingletonDoubleCheck.class) {
				if(instance == null) {
					instance = new SingletonDoubleCheck();
				}
			}
		}
		return instance;
	}
}
