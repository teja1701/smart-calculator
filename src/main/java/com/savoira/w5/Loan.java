package com.savoira.w5;

public abstract class Loan {

    protected String loanId;
    protected String applicantName;
    protected double principal;
    protected double annualRate;

    public Loan(String loanId, String applicantName, double principal, double annualRate) {
        this.loanId = loanId;
        this.applicantName = applicantName;
        this.principal = principal;
        this.annualRate = annualRate;
    }

    public abstract double calculateEMI();

    public abstract String loanType();

    public void printSummary() {
        System.out.println("Loan Type: " + loanType());
        System.out.println("Loan ID: " + loanId);
        System.out.println("Applicant: " + applicantName);
        System.out.printf("Principal: %.2f%n", principal);
        System.out.printf("Annual Rate: %.2f%%%n", annualRate);
        System.out.printf("EMI: %.2f%n", calculateEMI());
        System.out.println();
    }
}