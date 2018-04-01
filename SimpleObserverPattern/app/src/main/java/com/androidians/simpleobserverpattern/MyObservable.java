package com.androidians.simpleobserverpattern;

import java.util.Vector;

public class MyObservable {

    private Vector<MyObserver> myObservers = new Vector<>();
    private boolean changed;

    public void notifyObservers(Object arg) {
        if (isChanged()) {
            for (MyObserver observer: myObservers) {
                observer.update(this, arg);
            }

            clearChanged();
        }
    }

    public void addObserver(MyObserver observer) {
        myObservers.add(observer);
    }

    public void removeObserver(MyObserver observer) {
        myObservers.removeElement(observer);
    }

    public boolean isChanged() {
        return changed;
    }

    public void setChanged(boolean changed) {
        this.changed = changed;
    }

    public void clearChanged() {
        changed = false;
    }

    public void setChanged() {
        changed = true;
    }
}
