
# Code Review
1. The naming convention is bad (method x is not understandable)
2. The parameters used (a,b,c) are also not clear, readability is missing.
3. 'r' is also not clear as a variable name.
4. And loop formatting is difficult to understand.

# Refactored Code

public double calculateAmount(double principal, double rate, int years) {
    double amount = 1;

    for (int year = 0; year < years; year++) {
        amount = amount * (1 + rate);
    }

    return principal * amount;
}