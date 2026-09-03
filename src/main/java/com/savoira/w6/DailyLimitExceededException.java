package com.savoira.w6;

public class DailyLimitExceededException extends PaymentException {

    private double attemptedAmount;

    public DailyLimitExceededException(String message, double attemptedAmount) {
        super(message);
        this.attemptedAmount = attemptedAmount;
    }

    public double getAttemptedAmount() {
        return attemptedAmount;
    }
}