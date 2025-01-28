package org.example.day2.exercises.interfaces;

public interface Animal {
    void makeSound();

    public static void makeAnimalSound(Animal animal) {
        animal.makeSound();
    }
}
