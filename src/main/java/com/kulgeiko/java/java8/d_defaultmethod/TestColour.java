package com.kulgeiko.java.java8.d_defaultmethod;

/**
 * Created by akulgeiko on 7/9/2018.
 */
public class TestColour {
    public static void main(String... args){

        MyFavoriteColor myFavoriteColor = () -> "HB";

        System.out.println(myFavoriteColor.getMyFavoriteColour());
        System.out.println(myFavoriteColor.getPencilHardness());

    }

}
