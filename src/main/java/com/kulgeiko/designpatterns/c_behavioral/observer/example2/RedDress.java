package com.kulgeiko.designpatterns.c_behavioral.observer.example2;

import java.util.ArrayList;

/**
 * Created by akulgeiko on 1/7/2018.
 */
public class RedDress implements Observable {

    // list of Users registered for notification
    private ArrayList<Observer> users = new ArrayList<>();

    // state of dress
    private boolean inStock = true;

    @Override
    public void addObserver(Observer o) {
        users.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        users.remove(o);
    }

    @Override
    public void notifyObserver() {

        for (Observer user : users){
            user.update();
        }
    }
}
