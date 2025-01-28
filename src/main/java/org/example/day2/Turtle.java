package org.example.day2;

public class Turtle extends Pet {
    private static int turtlePopulation = 0;

    public Turtle() {
        turtlePopulation++;
    }

    public Turtle(String name, double weight, String[] colors, String dob) {
        super(name, weight, colors, dob);
        turtlePopulation++;
    }

    public void eatLettuce() {
        System.out.println(this.getName() + " is eating lettuce.");
    }

    public static int getTurtlePopulation() {
        return turtlePopulation;
    }

    @Override
    public void makeSound() {
        System.out.println("...");
    }
}
