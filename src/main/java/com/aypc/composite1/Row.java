package com.aypc.composite1;

//Two different kinds of "container" classes.  Most of the
//"meat" is in the Composite base class.
public class Row extends Composite {
	public Row(int val) {
		super(val);
	}

	public void traverse() {
		System.out.print("Row");
		super.traverse();
	}
}

