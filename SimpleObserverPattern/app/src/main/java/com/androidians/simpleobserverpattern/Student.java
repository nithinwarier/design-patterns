package com.androidians.simpleobserverpattern;


public class Student implements MyObserver {

    /*@Override
    public void update(Observable o, Object arg) {
        System.out.println("Message board changed: "+arg);
    }*/

    @Override
    public void update(MyObservable observable, Object arg) {
        System.out.println("Message board changed: "+arg);
    }
}
