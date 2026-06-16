package se.lexicon.part2;

import java.util.Scanner;

public class StringStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String vowels = "aeiouAEIOU";
        int vowelsCount = 0;
        int consonantsCount = 0;
        int digitsCount = 0;
        int spacesCount = 0;

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelsCount++;
            } else if (Character.isLetter(ch)) {
                consonantsCount++;
            } else if (Character.isDigit(ch)){
                digitsCount++;
            } else if (Character.isWhitespace(ch)){
                spacesCount++;
            }

        }

        System.out.println("Vowels    : " + vowelsCount);
        System.out.println("Consonants: " + consonantsCount);
        System.out.println("Digits    : " + digitsCount);
        System.out.println("Spaces    : " + spacesCount);

        input.close();
    }
}
