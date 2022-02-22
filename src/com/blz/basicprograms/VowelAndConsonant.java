package com.blz.basicprograms;
import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character to check it is Vowel or Consonant :");
        char character = (char) input.next().toLowerCase().charAt(0);
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Entered character is a Vowel");
                break;
            default:
                System.out.println("Entered character is a Consonant");
        }
    }
}
