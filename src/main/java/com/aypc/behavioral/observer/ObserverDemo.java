package com.aypc.behavioral.observer;

public class ObserverDemo {
	public static void main(String[] args) {
		NumberGenerator gen = new RandomNumberGenerator();
		Observer digit = new DigitObserver();
		Observer graph = new GraphObserver();
		gen.attach(digit);
		gen.attach(graph);
//		gen.setState(6);
		gen.setState(Integer.parseInt(args[0]));
	}
}