# Detect Cycle in Linked List

## Problem Statement

Given a linked list, determine if it has a cycle in it.

A cycle occurs when a node's next pointer points to a previous node in the list, forming a loop.

## Example

**Input:**  
`head = [3,2,0,-4]`, where the tail connects to the second node.

**Output:**  
`true`

## Approach

- Use Floyd's Tortoise and Hare algorithm:
  - Initialize two pointers, slow and fast.
  - Move slow by one step and fast by two steps.
  - If they meet, a cycle exists.
  - If fast reaches the end, no cycle exists.

## Solutions

- Python and Java implementations available.

## Complexity

- **Time:** O(n)
- **Space:** O(1)