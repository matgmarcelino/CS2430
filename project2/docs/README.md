# Programming Project 2: Sets and Multisets

**Author:** Matheus Marcelino
**Course:** CS 2430, Section 6 (Summer 2026)

This project implements standard collection operations on two different kind of collections: Sets, and Multisets. Part 1 covers the ordinary sets section utilizing a bit-string and boolean array for representation. Part 2 covers Multisets, or otherwise also known as bags, where the number of occurrences of an element matters. This `projects2` folder is part of of the CS 2430 repository that contains projects 1 through 4.

---

## Language and Version

- **Language:** Java
- **Version:** Java 21

---

## Files

- **`Universe.java`** - The shared collection of 12 colleges. Both set classes read their elements from this, so having a separate class reduces code duplication.
- **`BitStringSet.java`** - Part 1: Ordinary set operations (complement, union, intersection, difference, symmetric difference) implemented over a `boolean[]` and represented as a bit-string where each bit corresponds to a college in the universe.
- **`MultiSet.java`** - Part 2: Multiset (bag) operation (union with max counts, intersection with min counts, difference floored at zero, and sum) implemented using a `HashMap<String, Integer>` mapping each college to its count.
- **`Main.java`** - The driver and primary entry point. It builds hard-coded test sets, runs every Part 1 and 2 operations through multiple cases including edge cases, and prints labeled output.

---
