package com.github.dailycodingproblem.hard;

import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {
        System.out.println(getNotExistInteger());
    }

    private static int getNotExistInteger() {
        //int[] input = {-3,5,-3,0,5,3,-6,2};
        //int[] input = {3,4,-1,1};
        //int[] input = {1,2,0};
        int[] input = { 0, 10, 2, -10, -20 };

        // 1. APPROACH
        /*Arrays.sort(input);
        int max = input[input.length - 1];
        int[] secondArray = new int[max + 1];

        for(int i = 0; i < input.length; i++) {
            if(input[i] > 0 && input[i] <= max) {
                secondArray[input[i]] = 1;
            }
        }

        for(int i = 1; i < secondArray.length; i++) {
            if(secondArray[i] == 0)
                return i;
        }

        return secondArray.length;*/

        // 2. APPROACH
        // we have set without duplicates and negatives
        // check 3 conditions
        // 1. if first element is equals 1, if not return 1 as the smallest positive
        // 2. if we have array like {1,2} and return max element + 1
        // 3. we search for the smallest element
        Arrays.sort(input);
        int max = input[input.length - 1];

        Set<Integer> noDuplicatesAndNegatives = new HashSet<>();

        for(int x : input) {
            if(x > 0)
                noDuplicatesAndNegatives.add(x);
        }

        int[] secondArray = new int[noDuplicatesAndNegatives.size()];
        int i = 0;
        for(Integer x : noDuplicatesAndNegatives)  {

            //check 1. condition
            if(i == 0 && !x.equals(1))
                return 1;

            //check 3. condition when x is smaller than size we can replace it as negative
            if(x <= noDuplicatesAndNegatives.size()) {
                secondArray[i] = -x;
            }

            i++;
        }

        //we return index of array that equals 0
        for(int j = 0; j < secondArray.length; j++) {
            if(secondArray[j] == 0)
                return j;
        }

        // return in 2. condition
        return max + 1;


    }
}
