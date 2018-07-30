package com.kulgeiko.designpatterns.c_behavioral.observer.example1;

/**
 * Created by akulgeiko on 12/21/2017.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
