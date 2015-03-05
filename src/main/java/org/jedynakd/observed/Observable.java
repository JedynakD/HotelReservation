package org.jedynakd.observed;

import org.jedynakd.observers.person.Observer;

public interface Observable {
    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObservers();
}
