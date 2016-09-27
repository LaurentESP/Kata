package com.hbdriod.kata;

/**
 * Created by SOEOSSA on 27/09/2016.
 */

public class StringCalculator {

    public StringCalculator() {
    }

    static int add(String myString){
        if (myString.isEmpty()){
            return 0;
        } else {
            return Integer.valueOf(myString);
        }
    }
}
