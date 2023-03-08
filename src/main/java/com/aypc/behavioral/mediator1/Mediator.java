package com.aypc.behavioral.mediator1;

//Mediator interface
public interface Mediator {
	public void send(String message, Colleague colleague);
}