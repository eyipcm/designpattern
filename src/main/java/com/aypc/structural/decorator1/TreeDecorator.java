package com.aypc.structural.decorator1;

public abstract class TreeDecorator implements Tree {
    private Tree tree;

    // standard constructors
    public TreeDecorator(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
