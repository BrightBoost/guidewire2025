package org.example.day2.generics;

public class App {
    public static void main(String[] args) {
        Chihuahua c = new Chihuahua("Roxy", 6);
        Laptop l = new Laptop("Dell", "950");

        Bag<Laptop> laptopBag = new Bag<>();
        laptopBag.putContentInBag(l);

        Bag<Chihuahua> chihuahuaBag = new Bag<>();
        chihuahuaBag.putContentInBag(c);

    }
}
