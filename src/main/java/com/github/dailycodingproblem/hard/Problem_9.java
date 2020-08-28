package com.github.dailycodingproblem.hard;

public class Problem_9 {
    public static void main(String[] args) {
        int[] input = {5,5,10,100,15,5};
        System.out.println(getMaxSum(input));
    }

    private static int getMaxSum(int[] input) {
        int incl = input[0];
        int excl = 0;

        for(int i = 1; i< input.length; i++) {
            int excl_new = Math.max(incl, excl);
            incl = excl + input[i];
            excl = excl_new;
        }

        return Math.max(incl, excl);
    }
}
