package com.hbdriod.kata;

import java.util.StringTokenizer;

/**
 * Created by SOEOSSA on 27/09/2016.
 */

public class StringCalculator {

    public StringCalculator() {
    }

    static int add(String myString) {

        int valeurRetour = 0;
        StringTokenizer stringTokenizer;

        if (myString.length()>=2){
            if (myString.substring(0, 2).equals("//")) {
                String stringDelimiter = new String(myString.substring(2, 3));
                stringTokenizer = new StringTokenizer(myString.substring(4), stringDelimiter);
            } else {
                stringTokenizer = new StringTokenizer(myString, ",\n");
            }
        } else {
            stringTokenizer = new StringTokenizer(myString, ",\n");
        }


        while (stringTokenizer.hasMoreTokens()) {
            valeurRetour += Integer.valueOf(stringTokenizer.nextToken());
        }

        return valeurRetour;
    }
}
