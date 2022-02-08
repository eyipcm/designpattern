package com.aypc.visitor1;

public class That implements Element {
    public void accept(ReflectiveVisitor v) {
        v.visit(this);
    }

    public String that() {
        return "That";
    }
}