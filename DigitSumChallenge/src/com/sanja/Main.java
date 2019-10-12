package com.sanja;

public class Main {

    public static void main(String[] args) {
        //System.out.println(1%10);
        System.out.println(sumDigits(121));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(-12));
        //sumDigits(12);
    }
    public static int sumDigits(int number){
        int digits = 0;
        int sumOfDigits = 0;
        if ( number > 0 && number>= 10 ){
            do{
                digits = number % 10;
                sumOfDigits = sumOfDigits+digits;
                //System.out.println("======"+sumOfDigits);
                number = number /10;
                //System.out.println("--------"+number);
            }while (number >0);
        }else {
            return -1;
        }
        return sumOfDigits;

    }
}
