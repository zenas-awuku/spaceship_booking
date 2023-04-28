package oi.turntabl.seat;

import oi.turntabl.enumeration.PassengerType;

public abstract class Seat {
    private int id;
    private String name;

    private PassengerType type;

    public PassengerType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public Seat(int id, String name, PassengerType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public abstract void serveMeal();

}
