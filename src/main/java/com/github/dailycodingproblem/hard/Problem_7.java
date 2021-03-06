package com.github.dailycodingproblem.hard;

import org.apache.commons.lang3.StringUtils;

public class Problem_7 {
    public static void main(String[] args) {
        String code = "1111";
        if(isDecodable(code)) {
            System.out.println( countDecoding(code.toCharArray(),code.length()));
        }
    }

    private static boolean isDecodable(String message) {
        if (!StringUtils.isNumeric(message))
            return false;

        char[] stringToArray = message.toCharArray();

        return stringToArray[0] != '0';
    }

    private static int countDecoding(char[] message, int n) {
        int count = 0;

        if(n == 1 || n == 0) {
            return 1;
        }

        if(message[n - 1] > '0')
            count = countDecoding(message,n - 1);

        if(message[n - 2] == '1' || message[n - 2] == '2' && message[n - 1] <= '6')
            count += countDecoding(message, n - 2);

        return count;
    }



}
