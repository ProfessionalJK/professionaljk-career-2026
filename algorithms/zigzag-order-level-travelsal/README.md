# Zigzag Order Level Traversal

## Problem Description

Given a binary tree, traverse its nodes in zigzag level order.  
For example, given the following tree:
```
    3
   / \
  9  20
    /  \
   15   7
```
The zigzag level order traversal would be:
```
[
  [3],
  [20, 9],
  [15, 7]
]
```

## Approach

- Use a queue to perform level order traversal (BFS).
- Alternate the direction of traversal at each level:
  - Left to right for even levels.
  - Right to left for odd levels.
- Collect node values for each level in the required order.

## Usage

1. Implement the algorithm in your preferred language (JavaScript, Python, Java).
2. Pass the root node of your binary tree to the function.
3. The function returns a list of lists, each representing a level in zigzag order.

## Supported Languages

- JavaScript
- Python
- Java