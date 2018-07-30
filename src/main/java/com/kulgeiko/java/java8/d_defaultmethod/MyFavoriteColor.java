package com.kulgeiko.java.java8.d_defaultmethod;

/**
 * Created by akulgeiko on 7/9/2018.
 */
public interface MyFavoriteColor {
    String getPencilHardness();
    default String getMyFavoriteColour(){
        return "Green";
    };
    default String getMyFavoriteColour(int num){
        return "Green";
    };
}
