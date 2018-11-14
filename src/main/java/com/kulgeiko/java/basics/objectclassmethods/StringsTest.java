package com.kulgeiko.java.basics.objectclassmethods;

/**
 * Created by akulgeiko on 7/16/2018.
 */
public class StringsTest {

    public static void main(String... args){
        String s1 = "Ball";
        String s2 = "Ball";
        String s3 = new String("Ball");
        String s4 = new String("Ball");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);

        s3.intern();
        System.out.println(s1==s3);

        String s5 = s3.intern();
        System.out.println(s1==s5);

        String escape = "this is escape \\ \\rstring";


    }

}
