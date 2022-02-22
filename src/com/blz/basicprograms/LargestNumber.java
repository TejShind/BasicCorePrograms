package com.blz.basicprograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        int first, second, third;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First number:");
        first = s.nextInt();
        System.out.println("Enter the Second number:");
        second = s.nextInt();
        System.out.println("Enter the Third number:");
        third = s.nextInt();
        if (first > second && first > third) {
            System.out.println("Largest number is :" + first);
        } else if (second > third) {
            System.out.println("Largest number is :" + second);
        } else {
            System.out.println("Largest number is :" + third);
        }

    }
}