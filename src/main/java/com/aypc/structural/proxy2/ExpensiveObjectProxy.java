package com.aypc.structural.proxy2;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            System.out.println("ExpensiveObjectProxy realObject is null...");
            object = new ExpensiveObjectImpl();
        } else {
            System.out.println("ExpensiveObjectProxy realObject isn't null...");
        }
        object.process();
        System.out.println("ExpensiveObjectProxy is running...");
    }
}
