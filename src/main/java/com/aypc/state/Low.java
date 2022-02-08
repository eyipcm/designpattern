package com.aypc.state;

public class Low implements State {
	public void pull(CeilingFanPullChain wrapper) {
		wrapper.set_state(new Medium());
		System.out.println("medium speed");
	}
}
