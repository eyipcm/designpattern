package com.aypc.behavioral.visitor1;

public class DownVisitor extends ReflectiveVisitor {
    public void visit(Object o) {
        try {
            getMethod(o.getClass()).invoke(this, o);
        } catch (Exception ex) {
            System.out.println( "DownVisitor - no appropriate visit() method" );
        }
    }

    public void visitThat(That element) {
        System.out.println("DownVisitor: do Down on " + element.that());
    }
}