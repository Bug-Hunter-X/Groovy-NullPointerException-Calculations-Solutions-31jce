# Groovy NullPointerException in Calculations

This repository demonstrates a common error in Groovy related to null pointer exceptions during calculations.  Groovy's dynamic typing can make it easy to overlook null values that may lead to unexpected results or runtime exceptions if not handled properly. The example shows a simple addition function, and how null handling is critical.

## How to reproduce the bug
1. Clone this repository.
2. Run the `bug.groovy` script. Observe the output; it handles nulls but does not explicitly signal them.
3. Examine the `bugSolution.groovy` file for a more robust solution.

## Solution
The `bugSolution.groovy` demonstrates improved error handling using explicit null checks before performing the calculation. This approach makes the code more robust and prevents unexpected behavior.