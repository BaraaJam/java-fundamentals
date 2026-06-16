package se.lexicon.part2;

import java.util.Scanner;

public class InitialsGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name (first, optional middle, last — separated by spaces): ");
        String userName = input.nextLine();

        String firstLetter = userName.substring(0, 1).toUpperCase();

        int firstSpace = userName.indexOf(' ');

        int spaceCount = 0;
        for (char ch : userName.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                spaceCount++;
            }
        }

        if (spaceCount >= 2) {

            int secondSpace = userName.indexOf(' ', firstSpace + 1);

            String middleLetter = userName.substring(firstSpace + 1, firstSpace + 2).toUpperCase();
            String lastLetter = userName.substring(secondSpace + 1, secondSpace + 2).toUpperCase();

            System.out.println("Initials: " + firstLetter + "." + middleLetter + "." + lastLetter + ".");
        } else {

            String lastLetter = userName.substring(firstSpace + 1, firstSpace + 2).toUpperCase();

            System.out.println("Initials: " + firstLetter + "." + lastLetter + ".");
        }

        input.close();
    }

}
