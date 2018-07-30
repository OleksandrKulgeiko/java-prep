package com.kulgeiko.java.multithreading.synchronization.block;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class TestBlockSynchronization {

    public static void main(String... args) {

        Table table = new Table();

        Thread thread1 = new Thread(() -> table.printTable(1));
        Thread thread2 = new Thread(() -> table.printTable(100));

        thread1.start();
        thread2.start();

    }
}
