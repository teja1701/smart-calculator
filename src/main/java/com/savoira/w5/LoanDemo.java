package com.savoira.w5;

import java.util.ArrayList;
import java.util.List;

public class LoanDemo {

    public static void main(String[] args) {
        List<Loan> loans = new ArrayList<>();

        loans.add(new HomeLoan("101", "Teju", 50000, 3, 8));
        loans.add(new personalLoan("102", "Raj", 10000, 4, 10));
        loans.add(new personalLoan("103", "Arjun", 30000, 10, 12));

        for (Loan loan : loans) {loan.printSummary();}
    }
}