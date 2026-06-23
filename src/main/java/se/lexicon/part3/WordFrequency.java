package se.lexicon.part3;

import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple", "grape", "orange"};

        HashMap<String, Integer> wordCounts  = new HashMap<>();

        for (String currentWord : words) {
            int matchCount = 0;

            for (String word : words) {
                if (word.equals(currentWord)) {
                    matchCount++;
                }

            }
            wordCounts.put(currentWord, matchCount);
        }

        IO.println(wordCounts);
    }
}
