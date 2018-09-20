package com.gorchovsky;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int number) {
        int numberCopy = 0, reversedNumber = 0;

        if(number <= -1) {
            number = number * (-1);
        }

        numberCopy = number;

        while(numberCopy > 9) {
            reversedNumber = (reversedNumber * 10) + (numberCopy % 10);
            numberCopy = numberCopy / 10;
        }

        reversedNumber = (reversedNumber * 10) + numberCopy;

        return (number == reversedNumber);
    }

}
