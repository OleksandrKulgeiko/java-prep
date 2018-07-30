package com.kulgeiko.java.multithreading.executorsframework;

import java.util.concurrent.Callable;

/**
 * Created by akulgeiko on 7/10/2018.
 */
public class FactorialCallable implements Callable<Integer> {
    @Override
    public Integer call(){
        int n = 5;
        int fact = 1;
        for (int i=n; i>0; i--){
            fact = fact*i;
        }
        System.out.println("Computation completed");
        return fact;
    }
}
