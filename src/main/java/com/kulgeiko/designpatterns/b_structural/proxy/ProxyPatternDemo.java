package com.kulgeiko.designpatterns.b_structural.proxy;

/**
 * Created by akulgeiko on 11/23/2017.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("test_10mb.jpg");
        //image will be loaded from disk
        proxyImage.display();
        System.out.println("");
        //image will not be loaded from disk
        proxyImage.display();

        System.out.println("---------------");

        Image realImage = new RealImage("test_100mb.jpg");
        //image will be loaded from disk
        realImage.display();
        System.out.println("");
        //image will not be loaded from disk
        realImage.display();


    }
}
