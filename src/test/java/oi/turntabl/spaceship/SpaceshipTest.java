package oi.turntabl.spaceship;

import oi.turntabl.enumeration.PassengerType;
import oi.turntabl.exception.SeatCapacityReachedException;
import oi.turntabl.seat.Seat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceshipTest {
    private Spaceship spaceship;

    @BeforeEach
    void setUp() {
        spaceship = new Spaceship(10);
    }

    @Test
    void testHumanSeatAssignment() throws SeatCapacityReachedException {
        spaceship.bookSeat(2, "Zenas", PassengerType.HUMAN);

        assertEquals(PassengerType.HUMAN, spaceship.getSeats().get(0).getType());
    }

    @Test
    void testMartianSeatAssignment() throws SeatCapacityReachedException {
        spaceship.bookSeat(1, "SDF", PassengerType.MARTIAN);

        assertEquals(PassengerType.MARTIAN, spaceship.getSeats().get(0).getType());
    }


    @Test
    void testSeatCapacityReached() throws SeatCapacityReachedException {
        Spaceship testSpaceship = new Spaceship(1);
        testSpaceship.bookSeat(1, "Zenas", PassengerType.HUMAN);
        assertThrows(SeatCapacityReachedException.class, () -> testSpaceship.bookSeat(2, "Zenas", PassengerType.HUMAN));
    }

    @Test
    void testSeatCapacityNotReached() throws SeatCapacityReachedException {
        Spaceship testSpaceship = new Spaceship(2);
        testSpaceship.bookSeat(1, "Zenas", PassengerType.HUMAN);
        assertDoesNotThrow(() -> testSpaceship.bookSeat(2, "Zenas", PassengerType.HUMAN));
    }

}