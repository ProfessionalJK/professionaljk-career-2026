# Rotate Array Algorithm

This module provides implementations of the **Rotate Array** algorithm in both Python and Java.

## Problem Description

Given an array, rotate the elements to the right by `k` steps, where `k` is non-negative. For example, rotating `[1,2,3,4,5,6,7]` by `3` steps results in `[5,6,7,1,2,3,4]`.

## Algorithm Explanation

The rotation can be performed in-place using array reversal:
1. Reverse the entire array.
2. Reverse the first `k` elements.
3. Reverse the remaining elements.

This approach achieves O(n) time and O(1) space complexity.

## References

- [LeetCode 189. Rotate Array](https://leetcode.com/problems/rotate-array/)
- [Array Manipulation Techniques](https://en.wikipedia.org/wiki/Array_data_structure)

---

Supported languages: Python, Java  
Location: `algorithms/rotate-array/`

Here are example input-output pairs for the rotate array algorithm. These illustrate how the array changes after rotation.

**Python / Java**

| Input Array         | k | Output Array           |
|---------------------|---|------------------------|
| `[1, 2, 3, 4, 5, 6, 7]` | 3 | `[5, 6, 7, 1, 2, 3, 4]` |
| `[1, 2]`            | 1 | `[2, 1]`              |
| `[1]`               | 0 | `[1]`                 |
| `[1, 2, 3, 4]`      | 2 | `[3, 4, 1, 2]`        |
| `[1, 2, 3]`         | 4 | `[3, 1, 2]`           |

**Explanation:**
- The input array is rotated to the right by `k` steps.
- The output array shows the result after rotation.