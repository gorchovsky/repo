package com.gorchovsky;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int sumFirstAndLastDigit(int number){
        int lastDigit, firstDigit;
        if(number >= 0){
            lastDigit = number % 10;
            while(number / 10 >= 1) {
                number = number / 10;
            }
            firstDigit = number;
            return firstDigit + lastDigit;
        }   return -1;
    }


}
