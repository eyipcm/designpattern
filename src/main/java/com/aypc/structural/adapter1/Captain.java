package com.aypc.structural.adapter1;

public class Captain {
    private final RowingBoat rowingBoat;

    // default constructor and setter for rowingBoat
    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row() {
        rowingBoat.row();
    }
}
