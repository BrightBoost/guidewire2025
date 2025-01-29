package org.example.day3.exercises;

import org.example.day3.Pet;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private static int counter = 1;
    private int id;
    private String name;
    private List<Pet> pets = new ArrayList<>();


    public Person(String name, List<Pet> pets) {
        this.id = counter;
        counter++;
        this.name = name;
        this.pets = pets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pets=" + pets +
                '}';
    }
}
