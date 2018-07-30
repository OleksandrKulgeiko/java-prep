package com.kulgeiko.designpatterns.c_behavioral.observer.example2;

/**
 * Created by akulgeiko on 1/7/2018.
 */
public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);

    void notifyObserver();
}
