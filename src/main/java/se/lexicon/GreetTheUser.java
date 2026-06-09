package se.lexicon;

import java.util.Scanner;

public class GreetTheUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String rawFirstName = input.next();

        System.out.print("Enter last name: ");
        String rawLastName = input.next();

        String firstName = rawFirstName.substring(0, 1).toUpperCase() + rawFirstName.substring(1).toLowerCase();

        String lastName = rawLastName.substring(0, 1).toUpperCase() + rawLastName.substring(1).toLowerCase();

        System.out.println("Hello, " + firstName + " " + lastName + "! Welcome aboard.");

        input.close();
    }
}
