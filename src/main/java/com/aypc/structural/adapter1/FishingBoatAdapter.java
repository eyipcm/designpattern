package com.aypc.structural.adapter1;

public class FishingBoatAdapter implements RowingBoat {

    private final FishingBoat boat;

    public FishingBoatAdapter() {
        this.boat = new FishingBoat();
    }

    @Override
    public void row() {
        this.boat.sail();
    }
}
