package com.kulgeiko.java.multithreading.deadlivelock.livelock;

/**
 * Created by akulgeiko on 7/9/2018.
 */
public class HostageRescueLivelock {
    static final Police police = new Police();
    static final Criminal criminal = new Criminal();
    public static void main(String[] args) {
            new Thread(() -> {try{police.giveRansom(criminal);}catch(Exception e){}}).start();
            new Thread(() -> {try{criminal.releaseHostage(police);}catch(Exception e){}}).start();
    }
}
