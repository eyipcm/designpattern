package com.aypc.structural.decorator1;

public class Garland extends TreeDecorator {

    public Garland(Tree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + this.decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }
}
