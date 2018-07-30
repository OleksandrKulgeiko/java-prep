package com.kulgeiko.java.java8.c_methodreference.staticmethods;

import java.util.function.BiFunction;

/**
 * Created by akulgeiko on 6/5/2018.
 */
public class MethodReference {

    public static void main(String[] args) {


        // Referring static method for Manually defined functional interface
        Sayable sayable = MethodReference::saySomething;
        sayable.say();

        // Referring static method for Runable (from library) functional interface
        Thread thread = new Thread(MethodReference::forThread);
        thread.start();

        // Reffering static method for bi-function library interface + overloading in Arithmetic class
        BiFunction<Integer, Integer, Integer> biFunctionInt = Arithmetic::addTwoNumbers;
        BiFunction<Integer, Float, Float> biFunctionFloat = Arithmetic::addTwoNumbers;

        System.out.println("bi function int - " + biFunctionInt.apply(2, 3));
        System.out.println("bi function float - " + biFunctionFloat.apply(20, 30f));

    }

    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }

    public static void forThread(){
        System.out.println("It is for thread guy");
    }


}
