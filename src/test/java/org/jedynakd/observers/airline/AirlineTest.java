package org.jedynakd.observers.airline;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AirlineTest {
    @Test
    public void shouldChangeIsAvailableToTrue() {
        Airline airline = new Airline();
        airline.update(7, true);
        String expected = "Airline{isAvailable=true}";

        String actual = airline.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeIsAvailableToFalse() {
        Airline airline = new Airline();
        airline.update(9, false);
        String expected = "Airline{isAvailable=false}";

        String actual = airline.toString();

        assertEquals(expected, actual);
    }

}