package com.kulgeiko.java.java8.c_methodreference.instancemethod;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class InstanceMethodReferenceTest {


    public static void main(String... args){

        // --------------------- For manuall created functional interface
        // Via Object instance
        InstanceMethodReference imr = new InstanceMethodReference();
        Sayable sayable1 = imr::saySomething;
        sayable1.say();
        // Via Anonymus object
        Sayable sayable2 = new InstanceMethodReference()::saySomething;
        sayable2.say();

        // --------------------- For Runable interface
        Thread thread = new Thread(new InstanceMethodReference()::saySomething);
        thread.start();
    }
}
