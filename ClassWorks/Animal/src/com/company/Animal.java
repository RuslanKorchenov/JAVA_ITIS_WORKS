package com.company;

/**
 * Created by rusel on 22.03.2017.
 */
public class Animal {
    private int weight;
    private int height;


    public Animal(int weight, int height) {
        if (weight >= 0) {
            this.weight = weight;
        }
        if (height >= 0) {
            this.height = height;
        }
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void feed(int feedCount){
        
    }

}
