package com.stackroute.unittest.pe1;
/*Write a program which accepts an integer number as input from the user and perform the following conditional checks:
        a. Print Tom if number is odd and exists between 20 to 30
        b. Print Jerry, if number is even and exists between 20 and 30*/
import java.util.Scanner;

public class TomAndJerry {
    public static int checkTomJerry(int num)
    {
        if(num >= 20 && num <= 30)
        {
            if(num % 2 != 0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        return 2;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(checkTomJerry(num) == 1)
        {
            System.out.println("Tom");
        }
        else if(checkTomJerry(num) == 0)
        {
            System.out.println("Jerry");
        }
    }
}