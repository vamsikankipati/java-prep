package com.practice;

public class MaximumSubArray {
    private static final int[] INPUT = {18, 3, 4, 10, 0, 5, 11, 9, 1, 7};
    public int maxSubArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int partialSum = 0;
                for (int k = i; k < j; k++) {
                    partialSum += arr[i];
                }
                if (partialSum > sum) {
                    sum = partialSum;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        MaximumSubArray m = new MaximumSubArray();
        System.out.println("Output: " + m.maxSubArraySum(INPUT));
    }
}
