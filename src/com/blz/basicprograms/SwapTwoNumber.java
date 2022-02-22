package com.blz.basicprograms;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Enter the first number");
        int num1 = input.nextInt();
        System.out.println("\n Enter the second number");
        int num2 = input.nextInt();
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("\nAfter Swapping :  ");
        System.out.println("\nFirst number is " + num1 + " and Second number is " + num2 + "");
    }
}