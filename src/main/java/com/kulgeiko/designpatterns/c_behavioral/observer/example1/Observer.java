package com.kulgeiko.designpatterns.c_behavioral.observer.example1;

/**
 * Created by akulgeiko on 12/21/2017.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
