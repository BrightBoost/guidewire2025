package org.example.day3;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Pet> pets = new ArrayList<>();

    public Person() {
    }

    public Person(String name, List<Pet> pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
