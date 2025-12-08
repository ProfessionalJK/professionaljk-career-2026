# Binary Tree Right Side View

## Problem Description

Given a binary tree, imagine yourself standing on the right side of it. Return the values of the nodes you can see ordered from top to bottom.

## Example

**Input:**
```
     1
   /  \
   2   3
    \   \
    5   4
```

**Output:**  
[1, 3, 4]

## Approach

- Use level order traversal (BFS) and collect the last node at each level.
- Alternatively, use DFS prioritizing the right child.

## Supported Languages

- JavaScript (React)
- Java (Spring Boot)
- Python

## Usage

Implement the solution in your preferred language in the corresponding directory.