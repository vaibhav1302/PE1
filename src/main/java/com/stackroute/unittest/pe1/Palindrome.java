package com.stackroute.unittest.pe1;
/*Write a program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then
        a. Add all the even numbers and check whether the sum is more than 25.
        b. Print success and failure messages for all 3 conditions*/
import java.util.Scanner;

public class Palindrome
{
    public static boolean checkSumOfEven(String numAsString)
    {
        int i, sum = 0;
        for(i=0; i<numAsString.length(); i++)
        {
            if (Character.getNumericValue(numAsString.charAt(i)) % 2 == 0)
            {
                sum = sum + Character.getNumericValue(numAsString.charAt(i));
            }
        }
        if(sum > 25)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean checkPalindrome(String numAsString)
    {
        int i, flag = 0;
        for(i=0; i<numAsString.length(); i++)
        {
            if(numAsString.charAt(i) != numAsString.charAt(numAsString.length() - (i+1)))
            {
                flag = 1;
            }
        }
        if(flag == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.matches("[0-9]+"))
        {
            if(checkPalindrome(str))
            {
                System.out.println("Success! It is a palindrome");
            }
            else{
                System.out.println("Failure! Not a palindrome");
            }
            if(checkSumOfEven(str))
            {
                System.out.println("Sum is greater than 25");
            }
            else
            {
                System.out.println("Sum is less than 25");
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}