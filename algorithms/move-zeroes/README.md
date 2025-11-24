# Move Zeroes

## Problem Description

Given an array, move all zeroes to the end of the array while maintaining the relative order of the non-zero elements.

**Example:**
- Input: `[0, 1, 0, 3, 12]`
- Output: `[1, 3, 12, 0, 0]`

## Approach

- Iterate through the array.
- Move non-zero elements forward.
- Fill the remaining positions with zeroes.

## Complexity

- Time: O(n)
- Space: O(1)

## Usage

Call the function with your array to move all zeroes to the end in-place.
#### Input: [0, 1, 0, 3, 12]
#### Output: [1, 3, 12, 0, 0]

#### Input: [0, 0, 1]
#### Output: [1, 0, 0]

#### Input: [4, 2, 0, 0, 5]
#### Output: [4, 2, 5, 0, 0]

#### Input: [0, 0, 0]
#### Output: [0, 0, 0]

#### Input: [1, 2, 3]
#### Output: [1, 2, 3]