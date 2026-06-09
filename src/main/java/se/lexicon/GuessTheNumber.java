package se.lexicon;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(500) + 1;
        int userGuess = 0;
        int numberOfGuesses = 0;

        while (randomNumber != userGuess){

            System.out.print("Enter a guess between 1 and 500: ");
            userGuess = input.nextInt();
            numberOfGuesses ++;

            if (userGuess > randomNumber){
                System.out.println("Too big!");
            } else if (userGuess < randomNumber) {
                System.out.println("Too small!");
            }

        }
        System.out.println("Correct! " + "You got it in " + numberOfGuesses +" guesses.");

        input.close();
    }
}
