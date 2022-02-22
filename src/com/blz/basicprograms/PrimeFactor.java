package com.blz.basicprograms;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to print its prime factors");
        int N = input.nextInt();
        //PrimeFactors(N);
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                int prime = 1;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        prime = 0;
                        break;
                    }
                }
                if (prime == 1) {
                    System.out.println(i + " ");
                }

            }
        }
    }
}
