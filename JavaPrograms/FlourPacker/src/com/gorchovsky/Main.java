package com.gorchovsky;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0) {
            return false;
        }
        while (goal>= 5 && bigCount > 0) {
            goal -= 5;
            bigCount--;
        }
        while (goal > 0 && smallCount > 0) {
            goal--;
            smallCount--;
        }
        return (goal == 0);
    }


}
