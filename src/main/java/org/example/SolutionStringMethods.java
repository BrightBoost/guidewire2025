package org.example;

public class SolutionStringMethods {
    public static void main(String[] args) {
//        1. Create a string `name = "John"`. Convert it to uppercase and print it.
        String name = "John";
        name = name.toUpperCase();
        System.out.println(name);
//        2. Create a string `greeting = "HELLO"`. Convert it to lowercase and print it.
//        3. Compare two strings `str1 = "apple"` and `str2 = "APPLE"` using `.equals()`. Print the result.
        String str1 = "apple";
        String str2 = "APPLE";
        System.out.println(str1.equals(str2));
//        4. Use `.substring()` to extract "Java" from `text = "Learn Java Programming"`.
        String text = "Learn Java Programming";
        System.out.println(text.substring(6, 10));
//        5. Concatenate `firstName = "Mary"` and `lastName = "Ann"`. Print the full name.
//        6. Use `.length()` to print the number of characters in `sentence = "Hello, world!"`.
//        7. Replace all `e` with `a` in `str = "elephant"`. Print the result.
        String str = "elephant";
        System.out.println(str.replaceAll("e", "a"));
//        8. Check if `sentence = "Java is fun"` contains the word "fun" using `.contains()`.
//        9. THIS ONE IS ANNOYING: Combine `.toUpperCase()` and `.substring()` to extract and capitalize the first word in `text = "coding is great"`.
//        10. Reverse a string manually: `String input = "abc";` Print `cba` (hint: use `.charAt()` BONUS: in a loop).

    }
}
