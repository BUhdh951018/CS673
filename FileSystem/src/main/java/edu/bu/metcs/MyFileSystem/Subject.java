package edu.bu.metcs.MyFileSystem;

import edu.bu.metcs.MyFileSystem.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<Observer>();

    public void subscribe(Observer o){
        observers.add(o);

    }

    public void unsubscribe(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for (Observer o: observers) {
            o.update();
        }
    }

}
