package com.aypc.singleton;

public final class Singleton1 {
    private static volatile Singleton1 instance;

    private Singleton1() {}

    public static Singleton1 getInstance(String value) {
        if (instance == null) {
            synchronized (Singleton1.class) {
                if (instance == null) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }
}
