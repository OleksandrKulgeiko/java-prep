package com.kulgeiko.java.javacore.exceptions.classnotfound;

/**
 * Created by akulgeiko on 7/3/2018.
 */
public class ClassNF {
    public static void main(String... args) throws Exception{

        Class.forName("SomeAbsentClass");
    }

}
