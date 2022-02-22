package com.blz.basicprograms;

import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String[] args) {
        int NUM = 0;
        System.out.println(" Enter a number to check even or odd : ");
        Scanner input = new Scanner(System.in);
        NUM = input.nextInt();
        if (NUM % 2 == 0)
            System.out.println("Enter number is Even ");
        else
            System.out.println("Enter number is Odd ");
    }
}
