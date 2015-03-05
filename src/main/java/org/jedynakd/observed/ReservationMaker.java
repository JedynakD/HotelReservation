package org.jedynakd.observed;

import org.jedynakd.observers.person.Observer;

import java.util.ArrayList;
import java.util.List;

public class ReservationMaker implements Observable {
    private List<Observer> observers;
    private int prize;
    private boolean isAvailable;

    public ReservationMaker() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        if (!observers.isEmpty()) {
            observers.remove(observer);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(prize, isAvailable);
        }
    }

    public void setSystem(int prize, boolean isAvailable) {
        this.prize = prize;
        this.isAvailable = isAvailable;
    }
}
