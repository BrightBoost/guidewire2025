package org.example.day2;

public class Dog extends Pet {


    public Dog() {

    }

    public Dog(String name, double weight, String[] colors, String dob) {
        super(name, weight, colors, dob);
    }

    public void ruinShoes() {
        System.out.println(this.getName() + ": Yum nice shoe...GRRR");
    }
}
