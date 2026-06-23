package se.lexicon.part3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        Scanner input = new Scanner(System.in);

        contacts.put("baraa", "0763007916");
        contacts.put("mehrdad", "0723401234");
        contacts.put("ihab", "0734502345");
        contacts.put("felix", "07467032111");

        IO.print("Enter a name: ");
        String name = input.next().toLowerCase();

        IO.println(contacts.getOrDefault(name, "Contact not found."));

        input.close();
    }
}
