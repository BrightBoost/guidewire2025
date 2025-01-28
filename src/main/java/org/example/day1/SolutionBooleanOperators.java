package org.example.day1;

public class SolutionBooleanOperators {
    public static void main(String[] args) {
//        1. Compare two numbers `a = 5, b = 10`. Print `a > b`.
        int a = 5;
        int b = 10;
        System.out.println(a > b);
//        2. Check if `x = 20` is not equal to `y = 15`. Print the result.
//        3. Combine conditions: `age > 18 && age < 60`. Print true or false.
        int age = 33;
        System.out.println(age > 18 && age < 60);
//        4. Write a program that checks if a `number` is positive (`number > 0`).
//        5. Check if `x = 7` is divisible by `2` (`x % 2 == 0`). Print the result.
//        6. Combine conditions: Check if a number is even and greater than 10.
        int nr = 11;
        System.out.println(nr % 2 == 0 && nr > 10);
//        7. Write a program to compare two strings using `==` and `.equals()`. Print the result of both.
//        8. Use `||` to check if `score > 90` or `score < 50`. Print the result.
//        9. Write a program that evaluates `x = 5, y = 10`. Print true if `x * 2 == y`.
//        10. Bonus: Use an `if` statement to check if `temperature > 30`. Print "It's hot" or "It's cool."
    }
}
