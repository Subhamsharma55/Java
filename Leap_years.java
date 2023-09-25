//Write a Java   program to check whether a year is  year or not.

import java.util.*;

public class Leap_years {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the any years");
        int year= sc.nextInt();
        if(year %4==0){
        System.out.println("it is a  year");
        }
         if(year%100==0){
        System.out.println("not a  year");
        }
          if(year%400==0){
            System.out.println("it is  year");
          }
        else{
            System.out.println("it is not a  year");
        }  
        }
    }
    

