# Debug Analysis

## Original method
``` 
 public static int sumEvensBuggy(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) if (i % 2 == 1) sum += i;
        return sum;
    }
```
## Bug 1: Incorrect Initialisation
The variable sum was incorrectly initialized to 1 instead of 0, artificially inflating the total calculation. This was identified by tracing the execution and discovering the accumulator started with a pre-existing value.
## Bug 2: Incorrect Conditional Check
The condition used i % 2 == 1 instead of i % 2 == 0, causing the loop to sum odd integers rather than even numbers. This was identified by checking the output against the expected sum of 30 for n = 10.

## Fixed Version
``` 
 public static int sumEvensFixed(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) if (i % 2 == 0) sum += i;
        return sum;
    }
```