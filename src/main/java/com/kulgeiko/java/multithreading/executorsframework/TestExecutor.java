package com.kulgeiko.java.multithreading.executorsframework;

import java.util.concurrent.*;

/**
 * Created by akulgeiko on 7/10/2018.
 */
public class TestExecutor {

    public static void main(String... args) throws Exception{

        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){}
        };

        // --------------------------------- Executor
        Executor executor = Executors.newSingleThreadExecutor();
        //for (int i=0; i<5; i++) executor.execute(runnable);


        // --------------------------------- ExecutorService

        // Creates a single thread ExecutorService
        ExecutorService singleExecutorService = Executors.newSingleThreadExecutor();

        // Creates an ExecutorService that use a pool of 10 threads
        ExecutorService fixedExecutorService = Executors.newFixedThreadPool(10);
        // for (int i=0; i<15; i++) fixedExecutorService.execute(runnable);

        Future<Integer> future = fixedExecutorService.submit(new FactorialCallable());
        System.out.println(future.get());


        // Creates an ExecutorService that use a pool that creates threads on demand
        // And that kill them after 60 seconds if they are not used
        ExecutorService onDemandExecutorService = Executors.newCachedThreadPool();


        // --------------------------------- ScheduledExecutorService

        // Creates a single thread ScheduledExecutorService
        ScheduledExecutorService singleScheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        //singleScheduledExecutorService.schedule(new FactorialCallable(),5000)


    }




}
