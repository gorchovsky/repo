package com.gorchovsky;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean isPerfectNumber (int number){
        int i = 1;
        int sum = 0;
        if (number > 0){
            while (i != number){
                if ((number % i) == 0)
                    sum += i;
                i++;
            } if (sum == number){
                return true;
            }
        } return false;
    }

}
