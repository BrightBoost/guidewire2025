package org.example;

public class SolutionBasicMathOperators {
    public static void main(String[] args) {
//        1. Add two numbers: `a = 5, b = 10`. Print the sum.
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println(sum);

//        2. Subtract two numbers: `x = 50, y = 25`. Print the result.
        int x = 50;
        int y = 25;
        int result = x - y;
        System.out.println(result);
//        3. Multiply two numbers: `length = 4, width = 6`. Print the area.
//        4. Divide `total = 100` by `parts = 4`. Print the result.
//        5. Find the remainder of `a = 23` divided by `b = 7`. Print the remainder.
        a = 23;
        b = 7;
        int remainder = a % b;
        System.out.println(remainder);
//        6. Add 10 to a `balance` variable. Print the new balance.
//        7. Calculate the average of `a = 12, b = 15, c = 18`. Print the result.
//        8. Create a `distance` variable in kilometers and convert it to meters. Print both.
//        9. Write a program to calculate the cost of 3 apples if each costs $2. Print the result.
//        10. Use variables to calculate the hypotenuse of a triangle (`a = 3, b = 4`). Print the result.
        int side1 = 3;
        int side2 = 4;
        double hypotenuse = Math.sqrt(3*3 + 4*4);
        System.out.println(hypotenuse);

    }
}
