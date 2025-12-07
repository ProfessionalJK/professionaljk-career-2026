## Merge Two Sorted Lists

## Problem Description

Given two sorted linked lists, merge them into a single sorted linked list. The merged list should be made by splicing together the nodes of the two lists.

## Example

**Input:**
- List 1: 1 → 2 → 4
- List 2: 1 → 3 → 4

**Output:**
- Merged List: 1 → 1 → 2 → 3 → 4 → 4

## Constraints

- The number of nodes in both lists is in the range [0, 50].
- -100 ≤ Node.val ≤ 100
- Both lists are sorted in non-decreasing order.

## Approach

1. **Iterative Solution:**  
   Use two pointers to traverse both lists, comparing nodes and attaching the smaller node to the merged list.

2. **Recursive Solution:**  
   Recursively merge the lists by choosing the smaller head node and merging the rest.

## Usage

Implement the solution in your preferred language (Java, Python, JavaScript, etc.) and test with sample inputs.