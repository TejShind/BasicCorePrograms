package com.blz.basicprograms;

import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter dividend number");
        int dividend = input.nextInt();
        System.out.println("Enter divisor number");
        int divisor = input.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient is = " + quotient);
        System.out.println("Remainder is = " + remainder);
    }
}
