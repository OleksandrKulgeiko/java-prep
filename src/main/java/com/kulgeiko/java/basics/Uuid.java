package com.kulgeiko.java.basics;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Uuid {

    public static void main(String[] args) throws Exception{
        long time1 = System.nanoTime();
        long time2 = System.nanoTime();
        long time3 = System.nanoTime();
        long time4 = System.nanoTime();
        long time5 = System.nanoTime();

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);
        System.out.println(time5);

        //new File("/test1/directory").mkdir();
        Path p = Paths.get("./test/111111");
        Files.createDirectories(p);

    }
}
