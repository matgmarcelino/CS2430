# Programming Project 3: Optimal Selection

**Author:** Matheus Marcelino
**Course:** CS 2430, Section 6 (Summer 2026)

This project explores several strategies for the _optimal selection_ problem: finding the optimal subset of experiments that maximizes the rating without exceeding the 700kg weight limit. The project compares greedy strategies, an exhaustive brute-force approach, and an optimal dynamic-programming solution. This `project3` folder is part of the CS2430 repository that contains projects 1 through 4.

---

## Language and Version

- **Language:** Java
- **Version:** Java 21

---

## Files

- **`Experiment.java`** - The immutable data type modeling a single experiment as a name, weight (in kilograms), and scientific rating.
- **`SubsetGenerator.java`** - A helper class that generates the power set (all 2<sup>n</sup> subsets) of the experiments. Used by the brute-force strategy.
- **`OptimizationStrategies.java`** - The driver and main entry point. It holds the fixed list of 12 experiments and implements the selection strategies, then runs and prints all of them along with a written summary comparing the approaches.

---

## Strategies

### Part 1 — Greedy strategies

Each greedy strategy sorts the experiments by some key and then adds them one at a time, skipping any experiment that would push the total weight to over 700 kg.

- **Highest rating first** — considers experiments from highest rating to lowest. Not optimal as it completely disregards the weight.
- **Lightest first** — considers experiments from lightest to heaviest. Finds a better solution than the previous strategy, but is still not optimal as it disregards rating-to-weight ratio.
- **Weighed score** — considers experiments by descending rating-to-weight ratio. The best one of the greedy strategies as it uses all data from each experiment and calculates a score.

### Part 2 — Exhaustive and optimal

- **Brute-force / exhaustive search** — generates every possible subset, keeps those within the weight limit, and chooses the highest rating one. Finds the optimal subset but runs in O(2<sup>n</sup>) time.
- **Dynamic programming** — solves the 0/1 knapsack optimally in O(n \* capacity) time. A table `dp[i][c]` holds the best rating achievable using the first `i` experiments within a weight budget of `c`. After the table is filled, the chosen experiments are recovered by backtracking. This is the best strategy as it finds the best possible subset without the cost of brute-force searching.

---

## How to Run

From the `project3/src` directory:

```
javac *.java
java OptimizationStrategies
```

The program runs every strategy and prints each selected set with its total rating and total weight, followed by a summary comparing the approaches.
