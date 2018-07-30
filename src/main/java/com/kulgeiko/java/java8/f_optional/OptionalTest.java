package com.kulgeiko.java.java8.f_optional;

import java.util.Optional;

/**
 * Created by akulgeiko on 7/6/2018.
 */
public class OptionalTest {

    public static void main(String... args){

        // Null IS NOT allowed for Optional.of
        Optional<String> name1 = Optional.of("Alex");
        System.out.println(name1);
        System.out.println(name1.get());

        // Null IS allowed for Optional.ofNullable
        Optional<String> name2 = Optional.ofNullable(null);
        System.out.println(name2);

        // Empty
        Optional<String> name3 = Optional.empty();
        System.out.println(name3);




    }

}
