package org.example.day2.interfaces;

public interface Prey {
    // constant, properties in interfaces are public static and final
    int x = 4;
    void runAndHide();
    default void printInfo() {
        System.out.println("I am a " + this.getClass().getSimpleName());
    }
}
