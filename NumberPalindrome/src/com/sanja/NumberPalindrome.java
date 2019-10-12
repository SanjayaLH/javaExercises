package com.sanja;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;
        if (number >= 0){
            do {
                lastDigit = number%10;
                reverse = reverse*10;
                reverse = reverse+lastDigit;
                number = number/10;
                System.out.println(reverse);
            }while (number >0);

        }else{
            return false;
        }
        return true;
    }
}
