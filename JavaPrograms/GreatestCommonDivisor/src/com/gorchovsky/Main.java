package com.gorchovsky;

public class Main {

    public static void main(String[] args) {

    }

    public static int getGreatestCommonDivisor(int first, int second) {

        int smallerNumber = 0;
        int biggerNumber = 0;

        if (first >= 10 && second >= 10) {

            if (first > second) {
                biggerNumber = first;
                smallerNumber = second;
            } else if (second > first) {
                biggerNumber = second;
                smallerNumber = first;
            }
            for (int i = smallerNumber; i > 0; i--) {
                if (smallerNumber % i == 0) {
                    for (int j = smallerNumber; j > 0; j--) {
                        if (biggerNumber % j == 0 && i == j) {
                            return j;
                        }
                    }
                }
            }
        } else {
            return -1;
        }
        return -1;
    }
}
