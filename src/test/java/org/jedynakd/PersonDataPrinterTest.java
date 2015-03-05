package org.jedynakd;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonDataPrinterTest {
    @Test
    public void shouldReturnPrizeZeroAndIsAvailableFalse() {
        Person person = new Person();
        PersonDataPrinter personDataPrinter = new PersonDataPrinter(person);
        String expected = "Person{prize=0, isAvailable=false}";

        String actual = personDataPrinter.printData();

        assertEquals(expected, actual);
    }
}