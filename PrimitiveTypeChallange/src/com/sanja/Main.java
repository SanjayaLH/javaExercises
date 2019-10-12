package com.sanja;

public class Main {

    public static void main(String[] args) {
        byte valByte = 2;
        short valShort = 2;
        int valInt = 2;
        long valLong = 50000L + (valByte + valShort + valInt)* 10L;
        System.out.println(valLong);

        short totalShort = (short) (1000 + 10*(valByte + valShort + valInt));
        System.out.println(totalShort);
    }
}
