package org.jedynakd;

/**
 * Created by Damian on 2015-03-04.
 */
public class AirlineDataPrinter implements DataPrinter {
    private Airline airline;

    public AirlineDataPrinter(Airline airline) {
        this.airline = airline;
    }

    public String printData() {
        return airline.toString();
    }
}
