package com.stackroute.unittest.pe1;
/*Create a program that accepts a word as input and checks for each single character letter in the word whether it is a consonant or vowel.
Condition:
    a. Print an error message if the input is not a letter
    b. If the input having more than one letter, print the required output
          (Vowel or Consonant) for each letter*/
import java.util.Scanner;

public class VowelAndConsonants {
    public static String checkVowelAndConsonants(char ch)
    {
        int i;
        if(!Character.toString(ch).matches ("[a-zA-Z]"))
        {
            System.out.println("Error! Input provided is not alphabet");
        }
        else
        {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                return "vowel";
            }
            else
            {
                return "consonant";
            }
        }
        return "invalid";
    }
    public static void printVowelConsonants(String word)
    {
        int i;
        for(i=0;i<word.length();i++)
        {
            System.out.println(word.charAt(i) + "-" + checkVowelAndConsonants(word.charAt(i)));
        }
    }
    public static void main(String args[])
    {
        int i;
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        printVowelConsonants(word);
    }
}
