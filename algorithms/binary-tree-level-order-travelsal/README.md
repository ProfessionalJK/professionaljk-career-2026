# Binary Tree Level Order Traversal

## Problem Description

Given a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

## Example

**Input:**
```
    3
   / \
  9  20
    /  \
   15   7
```
**Output:**
```
[
  [3],
  [9,20],
  [15,7]
]
```
## Input

- The root node of a binary tree.

## Output

- A list of lists, where each inner list contains the values of nodes at each level of the tree.

## Approach

- Use a queue to traverse the tree level by level (Breadth-First Search).
- For each level, collect the node values and add them to the result.

## Supported Languages

- JavaScript
- Python
- Java

## Usage

Implement the function in your preferred language and run with the provided test cases.