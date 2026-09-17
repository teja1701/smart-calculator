package com.savoira.assessment3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PrecisionDemo {
    public static void main(String[] args) {
        // Floating point problem vs BigDecimal fix
        double d1 = 0.1 + 0.2;
        System.out.println("Double result: " + d1); // 0.30000000000000004

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        System.out.println("BigDecimal result: " + bd1.add(bd2)); // 0.3

        // Compound interest calculation: P = 500,000, r = 8.5%, t = 3 years, monthly
        BigDecimal principal = new BigDecimal("500000");
        BigDecimal annualRate = new BigDecimal("0.085");
        BigDecimal monthsPerYear = new BigDecimal("12");
        BigDecimal years = new BigDecimal("3");

        BigDecimal ratePerMonth = annualRate.divide(monthsPerYear, 10, RoundingMode.HALF_UP);
        BigDecimal totalMonths = years.multiply(monthsPerYear);

        // A = P * (1 + r/n)^(nt)
        BigDecimal base = BigDecimal.ONE.add(ratePerMonth);
        BigDecimal compoundAmount = principal.multiply(base.pow(totalMonths.intValue()));

        System.out.println("Compound Interest Total: " + compoundAmount.setScale(2, RoundingMode.HALF_UP));
    }
}