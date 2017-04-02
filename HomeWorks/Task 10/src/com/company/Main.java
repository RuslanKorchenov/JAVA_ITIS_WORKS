package com.company;

import java.util.Random;

public class Main {

public static void trade(int array[]){
    int max = 0;
    int min = 25;
    int iMax = -1;
    int iMin = -1;
    for (int i = 0; i < array.length; i++){
        if (array[i] > max) {
            max = array[i];
            iMax = i;
        }
        if (array[i] < min){
            min = array[i];
            iMin = i;
        }
    }
    int temp = array[iMin];
    array[iMin] = array[iMax];
    array[iMax] = temp;

}
    public static void main(String[] args) {
        int array[][];

        array = new int[5][5];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(25);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < array.length; i++){
            trade(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}