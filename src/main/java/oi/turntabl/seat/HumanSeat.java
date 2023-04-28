package oi.turntabl.seat;

import oi.turntabl.enumeration.PassengerType;

public class HumanSeat extends Seat{
    public HumanSeat(int id, String name) {
        super(id, name, PassengerType.HUMAN);
    }

    @Override
    public String toString() {
        return "HumanSeat{" + super.toString() + "}";
    }

    @Override
    public void serveMeal() {
        System.out.println("This is a human meal");
    }
}
