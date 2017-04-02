package com.company;


public class CharSequence implements Comaparable{
    private char sequence[];

    public CharSequence(char[] sequence) {
        this.sequence = sequence;

    }

    @Override
    public int toCompare(Object object) {
        char aSequence[] = this.sequence;
        char bSequence[] = ((CharSequence)object).sequence;
        int minLength = Math.min(aSequence.length, bSequence.length);

        for (int i = 0; i < minLength; i++){
            if (aSequence[i] > bSequence[i]){
                return aSequence[i] - bSequence[i];
            } else if (aSequence[i] > bSequence[i]){
                return aSequence[i] - bSequence[i];
            }
        }
        return 0;
    }
}
