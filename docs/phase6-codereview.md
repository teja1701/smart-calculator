# Code Review Checklist
# Checklist

1. Does `mvn clean compile` run without errors?
2. Are public classes and methods properly documented?
3. Are variable and method names clear?
4. Have I tested both valid and invalid inputs?
5. Are invalid numbers handled without crashing the program?
6. Are invalid operators handled using `InvalidOperationException`?
7. Is division by zero handled using `DivisionByZeroException`?
8. Does `Division` use `BigDecimal` for better precision?

# Self-review
In Phase 6, I improved the error handling of the calculator by adding custom exceptions for invalid operators and division by zero. I also used `BigDecimal` in the `Division` class for better precision. 