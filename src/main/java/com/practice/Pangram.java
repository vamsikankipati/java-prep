package com.practice;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

    private static final String input = "The quick brown fox jumps over the lazy dog.";
    public boolean check(String sentence) {
        Set<Character> uniqueAlphabets = new HashSet<>();
        char[] sentenceArray = sentence.toCharArray();
        for (char c : sentenceArray) {
            if (Character.valueOf(c).toString().toUpperCase().matches("[A-Z]+")) {
                uniqueAlphabets.add(Character.toUpperCase(Character.valueOf(c)));
            }
        }
        if (uniqueAlphabets.size() == 26) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Pangram p = new Pangram();
        p.check(input);
    }
}