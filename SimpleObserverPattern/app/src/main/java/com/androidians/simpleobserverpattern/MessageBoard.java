package com.androidians.simpleobserverpattern;


public class MessageBoard extends MyObservable {

    public void changeMessage(String msg) {
        setChanged();
        notifyObservers(msg);
    }

    public static void main(String[] args) {
        MessageBoard messageBoard = new MessageBoard();
        Student joe = new Student();
        messageBoard.addObserver(joe);
        messageBoard.changeMessage("More home work");
        messageBoard.removeObserver(joe);
    }

}
