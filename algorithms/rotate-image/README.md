# Rotate Image

## Problem Description

Given an `n x n` 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. **Do not** allocate another 2D matrix to do the rotation.

## Example

**Input:**
```
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
]
```

**Output:**
```
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
```

## Constraints

- `n == matrix.length == matrix[i].length`
- `1 <= n <= 20`
- `-1000 <= matrix[i][j] <= 1000`

## Approach

1. **Transpose** the matrix (swap rows and columns).
2. **Reverse** each row.

This rotates the matrix 90 degrees clockwise in-place.