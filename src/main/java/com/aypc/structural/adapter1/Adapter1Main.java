package com.aypc.structural.adapter1;

public class Adapter1Main {
    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
