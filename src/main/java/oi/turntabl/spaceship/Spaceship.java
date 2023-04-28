package oi.turntabl.spaceship;

import oi.turntabl.enumeration.PassengerType;
import oi.turntabl.exception.SeatCapacityReachedException;
import oi.turntabl.seat.HumanSeat;
import oi.turntabl.seat.MartianSeat;
import oi.turntabl.seat.Seat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spaceship {
    private List<Seat> seats;
    private final int numberOfSeats;

    public List<Seat> getSeats() {
        return seats;
    }

    public Spaceship(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        seats = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Spaceship{" +
                "seats=" + seats +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }

    public void bookSeat(int id, String name, PassengerType passengerType) throws SeatCapacityReachedException {

        if (seats.size() == numberOfSeats) throw new SeatCapacityReachedException("The Spaceship is Full");
        Seat seat;
        if (passengerType == PassengerType.HUMAN) {
            seat = new HumanSeat(id, name);
            seats.add((HumanSeat)seat);
        } else {
            seat = new MartianSeat(id, name);
            seats.add((MartianSeat)seat);
        }
    }
}
