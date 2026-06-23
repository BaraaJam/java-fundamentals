package se.lexicon.part3;

import java.util.HashSet;

public class UniqueCities {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Stockholm");
        cities.add("Gothenburg");
        cities.add("Malmö");
        cities.add("Stockholm");
        cities.add("Uppsala");
        cities.add("Gothenburg");
        cities.add("Lund");

        IO.println("Unique Cities:\n");
        for (String city : cities){
            IO.println(city);
        }

        IO.println("\nTotal count: " + cities.size());
    }
}
