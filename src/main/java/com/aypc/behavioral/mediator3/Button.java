package com.aypc.behavioral.mediator3;

public class Button implements Colleague {

	private MachineMediator mediator;
	
    @Override
    public void setMediator(MachineMediator mediator){
		this.mediator = mediator;
	}
	
	public void press(){
		System.out.println("Button pressed.");
		mediator.start();
	}

}