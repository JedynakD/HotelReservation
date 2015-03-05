package org.jedynakd.observers.person;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTest {
    @Test
    public void shouldChangePrizeToSeven() {
        Person person = new Person();
        person.update(7, false);
        String expected = "Person{prize=7, isAvailable=false}";

        String actual = person.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeIsAvailableToTrue() {
        Person person = new Person();
        person.update(7, true);
        String expected = "Person{prize=7, isAvailable=true}";

        String actual = person.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeIsAvailableToTrueAndPrizeToNine() {
        Person person = new Person();
        person.update(9, true);
        String expected = "Person{prize=9, isAvailable=true}";

        String actual = person.toString();

        assertEquals(expected, actual);
    }
}