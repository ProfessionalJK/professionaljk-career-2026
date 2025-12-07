# Path Sum

## Problem Description

Given a binary tree and a target sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

## Example

**Input:**
```
    5
   / \
  4   8
 /   / \
11  13  4
/ \       \
7  2       1
```
Target Sum: 22

**Output:**  
True (because 5 -> 4 -> 11 -> 2 equals 22)

## Solution Approach

- Traverse the tree using Depth-First Search (DFS).
- At each node, subtract the node's value from the target sum.
- If a leaf node is reached and the remaining sum equals the node's value, return true.
- Otherwise, continue searching left and right subtrees.

## Usage

- Implement the algorithm in your preferred language (Java, Python, JavaScript).
- Provide the binary tree structure and the target sum as input.
- The function returns a boolean indicating if such a path exists.

## Supported Languages

- Java
- Python
- JavaScript