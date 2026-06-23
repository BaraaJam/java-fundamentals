package se.lexicon.part3;

import java.util.Scanner;

public class CountByLetter {
    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Alice", "Charlie", "Amanda", "David", "Amy", "Brian"};
        Scanner input = new Scanner(System.in);

        IO.print("Enter a letter: ");
        String letter = input.next().toLowerCase();

        int matchCount = 0;
        for (String name : names){
            if ( name.substring(0, 1).toLowerCase().equals(letter)){
                matchCount++;
            }

        }

        IO.println("There is " + matchCount + " names start with the letter " + letter);
        input.close();
    }
}
