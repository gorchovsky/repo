package com.gorchovsky;

public class Main {

    public static void main(String[] args) {

    }

    public static int getEvenDigitSum(int number) {

        int digit;
        int sum = 0;

        if (number < 0){
            return -1;
        }

        while (number != 0) {

            digit = number % 10;
            number /= 10;

            if (digit % 2 == 0) {
                sum += digit;
            }
        }
        return sum;
    }

}
