# Dry Run
| Step | Balance | Attempts | Amount | Condition / Action | Result |
|---|---|---|---|---|----|
| Start | 10000.0 | 0 | 7500.0 | Initial state before calling `withdraw(7500)`| -  |
| 1 | 10000.0 | 0 | 7500.0 | Check range: 500 <= amount <= 20000] | Yes |
| 2 | 10000.0 | 0 | 7500.0 | Check multiple: amount % 500 == 0 | Yes |
| 3 | 10000.0 | 0 | 7500.0 | Check balance: amount <= balance | Yes|
| 4 | 2500.0 | 0 | 7500.0 | Update balance: balance = balance - amount | Success |