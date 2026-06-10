package se.lexicon;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i=1; i <=10; i++){
            int multi = number * i;
            System.out.println(number + " * " + i + " = " + multi);
        }

        input.close();
    }
}
