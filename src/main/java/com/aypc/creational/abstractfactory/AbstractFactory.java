package com.aypc.creational.abstractfactory;

public interface AbstractFactory<T> {
    T create(String type);
}
