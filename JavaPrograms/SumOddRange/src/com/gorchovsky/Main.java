package com.gorchovsky;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isOdd(int number) {
        if(number > 0) {
            if(number % 2 != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end >= start && (start > 0 && end > 0)) {
            for (int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    sum = sum + i;
                }
            }
            return sum;
        }
        return -1;
    }
}
