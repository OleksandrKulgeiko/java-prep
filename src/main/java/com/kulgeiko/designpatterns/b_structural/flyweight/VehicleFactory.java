package com.kulgeiko.designpatterns.b_structural.flyweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static Map<Color, Vehicle> vehiclesCache = new HashMap<>();
    private VehicleFactory() {
    }

    public static Vehicle createVehicle(Color color) {

        // Looks for the requested vehicle into the cache. If the vehicle doesn't exist, a new one is created.
        Vehicle vehicle = vehiclesCache.computeIfAbsent(color, newColor -> {
            // Creates the new car.
            Engine newEngine = new Engine();
            return new Car(newEngine, newColor);
        });
        return vehicle;
    }
}
