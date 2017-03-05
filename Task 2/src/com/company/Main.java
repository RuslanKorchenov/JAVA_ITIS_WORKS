package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[100];
        Random random = new Random();
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 6){
                num++;
            }
        }
        System.out.println("Чисел, с порядковым номером оканчивающийся на 6 : " + num);
    }
}
