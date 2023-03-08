package com.aypc.behavioral.mediator1;

public class ConcreteColleague extends Colleague {

	public ConcreteColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receive(String message) {
		System.out.println("Colleague Received: " + message);
	}

}
