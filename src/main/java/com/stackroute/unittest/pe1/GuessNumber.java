package com.stackroute.unittest.pe1;
/*Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 - 100)
User should guess until the the target number is guessed correctly.
Print separate messages for the following:
    a. Number guessed is more than original number
    b. Number guessed is less than original number
    c. Number guessed matches the original number*/
import java.util.Scanner;

public class GuessNumber
{
    public static String guessNum(int num, int limit)
    {
        if(num < limit)
        {
            System.out.println("Number guessed is less than original number");
            return "Number guessed is less than original number";
        }
        else if(num > limit)
        {
            System.out.println("Number guessed is more than original number");
            return "Number guessed is more than original number";
        }
        else
        {
            System.out.println("Number guessed matches the original number");
            return "Number guessed matches the original number";
        }
    }
    public static void main(String args[]) {
        int limit = 77;
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            num = sc.nextInt();
            guessNum(num,limit);
        }
        while (num != limit);
    }
}
