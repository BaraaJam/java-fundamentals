package se.lexicon;

import java.util.Scanner;

public class WeekdayOrWeekend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String rawDay = input.next();

        String day = rawDay.substring(0, 1).toUpperCase() + rawDay.substring(1).toLowerCase();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's a weekday.");
            case "Saturday", "Sunday" -> System.out.println("It's a weekend!");
            default -> System.out.println("Unknown day.");
        }
    }
}
