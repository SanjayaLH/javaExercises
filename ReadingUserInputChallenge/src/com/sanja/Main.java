package com.sanja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (counter < 10) {
            counter++;
            System.out.println("Enter number #" + counter+":");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid number");
                counter--;
            }
            scanner.nextLine();// handle next line character (enter key)
        }
        System.out.println("Sum is = "+sum);
        scanner.close();



    }
}
