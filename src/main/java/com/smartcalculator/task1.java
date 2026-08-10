package com.smartcalculator;

public class task1 {
    public static void main(String[] args) {

        // Block 1: Integer division
        int a = 17, b = 5;
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println((double) a / b);

        // Block 2: Integer cache
        Integer x = 127;
        Integer y = 127;
        Integer p = 200;
        Integer q = 200;
        System.out.println(x == y);
        System.out.println(p == q);
        System.out.println(p.equals(q));

        //In block2, line17 and line18 shows different results because Java reuses Integer objects for numbers from -128 to 127, but 200 is not in that range.
    }
}


