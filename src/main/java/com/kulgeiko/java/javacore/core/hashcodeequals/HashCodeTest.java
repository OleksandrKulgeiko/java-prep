package com.kulgeiko.java.javacore.core.hashcodeequals;

import com.kulgeiko.java.Kite;

/**
 * Created by akulgeiko on 7/12/2018.
 */


public class HashCodeTest {
    public static void main(String... args){
        Kite kite1 = new Kite(12, "Cabrihna");
        Kite kite2 = new Kite(12, "Cabrihna");
        System.out.println(kite1.hashCode());
        System.out.println(kite2.hashCode());
    }
}
/*
1670782018
1706377736
*/