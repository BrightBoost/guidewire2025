package org.example.day3;

import java.util.ArrayList;
import java.util.List;

public abstract class Pet {
    private String name;
    private double weight;

    List<String> colors = new ArrayList<>();

    public Pet(String name, double weight, List<String> colors) {
        this.name = name;
        this.weight = weight;
        this.colors = colors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }
}
