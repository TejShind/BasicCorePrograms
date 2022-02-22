package com.blz.basicprograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println(" Enter how many times to flip coin");
        Scanner sc = new Scanner(System.in);
        int HEADS = 0;
        int TAILS = 0;
        int coin = 1;
        int flip = sc.nextInt();
        double PercentageOfHeads, PercentageOfTails;
        while (coin <= flip) {
            double random = Math.random();
            if (random < 0.5) {
                HEADS++;
                System.out.println(" It is HEADS");
            } else {
                TAILS++;
                System.out.println(" It is TAILS");
            }
            coin++;

        }
            System.out.println("Heads flipped " + HEADS + "times and Tails flipped " + TAILS + " times");
            PercentageOfHeads = (double) ((HEADS * 100)/flip);
            PercentageOfTails = 100 - PercentageOfHeads;
            System.out.println("Percentage of Head is " + PercentageOfHeads + "");
            System.out.println("Percentage of Tail is " + PercentageOfTails + "");

        }
    }
