package org.example.day2;

public class Pet {
    private String name;
    private double weight;
    private String[] colors;
    private String dob;
    private boolean secondHand;


    public Pet() {
    }

    public Pet(String name, double weight, String[] colors, String dob) {
        this.name = name;
        this.weight = weight;
        this.colors = colors;
        this.dob = dob;
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

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean isSecondHand() {
        return secondHand;
    }

    public void setSecondHand(boolean secondHand) {
        this.secondHand = secondHand;
    }
}
