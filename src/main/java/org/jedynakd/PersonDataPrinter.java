package org.jedynakd;

/**
 * Created by Damian on 2015-03-04.
 */
public class PersonDataPrinter implements DataPrinter {
    private Person person;

    public PersonDataPrinter(Person person) {
        this.person = person;
    }

    public String printData() {
        return person.toString();
    }
}
