package com.aypc.behavioral.command;

public class Programmer implements Command {
	public void execute() {
		System.out.println("sell the bugs, charge extra for the fixes");
	}
}