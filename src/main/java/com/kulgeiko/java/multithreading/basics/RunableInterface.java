package com.kulgeiko.java.multithreading.basics;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class RunableInterface implements Runnable{
    @Override
    public void run(){
        for (int i=0; i<5; i++)
            System.out.println(Thread.currentThread().getName() + " - " + i);
    }

}
