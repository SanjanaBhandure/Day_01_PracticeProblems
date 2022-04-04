/*Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
So ensure to check for the same. Further, the Leap Year is a Year divisible by 4 and not 100 unless
it is divisible by 400. For e.g. 1800 is not a Leap Year and 2000 is a Leap Year.*/
package Bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        //scanner class declaration
        Scanner sc = new Scanner(System.in);
        //input year from user
        System.out.println("Enter a Year: ");
        int year = sc.nextInt();
        //condition for checking year entered by user is a leap year or not
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year+ " is a leap year");
        else
            System.out.println(year+ " is not a leap year");
    }
}