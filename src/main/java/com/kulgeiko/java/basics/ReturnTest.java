package com.kulgeiko.java.basics;

/**
 * Created by akulgeiko on 7/16/2018.
 */
public class ReturnTest {

    public static void main(String... args) {
        String s = getColour();
        System.out.print(s);

        int a = getAmount();
        System.out.print(a);
    }
    static String getColour(){
        try {
            return "Green";
        }
        finally {
            return "Red";
        }
    }

    static int getAmount(){
        try {
            return 1;
        }
        finally {
            return 2;
        }
    }

}
