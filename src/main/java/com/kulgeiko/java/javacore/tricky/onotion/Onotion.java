package com.kulgeiko.java.javacore.tricky.onotion;

/**
 * Created by akulgeiko on 6/8/2018.
 */
public class Onotion {

    public static void main(String... args){
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        // O(1)
        printFirstItem(a);
        // O(n)
        printAllItems(a);
        // O(n^2)
        printAllPossibleOrderedPairs(a);
    }

    // It runs in O(1) (or "constant time") relative to input
    public static void printFirstItem(int[] items) {
        System.out.println(items[0]);
    }

    // It runs in O(n) relative to input
    public static void printAllItems(int[] items) {
        for (int item : items) {
            System.out.println(item);
        }
    }

    // It runs in O(n^2) relative to input
    public static void printAllPossibleOrderedPairs(int[] items) {
        for (int firstItem : items) {
            for (int secondItem : items) {
                System.out.println(firstItem + ", " + secondItem);
            }
        }
    }
}
