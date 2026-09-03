package com.savoira.assessment3;

class CreditScoreBelowThresholdException extends LoanException {
    public CreditScoreBelowThresholdException(String message) { super(message); }
}
