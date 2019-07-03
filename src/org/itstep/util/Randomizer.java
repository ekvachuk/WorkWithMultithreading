package org.itstep.util;

import java.util.Random;

public class Randomizer {

    public static int getRandomNumber(int from, int to) {

        Integer number = from + (new Random().nextInt(to - from));
        return number;

    }

    public static String getRandomString (int length) {
        String text = "";

        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWYUZ0123456789";
        char [] symbol = alphabet.toCharArray();

        for (int i=0; i<length; i++) {
            text += symbol [getRandomNumber(0, symbol.length-1)];
        }



        return text;
    }
}
