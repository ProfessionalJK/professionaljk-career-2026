# Max Depth of Binary Tree

## Problem Description

Given a binary tree, find its maximum depth.  
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

## Example

**Input:**
3
   / \
  9  20
    /  \
   15   7

**Output:**  
`3`

## Approach

- **Recursive:**  
  Traverse the tree recursively, returning `1 + max(leftDepth, rightDepth)` for each node.

- **Iterative (BFS):**  
  Use a queue to perform level-order traversal and count the number of levels.

## Usage

Implement the solution in your preferred language (Java, Python, JavaScript, etc.) and run the function with a binary tree input.