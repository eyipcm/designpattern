package com.aypc.behavioral.mediator3;

public class Sensor {
	public boolean checkTemperature(int temp) {
		System.out.println("Temperature reached " + temp + " *C");
		return true;
	}
}
