package com.aypc.observer;

public class GraphObserver implements Observer {

	public void update(NumberGenerator n) {
		int count = n.getState();
		System.out.print("state => ");
		for (int i = 0; i < count; i++) {
			System.out.print("#");
		}
		System.out.println("");
	}
}
