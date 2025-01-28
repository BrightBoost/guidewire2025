package org.example.day2.generics;

public class LaptopBag {
    private Laptop laptop;

    public void putLaptopInBag(Laptop laptop) {
        this.laptop = laptop;
    }

    public Laptop getLaptopFromBag() {
        Laptop laptopToBeTakenFromBag = laptop;
        this.laptop = null;
        return laptopToBeTakenFromBag;
    }
}
