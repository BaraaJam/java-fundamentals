package se.lexicon.part3;

import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple", "grape", "orange"};

        HashMap<String, Integer> wordCounts  = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            int matchCount = 0;

            for (String word : words){
                if (word.equals(currentWord)){
                    matchCount++;
                }

            }
            wordCounts.put(currentWord, matchCount);
        }

        IO.println(wordCounts);
    }
}
