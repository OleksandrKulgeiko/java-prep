package com.kulgeiko.java.multithreading.synchronization.interthreadcommunication;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class TestInterThreadCommunication{

    public static void main(String args[]){

        final Customer c = new Customer();

        new Thread(() -> c.withdraw(15000)).start();
        new Thread(() -> c.deposit(10000)).start();
    }}
