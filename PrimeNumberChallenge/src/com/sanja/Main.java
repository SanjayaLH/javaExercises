package com.sanja;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        for(int i=0; i<50; i++){
            if (isPrime(i)){
                count++;
                System.out.println(i+ " is a prime number and it is a "+ count);
                if(count == 20){
                    System.out.println("Exiting the fro loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for (int i=2; i<=n/2 ; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
