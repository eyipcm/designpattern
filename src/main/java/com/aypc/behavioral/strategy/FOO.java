package com.aypc.behavioral.strategy;

public class FOO extends StrategySolution {
	 private int state = 1;

	 protected void start() {
	     System.out.print("Start  ");
	 }

	 protected void stop() {
	     System.out.println("Stop");
	 }

	 protected boolean nextTry() {
	     System.out.print("NextTry-" + state++ + "  ");
	     return true;
	 }

	 protected boolean isSolution() {
	     System.out.print("IsSolution-" + (state == 3) + "  ");
	     return (state == 3);
	 }
}
