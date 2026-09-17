package com.savoira.assessment3;

import java.util.*;

public class LoanPortfolio {
    public static void main(String[] args) {
        // D1.1 List storage
        List<Loan> loans = new ArrayList<>();
        loans.add(new HomeLoan("L101", "Raj", 1000000, 8.0, 120));
        loans.add(new PersonalLoan("L102", "Arjun", 200000, 11.0, 24));
        loans.add(new EducationLoan("L103", "Teja", 500000, 7.5, 36));

        // D1.2 Map lookup
        Map<String, Loan> loanMap = new HashMap<>();
        for (Loan l : loans) loanMap.put(l.getLoanId(), l);

        System.out.println("Lookup L101: " + (loanMap.get("L101") != null ? "Found" : "Not Found"));
        System.out.println("Lookup L999: " + (loanMap.get("L999") != null ? "Found" : "Not Found"));

        // D1.3 Unique applicant count via Set
        Set<String> uniqueApplicants = new HashSet<>();
        for (Loan l : loans) uniqueApplicants.add(l.getApplicantName());

        System.out.println("Unique applicant count: " + uniqueApplicants.size());

        // D1.4 Iteration
        System.out.println("\n-- For-each Loop --");
        for (Loan l : loans) System.out.println(l.getLoanId());

        System.out.println("\n-- Iterator Loop --");
        Iterator<Loan> iterator = loans.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getLoanId());
        }
    }
}
