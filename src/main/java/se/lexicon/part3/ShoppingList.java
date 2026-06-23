package se.lexicon.part3;

import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Eggs");
        shoppingList.add("Milk");
        shoppingList.add("Bananas");
        shoppingList.add("Bread");
        shoppingList.add("Cheeze");

        printList(shoppingList);

        shoppingList.remove("Eggs");

        printList(shoppingList);
    }

    public static void printList(ArrayList<String> list){
        IO.println("\nCurrent items in the list:");
        for (int i = 0; i < list.size(); i++) {
            IO.println((i + 1) + " " + list.get(i));
        }
    }
}
