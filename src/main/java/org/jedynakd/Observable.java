package org.jedynakd;

/**
 * Created by Damian on 2015-03-04.
 */
public interface Observable {
    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObservers();
}
