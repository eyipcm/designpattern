package com.aypc.decorator;

public abstract class D implements I {
	private I core;

	public D(I inner) {
		core = inner;
	}

	public void doIt() {
		core.doIt();
	}
}