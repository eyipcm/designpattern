package com.aypc.behavioral.mediator1;

public class MobileColleague extends Colleague {

	public MobileColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receive(String message) {
		System.out.println("Mobile Received: " + message);
	}

}
