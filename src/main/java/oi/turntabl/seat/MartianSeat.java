package oi.turntabl.seat;

import oi.turntabl.enumeration.PassengerType;

public class MartianSeat extends Seat{
    public MartianSeat(int id, String name) {
        super(id, name, PassengerType.MARTIAN);
    }

    @Override
    public void serveMeal() {
        System.out.println("This is a martian meal");
    }
}
