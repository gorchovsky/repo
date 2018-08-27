package com.gorchovsky;

public class Main {

    public static void main(String[] args) {
        /*int newScore = calculateScore("Goro", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();*/

        calcFeetAndInchesToCentimeter(-1,5);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }


    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {

        if((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        } else {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feets and " + inches + " inches equals " + centimeters + " centimeters");
        }
        return 0;
    }



}
