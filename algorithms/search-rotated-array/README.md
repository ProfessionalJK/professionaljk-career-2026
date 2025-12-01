# Search in Rotated Sorted Array

## Problem Statement

Given a sorted array that has been rotated at an unknown pivot, implement an efficient algorithm to search for a target value. The array contains no duplicate elements.

**Example:**
- Input: nums = [4,5,6,7,0,1,2], target = 0  
  Output: 4

- Input: nums = [4,5,6,7,0,1,2], target = 3  
  Output: -1

## Solution Approach

The implemented solution uses a modified binary search to achieve O(log n) time complexity. It determines which half of the array is sorted and narrows the search space accordingly.

## Examples
```
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Input: nums = [1], target = 0
Output: -1
Input: nums = [1], target = 1
Output: 0
Input: nums = [6,7,8,1,2,3,4,5], target = 3
Output: 5
```