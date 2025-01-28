package org.example.day1;

import java.util.Arrays;

public class SolutionMethods {
    public static void main(String[] args) {
        int[] result = createArray(10);
        System.out.println(Arrays.toString(result));
    }

    //### Return an Array
    //Write a static method createArray(int n) that returns an array of size n, filled with numbers from 1 to n. For example, createArray(5) returns [1, 2, 3, 4, 5].

    public static int[] createArray(int n) {
        int[] nrs = new int[n];
        for(int i = 1; i <= n; i++) {
            nrs[i-1] = i;
        }
        return nrs;
    }
}
