package com.kulgeiko.java.multithreading.synchronization.method;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class Table {

     public synchronized void printTable(int n){
            for(int i=1; i<6; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i*n);
        }
    }
}
