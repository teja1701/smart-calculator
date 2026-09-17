package com.savoira.w7_atm;

public class BugFixer {
    static double findLargest(double[] amounts) {
        // Bug 1 fix: Initializing max to 0 fails if all elements are negative. Setting it to the first element instead.
        double max = amounts[0];

        // Bug 2 fix: Using '<=' causes an ArrayIndexOutOfBoundsException. Changing it to '<'.
        for (double amount : amounts) {
            if (amount > max) max = amount;
        }
        return max;
    }
}
