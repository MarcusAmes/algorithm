package com.galvanize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Algorithm {
    public boolean allEqual(String input) {
        boolean isEqual = true;
        if (input.length() <= 0) {
            isEqual = false;
        }
        ArrayList<String> letters = new ArrayList<>(Arrays.asList(input.toLowerCase().split("")));
        String firstLetter = letters.get(0);
        for (String letter : letters) {
            if(!firstLetter.equals(letter)) {
                isEqual = false;
            }
        }
        return isEqual;
    }

    public HashMap<String, Integer> letterCount(String input) {
        HashMap<String, Integer> lettersC = new HashMap<>();
        if(input.length() <= 0) {
            return lettersC;
        }
        ArrayList<String> letters = new ArrayList<>(Arrays.asList(input.toLowerCase().split("")));
        letters.forEach(letter -> lettersC.put(letter, lettersC.getOrDefault(letter, 0) + 1));
        return lettersC;
    }

    public String interleave(String[] a1, String[] a2) {
        String acc = "";
        for (int i = 0; i < a1.length; i++) {
            acc += a1[i] + a2[i];
        }
        return acc;
    }
}
