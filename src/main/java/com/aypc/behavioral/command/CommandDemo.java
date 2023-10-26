package com.aypc.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
	public static List<? extends Object> produceRequests() {
		List<Command> queue = new ArrayList<>();
		queue.add(new DomesticEngineer());
		queue.add(new Politician());
		queue.add(new Programmer());
		return queue;
	}

	public static void workOffRequests(List<? extends Object> queue) {
		for (Object command : queue) {
			((Command) command).execute();
		}
	}

	public static void main(String[] args) {
		List<? extends Object> queue = produceRequests();
		workOffRequests(queue);
	}
}

/*
interface Command {
void execute();
}

class DomesticEngineer implements Command {
public void execute() {
    System.out.println("take out the trash");
}
}

class Politician implements Command {
public void execute() {
    System.out.println("take money from the rich, take votes from the poor");
}
}

class Programmer implements Command {
public void execute() {
    System.out.println("sell the bugs, charge extra for the fixes");
}
}

public class CommandDemo {
public static List produceRequests() {
    List<Command> queue = new ArrayList<>();
    queue.add(new DomesticEngineer());
    queue.add(new Politician());
    queue.add(new Programmer());
    return queue;
}

public static void workOffRequests(List queue) {
    for (Object command : queue) {
        ((Command)command).execute();
    }
}

public static void main( String[] args ) {
    List queue = produceRequests();
    workOffRequests(queue);
}
}
*/