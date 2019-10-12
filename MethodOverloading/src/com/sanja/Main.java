package com.sanja;

public class Main {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(6, 13);
        System.out.println("centimeters " + centimeters);
        centimeters = calcFeetAndInchesToCentimeters(-1);
        System.out.println("centimeters " + centimeters);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            //double feetToInch = feet * 12;
            double feetToCm = feet * 12 * 2.54d;
            System.out.println("feetToCm " + feetToCm);
            double inchToCm = inches * 2.54d;
            System.out.println("inchToCm " + inchToCm);
            return feetToCm + inchToCm;

        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
           double feet = Math.round(inches / 12);
           double remainingInches = inches % 12;
           return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }
}
