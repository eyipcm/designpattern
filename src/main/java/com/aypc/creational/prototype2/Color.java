package com.aypc.creational.prototype2;

public abstract class Color implements Cloneable {
	protected String colorName;

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	abstract void addColor();

}
