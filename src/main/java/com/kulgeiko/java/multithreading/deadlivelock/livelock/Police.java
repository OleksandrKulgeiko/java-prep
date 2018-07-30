package com.kulgeiko.java.multithreading.deadlivelock.livelock;

/**
 * Created by akulgeiko on 7/9/2018.
 */
public class Police {
    public boolean isMoneySent = false;

    public void giveRansom(Criminal criminal) throws Exception {
        while (!criminal.isHostageReleased) {
            System.out.println("Police: waiting criminal to release hostage");
            Thread.sleep(1000);
        }
        System.out.println("Police: sent money");
        this.isMoneySent = true;
    }
}
