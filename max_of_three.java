// Write a   Java   program to find maximum between three numbers.

import java.util.Scanner;
public class max_of_three {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is the larger number");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is the larger number");
        }
        else
        {
            System.out.println("c is the larger number");
        }
    }
    
}
