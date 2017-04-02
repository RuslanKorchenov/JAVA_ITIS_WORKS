package com.company;

        import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[20];
        Random random = new Random();
        int max = 0;
        int min = 50;
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(50);
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println();
        System.out.println("Минимальное число массива : " + min + " Максимальное число массива : " + max);
    }
}
