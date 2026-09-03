# Task 1 – Part A: Expected Output

The worker-thread lines may appear in different orders because thread scheduling is not fixed. A valid possible output is:
Main | Before start
TransferWorker-1 | STARTED
AuditLogger-1 | STARTED
AuditLogger-1 | DONE
TransferWorker-1 | DONE
Main | After join

# Task 1 – Part B: Answers

B1. What is the state of t1 while it is inside Thread.sleep(100)?
Answer: TIMED_WAITING

B2. Can 'Main | After join' print BEFORE both workers print 'DONE'?
Answer: No. join() makes the main thread wait until both worker threads finish.

B3. What happens if t1.start() is replaced with t1.run()?
Answer: run() executes like a normal method in the current thread, so it does not start a new thread.