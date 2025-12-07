# Lowest Common Ancestor (LCA) Algorithm

## Problem Description

Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree. The LCA is defined as the lowest node in the tree that has both nodes as descendants (where a node can be a descendant of itself).

## Solution Approaches

- **Recursive Approach:** Traverse the tree recursively. If either node is found, return it. If both left and right subtrees return non-null, the current node is the LCA.
- **Iterative Approach:** Use parent pointers and a hash set to track ancestors.

## Supported Languages

- JavaScript (Node.js)
- Python
- Java (Spring Boot)

## Example

Given the following binary tree:

```
      3
     / \
    5   1
/ \ / \
6  2 0  8
/ \
7   4
```

LCA of nodes 5 and 1 is 3.