package com.javabasics;

import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        Random rGen = new Random();
        int randomNumber = rGen.nextInt(0, 13);
        System.out.println("Random Number : " + randomNumber);
    }
}
