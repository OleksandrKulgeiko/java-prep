package com.kulgeiko.java.multithreading.synchronization.interruption;

/**
 * Created by akulgeiko on 6/6/2018.
 */
public class TestInterruption {

    public static void main(String... args) throws Exception{
        Thread myThread = new Thread(() -> {
            try {
                //Thread.sleep(1000);
                System.out.println("task from thread");
            } catch (Exception e) {}
        });

        myThread.start();
        myThread.interrupt();
        Thread.sleep(2000);
        System.out.print(myThread.getState());
    }


}
