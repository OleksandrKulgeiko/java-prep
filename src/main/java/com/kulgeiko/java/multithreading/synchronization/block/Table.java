package com.kulgeiko.java.multithreading.synchronization.block;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class Table {

    public void printTable(int n){

        synchronized (this) {
            for(int i=1; i<6; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i*n);
            }
        }
    }
}
