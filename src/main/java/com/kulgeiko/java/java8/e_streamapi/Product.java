package com.kulgeiko.java.java8.e_streamapi;

/**
 * Created by akulgeiko on 6/6/2018.
 */

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public float getPrice(){
        return this.price;
    }

}
