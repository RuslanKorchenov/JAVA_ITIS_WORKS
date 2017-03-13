package com.company;

import java.util.Random;

public class Main {
    public static void reverse(int array[]) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }
    }

    public static void main(String[] args) {
        int array[][];
        array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(25);
            }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            reverse(array[i]);
            }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        }

        }


