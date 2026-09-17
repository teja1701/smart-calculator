package com.savoira.assessment3;

public class EducationLoan extends Loan {
    public EducationLoan(String loanId, String applicantName, double principalAmount, double annualRate, int tenureMonths) {
        super(loanId, applicantName, principalAmount, annualRate, tenureMonths);
    }

    @Override
    double calculateEMI() {
        double simpleInterest = principalAmount * (annualRate / 100) * (tenureMonths / 12.0);
        double emi = (principalAmount + simpleInterest) / tenureMonths;
        return Math.round(emi * 100.0) / 100.0;
    }

    @Override
    public double totalRepayable() {
        double baseTotal = super.totalRepayable();
        double moratoriumInterest = principalAmount * (annualRate / 100) * (6.0 / 12.0);
        return Math.round((baseTotal + moratoriumInterest) * 100.0) / 100.0;
    }
}