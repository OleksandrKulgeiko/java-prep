package com.kulgeiko.java.multithreading.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinMain {

    public static void main(String... args){

        // RecursiveAction
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        MyRecursiveAction myRecursiveAction = new MyRecursiveAction("Alex say hello to Scala");
        forkJoinPool.invoke(myRecursiveAction);

    }

}
