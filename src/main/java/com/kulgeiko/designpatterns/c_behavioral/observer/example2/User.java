package com.kulgeiko.designpatterns.c_behavioral.observer.example2;

/**
 * Created by akulgeiko on 1/7/2018.
 */
public class User implements Observer {

    private Observable observable = null;

    public User(Observable observable){
        this.observable = observable;
    }

    @Override
    public void update(){
        buyDress();
        unsubscribe();
    }

    private void buyDress(){
        System.out.println("Got my new red dress");
    }

    private void unsubscribe(){
        observable.removeObserver(this);
    }
}
