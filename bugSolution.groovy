```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    println "Error: Null values encountered in calculation. Returning 0." //Improved feedback
    return 0
  }
  return a + b
}

println calculate(5, 3) // Output: 8
println calculate(null, 3) // Output: Error: Null values encountered in calculation. Returning 0.
println calculate(5, null) // Output: Error: Null values encountered in calculation. Returning 0.
println calculate(null, null) // Output: Error: Null values encountered in calculation. Returning 0.
```