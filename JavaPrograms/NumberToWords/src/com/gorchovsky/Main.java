package com.gorchovsky;

public class Main {

    public static void main(String[] args) {

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int iteration = getDigitCount(number);
            number = reverse(number);
            while (iteration > 0) {
                int digit = number % 10;
                iteration--;
                number /= 10;
                switch (digit) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Zero");
                        break;
                }
            }
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int currentDigit = number % 10;
            number /= 10;
            reversedNumber = (reversedNumber * 10) + currentDigit;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else {
            int digitCount = 0;
            do {
                digitCount++;
                number /= 10;
            } while (number > 0);
            return digitCount;
        }
    }

}
