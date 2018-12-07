package com.kulgeiko.java.multithreading.deadlivelock.deadlock;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class ThreadDeadlockExample {
    public static void main(String[] args) {

        final String game1 = "Table Football";
        final String game2 = "Table Tennis";

        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread() {
            public void run() {
                synchronized (game1) {
                    System.out.println("Thread 1: locked: " + game1);

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (game2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                synchronized (game2) {
                    System.out.println("Thread 2: locked: " + game2);

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (game1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };


        t1.start();
        t2.start();
    }
}
