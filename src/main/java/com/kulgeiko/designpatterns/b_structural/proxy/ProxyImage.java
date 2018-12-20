package com.kulgeiko.designpatterns.b_structural.proxy;

/**
 * Created by akulgeiko on 11/23/2017.
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        System.out.println("THIS IS FUNCTIONALITY ADDED BY PROXY");
        realImage.display();
    }
}