package org.example.day2.exercises;

import java.util.Arrays;

public class Person {
    private static int population;
    private String name;
    private int age;
    private boolean isAdult;

    private Car[] cars = new Car[10];

    public Person(String name, int age, boolean isAdult) {
        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
        population++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public void buyCar(Car car) {
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                cars[i] = car;
                System.out.println(name + " bought a " + car.getModel());
                break;
            }
        }
    }


}
