package com.kulgeiko.java.javacore.collections.map;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by akulgeiko on 7/11/2018.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, Object> treeMap = new TreeMap<Integer, Object>();
        treeMap.put(1, null); //1
        treeMap.put(5, null); //2
        treeMap.put(3, null); //3
        treeMap.put(2, null); //4
        treeMap.put(4, null); //5
    }
}
