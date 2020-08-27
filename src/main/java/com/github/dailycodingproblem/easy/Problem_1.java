package com.github.dailycodingproblem.easy;

import java.util.HashSet;
import java.util.Set;

public class Problem_1 {
    public static void main(String[] args) {
        System.out.println(checkSum());
    }

    private static boolean checkSum() {
        int[] input = {10,15,3,7};
        int k = 25;

        Set<Integer> set = new HashSet<>();

        for(int x : input) {
            if(set.contains(x))
                return true;
            set.add(k - x);
        }

        return false;
    }
}
