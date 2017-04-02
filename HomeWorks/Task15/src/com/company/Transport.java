package com.company;


import com.sun.org.apache.xpath.internal.SourceTree;

public abstract class Transport {

    protected int number;
    protected int speed;
    public Transport(int number, int speed) {
        if (number == 3) {
            this.number = number;
        }
        if (speed >= 0){
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getNumber() {
        return number;
    }

    public void go(int Go){
        if (speed == 0){
            this.speed = this.speed + Go;
        } else {
            System.out.println("Транспорт уже едет!");
        }
    }
    public void parking(){
        if (speed > 0) {
            this.speed = 0;
        } else {
            System.out.println("Транспорт уже стоит на парковке!");
        }
    }
}
