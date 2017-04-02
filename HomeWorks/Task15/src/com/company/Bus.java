package com.company;


public class Bus extends Transport {
    private int seats;
    public Bus(int number, int seats, int speed) {
        super(number, speed);
        if (seats >= 20 && seats <=80){
            this.seats = seats;
        }
    }

    public int getSeats() {
        return seats;
    }
}
