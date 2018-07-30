package com.kulgeiko.java.javacore.core.hashcodeequals;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by akulgeiko on 6/8/2018.
 */
public class HashcodeEqualsTest {

    public static void main(String... args){

        System.gc();
        Runtime.getRuntime().gc();

        //Swimmer swimmer1 = new Swimmer("Alex", 32);
        //Swimmer swimmer2 = new Swimmer("Denys", 31);
        //Swimmer swimmer3 = new Swimmer("Alex", 32);

        Swimmer swimmer1 = new Swimmer(32);
        Swimmer swimmer2 = new Swimmer(33);

        System.out.println("First hashCode = " + swimmer1.hashCode());
        System.out.println("Second hashCode = " + swimmer2.hashCode());

        System.out.println("First equeals first = " + swimmer1.equals(swimmer1));
        System.out.println("First equeals second = " + swimmer1.equals(swimmer2));


        // Interesting operation with HashSet
        Set<Swimmer> set = new HashSet<>();
        set.add(swimmer1);
        set.add(swimmer2);
        System.out.println("HashSet size is = " + set.size());
        System.out.println("HashSet contains = " + set.contains(swimmer1));


    }


}
