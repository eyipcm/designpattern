package com.aypc.structural.decorator1;

public class DecoratorDemo {

    public static void main(String[] args) {

        // christmas tree with just one Garland
        Tree tree1 = new Garland(new ChristmasTree());
        System.out.println(tree1.decorate());

        // christmas tree with two Garlands and one Bubble lights
        Tree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTree())));
        System.out.println(tree2.decorate());
    }
}
/*
Christmas tree with Garland
Christmas tree with Garland with Garland with Bubble Lights
 */