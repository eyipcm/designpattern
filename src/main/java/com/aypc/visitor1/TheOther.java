package com.aypc.visitor1;

public class TheOther implements Element {
    public void accept(ReflectiveVisitor v) {
        v.visit(this);
    }

    public String theOther() {
        return "TheOther";
    }
}
