package com.aypc.structural.proxy2;

public class ProxyDemo {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        System.out.println("Main method run second process");
        object.process();
    }
}
