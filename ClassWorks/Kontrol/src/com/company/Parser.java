package com.company;


public class Parser {
    public static int parceInt(char number[]){

      int fullResult = 0;
      for (int i = 0; i < number.length; i++){
          fullResult = (int) (fullResult + ((int)number[i] - '0') * Math.pow(10, number.length - (i+1)));
      }
        return fullResult;
    }
}
