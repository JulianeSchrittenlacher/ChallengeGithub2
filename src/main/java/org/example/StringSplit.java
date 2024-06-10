package org.example;

import java.util.Arrays;

public class StringSplit {
    public static String[] solution(String s) {

        if ( s.length() % 2 == 0) {
            String[] resEven = new String[s.length()/2];
            for (int i = 0; i < resEven.length; i++) {
                resEven[i] = s.substring(i*2, i*2+2);
            }
            return resEven;
        }

        String[] resOdd = new String[(s.length()/2)+1];
        for (int i = 0; i < resOdd.length-1; i++) {
            resOdd[i] = s.substring(i*2, i*2+2);
        }
        resOdd[resOdd.length-1] = s.substring(s.length()-1) + "_";
        return resOdd;



    }
}
