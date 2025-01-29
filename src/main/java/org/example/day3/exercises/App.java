package org.example.day3.exercises;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Person p = new Person("Louise", new LinkedList<>());
        Person p1 = new Person("Aljesa", new LinkedList<>());

        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(p.getId(), p);
        personMap.put(p1.getId(), p1);

        System.out.println(personMap.get(p.getId()));
    }
}
