package com.kulgeiko.java.multithreading.deadlivelock.racecondition;

/**
 * Created by akulgeiko on 7/10/2018.
 */
public class Counter {
    public long count = 0;
    public void add(){for(int i=0; i<10000; i++) count = count + 1;}
}
