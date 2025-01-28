package org.example.day2.exercises.interfaces;

public class App {


    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Animal.makeAnimalSound(d);
        Animal.makeAnimalSound(c);
    }
}
