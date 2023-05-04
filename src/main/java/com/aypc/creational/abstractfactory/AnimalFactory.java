package com.aypc.creational.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if (AnimalEnum.dog.getCode().equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if (AnimalEnum.duck.getCode().equalsIgnoreCase(animalType)) {
            return new Duck();
        }

        return null;
    }
}
