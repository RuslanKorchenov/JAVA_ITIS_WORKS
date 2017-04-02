package com.company;


import java.util.Objects;

public class MyString {
    private char array[];

    public MyString(char[] value) {
        this.array = array;
    }

    public char[] getArray() {
        return array;
    }

    public boolean equals(Object object){
        if(object instanceof MyString){
            char arrayThat[] = ((MyString)object).array;
        }
        MyString
    }
}
