package org.example.day2;

public class Person {
    private String name;
    private int age;
    private Dog[] dogs;

    public Person(String name, int age, Dog[] dogs) {
        this.name = name;
        this.age = age;
        this.dogs = dogs;
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

    public Dog[] getDogs() {
        return dogs;
    }

    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }
}
