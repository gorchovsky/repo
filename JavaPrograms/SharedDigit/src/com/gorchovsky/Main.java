package com.gorchovsky;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasSharedDigit(int first, int second)
    {
        if(first <= 10 || second <= 10 || first >= 99 || second >= 99)
            return false;
        int quot1, quot2, rem;
        while(first > 0)
        {
            quot1 = first % 10;
            rem = second;
            while(rem > 0)
            {
                quot2 = rem % 10;
                System.out.println("quot1 :" + quot1 + " and quot2 :" + quot2);
                if(quot1 == quot2)
                {
                    return true;
                }
                rem = rem / 10;
            }
            first = first / 10;
        }
        return false;
    }

}
