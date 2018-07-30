package com.kulgeiko.java.javacore.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by akulgeiko on 7/3/2018.
 */
public class ListTest {

    public static void main(String... args){

        // ---------------------------------------- ArrayList
        System.out.println("----------------------- ArrayList");
        List<String> fruits = new ArrayList<>();
        System.out.println("Initial size - " + fruits.size());
        fruits.add("apple");
        System.out.println("New size - " + fruits.size());
        printList(fruits);
        fruits.add(0, "plum");
        fruits.add(0, "pear");
        fruits.add(0, "pineapple");
        printList(fruits);


        // ---------------------------------------- LinkedList
        System.out.println("----------------------- LinkedList");
        List<String> vegetables = new LinkedList<>();
        System.out.println("Initial size - " + vegetables.size());
        vegetables.add("tomato");
        System.out.println("New size - " + vegetables.size());
        printList(vegetables);
        vegetables.add(0, "cabbage");
        vegetables.add(0, "cucumber");
        vegetables.add(0, "carrot");
        printList(vegetables);



    }









    private static void printList(List l){
        Iterator i = l.iterator();
        while(i.hasNext()) {System.out.print(i.next() + " ");}
        System.out.print("\n");
    }

}
