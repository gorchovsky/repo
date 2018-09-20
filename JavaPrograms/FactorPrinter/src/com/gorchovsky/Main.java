package com.gorchovsky;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static final String INVALID_VALUE="Invalid Value";
    public static void printFactors(int number) {

        if(!(number>=1)) {
            System.out.println(INVALID_VALUE);
        }

        int i=1;
        while(i<=number) {
            if(number%i==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
