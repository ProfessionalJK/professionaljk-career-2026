# Number of Islands

## Problem Description

Given a 2D grid map of `'1'`s (land) and `'0'`s (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are surrounded by water.

## Example

**Input:**
```
11110
11010
11000
00000
```

**Output:**  
1

**Input:**
```
11000
11000
00100
00011
```

**Output:**  
3

## Approach

- Traverse the grid.
- When a land cell (`'1'`) is found, perform DFS or BFS to mark all connected land cells as visited.
- Increment the island count for each DFS/BFS traversal.

## Solutions

- **DFS (Depth-First Search)**