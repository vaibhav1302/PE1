package com.stackroute.unittest.pe1;
/*Write a program which accepts a number as input from user and perform the following:
a. sort the number in non-increasing order
b. after sorting sum all the even numbers, the sum should be greater than 15 .
c. if sum is more than 15,then print output as true or false.*/
import java.util.Arrays;
import java.util.Scanner;

public class SortAndSum
{
    public static String reverseStr(String str)
    {
        int i;
        char tempArray[] = str.toCharArray();
        Arrays.sort(tempArray);
        String rev = "";
        for(i=tempArray.length-1; i>=0; i--)
        {
            rev = rev + (tempArray[i]);
        }
        System.out.println("Sorted number in non-increasing order : " + rev);
        return rev;
    }
    public static int CalculateSum(String str)
    {
        int i, sum = 0;
        char tempArray[] = str.toCharArray();
        Arrays.sort(tempArray);
        String rev = "";
        for(i=tempArray.length-1; i>=0; i--)
        {
            if(Character.getNumericValue(tempArray[i])%2 == 0)
            {
                sum = sum + Character.getNumericValue(tempArray[i]);
            }
        }
        System.out.println("Sum of even numbers : " + sum);
        return sum;
    }
    public static boolean checkSum(int sum)
    {
        if(sum > 15)
        {
            System.out.println("True");
            return true;
        }
        else
        {
            System.out.println("False");
            return false;
        }
    }
    public static void main(String args[])
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.matches("[0-9]+"))
        {
            reverseStr(str);
            sum = CalculateSum(str);
            checkSum(sum);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
