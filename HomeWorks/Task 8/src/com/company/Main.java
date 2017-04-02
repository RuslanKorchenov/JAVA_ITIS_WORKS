package com.company;

public class Main {

    public static void main(String[] args) {
        char array[] = "Hello".toCharArray();
        char newArray[] = "ell".toCharArray();

        System.out.println(searchElement(array, newArray));
    }

    private static int searchElement(char[] array, char[] newArray){
        int coincidenceElement = -1;

        for (int i = 0; i < array.length; i++){
            if (array[i] == newArray[0]) {
                for (int j = i; j < newArray.length; j++){
                    if (array[j] == newArray[j - i]) {
                        coincidenceElement = i;
                    }
                }
            }

        }
        return (coincidenceElement);
    }
}
