# Task 1 
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

# Task 3
Dry Run

| Step | Transaction | Balance | Transaction > 0? | Deposits |
|---|---:|---|:---:|---:|
| Start | - | 3000 | - | 0 |
| 1 | 500 | 3000 + 500 = 3500 | Yes | 1 |
| 2 | -200 | 3500 - 200 = 3300 | No | 1 |
| 3 | 1000 | 3300 + 1000 = 4300 | Yes | 2 |
| 4 | -300 | 4300 - 300 = 4000 | No | 2 |
| 5 | 800 | 4000 + 800 = 4800 | Yes | 3 |

# Task 4
Final Output

Balance: 4800
Deposits: 3
The final balance is calculated by starting with 3000 and sequentially adding every transaction in the array, resulting in 4800.
The count variable tracks only positive transactions, With three positive values in the array (500, 1000, and 800), the final deposit count is 3.
