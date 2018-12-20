package com.kulgeiko.java.multithreading.basics;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class TestThreads {

    public static void main(String... args) throws Exception {

        // --------------------------- Interface
        Thread t1 = new Thread(new RunableInterface());
        t1.start();

        // --------------------------- Subclass
        Thread t2 = new ThreadClass();

        t1.start();
        t1.join();
        t2.start();

    }

}
