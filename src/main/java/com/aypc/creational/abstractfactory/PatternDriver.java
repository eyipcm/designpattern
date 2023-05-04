package com.aypc.creational.abstractfactory;

public class PatternDriver {
    public static void main (String[] args){
        AbstractFactory abstractFactory;

        //creating a brown toy dog
        abstractFactory = FactoryProvider.getFactory("Toy");
        Animal toy =(Animal) abstractFactory.create("Duck");

        abstractFactory = FactoryProvider.getFactory("Color");
        Color color =(Color) abstractFactory.create("white");

        String result = "A " + toy.getType() + " with " + color.getColor() + " color " + toy.makeSound();

        System.out.println(result);
    }
}
