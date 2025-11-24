# Product of Array Except Self

Given an array of integers, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

**Note:**  
- The solution must be implemented without using division and in O(n) time complexity.  
- Solutions are provided in both Java and Python.

## Problem Statement

Given an integer array `nums`, construct an array `answer` such that `answer[i]` is the product of all the elements of `nums` except `nums[i]`.

## Example

**Example 1:**

```
Input:  nums = [1, 2, 3, 4]
Output: [24, 12, 8, 6]
Explanation:
- For index 0: 2 * 3 * 4 = 24
- For index 1: 1 * 3 * 4 = 12
- For index 2: 1 * 2 * 4 = 8
- For index 3: 1 * 2 * 3 = 6
```

**Example 2:**

```
Input:  nums = [-1, 1, 0, -3, 3]
Output: [0, 0, 9, 0, 0]
```

## Constraints

- 2 <= nums.length <= 10^5  
- -30 <= nums[i] <= 30  
- The product of any prefix or suffix of `nums` is guaranteed to fit in a 32-bit integer.

## Approach

- Compute the product of all elements to the left of each index.  
- Compute the product of all elements to the right of each index.  
- Multiply the left and right products for each index to get the final result.  
- No division is used.

## Languages Supported

- Java  
- Python

## How to Run

Refer to the respective language implementation files for usage instructions and examples.