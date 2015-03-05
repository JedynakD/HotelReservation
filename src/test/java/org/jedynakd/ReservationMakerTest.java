package org.jedynakd;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ReservationMakerTest {
    @Test
    public void shouldCallMethodUpdateOnce() {
        ReservationMaker reservationMaker = new ReservationMaker();
        Person person = mock(Person.class);

        reservationMaker.addObserver(person);
        reservationMaker.setSystem(2, true);
        reservationMaker.notifyObservers();

        verify(person).update(2, true);
    }

    @Test
    public void shouldNotCallMethodUpdate() {
        ReservationMaker reservationMaker = new ReservationMaker();
        Person person = mock(Person.class);

        reservationMaker.addObserver(person);
        reservationMaker.setSystem(2, true);
        reservationMaker.deleteObserver(person);
        reservationMaker.notifyObservers();

        verify(person, never()).update(2, true);
    }


}