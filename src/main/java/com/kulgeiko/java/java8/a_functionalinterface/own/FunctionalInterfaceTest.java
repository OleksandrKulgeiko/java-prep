package com.kulgeiko.java.java8.a_functionalinterface.own;

import java.util.function.Function;

/**
 * Created by akulgeiko on 6/5/2018.
 */
public class FunctionalInterfaceTest {

    public static void main(String... args) {

        // Test with manually created functional interface
        FuncInterface manualFuncInterface = (name, surname) -> "Hello to "+ name + " " + surname;
        FunctionalInterfaceTest.congrat(manualFuncInterface, "Alex", "Oleksandrovich");

        // Test with functional interface from library
        Function functionFromLibrary = name -> "Hello to "+ name;
        FunctionalInterfaceTest.congrat(functionFromLibrary, "Alex");

        // Test default methods in manually created functional interface
        manualFuncInterface.firstDefautMethod();
        manualFuncInterface.secondDefautMethod();


    }

    public static void congrat(FuncInterface f, String name, String surname){
        System.out.println(f.sayHelloTo(name, surname));
    }

    public static void congrat(Function f, String name){
        System.out.println(f.apply(name));
    }

}
