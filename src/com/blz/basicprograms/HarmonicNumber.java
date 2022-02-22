package com.blz.basicprograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Harmonic value N :-  ");
        int num = input.nextInt();
        int i = 1;
        double division = 0.00, nthHarmonicValue = 0, store = 0;
        while (i <= num) {
            division = (double) 1 / i;
            System.out.println(division + ", ");
            store = +store + division;
            nthHarmonicValue = +nthHarmonicValue + store;
            i++;
        }
        System.out.print("\nEnter number Harmonic value is " + nthHarmonicValue);
    }

}
