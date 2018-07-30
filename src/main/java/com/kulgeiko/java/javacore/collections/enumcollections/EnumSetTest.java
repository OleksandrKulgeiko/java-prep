package com.kulgeiko.java.javacore.collections.enumcollections;

import java.util.EnumSet;

/**
 * Created by akulgeiko on 7/12/2018.
 */

enum Fruits{APPLE, PLUM, PEAR, PINEAPPLE}
public class EnumSetTest {
    public static void main(String... args){
        EnumSet<Fruits> s1, s2, s3, s4;
        s1 = EnumSet.allOf(Fruits.class);
        s2 = EnumSet.of(Fruits.APPLE, Fruits.PEAR);
        s3 = EnumSet.complementOf(s1);
        s4 = EnumSet.range(Fruits.PLUM, Fruits.PINEAPPLE);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
    }
}


