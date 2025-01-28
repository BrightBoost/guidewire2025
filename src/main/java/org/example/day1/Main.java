package org.example.day1;

public class Main {
    // My main method - this is a comment
    public static void main(String[] args) {
        int nr = 7;
        int blabla; // declaration
        blabla = 10; // assignment and initialization
        long longNr = 12345678902L;
        long smallLongNr = 1;
        int newInt = (int) smallLongNr;
        double decimalNr = 6.6;
        boolean javaIsFun = true;
        float floatNr = 6.6f;
        char c = 'c';
        String text = "Java is fun!";
        System.out.println(newInt);
        System.out.println("Good morning!");
        System.out.println("Hello world!");

        // regular basic math + - / *
        int result = nr - blabla;
        System.out.println(result);
        // modulo (basic math but less basic)
        int remainder = 3 % 2;
        boolean even = remainder == 0; // == checks for equality
        boolean odd = remainder != 0; // != checks for non-equality
        boolean complexComparison = result == 2 || remainder != 0; // || or
        boolean complexComparison2 = result == 2 && remainder != 0; // && and

        // strings - text
        String value = "bla bla bla";
        System.out.println(value.startsWith("B"));
        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());
        System.out.println(value);
        String value2 = "123456789";
        System.out.println(value2.substring(4, 7));
        boolean x = value.equals(value2); // check for equality, for objects == only checks the memory address not the content
        System.out.println(value.length());
        System.out.println(value.charAt(3));
        System.out.println(value2.contains("678"));

    }
}