# Invert Binary Tree

## Problem Description

Given the root of a binary tree, invert the tree, meaning swap every left child with its right child.

## Example

**Input:**
```
     4
   /   \
  2     7
 / \   / \
1   3 6   9
```
**Output:**
```
     4
   /   \
  7     2
 / \   / \
9   6 3   1
```
## Approach

- Recursively swap the left and right children of each node.
- Can be implemented using DFS (preorder traversal).