package com.kulgeiko.designpatterns.b_structural.composit;

public class CompositeDesignPatternMain {

    public static void main(String[] args) {

        // Developers
        Employee emp1 = new Developer("John", 10000);
        Employee emp2 = new Developer("David", 15000);

        // Manager
        Employee manager1 = new Manager("Daniel",25000);
        manager1.add(emp1);
        manager1.add(emp2);

        Employee emp3 = new Developer("Michael", 20000);
        Manager generalManager = new Manager("Mark", 50000);

        generalManager.add(emp3);
        generalManager.add(manager1);

        generalManager.print();
    }
}
