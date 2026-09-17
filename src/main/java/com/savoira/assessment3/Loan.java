package com.savoira.assessment3;

import java.util.Objects;

abstract class Loan {
    protected final String loanId;
    protected final String applicantName;
    protected final double principalAmount;
    protected final double annualRate;
    protected final int tenureMonths;

    public Loan(String loanId, String applicantName, double principalAmount, double annualRate, int tenureMonths) {
        this.loanId = loanId;
        this.applicantName = applicantName;
        this.principalAmount = principalAmount;
        this.annualRate = annualRate;
        this.tenureMonths = tenureMonths;
    }

    abstract double calculateEMI();

    public double totalRepayable() {
        return Math.round(calculateEMI() * tenureMonths * 100.0) / 100.0;
    }

    public void printSummary() {
        System.out.printf("Loan ID: %s | Applicant: %s | Principal: %.2f | Rate: %.2f%% | Tenure: %d mos | EMI: %.2f | Total: %.2f%n",
                loanId, applicantName, principalAmount, annualRate, tenureMonths, calculateEMI(), totalRepayable());
    }

    public String getLoanId() { return loanId; }
    public String getApplicantName() { return applicantName; }
    public double getPrincipalAmount() { return principalAmount; }
    public double getAnnualRate() { return annualRate; }
    public int getTenureMonths() { return tenureMonths; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return loanId.equalsIgnoreCase(loan.loanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanId.toLowerCase());
    }
}