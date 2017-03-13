package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[10];
        Random random = new Random();
        int sum = 0;
        int cont = 1;
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
    }
    for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                sum = array[i] + sum;
            }else{
                cont = array[i] * cont;
            }
    }
        for(int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println();
        System.out.println("Произведение нечетных : " + cont + " Сумма четных : " + sum);
    }
}
