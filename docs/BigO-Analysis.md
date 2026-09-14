# Big O Analysis

**Block X - Nested loop**
* **Time complexity:** O(n^2)
* **Why:** For every value of `i` ($n$ values), the inner loop runs $n$ times, so the total number of print operations is $n \times n = n^2$.
* **If n doubles:** Operations become $(2n)^2 = 4n^2$ — 4 times more operations.

**Block Y - Halving loop**
* **Time complexity:** O(log n)
* **Why:** Each iteration divides the tracking value by 2, so the number of iterations needed to reach 0 is approximately log base 2 of $n$.
* **If n doubles:** $\log(2n) = \log(n) + \log(2) = \log(n) + 1$ — only one additional iteration is needed, regardless of how large $n$ already is.

**Block Z - Single loop**
* **Time complexity:** O(n)
* **Why:** The loop runs exactly $n$ times, doing one constant-time operation per iteration.
* **If n doubles:** Operations exactly double, since the work scales linearly with $n$.