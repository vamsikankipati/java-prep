package com.interview.faangquestions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static String longestSubStringWithoutCharacterRepetition(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        int start = 0;
        Set<Character> set = new HashSet<>();
        while(j < s.length()) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                if(j - i > max) {
                    max = j - i;
                    start = i;
                }
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return s.substring(start, start + max);
    }

    public static void main(String[] args) {
        System.out.println(longestSubStringWithoutCharacterRepetition("abcabcbb"));
    }
}
