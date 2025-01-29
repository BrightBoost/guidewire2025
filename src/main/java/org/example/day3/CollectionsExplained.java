package org.example.day3;

import java.util.*;

public class CollectionsExplained {
    public static void main(String[] args) {
        // List - ordered collection of elements (they have an index = ordered)
        List<String> books = new ArrayList<>();
        books.add("Criminal Procedure Law");
        books.add("Java");
        books.add("The spinning heart");

        System.out.println("Nr of books:" + books.size());
        System.out.println("First book:" + books.get(0));
        boolean containsJava = books.contains("Java");

        // helper method for sorting
        Collections.sort(books);
        System.out.println(books);


        // Set - unordered list of unique elements
        Set<String> setOfBooks = new HashSet<>();
        setOfBooks.add("Criminal Procedure Law");
        setOfBooks.add("Java");
        setOfBooks.add("The spinning heart");
        setOfBooks.remove("Java");

        for(String book : setOfBooks) {
            System.out.println(book);
        }

        // Map - key value pairs
        Map<String, Integer> studentsAndNrOfBooks = new HashMap<>();
        studentsAndNrOfBooks.put("Gaia", 1200);
        studentsAndNrOfBooks.put("Jonas", 2);

        int valueJonas =  studentsAndNrOfBooks.get("Jonas");
        studentsAndNrOfBooks.put("Jonas", 3);


        // loop over keys
        for(String key : studentsAndNrOfBooks.keySet()) {
            System.out.println(key + " : " + studentsAndNrOfBooks.get(key));
        }
        // loop over values
        for(Integer value : studentsAndNrOfBooks.values()) {
            System.out.println(value);
        }
        // loop over pairs
        for(Map.Entry<String, Integer> pair : studentsAndNrOfBooks.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
