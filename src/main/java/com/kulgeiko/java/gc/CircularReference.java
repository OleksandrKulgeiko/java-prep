package com.kulgeiko.java.gc;

/**
 * Created by akulgeiko on 6/27/2018.
 */


public class CircularReference {
    public static void main(String[] args) {
        A one = new A();
        B two = new B();

        // Make the objects refer to each other (creates a circular reference)
        one.setB(two);
        two.setA(one);

        // Throw away the references from the main method; the two objects are
        // still referring to each other
        one = null;
        two = null;
    }
}

class A {
    private B b;

    public void setB(B b) {
        this.b = b;
    }
}

class B {
    private A a;

    public void setA(A a) {
        this.a = a;
    }
}