package com.kulgeiko.java.multithreading.deadlivelock.racecondition;

/**
 * Created by akulgeiko on 7/10/2018.
 */
public class CounterTest {
    public static void main(String... args) throws Exception{
        Counter counter = new Counter();

        for (int j=0; j<5; j++) new Thread(() -> counter.add()).start();

        Thread.sleep(400);
        System.out.println(counter.count);
    }
}
/* Output (always different):
44074
43643
37802
30096
*/