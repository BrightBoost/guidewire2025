package org.example.day2.interfaces;

public class App {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        Rabbit r1 = new Rabbit();

        d1.catchPrey(c1);
        d1.catchPrey(r1);
        c1.catchPrey(r1);
    }
}
