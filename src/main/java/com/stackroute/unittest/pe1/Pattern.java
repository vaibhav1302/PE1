package com.stackroute.unittest.pe1;
/*Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 . . . nth iteration.*/
import java.util.Scanner;

public class Pattern {
    public static String printPattern(int n)
    {
        int i;
        String ans = "";
        for(i=1;i<=n;i++)
        {
            int j = i;
            while(j != 0)
            {
                System.out.println(i+" ");
                ans = ans + i;
                j--;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
}
