package com.savoira.assessment;

public class TypeDemo {

    public static void main(String[] args) {

        // Block 1: Integer division, remainder, and type casting
        int a = 9, b = 2;

        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println((double) a / b);
        // Expected: 4, 1, 4.5

        // Block 2: Integer caching and value comparison
        Integer x = 100;
        Integer y = 100;
        Integer p = 200;
        Integer q = 200;

        System.out.println(x == y);
        System.out.println(p == q);
        System.out.println(p.equals(q));
        // Expected: true, false, true

        // 100 is cached; 200 is outside the default Integer cache range.
    }
}