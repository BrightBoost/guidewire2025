package org.example.day1;

public class MethodsExplained {
    // the main method
    public static void main(String[] args) {
        String result = getHello();
        System.out.println(result);
        String greeting = getGreeting("Suganya");
        System.out.println(greeting);
        String greeting2 = getGreeting("Megala");
        System.out.println(greeting2);
        System.out.println(addTwoNumbers(22, 1));
    }

    // static method
    public static void sayHi() {
        System.out.println("Hi");
    }

    public static String getHello() {
        return "Hello";
    }

    public static String getGreeting(String name) {
        return "Hello " + name;
    }

    public static double addTwoNumbers(double a, double b) {
        return a + b;
    }

    public static void sayBye() {
        System.out.println("Bye");
    }
}
