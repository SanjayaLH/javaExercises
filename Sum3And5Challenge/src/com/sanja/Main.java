package com.sanja;

public class Main {

    public static void main(String[] args) {

        int counter = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                counter++;
                sum = sum + i;
                System.out.println("Found number = " + i);
                System.out.println("Counter = " + counter);
            }
            if (counter == 5) {
                break;
            }
        }
        System.out.println("The sum is = " + sum);
    }
}


