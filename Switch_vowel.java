// Write a Java program to check whether an alphabet is vowel or consonant using switch case.

import java.util.Scanner;

public class Switch_vowel {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter A character");
        char alphabet =sc.next().charAt(0);
        switch(alphabet)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println(alphabet+" is Vowel");
            break;
            default:
            System.out.println(alphabet +" is Consonant");
            

        }

    }
    
}
