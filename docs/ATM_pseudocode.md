
Pseudocode for ATM withdrawal logic
```
Set attempts = 0
Set MAX_ATTEMPTS = 3
WHILE attempts < MAX_ATTEMPTS
    Enter withdrawal amount

    IF amount < ₹500
        Show "Minimum withdrawal is ₹500"

    ELSE IF amount > ₹20,000
        Show "Maximum withdrawal is ₹20,000"

    ELSE IF amount is not a multiple of ₹500
        Show "Amount must be a multiple of ₹500"

    ELSE IF amount > balance
        Show "Insufficient balance"

    ELSE
        Withdraw the amount
        Show "Withdrawal successful"

    Increase attempts by 1

END WHILE
Show "Card locked"
```