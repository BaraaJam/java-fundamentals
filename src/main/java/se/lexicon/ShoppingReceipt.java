package se.lexicon;

import java.util.Scanner;

public class ShoppingReceipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String items = "";
        double total = 0;


        for (int i = 0; i < 3; i++){

            System.out.print("Enter item name ");
            String itemName = input.nextLine();
            String capitalizedName = itemName.substring(0, 1).toUpperCase() + itemName.substring(1).toLowerCase();

            System.out.print("Enter quantity ");
            int itemQuantity = input.nextInt();

            input.nextLine();

            System.out.print("Enter price ");
            double itemPrice = input.nextDouble();

            input.nextLine();

            double finalPrice = itemQuantity * itemPrice;
            String item = capitalizedName + "   " + itemQuantity + " x " + String.format("%.2f", itemPrice) + " = " + String.format("%.2f", finalPrice) + " SEK\n";
            items = items + item;
            total = total + finalPrice;

        }

        System.out.println("=============");
        System.out.println("Receipt");
        System.out.println("=============");
        System.out.println(items);
        System.out.println("-------------");
        System.out.println("Grand total:   " + String.format("%.2f", total) + " SEK");
        System.out.println("=============");

        input.close();
    }
}
