package com.aypc.behavioral.visitor1;

public class VisitorDemo {
    public static void main( String[] args ) {
        Element[] list = {new This(), new That(), new TheOther()};
        UpVisitor up = new UpVisitor();
        DownVisitor down = new DownVisitor();
        for (Element element : list) {
            element.accept(up);
        }
        for (Element element : list) {
            element.accept(down);
        }
    }
}
