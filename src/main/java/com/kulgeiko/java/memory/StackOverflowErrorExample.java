package com.kulgeiko.java.memory;

/**
 * Created by akulgeiko on 7/5/2018.
 */
public class StackOverflowErrorExample {

    public static void main(String[] args) {
        recursivePrint(1);
    }

    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);
        if(num == 0)
            return;
        else
            recursivePrint(++num);
    }
}
