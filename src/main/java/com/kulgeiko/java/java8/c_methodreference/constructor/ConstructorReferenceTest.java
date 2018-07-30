package com.kulgeiko.java.java8.c_methodreference.constructor;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class ConstructorReferenceTest {

    public static void main(String... args) {

        Messageable messageable = Message::new;
        messageable.getMessage("Hello");

    }
}
