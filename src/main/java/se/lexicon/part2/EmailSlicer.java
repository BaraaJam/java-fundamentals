package se.lexicon.part2;

import java.util.Scanner;

public class EmailSlicer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = input.next();

        int indexOfDomain = email.indexOf('@');

        if (indexOfDomain == -1){
            System.out.println("Invalid email address. Missing '@' symbol.");
        } else {
            String domain = email.substring(indexOfDomain + 1);
            String username = email.substring(0,indexOfDomain);

            System.out.println("Username: " + username);
            System.out.println("Domain  : " + domain);
        }

        input.close();
    }
}
