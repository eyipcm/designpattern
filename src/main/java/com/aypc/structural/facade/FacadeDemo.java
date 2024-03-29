package com.aypc.structural.facade;

/*
1 Identify the desired unified interface for a set of subsystems
2 Design a "wrapper" class that can encapsulate the use of the subsystems
3 The client uses (is coupled to) the Facade
4 The facade/wrapper "maps" to the APIs of the subsystems
 */

public class FacadeDemo {
    public static void main(String[] args) {
        // 3. Client uses the Facade
        Line lineA = new Line(new Point(2, 4), new Point(5, 7));
        lineA.move(-2, -4);
        System.out.println( "after move:  " + lineA );
        lineA.rotate(45);
        System.out.println( "after rotate: " + lineA );
        Line lineB = new Line( new Point(2, 1), new Point(2.866, 1.5));
        lineB.rotate(30);
        System.out.println("30 degrees to 60 degrees: " + lineB);
    }
}
