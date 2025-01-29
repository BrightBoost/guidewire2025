package org.example.day2.exercises.generics;

import org.w3c.dom.ls.LSOutput;

public class App {
    public static void main(String[] args) {
        Pair<Integer, Double> pair = new Pair<>(10, 20.5);
        pair.display();

        Box<Integer> box = new Box<>();
        box.setItem(42);

        DataHolder<String, Box<Integer>> dataHolder = new DataHolder<>("Mykey", box);

        System.out.println(dataHolder.getKey());    // Output: MyKey
        System.out.println(dataHolder.getValue().getItem()); // Output: 42
    }
}
