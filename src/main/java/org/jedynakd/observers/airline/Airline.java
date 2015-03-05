package org.jedynakd.observers.airline;

import org.jedynakd.observers.person.Observer;

public class Airline implements Observer {
   private  boolean isAvailable;

    public void update(int prize, boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "isAvailable=" + isAvailable +
                '}';
    }
}
