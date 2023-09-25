// Write a Java program to check whether a number is even or odd using switch case.

import java.util.Scanner;

public class even_odd_switch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1 = sc.nextInt();
        switch(num1%2==0?1:0)
        {
            case 1:
            System.out.println(num1+" is Even");
            break;
            case 0:
            System.out.println(num1+" is odd");
            break;
        }

    }
    
}
