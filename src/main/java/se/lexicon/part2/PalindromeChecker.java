package se.lexicon.part2;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        StringBuilder reversed = new StringBuilder(word);
        reversed.reverse();
        String finalReversed = reversed.toString();

        if (word.equalsIgnoreCase(finalReversed)){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }

        input.close();
    }
}
