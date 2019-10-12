package com.sanja;

public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number > 0) {
            int remainder = number % 2;
            if (remainder == 1) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && end > 0 && start <= end) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }

        } else {
            return -1;
        }
        return sum;
    }


}

