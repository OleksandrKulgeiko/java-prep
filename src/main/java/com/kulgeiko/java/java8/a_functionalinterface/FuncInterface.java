package com.kulgeiko.java.java8.a_functionalinterface;

/**
 * Created by akulgeiko on 6/5/2018.
 */
@FunctionalInterface
public interface FuncInterface {
    String sayHelloTo(String name, String surname);

    default void firstDefautMethod(){
        System.out.println("I am first default method");
    }

    default void secondDefautMethod(){
        System.out.println("I am second default method");
    }
}
