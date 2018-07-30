package com.kulgeiko.java.multithreading.deadlivelock.starvation;

/**
 * Created by akulgeiko on 7/9/2018.
 */
public class StarvationExample {

    public static void main(String[] args) {
        Worker worker = new Worker();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> worker.work()).start();
        }
    }
}

