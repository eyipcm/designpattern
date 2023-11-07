package com.aypc.structural.decorator1;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(Tree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + this.decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
