package com.savoira.w5;

public class HomeLoan extends Loan implements Auditable {

    private int tenureMonths;

    public HomeLoan (String loanId, String applicantName, double principal, double annualRate, int tenureMonths) {
        super(loanId, applicantName, principal, annualRate);
        this.tenureMonths = tenureMonths;
    }

    @Override
    public double calculateEMI() {
        double r = annualRate / 1200;
        double n = tenureMonths;
        return principal * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1);
    }

    @Override
    public String loanType() {return "Home Loan";}

    @Override
    public String auditSummary() {
        return auditPrefix() + " " + loanId;
    }

}
