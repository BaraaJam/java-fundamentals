package se.lexicon.part2;

import java.util.Scanner;

public class WordReverser {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter a Word: ");
        String word = input.next();

        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord.reverse();

        System.out.println("Reversed: " + reversedWord);

        input.close();
    }
}
