# CS 2430 — Data Structures and Algorithm Analysis

**Name:** Matheus Marcelino  
**Course:** CS 2430  
**Semester:** Summer 2026  
**Repository:** https://github.com/matgmarcelino/CS2430

## Purpose

This repository contains all coursework for CS 2430. It is organized to keep source code, documentation, design notes, and supporting artifacts together for each programming project, making it easy to track progress and verify submitted work.

## Project 0 Note

Project 0 is a setup and research assignment. It covers programming paradigms, architectural patterns, design patterns, and repository organization. No programming project is submitted for Project 0. Projects 1–4 are in their respective folders.

### Project 1 - Sorting Algorithm Comparison

Implements and compares four classic sorting algorithms in Java: merge sort, quick sort, heap sort, and shaker sort. Each algorithm includes an exact element-to-element comparison counter to verify performance. Correctness is verified accross all n! permutations static arrays size n = 4, 6, and 8. Minimum, maximum, and average comparison counts are reported with a formatted table in `ResultsTable.java`.

### Project 2 - Sets and Multisets

Implements standard collection operations on two kinds of sets in Java. Part 1 covers ordinary sets represented as a bit-string over a `boolean[]` where each bit corresponds to a college in a shared 12-college universe. It supports complement, union, intersection, difference, and symmetric difference. Part 2 covers multisets (otherwise known as bags) implemented with a `HashMap<String, Integer>` that maps every college to its count. It supports union (max counts), intersection (min counts), difference (floored at zero), and sum. A `Main` driver includes many test runs accross multiple edge cases and prints labeled output.

### Project 3 - Optimal Selection

Explores several strategies for finding an optimal subset within a lsit of experiments that maximizes total rating without exceeding a 700kg weight limit, an instance of the 0/1 knapsack problem. Part 1 implements three greedy strategies (sorting by highest rating first, lightest weight, and best rating-to-weight ratio). Part 2 implements an exhaustive, brute-force approach over all possible subsets, which is optimal but runs in O(2^n) time. Part 4 implements an optimal dynamic-programming solution with a `dp[i][c]` table and backtracks to recover the chosen experiments in O(n \* capacity) time. An `OptimizationStrategies` driver runs every strategy and prints the output from each implementation along with a summary comparing these approaches.

### Project 4 - Monopoly Landing-Frequency Simulation

A Monte Carlo simulation in Java of moving a single player around a standard 40 square Monopoly board, to see how frequently each square is landed on, and if and how different jail-exit strategies change these frequencies. The mechanics of two dice, doubles, Go to Jail, and the two card decks are implemented; money, property, and rent are left out as irrelevant to simply landing on the squares. The `board` package contains the definitions of the board squares and their types, while the `cards` package implements the two card decks and their effects. The `sim` package contains the player state, the two exit-strategy implementations (“immediately exit” versus “try to roll doubles”), and one preseeded run for easy reproducing of results. A `BatchRunner` class is used to perform 10 runs per strategy, with output checkpoints every 1,000 / 10,000 / 100,000 / 1,000,000 turns, resulting in 80 CSV snapshots and a summary.txt file written to `data/`. Since variance in strategies is only shown when it exceeds the variance of the ten runs for a given strategy, it does not dominate the results and skew them.

## Repository Structure

```
CS2430/
├── README.md
├── .gitignore
├── project1/
│   ├── src/SortingAlgorithms/
│   │   ├── sortingAlgorithms.java
│   │   ├── dataGenerator.java
│   │   ├── testDriver.java
│   │   └── ResultsTable.java
│   └── docs/
│       └── README.md
├── project2/
│   ├── src/
│   │   ├── Universe.java
│   │   ├── BitStringSet.java
│   │   ├── MultiSet.java
│   │   └── Main.java
│   └── docs/
│       └── README.md
├── project3/
│   ├──src/
│   │   ├── Experiment.java
│   │   ├── SubsetGenerator.java
│   │   └── OptimizationStrategies.java
│   └── docs/
│       └── README.md
└── project4/
    ├── src/
    │   ├── board/
    │   │   ├── Board.java
    │   │   └── SquareType.java
    │   ├── cards/
    │   │   ├── Card.java
    │   │   ├── CardType.java
    │   │   ├── Deck.java
    │   │   └── DeckType.java
    │   └── sim/
    │       ├── Player.java
    │       ├── Strategy.java
    │       ├── Simulation.java
    │       └── BatchRunner.java
    ├── data/
    └── docs/
        └── README.md
```

Each `project#/` folder will hold the source code for that assignment. The `docs/` subfolder inside each project is for supporting materials: design sketches, pseudocode, diagrams, and any written notes produced during development.
