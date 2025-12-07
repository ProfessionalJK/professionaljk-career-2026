# Symmetric Tree

## Problem Statement

Given a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

**Example:**
```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```
The above tree is symmetric.
Output: `true`

## Approach

- Recursively compare the left and right subtrees to check for symmetry.
- Alternatively, use an iterative approach with a queue.