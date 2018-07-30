package com.kulgeiko.java.java8.e_streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class JavaStreamExample {

    public static void main(String[] args) {


        List<Product> productsList = new ArrayList<Product>();
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));


        // ------------------ Filtering list
        List<Float> productPriceList2 = productsList.stream()
                .filter(p -> p.price > 30000)   // filtering data
                .map(p -> p.price)              // fetching price
                .collect(Collectors.toList());  // collecting as list

        System.out.println(productPriceList2);

        // ------------------ Iterating example
        Stream.iterate(1, element -> element + 1)
                .filter(element -> element%5==0)
                .limit(5)
                .forEach(System.out::println);

        // ------------------ Filtering and iterating
        productsList.stream()
                .filter(product -> product.price > 50000)
                .forEach(product -> System.out.println(product.name));

        // ------------------ Accumulating some data

        // b_lambda
        float totalPrice = productsList.stream()
                .map(p -> p.price)
                .reduce(0.0f, (sum, price) -> sum + price);
        System.out.println(totalPrice);

        // method-reference
        float totalPrice2 = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);

        // collector
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product->product.price));
        System.out.println(totalPrice3);

        // ------------------ Finding MAX/MIN
        Product productA = productsList.stream()
                .max((product1, product2)->
                        product1.price > product2.price ? 1: -1).get();
        System.out.println(productA.name);

        // ------------------ Count number of products
        long count = productsList.stream()
                .filter(product -> product.price < 30000)
                .count();
        System.out.println(count);


        // ------------------ Converting data from LIST to SET
        Set<Float> productPriceList =
                productsList.stream()
                        .filter(product->product.price < 30000)   // filter product on the base of price
                        .map(product->product.price)
                        .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)
        System.out.println(productPriceList);


        // ------------------ Converting data from LIST to MAP
        Map<Integer,String> productPriceMap =
                productsList.stream()
                        .collect(Collectors.toMap(p -> p.id, p -> p.name));
        System.out.println(productPriceMap);


        // ------------------ Method reference with Streams
        List<Float> productPriceListRef =
                productsList.stream()
                        .filter(p -> p.price > 30000) // filtering data
                        .map(Product::getPrice)         // fetching price by referring getPrice method
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceListRef);


    }






}
