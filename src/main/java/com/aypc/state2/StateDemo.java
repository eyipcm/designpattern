package com.aypc.state2;


/**
 * Demo class. Everything comes together here.
 */
public class StateDemo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}