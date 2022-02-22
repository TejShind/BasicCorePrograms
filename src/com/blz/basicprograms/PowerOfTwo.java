package com.blz.basicprograms;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value to print power of 2");
        int N = input.nextInt();
        if (N >= 0 && N <= 30) {
            for (int i = 0; i <= N; i++) {
                int power = (int) (Math.pow(2, i));
                System.out.println("2 power " + i + " is " + power);
            }
        } else

            System.out.println("Please Enter value of N from 0 to 30");
    }
}

