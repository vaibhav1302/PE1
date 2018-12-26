package com.stackroute.unittest.pe1;
/*Write a program that takes a character from the user as input and determines whether the character entered
is a capital letter, a small case letter, a digit or a special symbol and display appropriately.*/
import java.util.Scanner;

public class CharacterCheck {
    public static String checkChar(String c)
    {
        if(c.length() == 1)
        {
            if(c.matches("[a-z]"))
            {
                System.out.println("Small letter");
                return "Small letter";
            }
            else if(c.matches("[A-Z]"))
            {
                System.out.println("Capital letter");
                return "Capital letter";
            }
            else if(c.matches("[0-9]"))
            {
                System.out.println("Digit");
                return "Digit";
            }
            else
            {
                System.out.println("Special Character");
                return "Special Character";
            }
        }
        else
        {
            System.out.println("Error! Length greater than 1");
            return "Error";
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        checkChar(c);
    }
}
