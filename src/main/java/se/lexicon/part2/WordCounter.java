package se.lexicon.part2;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter word to find: ");
        String wordToFind = input.nextLine();

        ArrayList<String> words = new ArrayList<>();

        int startIndex = 0;
        int nextSpace = sentence.indexOf(' ');

        while (nextSpace != -1) {
            String word = sentence.substring(startIndex, nextSpace);

            if (!word.isEmpty()) {
                words.add(word);
            }

            startIndex = nextSpace + 1;
            nextSpace = sentence.indexOf(' ', startIndex);
        }

        String lastWord = sentence.substring(startIndex);
        if (!lastWord.isEmpty()) {
            words.add(lastWord);
        }

        int matchCount = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(wordToFind)) {
                matchCount++;
            }
        }

        System.out.println("Total words : " + words.size());
        System.out.println("\"" + wordToFind + "\" appears: " + matchCount + " times");

        input.close();
    }

}
