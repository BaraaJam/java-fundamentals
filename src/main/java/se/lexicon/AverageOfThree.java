package se.lexicon;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = input.nextInt();

        double average = (double) (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Average " + average);

        input.close();
    }
}
