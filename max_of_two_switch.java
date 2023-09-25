// Write a Java program to find maximum between two numbers using switch case.

import java.util.Scanner;

public class max_of_two_switch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number");
        int num2 = sc.nextInt();
        switch(num1>num2?1:0)
        {
            case 1:
            System.out.println(num1+" is greater");
            break;
            
            case 0:
            System.out.println(num2+" is greater");
            break;

        }
    }
    
}
