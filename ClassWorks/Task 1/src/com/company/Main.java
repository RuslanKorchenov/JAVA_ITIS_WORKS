package com.company;

public class Main {

    public static void main(String[] args) {

        int a[] = new int[7];
        a[0] = 6;
        a[1] = -6;
        a[2] = -3;
        a[3] = 4;
        a[4] = 5;



        for (int i = 0; i < a.length; i++){
            int temp = a[i + 4];
            a[i + 4] = a[i + 3];
            a[i + 5] = temp;

            }
            a[2] = 7;
            for (int i = 0; i < a.length; i++){
                System.out.println(a[i]);
            }
        }
    }

