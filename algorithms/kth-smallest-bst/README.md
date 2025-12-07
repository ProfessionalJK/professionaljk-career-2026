# Kth Smallest Element in a BST

## Problem Statement

Given a binary search tree (BST), find the k-th smallest element in the tree.

## Example

**Input:**
```
    3
/ \
1   4
\
2
k = 1
```
**Output:** 1

## Approach

- Perform an in-order traversal of the BST, which visits nodes in ascending order.
- Keep a count of visited nodes.
- Return the value of the k-th visited node.