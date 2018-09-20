package com.gorchovsky;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit (int number1, int number2, int number3){
        if ((number1 < 10 || number1 > 1000) || (number2 < 10 || number2 > 1000) || (number3 < 10 || number3 > 1000)){
            return false;
        }
        int lastDigitNumber1 = number1 % 10;
        int lastDigitNumber2 = number2 % 10;
        int lastDigitNumber3 = number3 % 10;
        if ((lastDigitNumber1 == lastDigitNumber2) || (lastDigitNumber1 == lastDigitNumber3) ||
                (lastDigitNumber2 == lastDigitNumber3)){
            return true;
        }
        else return false;
    }
}
