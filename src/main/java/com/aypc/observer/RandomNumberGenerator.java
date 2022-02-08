package com.aypc.observer;

public class RandomNumberGenerator extends NumberGenerator {
	private int count = 0;

	public int getState() {
		return count;
	}

	public void setState(int n) {
		count = n;
		Notify(); // notify() is final in Object class which can't be overrided
				  // by subclass
	}
}