package com.savoira.w5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoanDemo {

    public static void main(String[] args) {
        List<Loan> loans = new ArrayList<>();

        loans.add(new HomeLoan("101", "Teju", 50000, 3, 8));
        loans.add(new personalLoan("102", "Raj", 10000, 4, 10));
        loans.add(new personalLoan("103", "Arjun", 30000, 10, 12));

        for (Loan loan : loans) {loan.printSummary();}

        System.out.println();
        System.out.println("Auditable demo");
        Auditable auditableLoan = new HomeLoan("101", "Teju", 50000, 3, 8);
        System.out.println(auditableLoan.auditSummary());

        System.out.println();
        System.out.println("Exportable demo");
        Exportable exportableLoan = new personalLoan("102", "Raj", 10000, 4, 10);
        System.out.println(exportableLoan.toCSVRow());

        System.out.println();
        System.out.println("HashSet demo");
        Set<Loan> loanSet = new HashSet<>();

        HomeLoan homeLoan1 = new HomeLoan("103", "Arjun", 50000, 3, 8);
        HomeLoan homeLoan2 = new HomeLoan("104", "Mahi", 70000, 4, 10);
        loanSet.add(homeLoan1);
        loanSet.add(homeLoan2);

        System.out.println("Number of loans in HashSet: " + loanSet.size());
    }
}