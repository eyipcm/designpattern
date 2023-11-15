package com.aypc.structural.proxy3;

public class ProxyDemo {

    public static void main(String[] args) {

        ATMMachine atmMachine = new ATMMachine();
        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        ATMData realATMMachine = new ATMMachine();
        ATMData atmProxy = new ATMProxy();
        System.out.println("\nCurrent ATM State" + atmProxy.getATMData());
        System.out.println("\nCash in ATM State" + atmProxy.getCashInMachine());
    }
}
