package com.github.dailycodingproblem.hard;

import java.util.Arrays;

public class Problem_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray()));
    }

    private static int[] getArray() {
        int N = 5;
        int[] input = {1,2,3,4,5};
        int[] output = new int[5];

        int p = 1;

        for(int i = 0; i < N; i++) {
            output[i] = p;
            p *= input[i];
        }

        p = 1;

        for(int i = N -1; i >= 0; i--) {
            output[i] *= p;
            p *= input[i];
        }

        return output;
    }
}
