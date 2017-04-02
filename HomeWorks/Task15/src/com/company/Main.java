package com.company;

public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto(321, 0);
        Bike bike = new Bike(123, 2, 10);
        Bus bus = new Bus(333, 93, 0);

        Transport transport[] = new Transport[3];
        transport[0] = auto;
        transport[1] = bike;
        transport[2] = bus;

        for (int i = 0; i < transport.length; i++){
            transport[i].go(200);
            System.out.println("Transport speed " + i + ": " + transport[i].getSpeed());
        }
    }
}
