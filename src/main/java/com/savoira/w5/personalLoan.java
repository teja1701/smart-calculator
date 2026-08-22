package com.savoira.w5;

public class personalLoan extends Loan {

    private int tenureMonths;

    public personalLoan(String loanId, String applicantName, double principal, double annualRate, int tenureMonths) {
        super(loanId, applicantName, principal, annualRate);
        this.tenureMonths = tenureMonths;
    }

    @Override
    public double calculateEMI() {
        double interest = principal * annualRate / 100 * tenureMonths / 12;
        return (principal + interest) / tenureMonths;
    }

    @Override
    public String loanType() {return "Personal Loan";}
}