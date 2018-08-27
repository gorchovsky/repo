package com.gorchovsky;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myInValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);




        double poundsQuant = 200d;
        double myKilos = 0.45359237d * poundsQuant;
        System.out.println("I have " + myKilos + " kilograms");

    }
}
