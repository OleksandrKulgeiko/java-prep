package com.kulgeiko.java.basics;

/**
 * Created by akulgeiko on 7/2/2018.
 */
public class TestStaticBlockVsBlock {

    // Non-static block
    {System.out.println("Non-static block");}

    // Static block
    static{System.out.println("Static");}

    public static void main(String[] args) {
        TestStaticBlockVsBlock t = new TestStaticBlockVsBlock();
        TestStaticBlockVsBlock t2 = new TestStaticBlockVsBlock();
    }

}