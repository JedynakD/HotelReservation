package org.jedynakd;

/**
 * Created by Damian on 2015-03-04.
 */
public class Person implements Observer {
    int prize;
    boolean isAvailable;

    public void update(int prize, boolean isAvailable) {
        this.prize = prize;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Person{" +
                "prize=" + prize +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
