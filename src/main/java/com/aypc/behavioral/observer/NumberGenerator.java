package com.aypc.behavioral.observer;

import java.util.Vector;
import java.util.Iterator;

public abstract class NumberGenerator {
	private Vector observers = new Vector();

	public void attach(Observer o) {
		observers.add(o);
	}

	public void detach(Observer o) {
		observers.remove(o);
	}

	public void Notify() { // notify() is final in Object class which can't be
							// overrided by subclass
		for (Iterator it = observers.iterator(); it.hasNext();) {
			Observer o = (Observer) it.next();
			o.update(this);
		}
	}

	public abstract int getState();

	public abstract void setState(int n);
}
