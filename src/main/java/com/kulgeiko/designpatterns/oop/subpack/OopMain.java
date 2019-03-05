package com.kulgeiko.designpatterns.oop.subpack;

import com.kulgeiko.designpatterns.oop.Car;
import com.kulgeiko.designpatterns.oop.Vehicle;

public class OopMain {
    public static void main(String... args){

        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.pub);
        //System.out.println(vehicle.prot);
        //System.out.println(vehicle.def);

        Car car = new Car();
        System.out.println(car.pub);
        //System.out.println(car.prot);
        //System.out.println(car.def);
    }
}
