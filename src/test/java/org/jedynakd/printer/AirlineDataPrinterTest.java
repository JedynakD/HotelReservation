package org.jedynakd.printer;

import org.jedynakd.observers.airline.Airline;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AirlineDataPrinterTest {
    @Test
    public void shouldReturndIsAvailableFalse() {
        Airline airline = new Airline();
        AirlineDataPrinter airlineDataPrinter = new AirlineDataPrinter(airline);
        String expected = "Airline{isAvailable=false}";

        String actual = airlineDataPrinter.printData();

        assertEquals(expected, actual);
    }
}