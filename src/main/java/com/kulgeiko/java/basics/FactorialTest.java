package com.kulgeiko.java.basics;

/**
 * Created by akulgeiko on 7/16/2018.
 */
public class FactorialTest {
    public static void main(String... args){

        // By recursion
        int i = factRecursion(4);
        System.out.println(i);

        // By loops
        int j = factLoops(4);
        System.out.println(j);
    }

    public static int factRecursion(int n){
        if (n==0) return 1;
        else return factRecursion(n-1)*n;
    }

    public static int factLoops(int n){
        int fact=1;
        for(int i=n;i>0;i--){
            fact = fact*i;
        }
        return fact;
    }
}
