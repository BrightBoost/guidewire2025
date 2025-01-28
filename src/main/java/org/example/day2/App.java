package org.example.day2;

public class App {
    public static void main(String[] args) {
        int x = 5;
        Dog dog1 = new Dog("Max", 10, new String[] {"grey", "white"}, "1-3-2022");

        describeDog(dog1);

        dog1.ruinShoes();

        Dog dog2 = new Dog();
        dog1.setColors(new String[] {"grey"});
        dog2.setName("Victor");
        dog2.setDob("1-2-2024");
        dog2.setWeight(40);

        dog2.ruinShoes();

        describeDog(dog2);

        Person person = new Person("Louise", 25, new Dog[] {dog2});

        System.out.println(person.getName() + " has a dog named " + person.getDogs()[0].getName());

        System.out.println(Turtle.getTurtlePopulation());
        Turtle t = new Turtle("Donnatello", 23, new String[]{"green"}, "2-2-2002");
        Turtle t1 = new Turtle("Donnatello", 23, new String[]{"green"}, "2-2-2002");

        System.out.println(Turtle.getTurtlePopulation());


    }

    public static void describeDog(Dog dog) {
        System.out.println(dog.getName() + " weighs " + dog.getWeight() + " kilos.");

    }
}
