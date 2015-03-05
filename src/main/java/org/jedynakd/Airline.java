package org.jedynakd;

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
