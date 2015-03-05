package org.jedynakd.printer;

import org.jedynakd.observers.airline.Airline;

public class AirlineDataPrinter implements DataPrinter {
    private Airline airline;

    public AirlineDataPrinter(Airline airline) {
        this.airline = airline;
    }

    public String printData() {
        return airline.toString();
    }
}
