package com.aypc.decorator;

/*B4*/
/*
class A {
public void doIt() {
    System.out.print('A');
}
}

class AwithX extends A {
public  void doIt() {
    super.doIt();
    doX();
}

private void doX() {
    System.out.print('X');
}
}

class aWithY extends A {
public void doIt() {
    super.doIt();
    doY();
}

public void doY()  {
    System.out.print('Y');
}
}

class aWithZ extends A {
public void doIt() {
    super.doIt();
    doZ();
}

public void doZ() {
    System.out.print('Z');
}
}

class AwithXY extends AwithX {
private aWithY obj = new aWithY();
public void doIt() {
    super.doIt();
    obj.doY();
}
}

class AwithXYZ extends AwithX {
private aWithY obj1 = new aWithY();
private aWithZ obj2 = new aWithZ();

public void doIt() {
    super.doIt();
    obj1.doY();
    obj2.doZ();
}
}

public class DecoratorDemo {
public static void main(String[] args) {
    A[] array = {new AwithX(), new AwithXY(), new AwithXYZ()};
    for (A a : array) {
        a.doIt();
        System.out.print("  ");
    }
}
}
*/

public class DecoratorDemo {
	public static void main( String[] args ) {
	    I[] array = {new X(new A()), new Y(new X(new A())),
	            new Z(new Y(new X(new A())))};
	    for (I anArray : array) {
	        anArray.doIt();
	        System.out.print("  ");
	    }
	}
}

/* AFT*/
/*
interface I { 
void doIt(); 
}

class A implements I { 
public void doIt() { 
    System.out.print('A'); 
} 
}

abstract class D implements I {
private I core;
public D(I inner) {
    core = inner;
}

public void doIt() {
    core.doIt();
}
}

class X extends D {
public X(I inner) {
    super(inner);
}

public void doIt() {
    super.doIt();
    doX();
}

private void doX() {
    System.out.print('X');
}
}

class Y extends D {
public Y(I inner) {
    super(inner);
}

public void doIt()  {
    super.doIt();
    doY();
}

private void doY() {
    System.out.print('Y');
}
}

class Z extends D {
public Z(I inner) {
    super(inner);
}

public void doIt()  {
    super.doIt();
    doZ();
}

private void doZ() {
    System.out.print('Z');
}
}

public class DecoratorDemo {
public static void main( String[] args ) {
    I[] array = {new X(new A()), new Y(new X(new A())),
            new Z(new Y(new X(new A())))};
    for (I anArray : array) {
        anArray.doIt();
        System.out.print("  ");
    }
}
}
*/