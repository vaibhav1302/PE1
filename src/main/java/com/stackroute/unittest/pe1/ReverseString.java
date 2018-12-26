package com.stackroute.unittest.pe1;
/*Write a program to reverse any string without using String Buffer.*/
import java.util.Scanner;

public class ReverseString
{
    public static String revStr(String str)
    {
        int i;
        char tempArray[] = str.toCharArray();
        String rev = "";
        for (i = tempArray.length - 1; i >= 0; i--)
        {
            rev = rev + (tempArray[i]);
        }
        System.out.println(rev);
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        revStr(str);
    }
}
