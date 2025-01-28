package org.example.day1;

public class LoopsExplained {
    public static void main(String[] args) {
        // while
        int i = 0;
        while(i < 5) {
            System.out.println("I love Java");
            i++; // i = i + 1;
        }
        System.out.println("*************");

        i = 10;
        // do while
        do {
            System.out.println("I love Java");
            i++;
        } while(i < 3);

        System.out.println("*************");

        // for loop
        for(int j = 0; j < 5; j++) {
            System.out.println("I love Java");
        }

        System.out.println("*************");

        int[] nrs = {2, 45, 7, 9, 0};
        // foreach loop (enhanced for loop)
        for(int nr : nrs) {
            System.out.println(nr);
        }

        System.out.println("*************");
//        System.out.println(nrs[0]);
//        System.out.println(nrs[1]);
//        System.out.println(nrs[2]);
//        System.out.println(nrs[3]);
//        System.out.println(nrs[4]);
        for(int k = 0; k < 5; k++) {
            nrs[k] = nrs[k] * 2;
            System.out.println(nrs[k]);
        }

        System.out.println("Length array:" + nrs.length);

    }
}
