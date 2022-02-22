package com.blz.basicprograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year number in four digits :- ");
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("Entered year is a leap year");
        } else {
            System.out.println("Entered year is not a leap year");
        }
    }
}
