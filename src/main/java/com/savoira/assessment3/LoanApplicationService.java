package com.savoira.assessment3;

class LoanApplicationService {
    public String applyForLoan(double income, double loanAmount, int creditScore) {
        if (loanAmount <= 0 || loanAmount > 5_000_000) throw new InvalidLoanAmountException("Invalid loan amount specified.");

        double requiredIncome = loanAmount * 0.10;
        if (income < requiredIncome) throw new InsufficientIncomeException("Income too low.", requiredIncome - income);

        if (creditScore < 650) throw new CreditScoreBelowThresholdException("Credit score is below 650 threshold.");

        return "APPROVED";
    }
}