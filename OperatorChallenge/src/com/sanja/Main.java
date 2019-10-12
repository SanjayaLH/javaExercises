package com.sanja;

public class Main {

    public static void main(String[] args) {
        double varOne = 20d;
        double varTwo = 80d;
        double varThree = (varOne + varTwo)*100d;
        System.out.println("varThree = "+varThree);

        double remainder = varThree % 40d;
        System.out.println("remainder ="+remainder);

        boolean varBoolean = (remainder == 0) ? true : false;
        System.out.println("varBoolean ="+varBoolean);

        if(varBoolean == false){
            System.out.println("Got some remainder");
        }




    }
}
