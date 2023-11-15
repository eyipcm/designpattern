package com.aypc.structural.proxy3;

public class ATMProxy implements ATMData {


    @Override
    public ATMState getATMData() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getATMData();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine realATMMachine = new ATMMachine();
        return realATMMachine.getCashInMachine();
    }
}
