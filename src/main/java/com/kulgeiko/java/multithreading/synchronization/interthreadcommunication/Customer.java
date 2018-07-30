package com.kulgeiko.java.multithreading.synchronization.interthreadcommunication;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class Customer{
    int amount = 10000;

    synchronized void withdraw(int amount){
        System.out.println("WITHDRAWING...");

        if(this.amount<amount){
            System.out.println("Less balance; waiting for deposit...");
            try{
                wait();
                System.out.println(Thread.currentThread().getState());
            }catch(Exception e){}
        }
        this.amount-=amount;
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount){
        System.out.println("DEPOSITING...");
        this.amount+=amount;
        System.out.println("deposit completed... ");
        notify();
    }
}