package com.hbdriod.kata;

import java.util.StringTokenizer;

/**
 * Created by SOEOSSA on 27/09/2016.
 */

public class StringCalculator {

    public StringCalculator() {
    }

    static int add(String myString){
        int valeurRetour = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(myString, ",\n");
            while (stringTokenizer.hasMoreTokens()) {
                valeurRetour += Integer.valueOf(stringTokenizer.nextToken());
            }

        return valeurRetour;
    }
}
