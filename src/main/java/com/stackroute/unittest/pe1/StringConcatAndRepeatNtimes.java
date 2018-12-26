package com.stackroute.unittest.pe1;
/*Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value,
 the last n characters should repeat n number of times in the output String.*/
import java.util.Scanner;

public class StringConcatAndRepeatNtimes
{
    public static String repeatStr(String str, int num)
    {
        int i;
        String str1 = str.substring(str.length()-num);
        String finalStr = "";
        for(i=0;i<num;i++)
        {
            finalStr = finalStr + str1;
        }
        str = str + finalStr;
        System.out.println(str);
        return str;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        repeatStr(str,num);
    }
}
