package com.aypc.creational.builder;

/** A given type of pizza being constructed. */
public class BuilderDemo {
	public static void main(String[] args) {
		Cook cook = new Cook();
		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
 
		cook.setPizzaBuilder(hawaiianPizzaBuilder);
		cook.constructPizza();
 
		Pizza hawaiian = cook.getPizza();
 
		cook.setPizzaBuilder(spicyPizzaBuilder);
		cook.constructPizza();
 
		Pizza spicy = cook.getPizza();
	}
}
