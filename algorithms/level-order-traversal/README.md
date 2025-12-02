# Level Order Traversal

## Problem Statement

Given a binary tree, perform a level-order traversal (also known as breadth-first traversal) and return the values of nodes at each level as a list of lists.

## Solution Approach

Level-order traversal visits nodes level by level from left to right. This is typically implemented using a queue data structure.

### Steps:
1. Start with the root node and add it to the queue.
2. While the queue is not empty:
   - Remove the node from the front of the queue.
   - Add its value to the current level's list.
   - Add its left and right children to the queue (if they exist).
3. Repeat for all levels.

## Example

Given the following binary tree:
```
1
/
2 3 / \
4 5 6
```

Level-order traversal output:
```
[ [1], [2, 3], [4, 5, 6] ]
```

## Usage

- Implemented in Java and Python.
- See respective source files for code and test cases.

## References

- [Breadth-First Search - Wikipedia](https://en.wikipedia.org/wiki/Breadth-first_search)