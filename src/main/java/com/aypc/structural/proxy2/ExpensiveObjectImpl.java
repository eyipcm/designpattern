package com.aypc.structural.proxy2;

public class ExpensiveObjectImpl implements ExpensiveObject {

    public ExpensiveObjectImpl() {
        this.heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("processing complete. RealObject is running");
    }

    private void heavyInitialConfiguration() {
        System.out.println("Loading initial configuration..");
    }

}
