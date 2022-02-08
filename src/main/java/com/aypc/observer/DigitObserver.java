package com.aypc.observer;

public class DigitObserver implements Observer {

	public void update(NumberGenerator n) {
		int count = n.getState();
		System.out.println("state => " + count);
	}
}
