package com.gorchovsky;

public class Main {

    public static void main(String[] args) {
        isLeapYear(1600);
    }

    public static boolean isLeapYear(int year){
        if((year <= 0 ) || (year > 9999)){
            return false;
        }
        if(((year %4 == 0) && (year%100 != 0)) || (year %400 == 0)){
            return true;
        }else{
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        int answer = 0;
        if(((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))){
            return -1;
        }

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                answer = 31;
                break;
            case 2:
                if(!isLeapYear(year) || (year == 1900)){
                    answer = 28;
                }else{
                    answer = 29;
                }

                break;
            case 4: case 6: case 9: case 11:
                answer = 30;
                break;
            default:
                answer = -1;
                break;
        }
        return answer;
    }


}
