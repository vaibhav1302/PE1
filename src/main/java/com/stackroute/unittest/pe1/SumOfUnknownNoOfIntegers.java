package com.stackroute.unittest.pe1;
/*Write a program that reads an unspecified number of integer arguments using Scanner Class and adds them together.
The program should display total of the given input number and should only consider integer value.
The program should display an error message if there are any non integer values*/
import java.util.Scanner;

public class SumOfUnknownNoOfIntegers {
    public static int checkSum(String str)
    {
        String[] arrOfStr = str.split(" ");
        int sum = 0;
        for (String a : arrOfStr)
        {
            if(a.matches("[0-9]+"))
            {
                sum = sum + Integer.parseInt(a);
            }
            else{
                System.out.println(a + "- not a number");
            }
        }
        System.out.println("sum : " + sum);
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        checkSum(str);
    }
}
