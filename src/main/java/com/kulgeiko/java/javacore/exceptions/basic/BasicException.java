package com.kulgeiko.java.javacore.exceptions.basic;

/**
 * Created by akulgeiko on 7/3/2018.
 */

public class BasicException {

    public static void main(String... args) {

        doorController();
        System.out.println("We can play with children in room");

    }



    public static void doorController(){

        try {
            System.out.println("Opened the door");
            System.out.println("Whiff happened");

            throw new Exception("Whiff in the door");

        } catch (Exception e){
            //System.out.println("Exception handled, door is closed");
        }
    }
}
