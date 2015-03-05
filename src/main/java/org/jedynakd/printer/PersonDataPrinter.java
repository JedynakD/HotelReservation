package org.jedynakd.printer;

import org.jedynakd.observers.person.Person;

public class PersonDataPrinter implements DataPrinter {
    private Person person;

    public PersonDataPrinter(Person person) {
        this.person = person;
    }

    public String printData() {
        return person.toString();
    }
}
