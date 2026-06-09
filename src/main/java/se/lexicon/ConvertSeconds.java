package se.lexicon;

import java.util.Scanner;

public class ConvertSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;

        int remainingMinutes = (totalSeconds % 3600) / 60;

        int remainingSeconds = totalSeconds % 60;

        System.out.println(hours + ":" + remainingMinutes + ":" + remainingSeconds);

        input.close();
    }
}
