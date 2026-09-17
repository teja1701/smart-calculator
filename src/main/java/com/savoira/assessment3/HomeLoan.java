package com.savoira.assessment3;

public class HomeLoan extends Loan implements Auditable, Exportable {
    public HomeLoan(String loanId, String applicantName, double principalAmount, double annualRate, int tenureMonths) {
        super(loanId, applicantName, principalAmount, annualRate, tenureMonths);
    }

    @Override
    double calculateEMI() {
        double r = annualRate / 12 / 100;
        double n = tenureMonths;
        double emi = (principalAmount * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        return Math.round(emi * 100.0) / 100.0;
    }

    @Override
    public String getAuditLog() {
        return String.format("[AUDIT] LoanId=%s | Applicant=%s | Amount=%.2f | Status=ACTIVE", loanId, applicantName, principalAmount);
    }

    @Override
    public String toCSVRow() {
        return String.format("%s,%s,%.2f,%.2f,%d,%.2f", loanId, applicantName, principalAmount, annualRate, tenureMonths, calculateEMI());
    }
}