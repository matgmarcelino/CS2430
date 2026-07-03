# CS 2430 — Data Structures and Algorithm Analysis

**Name:** Matheus Marcelino  
**Course:** CS 2430  
**Semester:** Summer 2026  
**Repository:** https://github.com/matgmarcelino/CS2430

## Purpose

This repository contains all coursework for CS 2430. It is organized to keep source code, documentation, design notes, and supporting artifacts together for each programming project, making it easy to track progress and verify submitted work.

## Project 0 Note

Project 0 is a setup and research assignment. It covers programming paradigms, architectural patterns, design patterns, and repository organization. No programming project is submitted for Project 0. Projects 1–4 will be added to their respective folders as the semester progresses.

### Project 1 - Sorting Algorithm Comparison

Implements and compares four classic sorting algorithms in Java: merge sort, quick sort, heap sort, and shaker sort. Each algorithm includes an exact element-to-element comparison counter to verify performance. Correctness is verified accross all n! permutations static arrays size n = 4, 6, and 8. Minimum, maximum, and average comparison counts are reported with a formatted table in `ResultsTable.java`.

### Project 2 - Sets and Multisets

Implements standard collection operations on two kinds of sets in Java. Part 1 covers ordinary sets represented as a bit-string over a `boolean[]` where each bit corresponds to a college in a shared 12-college universe. It supports complement, union, intersection, difference, and symmetric difference. Part 2 covers multisets (otherwise known as bags) implemented with a `HashMap<String, Integer>` that maps every college to its count. It supports union (max counts), intersection (min counts), difference (floored at zero), and sum. A `Main` driver includes many test runs accross multiple edge cases and prints labeled output.

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
│   └── docs/
└── project4/
    └── docs/
```

Each `project#/` folder will hold the source code for that assignment. The `docs/` subfolder inside each project is for supporting materials: design sketches, pseudocode, diagrams, and any written notes produced during development.
