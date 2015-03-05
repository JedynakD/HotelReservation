package org.jedynakd.observers.person;

public class Person implements Observer {
    private int prize;
    private boolean isAvailable;

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
