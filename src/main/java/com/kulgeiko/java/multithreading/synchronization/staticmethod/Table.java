package com.kulgeiko.java.multithreading.synchronization.staticmethod;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class Table {

    public synchronized static void printTable(int n){
        for(int i=1; i<6; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i*n);
        }
    }
}
