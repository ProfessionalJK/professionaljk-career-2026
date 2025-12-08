# Validate Binary Search Tree

## Problem Description

Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:
- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than the node's key.
- Both the left and right subtrees must also be binary search trees.

## Example

**Input:**
```
    2
/ \
1   3
```
**Output:** `true`

**Input:**
```
    5
/ \
1   4
/ \
3   6
```
**Output:** `false`
Explanation: The node with value 4 has a left child with value 3, which is less than 5.

## Approach

- Use recursion to traverse the tree, passing down the valid range for each node.
- At each node, check if its value is within the valid range.
- Recursively validate the left and right subtrees with updated ranges.

## Complexity

- Time: O(n), where n is the number of nodes in the tree.
- Space: O(h), where h is the height of the tree due to recursion stack.