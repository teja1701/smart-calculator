package com.savoira.w7_atm;

public class ComplexityNotes {
    /**
     * Comparing time complexity for banking tasks with 1 million accounts.
     *
     * Task 1: Finding 1 account by ID
     * ---------------------------------------
     * Linear Search: O(N)
     * Checks accounts one by one. For 1 million accounts, it takes up to
     * 1 million checks to find a single account.
     *
     * HashMap Lookup: O(1)
     * Uses a direct key to jump straight to the account, taking only 1 step.
     *
     * Choice: HashMap Lookup.
     * It finds the record instantly, no matter how many accounts exist.
     *
     *
     * Task 2: Finding overdue accounts
     * ---------------------------------------
     * Nested Loops: O(N^2)
     * Compares every account against every other account. For 1 million accounts,
     * this takes 1 trillion checks and will freeze the program.
     *
     * Single Pass with a Set: O(N)
     * Reads through the list once and uses a Set to track overdue IDs instantly.
     *
     * Choice: Single Pass with a Set.
     */
}
