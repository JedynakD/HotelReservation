package org.jedynakd;

/**
 * Created by Damian on 2015-03-04.
 */
public class Airline implements Observer {
    boolean isAvailable;

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
