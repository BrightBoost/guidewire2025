package org.example.day2.interfaces;

import java.util.Random;

public class Dog extends Pet implements Predator {
    public void catchPrey(Prey prey) {
        prey.runAndHide();
        Random r = new Random();
        if(r.nextBoolean()) {
            System.out.println("Dog caught the prey, poor " + prey.getClass().getSimpleName());
        } else {
            System.out.println("The prey got away");
        }
    }
}
