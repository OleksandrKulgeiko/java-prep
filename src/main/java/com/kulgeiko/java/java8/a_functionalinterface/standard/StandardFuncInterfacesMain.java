package com.kulgeiko.java.java8.a_functionalinterface.standard;

import java.awt.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class StandardFuncInterfacesMain {


    public static void main(String... args){

        // Function
        Function<Integer, Integer> square = (a) -> a*a;
        System.out.println(square.apply(8));

        // Function
        BiFunction<Integer, Integer, Integer> sum = (a1, a2) -> a1 + a2;
        System.out.println(sum.apply(2, 3));

        // Predicate
        Predicate<Integer> moreThanPredicate = (v -> (v > 12));
        System.out.println(moreThanPredicate.test(14));


    }


}
