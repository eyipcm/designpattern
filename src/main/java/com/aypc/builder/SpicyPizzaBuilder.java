package com.aypc.builder;

/** "ConcreteBuilder" */
public class SpicyPizzaBuilder extends PizzaBuilder {

	public void buildDough() {
		this.pizza.setDough("cross");
	}
 
	public void buildSauce() {
		this.pizza.setSauce("mild");
	}
 
	public void buildTopping() {
		this.pizza.setTopping("ham+pineapple");
	}
}
