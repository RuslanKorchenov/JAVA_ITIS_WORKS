package com.company;


public class Bike extends Transport{
    private int wheels;
    public Bike(int number, int wheels, int speed) {
        super(number, speed);

        if(wheels >=2 && wheels <=4){
            this.wheels = wheels;
        }
    }

    public int getWheels() {
        return wheels;
    }
}
