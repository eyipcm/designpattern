package com.aypc.state;

public class Medium implements State {
	public void pull(CeilingFanPullChain wrapper) {
		wrapper.set_state(new High());
		System.out.println("high speed");
	}
}