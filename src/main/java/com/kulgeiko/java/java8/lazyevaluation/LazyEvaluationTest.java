package com.kulgeiko.java.java8.lazyevaluation;

import java.util.function.Supplier;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class LazyEvaluationTest {


    public static void main (String... args){

        // Eager match test
        System.out.print(eagerMatch(compute("bb"), compute("aa")));

        System.out.println(lazyMatch(() -> compute("bb"), () -> compute("aa")));
    }

    static boolean compute(String str) {
        System.out.println("executing...");
        return str.contains("a");
    }

    // Eager match
    static String eagerMatch(boolean b1, boolean b2) {
        return b1 && b2 ? "match \n" : "incompatible! \n";
    }

    // Lazy match. Compute is executed when the functional method get is invoked.
    static String lazyMatch(Supplier a, Supplier b) {
        return (boolean)a.get() && (boolean)b.get() ? "match \n" : "incompatible! \n";
    }

}
