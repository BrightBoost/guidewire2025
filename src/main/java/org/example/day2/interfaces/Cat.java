package org.example.day2.interfaces;

import java.util.Random;

public class Cat extends Pet implements Prey, Predator {
    public void catchPrey(Prey prey) {
        prey.runAndHide();
        Random r = new Random();
        if(r.nextBoolean()) {
            System.out.println("Cat caught the prey");
        } else {
            System.out.println("The prey got away");
        }
    }

    public void runAndHide() {
        this.printInfo();
        System.out.println("Cat is running and trying to climb up a tree");
    }
}
