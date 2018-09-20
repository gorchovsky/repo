package com.gorchovsky;

public class Main {

    public static void main(String[] args) {

    }

    public static int getLargestPrime(int number) {
        int x = number;
        if (number <= 0) {
            return -1;
        }
        for (int i = 2; i <= number; i ++) {   // i=2 since "2" is the lowest prime number
            if (x % i == 0) {
                do {
                    x = x / i;
                } while (x % i == 0);
            }
            if (x == 1) {
                return i;
            }
        }
        return -1;
    }


}
