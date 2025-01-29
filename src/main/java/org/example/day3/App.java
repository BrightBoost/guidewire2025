package org.example.day3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Person p = new Person();
        List<Pet> pets = new ArrayList<>();
        List<String> colors = new ArrayList<>();
        colors.add("Green");
        pets.add(new Salamander("Sander", 1, colors));
        pets.add(new Turtle("Tony", 2, colors));

        p.setName("Maaike");
        p.setPets(pets);

        System.out.println(p.getPets().get(1).getName());
    }
}
