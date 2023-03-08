package com.aypc.structural.composite1;

//2. "Isa" relationship
public class Primitive implements Component {
	private int value;

	public Primitive(int val) {
		value = val;
	}

	public void traverse() {
		System.out.print(value + "  ");
	}
}