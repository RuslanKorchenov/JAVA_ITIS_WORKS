package com.company;

import java.util.Random;

public class Main {

    public static void trade(int array[]) {
        int max = 0;
        int imax = 0;
        int min = 25;
        int imin = 25;

        for (int i = 0; i < array.length; i++){
            if (max < array[i]){
                max  = array[i];
                imax = i;
            }
            if (min > array[i]){
                min = array[i];
                imin = i;
            }
            int temp = array[imax];
            array[imax] = array[imin];
            array[imin] = temp;

        }

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

/*
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array )
            }
        }
*/
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}