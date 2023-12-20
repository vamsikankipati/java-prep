package com.algorithms;

public class EuclidsAlgorithm {
    public static void main(String[] args) {
        EuclidsAlgorithm algo = new EuclidsAlgorithm();
        long startTime = System.currentTimeMillis();

        System.out.println("Output: " + algo.gcd(376346363, 253436656));

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total running time: " + totalTime);
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        int c = a % b;
        return gcd(b, c);
    }
}
