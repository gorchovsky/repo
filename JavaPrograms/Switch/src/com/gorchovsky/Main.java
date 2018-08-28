package com.gorchovsky;

public class Main {

    public static void main(String[] args) {
        /*int value = 3;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }*/


        int switchValue = 6;

        switch(switchValue)

        {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }






        char switchStatement = 'Z';


        switch(switchStatement)
        {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Char found!");
                break;

            default:
                System.out.println("Not found");
                break;
        }


        String month = "APrIL";
        switch(month.toLowerCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "april":
                System.out.println("Apr");
                break;
            default:
                System.out.println("Not sure");
        }



    }
}
