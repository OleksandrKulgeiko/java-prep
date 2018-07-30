package com.kulgeiko.java.multithreading.synchronization.staticmethod;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class TestStaticMethodSynchronization {

    public static void main(String... args) {

        Table table = new Table();
        Thread thread1 = new Thread(() -> table.printTable(1));
        Thread thread2 = new Thread(() -> table.printTable(10));
        Thread thread3 = new Thread(() -> table.printTable(100));
        Thread thread4 = new Thread(() -> table.printTable(1000));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

}
