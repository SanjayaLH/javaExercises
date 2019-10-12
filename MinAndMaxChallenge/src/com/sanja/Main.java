package com.sanja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = 0;
        int max  = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter number:");
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                int number = scanner.nextInt();
                //max = number;
                if (number > max){
                    max = number;
                }else if ((number < min) || (number < max) && (number < min)){
                    min = number;
                }else {
                    continue;
                }
            }else {
                System.out.println("Invalid number:");
                break;
            }
            scanner.nextLine();// handle next line character (enter key)
        }
        System.out.println("Min number is = "+min);
        System.out.println("Max number is = "+max);
        scanner.close();
    }
}
