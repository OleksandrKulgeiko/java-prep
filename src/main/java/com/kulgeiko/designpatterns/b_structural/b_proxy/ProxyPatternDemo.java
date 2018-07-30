package com.kulgeiko.designpatterns.b_structural.b_proxy;

/**
 * Created by akulgeiko on 11/23/2017.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
