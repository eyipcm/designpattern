package com.aypc.creational.prototype2;

public class PrototypeDemo {

	public static void main(String[] args) {
		ColorStore.getColor("blue").addColor();
		ColorStore.getColor("black").addColor();
		ColorStore.getColor("black").addColor();
		ColorStore.getColor("blue").addColor();
	}
}
