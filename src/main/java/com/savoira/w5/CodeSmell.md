// original snippet

void process(List<Loan> l) {
for(int i=0;i<l.size();i++){
if(l.get(i).principal>500000&&l.get(i).principal<2000000)
System.out.println(l.get(i).loanId);
}
}

1. Magic numbers 5000000 and 2000000 are used.
2. Poor variable names are used like l instead of meaningful names.

// Refactored code

private static final double MIN_PRINCIPAL = 500000;
private static final double MAX_PRINCIPAL = 2000000;

void process(List<Loan> loans) {
for (Loan loan : loans) {
if (loan.principal > MIN_PRINCIPAL &&
loan.principal < MAX_PRINCIPAL) {
            System.out.println(loan.loanId);
        }
    }
}