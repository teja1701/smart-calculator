package com.savoira.assessment;

/*
 * Immutability keeps account holder details unchanged.
 */
public final class AccountHolder {

    private final String name;
    private final String customerId;
    private final String email;

    public AccountHolder(String name, String customerId, String email) {
        this.name = name;
        this.customerId = customerId;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "AccountHolder[name=" + name
                + ", customerId=" + customerId
                + ", email=" + email + "]";
    }
}