package com.kulgeiko.java.multithreading.deadlivelock.livelock;

/**
 * Created by akulgeiko on 7/9/2018.
 */
public class Criminal {
    public boolean isHostageReleased = false;

    public void releaseHostage(Police police) throws Exception {
        while (!police.isMoneySent) {
            System.out.println("Criminal: waiting police to give ransom");
            Thread.sleep(1000);
        }
        System.out.println("Criminal: released hostage");
        this.isHostageReleased = true;
    }
}
