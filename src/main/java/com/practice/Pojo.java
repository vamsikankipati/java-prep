package com.practice;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pojo implements Comparable {

    private int field;

    @Override
    public int compareTo(Object object) {
        return 0;
    }

    public static void callThisMethod() {
        try (FileReader file = new FileReader("C:/Documents/repos");
             BufferedReader bufferedReader = new BufferedReader(file)) {
            bufferedReader.readLine();
        } catch (IOException IOException) {
            throw new Error();
        }
    }
}
