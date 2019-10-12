package com.sanja;

public class Main {

    public static void main(String[] args) {
        for(int interestRate = 2; interestRate <= 8; interestRate++) {
            System.out.println("Value is = "+String.format("%.2f", calculateInterest(10000d, interestRate)));
        }
        for(int interestRate = 8; interestRate >= 2; interestRate--) {
            System.out.println("Value from 8% to 2% is = "+String.format("%.2f", calculateInterest(10000d, interestRate)));
        }
    }

    private static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));

        }

}
