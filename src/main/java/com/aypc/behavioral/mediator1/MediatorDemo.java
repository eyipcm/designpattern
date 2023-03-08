package com.aypc.behavioral.mediator1;

public class MediatorDemo {

	public static void main(String[] args) {
		ApplicationMediator mediator = new ApplicationMediator();
	    Colleague desktop = new ConcreteColleague(mediator);
	    Colleague mobile = new MobileColleague(mediator);
	    mediator.addColleague(desktop);
	    mediator.addColleague(mobile);
	    desktop.send("Hello World");
	    mobile.send("Hello");
	}

}
