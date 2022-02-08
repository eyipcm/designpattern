package com.aypc.prototype1;

//1. The clone() contract
public interface Prototype {

	Prototype clone();
	String getName();
	void execute();
}