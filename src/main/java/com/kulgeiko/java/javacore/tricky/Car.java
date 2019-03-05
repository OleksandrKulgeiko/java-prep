package com.kulgeiko.java.javacore.tricky;

public class Car {

    public Car(){
        System.out.println("Hi, I'm Car");
    }
    private Car embededCar = new Car();

    public static void main(String... args){
        System.out.println("Hi there");
    }
}
