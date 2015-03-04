import org.jedynakd.*;

/**
 * Created by Damian on 2015-03-04.
 */
public class ApplicationTest {
    public static void main(String args[]) {
        Person person = new Person();
        Airline airline = new Airline();
        ReservationMaker reservationMaker = new ReservationMaker();
        reservationMaker.addObserver(person);
        reservationMaker.addObserver(airline);
        reservationMaker.setSystem(5, true);
        reservationMaker.notifyObservers();
        DataPrinter personDataPrinter = new PersonDataPrinter(person);
        DataPrinter airlineDataPrinter = new AirlineDataPrinter(airline);
        System.out.println("Person information for booking: " + personDataPrinter.printData());
        System.out.println("Airline information for booking: " + airlineDataPrinter.printData());
        reservationMaker.deleteObserver(person);
    }
}
